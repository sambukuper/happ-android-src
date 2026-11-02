package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pf extends lo5 {
    public static final boolean e;
    public final ArrayList c;
    public final ru0 d;

    static {
        boolean z = false;
        if (g55.u() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public pf() throws NoSuchMethodException {
        pg7 pg7Var;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            pg7Var = new pg7(cls);
        } catch (Exception e2) {
            lo5.a.getClass();
            lo5.i("unable to load android socket classes", 5, e2);
            pg7Var = null;
        }
        ArrayList arrayListQ0 = eu.q0(new zd7[]{pg7Var, new dh1(tg.f), new dh1(p21.a), new dh1(x70.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListQ0) {
            if (((zd7) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new ru0(method3, method2, method);
    }

    @Override // defpackage.lo5
    public final g33 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        ib ibVar = x509TrustManagerExtensions != null ? new ib(x509TrustManager, x509TrustManagerExtensions) : null;
        return ibVar != null ? ibVar : new a30(c(x509TrustManager));
    }

    @Override // defpackage.lo5
    public final zf8 c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new of(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // defpackage.lo5
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((zd7) next).matchesSocket(sSLSocket));
        zd7 zd7Var = (zd7) next;
        if (zd7Var != null) {
            zd7Var.a(sSLSocket, str, list);
        }
    }

    @Override // defpackage.lo5
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // defpackage.lo5
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((zd7) next).matchesSocket(sSLSocket));
        zd7 zd7Var = (zd7) next;
        if (zd7Var != null) {
            return zd7Var.getSelectedProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.lo5
    public final Object g() {
        ru0 ru0Var = this.d;
        ru0Var.getClass();
        Method method = ru0Var.a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = ru0Var.b;
                method2.getClass();
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // defpackage.lo5
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.lo5
    public final void j(String str, Object obj) {
        ru0 ru0Var = this.d;
        ru0Var.getClass();
        if (obj != null) {
            try {
                Method method = ru0Var.c;
                method.getClass();
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        lo5.i(str, 5, null);
    }
}
