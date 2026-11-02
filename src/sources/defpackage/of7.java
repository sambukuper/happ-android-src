package defpackage;

import java.io.Closeable;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import libxray.Libxray;
import su.happ.proxyutility.dto.enums.EPingType;
import su.happ.proxyutility.dto.enums.GoPingType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class of7 {
    public static final of7 a = new of7();
    public static final ArrayList b = new ArrayList();
    public static final q15 c = r15.a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(String str, gn2 gn2Var) {
        dn8 rj6Var;
        str.getClass();
        try {
            InetAddress byName = InetAddress.getByName(str);
            byName.getClass();
            fn5 fn5Var = new fn5(byName, new pr2(gn2Var, (byte) 2));
            fn5Var.Z = (byte) 1;
            fn5Var.run();
            rj6Var = dn8.a;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (sj6.a(rj6Var) != null) {
            gn2Var.B(-1L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long e(String str, EPingType ePingType) {
        Long rj6Var;
        long jF;
        str.getClass();
        ePingType.getClass();
        try {
            vz7 vz7Var = n67.a;
            GoPingType goPingType = (GoPingType) wv0.u0(n67.c().e(0, "pref_ping_mode"), GoPingType.a());
            if (goPingType == null) {
                goPingType = GoPingType.DEFAULT;
            }
            int iE = n67.c().e(7, "pref_proxy_ping_timeout");
            int i = kf7.a[ePingType.ordinal()];
            if (i == 1) {
                jF = f(str, jf7.HEAD, goPingType, iE);
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("Ping type " + ePingType + " must not be used here");
                }
                jF = f(str, jf7.GET, goPingType, iE);
            }
            rj6Var = Long.valueOf(jF);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            rj6Var = -1L;
        }
        return rj6Var.longValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long f(String str, jf7 jf7Var, GoPingType goPingType, long j) {
        ss8 ss8Var = ss8.a;
        return Libxray.measureOutboundDelayWithType(str, ss8.h(), jf7Var.X, goPingType.getGoValue(), j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(s51 s51Var) {
        lf7 lf7Var;
        q15 q15Var;
        ArrayList<Socket> arrayList = b;
        if (s51Var instanceof lf7) {
            lf7Var = (lf7) s51Var;
            int i = lf7Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                lf7Var.i0 = i - Integer.MIN_VALUE;
            } else {
                lf7Var = new lf7(this, s51Var);
            }
        } else {
            lf7Var = new lf7(this, s51Var);
        }
        Object obj = lf7Var.g0;
        int i2 = lf7Var.i0;
        if (i2 == 0) {
            w39.n0(obj);
            q15Var = c;
            lf7Var.f0 = q15Var;
            lf7Var.i0 = 1;
            Object objG = q15Var.g(lf7Var);
            c71 c71Var = c71.X;
            if (objG == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q15Var = lf7Var.f0;
            w39.n0(obj);
        }
        try {
            for (Socket socket : arrayList) {
                if (socket != null) {
                    socket.close();
                }
            }
            arrayList.clear();
            return dn8.a;
        } finally {
            q15Var.m((Object) null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x003b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x00af */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(String str, int i, s51 s51Var) throws Throwable {
        mf7 mf7Var;
        Long rj6Var;
        Closeable closeable;
        Throwable th;
        Socket socket;
        String str2;
        q15 q15Var;
        Closeable closeable2;
        long jCurrentTimeMillis;
        long j;
        Socket socket2;
        if (s51Var instanceof mf7) {
            mf7Var = (mf7) s51Var;
            int i2 = mf7Var.o0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mf7Var.o0 = i2 - Integer.MIN_VALUE;
            } else {
                mf7Var = new mf7(this, s51Var);
            }
        } else {
            mf7Var = new mf7(this, s51Var);
        }
        Object obj = mf7Var.m0;
        int i3 = mf7Var.o0;
        ArrayList arrayList = b;
        q15 q15Var2 = c;
        c71 c71Var = c71.X;
        try {
            if (i3 == 0) {
                w39.n0(obj);
                try {
                    Socket socket3 = SocketChannel.open().socket();
                    try {
                        mf7Var.f0 = str;
                        mf7Var.g0 = socket3;
                        mf7Var.h0 = socket3;
                        mf7Var.i0 = q15Var2;
                        mf7Var.j0 = i;
                        mf7Var.k0 = 0;
                        mf7Var.o0 = 1;
                        if (q15Var2.g(mf7Var) != c71Var) {
                            socket = socket3;
                            str2 = str;
                            q15Var = q15Var2;
                            i3 = 0;
                            closeable2 = socket3;
                            arrayList.add(socket);
                            q15Var.m((Object) null);
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            socket.connect(new InetSocketAddress(str2, i), 3000);
                            jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                            mf7Var.f0 = null;
                            mf7Var.g0 = closeable2;
                            mf7Var.h0 = socket;
                            mf7Var.i0 = q15Var2;
                            mf7Var.j0 = i;
                            mf7Var.k0 = i3;
                            mf7Var.l0 = jCurrentTimeMillis;
                            mf7Var.o0 = 2;
                            if (q15Var2.g(mf7Var) != c71Var) {
                                closeable = closeable2;
                                j = jCurrentTimeMillis;
                                socket2 = socket;
                                arrayList.remove(socket2);
                                q15Var2.m((Object) null);
                                oc.h(closeable, (Throwable) null);
                                rj6Var = new Long(j);
                            }
                        }
                        return c71Var;
                    } catch (Throwable th2) {
                        closeable = socket3;
                        th = th2;
                        i3 = 0;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i3 = 0;
                    if (i3 != 0 && !fm7.d0(gv3.W(th), "util.protection", false)) {
                        th.printStackTrace();
                    }
                    if (!(th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    rj6Var = new rj6(th);
                }
            } else {
                if (i3 == 1) {
                    i3 = mf7Var.k0;
                    i = mf7Var.j0;
                    q15Var = mf7Var.i0;
                    Socket socket4 = mf7Var.h0;
                    Closeable closeable3 = mf7Var.g0;
                    str2 = mf7Var.f0;
                    try {
                        w39.n0(obj);
                        closeable2 = closeable3;
                        socket = socket4;
                        try {
                            try {
                                arrayList.add(socket);
                                q15Var.m((Object) null);
                                long jCurrentTimeMillis3 = System.currentTimeMillis();
                                socket.connect(new InetSocketAddress(str2, i), 3000);
                                jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis3;
                                mf7Var.f0 = null;
                                mf7Var.g0 = closeable2;
                                mf7Var.h0 = socket;
                                mf7Var.i0 = q15Var2;
                                mf7Var.j0 = i;
                                mf7Var.k0 = i3;
                                mf7Var.l0 = jCurrentTimeMillis;
                                mf7Var.o0 = 2;
                                if (q15Var2.g(mf7Var) != c71Var) {
                                    closeable = closeable2;
                                    j = jCurrentTimeMillis;
                                    socket2 = socket;
                                    arrayList.remove(socket2);
                                    q15Var2.m((Object) null);
                                    oc.h(closeable, (Throwable) null);
                                    rj6Var = new Long(j);
                                }
                                return c71Var;
                            } catch (Throwable th4) {
                                closeable = closeable2;
                                th = th4;
                                throw th;
                            }
                        } catch (Throwable th5) {
                            q15Var.m((Object) null);
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        closeable = closeable3;
                        throw th;
                    }
                }
                if (i3 != 2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = mf7Var.l0;
                i3 = mf7Var.k0;
                q15Var2 = mf7Var.i0;
                Socket socket5 = mf7Var.h0;
                closeable = mf7Var.g0;
                try {
                    w39.n0(obj);
                    closeable = closeable;
                    socket2 = socket5;
                    try {
                        arrayList.remove(socket2);
                        q15Var2.m((Object) null);
                        oc.h(closeable, (Throwable) null);
                        rj6Var = new Long(j);
                    } catch (Throwable th7) {
                        q15Var2.m((Object) null);
                        throw th7;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    try {
                        throw th;
                    } catch (Throwable th9) {
                        oc.h(closeable, th);
                        throw th9;
                    }
                }
            }
        } catch (Throwable th10) {
            th = th10;
            if (i3 != 0) {
                th.printStackTrace();
            }
            if (th instanceof InterruptedException) {
            }
            throw th;
        }
        return rj6Var instanceof rj6 ? new Long(-1L) : rj6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0059 -> B:12:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(java.lang.String r11, int r12, s51 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.nf7
            if (r0 == 0) goto L13
            r0 = r13
            nf7 r0 = (defpackage.nf7) r0
            int r1 = r0.l0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l0 = r1
            goto L18
        L13:
            nf7 r0 = new nf7
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.j0
            int r1 = r0.l0
            r2 = -1
            r4 = 1
            if (r1 == 0) goto L3a
            if (r1 != r4) goto L33
            int r11 = r0.h0
            long r5 = r0.i0
            int r12 = r0.g0
            java.lang.String r1 = r0.f0
            w39.n0(r13)
            r9 = r0
            r0 = r12
            r12 = r1
        L31:
            r1 = r9
            goto L5d
        L33:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            bt.i(r10)
            r10 = 0
            return r10
        L3a:
            w39.n0(r13)
            r13 = 0
            r5 = r12
            r12 = r11
            r11 = r13
            r13 = r5
            r5 = r2
        L43:
            r1 = 2
            if (r11 >= r1) goto L80
            r0.f0 = r12
            r0.g0 = r13
            r0.i0 = r5
            r0.h0 = r11
            r0.l0 = r4
            java.io.Serializable r1 = r10.c(r12, r13, r0)
            c71 r7 = c71.X
            if (r1 != r7) goto L59
            return r7
        L59:
            r9 = r0
            r0 = r13
            r13 = r1
            goto L31
        L5d:
            java.lang.Number r13 = (java.lang.Number) r13
            long r7 = r13.longValue()
            s61 r13 = r1.Y
            r13.getClass()
            boolean r13 = u70.X(r13)
            if (r13 != 0) goto L6f
            goto L80
        L6f:
            int r13 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r13 == 0) goto L7c
            int r13 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r13 == 0) goto L7b
            int r13 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r13 >= 0) goto L7c
        L7b:
            r5 = r7
        L7c:
            int r11 = r11 + r4
            r13 = r0
            r0 = r1
            goto L43
        L80:
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of7.d(java.lang.String, int, s51):java.lang.Object");
    }
}
