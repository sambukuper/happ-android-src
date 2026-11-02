package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z97 extends g40 {
    public static final byte[] y0 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public boolean u0;
    public byte v0;
    public byte w0;
    public volatile transient boolean x0;

    public static int h(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13;
        int i14 = i6 + i7;
        while (i14 >= 86400000) {
            i14 -= 86400000;
            i4++;
            i5 = (i5 % 7) + 1;
            if (i4 > i2) {
                i++;
                i4 = 1;
            }
        }
        while (i14 < 0) {
            i4--;
            i5 = ((i5 + 5) % 7) + 1;
            if (i4 < 1) {
                i--;
                i4 = i3;
            }
            i14 += 86400000;
        }
        if (i < i9) {
            return -1;
        }
        if (i <= i9) {
            if (i11 > i2) {
                i11 = i2;
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        i11 = i8 != 4 ? 0 : i11 - (((((49 - i10) + i11) + i5) - i4) % 7);
                    } else {
                        i13 = ((((i10 + 49) - i11) - i5) + i4) % 7;
                        i11 += i13;
                    }
                } else if (i11 > 0) {
                    i11 = ((i11 - 1) * 7) + 1;
                    i13 = ((i10 + 7) - ((i5 - i4) + 1)) % 7;
                    i11 += i13;
                } else {
                    i11 = (((i11 + 1) * 7) + i2) - (((((i5 + i2) - i4) + 7) - i10) % 7);
                }
            }
            if (i4 < i11) {
                return -1;
            }
            if (i4 <= i11) {
                if (i14 < i12) {
                    return -1;
                }
                if (i14 <= i12) {
                    return 0;
                }
            }
        }
        return 1;
    }

    @Override // defpackage.qa8
    public final qa8 a() {
        z97 z97Var = (z97) super.a();
        z97Var.x0 = false;
        return z97Var;
    }

    @Override // defpackage.qa8
    public final Object clone() {
        return this.x0 ? this : a();
    }

    @Override // defpackage.qa8
    public final int d(int i, int i2, int i3, int i4, int i5) {
        int iH;
        int i6;
        int i7;
        if (i2 < 0 || i2 > 11) {
            kp5.e();
            return 0;
        }
        km4.e0(i, i2);
        if (i2 < 0 || i2 > 11) {
            kp5.e();
            return 0;
        }
        int iE0 = km4.e0(i, i2);
        int iE1 = i2 > 0 ? km4.e0(i, i2 - 1) : 31;
        if (i2 < 0 || i2 > 11 || i3 < 1 || i3 > iE0 || i4 < 1 || i4 > 7 || i5 < 0 || i5 >= 86400000 || iE0 < 28 || iE0 > 31 || iE1 < 28 || iE1 > 31) {
            kp5.e();
            return 0;
        }
        int i8 = this.h0;
        if (!this.u0 || i < this.t0) {
            return i8;
        }
        int i9 = iE1;
        int i10 = this.j0;
        boolean z = i10 > this.p0;
        int iH2 = h(i2, iE0, i9, i3, i4, i5, this.n0 == 2 ? -i8 : 0, this.v0, i10, this.l0, this.k0, this.m0);
        if (z != (iH2 >= 0)) {
            int i11 = this.o0;
            if (i11 == 0) {
                i7 = this.i0;
            } else {
                if (i11 == 2) {
                    i7 = -this.h0;
                } else {
                    i6 = 0;
                }
                iH = h(i2, iE0, i9, i3, i4, i5, i6, this.w0, this.p0, this.r0, this.q0, this.s0);
            }
            i6 = i7;
            iH = h(i2, iE0, i9, i3, i4, i5, i6, this.w0, this.p0, this.r0, this.q0, this.s0);
        } else {
            iH = 0;
        }
        if (z || iH2 < 0 || iH >= 0) {
            if (!z) {
                return i8;
            }
            if (iH2 < 0 && iH >= 0) {
                return i8;
            }
        }
        return i8 + this.i0;
    }

    @Override // defpackage.qa8
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && z97.class == obj.getClass()) {
                z97 z97Var = (z97) obj;
                if (this.h0 == z97Var.h0 && this.u0 == z97Var.u0) {
                    String str = this.X;
                    String str2 = z97Var.X;
                    if (str == null && str2 == null) {
                        zEquals = true;
                    } else {
                        zEquals = (str == null || str2 == null) ? false : str.equals(str2);
                    }
                    if (!zEquals || (this.u0 && (this.i0 != z97Var.i0 || this.v0 != z97Var.v0 || this.j0 != z97Var.j0 || this.k0 != z97Var.k0 || this.l0 != z97Var.l0 || this.m0 != z97Var.m0 || this.n0 != z97Var.n0 || this.w0 != z97Var.w0 || this.p0 != z97Var.p0 || this.q0 != z97Var.q0 || this.r0 != z97Var.r0 || this.s0 != z97Var.s0 || this.o0 != z97Var.o0 || this.t0 != z97Var.t0))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.qa8
    public final int f() {
        return this.h0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    @Override // defpackage.g40
    public final void g(long j, int[] iArr) {
        int i;
        long j2;
        boolean z;
        byte bC = p61.c(1);
        byte bC2 = p61.c(2);
        iArr[0] = this.h0;
        int[] iArr2 = new int[6];
        km4.o0(j, iArr2);
        int iD = d(iArr2[0], iArr2[1], iArr2[2], iArr2[3], iArr2[5]) - iArr[0];
        iArr[1] = iD;
        if (iD > 0) {
            int i2 = bC & 3;
            if (i2 == 1 || !(i2 == 3 || (bC & 12) == 12)) {
                i = this.i0;
                j2 = j - ((long) i);
                z = true;
            } else {
                j2 = j;
                z = false;
            }
        } else {
            int i3 = bC2 & 3;
            if (i3 == 3 || (i3 != 1 && (bC2 & 12) == 4)) {
                i = this.i0;
                j2 = j - ((long) i);
                z = true;
            } else {
                j2 = j;
                z = false;
            }
        }
        if (z) {
            km4.o0(j2, iArr2);
            iArr[1] = d(iArr2[0], iArr2[1], iArr2[2], iArr2[3], iArr2[5]) - iArr[0];
        }
    }

    @Override // defpackage.qa8
    public final int hashCode() {
        int iHashCode = this.X.hashCode();
        int i = this.h0;
        boolean z = this.u0;
        int i2 = (iHashCode + i) ^ ((i >>> 8) + (!z ? 1 : 0));
        if (z) {
            return i2;
        }
        int i3 = this.i0;
        int i4 = i3 ^ ((i3 >>> 10) + this.v0);
        int i5 = this.j0;
        int i6 = this.k0;
        int i7 = (i4 ^ i5) ^ ((i5 >>> 12) + i6);
        int i8 = i6 >>> 13;
        int i9 = this.l0;
        int i10 = i7 ^ (i8 + i9);
        int i11 = i9 >>> 14;
        int i12 = this.m0;
        int i13 = i10 ^ (i11 + i12);
        int i14 = i12 >>> 15;
        int i15 = this.n0;
        int i16 = (i13 ^ (i14 + i15)) ^ ((i15 >>> 16) + this.w0);
        int i17 = this.p0;
        int i18 = this.q0;
        int i19 = (i16 ^ i17) ^ ((i17 >>> 18) + i18);
        int i20 = i18 >>> 19;
        int i21 = this.r0;
        int i22 = i19 ^ (i20 + i21);
        int i23 = i21 >>> 20;
        int i24 = this.s0;
        int i25 = i22 ^ (i23 + i24);
        int i26 = i24 >>> 21;
        int i27 = this.o0;
        int i28 = this.t0;
        return i2 + ((i28 >>> 23) ^ ((i25 ^ (i26 + i27)) ^ ((i27 >>> 22) + i28)));
    }

    public final void i(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        char c;
        char c2;
        char c3;
        int i16;
        char c4;
        int i17 = i3;
        int i18 = i8;
        this.h0 = i;
        this.j0 = i2;
        this.k0 = i17;
        this.l0 = i4;
        this.m0 = i5;
        this.n0 = i6;
        this.p0 = i7;
        this.q0 = i18;
        this.r0 = i9;
        this.s0 = i10;
        this.o0 = i11;
        this.i0 = i12;
        this.t0 = 0;
        this.v0 = (byte) 1;
        this.w0 = (byte) 1;
        boolean z = (i17 == 0 || i18 == 0) ? false : true;
        this.u0 = z;
        if (z && i12 == 0) {
            this.i0 = 86400000;
            i13 = 86400000;
        } else {
            i13 = i12;
        }
        byte[] bArr = y0;
        if (i17 == 0) {
            i14 = i17;
        } else {
            if (i2 < 0 || i2 > 11) {
                kp5.e();
                return;
            }
            if (i5 < 0 || i5 > 86400000 || i6 < 0 || i6 > 2) {
                kp5.e();
                return;
            }
            if (i4 == 0) {
                this.v0 = (byte) 1;
                i14 = i17;
                c4 = 1;
            } else {
                if (i4 > 0) {
                    this.v0 = (byte) 2;
                    i16 = i4;
                    c4 = 2;
                } else {
                    int i19 = -i4;
                    this.l0 = i19;
                    if (i17 > 0) {
                        this.v0 = (byte) 3;
                        i16 = i19;
                        c4 = 3;
                    } else {
                        i17 = -i17;
                        this.k0 = i17;
                        this.v0 = (byte) 4;
                        i16 = i19;
                        c4 = 4;
                    }
                }
                i14 = i17;
                if (i16 > 7) {
                    kp5.e();
                    return;
                }
            }
            if (c4 == 2) {
                if (i17 < -5 || i17 > 5) {
                    kp5.e();
                    return;
                }
            } else if (i17 < 1 || i17 > bArr[i2]) {
                kp5.e();
                return;
            }
        }
        boolean z2 = (i14 == 0 || i18 == 0) ? false : true;
        this.u0 = z2;
        if (z2 && i13 == 0) {
            this.i0 = 86400000;
        }
        if (i18 != 0) {
            if (i7 < 0 || i7 > 11) {
                kp5.e();
                return;
            }
            if (i10 < 0 || i10 > 86400000 || i11 < 0 || i11 > 2) {
                kp5.e();
                return;
            }
            if (i9 == 0) {
                this.w0 = (byte) 1;
                c3 = 1;
            } else {
                if (i9 > 0) {
                    this.w0 = (byte) 2;
                    i15 = i9;
                    c2 = 2;
                } else {
                    i15 = -i9;
                    this.r0 = i15;
                    if (i18 > 0) {
                        c = 3;
                        this.w0 = (byte) 3;
                    } else {
                        int i20 = -i18;
                        this.q0 = i20;
                        c = 4;
                        this.w0 = (byte) 4;
                        i18 = i20;
                    }
                    c2 = c;
                }
                if (i15 > 7) {
                    kp5.e();
                    return;
                }
                c3 = c2;
            }
            if (c3 == 2) {
                if (i18 < -5 || i18 > 5) {
                    kp5.e();
                    return;
                }
            } else if (i18 < 1 || i18 > bArr[i7]) {
                kp5.e();
                return;
            }
        }
        if (i12 != 0) {
            return;
        }
        kp5.e();
    }

    @Override // defpackage.qa8
    public final boolean isFrozen() {
        return this.x0;
    }

    public final String toString() {
        return "SimpleTimeZone: " + this.X;
    }
}
