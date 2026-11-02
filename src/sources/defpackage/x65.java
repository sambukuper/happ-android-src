package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x65 implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet d = new HashSet();

    public x65(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(w65 w65Var) {
        boolean z;
        ArrayDeque arrayDeque = w65Var.d;
        ComponentName componentName = w65Var.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            arrayDeque.size();
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (w65Var.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.a;
            boolean zBindService = context.bindService(component, this, 33);
            w65Var.b = zBindService;
            if (zBindService) {
                w65Var.e = 0;
            } else {
                Objects.toString(componentName);
                context.unbindService(this);
            }
            z = w65Var.b;
        }
        if (!z || w65Var.c == null) {
            b(w65Var);
            return;
        }
        while (true) {
            u65 u65Var = (u65) arrayDeque.peek();
            if (u65Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    u65Var.toString();
                }
                w65Var.c.notify(u65Var.a, u65Var.b, null, u65Var.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException unused2) {
                Objects.toString(componentName);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(w65Var);
    }

    public final void b(w65 w65Var) {
        ComponentName componentName = w65Var.a;
        ArrayDeque arrayDeque = w65Var.d;
        Handler handler = this.b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = w65Var.e;
        int i2 = i + 1;
        w65Var.e = i2;
        if (i2 <= 6) {
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << i) * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax);
        } else {
            arrayDeque.size();
            Objects.toString(componentName);
            arrayDeque.clear();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        if (i == 0) {
            u65 u65Var = (u65) message.obj;
            String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
            synchronized (y65.c) {
                if (string != null) {
                    try {
                        if (!string.equals(y65.d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            y65.e = hashSet2;
                            y65.d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = y65.e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            componentName.toString();
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        this.c.put(componentName2, new w65(componentName2));
                    }
                }
                Iterator it = this.c.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        w65 w65Var = (w65) entry.getValue();
                        if (w65Var.b) {
                            this.a.unbindService(this);
                            w65Var.b = false;
                        }
                        w65Var.c = null;
                        it.remove();
                    }
                }
            }
            for (w65 w65Var2 : this.c.values()) {
                w65Var2.d.add(u65Var);
                a(w65Var2);
            }
        } else if (i == 1) {
            v65 v65Var = (v65) message.obj;
            ComponentName componentName3 = v65Var.a;
            IBinder iBinder = v65Var.b;
            w65 w65Var3 = (w65) this.c.get(componentName3);
            if (w65Var3 != null) {
                w65Var3.c = INotificationSideChannel.Stub.asInterface(iBinder);
                w65Var3.e = 0;
                a(w65Var3);
                return true;
            }
        } else if (i == 2) {
            w65 w65Var4 = (w65) this.c.get((ComponentName) message.obj);
            if (w65Var4 != null) {
                if (w65Var4.b) {
                    this.a.unbindService(this);
                    w65Var4.b = false;
                }
                w65Var4.c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            w65 w65Var5 = (w65) this.c.get((ComponentName) message.obj);
            if (w65Var5 != null) {
                a(w65Var5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(1, new v65(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
