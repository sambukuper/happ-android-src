package defpackage;

import java.util.Arrays;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gv0 extends jv0 {
    public final byte[] Z;
    public int f0;
    public int g0;
    public int h0;
    public final int i0;
    public int j0;
    public int k0 = Integer.MAX_VALUE;

    public gv0(byte[] bArr, int i, int i2, boolean z) {
        this.Z = bArr;
        this.f0 = i2 + i;
        this.h0 = i;
        this.i0 = i;
    }

    @Override // defpackage.jv0
    public final long A() {
        return H();
    }

    @Override // defpackage.jv0
    public final boolean B(int i) throws qh3 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                K(8);
                return true;
            }
            if (i2 == 2) {
                K(G());
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
            K(4);
            return true;
        }
        int i4 = this.f0 - this.h0;
        byte[] bArr = this.Z;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.h0;
                this.h0 = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw qh3.c();
        }
        while (i3 < 10) {
            int i6 = this.h0;
            if (i6 == this.f0) {
                throw qh3.e();
            }
            this.h0 = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw qh3.c();
        return true;
    }

    public final int E() throws qh3 {
        int i = this.h0;
        if (this.f0 - i < 4) {
            throw qh3.e();
        }
        this.h0 = i + 4;
        byte[] bArr = this.Z;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long F() throws qh3 {
        int i = this.h0;
        if (this.f0 - i < 8) {
            throw qh3.e();
        }
        this.h0 = i + 8;
        byte[] bArr = this.Z;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int G() {
        int i;
        int i2 = this.h0;
        int i3 = this.f0;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.Z;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h0 = i4;
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
                this.h0 = i5;
                return i;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.h0;
        int i2 = this.f0;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.Z;
            byte b = bArr[i];
            if (b >= 0) {
                this.h0 = i3;
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
                this.h0 = i4;
                return j;
            }
        }
        return I();
    }

    public final long I() throws qh3 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.h0;
            if (i2 == this.f0) {
                throw qh3.e();
            }
            this.h0 = i2 + 1;
            byte b = this.Z[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw qh3.c();
    }

    public final void J() {
        int i = this.f0 + this.g0;
        this.f0 = i;
        int i2 = i - this.i0;
        int i3 = this.k0;
        if (i2 <= i3) {
            this.g0 = 0;
            return;
        }
        int i4 = i2 - i3;
        this.g0 = i4;
        this.f0 = i - i4;
    }

    public final void K(int i) throws qh3 {
        if (i >= 0) {
            int i2 = this.f0;
            int i3 = this.h0;
            if (i <= i2 - i3) {
                this.h0 = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw qh3.e();
        }
        throw qh3.d();
    }

    @Override // defpackage.jv0
    public final void a(int i) throws qh3 {
        if (this.j0 != i) {
            throw new qh3("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.jv0
    public final int b() {
        return this.h0 - this.i0;
    }

    @Override // defpackage.jv0
    public final boolean c() {
        return this.h0 == this.f0;
    }

    @Override // defpackage.jv0
    public final void h(int i) {
        this.k0 = i;
        J();
    }

    @Override // defpackage.jv0
    public final int i(int i) {
        if (i < 0) {
            throw qh3.d();
        }
        int iB = b() + i;
        if (iB < 0) {
            throw new qh3("Failed to parse the message.");
        }
        int i2 = this.k0;
        if (iB > i2) {
            throw qh3.e();
        }
        this.k0 = iB;
        J();
        return i2;
    }

    @Override // defpackage.jv0
    public final boolean j() {
        return H() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // defpackage.jv0
    public final hb0 k() throws qh3 {
        byte[] bArrCopyOfRange;
        int iG = G();
        byte[] bArr = this.Z;
        if (iG > 0) {
            int i = this.f0;
            int i2 = this.h0;
            if (iG <= i - i2) {
                hb0 hb0VarC = hb0.c(i2, iG, bArr);
                this.h0 += iG;
                return hb0VarC;
            }
        }
        if (iG == 0) {
            return hb0.Z;
        }
        if (iG > 0) {
            int i3 = this.f0;
            int i4 = this.h0;
            if (iG <= i3 - i4) {
                int i5 = iG + i4;
                this.h0 = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iG <= 0) {
                    throw qh3.e();
                }
                if (iG == 0) {
                    throw qh3.d();
                }
                bArrCopyOfRange = eg3.b;
            }
        } else {
            if (iG <= 0) {
                throw qh3.e();
            }
            if (iG == 0) {
                throw qh3.d();
            }
            bArrCopyOfRange = eg3.b;
        }
        hb0 hb0Var = hb0.Z;
        return new hb0(bArrCopyOfRange);
    }

    @Override // defpackage.jv0
    public final double l() {
        return Double.longBitsToDouble(F());
    }

    @Override // defpackage.jv0
    public final int m() {
        return G();
    }

    @Override // defpackage.jv0
    public final int n() {
        return E();
    }

    @Override // defpackage.jv0
    public final long o() {
        return F();
    }

    @Override // defpackage.jv0
    public final float p() {
        return Float.intBitsToFloat(E());
    }

    @Override // defpackage.jv0
    public final int q() {
        return G();
    }

    @Override // defpackage.jv0
    public final long r() {
        return H();
    }

    @Override // defpackage.jv0
    public final int s() {
        return E();
    }

    @Override // defpackage.jv0
    public final long t() {
        return F();
    }

    @Override // defpackage.jv0
    public final int u() {
        int iG = G();
        return (-(iG & 1)) ^ (iG >>> 1);
    }

    @Override // defpackage.jv0
    public final long v() {
        long jH = H();
        return (-(jH & 1)) ^ (jH >>> 1);
    }

    @Override // defpackage.jv0
    public final String w() throws qh3 {
        int iG = G();
        if (iG > 0) {
            int i = this.f0;
            int i2 = this.h0;
            if (iG <= i - i2) {
                String str = new String(this.Z, i2, iG, eg3.a);
                this.h0 += iG;
                return str;
            }
        }
        if (iG == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (iG < 0) {
            throw qh3.d();
        }
        throw qh3.e();
    }

    @Override // defpackage.jv0
    public final String x() throws qh3 {
        int iG = G();
        if (iG > 0) {
            int i = this.f0;
            int i2 = this.h0;
            if (iG <= i - i2) {
                String strE = is8.a.e(i2, iG, this.Z);
                this.h0 += iG;
                return strE;
            }
        }
        if (iG == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (iG <= 0) {
            throw qh3.d();
        }
        throw qh3.e();
    }

    @Override // defpackage.jv0
    public final int y() throws qh3 {
        if (c()) {
            this.j0 = 0;
            return 0;
        }
        int iG = G();
        this.j0 = iG;
        if ((iG >>> 3) != 0) {
            return iG;
        }
        throw new qh3("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.jv0
    public final int z() {
        return G();
    }
}
