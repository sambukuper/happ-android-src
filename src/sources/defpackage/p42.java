package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p42 {
    public final ry1 a;
    public final j7 b;
    public final m76 c;
    public b8 d;
    public d7 e;
    public int f;
    public int g;
    public int h;
    public mm6 i;

    public p42(ry1 ry1Var, j7 j7Var, m76 m76Var) {
        this.a = ry1Var;
        this.b = j7Var;
        this.c = m76Var;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0236  */
    /* JADX WARN: Code duplicated, block: B:118:0x0251  */
    /* JADX WARN: Code duplicated, block: B:120:0x025d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0266  */
    /* JADX WARN: Code duplicated, block: B:123:0x026c  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:133:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:173:0x02b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0293 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:73:0x0139  */
    public final p76 a(int i, int i2, int i3, boolean z) throws IOException {
        mm6 mm6Var;
        b8 b8Var;
        d7 d7Var;
        ArrayList arrayList;
        b8 b8Var2;
        j7 j7Var;
        Proxy proxy;
        String hostAddress;
        int port;
        List listK;
        boolean zContains;
        p76 p76Var;
        jf6 jf6Var;
        Socket socketG;
        while (!this.c.o0) {
            m76 m76Var = this.c;
            p76 p76Var2 = m76Var.j0;
            if (p76Var2 != null) {
                synchronized (p76Var2) {
                    try {
                        if (!p76Var2.j) {
                            u23 u23Var = p76Var2.b.a.h;
                            u23 u23Var2 = this.b.h;
                            socketG = !(u23Var.e == u23Var2.e && dh3.f(u23Var.d, u23Var2.d)) ? this.c.g() : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.c.j0 == null) {
                    if (socketG != null) {
                        ks8.d(socketG);
                    }
                    m76Var = this.c;
                    this.f = 0;
                    this.g = 0;
                    this.h = 0;
                    if (this.a.a(this.b, m76Var, null, false)) {
                        p76Var2 = this.c.j0;
                        p76Var2.getClass();
                    } else {
                        mm6Var = this.i;
                        try {
                            if (mm6Var != null) {
                                this.i = null;
                            } else {
                                b8Var = this.d;
                                if (b8Var == null && b8Var.h()) {
                                    b8 b8Var3 = this.d;
                                    b8Var3.getClass();
                                    if (!b8Var3.h()) {
                                        bt.n();
                                        return null;
                                    }
                                    ArrayList arrayList2 = (ArrayList) b8Var3.c;
                                    int i4 = b8Var3.b;
                                    b8Var3.b = i4 + 1;
                                    mm6Var = (mm6) arrayList2.get(i4);
                                } else {
                                    d7Var = this.e;
                                    if (d7Var == null) {
                                        j7 j7Var2 = this.b;
                                        m76 m76Var2 = this.c;
                                        d7Var = new d7(j7Var2, m76Var2.X.u0, m76Var2);
                                        this.e = d7Var;
                                    }
                                    if (d7Var.x()) {
                                        bt.n();
                                        return null;
                                    }
                                    arrayList = new ArrayList();
                                    while (d7Var.b < ((List) d7Var.f).size()) {
                                        j7Var = (j7) d7Var.c;
                                        if (d7Var.b < ((List) d7Var.f).size()) {
                                            throw new SocketException("No route to " + j7Var.h.d + "; exhausted proxy configurations: " + ((List) d7Var.f));
                                        }
                                        List list = (List) d7Var.f;
                                        int i5 = d7Var.b;
                                        d7Var.b = i5 + 1;
                                        proxy = (Proxy) list.get(i5);
                                        ArrayList arrayList3 = new ArrayList();
                                        d7Var.g = arrayList3;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            u23 u23Var3 = j7Var.h;
                                            hostAddress = u23Var3.d;
                                            port = u23Var3.e;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                xw3.z(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                                                return null;
                                            }
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            InetAddress address = inetSocketAddress.getAddress();
                                            if (address == null) {
                                                hostAddress = inetSocketAddress.getHostName();
                                                hostAddress.getClass();
                                            } else {
                                                hostAddress = address.getHostAddress();
                                                hostAddress.getClass();
                                            }
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || port >= 65536) {
                                            throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList3.add(InetSocketAddress.createUnresolved(hostAddress, port));
                                        } else {
                                            byte[] bArr = ks8.a;
                                            hostAddress.getClass();
                                            if (ks8.e.d(hostAddress)) {
                                                listK = i21.K(InetAddress.getByName(hostAddress));
                                            } else {
                                                List listLookup = j7Var.a.lookup(hostAddress);
                                                if (listLookup.isEmpty()) {
                                                    throw new UnknownHostException(j7Var.a + " returned no addresses for " + hostAddress);
                                                }
                                                listK = listLookup;
                                            }
                                            Iterator it = listK.iterator();
                                            while (it.hasNext()) {
                                                arrayList3.add(new InetSocketAddress((InetAddress) it.next(), port));
                                            }
                                        }
                                        Iterator it2 = ((List) d7Var.g).iterator();
                                        while (it2.hasNext()) {
                                            mm6 mm6Var2 = new mm6((j7) d7Var.c, proxy, (InetSocketAddress) it2.next());
                                            jf6 jf6Var2 = (jf6) d7Var.e;
                                            synchronized (jf6Var2) {
                                                zContains = jf6Var2.b.contains(mm6Var2);
                                            }
                                            if (zContains) {
                                                ((ArrayList) d7Var.d).add(mm6Var2);
                                            } else {
                                                arrayList.add(mm6Var2);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        bw0.d0(arrayList, (ArrayList) d7Var.d);
                                        ((ArrayList) d7Var.d).clear();
                                    }
                                    b8Var2 = new b8(arrayList);
                                    this.d = b8Var2;
                                    if (!this.c.o0) {
                                        u52.s("Canceled");
                                        return null;
                                    }
                                    if (this.a.a(this.b, this.c, arrayList, false)) {
                                        p76Var2 = this.c.j0;
                                        p76Var2.getClass();
                                    } else {
                                        if (b8Var2.h()) {
                                            bt.n();
                                            return null;
                                        }
                                        int i6 = b8Var2.b;
                                        b8Var2.b = i6 + 1;
                                        mm6Var = (mm6) arrayList.get(i6);
                                        p76Var = new p76(this.a, mm6Var);
                                        this.c.q0 = p76Var;
                                        p76Var.c(i, i2, i3, this.c);
                                        this.c.q0 = null;
                                        jf6Var = this.c.X.u0;
                                        synchronized (jf6Var) {
                                            jf6Var.b.remove(mm6Var);
                                        }
                                        if (this.a.a(this.b, this.c, arrayList, true)) {
                                            p76Var2 = this.c.j0;
                                            p76Var2.getClass();
                                            this.i = mm6Var;
                                            Socket socket = p76Var.d;
                                            socket.getClass();
                                            ks8.d(socket);
                                        } else {
                                            synchronized (p76Var) {
                                                ry1 ry1Var = this.a;
                                                byte[] bArr2 = ks8.a;
                                                ((ConcurrentLinkedQueue) ry1Var.d).add(p76Var);
                                                ((e28) ry1Var.b).c((f23) ry1Var.c, 0L);
                                                this.c.a(p76Var);
                                            }
                                            p76Var2 = p76Var;
                                        }
                                    }
                                }
                            }
                            p76Var.c(i, i2, i3, this.c);
                            this.c.q0 = null;
                            jf6Var = this.c.X.u0;
                            synchronized (jf6Var) {
                                jf6Var.b.remove(mm6Var);
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    p76Var2 = this.c.j0;
                                    p76Var2.getClass();
                                    this.i = mm6Var;
                                    Socket socket2 = p76Var.d;
                                    socket2.getClass();
                                    ks8.d(socket2);
                                } else {
                                    synchronized (p76Var) {
                                        ry1 ry1Var2 = this.a;
                                        byte[] bArr3 = ks8.a;
                                        ((ConcurrentLinkedQueue) ry1Var2.d).add(p76Var);
                                        ((e28) ry1Var2.b).c((f23) ry1Var2.c, 0L);
                                        this.c.a(p76Var);
                                        p76Var2 = p76Var;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            this.c.q0 = null;
                            throw th2;
                        }
                        arrayList = null;
                        p76Var = new p76(this.a, mm6Var);
                        this.c.q0 = p76Var;
                    }
                } else if (socketG != null) {
                    bt.i("Check failed.");
                    return null;
                }
            } else {
                this.f = 0;
                this.g = 0;
                this.h = 0;
                if (this.a.a(this.b, m76Var, null, false)) {
                    p76Var2 = this.c.j0;
                    p76Var2.getClass();
                } else {
                    mm6Var = this.i;
                    if (mm6Var != null) {
                        this.i = null;
                    } else {
                        b8Var = this.d;
                        if (b8Var == null) {
                        }
                        d7Var = this.e;
                        if (d7Var == null) {
                            j7 j7Var3 = this.b;
                            m76 m76Var3 = this.c;
                            d7Var = new d7(j7Var3, m76Var3.X.u0, m76Var3);
                            this.e = d7Var;
                        }
                        if (d7Var.x()) {
                            bt.n();
                            return null;
                        }
                        arrayList = new ArrayList();
                        while (d7Var.b < ((List) d7Var.f).size()) {
                            j7Var = (j7) d7Var.c;
                            if (d7Var.b < ((List) d7Var.f).size()) {
                                throw new SocketException("No route to " + j7Var.h.d + "; exhausted proxy configurations: " + ((List) d7Var.f));
                            }
                            List list2 = (List) d7Var.f;
                            int i7 = d7Var.b;
                            d7Var.b = i7 + 1;
                            proxy = (Proxy) list2.get(i7);
                            ArrayList arrayList4 = new ArrayList();
                            d7Var.g = arrayList4;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                u23 u23Var4 = j7Var.h;
                                hostAddress = u23Var4.d;
                                port = u23Var4.e;
                            } else {
                                u23 u23Var5 = j7Var.h;
                                hostAddress = u23Var5.d;
                                port = u23Var5.e;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            bw0.d0(arrayList, (ArrayList) d7Var.d);
                            ((ArrayList) d7Var.d).clear();
                        }
                        b8Var2 = new b8(arrayList);
                        this.d = b8Var2;
                        if (!this.c.o0) {
                            u52.s("Canceled");
                            return null;
                        }
                        if (this.a.a(this.b, this.c, arrayList, false)) {
                            p76Var2 = this.c.j0;
                            p76Var2.getClass();
                        } else {
                            if (b8Var2.h()) {
                                bt.n();
                                return null;
                            }
                            int i8 = b8Var2.b;
                            b8Var2.b = i8 + 1;
                            mm6Var = (mm6) arrayList.get(i8);
                            p76Var = new p76(this.a, mm6Var);
                            this.c.q0 = p76Var;
                            p76Var.c(i, i2, i3, this.c);
                            this.c.q0 = null;
                            jf6Var = this.c.X.u0;
                            synchronized (jf6Var) {
                                jf6Var.b.remove(mm6Var);
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    p76Var2 = this.c.j0;
                                    p76Var2.getClass();
                                    this.i = mm6Var;
                                    Socket socket3 = p76Var.d;
                                    socket3.getClass();
                                    ks8.d(socket3);
                                } else {
                                    synchronized (p76Var) {
                                        ry1 ry1Var3 = this.a;
                                        byte[] bArr4 = ks8.a;
                                        ((ConcurrentLinkedQueue) ry1Var3.d).add(p76Var);
                                        ((e28) ry1Var3.b).c((f23) ry1Var3.c, 0L);
                                        this.c.a(p76Var);
                                        p76Var2 = p76Var;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    p76Var = new p76(this.a, mm6Var);
                    this.c.q0 = p76Var;
                    p76Var.c(i, i2, i3, this.c);
                    this.c.q0 = null;
                    jf6Var = this.c.X.u0;
                    synchronized (jf6Var) {
                        jf6Var.b.remove(mm6Var);
                        if (this.a.a(this.b, this.c, arrayList, true)) {
                            p76Var2 = this.c.j0;
                            p76Var2.getClass();
                            this.i = mm6Var;
                            Socket socket4 = p76Var.d;
                            socket4.getClass();
                            ks8.d(socket4);
                        } else {
                            synchronized (p76Var) {
                                ry1 ry1Var4 = this.a;
                                byte[] bArr5 = ks8.a;
                                ((ConcurrentLinkedQueue) ry1Var4.d).add(p76Var);
                                ((e28) ry1Var4.b).c((f23) ry1Var4.c, 0L);
                                this.c.a(p76Var);
                                p76Var2 = p76Var;
                            }
                        }
                    }
                }
            }
            if (p76Var2.i(z)) {
                return p76Var2;
            }
            p76Var2.k();
            if (this.i == null) {
                b8 b8Var4 = this.d;
                if (b8Var4 != null ? b8Var4.h() : true) {
                    continue;
                } else {
                    d7 d7Var2 = this.e;
                    if (!(d7Var2 != null ? d7Var2.x() : true)) {
                        u52.s("exhausted all routes");
                        return null;
                    }
                }
            }
        }
        u52.s("Canceled");
        return null;
    }

    public final void b(IOException iOException) {
        iOException.getClass();
        this.i = null;
        if ((iOException instanceof el7) && ((el7) iOException).X == 8) {
            this.f++;
        } else if (iOException instanceof y11) {
            this.g++;
        } else {
            this.h++;
        }
    }
}
