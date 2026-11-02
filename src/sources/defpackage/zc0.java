package defpackage;

import java.io.Serializable;
import java.util.Date;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zc0 implements Serializable, Cloneable, Comparable {
    public static final yc0 n0;
    public static final int[][][] o0;
    public static final int[][][] p0;
    public static final int[][][] q0;
    public static final int[][] r0;
    public static final String[] s0;
    public transient int[] X;
    public transient byte[] Y;
    public long Z;
    public transient boolean f0;
    public transient boolean g0;
    public transient boolean h0;
    public transient boolean i0;
    public qa8 j0;
    public int k0;
    public int l0;
    public transient int m0;

    static {
        new Date(-184303902528000000L);
        new Date(183882168921600000L);
        n0 = new yc0((byte) 0);
        o0 = new int[][][]{new int[][]{new int[]{5}, new int[]{3, 7}, new int[]{4, 7}, new int[]{8, 7}, new int[]{3, 18}, new int[]{4, 18}, new int[]{8, 18}, new int[]{6}, new int[]{37, 1}, new int[]{35, 17}}, new int[][]{new int[]{3}, new int[]{4}, new int[]{8}, new int[]{40, 7}, new int[]{40, 18}}};
        p0 = new int[][][]{new int[][]{new int[]{7}, new int[]{18}}};
        q0 = new int[][][]{new int[][]{new int[]{2}, new int[]{23}}};
        r0 = new int[][]{new int[]{31, 31, 0, 0}, new int[]{28, 29, 31, 31}, new int[]{31, 31, 59, 60}, new int[]{30, 30, 90, 91}, new int[]{31, 31, 120, 121}, new int[]{30, 30, 151, 152}, new int[]{31, 31, 181, 182}, new int[]{31, 31, 212, 213}, new int[]{30, 30, 243, 244}, new int[]{31, 31, 273, 274}, new int[]{30, 30, 304, 305}, new int[]{31, 31, 334, 335}};
        s0 = new String[]{"ERA", "YEAR", "MONTH", "WEEK_OF_YEAR", "WEEK_OF_MONTH", "DAY_OF_MONTH", "DAY_OF_YEAR", "DAY_OF_WEEK", "DAY_OF_WEEK_IN_MONTH", "AM_PM", "HOUR", "HOUR_OF_DAY", "MINUTE", "SECOND", "MILLISECOND", "ZONE_OFFSET", "DST_OFFSET", "YEAR_WOY", "DOW_LOCAL", "EXTENDED_YEAR", "JULIAN_DAY", "MILLISECONDS_IN_DAY", "IS_LEAP_MONTH", "ORDINAL_MONTH"};
    }

    public static String a(int i) {
        try {
            return s0[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return pc6.j(i, "Field ");
        }
    }

    public static final int b(int i, int i2, int[] iArr) {
        if (i >= 0) {
            iArr[0] = i % i2;
            return i / i2;
        }
        int i3 = ((i + 1) / i2) - 1;
        iArr[0] = i - (i2 * i3);
        return i3;
    }

    public final int c(int i) {
        int[] iArr;
        long j;
        int i2;
        int i3;
        long j2;
        if (!this.f0) {
            h();
        }
        if (!this.g0) {
            int[] iArr2 = new int[2];
            this.j0.e(this.Z, false, iArr2);
            long j3 = this.Z + ((long) iArr2[0]) + ((long) iArr2[1]);
            int i4 = this.m0;
            int i5 = 0;
            while (true) {
                iArr = this.X;
                if (i5 >= iArr.length) {
                    break;
                }
                int i6 = i4 & 1;
                byte[] bArr = this.Y;
                if (i6 == 0) {
                    bArr[i5] = 1;
                } else {
                    bArr[i5] = 0;
                }
                i4 >>= 1;
                i5++;
            }
            long j4 = j3 >= 0 ? j3 / 86400000 : ((j3 + 1) / 86400000) - 1;
            int i7 = (int) j4;
            iArr[20] = 2440588 + i7;
            long j5 = 719162 + i7;
            int[] iArr3 = new int[1];
            if (j5 >= 0) {
                j = 1;
                iArr3[0] = (int) (j5 % 146097);
                i2 = (int) (j5 / 146097);
            } else {
                j = 1;
                int i8 = (int) (((j5 + 1) / 146097) - 1);
                iArr3[0] = (int) (j5 - (((long) i8) * 146097));
                i2 = i8;
            }
            int iB = b(iArr3[0], 36524, iArr3);
            int iB2 = b(iArr3[0], 1461, iArr3);
            int iB3 = b(iArr3[0], 365, iArr3);
            int i9 = (iB2 * 4) + (iB * 100) + (i2 * 400) + iB3;
            int i10 = iArr3[0];
            if (iB == 4 || iB3 == 4) {
                i10 = 365;
            } else {
                i9++;
            }
            boolean z = (i9 & 3) == 0 && (i9 % 100 != 0 || i9 % 400 == 0);
            if (i10 >= (z ? 60 : 59)) {
                i3 = z ? 1 : 2;
            } else {
                i3 = 0;
            }
            int i11 = r0[(((i10 + i3) * 12) + 6) / 367][z ? (char) 3 : (char) 2];
            int[] iArr4 = this.X;
            int i12 = (i7 + 2440590) % 7;
            if (i12 < 1) {
                i12 += 7;
            }
            iArr4[7] = i12;
            int i13 = i12 - this.k0;
            int i14 = i13 + 1;
            if (i14 < 1) {
                i14 = i13 + 8;
            }
            iArr4[18] = i14;
            il5 il5Var = (il5) this;
            long j6 = ((long) iArr4[20]) - 1721425;
            int iRound = (int) Math.round(((ed0.f(j6) - ed0.c) / ed0.b) + 1.0d);
            if (iRound <= 0) {
                iRound--;
            }
            long jB = j6 - ed0.b(new int[]{iRound, 1, 1});
            long j7 = jB + j;
            int iCeil = (int) (j7 <= 186 ? Math.ceil(j7 / 31.0d) : Math.ceil((jB - 5) / 30.0d));
            int[] iArr5 = {iRound, iCeil, (int) ((j6 - ed0.b(new int[]{iRound, iCeil, 1})) + j)};
            long j8 = ((long) iArr5[2]) | (((long) iArr5[0]) << 16) | ((long) ((iArr5[1] - 1) << 8));
            int i15 = (int) (j8 >> 16);
            int i16 = ((int) (65280 & j8)) >> 8;
            int i17 = (int) (j8 & 255);
            il5Var.e(0, i15 > 0 ? 1 : 0);
            il5Var.e(1, i15 > 0 ? i15 : 1 - i15);
            il5Var.e(19, i15);
            il5Var.e(2, i16);
            il5Var.e(5, i17);
            il5Var.e(6, Math.min(6, i16) + (i16 * 30) + i17);
            int[] iArr6 = this.X;
            int i18 = iArr6[19];
            int i19 = iArr6[7];
            int i20 = iArr6[6];
            int i21 = this.k0;
            int i22 = ((i19 + 7) - i21) % 7;
            int i23 = (((i19 - i20) + 7001) - i21) % 7;
            int i24 = ((i20 - 1) + i23) / 7;
            if (7 - i23 >= this.l0) {
                i24++;
            }
            if (i24 == 0) {
                int i25 = i18 - 1;
                int i26 = (ed0.b(new int[]{i25 + 1, 1, 1}) - ed0.b(new int[]{i25, 1, 1}) == 366 ? 366 : 365) + i20;
                i24 = i(i26, i26, i19);
                i18--;
                j2 = j4;
            } else {
                j2 = j4;
                int i27 = i18;
                int i28 = ed0.b(new int[]{i27 + 1, 1, 1}) - ed0.b(new int[]{i27, 1, 1}) == 366 ? 366 : 365;
                if (i20 >= i28 - 5) {
                    int i29 = ((i22 + i28) - i20) % 7;
                    if (i29 < 0) {
                        i29 += 7;
                    }
                    if (6 - i29 >= this.l0 && (i20 + 7) - i22 > i28) {
                        i18++;
                        i24 = 1;
                    }
                }
            }
            int[] iArr7 = this.X;
            iArr7[3] = i24;
            iArr7[17] = i18;
            int i30 = iArr7[5];
            iArr7[4] = i(i30, i30, i19);
            int[] iArr8 = this.X;
            iArr8[8] = ((i30 - 1) / 7) + 1;
            int i31 = (int) (j3 - (j2 * 86400000));
            iArr8[21] = i31;
            iArr8[14] = i31 % XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
            int i32 = i31 / XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
            iArr8[13] = i32 % 60;
            int i33 = i32 / 60;
            iArr8[12] = i33 % 60;
            int i34 = i33 / 60;
            iArr8[11] = i34;
            iArr8[9] = i34 / 12;
            iArr8[10] = i34 % 12;
            iArr8[15] = iArr2[0];
            iArr8[16] = iArr2[1];
            this.g0 = true;
            this.h0 = true;
        }
        return this.X[i];
    }

    public final Object clone() {
        try {
            zc0 zc0Var = (zc0) super.clone();
            int[] iArr = new int[this.X.length];
            zc0Var.X = iArr;
            int[] iArr2 = this.X;
            zc0Var.Y = new byte[iArr2.length];
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            System.arraycopy(this.Y, 0, zc0Var.Y, 0, this.X.length);
            zc0Var.j0 = (qa8) this.j0.clone();
            return zc0Var;
        } catch (CloneNotSupportedException e) {
            throw new c33(e);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zc0 zc0Var = (zc0) obj;
        if (!this.f0) {
            h();
        }
        long j = this.Z;
        if (!zc0Var.f0) {
            zc0Var.h();
        }
        long j2 = j - zc0Var.Z;
        if (j2 < 0) {
            return -1;
        }
        return j2 > 0 ? 1 : 0;
    }

    public final int d(int i, int i2) {
        return this.Y[i] > 0 ? this.X[i] : i2;
    }

    public final void e(int i, int i2) {
        if (((1 << i) & this.m0) == 0) {
            bt.p(a(i), "Subclass cannot set ");
        } else {
            this.X[i] = i2;
            this.Y[i] = 1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        zc0 zc0Var = (zc0) obj;
        if (getClass() != zc0Var.getClass() || this.k0 != zc0Var.k0 || this.l0 != zc0Var.l0 || !this.j0.equals(zc0Var.j0)) {
            return false;
        }
        if (!this.f0) {
            h();
        }
        long j = this.Z;
        if (!zc0Var.f0) {
            zc0Var.h();
        }
        return j == new Date(zc0Var.Z).getTime();
    }

    public final int f(int i, int i2, int i3) {
        while (i <= i2) {
            byte b = this.Y[i];
            if (b > i3) {
                i3 = b;
            }
            i++;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0042 A[PHI: r7
  0x0042: PHI (r7v3 int) = (r7v2 int), (r7v5 int), (r7v5 int) binds: [B:22:0x0032, B:24:0x0037, B:26:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    public final int g(int[][][] iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = 0;
            for (int[] iArr2 : iArr[i2]) {
                int i4 = iArr2[0] >= 32 ? 1 : 0;
                int iMax = 0;
                while (true) {
                    if (i4 >= iArr2.length) {
                        if (iMax > i3) {
                            int i5 = iArr2[0];
                            if (i5 < 32 || (i5 = i5 & 31) != 5) {
                                i = i5;
                            } else {
                                byte[] bArr = this.Y;
                                if (bArr[4] < bArr[i5]) {
                                    i = i5;
                                }
                            }
                            if (i != i5) {
                                break;
                            }
                            i3 = iMax;
                            break;
                        }
                        break;
                    }
                    byte b = this.Y[iArr2[i4]];
                    if (b == 0) {
                        break;
                    }
                    iMax = Math.max(iMax, (int) b);
                    i4++;
                }
            }
        }
        return i >= 32 ? i & 31 : i;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:85:0x0136  */
    public final void h() {
        il5 il5Var;
        byte[] bArr;
        int iD;
        int iD2;
        int i;
        int iD3;
        int i2;
        int i3;
        int iD4;
        int i4;
        int[] iArr;
        long j;
        long j2;
        if (this.Y[20] < 2 || f(23, 23, f(17, 19, f(0, 8, 0))) > this.Y[20]) {
            int iG = g(o0);
            if (iG < 0) {
                iG = 5;
            }
            boolean z = iG == 5 || iG == 4 || iG == 8;
            if (iG == 3) {
                byte[] bArr2 = this.Y;
                if (bArr2[1] > bArr2[17]) {
                    il5Var = (il5) this;
                    bArr = il5Var.Y;
                    if (bArr[1] > bArr[19]) {
                        iD = il5Var.d(19, 1);
                    } else if (il5Var.d(0, 1) == 0) {
                        iD = 1 - il5Var.d(1, 1);
                    } else {
                        iD = il5Var.d(1, 1);
                    }
                } else {
                    iD = this.X[17];
                }
            } else {
                il5Var = (il5) this;
                bArr = il5Var.Y;
                if (bArr[1] > bArr[19]) {
                    iD = il5Var.d(19, 1);
                } else if (il5Var.d(0, 1) == 0) {
                    iD = 1 - il5Var.d(1, 1);
                } else {
                    iD = il5Var.d(1, 1);
                }
            }
            e(19, iD);
            long j3 = iD;
            if (j3 > 23058430092136939L) {
                bt.q("year is too large");
                return;
            }
            int[][][] iArr2 = q0;
            if (z) {
                iD2 = g(iArr2) == 2 ? d(2, 0) : d(23, 0);
            } else {
                iD2 = 0;
            }
            int i5 = (int) j3;
            int iB = (int) (ed0.b(new int[]{i5, iD2 + 1, 0}) + 1721425);
            if (iG == 5) {
                iD4 = (this.i0 || this.Y[5] != 0) ? d(5, 1) + iB : iB + 1;
            } else {
                if (iG == 6) {
                    i2 = this.X[6];
                } else {
                    int i6 = this.k0;
                    int i7 = (iB + 3) % 7;
                    if (i7 < 1) {
                        i7 += 7;
                    }
                    int i8 = i7 - i6;
                    if (i8 < 0) {
                        i8 += 7;
                    }
                    int iG2 = g(p0);
                    if (iG2 != 7) {
                        i = iG2 != 18 ? 0 : this.X[18] - 1;
                    } else {
                        i = this.X[7] - i6;
                    }
                    int i9 = i % 7;
                    if (i9 < 0) {
                        i9 += 7;
                    }
                    int i10 = (1 - i8) + i9;
                    if (iG == 8) {
                        if (i10 < 1) {
                            i10 += 7;
                        }
                        iD3 = d(8, 1);
                        if (iD3 < 0) {
                            int iD5 = g(iArr2) == 2 ? d(2, 0) : d(23, 0);
                            if (iD5 < 6) {
                                i3 = 31;
                            } else if (iD5 < 11) {
                                i3 = 30;
                            } else {
                                if (ed0.b(new int[]{i5 + 1, 1, 1}) - ed0.b(new int[]{i5, 1, 1}) == 366) {
                                    i3 = 30;
                                } else {
                                    i3 = 29;
                                }
                            }
                            i2 = ((((i3 - i10) / 7) + iD3 + 1) * 7) + i10;
                        }
                    } else {
                        if (7 - i8 < this.l0) {
                            i10 += 7;
                        }
                        iD3 = this.X[iG];
                    }
                    i2 = ((iD3 - 1) * 7) + i10;
                }
                iD4 = i2 + iB;
            }
        } else {
            iD4 = this.X[20];
        }
        long j4 = ((long) (iD4 - 2440588)) * 86400000;
        if (this.Y[21] < 2 || f(9, 14, 0) > this.Y[21]) {
            int iMax = Math.max(Math.abs(this.X[11]), Math.abs(this.X[10]));
            byte[] bArr3 = this.Y;
            if (iMax > 548) {
                byte b = bArr3[11];
                int iMax2 = Math.max((int) bArr3[10], (int) bArr3[9]);
                if (iMax2 <= b) {
                    iMax2 = b;
                }
                if (iMax2 != 0) {
                    int[] iArr3 = this.X;
                    j2 = iMax2 == b ? iArr3[11] : ((long) iArr3[10]) + ((long) (iArr3[9] * 12));
                } else {
                    j2 = 0;
                }
                int[] iArr4 = this.X;
                long j5 = (((((j2 * 60) + ((long) iArr4[12])) * 60) + ((long) iArr4[13])) * 1000) + ((long) iArr4[14]);
                iArr = iArr4;
                j = j5;
            } else {
                byte b2 = bArr3[11];
                int iMax3 = Math.max((int) bArr3[10], (int) bArr3[9]);
                if (iMax3 <= b2) {
                    iMax3 = b2;
                }
                if (iMax3 != 0) {
                    int[] iArr5 = this.X;
                    i4 = iMax3 == b2 ? iArr5[11] : iArr5[10] + (iArr5[9] * 12);
                } else {
                    i4 = 0;
                }
                int[] iArr6 = this.X;
                long j6 = (((((i4 * 60) + iArr6[12]) * 60) + iArr6[13]) * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax) + iArr6[14];
                iArr = iArr6;
                j = j6;
            }
        } else {
            iArr = this.X;
            j = iArr[21];
        }
        byte[] bArr4 = this.Y;
        if (bArr4[15] >= 2 || bArr4[16] >= 2) {
            this.Z = (j4 + j) - ((long) (iArr[15] + iArr[16]));
        } else {
            long j7 = j4 + j;
            int[] iArr7 = new int[2];
            qa8 qa8Var = this.j0;
            if (qa8Var instanceof g40) {
                ((g40) qa8Var).g(j7, iArr7);
            } else {
                qa8Var.e(j7, true, iArr7);
            }
            this.Z = j7 - ((long) (iArr7[0] + iArr7[1]));
        }
        this.g0 = false;
        this.f0 = true;
        this.i0 = false;
    }

    public final int hashCode() {
        return (this.j0.hashCode() << 11) | (this.k0 << 1) | 1 | (this.l0 << 4);
    }

    public final int i(int i, int i2, int i3) {
        int i4 = (((i3 - this.k0) - i2) + 1) % 7;
        if (i4 < 0) {
            i4 += 7;
        }
        int i5 = ((i + i4) - 1) / 7;
        return 7 - i4 >= this.l0 ? i5 + 1 : i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(getClass().getName());
        sb.append("[time=");
        sb.append(this.f0 ? String.valueOf(this.Z) : "?");
        sb.append(",areFieldsSet=");
        sb.append(this.g0);
        sb.append(",areAllFieldsSet=");
        sb.append(this.h0);
        sb.append(",lenient=true,zone=");
        sb.append(this.j0);
        sb.append(",firstDayOfWeek=");
        sb.append(this.k0);
        sb.append(",minimalDaysInFirstWeek=");
        sb.append(this.l0);
        sb.append(",repeatedWallTime=0,skippedWallTime=0");
        for (int i = 0; i < this.X.length; i++) {
            sb.append(',');
            sb.append(a(i));
            sb.append('=');
            sb.append((this.i0 || this.Y[i] != 0) ? String.valueOf(this.X[i]) : "?");
        }
        sb.append(']');
        return sb.toString();
    }
}
