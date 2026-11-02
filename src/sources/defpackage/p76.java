package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p76 extends y13 {
    public final mm6 b;
    public Socket c;
    public Socket d;
    public ov2 e;
    public p06 f;
    public h23 g;
    public j76 h;
    public i76 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public p76(ry1 ry1Var, mm6 mm6Var) {
        mm6Var.getClass();
        this.b = mm6Var;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(l95 l95Var, mm6 mm6Var, IOException iOException) {
        mm6Var.getClass();
        iOException.getClass();
        if (mm6Var.b.type() != Proxy.Type.DIRECT) {
            j7 j7Var = mm6Var.a;
            j7Var.g.connectFailed(j7Var.h.f(), mm6Var.b.address(), iOException);
        }
        jf6 jf6Var = l95Var.u0;
        synchronized (jf6Var) {
            jf6Var.b.add(mm6Var);
        }
    }

    @Override // defpackage.y13
    public final synchronized void a(h23 h23Var, t57 t57Var) {
        t57Var.getClass();
        this.o = (t57Var.a & 16) != 0 ? t57Var.b[4] : Integer.MAX_VALUE;
    }

    @Override // defpackage.y13
    public final void b(o23 o23Var) {
        o23Var.c(8, null);
    }

    public final void c(int i, int i2, int i3, m76 m76Var) throws Throwable {
        if (this.f != null) {
            bt.i("already connected");
            return;
        }
        j7 j7Var = this.b.a;
        List list = j7Var.j;
        b21 b21Var = new b21(list);
        if (j7Var.c == null) {
            if (!list.contains(a21.f)) {
                throw new nm6(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.h.d;
            lo5 lo5Var = lo5.a;
            if (!lo5.a.h(str)) {
                throw new nm6(new UnknownServiceException(pc6.p("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (j7Var.i.contains(p06.H2_PRIOR_KNOWLEDGE)) {
            throw new nm6(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        nm6 nm6Var = null;
        while (true) {
            try {
                mm6 mm6Var = this.b;
                if (mm6Var.a.c != null && mm6Var.b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, m76Var);
                    if (this.c != null) {
                        break;
                    } else {
                        break;
                    }
                }
                e(i, i2, m76Var);
                g(b21Var, m76Var);
                this.b.c.getClass();
                break;
            } catch (IOException e) {
                Socket socket = this.d;
                if (socket != null) {
                    ks8.d(socket);
                }
                Socket socket2 = this.c;
                if (socket2 != null) {
                    ks8.d(socket2);
                }
                this.d = null;
                this.c = null;
                this.h = null;
                this.i = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.o = 1;
                this.b.c.getClass();
                if (nm6Var == null) {
                    nm6Var = new nm6(e);
                } else {
                    gv3.g(nm6Var.X, e);
                    nm6Var.Y = e;
                }
                b21Var.d = true;
                if (!b21Var.c) {
                    throw nm6Var;
                }
                if (e instanceof ProtocolException) {
                    throw nm6Var;
                }
                if (e instanceof InterruptedIOException) {
                    throw nm6Var;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw nm6Var;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw nm6Var;
                }
                if (!(e instanceof SSLException)) {
                    throw nm6Var;
                }
            }
        }
        mm6 mm6Var2 = this.b;
        if (mm6Var2.a.c != null && mm6Var2.b.type() == Proxy.Type.HTTP && this.c == null) {
            throw new nm6(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.q = System.nanoTime();
    }

    public final void e(int i, int i2, m76 m76Var) throws IOException {
        Socket socketCreateSocket;
        mm6 mm6Var = this.b;
        Proxy proxy = mm6Var.b;
        j7 j7Var = mm6Var.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : n76.a[type.ordinal()];
        byte b = 1;
        if (i3 == 1 || i3 == 2) {
            socketCreateSocket = j7Var.b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.c = socketCreateSocket;
        this.b.c.getClass();
        socketCreateSocket.setSoTimeout(i2);
        try {
            lo5 lo5Var = lo5.a;
            lo5.a.e(socketCreateSocket, this.b.c, i);
            try {
                ae7 ae7Var = new ae7(socketCreateSocket);
                InputStream inputStream = socketCreateSocket.getInputStream();
                inputStream.getClass();
                this.h = vr3.i(ae7Var.source(new mv(inputStream, ae7Var)));
                ae7 ae7Var2 = new ae7(socketCreateSocket);
                OutputStream outputStream = socketCreateSocket.getOutputStream();
                outputStream.getClass();
                this.i = vr3.h(ae7Var2.sink(new lv(outputStream, ae7Var2, b)));
            } catch (NullPointerException e) {
                if (dh3.f(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, m76 m76Var) throws IOException {
        z47 z47Var = new z47((byte) 29);
        mm6 mm6Var = this.b;
        z47Var.Z = mm6Var.a.h;
        z47Var.P("CONNECT", null);
        z47Var.M("Host", ks8.t(mm6Var.a.h, true));
        z47Var.M("Proxy-Connection", "Keep-Alive");
        z47Var.M("User-Agent", "okhttp/4.12.0");
        y5 y5VarO = z47Var.o();
        ArrayList arrayList = new ArrayList(20);
        dh3.i("Proxy-Authenticate");
        dh3.j("OkHttp-Preemptive", "Proxy-Authenticate");
        int i4 = 0;
        while (i4 < arrayList.size()) {
            if ("Proxy-Authenticate".equalsIgnoreCase((String) arrayList.get(i4))) {
                arrayList.remove(i4);
                arrayList.remove(i4);
                i4 -= 2;
            }
            i4 += 2;
        }
        arrayList.add("Proxy-Authenticate");
        arrayList.add(fm7.R0("OkHttp-Preemptive").toString());
        u23 u23Var = (u23) y5VarO.Y;
        e(i, i2, m76Var);
        String str = "CONNECT " + ks8.t(u23Var, true) + " HTTP/1.1";
        j76 j76Var = this.h;
        j76Var.getClass();
        i76 i76Var = this.i;
        i76Var.getClass();
        r13 r13Var = new r13(null, this, j76Var, i76Var);
        ta8 ta8VarTimeout = j76Var.X.timeout();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ta8VarTimeout.timeout(j, timeUnit);
        i76Var.X.timeout().timeout(i3, timeUnit);
        r13Var.f((nz2) y5VarO.g0, str);
        r13Var.finishRequest();
        yf6 responseHeaders = r13Var.readResponseHeaders(false);
        responseHeaders.getClass();
        responseHeaders.a = y5VarO;
        zf6 zf6VarA = responseHeaders.a();
        int i5 = zf6VarA.f0;
        long jI = ks8.i(zf6VarA);
        if (jI != -1) {
            p13 p13VarE = r13Var.e(jI);
            ks8.r(p13VarE, Integer.MAX_VALUE);
            p13VarE.close();
        }
        if (i5 != 200) {
            if (i5 == 407) {
                u52.s("Failed to authenticate with proxy");
                return;
            } else {
                u52.s(pc6.j(i5, "Unexpected response code for CONNECT: "));
                return;
            }
        }
        if (j76Var.Y.F() && i76Var.Y.F()) {
            return;
        }
        u52.s("TLS tunnel buffered too many bytes!");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(b21 b21Var, m76 m76Var) throws Throwable {
        p06 p06VarV = p06.HTTP_1_1;
        j7 j7Var = this.b.a;
        SSLSocketFactory sSLSocketFactory = j7Var.c;
        if (sSLSocketFactory == null) {
            List list = j7Var.i;
            p06 p06Var = p06.H2_PRIOR_KNOWLEDGE;
            boolean zContains = list.contains(p06Var);
            Socket socket = this.c;
            if (!zContains) {
                this.d = socket;
                this.f = p06VarV;
                return;
            } else {
                this.d = socket;
                this.f = p06Var;
                l();
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            sSLSocketFactory.getClass();
            Socket socket2 = this.c;
            u23 u23Var = j7Var.h;
            byte b = 1;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket2, u23Var.d, u23Var.e, true);
            socketCreateSocket.getClass();
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                a21 a21VarA = b21Var.a(sSLSocket2);
                if (a21VarA.b) {
                    lo5 lo5Var = lo5.a;
                    lo5.a.d(sSLSocket2, j7Var.h.d, j7Var.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                session.getClass();
                ov2 ov2VarJ = zc1.J(session);
                HostnameVerifier hostnameVerifier = j7Var.d;
                hostnameVerifier.getClass();
                boolean zVerify = hostnameVerifier.verify(j7Var.h.d, session);
                byte b2 = 0;
                if (!zVerify) {
                    List listA = ov2VarJ.a();
                    if (listA.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + j7Var.h.d + " not verified (no certificates)");
                    }
                    Object obj = listA.get(0);
                    obj.getClass();
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(j7Var.h.d);
                    sb.append(" not verified:\n              |    certificate: ");
                    to0 to0Var = to0.c;
                    kb0 kb0Var = kb0.f0;
                    byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                    encoded.getClass();
                    sb.append("sha256/".concat(ra.l(encoded).d("SHA-256").a()));
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    sb.append(wv0.H0(j95.a(x509Certificate, 7), j95.a(x509Certificate, 2)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(gm7.O(sb.toString()));
                }
                to0 to0Var2 = j7Var.e;
                to0Var2.getClass();
                this.e = new ov2(ov2VarJ.a, ov2VarJ.b, ov2VarJ.c, new o76(to0Var2, ov2VarJ, j7Var, b2));
                j7Var.h.d.getClass();
                Iterator it = to0Var2.a.iterator();
                if (it.hasNext()) {
                    p61.x(it.next());
                    throw null;
                }
                if (a21VarA.b) {
                    lo5 lo5Var2 = lo5.a;
                    strF = lo5.a.f(sSLSocket2);
                }
                this.d = sSLSocket2;
                ae7 ae7Var = new ae7(sSLSocket2);
                InputStream inputStream = sSLSocket2.getInputStream();
                inputStream.getClass();
                this.h = vr3.i(ae7Var.source(new mv(inputStream, ae7Var)));
                ae7 ae7Var2 = new ae7(sSLSocket2);
                OutputStream outputStream = sSLSocket2.getOutputStream();
                outputStream.getClass();
                this.i = vr3.h(ae7Var2.sink(new lv(outputStream, ae7Var2, b)));
                if (strF != null) {
                    p06VarV = gv3.v(strF);
                }
                this.f = p06VarV;
                lo5 lo5Var3 = lo5.a;
                lo5.a.a(sSLSocket2);
                if (this.f == p06.HTTP_2) {
                    l();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    lo5 lo5Var4 = lo5.a;
                    lo5.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    ks8.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean h(j7 j7Var, List list) {
        ov2 ov2Var;
        u23 u23Var = j7Var.h;
        String str = u23Var.d;
        byte[] bArr = ks8.a;
        if (this.p.size() < this.o && !this.j) {
            mm6 mm6Var = this.b;
            j7 j7Var2 = mm6Var.a;
            j7 j7Var3 = mm6Var.a;
            if (j7Var2.a(j7Var)) {
                if (!dh3.f(str, j7Var3.h.d)) {
                    if (this.g != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            mm6 mm6Var2 = (mm6) it.next();
                            Proxy.Type type = mm6Var2.b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && mm6Var.b.type() == type2 && dh3.f(mm6Var.c, mm6Var2.c)) {
                                if (j7Var.d != j95.a) {
                                    break;
                                }
                                byte[] bArr2 = ks8.a;
                                u23 u23Var2 = j7Var3.h;
                                if (u23Var.e != u23Var2.e) {
                                    break;
                                }
                                if (!dh3.f(str, u23Var2.d)) {
                                    if (!this.k && (ov2Var = this.e) != null) {
                                        List listA = ov2Var.a();
                                        if (!listA.isEmpty()) {
                                            Object obj = listA.get(0);
                                            obj.getClass();
                                            if (!j95.b(str, (X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    to0 to0Var = j7Var.e;
                                    to0Var.getClass();
                                    ov2 ov2Var2 = this.e;
                                    ov2Var2.getClass();
                                    List listA2 = ov2Var2.a();
                                    str.getClass();
                                    listA2.getClass();
                                    Iterator it2 = to0Var.a.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    p61.x(it2.next());
                                    throw null;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z) {
        long j;
        byte[] bArr = ks8.a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.c;
        socket.getClass();
        Socket socket2 = this.d;
        socket2.getClass();
        j76 j76Var = this.h;
        j76Var.getClass();
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        h23 h23Var = this.g;
        if (h23Var != null) {
            synchronized (h23Var) {
                if (h23Var.h0) {
                    return false;
                }
                return h23Var.p0 >= h23Var.o0 || jNanoTime < h23Var.q0;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.q;
        }
        if (j < RealConnection.IDLE_CONNECTION_HEALTHY_NS || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !j76Var.F();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final o42 j(l95 l95Var, y76 y76Var) throws SocketException {
        int i = y76Var.g;
        Socket socket = this.d;
        socket.getClass();
        j76 j76Var = this.h;
        j76Var.getClass();
        i76 i76Var = this.i;
        i76Var.getClass();
        h23 h23Var = this.g;
        if (h23Var != null) {
            return new i23(l95Var, this, y76Var, h23Var);
        }
        socket.setSoTimeout(i);
        ta8 ta8VarTimeout = j76Var.X.timeout();
        long j = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ta8VarTimeout.timeout(j, timeUnit);
        i76Var.X.timeout().timeout(y76Var.h, timeUnit);
        return new r13(l95Var, this, j76Var, i76Var);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() throws SocketException {
        int i;
        Socket socket = this.d;
        socket.getClass();
        j76 j76Var = this.h;
        j76Var.getClass();
        i76 i76Var = this.i;
        i76Var.getClass();
        socket.setSoTimeout(0);
        f28 f28Var = f28.h;
        fu6 fu6Var = new fu6(f28Var);
        String str = this.b.a.h.d;
        str.getClass();
        fu6Var.Z = socket;
        fu6Var.f0 = ks8.f + ' ' + str;
        fu6Var.g0 = j76Var;
        fu6Var.h0 = i76Var;
        fu6Var.i0 = this;
        h23 h23Var = new h23(fu6Var);
        this.g = h23Var;
        t57 t57Var = h23.B0;
        this.o = (t57Var.a & 16) != 0 ? t57Var.b[4] : Integer.MAX_VALUE;
        p23 p23Var = h23Var.y0;
        synchronized (p23Var) {
            try {
                if (p23Var.f0) {
                    throw new IOException("closed");
                }
                Logger logger = p23.h0;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(ks8.g(">> CONNECTION " + s13.a.f(), new Object[0]));
                }
                p23Var.X.P0(s13.a);
                p23Var.X.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        p23 p23Var2 = h23Var.y0;
        t57 t57Var2 = h23Var.r0;
        synchronized (p23Var2) {
            try {
                t57Var2.getClass();
                if (p23Var2.f0) {
                    throw new IOException("closed");
                }
                p23Var2.m(0, Integer.bitCount(t57Var2.a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z = true;
                    if (((1 << i2) & t57Var2.a) == 0) {
                        z = false;
                    }
                    if (z) {
                        if (i2 != 4) {
                            i = i2 != 7 ? i2 : 4;
                        } else {
                            i = 3;
                        }
                        p23Var2.X.writeShort(i);
                        p23Var2.X.writeInt(t57Var2.b[i2]);
                    }
                    i2++;
                }
                p23Var2.X.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iA = h23Var.r0.a();
        if (iA != 65535) {
            h23Var.y0.J(0, iA - 65535);
        }
        f28Var.d().c(new f23((byte) 2, h23Var.z0, h23Var.Z), 0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        mm6 mm6Var = this.b;
        sb.append(mm6Var.a.h.d);
        sb.append(':');
        sb.append(mm6Var.a.h.e);
        sb.append(", proxy=");
        sb.append(mm6Var.b);
        sb.append(" hostAddress=");
        sb.append(mm6Var.c);
        sb.append(" cipherSuite=");
        ov2 ov2Var = this.e;
        sb.append(ov2Var != null ? ov2Var.b : "none");
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
