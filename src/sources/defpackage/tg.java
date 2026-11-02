package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class tg implements zd7 {
    public static final ra f = new ra(2, false);
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;

    public tg(Class cls) throws NoSuchMethodException {
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.b = declaredMethod;
        this.c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.zd7
    public final void a(SSLSocket sSLSocket, String str, List list) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.c.invoke(sSLSocket, str);
                }
                Method method = this.e;
                lo5 lo5Var = lo5.a;
                method.invoke(sSLSocket, g55.p(list));
            } catch (IllegalAccessException e) {
                bt.g(e);
            } catch (InvocationTargetException e2) {
                bt.g(e2);
            }
        }
    }

    @Override // defpackage.zd7
    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, iq0.a);
                }
            } catch (IllegalAccessException e) {
                bt.g(e);
                return null;
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !dh3.f(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    bt.g(e2);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // defpackage.zd7
    public final boolean isSupported() {
        boolean z = pf.e;
        return pf.e;
    }

    @Override // defpackage.zd7
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }
}
