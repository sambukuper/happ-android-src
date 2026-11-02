package defpackage;

import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k95 {
    public final z47 a = new z47((byte) 15);
    public final wl6 b = new wl6((byte) 21);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final em7 e = new em7((byte) 20);
    public d61 f = d61.l;
    public oq1 g = oq1.m;
    public Proxy h;
    public SocketFactory i;
    public SSLSocketFactory j;
    public X509TrustManager k;
    public final List l;
    public final List m;
    public HostnameVerifier n;
    public final to0 o;
    public g33 p;
    public int q;
    public int r;
    public int s;
    public int t;

    public k95() {
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.i = socketFactory;
        this.l = l95.w0;
        this.m = l95.v0;
        this.n = j95.a;
        this.o = to0.c;
        this.r = 10000;
        this.s = 10000;
        this.t = 10000;
    }
}
