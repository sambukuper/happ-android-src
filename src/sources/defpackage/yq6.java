package defpackage;

import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yq6 {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final cb0 c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f;
    public ha9 g;
    public final l97 a = new l97(0);
    public final Messenger e = new Messenger(new hb9(this, Looper.getMainLooper()));

    public yq6(Context context) {
        this.b = context;
        this.c = new cb0(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new e25("fcm-rpc-timeout-executor"));
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final void a(String str, Bundle bundle) {
        l97 l97Var = this.a;
        synchronized (l97Var) {
            try {
                z18 z18Var = (z18) l97Var.remove(str);
                if (z18Var == null) {
                    new StringBuilder(String.valueOf(str).length() + 21);
                } else {
                    z18Var.a(bundle);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    public final fb9 b(Bundle bundle) {
        String string;
        int iU;
        Context context;
        synchronized (yq6.class) {
            int i2 = h;
            h = i2 + 1;
            string = Integer.toString(i2);
        }
        z18 z18Var = new z18();
        l97 l97Var = this.a;
        synchronized (l97Var) {
            l97Var.put(string, z18Var);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        byte b = 2;
        if (this.c.u() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context2 = this.b;
        synchronized (yq6.class) {
            try {
                PendingIntent broadcast = i;
                if (broadcast == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    broadcast = PendingIntent.getBroadcast(context2, 0, intent2, ab9.a);
                    i = broadcast;
                }
                intent.putExtra("app", broadcast);
            } catch (Throwable th) {
                throw th;
            }
        }
        intent.putExtra("kid", p61.n(new StringBuilder(String.valueOf(string).length() + 5), "|ID|", string, "|"));
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f == null && this.g == null) {
            iU = this.c.u();
            context = this.b;
            if (iU == 2) {
                context.startService(intent);
            } else if (Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(intent);
            } else {
                context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        } else {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.g.X.send(messageObtain);
                }
            } catch (RemoteException unused) {
                iU = this.c.u();
                context = this.b;
                if (iU == 2) {
                    context.startService(intent);
                } else if (Build.VERSION.SDK_INT < 34) {
                    context.sendBroadcast(intent);
                } else {
                    context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                }
            }
        }
        z18Var.a.b(dp1.f0, new zv7(this, string, this.d.schedule(new g99(z18Var, b), 30L, TimeUnit.SECONDS)));
        return z18Var.a;
    }
}
