package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(iq0.a);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(i90 i90Var, kb0 kb0Var, long j, long j2, int i) {
        mz6 mz6Var;
        long j3 = j;
        long j4 = j2;
        kb0Var.getClass();
        long j5 = i;
        os4.i(kb0Var.e(), 0L, j5);
        if (i <= 0) {
            bt.q("byteCount == 0");
            return 0L;
        }
        if (j3 < 0) {
            em7.c(ie2.f(j3, "fromIndex < 0: "));
            return 0L;
        }
        if (j3 > j4) {
            StringBuilder sbS = pc6.s(j3, "fromIndex > toIndex: ", " > ");
            sbS.append(j4);
            throw new IllegalArgumentException(sbS.toString().toString());
        }
        long j6 = i90Var.Y;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (mz6Var = i90Var.X) == null) {
            return -1L;
        }
        long j7 = 0;
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                mz6Var = mz6Var.g;
                mz6Var.getClass();
                j6 -= (long) (mz6Var.c - mz6Var.b);
            }
            byte[] bArrI = kb0Var.i();
            byte b2 = bArrI[0];
            long jMin = Math.min(j4, (i90Var.Y - j5) + 1);
            while (j6 < jMin) {
                byte[] bArr = mz6Var.a;
                int iMin = (int) Math.min(mz6Var.c, (((long) mz6Var.b) + jMin) - j6);
                for (int i2 = (int) ((((long) mz6Var.b) + j3) - j6); i2 < iMin; i2++) {
                    if (bArr[i2] == b2 && b(mz6Var, i2 + 1, bArrI, 1, i)) {
                        return ((long) (i2 - mz6Var.b)) + j6;
                    }
                }
                j6 += (long) (mz6Var.c - mz6Var.b);
                mz6Var = mz6Var.f;
                mz6Var.getClass();
                j3 = j6;
            }
            return -1L;
        }
        while (true) {
            long j8 = j7 + ((long) (mz6Var.c - mz6Var.b));
            if (j8 > j3) {
                break;
            }
            mz6Var = mz6Var.f;
            mz6Var.getClass();
            j7 = j8;
        }
        byte[] bArrI2 = kb0Var.i();
        byte b3 = bArrI2[0];
        long jMin2 = Math.min(j4, (i90Var.Y - j5) + 1);
        while (j7 < jMin2) {
            byte[] bArr2 = mz6Var.a;
            int iMin2 = (int) Math.min(mz6Var.c, (((long) mz6Var.b) + jMin2) - j7);
            for (int i3 = (int) ((((long) mz6Var.b) + j3) - j7); i3 < iMin2; i3++) {
                if (bArr2[i3] == b3 && b(mz6Var, i3 + 1, bArrI2, 1, i)) {
                    return ((long) (i3 - mz6Var.b)) + j7;
                }
            }
            j7 += (long) (mz6Var.c - mz6Var.b);
            mz6Var = mz6Var.f;
            mz6Var.getClass();
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean b(mz6 mz6Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = mz6Var.c;
        byte[] bArr2 = mz6Var.a;
        while (i2 < i3) {
            if (i == i4) {
                mz6Var = mz6Var.f;
                mz6Var.getClass();
                byte[] bArr3 = mz6Var.a;
                bArr2 = bArr3;
                i = mz6Var.b;
                i4 = mz6Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(i90 i90Var, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (i90Var.u(j2) == 13) {
                String strX = i90Var.X(j2, iq0.a);
                i90Var.skip(2L);
                return strX;
            }
        }
        String strX2 = i90Var.X(j, iq0.a);
        i90Var.skip(1L);
        return strX2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a1 A[LOOP:0: B:8:0x001c->B:49:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0 A[SYNTHETIC] */
    public static final int d(i90 i90Var, od5 od5Var, boolean z) {
        int i;
        int i2;
        int i3;
        mz6 mz6Var;
        int i4;
        od5Var.getClass();
        mz6 mz6Var2 = i90Var.X;
        if (mz6Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = mz6Var2.a;
        int i5 = mz6Var2.b;
        int i6 = mz6Var2.c;
        int[] iArr = od5Var.Y;
        mz6 mz6Var3 = mz6Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (mz6Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            mz6Var3 = mz6Var3.f;
                            mz6Var3.getClass();
                            int i16 = mz6Var3.b;
                            byte[] bArr2 = mz6Var3.a;
                            i2 = mz6Var3.c;
                            if (mz6Var3 == mz6Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                mz6Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        mz6Var3.getClass();
                        mz6 mz6Var4 = mz6Var3.f;
                        mz6Var4.getClass();
                        i3 = mz6Var4.b;
                        byte[] bArr3 = mz6Var4.a;
                        i4 = mz6Var4.c;
                        if (mz6Var4 != mz6Var2) {
                            mz6Var = mz6Var4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            mz6Var = null;
                        }
                    } else {
                        mz6Var = mz6Var3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        mz6Var3 = mz6Var;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    mz6Var3 = mz6Var;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
