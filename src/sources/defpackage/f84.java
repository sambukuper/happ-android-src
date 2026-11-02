package defpackage;

import android.content.Context;
import java.net.CookieManager;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.DeviceModel;
import su.happ.proxyutility.dto.HWID;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.dto.VersionOS;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f84 implements zr7 {
    public final Context a;
    public final vz7 b = new vz7(new ei3((byte) 14));
    public final vz7 c = new vz7(new ei3((byte) 15));
    public final vz7 d = new vz7(new ei3((byte) 16));

    public f84(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b1 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:14:0x0032, B:54:0x00fa, B:57:0x0102, B:36:0x00a1, B:38:0x00b1, B:44:0x00ce, B:46:0x00d1, B:50:0x00db, B:59:0x011e, B:60:0x0123), top: B:74:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:14:0x0032, B:54:0x00fa, B:57:0x0102, B:36:0x00a1, B:38:0x00b1, B:44:0x00ce, B:46:0x00d1, B:50:0x00db, B:59:0x011e, B:60:0x0123), top: B:74:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d1 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:14:0x0032, B:54:0x00fa, B:57:0x0102, B:36:0x00a1, B:38:0x00b1, B:44:0x00ce, B:46:0x00d1, B:50:0x00db, B:59:0x011e, B:60:0x0123), top: B:74:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x011e A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:14:0x0032, B:54:0x00fa, B:57:0x0102, B:36:0x00a1, B:38:0x00b1, B:44:0x00ce, B:46:0x00d1, B:50:0x00db, B:59:0x011e, B:60:0x0123), top: B:74:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [q51] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    public static Object c(f84 f84Var, Long l, Proxy proxy, HashMap map, String str, boolean z, iq1 iq1Var, s51 s51Var) {
        c84 c84Var;
        long jLongValue;
        boolean z2;
        int i;
        zf6 zf6Var;
        String str2;
        Throwable th;
        int i2;
        zf6 zf6Var2;
        f84 f84Var2 = f84Var;
        if (s51Var instanceof c84) {
            c84Var = (c84) s51Var;
            int i3 = c84Var.m0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c84Var.m0 = i3 - Integer.MIN_VALUE;
            } else {
                c84Var = new c84(f84Var2, s51Var);
            }
        } else {
            c84Var = new c84(f84Var2, s51Var);
        }
        c84 c84Var2 = c84Var;
        Object objW = c84Var2.k0;
        int i4 = c84Var2.m0;
        ?? r14 = 0;
        r14 = 0;
        c71 c71Var = c71.X;
        try {
            if (i4 == 0) {
                w39.n0(objW);
                try {
                    z47 z47Var = (z47) iq1Var.invoke();
                    jLongValue = l != null ? l.longValue() : new Integer(7).longValue() * 1000;
                    nf1 nf1Var = tp1.a;
                    ye1 ye1Var = ye1.Z;
                    m41 m41Var = new m41(z47Var, f84Var2, jLongValue, proxy, map, str, z, null);
                    c84Var2.f0 = f84Var2;
                    z2 = z;
                    c84Var2.h0 = z2;
                    c84Var2.i0 = 0;
                    c84Var2.j0 = jLongValue;
                    c84Var2.m0 = 1;
                    objW = w51.W(ye1Var, m41Var, c84Var2);
                    if (objW != c71Var) {
                        i = 0;
                        yf8 yf8Var = (yf8) objW;
                        zf6Var = (zf6) yf8Var.X;
                        str2 = (String) yf8Var.Y;
                        th = (Throwable) yf8Var.Z;
                        if (th != null) {
                            if (eu.Z(yb6.a.b(th.getClass()), (zu3[]) f84Var2.c.getValue())) {
                                th = null;
                            }
                            if (th == null) {
                                throw th;
                            }
                        }
                        if (zf6Var != null) {
                            throw new RuntimeException(str2);
                        }
                        i2 = zf6Var.f0;
                        if (200 <= i2) {
                            nf1 nf1Var2 = tp1.a;
                            ye1 ye1Var2 = ye1.Z;
                            l40 l40Var = new l40((Object) zf6Var, (q51) r14, (byte) 6);
                            c84Var2.f0 = null;
                            c84Var2.g0 = zf6Var;
                            c84Var2.h0 = z2;
                            c84Var2.i0 = i;
                            c84Var2.j0 = jLongValue;
                            c84Var2.m0 = 2;
                            objW = w51.W(ye1Var2, l40Var, c84Var2);
                            if (objW != c71Var) {
                                zf6Var2 = zf6Var;
                                zf6Var = zf6Var2;
                                r14 = (String) objW;
                            }
                        }
                    }
                    return c71Var;
                } catch (Throwable th2) {
                    th = th2;
                    i4 = 0;
                    if (i4 != 0) {
                        th.printStackTrace();
                    }
                    if (th instanceof InterruptedException) {
                    }
                    throw th;
                }
            }
            if (i4 == 1) {
                long j = c84Var2.j0;
                int i5 = c84Var2.i0;
                boolean z3 = c84Var2.h0;
                f84 f84Var3 = c84Var2.f0;
                try {
                    w39.n0(objW);
                    z2 = z3;
                    i = i5;
                    jLongValue = j;
                    f84Var2 = f84Var3;
                    yf8 yf8Var2 = (yf8) objW;
                    zf6Var = (zf6) yf8Var2.X;
                    str2 = (String) yf8Var2.Y;
                    th = (Throwable) yf8Var2.Z;
                    if (th != null) {
                        if (eu.Z(yb6.a.b(th.getClass()), (zu3[]) f84Var2.c.getValue())) {
                            th = null;
                        }
                        if (th == null) {
                            throw th;
                        }
                    }
                    if (zf6Var != null) {
                        throw new RuntimeException(str2);
                    }
                    i2 = zf6Var.f0;
                    if (200 <= i2 && i2 < 300) {
                        nf1 nf1Var3 = tp1.a;
                        ye1 ye1Var3 = ye1.Z;
                        l40 l40Var2 = new l40((Object) zf6Var, (q51) r14, (byte) 6);
                        c84Var2.f0 = null;
                        c84Var2.g0 = zf6Var;
                        c84Var2.h0 = z2;
                        c84Var2.i0 = i;
                        c84Var2.j0 = jLongValue;
                        c84Var2.m0 = 2;
                        objW = w51.W(ye1Var3, l40Var2, c84Var2);
                        if (objW != c71Var) {
                            zf6Var2 = zf6Var;
                        }
                        return c71Var;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i4 = i5;
                    if (i4 != 0 && !fm7.d0(gv3.W(th), "util.protection", false)) {
                        th.printStackTrace();
                    }
                    if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    return new rj6(th);
                }
            } else {
                if (i4 != 2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = c84Var2.i0;
                zf6Var2 = c84Var2.g0;
                w39.n0(objW);
            }
            zf6Var = zf6Var2;
            r14 = (String) objW;
            if (r14 == 0) {
                r14 = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            int i7 = zf6Var.f0;
            nz2 nz2Var = zf6Var.h0;
            Comparator comparator = String.CASE_INSENSITIVE_ORDER;
            comparator.getClass();
            TreeMap treeMap = new TreeMap(comparator);
            zp4.R(nz2Var, treeMap);
            return new pr(r14, treeMap, new Integer(i7));
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // defpackage.zr7
    public final Object a(String str, String str2, Proxy proxy, HashMap map, String str3, boolean z, s51 s51Var) {
        e84 e84Var;
        String str4;
        ps7 ps7Var;
        ms7 ms7Var;
        if (s51Var instanceof e84) {
            e84Var = (e84) s51Var;
            int i = e84Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                e84Var.h0 = i - Integer.MIN_VALUE;
            } else {
                e84Var = new e84(this, s51Var);
            }
        } else {
            e84Var = new e84(this, s51Var);
        }
        e84 e84Var2 = e84Var;
        Object obj = e84Var2.f0;
        int i2 = e84Var2.h0;
        if (i2 != 0) {
            if (i2 == 1) {
                w39.n0(obj);
                return ((sj6) obj).X;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj);
        qs7 qs7VarA = ((zt7) this.d.getValue()).a(str2);
        boolean z2 = (qs7VarA == null || (ms7Var = qs7VarA.g) == null) ? true : ms7Var.a;
        ss8 ss8Var = ss8.a;
        Context context = this.a;
        yf8 yf8VarK = ss8.k(context);
        String value = ((HWID) yf8VarK.X).getValue();
        String value2 = ((VersionOS) yf8VarK.Y).getValue();
        String value3 = ((DeviceModel) yf8VarK.Z).getValue();
        URL url = new URL(str);
        String strJ = (qs7VarA == null || (ps7Var = qs7VarA.i) == null) ? null : ps7Var.a;
        if (strJ == null) {
            if (ue3.y(context)) {
                str4 = "AndroidTV";
            } else {
                str4 = "Android";
            }
            strJ = ch3.J(str4);
        } else {
            if (fm7.o0(strJ)) {
                strJ = null;
            }
            if (strJ == null) {
                if (ue3.y(context)) {
                    str4 = "AndroidTV";
                } else {
                    str4 = "Android";
                }
                strJ = ch3.J(str4);
            }
        }
        z47 z47Var = new z47((byte) 29);
        String string = url.toString();
        string.getClass();
        t23 t23Var = new t23((byte) 0);
        t23Var.f(null, string);
        z47Var.Z = t23Var.b();
        z47Var.M("Connection", "close");
        z47Var.M("User-agent", strJ);
        String language = ss8.n().getLanguage();
        language.getClass();
        z47Var.M("X-Device-Locale", language);
        String userInfo = url.getUserInfo();
        if (userInfo != null) {
            z47Var.M("Authorization", "Basic ".concat(ss8.b(eq8.a(1, userInfo, (6 & 2) != 0))));
        }
        if (z2) {
            z47Var.M("X-HWID", value);
            z47Var.M("X-Device-OS", ue3.y(context) ? "AndroidTV" : "Android");
            z47Var.M("X-Ver-OS", value2);
            z47Var.M("X-Device-model", value3);
        }
        y5 y5VarO = z47Var.o();
        kw4 kw4Var = kw4.a;
        SubscriptionItem subscriptionItemF = kw4.f(str2);
        boolean zU = subscriptionItemF != null ? subscriptionItemF.U() : false;
        Long l = new Long(new Integer(qs7VarA != null ? qs7VarA.h : 7).longValue() * 1000);
        iq1 iq1Var = new iq1((byte) 2, y5VarO, z47Var, zU);
        e84Var2.h0 = 1;
        Object objC = c(this, l, proxy, map, str3, z, iq1Var, e84Var2);
        c71 c71Var = c71.X;
        return objC == c71Var ? c71Var : objC;
    }

    public final zf6 b(y5 y5Var, boolean z, long j, Proxy proxy, HashMap map, String str, boolean z2) throws NoSuchAlgorithmException, KeyManagementException {
        k95 k95Var = new k95();
        TimeUnit.MILLISECONDS.getClass();
        k95Var.q = ks8.b(j);
        k95Var.s = ks8.b(j);
        k95Var.t = ks8.b(j);
        k95Var.r = ks8.b(j);
        k95Var.f = new vk1((CookieManager) this.b.getValue());
        k95Var.g = new h70(z, map, (byte) 4);
        if (str != null) {
            k95Var.d.add(new m80(str));
        }
        k95Var.c.add(new r11((byte) 3));
        if (z2) {
            X509TrustManager[] x509TrustManagerArr = {new d72((byte) 1)};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, x509TrustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            X509TrustManager x509TrustManager = x509TrustManagerArr[0];
            x509TrustManager.getClass();
            if (socketFactory.equals(k95Var.j)) {
                x509TrustManager.equals(k95Var.k);
            }
            k95Var.j = socketFactory;
            lo5 lo5Var = lo5.a;
            k95Var.p = lo5.a.b(x509TrustManager);
            k95Var.k = x509TrustManager;
            k95Var.n = new rn((byte) 2);
        }
        if (proxy != null) {
            dh3.f(proxy, k95Var.h);
            k95Var.h = proxy;
        } else {
            HappApplication happApplication = HappApplication.M0;
            if (k32.i().e().g()) {
                c16 c16VarE = k32.i().e();
                int i = (int) j;
                c16VarE.getClass();
                c16VarE.h();
                if (c16VarE.g()) {
                    ss8 ss8Var = ss8.a;
                    ss8.t();
                    String str2 = c16VarE.h;
                    if (str2 != null) {
                        k95Var.i = new rw(c16VarE.g, n67.d(), i, str2);
                    } else {
                        Proxy proxy2 = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", n67.d()));
                        dh3.f(proxy2, k95Var.h);
                        k95Var.h = proxy2;
                    }
                }
            }
        }
        l95 l95Var = new l95(k95Var);
        m76 m76Var = new m76(l95Var, y5Var);
        if (!m76Var.g0.compareAndSet(false, true)) {
            bt.i("Already Executed");
            return null;
        }
        m76Var.f0.enter();
        lo5 lo5Var2 = lo5.a;
        m76Var.h0 = lo5.a.g();
        try {
            z47 z47Var = l95Var.X;
            synchronized (z47Var) {
                ((ArrayDeque) z47Var.f0).add(m76Var);
            }
            zf6 zf6VarD = m76Var.d();
            l95Var.X.B(m76Var);
            return zf6VarD;
        } catch (Throwable th) {
            m76Var.X.X.B(m76Var);
            throw th;
        }
    }
}
