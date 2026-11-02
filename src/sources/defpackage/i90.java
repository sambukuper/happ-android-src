package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i90 implements ba0, aa0, Cloneable, ByteChannel {
    public mz6 X;
    public long Y;

    @Override // defpackage.ba0
    public final byte[] B() {
        return D0(this.Y);
    }

    public final void B0(ba0 ba0Var, long j) throws EOFException {
        while (j > 0) {
            long j2 = ba0Var.read(this, j);
            if (j2 == -1) {
                throw new EOFException();
            }
            j -= j2;
        }
    }

    public final long C(byte b, long j, long j2) {
        mz6 mz6Var;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j3 || j3 > j4) {
            throw new IllegalArgumentException(("size=" + this.Y + " fromIndex=" + j3 + " toIndex=" + j4).toString());
        }
        long j6 = this.Y;
        if (j4 > j6) {
            j4 = j6;
        }
        long j7 = -1;
        if (j3 == j4 || (mz6Var = this.X) == null) {
            return -1L;
        }
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                mz6Var = mz6Var.g;
                mz6Var.getClass();
                j6 -= (long) (mz6Var.c - mz6Var.b);
            }
            while (j6 < j4) {
                byte[] bArr = mz6Var.a;
                long j8 = j7;
                int iMin = (int) Math.min(mz6Var.c, (((long) mz6Var.b) + j4) - j6);
                for (int i = (int) ((((long) mz6Var.b) + j3) - j6); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - mz6Var.b)) + j6;
                    }
                }
                j6 += (long) (mz6Var.c - mz6Var.b);
                mz6Var = mz6Var.f;
                mz6Var.getClass();
                j7 = j8;
                j3 = j6;
            }
            return j7;
        }
        while (true) {
            long j9 = ((long) (mz6Var.c - mz6Var.b)) + j5;
            if (j9 > j3) {
                break;
            }
            mz6Var = mz6Var.f;
            mz6Var.getClass();
            j5 = j9;
        }
        while (j5 < j4) {
            byte[] bArr2 = mz6Var.a;
            int iMin2 = (int) Math.min(mz6Var.c, (((long) mz6Var.b) + j4) - j5);
            for (int i2 = (int) ((((long) mz6Var.b) + j3) - j5); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - mz6Var.b)) + j5;
                }
            }
            j5 += (long) (mz6Var.c - mz6Var.b);
            mz6Var = mz6Var.f;
            mz6Var.getClass();
            j3 = j5;
        }
        return -1L;
    }

    public final void C0(kb0 kb0Var) {
        kb0Var.getClass();
        kb0Var.u(kb0Var.e(), this);
    }

    public final long D(kb0 kb0Var) {
        int i;
        int i2;
        kb0Var.getClass();
        mz6 mz6Var = this.X;
        if (mz6Var == null) {
            return -1L;
        }
        long j = this.Y;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                mz6Var = mz6Var.g;
                mz6Var.getClass();
                j -= (long) (mz6Var.c - mz6Var.b);
            }
            if (kb0Var.e() == 2) {
                byte bJ = kb0Var.j(0);
                byte bJ2 = kb0Var.j(1);
                while (j < this.Y) {
                    byte[] bArr = mz6Var.a;
                    i = (int) ((((long) mz6Var.b) + j2) - j);
                    int i3 = mz6Var.c;
                    while (true) {
                        if (i >= i3) {
                            j2 = ((long) (mz6Var.c - mz6Var.b)) + j;
                            mz6Var = mz6Var.f;
                            mz6Var.getClass();
                            j = j2;
                        } else {
                            byte b = bArr[i];
                            if (b == bJ || b == bJ2) {
                                i2 = mz6Var.b;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrI = kb0Var.i();
            while (j < this.Y) {
                byte[] bArr2 = mz6Var.a;
                i = (int) ((((long) mz6Var.b) + j2) - j);
                int i4 = mz6Var.c;
                while (true) {
                    if (i < i4) {
                        byte b2 = bArr2[i];
                        int length = bArrI.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                i++;
                            } else if (b2 == bArrI[i5]) {
                                i2 = mz6Var.b;
                            } else {
                                i5++;
                            }
                        }
                    } else {
                        j2 = ((long) (mz6Var.c - mz6Var.b)) + j;
                        mz6Var = mz6Var.f;
                        mz6Var.getClass();
                        j = j2;
                    }
                }
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = ((long) (mz6Var.c - mz6Var.b)) + j;
            if (j3 > 0) {
                break;
            }
            mz6Var = mz6Var.f;
            mz6Var.getClass();
            j = j3;
        }
        if (kb0Var.e() == 2) {
            byte bJ3 = kb0Var.j(0);
            byte bJ4 = kb0Var.j(1);
            while (j < this.Y) {
                byte[] bArr3 = mz6Var.a;
                i = (int) ((((long) mz6Var.b) + j2) - j);
                int i6 = mz6Var.c;
                while (true) {
                    if (i >= i6) {
                        j2 = ((long) (mz6Var.c - mz6Var.b)) + j;
                        mz6Var = mz6Var.f;
                        mz6Var.getClass();
                        j = j2;
                    } else {
                        byte b3 = bArr3[i];
                        if (b3 == bJ3 || b3 == bJ4) {
                            i2 = mz6Var.b;
                        } else {
                            i++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrI2 = kb0Var.i();
        while (j < this.Y) {
            byte[] bArr4 = mz6Var.a;
            i = (int) ((((long) mz6Var.b) + j2) - j);
            int i7 = mz6Var.c;
            while (true) {
                if (i < i7) {
                    byte b4 = bArr4[i];
                    int length2 = bArrI2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            i++;
                        } else if (b4 == bArrI2[i8]) {
                            i2 = mz6Var.b;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    j2 = ((long) (mz6Var.c - mz6Var.b)) + j;
                    mz6Var = mz6Var.f;
                    mz6Var.getClass();
                    j = j2;
                }
            }
        }
        return -1L;
        return ((long) (i - i2)) + j;
    }

    @Override // defpackage.ba0
    public final byte[] D0(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            em7.c(ie2.f(j, "byteCount: "));
            return null;
        }
        if (this.Y < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // defpackage.ba0
    public final boolean F() {
        return this.Y == 0;
    }

    @Override // defpackage.ba0
    public final int H(od5 od5Var) throws EOFException {
        od5Var.getClass();
        int iD = b.d(this, od5Var, false);
        if (iD == -1) {
            return -1;
        }
        skip(od5Var.X[iD].e());
        return iD;
    }

    public final void H0(int i) {
        mz6 mz6VarU0 = u0(1);
        byte[] bArr = mz6VarU0.a;
        int i2 = mz6VarU0.c;
        mz6VarU0.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.Y++;
    }

    public final boolean J(int i, kb0 kb0Var, long j) {
        kb0Var.getClass();
        if (i >= 0 && j >= 0 && ((long) i) + j <= this.Y && i <= kb0Var.e()) {
            return i == 0 || b.a(this, kb0Var, j, j + 1, i) != -1;
        }
        return false;
    }

    public final void J0(long j) {
        boolean z;
        if (j == 0) {
            H0(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                d1("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = b.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > b.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        mz6 mz6VarU0 = u0(i);
        byte[] bArr2 = mz6VarU0.a;
        int i2 = mz6VarU0.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        mz6VarU0.c += i;
        this.Y += (long) i;
    }

    @Override // defpackage.aa0
    public final long M(je7 je7Var) {
        je7Var.getClass();
        long j = 0;
        while (true) {
            long j2 = je7Var.read(this, 8192L);
            if (j2 == -1) {
                return j;
            }
            j += j2;
        }
    }

    @Override // defpackage.aa0
    public final /* bridge */ /* synthetic */ aa0 N0(int i, int i2, byte[] bArr) {
        write(bArr, i, i2);
        return this;
    }

    @Override // defpackage.ba0
    public final long P() throws EOFException {
        long j;
        byte b;
        long j2 = 0;
        if (this.Y == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j3 = 0;
        long j4 = -7;
        boolean z2 = false;
        loop0: while (true) {
            mz6 mz6Var = this.X;
            mz6Var.getClass();
            byte[] bArr = mz6Var.a;
            int i2 = mz6Var.b;
            int i3 = mz6Var.c;
            while (true) {
                if (i2 >= i3) {
                    j = j2;
                    break;
                }
                b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j3 < -922337203685477580L) {
                        break loop0;
                    }
                    j = j2;
                    if (j3 == -922337203685477580L && i4 < j4) {
                        break loop0;
                    }
                    j3 = (j3 * 10) + ((long) i4);
                } else {
                    j = j2;
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j4--;
                    z = true;
                }
                i2++;
                i++;
                j2 = j;
            }
            if (i2 == i3) {
                this.X = mz6Var.a();
                pz6.a(mz6Var);
            } else {
                mz6Var.b = i2;
            }
            if (z2 || this.X == null) {
                long j5 = this.Y - ((long) i);
                this.Y = j5;
                if (i >= (z ? 2 : 1)) {
                    return z ? j3 : -j3;
                }
                if (j5 == j) {
                    throw new EOFException();
                }
                String str = z ? "Expected a digit" : "Expected a digit or '-'";
                long j6 = j;
                bt.j(str, " but was 0x", os4.Q(u(j6)));
                return j6;
            }
            j2 = j;
        }
        i90 i90Var = new i90();
        i90Var.J0(j3);
        i90Var.H0(b);
        if (!z) {
            i90Var.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(i90Var.Y()));
    }

    @Override // defpackage.aa0
    public final /* bridge */ /* synthetic */ aa0 P0(kb0 kb0Var) {
        C0(kb0Var);
        return this;
    }

    public final void R(g90 g90Var) {
        g90Var.getClass();
        byte[] bArr = b.a;
        if (g90Var.X != null) {
            bt.i("already attached to a buffer");
        } else {
            g90Var.X = this;
            g90Var.Y = true;
        }
    }

    @Override // defpackage.ba0
    public final long S(long j, kb0 kb0Var) {
        kb0Var.getClass();
        byte[] bArr = b.a;
        return b.a(this, kb0Var, 0L, j, kb0Var.e());
    }

    @Override // defpackage.ba0
    public final void T0(long j) throws EOFException {
        if (this.Y < j) {
            throw new EOFException();
        }
    }

    public final short U() throws EOFException {
        short s = readShort();
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    @Override // defpackage.aa0
    public final /* bridge */ /* synthetic */ aa0 U0(long j) {
        J0(j);
        return this;
    }

    @Override // defpackage.ba0
    public final String V(long j) throws EOFException {
        if (j < 0) {
            em7.c(ie2.f(j, "limit < 0: "));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jC = C((byte) 10, 0L, j2);
        if (jC != -1) {
            return b.c(this, jC);
        }
        if (j2 < this.Y && u(j2 - 1) == 13 && u(j2) == 10) {
            return b.c(this, j2);
        }
        i90 i90Var = new i90();
        p(i90Var, 0L, Math.min(32L, this.Y));
        throw new EOFException("\\n not found: limit=" + Math.min(this.Y, j) + " content=" + i90Var.s(i90Var.Y).f() + (char) 8230);
    }

    public final void V0(long j) {
        if (j == 0) {
            H0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        mz6 mz6VarU0 = u0(i);
        byte[] bArr = mz6VarU0.a;
        int i2 = mz6VarU0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        mz6VarU0.c += i;
        this.Y += (long) i;
    }

    @Override // defpackage.ba0
    public final long W0() throws EOFException {
        int i;
        if (this.Y == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            mz6 mz6Var = this.X;
            mz6Var.getClass();
            byte[] bArr = mz6Var.a;
            int i3 = mz6Var.b;
            int i4 = mz6Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(os4.Q(b)));
                        }
                        z = true;
                        break;
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    i90 i90Var = new i90();
                    i90Var.V0(j);
                    i90Var.H0(b);
                    throw new NumberFormatException("Number too large: ".concat(i90Var.Y()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.X = mz6Var.a();
                pz6.a(mz6Var);
            } else {
                mz6Var.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.X != null);
        this.Y -= (long) i2;
        return j;
    }

    public final String X(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            em7.c(ie2.f(j, "byteCount: "));
            return null;
        }
        if (this.Y < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        mz6 mz6Var = this.X;
        mz6Var.getClass();
        int i = mz6Var.b;
        if (((long) i) + j > mz6Var.c) {
            return new String(D0(j), charset);
        }
        int i2 = (int) j;
        String str = new String(mz6Var.a, i, i2, charset);
        int i3 = mz6Var.b + i2;
        mz6Var.b = i3;
        this.Y -= j;
        if (i3 == mz6Var.c) {
            this.X = mz6Var.a();
            pz6.a(mz6Var);
        }
        return str;
    }

    public final String Y() {
        return X(this.Y, iq0.a);
    }

    @Override // defpackage.ba0
    public final InputStream Y0() {
        return new h90(this, (byte) 0);
    }

    @Override // defpackage.ba0
    public final long Z(aa0 aa0Var) {
        long j = this.Y;
        if (j > 0) {
            aa0Var.write(this, j);
        }
        return j;
    }

    public final void Z0(int i) {
        mz6 mz6VarU0 = u0(4);
        byte[] bArr = mz6VarU0.a;
        int i2 = mz6VarU0.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        mz6VarU0.c = i2 + 4;
        this.Y += 4;
    }

    public final int a0() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.Y == 0) {
            throw new EOFException();
        }
        byte bU = u(0L);
        if ((bU & 128) == 0) {
            i = bU & 127;
            i3 = 0;
            i2 = 1;
        } else if ((bU & 224) == 192) {
            i = bU & 31;
            i2 = 2;
            i3 = 128;
        } else if ((bU & 240) == 224) {
            i = bU & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((bU & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i = bU & 7;
            i2 = 4;
            i3 = DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        long j = i2;
        if (this.Y < j) {
            StringBuilder sbL = ie2.l("size < ", i2, ": ");
            sbL.append(this.Y);
            sbL.append(" (to read code point prefixed 0x");
            sbL.append(os4.Q(bU));
            sbL.append(')');
            throw new EOFException(sbL.toString());
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte bU2 = u(j2);
            if ((bU2 & 192) != 128) {
                skip(j2);
                return 65533;
            }
            i = (i << 6) | (bU2 & 63);
        }
        skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public final void a1(int i) {
        mz6 mz6VarU0 = u0(2);
        byte[] bArr = mz6VarU0.a;
        int i2 = mz6VarU0.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        mz6VarU0.c = i2 + 2;
        this.Y += 2;
    }

    public final void b1(String str, int i, int i2, Charset charset) {
        str.getClass();
        if (i < 0) {
            em7.c(pc6.j(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            em7.c(pc6.m("endIndex < beginIndex: ", i2, i, " < "));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder sbL = ie2.l("endIndex > string.length: ", i2, " > ");
            sbL.append(str.length());
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        if (charset.equals(iq0.a)) {
            c1(i, i2, str);
            return;
        }
        byte[] bytes = str.substring(i, i2).getBytes(charset);
        bytes.getClass();
        write(bytes, 0, bytes.length);
    }

    public final kb0 c0(int i) {
        if (i == 0) {
            return kb0.f0;
        }
        os4.i(this.Y, 0L, i);
        mz6 mz6Var = this.X;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            mz6Var.getClass();
            int i5 = mz6Var.c;
            int i6 = mz6Var.b;
            if (i5 == i6) {
                bt.g("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            mz6Var = mz6Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        mz6 mz6Var2 = this.X;
        int i7 = 0;
        while (i2 < i) {
            mz6Var2.getClass();
            bArr[i7] = mz6Var2.a;
            i2 += mz6Var2.c - mz6Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = mz6Var2.b;
            mz6Var2.d = true;
            i7++;
            mz6Var2 = mz6Var2.f;
        }
        return new qz6(bArr, iArr);
    }

    public final void c1(int i, int i2, String str) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            em7.c(pc6.j(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            em7.c(pc6.m("endIndex < beginIndex: ", i2, i, " < "));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder sbL = ie2.l("endIndex > string.length: ", i2, " > ");
            sbL.append(str.length());
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                mz6 mz6VarU0 = u0(1);
                byte[] bArr = mz6VarU0.a;
                int i3 = mz6VarU0.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = mz6VarU0.c;
                int i6 = (i3 + i) - i5;
                mz6VarU0.c = i5 + i6;
                this.Y += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    mz6 mz6VarU1 = u0(2);
                    byte[] bArr2 = mz6VarU1.a;
                    int i7 = mz6VarU1.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    mz6VarU1.c = i7 + 2;
                    this.Y += 2;
                } else if (55296 <= cCharAt2 && cCharAt2 < 56320) {
                    int i8 = i + 1;
                    char cCharAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                    if (56320 > cCharAt3 || cCharAt3 >= 57344) {
                        H0(63);
                        i = i8;
                    } else {
                        int i9 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + DnsOverHttps.MAX_RESPONSE_SIZE;
                        mz6 mz6VarU2 = u0(4);
                        byte[] bArr3 = mz6VarU2.a;
                        int i10 = mz6VarU2.c;
                        bArr3[i10] = (byte) ((i9 >> 18) | 240);
                        bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                        bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                        bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                        mz6VarU2.c = i10 + 4;
                        this.Y += 4;
                        i += 2;
                    }
                } else if (56320 > cCharAt2 || cCharAt2 >= 57344) {
                    mz6 mz6VarU3 = u0(3);
                    byte[] bArr4 = mz6VarU3.a;
                    int i11 = mz6VarU3.c;
                    bArr4[i11] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr4[i11 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr4[i11 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    mz6VarU3.c = i11 + 3;
                    this.Y += 3;
                } else {
                    H0(63);
                }
                i++;
            }
        }
    }

    public final Object clone() {
        return m();
    }

    public final void d1(String str) {
        str.getClass();
        c1(0, str.length(), str);
    }

    public final void e1(int i) {
        if (i < 128) {
            H0(i);
            return;
        }
        if (i < 2048) {
            mz6 mz6VarU0 = u0(2);
            byte[] bArr = mz6VarU0.a;
            int i2 = mz6VarU0.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            mz6VarU0.c = i2 + 2;
            this.Y += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            H0(63);
            return;
        }
        if (i < 65536) {
            mz6 mz6VarU1 = u0(3);
            byte[] bArr2 = mz6VarU1.a;
            int i3 = mz6VarU1.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            mz6VarU1.c = i3 + 3;
            this.Y += 3;
            return;
        }
        if (i > 1114111) {
            bt.q("Unexpected code point: 0x".concat(os4.R(i)));
            return;
        }
        mz6 mz6VarU2 = u0(4);
        byte[] bArr3 = mz6VarU2.a;
        int i4 = mz6VarU2.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        mz6VarU2.c = i4 + 4;
        this.Y += 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i90)) {
            return false;
        }
        long j = this.Y;
        i90 i90Var = (i90) obj;
        if (j != i90Var.Y) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        mz6 mz6Var = this.X;
        mz6Var.getClass();
        mz6 mz6Var2 = i90Var.X;
        mz6Var2.getClass();
        int i = mz6Var.b;
        int i2 = mz6Var2.b;
        long j2 = 0;
        while (j2 < this.Y) {
            long jMin = Math.min(mz6Var.c - i, mz6Var2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (mz6Var.a[i] != mz6Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == mz6Var.c) {
                mz6Var = mz6Var.f;
                mz6Var.getClass();
                i = mz6Var.b;
            }
            if (i2 == mz6Var2.c) {
                mz6Var2 = mz6Var2.f;
                mz6Var2.getClass();
                i2 = mz6Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // defpackage.aa0
    public final /* bridge */ /* synthetic */ aa0 f0(String str) {
        d1(str);
        return this;
    }

    public final void g() throws EOFException {
        skip(this.Y);
    }

    @Override // defpackage.ba0
    public final void h0(i90 i90Var, long j) throws EOFException {
        i90Var.getClass();
        long j2 = this.Y;
        if (j2 >= j) {
            i90Var.write(this, j);
        } else {
            i90Var.write(this, j2);
            throw new EOFException();
        }
    }

    public final int hashCode() {
        mz6 mz6Var = this.X;
        if (mz6Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = mz6Var.c;
            for (int i3 = mz6Var.b; i3 < i2; i3++) {
                i = (i * 31) + mz6Var.a[i3];
            }
            mz6Var = mz6Var.f;
            mz6Var.getClass();
        } while (mz6Var != this.X);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long k() {
        long j = this.Y;
        if (j == 0) {
            return 0L;
        }
        mz6 mz6Var = this.X;
        mz6Var.getClass();
        mz6 mz6Var2 = mz6Var.g;
        mz6Var2.getClass();
        int i = mz6Var2.c;
        return (i >= 8192 || !mz6Var2.e) ? j : j - ((long) (i - mz6Var2.b));
    }

    @Override // defpackage.ba0
    public final String k0(Charset charset) {
        charset.getClass();
        return X(this.Y, charset);
    }

    public final i90 m() {
        i90 i90Var = new i90();
        if (this.Y == 0) {
            return i90Var;
        }
        mz6 mz6Var = this.X;
        mz6Var.getClass();
        mz6 mz6VarC = mz6Var.c();
        i90Var.X = mz6VarC;
        mz6VarC.g = mz6VarC;
        mz6VarC.f = mz6VarC;
        for (mz6 mz6Var2 = mz6Var.f; mz6Var2 != mz6Var; mz6Var2 = mz6Var2.f) {
            mz6 mz6Var3 = mz6VarC.g;
            mz6Var3.getClass();
            mz6Var2.getClass();
            mz6Var3.b(mz6Var2.c());
        }
        i90Var.Y = this.Y;
        return i90Var;
    }

    @Override // defpackage.ba0
    public final String o(long j) {
        return X(j, iq0.a);
    }

    @Override // defpackage.aa0
    public final /* bridge */ /* synthetic */ aa0 o0(long j) {
        V0(j);
        return this;
    }

    public final void p(i90 i90Var, long j, long j2) {
        i90Var.getClass();
        long j3 = j;
        os4.i(this.Y, j3, j2);
        if (j2 == 0) {
            return;
        }
        i90Var.Y += j2;
        mz6 mz6Var = this.X;
        while (true) {
            mz6Var.getClass();
            long j4 = mz6Var.c - mz6Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            mz6Var = mz6Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            mz6Var.getClass();
            mz6 mz6VarC = mz6Var.c();
            int i = mz6VarC.b + ((int) j3);
            mz6VarC.b = i;
            mz6VarC.c = Math.min(i + ((int) j5), mz6VarC.c);
            mz6 mz6Var2 = i90Var.X;
            if (mz6Var2 == null) {
                mz6VarC.g = mz6VarC;
                mz6VarC.f = mz6VarC;
                i90Var.X = mz6VarC;
            } else {
                mz6 mz6Var3 = mz6Var2.g;
                mz6Var3.getClass();
                mz6Var3.b(mz6VarC);
            }
            j5 -= (long) (mz6VarC.c - mz6VarC.b);
            mz6Var = mz6Var.f;
            j3 = 0;
        }
    }

    @Override // defpackage.ba0
    public final j76 peek() {
        return new j76(new qj5(this));
    }

    @Override // defpackage.ba0
    public final boolean q(long j, kb0 kb0Var) {
        kb0Var.getClass();
        return J(kb0Var.e(), kb0Var, j);
    }

    @Override // defpackage.ba0
    public final kb0 q0() {
        return s(this.Y);
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        os4.i(bArr.length, i, i2);
        mz6 mz6Var = this.X;
        if (mz6Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, mz6Var.c - mz6Var.b);
        byte[] bArr2 = mz6Var.a;
        int i3 = mz6Var.b;
        eu.d0(i, i3, i3 + iMin, bArr2, bArr);
        int i4 = mz6Var.b + iMin;
        mz6Var.b = i4;
        this.Y -= (long) iMin;
        if (i4 == mz6Var.c) {
            this.X = mz6Var.a();
            pz6.a(mz6Var);
        }
        return iMin;
    }

    @Override // defpackage.ba0
    public final byte readByte() {
        if (this.Y == 0) {
            throw new EOFException();
        }
        mz6 mz6Var = this.X;
        mz6Var.getClass();
        int i = mz6Var.b;
        int i2 = mz6Var.c;
        int i3 = i + 1;
        byte b = mz6Var.a[i];
        this.Y--;
        if (i3 != i2) {
            mz6Var.b = i3;
            return b;
        }
        this.X = mz6Var.a();
        pz6.a(mz6Var);
        return b;
    }

    @Override // defpackage.ba0
    public final void readFully(byte[] bArr) throws EOFException {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    @Override // defpackage.ba0
    public final int readInt() throws EOFException {
        if (this.Y < 4) {
            throw new EOFException();
        }
        mz6 mz6Var = this.X;
        mz6Var.getClass();
        int i = mz6Var.b;
        int i2 = mz6Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = mz6Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.Y -= 4;
        if (i5 != i2) {
            mz6Var.b = i5;
            return i6;
        }
        this.X = mz6Var.a();
        pz6.a(mz6Var);
        return i6;
    }

    @Override // defpackage.ba0
    public final long readLong() throws EOFException {
        if (this.Y < 8) {
            throw new EOFException();
        }
        mz6 mz6Var = this.X;
        mz6Var.getClass();
        int i = mz6Var.b;
        int i2 = mz6Var.c;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = mz6Var.a;
        int i3 = i + 7;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (((long) bArr[i3]) & 255);
        this.Y -= 8;
        if (i4 != i2) {
            mz6Var.b = i4;
            return j2;
        }
        this.X = mz6Var.a();
        pz6.a(mz6Var);
        return j2;
    }

    @Override // defpackage.ba0
    public final short readShort() throws EOFException {
        if (this.Y < 2) {
            throw new EOFException();
        }
        mz6 mz6Var = this.X;
        mz6Var.getClass();
        int i = mz6Var.b;
        int i2 = mz6Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = mz6Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.Y -= 2;
        if (i5 == i2) {
            this.X = mz6Var.a();
            pz6.a(mz6Var);
        } else {
            mz6Var.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.ba0
    public final boolean request(long j) {
        return this.Y >= j;
    }

    @Override // defpackage.ba0
    public final kb0 s(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            em7.c(ie2.f(j, "byteCount: "));
            return null;
        }
        if (this.Y < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new kb0(D0(j));
        }
        kb0 kb0VarC0 = c0((int) j);
        skip(j);
        return kb0VarC0;
    }

    @Override // defpackage.ba0
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            mz6 mz6Var = this.X;
            if (mz6Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, mz6Var.c - mz6Var.b);
            long j2 = iMin;
            this.Y -= j2;
            j -= j2;
            int i = mz6Var.b + iMin;
            mz6Var.b = i;
            if (i == mz6Var.c) {
                this.X = mz6Var.a();
                pz6.a(mz6Var);
            }
        }
    }

    @Override // defpackage.aa0
    public final /* bridge */ /* synthetic */ aa0 t0(int i, int i2, String str) {
        c1(i, i2, str);
        return this;
    }

    @Override // defpackage.je7
    public final ta8 timeout() {
        return ta8.NONE;
    }

    public final String toString() {
        long j = this.Y;
        if (j <= 2147483647L) {
            return c0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.Y).toString());
    }

    public final byte u(long j) {
        os4.i(this.Y, j, 1L);
        mz6 mz6Var = this.X;
        mz6Var.getClass();
        long j2 = this.Y;
        if (j2 - j < j) {
            while (j2 > j) {
                mz6Var = mz6Var.g;
                mz6Var.getClass();
                j2 -= (long) (mz6Var.c - mz6Var.b);
            }
            return mz6Var.a[(int) ((((long) mz6Var.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = mz6Var.c;
            int i2 = mz6Var.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return mz6Var.a[(int) ((((long) i2) + j) - j3)];
            }
            mz6Var = mz6Var.f;
            mz6Var.getClass();
            j3 = j4;
        }
    }

    public final mz6 u0(int i) {
        if (i < 1 || i > 8192) {
            bt.q("unexpected capacity");
            return null;
        }
        mz6 mz6Var = this.X;
        if (mz6Var == null) {
            mz6 mz6VarB = pz6.b();
            this.X = mz6VarB;
            mz6VarB.g = mz6VarB;
            mz6VarB.f = mz6VarB;
            return mz6VarB;
        }
        mz6 mz6Var2 = mz6Var.g;
        mz6Var2.getClass();
        if (mz6Var2.c + i <= 8192 && mz6Var2.e) {
            return mz6Var2;
        }
        mz6 mz6VarB2 = pz6.b();
        mz6Var2.b(mz6VarB2);
        return mz6VarB2;
    }

    @Override // defpackage.aa0
    public final /* bridge */ /* synthetic */ aa0 w(int i) {
        e1(i);
        return this;
    }

    @Override // defpackage.sa7
    public final void write(i90 i90Var, long j) {
        mz6 mz6VarB;
        i90Var.getClass();
        if (i90Var == this) {
            bt.q("source == this");
            return;
        }
        os4.i(i90Var.Y, 0L, j);
        while (j > 0) {
            mz6 mz6Var = i90Var.X;
            mz6Var.getClass();
            int i = mz6Var.c;
            mz6 mz6Var2 = i90Var.X;
            mz6Var2.getClass();
            long j2 = i - mz6Var2.b;
            int i2 = 0;
            if (j < j2) {
                mz6 mz6Var3 = this.X;
                mz6 mz6Var4 = mz6Var3 != null ? mz6Var3.g : null;
                if (mz6Var4 != null && mz6Var4.e) {
                    if ((((long) mz6Var4.c) + j) - ((long) (mz6Var4.d ? 0 : mz6Var4.b)) <= 8192) {
                        mz6 mz6Var5 = i90Var.X;
                        mz6Var5.getClass();
                        mz6Var5.d(mz6Var4, (int) j);
                        i90Var.Y -= j;
                        this.Y += j;
                        return;
                    }
                }
                mz6 mz6Var6 = i90Var.X;
                mz6Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > mz6Var6.c - mz6Var6.b) {
                    bt.q("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    mz6VarB = mz6Var6.c();
                } else {
                    mz6VarB = pz6.b();
                    byte[] bArr = mz6Var6.a;
                    byte[] bArr2 = mz6VarB.a;
                    int i4 = mz6Var6.b;
                    eu.d0(0, i4, i4 + i3, bArr, bArr2);
                }
                mz6VarB.c = mz6VarB.b + i3;
                mz6Var6.b += i3;
                mz6 mz6Var7 = mz6Var6.g;
                mz6Var7.getClass();
                mz6Var7.b(mz6VarB);
                i90Var.X = mz6VarB;
            }
            mz6 mz6Var8 = i90Var.X;
            mz6Var8.getClass();
            long j3 = mz6Var8.c - mz6Var8.b;
            i90Var.X = mz6Var8.a();
            mz6 mz6Var9 = this.X;
            if (mz6Var9 == null) {
                this.X = mz6Var8;
                mz6Var8.g = mz6Var8;
                mz6Var8.f = mz6Var8;
            } else {
                mz6 mz6Var10 = mz6Var9.g;
                mz6Var10.getClass();
                mz6Var10.b(mz6Var8);
                mz6 mz6Var11 = mz6Var8.g;
                if (mz6Var11 == mz6Var8) {
                    bt.i("cannot compact");
                    return;
                }
                mz6Var11.getClass();
                if (mz6Var11.e) {
                    int i5 = mz6Var8.c - mz6Var8.b;
                    mz6 mz6Var12 = mz6Var8.g;
                    mz6Var12.getClass();
                    int i6 = 8192 - mz6Var12.c;
                    mz6 mz6Var13 = mz6Var8.g;
                    mz6Var13.getClass();
                    if (!mz6Var13.d) {
                        mz6 mz6Var14 = mz6Var8.g;
                        mz6Var14.getClass();
                        i2 = mz6Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        mz6 mz6Var15 = mz6Var8.g;
                        mz6Var15.getClass();
                        mz6Var8.d(mz6Var15, i5);
                        mz6Var8.a();
                        pz6.a(mz6Var8);
                    }
                }
            }
            i90Var.Y -= j3;
            this.Y += j3;
            j -= j3;
        }
    }

    @Override // defpackage.aa0
    public final /* bridge */ /* synthetic */ aa0 writeByte(int i) {
        H0(i);
        return this;
    }

    @Override // defpackage.aa0
    public final /* bridge */ /* synthetic */ aa0 writeInt(int i) {
        Z0(i);
        return this;
    }

    @Override // defpackage.aa0
    public final /* bridge */ /* synthetic */ aa0 writeShort(int i) {
        a1(i);
        return this;
    }

    @Override // defpackage.ba0
    public final String z0() {
        return V(Long.MAX_VALUE);
    }

    @Override // defpackage.aa0
    public final aa0 O() {
        return this;
    }

    @Override // defpackage.ba0, defpackage.aa0
    public final i90 c() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.sa7
    public final void close() {
    }

    @Override // defpackage.aa0, defpackage.sa7, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        mz6 mz6Var = this.X;
        if (mz6Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), mz6Var.c - mz6Var.b);
        byteBuffer.put(mz6Var.a, mz6Var.b, iMin);
        int i = mz6Var.b + iMin;
        mz6Var.b = i;
        this.Y -= (long) iMin;
        if (i == mz6Var.c) {
            this.X = mz6Var.a();
            pz6.a(mz6Var);
        }
        return iMin;
    }

    @Override // defpackage.je7
    public final long read(i90 i90Var, long j) {
        i90Var.getClass();
        if (j >= 0) {
            long j2 = this.Y;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            i90Var.write(this, j);
            return j;
        }
        em7.c(ie2.f(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // defpackage.aa0
    public final aa0 write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            mz6 mz6VarU0 = u0(1);
            int iMin = Math.min(i, 8192 - mz6VarU0.c);
            byteBuffer.get(mz6VarU0.a, mz6VarU0.c, iMin);
            i -= iMin;
            mz6VarU0.c += iMin;
        }
        this.Y += (long) iRemaining;
        return iRemaining;
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        os4.i(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            mz6 mz6VarU0 = u0(1);
            int iMin = Math.min(i3 - i, 8192 - mz6VarU0.c);
            int i4 = i + iMin;
            eu.d0(mz6VarU0.c, i, i4, bArr, mz6VarU0.a);
            mz6VarU0.c += iMin;
            i = i4;
        }
        this.Y += j;
    }
}
