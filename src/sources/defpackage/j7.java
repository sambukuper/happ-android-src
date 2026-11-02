package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j7 {
    public final oq1 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final to0 e;
    public final Proxy f;
    public final ProxySelector g;
    public final u23 h;
    public final List i;
    public final List j;

    public j7(String str, int i, oq1 oq1Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, to0 to0Var, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = oq1Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = to0Var;
        this.f = proxy;
        this.g = proxySelector;
        t23 t23Var = new t23((byte) 0);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            t23Var.c = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                bt.q("unexpected scheme: ".concat(str2));
                throw null;
            }
            t23Var.c = "https";
        }
        String strU = nr4.U(k32.k(str, 0, 0, 7));
        if (strU == null) {
            bt.q("unexpected host: ".concat(str));
            throw null;
        }
        t23Var.f = strU;
        if (1 > i || i >= 65536) {
            em7.c(pc6.j(i, "unexpected port: "));
            throw null;
        }
        t23Var.b = i;
        this.h = t23Var.b();
        this.i = ks8.u(list);
        this.j = ks8.u(list2);
    }

    public final boolean a(j7 j7Var) {
        if (!this.a.equals(j7Var.a)) {
            return false;
        }
        oy1 oy1Var = oy1.g0;
        return this.i.equals(j7Var.i) && this.j.equals(j7Var.j) && dh3.f(this.g, j7Var.g) && dh3.f(this.f, j7Var.f) && dh3.f(this.c, j7Var.c) && dh3.f(this.d, j7Var.d) && dh3.f(this.e, j7Var.e) && this.h.e == j7Var.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return this.h.equals(j7Var.h) && a(j7Var);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((Objects.hashCode(this.f) + ((this.g.hashCode() + p61.f(p61.f((oy1.g0.hashCode() + ((this.a.hashCode() + pc6.e(527, 31, this.h.h)) * 31)) * 31, 31, this.i), 31, this.j)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        u23 u23Var = this.h;
        sb.append(u23Var.d);
        sb.append(':');
        sb.append(u23Var.e);
        sb.append(", ");
        Proxy proxy = this.f;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.g;
        }
        return oi0.o(sb, str, '}');
    }
}
