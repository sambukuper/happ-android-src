package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k23 implements Closeable {
    public static final Logger f0;
    public final ba0 X;
    public final j23 Y;
    public final k13 Z;

    static {
        Logger logger = Logger.getLogger(s13.class.getName());
        logger.getClass();
        f0 = logger;
    }

    public k23(j76 j76Var) {
        j76Var.getClass();
        this.X = j76Var;
        j23 j23Var = new j23(j76Var);
        this.Y = j23Var;
        this.Z = new k13(j23Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.X.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g(boolean z, c3 c3Var) throws IOException {
        int i;
        boolean z2;
        int i2;
        Object[] array;
        boolean z3 = false;
        try {
            this.X.T0(9L);
            int iQ = ks8.q(this.X);
            if (iQ > 16384) {
                u52.s(pc6.j(iQ, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int i3 = this.X.readByte() & 255;
            byte b = this.X.readByte();
            int i4 = b & 255;
            int i5 = this.X.readInt();
            int i6 = i5 & Integer.MAX_VALUE;
            Logger logger = f0;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(s13.a(true, i6, iQ, i3, i4));
            }
            if (z && i3 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = s13.b;
                sb.append(i3 < strArr.length ? strArr[i3] : ks8.g("0x%02x", Integer.valueOf(i3)));
                throw new IOException(sb.toString());
            }
            byte b2 = 2;
            switch (i3) {
                case 0:
                    k(c3Var, iQ, i4, i6);
                    return true;
                case 1:
                    p(c3Var, iQ, i4, i6);
                    return true;
                case 2:
                    if (iQ != 5) {
                        u52.s(ie2.h("TYPE_PRIORITY length: ", iQ, " != 5"));
                        return false;
                    }
                    if (i6 == 0) {
                        u52.s("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    ba0 ba0Var = this.X;
                    ba0Var.readInt();
                    ba0Var.readByte();
                    return true;
                case 3:
                    if (iQ != 4) {
                        u52.s(ie2.h("TYPE_RST_STREAM length: ", iQ, " != 4"));
                        return false;
                    }
                    if (i6 == 0) {
                        u52.s("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int i7 = this.X.readInt();
                    int[] iArrG = p61.G(14);
                    int length = iArrG.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            int i9 = iArrG[i8];
                            if (oi0.d(i9) == i7) {
                                i = i9;
                            } else {
                                i8++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        u52.s(pc6.j(i7, "TYPE_RST_STREAM unexpected error code: "));
                        return false;
                    }
                    h23 h23Var = (h23) c3Var.Z;
                    if (i6 != 0 && (i5 & 1) == 0) {
                        h23Var.k0.c(new c23(h23Var.Z + '[' + i6 + "] onReset", h23Var, i6, i, (byte) 1), 0L);
                        return true;
                    }
                    o23 o23VarM = h23Var.m(i6);
                    if (o23VarM == null) {
                        return true;
                    }
                    synchronized (o23VarM) {
                        try {
                            if (i == 0) {
                                throw null;
                            }
                            if (o23VarM.m == 0) {
                                o23VarM.m = i;
                                o23VarM.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 4:
                    ba0 ba0Var2 = this.X;
                    if (i6 != 0) {
                        u52.s("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((b & 1) == 0) {
                        if (iQ % 6 != 0) {
                            u52.s(pc6.j(iQ, "TYPE_SETTINGS length % 6 != 0: "));
                            return false;
                        }
                        t57 t57Var = new t57();
                        if3 if3VarW = x97.W(x97.a0(0, iQ), 6);
                        int i10 = if3VarW.X;
                        int i11 = if3VarW.Y;
                        int i12 = if3VarW.Z;
                        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                            while (true) {
                                short s = ba0Var2.readShort();
                                byte[] bArr = ks8.a;
                                int i13 = s & 65535;
                                int i14 = ba0Var2.readInt();
                                if (i13 == 2) {
                                    z2 = z3;
                                    if (i14 != 0 && i14 != 1) {
                                        u52.s("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        return z2;
                                    }
                                } else if (i13 == 3) {
                                    z2 = z3;
                                    i13 = 4;
                                } else if (i13 == 4) {
                                    z2 = z3;
                                    if (i14 < 0) {
                                        u52.s("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        return z2;
                                    }
                                    i13 = 7;
                                } else if (i13 != 5) {
                                    z2 = z3;
                                } else {
                                    z2 = z3;
                                    if (i14 < 16384 || i14 > 16777215) {
                                        u52.s(pc6.j(i14, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                        return z2;
                                    }
                                }
                                t57Var.b(i13, i14);
                                if (i10 != i11) {
                                    i10 += i12;
                                    z3 = z2;
                                }
                            }
                        }
                        h23 h23Var2 = (h23) c3Var.Z;
                        h23Var2.j0.c(new b23(oi0.p(new StringBuilder(), h23Var2.Z, " applyAndAckSettings"), c3Var, t57Var, b2), 0L);
                        return true;
                    }
                    if (iQ != 0) {
                        u52.s("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    break;
                case 5:
                    u(c3Var, iQ, i4, i6);
                    return true;
                case 6:
                    if (iQ != 8) {
                        u52.s(pc6.j(iQ, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i6 != 0) {
                        u52.s("TYPE_PING streamId != 0");
                        return false;
                    }
                    int i15 = this.X.readInt();
                    int i16 = this.X.readInt();
                    Object[] objArr = (b & 1) != 0 ? 1 : 0;
                    h23 h23Var3 = (h23) c3Var.Z;
                    if (objArr == 0) {
                        h23Var3.j0.c(new c23(oi0.p(new StringBuilder(), ((h23) c3Var.Z).Z, " ping"), (h23) c3Var.Z, i15, i16, (byte) 0), 0L);
                        return true;
                    }
                    synchronized (h23Var3) {
                        try {
                            if (i15 == 1) {
                                h23Var3.n0++;
                            } else if (i15 == 2) {
                                h23Var3.p0++;
                            } else if (i15 == 3) {
                                h23Var3.notifyAll();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return true;
                case 7:
                    if (iQ < 8) {
                        u52.s(pc6.j(iQ, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i6 != 0) {
                        u52.s("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int i17 = this.X.readInt();
                    int i18 = this.X.readInt();
                    int i19 = iQ - 8;
                    int[] iArrG2 = p61.G(14);
                    int length2 = iArrG2.length;
                    int i20 = 0;
                    while (true) {
                        if (i20 < length2) {
                            i2 = iArrG2[i20];
                            if (oi0.d(i2) != i18) {
                                i20++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        u52.s(pc6.j(i18, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    kb0 kb0VarS = kb0.f0;
                    if (i19 > 0) {
                        kb0VarS = this.X.s(i19);
                    }
                    kb0VarS.getClass();
                    kb0VarS.e();
                    h23 h23Var4 = (h23) c3Var.Z;
                    synchronized (h23Var4) {
                        array = h23Var4.Y.values().toArray(new o23[0]);
                        h23Var4.h0 = true;
                    }
                    for (o23 o23Var : (o23[]) array) {
                        if (o23Var.a > i17 && o23Var.f()) {
                            synchronized (o23Var) {
                                if (o23Var.m == 0) {
                                    o23Var.m = 8;
                                    o23Var.notifyAll();
                                }
                                break;
                            }
                            ((h23) c3Var.Z).m(o23Var.a);
                        }
                    }
                    break;
                    break;
                case 8:
                    if (iQ != 4) {
                        u52.s(pc6.j(iQ, "TYPE_WINDOW_UPDATE length !=4: "));
                        return false;
                    }
                    long j = 2147483647L & ((long) this.X.readInt());
                    if (j == 0) {
                        u52.s("windowSizeIncrement was 0");
                        return false;
                    }
                    h23 h23Var5 = (h23) c3Var.Z;
                    if (i6 == 0) {
                        synchronized (h23Var5) {
                            h23Var5.w0 += j;
                            h23Var5.notifyAll();
                        }
                        return true;
                    }
                    o23 o23VarK = h23Var5.k(i6);
                    if (o23VarK != null) {
                        synchronized (o23VarK) {
                            o23VarK.f += j;
                            if (j > 0) {
                                o23VarK.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    break;
                default:
                    this.X.skip(iQ);
                    return true;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void k(c3 c3Var, int i, int i2, int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        if (i3 == 0) {
            u52.s("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        boolean z3 = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            u52.s("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.X.readByte();
            byte[] bArr = ks8.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int iV = os4.v(i, i2, i4);
        ba0 ba0Var = this.X;
        h23 h23Var = (h23) c3Var.Z;
        if (i3 != 0 && (i3 & 1) == 0) {
            i90 i90Var = new i90();
            long j = iV;
            ba0Var.T0(j);
            ba0Var.read(i90Var, j);
            h23Var.k0.c(new d23(h23Var.Z + '[' + i3 + "] onData", h23Var, i3, i90Var, iV, z3), 0L);
        } else {
            o23 o23VarK = h23Var.k(i3);
            if (o23VarK == null) {
                ((h23) c3Var.Z).D(i3, 2);
                long j2 = iV;
                ((h23) c3Var.Z).u(j2);
                ba0Var.skip(j2);
            } else {
                byte[] bArr2 = ks8.a;
                m23 m23Var = o23VarK.i;
                long j3 = iV;
                m23Var.getClass();
                long j4 = j3;
                while (true) {
                    o23 o23Var = m23Var.h0;
                    if (j4 <= 0) {
                        byte[] bArr3 = ks8.a;
                        o23Var.b.u(j3);
                        break;
                    }
                    synchronized (o23Var) {
                        z = m23Var.Y;
                        z2 = m23Var.f0.Y + j4 > m23Var.X;
                    }
                    if (z2) {
                        ba0Var.skip(j4);
                        m23Var.h0.e(4);
                        break;
                    }
                    if (z) {
                        ba0Var.skip(j4);
                        break;
                    }
                    long j5 = ba0Var.read(m23Var.Z, j4);
                    if (j5 == -1) {
                        throw new EOFException();
                    }
                    j4 -= j5;
                    o23 o23Var2 = m23Var.h0;
                    synchronized (o23Var2) {
                        try {
                            if (m23Var.g0) {
                                m23Var.Z.g();
                            } else {
                                i90 i90Var2 = m23Var.f0;
                                boolean z4 = i90Var2.Y == 0;
                                i90Var2.M(m23Var.Z);
                                if (z4) {
                                    o23Var2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    o23VarK.h(ks8.b, true);
                }
            }
        }
        this.X.skip(i4);
    }

    public final List m(int i, int i2, int i3, int i4) throws IOException {
        j23 j23Var = this.Y;
        j23Var.g0 = i;
        j23Var.Y = i;
        j23Var.h0 = i2;
        j23Var.Z = i3;
        j23Var.f0 = i4;
        k13 k13Var = this.Z;
        j76 j76Var = k13Var.c;
        ArrayList arrayList = k13Var.b;
        while (!j76Var.F()) {
            byte b = j76Var.readByte();
            byte[] bArr = ks8.a;
            int i5 = b & 255;
            if (i5 == 128) {
                u52.s("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iE = k13Var.e(i5, 127);
                int i6 = iE - 1;
                if (i6 >= 0) {
                    kz2[] kz2VarArr = m13.a;
                    if (i6 <= kz2VarArr.length - 1) {
                        arrayList.add(kz2VarArr[i6]);
                    }
                }
                int length = k13Var.e + 1 + (i6 - m13.a.length);
                if (length >= 0) {
                    kz2[] kz2VarArr2 = k13Var.d;
                    if (length < kz2VarArr2.length) {
                        kz2 kz2Var = kz2VarArr2[length];
                        kz2Var.getClass();
                        arrayList.add(kz2Var);
                    }
                }
                u52.s(pc6.j(iE, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                kz2[] kz2VarArr3 = m13.a;
                kb0 kb0VarD = k13Var.d();
                m13.a(kb0VarD);
                k13Var.c(new kz2(kb0VarD, k13Var.d()));
            } else if ((b & 64) == 64) {
                k13Var.c(new kz2(k13Var.b(k13Var.e(i5, 63) - 1), k13Var.d()));
            } else if ((b & 32) == 32) {
                int iE2 = k13Var.e(i5, 31);
                k13Var.a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    u52.h(k13Var.a, "Invalid dynamic table size update ");
                    return null;
                }
                int i7 = k13Var.g;
                if (iE2 < i7) {
                    if (iE2 == 0) {
                        kz2[] kz2VarArr4 = k13Var.d;
                        eu.m0(0, kz2VarArr4.length, null, kz2VarArr4);
                        k13Var.e = k13Var.d.length - 1;
                        k13Var.f = 0;
                        k13Var.g = 0;
                    } else {
                        k13Var.a(i7 - iE2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                kz2[] kz2VarArr5 = m13.a;
                kb0 kb0VarD2 = k13Var.d();
                m13.a(kb0VarD2);
                arrayList.add(new kz2(kb0VarD2, k13Var.d()));
            } else {
                arrayList.add(new kz2(k13Var.b(k13Var.e(i5, 15) - 1), k13Var.d()));
            }
        }
        List listY0 = wv0.Y0(arrayList);
        arrayList.clear();
        return listY0;
    }

    public final void p(c3 c3Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            u52.s("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        byte b = 1;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b2 = this.X.readByte();
            byte[] bArr = ks8.a;
            i4 = b2 & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            ba0 ba0Var = this.X;
            ba0Var.readInt();
            ba0Var.readByte();
            byte[] bArr2 = ks8.a;
            i -= 5;
        }
        List listM = m(os4.v(i, i2, i4), i4, i2, i3);
        h23 h23Var = (h23) c3Var.Z;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            h23Var.k0.c(new e23(h23Var.Z + '[' + i3 + "] onHeaders", h23Var, i3, listM, z2), 0L);
            return;
        }
        synchronized (h23Var) {
            o23 o23VarK = h23Var.k(i3);
            if (o23VarK != null) {
                o23VarK.h(ks8.s(listM), z2);
                return;
            }
            if (h23Var.h0) {
                return;
            }
            if (i3 <= h23Var.f0) {
                return;
            }
            if (i3 % 2 == h23Var.g0 % 2) {
                return;
            }
            o23 o23Var = new o23(i3, h23Var, false, z2, ks8.s(listM));
            h23Var.f0 = i3;
            h23Var.Y.put(Integer.valueOf(i3), o23Var);
            h23Var.i0.d().c(new b23(h23Var.Z + '[' + i3 + "] onStream", h23Var, o23Var, b), 0L);
        }
    }

    public final void u(c3 c3Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            u52.s("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte b = this.X.readByte();
            byte[] bArr = ks8.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i5 = this.X.readInt() & Integer.MAX_VALUE;
        List listM = m(os4.v(i - 4, i2, i4), i4, i2, i3);
        h23 h23Var = (h23) c3Var.Z;
        synchronized (h23Var) {
            if (h23Var.A0.contains(Integer.valueOf(i5))) {
                h23Var.D(i5, 2);
                return;
            }
            h23Var.A0.add(Integer.valueOf(i5));
            h23Var.k0.c(new e23(h23Var.Z + '[' + i5 + "] onRequest", h23Var, i5, listM), 0L);
        }
    }
}
