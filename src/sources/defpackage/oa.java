package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oa extends lo5 {
    public static final boolean d;
    public final ArrayList c;

    static {
        d = g55.u() && Build.VERSION.SDK_INT >= 29;
    }

    public oa() {
        ArrayList arrayListQ0 = eu.q0(new zd7[]{(!g55.u() || Build.VERSION.SDK_INT < 29) ? null : new pa(), new dh1(tg.f), new dh1(p21.a), new dh1(x70.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListQ0) {
            if (((zd7) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
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
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
