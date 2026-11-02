package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l95 implements Cloneable {
    public static final List v0 = ks8.j(p06.HTTP_2, p06.HTTP_1_1);
    public static final List w0 = ks8.j(a21.e, a21.f);
    public final z47 X;
    public final wl6 Y;
    public final List Z;
    public final List f0;
    public final d61 g0;
    public final oq1 h0;
    public final Proxy i0;
    public final ProxySelector j0;
    public final SocketFactory k0;
    public final SSLSocketFactory l0;
    public final List m0;
    public final List n0;
    public final HostnameVerifier o0;
    public final to0 p0;
    public final int q0;
    public final int r0;
    public final int s0;
    public final int t0;
    public final jf6 u0;

    public l95(k95 k95Var) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        SSLSocketFactory sSLSocketFactoryL;
        X509TrustManager x509TrustManagerM;
        g33 g33VarB;
        this.X = k95Var.a;
        this.Y = k95Var.b;
        this.Z = ks8.u(k95Var.c);
        this.f0 = ks8.u(k95Var.d);
        this.g0 = k95Var.f;
        this.h0 = k95Var.g;
        Proxy proxy = k95Var.h;
        this.i0 = proxy;
        if (proxy != null || (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = z65.a;
        }
        this.j0 = proxySelector;
        this.k0 = k95Var.i;
        List list = k95Var.l;
        this.m0 = list;
        this.n0 = k95Var.m;
        this.o0 = k95Var.n;
        this.q0 = k95Var.q;
        this.r0 = k95Var.r;
        this.s0 = k95Var.s;
        this.t0 = k95Var.t;
        this.u0 = new jf6();
        if (list != null && list.isEmpty()) {
            this.l0 = null;
            this.p0 = to0.c;
            sSLSocketFactoryL = null;
            g33VarB = null;
            x509TrustManagerM = null;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.l0 = null;
                this.p0 = to0.c;
                sSLSocketFactoryL = null;
                g33VarB = null;
                x509TrustManagerM = null;
                break;
            }
            if (((a21) it.next()).a) {
                sSLSocketFactoryL = k95Var.j;
                if (sSLSocketFactoryL == null) {
                    lo5 lo5Var = lo5.a;
                    x509TrustManagerM = lo5.a.m();
                    sSLSocketFactoryL = lo5.a.l(x509TrustManagerM);
                    this.l0 = sSLSocketFactoryL;
                    g33VarB = lo5.a.b(x509TrustManagerM);
                    to0 to0Var = k95Var.o;
                    to0Var.getClass();
                    this.p0 = dh3.f(to0Var.b, g33VarB) ? to0Var : new to0(to0Var.a, g33VarB);
                    break;
                }
                this.l0 = sSLSocketFactoryL;
                g33VarB = k95Var.p;
                g33VarB.getClass();
                x509TrustManagerM = k95Var.k;
                x509TrustManagerM.getClass();
                to0 to0Var2 = k95Var.o;
                to0Var2.getClass();
                this.p0 = dh3.f(to0Var2.b, g33VarB) ? to0Var2 : new to0(to0Var2.a, g33VarB);
                break;
            }
        }
        List list2 = this.f0;
        List list3 = this.Z;
        list3.getClass();
        if (list3.contains(null)) {
            xw3.s(list3, "Null interceptor: ");
            throw null;
        }
        list2.getClass();
        if (list2.contains(null)) {
            xw3.s(list2, "Null network interceptor: ");
            throw null;
        }
        List list4 = this.m0;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((a21) it2.next()).a) {
                    if (sSLSocketFactoryL == null) {
                        bt.i("sslSocketFactory == null");
                        throw null;
                    }
                    if (g33VarB == null) {
                        bt.i("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManagerM != null) {
                        return;
                    }
                    bt.i("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactoryL != null) {
            bt.i("Check failed.");
            throw null;
        }
        if (g33VarB != null) {
            bt.i("Check failed.");
            throw null;
        }
        if (x509TrustManagerM != null) {
            bt.i("Check failed.");
            throw null;
        }
        if (dh3.f(this.p0, to0.c)) {
            return;
        }
        bt.i("Check failed.");
        throw null;
    }

    public final Object clone() {
        return super.clone();
    }
}
