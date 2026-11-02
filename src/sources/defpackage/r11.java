package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r11 implements zf3 {
    public static final r11 b = new r11((byte) 0);
    public final /* synthetic */ byte a;

    public r11(l95 l95Var) {
        this.a = (byte) 4;
    }

    public static int d(zf6 zf6Var, int i) {
        String strG = zf6.g(zf6Var, "Retry-After");
        if (strG == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        patternCompile.getClass();
        if (!patternCompile.matcher(strG).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strG);
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    @Override // defpackage.zf3
    public final zf6 a(y76 y76Var) throws IOException {
        nz2 nz2Var;
        IOException iOException;
        zf6 zf6VarB;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        to0 to0Var;
        switch (this.a) {
            case 0:
                m76 m76Var = y76Var.a;
                synchronized (m76Var) {
                    try {
                        if (!m76Var.n0) {
                            throw new IllegalStateException("released");
                        }
                        if (m76Var.m0) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (m76Var.l0) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                p42 p42Var = m76Var.i0;
                p42Var.getClass();
                try {
                    o42 o42VarJ = p42Var.a(y76Var.f, y76Var.g, y76Var.h, !dh3.f((String) y76Var.e.Z, "GET")).j(m76Var.X, y76Var);
                    p42Var.getClass();
                    wg wgVar = new wg();
                    wgVar.b = m76Var;
                    wgVar.c = p42Var;
                    wgVar.d = o42VarJ;
                    wgVar.e = o42VarJ.c();
                    m76Var.k0 = wgVar;
                    m76Var.p0 = wgVar;
                    synchronized (m76Var) {
                        m76Var.l0 = true;
                        m76Var.m0 = true;
                    }
                    if (!m76Var.o0) {
                        return y76.a(y76Var, 0, wgVar, null, 61).b(y76Var.e);
                    }
                    u52.s("Canceled");
                    return null;
                } catch (IOException e) {
                    p42Var.b(e);
                    throw new nm6(e);
                } catch (nm6 e2) {
                    p42Var.b(e2.Y);
                    throw e2;
                }
            case 1:
                System.currentTimeMillis();
                y5 y5Var = y76Var.e;
                byte b2 = 24;
                dq dqVar = new dq(y5Var, (Object) null, b2);
                hc0 hc0VarT = (hc0) y5Var.h0;
                if (hc0VarT == null) {
                    int i = hc0.n;
                    hc0VarT = jm4.T((nz2) y5Var.g0);
                    y5Var.h0 = hc0VarT;
                }
                if (hc0VarT.j) {
                    Object obj = null;
                    dqVar = new dq(obj, obj, b2);
                }
                y5 y5Var2 = (y5) dqVar.Y;
                zf6 zf6Var = (zf6) dqVar.Z;
                if (y5Var2 == null && zf6Var == null) {
                    return new zf6(y5Var, p06.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new nz2((String[]) new ArrayList(20).toArray(new String[0])), ks8.c, null, null, null, -1L, System.currentTimeMillis(), null);
                }
                if (y5Var2 == null) {
                    zf6Var.getClass();
                    yf6 yf6VarK = zf6Var.k();
                    zf6 zf6VarN0 = km4.n0(zf6Var);
                    yf6.b(zf6VarN0, "cacheResponse");
                    yf6VarK.i = zf6VarN0;
                    return yf6VarK.a();
                }
                zf6 zf6VarB2 = y76Var.b(y5Var2);
                if (zf6Var != null) {
                    if (zf6VarB2.f0 == 304) {
                        yf6 yf6VarK2 = zf6Var.k();
                        nz2 nz2Var2 = zf6Var.h0;
                        nz2 nz2Var3 = zf6VarB2.h0;
                        ArrayList arrayList = new ArrayList(20);
                        int size = nz2Var2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            String strB = nz2Var2.b(i2);
                            String strE = nz2Var2.e(i2);
                            if ("Warning".equalsIgnoreCase(strB)) {
                                nz2Var = nz2Var2;
                                if (mm7.Z(strE, false, "1")) {
                                }
                                i2++;
                                nz2Var2 = nz2Var;
                            } else {
                                nz2Var = nz2Var2;
                            }
                            if ("Content-Length".equalsIgnoreCase(strB) || "Content-Encoding".equalsIgnoreCase(strB) || "Content-Type".equalsIgnoreCase(strB) || !km4.P(strB) || nz2Var3.a(strB) == null) {
                                strB.getClass();
                                strE.getClass();
                                arrayList.add(strB);
                                arrayList.add(fm7.R0(strE).toString());
                            }
                            i2++;
                            nz2Var2 = nz2Var;
                        }
                        int size2 = nz2Var3.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            String strB2 = nz2Var3.b(i3);
                            if (!"Content-Length".equalsIgnoreCase(strB2) && !"Content-Encoding".equalsIgnoreCase(strB2) && !"Content-Type".equalsIgnoreCase(strB2) && km4.P(strB2)) {
                                String strE2 = nz2Var3.e(i3);
                                strB2.getClass();
                                strE2.getClass();
                                arrayList.add(strB2);
                                arrayList.add(fm7.R0(strE2).toString());
                            }
                        }
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        ps psVar = new ps((byte) 1);
                        bw0.e0(psVar.b, strArr);
                        yf6VarK2.f = psVar;
                        yf6VarK2.k = zf6VarB2.m0;
                        yf6VarK2.l = zf6VarB2.n0;
                        zf6 zf6VarN1 = km4.n0(zf6Var);
                        yf6.b(zf6VarN1, "cacheResponse");
                        yf6VarK2.i = zf6VarN1;
                        zf6 zf6VarN2 = km4.n0(zf6VarB2);
                        yf6.b(zf6VarN2, "networkResponse");
                        yf6VarK2.h = zf6VarN2;
                        yf6VarK2.a();
                        b86 b86Var = zf6VarB2.i0;
                        b86Var.getClass();
                        b86Var.close();
                        throw null;
                    }
                    b86 b86Var2 = zf6Var.i0;
                    if (b86Var2 != null) {
                        ks8.c(b86Var2);
                    }
                }
                yf6 yf6VarK3 = zf6VarB2.k();
                zf6 zf6VarN3 = km4.n0(zf6Var);
                yf6.b(zf6VarN3, "cacheResponse");
                yf6VarK3.i = zf6VarN3;
                zf6 zf6VarN4 = km4.n0(zf6VarB2);
                yf6.b(zf6VarN4, "networkResponse");
                yf6VarK3.h = zf6VarN4;
                return yf6VarK3.a();
            case 2:
                wg wgVar2 = y76Var.d;
                wgVar2.getClass();
                m76 m76Var2 = (m76) wgVar2.b;
                o42 o42Var = (o42) wgVar2.d;
                p76 p76Var = (p76) wgVar2.e;
                y5 y5Var3 = y76Var.e;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        o42Var.d(y5Var3);
                        u15.I((String) y5Var3.Z);
                        m76Var2.e(wgVar2, true, false, null);
                        try {
                            o42Var.finishRequest();
                            iOException = null;
                        } catch (IOException e3) {
                            wgVar2.A(e3);
                            throw e3;
                        }
                    } catch (IOException e4) {
                        wgVar2.A(e4);
                        throw e4;
                    }
                } catch (IOException e5) {
                    if ((e5 instanceof y11) || !wgVar2.a) {
                        throw e5;
                    }
                    iOException = e5;
                }
                try {
                    yf6 yf6VarW = wgVar2.w(false);
                    yf6VarW.getClass();
                    yf6VarW.a = y5Var3;
                    yf6VarW.e = p76Var.e;
                    yf6VarW.k = jCurrentTimeMillis;
                    yf6VarW.l = System.currentTimeMillis();
                    zf6 zf6VarA = yf6VarW.a();
                    int i4 = zf6VarA.f0;
                    if (i4 == 100 || (102 <= i4 && i4 < 200)) {
                        yf6 yf6VarW2 = wgVar2.w(false);
                        yf6VarW2.getClass();
                        yf6VarW2.a = y5Var3;
                        yf6VarW2.e = p76Var.e;
                        yf6VarW2.k = jCurrentTimeMillis;
                        yf6VarW2.l = System.currentTimeMillis();
                        zf6VarA = yf6VarW2.a();
                        i4 = zf6VarA.f0;
                    }
                    yf6 yf6VarK4 = zf6VarA.k();
                    try {
                        zf6.g(zf6VarA, "Content-Type");
                        long jB = o42Var.b(zf6VarA);
                        yf6VarK4.g = new b86(jB, new j76(new n42(wgVar2, o42Var.a(zf6VarA), jB)), (byte) 0);
                        zf6 zf6VarA2 = yf6VarK4.a();
                        y5 y5Var4 = zf6VarA2.X;
                        y5Var4.getClass();
                        if ("close".equalsIgnoreCase(((nz2) y5Var4.g0).a("Connection")) || "close".equalsIgnoreCase(zf6.g(zf6VarA2, "Connection"))) {
                            o42Var.c().k();
                        }
                        if (i4 == 204 || i4 == 205) {
                            b86 b86Var3 = zf6VarA2.i0;
                            if ((b86Var3 != null ? b86Var3.g() : -1L) > 0) {
                                StringBuilder sb = new StringBuilder("HTTP ");
                                sb.append(i4);
                                sb.append(" had non-zero Content-Length: ");
                                b86 b86Var4 = zf6VarA2.i0;
                                sb.append(b86Var4 != null ? Long.valueOf(b86Var4.g()) : null);
                                throw new ProtocolException(sb.toString());
                            }
                        }
                        return zf6VarA2;
                    } catch (IOException e6) {
                        wgVar2.A(e6);
                        throw e6;
                    }
                } catch (IOException e7) {
                    if (iOException == null) {
                        throw e7;
                    }
                    gv3.g(iOException, e7);
                    throw iOException;
                }
            case 3:
                y5 y5Var5 = y76Var.e;
                zf6 zf6VarB3 = y76Var.b(y5Var5);
                String strG = zf6.g(zf6VarB3, "location");
                if (strG != null && mm7.Z(strG, false, "happ://")) {
                    kw2 kw2Var = kw2.a;
                    strG = kw2.j(strG);
                }
                if (strG == null) {
                    return zf6VarB3;
                }
                z47 z47VarV = y5Var5.V();
                if (mm7.Z(strG, true, "ws:")) {
                    strG = "http:".concat(strG.substring(3));
                } else if (mm7.Z(strG, true, "wss:")) {
                    strG = "https:".concat(strG.substring(4));
                }
                t23 t23Var = new t23((byte) 0);
                t23Var.f(null, strG);
                z47VarV.Z = t23Var.b();
                return y76Var.b(z47VarV.o());
            default:
                y5 y5Var6 = y76Var.e;
                m76 m76Var3 = y76Var.a;
                List listI0 = d02.X;
                zf6 zf6Var2 = null;
                int i5 = 0;
                y5 y5VarB = y5Var6;
                while (true) {
                    boolean z = true;
                    while (true) {
                        if (m76Var3.k0 == null) {
                            synchronized (m76Var3) {
                                try {
                                    if (m76Var3.m0) {
                                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                    }
                                    if (m76Var3.l0) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (z) {
                                ry1 ry1Var = m76Var3.Z;
                                u23 u23Var = (u23) y5VarB.Y;
                                l95 l95Var = m76Var3.X;
                                if (u23Var.i) {
                                    SSLSocketFactory sSLSocketFactory2 = l95Var.l0;
                                    if (sSLSocketFactory2 != null) {
                                        HostnameVerifier hostnameVerifier2 = l95Var.o0;
                                        to0Var = l95Var.p0;
                                        hostnameVerifier = hostnameVerifier2;
                                        sSLSocketFactory = sSLSocketFactory2;
                                    } else {
                                        bt.i("CLEARTEXT-only client");
                                    }
                                } else {
                                    sSLSocketFactory = null;
                                    hostnameVerifier = null;
                                    to0Var = null;
                                }
                                m76Var3.i0 = new p42(ry1Var, new j7(u23Var.d, u23Var.e, l95Var.h0, l95Var.k0, sSLSocketFactory, hostnameVerifier, to0Var, l95Var.i0, l95Var.n0, l95Var.m0, l95Var.j0), m76Var3);
                            }
                            try {
                                if (m76Var3.o0) {
                                    throw new IOException("Canceled");
                                }
                                try {
                                    try {
                                        zf6VarB = y76Var.b(y5VarB);
                                    } catch (nm6 e8) {
                                        boolean zC = c(e8.Y, m76Var3, y5VarB, false);
                                        IOException iOException2 = e8.X;
                                        if (!zC) {
                                            Iterator it = listI0.iterator();
                                            while (it.hasNext()) {
                                                gv3.g(iOException2, (Exception) it.next());
                                            }
                                            throw iOException2;
                                        }
                                        listI0 = wv0.I0(listI0, iOException2);
                                        m76Var3.c(true);
                                        z = false;
                                    }
                                } catch (IOException e9) {
                                    if (!c(e9, m76Var3, y5VarB, !(e9 instanceof y11))) {
                                        Iterator it2 = listI0.iterator();
                                        while (it2.hasNext()) {
                                            gv3.g(e9, (Exception) it2.next());
                                        }
                                        throw e9;
                                    }
                                    listI0 = wv0.I0(listI0, e9);
                                    m76Var3.c(true);
                                    z = false;
                                }
                            } catch (Throwable th3) {
                                m76Var3.c(true);
                                throw th3;
                            }
                        } else {
                            bt.i("Check failed.");
                        }
                        z = false;
                        break;
                    }
                    if (zf6Var2 != null) {
                        yf6 yf6VarK5 = zf6VarB.k();
                        yf6 yf6VarK6 = zf6Var2.k();
                        yf6VarK6.g = null;
                        zf6 zf6VarA3 = yf6VarK6.a();
                        if (zf6VarA3.i0 != null) {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                        yf6VarK5.j = zf6VarA3;
                        zf6VarB = yf6VarK5.a();
                    }
                    zf6Var2 = zf6VarB;
                    y5VarB = b(zf6Var2, m76Var3.k0);
                    if (y5VarB == null) {
                        m76Var3.c(false);
                        return zf6Var2;
                    }
                    b86 b86Var5 = zf6Var2.i0;
                    if (b86Var5 != null) {
                        ks8.c(b86Var5);
                    }
                    i5++;
                    if (i5 > 20) {
                        throw new ProtocolException("Too many follow-up requests: " + i5);
                    }
                    m76Var3.c(true);
                }
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:90:0x012a  */
    public y5 b(zf6 zf6Var, wg wgVar) throws ProtocolException {
        String strG;
        y5 y5Var;
        t23 t23Var;
        u23 u23VarB;
        z47 z47VarV;
        boolean z;
        p76 p76Var;
        mm6 mm6Var = (wgVar == null || (p76Var = (p76) wgVar.e) == null) ? null : p76Var.b;
        int i = zf6Var.f0;
        String str = (String) zf6Var.X.Z;
        if (i == 307 || i == 308) {
            strG = zf6.g(zf6Var, "Location");
            y5Var = zf6Var.X;
            if (strG != null) {
                u23 u23Var = (u23) y5Var.Y;
                u23Var.getClass();
                try {
                    t23Var = new t23((byte) 0);
                    t23Var.f(u23Var, strG);
                } catch (IllegalArgumentException unused) {
                    t23Var = null;
                }
                if (t23Var != null) {
                    u23VarB = t23Var.b();
                } else {
                    u23VarB = null;
                }
                if (u23VarB != null) {
                    dh3.f(u23VarB.a, ((u23) y5Var.Y).a);
                    z47VarV = y5Var.V();
                    if (u15.I(str)) {
                        int i2 = zf6Var.f0;
                        z = !str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                        if (!str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            z47VarV.P(str, null);
                        } else {
                            z47VarV.P("GET", null);
                        }
                        if (!z) {
                            ((ps) z47VarV.f0).e("Transfer-Encoding");
                            ((ps) z47VarV.f0).e("Content-Length");
                            ((ps) z47VarV.f0).e("Content-Type");
                        }
                    }
                    if (!ks8.a((u23) y5Var.Y, u23VarB)) {
                        ((ps) z47VarV.f0).e("Authorization");
                    }
                    z47VarV.Z = u23VarB;
                    return z47VarV.o();
                }
            }
        } else {
            if (i == 401) {
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    zf6 zf6Var2 = zf6Var.l0;
                    if ((zf6Var2 == null || zf6Var2.f0 != 503) && d(zf6Var, Integer.MAX_VALUE) == 0) {
                        return zf6Var.X;
                    }
                } else {
                    if (i == 407) {
                        mm6Var.getClass();
                        if (mm6Var.b.type() == Proxy.Type.HTTP) {
                            return null;
                        }
                        xw3.k("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                strG = zf6.g(zf6Var, "Location");
                                y5Var = zf6Var.X;
                                if (strG != null) {
                                    u23 u23Var2 = (u23) y5Var.Y;
                                    u23Var2.getClass();
                                    t23Var = new t23((byte) 0);
                                    t23Var.f(u23Var2, strG);
                                    if (t23Var != null) {
                                        u23VarB = t23Var.b();
                                    } else {
                                        u23VarB = null;
                                    }
                                    if (u23VarB != null) {
                                        dh3.f(u23VarB.a, ((u23) y5Var.Y).a);
                                        z47VarV = y5Var.V();
                                        if (u15.I(str)) {
                                            int i3 = zf6Var.f0;
                                            if (str.equals("PROPFIND")) {
                                            }
                                            if (str.equals("PROPFIND")) {
                                                z47VarV.P(str, null);
                                            } else {
                                                z47VarV.P(str, null);
                                            }
                                            if (!z) {
                                                ((ps) z47VarV.f0).e("Transfer-Encoding");
                                                ((ps) z47VarV.f0).e("Content-Length");
                                                ((ps) z47VarV.f0).e("Content-Type");
                                            }
                                        }
                                        if (!ks8.a((u23) y5Var.Y, u23VarB)) {
                                            ((ps) z47VarV.f0).e("Authorization");
                                        }
                                        z47VarV.Z = u23VarB;
                                        return z47VarV.o();
                                    }
                                }
                            default:
                                return null;
                        }
                    } else {
                        zf6 zf6Var3 = zf6Var.l0;
                        if ((zf6Var3 == null || zf6Var3.f0 != 408) && d(zf6Var, 0) <= 0) {
                            return zf6Var.X;
                        }
                    }
                }
            } else if (wgVar != null && !dh3.f(((p42) wgVar.c).b.h.d, ((p76) wgVar.e).b.a.h.d)) {
                p76 p76Var2 = (p76) wgVar.e;
                synchronized (p76Var2) {
                    p76Var2.k = true;
                }
                return zf6Var.X;
            }
        }
        return null;
    }

    public boolean c(IOException iOException, m76 m76Var, y5 y5Var, boolean z) {
        boolean zX;
        d7 d7Var;
        p76 p76Var;
        if ((!z || !(iOException instanceof FileNotFoundException)) && !(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z)) {
            p42 p42Var = m76Var.i0;
            p42Var.getClass();
            int i = p42Var.f;
            if (i == 0 && p42Var.g == 0 && p42Var.h == 0) {
                zX = false;
            } else if (p42Var.i != null) {
                zX = true;
            } else {
                mm6 mm6Var = null;
                if (i <= 1 && p42Var.g <= 1 && p42Var.h <= 0 && (p76Var = p42Var.c.j0) != null) {
                    synchronized (p76Var) {
                        if (p76Var.l == 0 && ks8.a(p76Var.b.a.h, p42Var.b.h)) {
                            mm6Var = p76Var.b;
                        }
                    }
                }
                if (mm6Var != null) {
                    p42Var.i = mm6Var;
                } else {
                    b8 b8Var = p42Var.d;
                    if ((b8Var == null || !b8Var.h()) && (d7Var = p42Var.e) != null) {
                        zX = d7Var.x();
                    }
                }
                zX = true;
            }
            if (zX) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ r11(byte b2) {
        this.a = b2;
    }
}
