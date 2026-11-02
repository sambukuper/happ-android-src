package defpackage;

import android.content.Context;
import java.net.CookieManager;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.HappApplication;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class e72 {
    public final Context a;
    public final vz7 b = new vz7(new w01(26));
    public final vz7 c = new vz7(new w01(27));

    public e72(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b1 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:14:0x0032, B:52:0x00f5, B:55:0x00fd, B:36:0x00a1, B:38:0x00b1, B:44:0x00ce, B:46:0x00d1, B:48:0x00d7, B:57:0x0120, B:58:0x0125), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:14:0x0032, B:52:0x00f5, B:55:0x00fd, B:36:0x00a1, B:38:0x00b1, B:44:0x00ce, B:46:0x00d1, B:48:0x00d7, B:57:0x0120, B:58:0x0125), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d1 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:14:0x0032, B:52:0x00f5, B:55:0x00fd, B:36:0x00a1, B:38:0x00b1, B:44:0x00ce, B:46:0x00d1, B:48:0x00d7, B:57:0x0120, B:58:0x0125), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d7 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:14:0x0032, B:52:0x00f5, B:55:0x00fd, B:36:0x00a1, B:38:0x00b1, B:44:0x00ce, B:46:0x00d1, B:48:0x00d7, B:57:0x0120, B:58:0x0125), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:57:0x0120 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:14:0x0032, B:52:0x00f5, B:55:0x00fd, B:36:0x00a1, B:38:0x00b1, B:44:0x00ce, B:46:0x00d1, B:48:0x00d7, B:57:0x0120, B:58:0x0125), top: B:72:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object d(e72 e72Var, Long l, Proxy proxy, HashMap map, String str, boolean z, dn2 dn2Var, s51 s51Var) throws Throwable {
        a72 a72Var;
        long jLongValue;
        boolean z2;
        int i;
        Response response;
        String str2;
        Throwable th;
        Response response2;
        e72 e72Var2 = e72Var;
        if (s51Var instanceof a72) {
            a72Var = (a72) s51Var;
            int i2 = a72Var.m0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a72Var.m0 = i2 - Integer.MIN_VALUE;
            } else {
                a72Var = new a72(e72Var2, s51Var);
            }
        } else {
            a72Var = new a72(e72Var2, s51Var);
        }
        a72 a72Var2 = a72Var;
        Object objW = a72Var2.k0;
        int i3 = a72Var2.m0;
        byte b = 0;
        String str3 = null;
        Object[] objArr = 0;
        c71 c71Var = c71.X;
        try {
            if (i3 == 0) {
                w39.n0(objW);
                try {
                    Request.Builder builder = (Request.Builder) dn2Var.invoke();
                    jLongValue = l != null ? l.longValue() : new Integer(7).longValue() * 1000;
                    nf1 nf1Var = tp1.a;
                    ye1 ye1Var = ye1.Z;
                    b72 b72Var = new b72(builder, e72Var2, jLongValue, proxy, map, str, z, null);
                    a72Var2.f0 = e72Var2;
                    z2 = z;
                    a72Var2.h0 = z2;
                    a72Var2.i0 = 0;
                    a72Var2.j0 = jLongValue;
                    a72Var2.m0 = 1;
                    objW = w51.W(ye1Var, b72Var, a72Var2);
                    if (objW != c71Var) {
                        i = 0;
                        yf8 yf8Var = (yf8) objW;
                        response = (Response) yf8Var.X;
                        str2 = (String) yf8Var.Y;
                        th = (Throwable) yf8Var.Z;
                        if (th != null) {
                            if (eu.Z(yb6.a.b(th.getClass()), (zu3[]) e72Var2.c.getValue())) {
                                th = null;
                            }
                            if (th == null) {
                                throw th;
                            }
                        }
                        if (response != null) {
                            throw new RuntimeException(str2);
                        }
                        if (response.getIsSuccessful()) {
                            nf1 nf1Var2 = tp1.a;
                            ye1 ye1Var2 = ye1.Z;
                            c72 c72Var = new c72(response, objArr == true ? 1 : 0, b);
                            a72Var2.f0 = null;
                            a72Var2.g0 = response;
                            a72Var2.h0 = z2;
                            a72Var2.i0 = i;
                            a72Var2.j0 = jLongValue;
                            a72Var2.m0 = 2;
                            objW = w51.W(ye1Var2, c72Var, a72Var2);
                            if (objW != c71Var) {
                                response2 = response;
                                str3 = (String) objW;
                                response = response2;
                            }
                        }
                    }
                    return c71Var;
                } catch (Throwable th2) {
                    th = th2;
                    i3 = 0;
                    if (i3 != 0) {
                        th.printStackTrace();
                    }
                    if (th instanceof InterruptedException) {
                    }
                    throw th;
                }
            }
            if (i3 == 1) {
                long j = a72Var2.j0;
                int i4 = a72Var2.i0;
                boolean z3 = a72Var2.h0;
                e72 e72Var3 = a72Var2.f0;
                try {
                    w39.n0(objW);
                    z2 = z3;
                    i = i4;
                    jLongValue = j;
                    e72Var2 = e72Var3;
                    yf8 yf8Var2 = (yf8) objW;
                    response = (Response) yf8Var2.X;
                    str2 = (String) yf8Var2.Y;
                    th = (Throwable) yf8Var2.Z;
                    if (th != null) {
                        if (eu.Z(yb6.a.b(th.getClass()), (zu3[]) e72Var2.c.getValue())) {
                            th = null;
                        }
                        if (th == null) {
                            throw th;
                        }
                    }
                    if (response != null) {
                        throw new RuntimeException(str2);
                    }
                    if (response.getIsSuccessful()) {
                        nf1 nf1Var3 = tp1.a;
                        ye1 ye1Var3 = ye1.Z;
                        c72 c72Var2 = new c72(response, objArr == true ? 1 : 0, b);
                        a72Var2.f0 = null;
                        a72Var2.g0 = response;
                        a72Var2.h0 = z2;
                        a72Var2.i0 = i;
                        a72Var2.j0 = jLongValue;
                        a72Var2.m0 = 2;
                        objW = w51.W(ye1Var3, c72Var2, a72Var2);
                        if (objW != c71Var) {
                            response2 = response;
                        }
                        return c71Var;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i3 = i4;
                    if (i3 != 0 && !fm7.d0(gv3.W(th), "util.protection", false)) {
                        th.printStackTrace();
                    }
                    if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    return new rj6(th);
                }
            } else {
                if (i3 != 2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i5 = a72Var2.i0;
                response2 = a72Var2.g0;
                w39.n0(objW);
            }
            str3 = (String) objW;
            response = response2;
            if (str3 == null) {
                str3 = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            int iCode = response.code();
            Headers headers = response.headers();
            headers.getClass();
            Comparator comparator = String.CASE_INSENSITIVE_ORDER;
            comparator.getClass();
            TreeMap treeMap = new TreeMap(comparator);
            zp4.R(headers, treeMap);
            return new pr(str3, treeMap, new Integer(iCode));
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final Response b(Request request, final boolean z, long j, Proxy proxy, final HashMap map, String str, boolean z2) throws NoSuchAlgorithmException, KeyManagementException {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient.Builder builderDns = builder.callTimeout(j, timeUnit).readTimeout(j, timeUnit).writeTimeout(j, timeUnit).connectTimeout(j, timeUnit).cookieJar(new JavaNetCookieJar((CookieManager) this.b.getValue())).cache(null).dns(new Dns() { // from class: y62
            @Override // okhttp3.Dns
            public final List lookup(String str2) throws UnknownHostException {
                String str3;
                str2.getClass();
                if (!z) {
                    Dns dns = Dns.SYSTEM;
                    HashMap map2 = map;
                    if (map2 != null && (str3 = (String) map2.get(str2)) != null) {
                        str2 = str3;
                    }
                    return dns.lookup(str2);
                }
                List<InetAddress> listLookup = Dns.SYSTEM.lookup(str2);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLookup) {
                    if (obj instanceof Inet4Address) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        });
        if (str != null) {
            builderDns.addNetworkInterceptor(new a13(str));
        }
        builderDns.addInterceptor(new w96());
        if (z2) {
            X509TrustManager[] x509TrustManagerArr = {new d72((byte) 0)};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, x509TrustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            builderDns.sslSocketFactory(socketFactory, x509TrustManagerArr[0]);
            builderDns.hostnameVerifier(new rn((byte) 1));
        }
        if (proxy != null) {
            builderDns = builderDns.proxy(proxy);
        } else {
            HappApplication happApplication = HappApplication.M0;
            if (k32.i().e().g()) {
                builderDns = k32.i().e().a(builderDns, (int) j);
            }
        }
        return builderDns.build().newCall(request).execute();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(String str, s51 s51Var) throws Throwable {
        z62 z62Var;
        if (s51Var instanceof z62) {
            z62Var = (z62) s51Var;
            int i = z62Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                z62Var.h0 = i - Integer.MIN_VALUE;
            } else {
                z62Var = new z62(this, s51Var);
            }
        } else {
            z62Var = new z62(this, s51Var);
        }
        z62 z62Var2 = z62Var;
        Object obj = z62Var2.f0;
        int i2 = z62Var2.h0;
        if (i2 != 0) {
            if (i2 == 1) {
                w39.n0(obj);
                return ((sj6) obj).X;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj);
        p5 p5Var = new p5(this, str, (byte) 22);
        z62Var2.h0 = 1;
        Object objD = d(this, null, null, null, null, false, p5Var, z62Var2);
        c71 c71Var = c71.X;
        return objD == c71Var ? c71Var : objD;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    /* JADX WARN: Code duplicated, block: B:9:0x000d  */
    public final Request.Builder e(URL url, String str) {
        String str2;
        if (str == null) {
            if (ue3.y(this.a)) {
                str2 = "AndroidTV";
            } else {
                str2 = "Android";
            }
            str = ch3.J(str2);
        } else {
            if (fm7.o0(str)) {
                str = null;
            }
            if (str == null) {
                if (ue3.y(this.a)) {
                    str2 = "AndroidTV";
                } else {
                    str2 = "Android";
                }
                str = ch3.J(str2);
            }
        }
        Request.Builder builderHeader = new Request.Builder().url(url).header("Connection", "close").header("User-agent", str);
        ss8 ss8Var = ss8.a;
        String language = ss8.n().getLanguage();
        language.getClass();
        Request.Builder builderHeader2 = builderHeader.header("X-Device-Locale", language);
        String userInfo = url.getUserInfo();
        if (userInfo != null) {
            builderHeader2.header("Authorization", "Basic ".concat(ss8.b(eq8.a(1, userInfo, (6 & 2) != 0))));
        }
        return builderHeader2;
    }
}
