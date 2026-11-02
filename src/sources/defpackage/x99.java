package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x99 extends f99 {
    public final /* synthetic */ u10 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x99(u10 u10Var, Looper looper) {
        super(looper, (byte) 2);
        this.a = u10Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        m99 m99Var;
        u10 u10Var = this.a;
        int i = u10Var.w.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (m99Var = (m99) message.obj) != null) {
                synchronized (m99Var) {
                    m99Var.a = null;
                }
                u10 u10Var2 = m99Var.c;
                synchronized (u10Var2.k) {
                    u10Var2.k.remove(m99Var);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !u10Var.m()) {
            m99 m99Var2 = (m99) message.obj;
            if (m99Var2 != null) {
                synchronized (m99Var2) {
                    m99Var2.a = null;
                }
                u10 u10Var3 = m99Var2.c;
                synchronized (u10Var3.k) {
                    u10Var3.k.remove(m99Var2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            u10Var.t = new x11(message.arg2, null, null);
            if (!u10Var.u && !TextUtils.isEmpty(u10Var.i()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(u10Var.i());
                    if (!u10Var.u) {
                        u10Var.p(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            x11 x11Var = u10Var.t;
            if (x11Var == null) {
                x11Var = new x11(8, null, null);
            }
            u10Var.i.A(x11Var);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            x11 x11Var2 = u10Var.t;
            if (x11Var2 == null) {
                x11Var2 = new x11(8, null, null);
            }
            u10Var.i.A(x11Var2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            u10Var.i.A(new x11(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            u10Var.p(5, null);
            rb8 rb8Var = u10Var.n;
            if (rb8Var != null) {
                ((ps2) rb8Var.Y).f(message.arg2);
            }
            System.currentTimeMillis();
            u10Var.o(5, 1, null);
            return;
        }
        if (i4 == 2 && !u10Var.l()) {
            m99 m99Var3 = (m99) message.obj;
            if (m99Var3 != null) {
                synchronized (m99Var3) {
                    m99Var3.a = null;
                }
                u10 u10Var4 = m99Var3.c;
                synchronized (u10Var4.k) {
                    u10Var4.k.remove(m99Var3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i5);
            Log.wtf("GmsClient", sb.toString(), new Exception());
            return;
        }
        m99 m99Var4 = (m99) message.obj;
        synchronized (m99Var4) {
            try {
                bool = m99Var4.a;
                if (m99Var4.b) {
                    new StringBuilder(m99Var4.toString().length() + 47);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            u10 u10Var5 = m99Var4.f;
            int i6 = m99Var4.d;
            if (i6 != 0) {
                u10Var5.p(1, null);
                Bundle bundle = m99Var4.e;
                m99Var4.b(new x11(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!m99Var4.a()) {
                u10Var5.p(1, null);
                m99Var4.b(new x11(8, null, null));
            }
        }
        synchronized (m99Var4) {
            m99Var4.b = true;
        }
        synchronized (m99Var4) {
            m99Var4.a = null;
        }
        u10 u10Var6 = m99Var4.c;
        synchronized (u10Var6.k) {
            u10Var6.k.remove(m99Var4);
        }
    }
}
