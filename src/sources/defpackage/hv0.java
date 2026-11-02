package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hv0 extends jv0 {
    public final FileInputStream Z;
    public final byte[] f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0 = Integer.MAX_VALUE;

    public hv0(FileInputStream fileInputStream) {
        Charset charset = eg3.a;
        this.Z = fileInputStream;
        this.f0 = new byte[4096];
        this.g0 = 0;
        this.i0 = 0;
        this.k0 = 0;
    }

    @Override // defpackage.jv0
    public final long A() {
        return K();
    }

    @Override // defpackage.jv0
    public final boolean B(int i) throws qh3 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                O(8);
                return true;
            }
            if (i2 == 2) {
                O(J());
                return true;
            }
            if (i2 == 3) {
                D();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw qh3.b();
            }
            O(4);
            return true;
        }
        int i4 = this.g0 - this.i0;
        byte[] bArr = this.f0;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.i0;
                this.i0 = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw qh3.c();
        }
        while (i3 < 10) {
            if (this.i0 == this.g0) {
                N(1);
            }
            int i6 = this.i0;
            this.i0 = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw qh3.c();
        return true;
    }

    public final byte[] E(int i) throws IOException {
        byte[] bArrF = F(i);
        if (bArrF != null) {
            return bArrF;
        }
        int i2 = this.i0;
        int i3 = this.g0;
        int length = i3 - i2;
        this.k0 += i3;
        this.i0 = 0;
        this.g0 = 0;
        ArrayList<byte[]> arrayListG = G(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f0, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListG) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] F(int i) throws IOException {
        if (i == 0) {
            return eg3.b;
        }
        if (i < 0) {
            throw qh3.d();
        }
        int i2 = this.k0;
        int i3 = this.i0;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new qh3("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.l0;
        if (i4 > i5) {
            O((i5 - i2) - i3);
            throw qh3.e();
        }
        int i6 = this.g0 - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.Z;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (qh3 e) {
                e.X = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f0, this.i0, bArr, 0, i6);
        this.k0 += this.g0;
        this.i0 = 0;
        this.g0 = 0;
        while (i6 < i) {
            try {
                int i8 = fileInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw qh3.e();
                }
                this.k0 += i8;
                i6 += i8;
            } catch (qh3 e2) {
                e2.X = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList G(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.Z.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw qh3.e();
                }
                this.k0 += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int H() throws qh3 {
        int i = this.i0;
        if (this.g0 - i < 4) {
            N(4);
            i = this.i0;
        }
        this.i0 = i + 4;
        byte[] bArr = this.f0;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long I() throws qh3 {
        int i = this.i0;
        if (this.g0 - i < 8) {
            N(8);
            i = this.i0;
        }
        this.i0 = i + 8;
        byte[] bArr = this.f0;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int J() {
        int i;
        int i2 = this.i0;
        int i3 = this.g0;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f0;
            byte b = bArr[i2];
            if (b >= 0) {
                this.i0 = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.i0 = i5;
                return i;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.i0;
        int i2 = this.g0;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f0;
            byte b = bArr[i];
            if (b >= 0) {
                this.i0 = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.i0 = i4;
                return j;
            }
        }
        return L();
    }

    public final long L() throws qh3 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.i0 == this.g0) {
                N(1);
            }
            int i2 = this.i0;
            this.i0 = i2 + 1;
            byte b = this.f0[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw qh3.c();
    }

    public final void M() {
        int i = this.g0 + this.h0;
        this.g0 = i;
        int i2 = this.k0 + i;
        int i3 = this.l0;
        if (i2 <= i3) {
            this.h0 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.h0 = i4;
        this.g0 = i - i4;
    }

    public final void N(int i) throws qh3 {
        if (P(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.k0) - this.i0) {
            throw qh3.e();
        }
        throw new qh3("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void O(int i) throws qh3 {
        int i2 = this.g0;
        int i3 = this.i0;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.i0 = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.Z;
        if (i < 0) {
            throw qh3.d();
        }
        int i5 = this.k0;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.l0;
        if (i7 > i8) {
            O((i8 - i5) - i3);
            throw qh3.e();
        }
        this.k0 = i6;
        this.g0 = 0;
        this.i0 = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (qh3 e) {
                    e.X = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.k0 += i4;
                M();
                throw th;
            }
        }
        this.k0 += i4;
        M();
        if (i4 >= i) {
            return;
        }
        int i9 = this.g0;
        int i10 = i9 - this.i0;
        this.i0 = i9;
        N(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.g0;
            if (i11 <= i12) {
                this.i0 = i11;
                return;
            } else {
                i10 += i12;
                this.i0 = i12;
                N(1);
            }
        }
    }

    public final boolean P(int i) throws IOException {
        FileInputStream fileInputStream = this.Z;
        int i2 = this.i0;
        int i3 = i2 + i;
        int i4 = this.g0;
        if (i3 <= i4) {
            bt.i(ie2.h("refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.k0;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.l0) {
            byte[] bArr = this.f0;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.k0 + i2;
                this.k0 = i5;
                i4 = this.g0 - i2;
                this.g0 = i4;
                this.i0 = 0;
            }
            try {
                int i6 = fileInputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i6 + "\nThe InputStream implementation is buggy.");
                }
                if (i6 > 0) {
                    this.g0 += i6;
                    M();
                    if (this.g0 >= i) {
                        return true;
                    }
                    return P(i);
                }
            } catch (qh3 e) {
                e.X = true;
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.jv0
    public final void a(int i) throws qh3 {
        if (this.j0 != i) {
            throw new qh3("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.jv0
    public final int b() {
        return this.k0 + this.i0;
    }

    @Override // defpackage.jv0
    public final boolean c() {
        return this.i0 == this.g0 && !P(1);
    }

    @Override // defpackage.jv0
    public final void h(int i) {
        this.l0 = i;
        M();
    }

    @Override // defpackage.jv0
    public final int i(int i) throws qh3 {
        if (i < 0) {
            throw qh3.d();
        }
        int i2 = this.k0 + this.i0 + i;
        if (i2 < 0) {
            throw new qh3("Failed to parse the message.");
        }
        int i3 = this.l0;
        if (i2 > i3) {
            throw qh3.e();
        }
        this.l0 = i2;
        M();
        return i3;
    }

    @Override // defpackage.jv0
    public final boolean j() {
        return K() != 0;
    }

    @Override // defpackage.jv0
    public final hb0 k() throws IOException {
        int iJ = J();
        int i = this.g0;
        int i2 = this.i0;
        int i3 = i - i2;
        byte[] bArr = this.f0;
        if (iJ <= i3 && iJ > 0) {
            hb0 hb0VarC = hb0.c(i2, iJ, bArr);
            this.i0 += iJ;
            return hb0VarC;
        }
        if (iJ == 0) {
            return hb0.Z;
        }
        if (iJ < 0) {
            throw qh3.d();
        }
        byte[] bArrF = F(iJ);
        if (bArrF != null) {
            return hb0.c(0, bArrF.length, bArrF);
        }
        int i4 = this.i0;
        int i5 = this.g0;
        int length = i5 - i4;
        this.k0 += i5;
        this.i0 = 0;
        this.g0 = 0;
        ArrayList<byte[]> arrayListG = G(iJ - length);
        byte[] bArr2 = new byte[iJ];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListG) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        hb0 hb0Var = hb0.Z;
        return new hb0(bArr2);
    }

    @Override // defpackage.jv0
    public final double l() {
        return Double.longBitsToDouble(I());
    }

    @Override // defpackage.jv0
    public final int m() {
        return J();
    }

    @Override // defpackage.jv0
    public final int n() {
        return H();
    }

    @Override // defpackage.jv0
    public final long o() {
        return I();
    }

    @Override // defpackage.jv0
    public final float p() {
        return Float.intBitsToFloat(H());
    }

    @Override // defpackage.jv0
    public final int q() {
        return J();
    }

    @Override // defpackage.jv0
    public final long r() {
        return K();
    }

    @Override // defpackage.jv0
    public final int s() {
        return H();
    }

    @Override // defpackage.jv0
    public final long t() {
        return I();
    }

    @Override // defpackage.jv0
    public final int u() {
        int iJ = J();
        return (-(iJ & 1)) ^ (iJ >>> 1);
    }

    @Override // defpackage.jv0
    public final long v() {
        long jK = K();
        return (-(jK & 1)) ^ (jK >>> 1);
    }

    @Override // defpackage.jv0
    public final String w() throws qh3 {
        int iJ = J();
        byte[] bArr = this.f0;
        if (iJ > 0) {
            int i = this.g0;
            int i2 = this.i0;
            if (iJ <= i - i2) {
                String str = new String(bArr, i2, iJ, eg3.a);
                this.i0 += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (iJ < 0) {
            throw qh3.d();
        }
        if (iJ > this.g0) {
            return new String(E(iJ), eg3.a);
        }
        N(iJ);
        String str2 = new String(bArr, this.i0, iJ, eg3.a);
        this.i0 += iJ;
        return str2;
    }

    @Override // defpackage.jv0
    public final String x() throws IOException {
        int iJ = J();
        int i = this.i0;
        int i2 = this.g0;
        int i3 = i2 - i;
        byte[] bArrE = this.f0;
        if (iJ <= i3 && iJ > 0) {
            this.i0 = i + iJ;
        } else {
            if (iJ == 0) {
                return _UrlKt.FRAGMENT_ENCODE_SET;
            }
            if (iJ < 0) {
                throw qh3.d();
            }
            i = 0;
            if (iJ <= i2) {
                N(iJ);
                this.i0 = iJ;
            } else {
                bArrE = E(iJ);
            }
        }
        return is8.a.e(i, iJ, bArrE);
    }

    @Override // defpackage.jv0
    public final int y() throws qh3 {
        if (c()) {
            this.j0 = 0;
            return 0;
        }
        int iJ = J();
        this.j0 = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new qh3("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.jv0
    public final int z() {
        return J();
    }
}
