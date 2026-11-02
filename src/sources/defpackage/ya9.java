package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ya9 {
    public static final Object g = new Object();
    public static ya9 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile f99 c;
    public final d21 d;
    public final short e;
    public final int f;

    public ya9(Context context, Looper looper) {
        qc7 qc7Var = new qc7(this, (byte) 2);
        this.b = context.getApplicationContext();
        f99 f99Var = new f99(looper, qc7Var);
        Looper.getMainLooper();
        this.c = f99Var;
        this.d = d21.a();
        this.e = (short) 5000;
        this.f = 300000;
    }

    public final x11 a(ua9 ua9Var, ia9 ia9Var, String str) {
        x11 x11VarA;
        HashMap map = this.a;
        synchronized (map) {
            try {
                wa9 wa9Var = (wa9) map.get(ua9Var);
                if (wa9Var == null) {
                    wa9Var = new wa9(this, ua9Var);
                    wa9Var.a.put(ia9Var, ia9Var);
                    x11VarA = wa9Var.a(str, null);
                    map.put(ua9Var, wa9Var);
                } else {
                    this.c.removeMessages(0, ua9Var);
                    if (wa9Var.a.containsKey(ia9Var)) {
                        String string = ua9Var.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    wa9Var.a.put(ia9Var, ia9Var);
                    byte b = wa9Var.b;
                    if (b == 1) {
                        ia9Var.onServiceConnected(wa9Var.f, wa9Var.d);
                    } else if (b == 2) {
                        x11VarA = wa9Var.a(str, null);
                    }
                    x11VarA = null;
                }
                if (wa9Var.c) {
                    return x11.h0;
                }
                if (x11VarA == null) {
                    x11VarA = new x11(-1, null, null);
                }
                return x11VarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, ServiceConnection serviceConnection, boolean z) {
        ua9 ua9Var = new ua9(str, z);
        w45.t(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.a;
        synchronized (map) {
            try {
                wa9 wa9Var = (wa9) map.get(ua9Var);
                if (wa9Var == null) {
                    String string = ua9Var.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!wa9Var.a.containsKey(serviceConnection)) {
                    String string2 = ua9Var.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                wa9Var.a.remove(serviceConnection);
                if (wa9Var.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, ua9Var), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
