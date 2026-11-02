package defpackage;

import java.util.MissingResourceException;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o95 extends g40 {
    public static final boolean q0 = h33.a("olson");
    public final int h0;
    public final int i0;
    public final long[] j0;
    public final int[] k0;
    public final byte[] l0;
    public final int m0;
    public final double n0;
    public z97 o0;
    public volatile transient boolean p0;

    /* JADX WARN: Multi-variable type inference failed */
    public o95(al8 al8Var, al8 al8Var2, String str) {
        int[] iArrG;
        int[] iArrG2;
        int[] iArrG3;
        int i;
        String str2;
        int i2;
        String str3;
        String string;
        char c;
        long j;
        int i3;
        super(str);
        this.m0 = Integer.MAX_VALUE;
        this.n0 = Double.MAX_VALUE;
        this.o0 = null;
        int i4 = 0;
        this.p0 = false;
        String str4 = "Invalid Format";
        if (q0) {
            System.out.println("OlsonTimeZone(" + al8Var2.i() + ")");
        }
        this.h0 = 0;
        try {
            iArrG = al8Var2.c("transPre32").g();
            try {
                if (iArrG.length % 2 != 0) {
                    throw new IllegalArgumentException("Invalid Format");
                }
                this.h0 += iArrG.length / 2;
                try {
                    iArrG2 = al8Var2.c("trans").g();
                    try {
                        this.h0 += iArrG2.length;
                    } catch (MissingResourceException unused) {
                    }
                } catch (MissingResourceException unused2) {
                    iArrG2 = null;
                }
                try {
                    iArrG3 = al8Var2.c("transPost32").g();
                    try {
                        if (iArrG3.length % 2 != 0) {
                            throw new IllegalArgumentException("Invalid Format");
                        }
                        this.h0 += iArrG3.length / 2;
                        int i5 = this.h0;
                        if (i5 > 0) {
                            this.j0 = new long[i5];
                            if (iArrG != null) {
                                int i6 = 0;
                                i3 = 0;
                                c = ' ';
                                j = 4294967295L;
                                while (i6 < iArrG.length / 2) {
                                    int i7 = i6 * 2;
                                    this.j0[i3] = (((long) iArrG[i7 + 1]) & 4294967295L) | ((((long) iArrG[i7]) & 4294967295L) << 32);
                                    i6++;
                                    i3++;
                                    i4 = i4;
                                    str4 = str4;
                                }
                                i = i4;
                            } else {
                                i = 0;
                                c = ' ';
                                j = 4294967295L;
                                i3 = 0;
                            }
                            str2 = str4;
                            i2 = 1;
                            if (iArrG2 != null) {
                                int i8 = i;
                                while (i8 < iArrG2.length) {
                                    this.j0[i3] = iArrG2[i8];
                                    i8++;
                                    i3++;
                                }
                            }
                            if (iArrG3 != null) {
                                int i9 = i;
                                while (i9 < iArrG3.length / 2) {
                                    int i10 = i9 * 2;
                                    this.j0[i3] = (((long) iArrG3[i10 + 1]) & j) | ((((long) iArrG3[i10]) & j) << c);
                                    i9++;
                                    i3++;
                                }
                            }
                        } else {
                            i = 0;
                            str2 = "Invalid Format";
                            i2 = 1;
                            this.j0 = null;
                        }
                        int[] iArrG4 = al8Var2.c("typeOffsets").g();
                        this.k0 = iArrG4;
                        if (iArrG4.length < 2 || iArrG4.length > 32766 || iArrG4.length % 2 != 0) {
                            bt.q(str2);
                            throw null;
                        }
                        this.i0 = iArrG4.length / 2;
                        if (this.h0 > 0) {
                            byte[] bArrE = al8Var2.c("typeMap").e();
                            this.l0 = bArrE;
                            if (bArrE == null || bArrE.length != this.h0) {
                                bt.q(str2);
                                throw null;
                            }
                        } else {
                            this.l0 = null;
                        }
                        this.o0 = null;
                        this.m0 = Integer.MAX_VALUE;
                        this.n0 = Double.MAX_VALUE;
                        try {
                            string = al8Var2.getString("finalRule");
                            try {
                                int iF = al8Var2.c("finalRaw").f() * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
                                int[] iArrG5 = al8Var.c("Rules").c(string).g();
                                if (iArrG5 == null || iArrG5.length != 11) {
                                    str3 = str2;
                                    try {
                                        throw new IllegalArgumentException(str3);
                                    } catch (MissingResourceException unused3) {
                                        if (string == null) {
                                            return;
                                        }
                                        bt.q(str3);
                                        throw null;
                                    }
                                }
                                int i11 = iArrG5[i];
                                int i12 = iArrG5[i2];
                                int i13 = iArrG5[2];
                                int i14 = iArrG5[3] * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
                                int i15 = iArrG5[4];
                                int i16 = iArrG5[5];
                                int i17 = iArrG5[6];
                                int i18 = iArrG5[7];
                                int i19 = iArrG5[8] * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
                                int i20 = iArrG5[9];
                                int i21 = iArrG5[10] * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
                                z97 z97Var = new z97();
                                z97Var.X = str;
                                z97Var.i0 = 3600000;
                                z97Var.x0 = i;
                                z97Var.i(iF, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21);
                                this.o0 = z97Var;
                                int iF2 = al8Var2.c("finalYear").f();
                                this.m0 = iF2;
                                this.n0 = km4.A(iF2, 0, i2) * 86400000;
                            } catch (MissingResourceException unused4) {
                                str3 = str2;
                            }
                        } catch (MissingResourceException unused5) {
                            str3 = str2;
                            string = null;
                        }
                    } catch (MissingResourceException unused6) {
                    }
                } catch (MissingResourceException unused7) {
                    iArrG3 = null;
                }
            } catch (MissingResourceException unused8) {
            }
        } catch (MissingResourceException unused9) {
            iArrG = null;
        }
    }

    @Override // defpackage.qa8
    public final qa8 a() {
        o95 o95Var = (o95) super.a();
        z97 z97Var = this.o0;
        if (z97Var != null) {
            o95Var.o0 = (z97) z97Var.clone();
        }
        o95Var.p0 = false;
        return o95Var;
    }

    @Override // defpackage.qa8
    public final Object clone() {
        return this.p0 ? this : a();
    }

    @Override // defpackage.qa8
    public final int d(int i, int i2, int i3, int i4, int i5) {
        if (i2 < 0 || i2 > 11) {
            bt.q(pc6.j(i2, "Month is not in the legal range: "));
            return 0;
        }
        int iE0 = km4.e0(i, i2);
        if (i2 < 0 || i2 > 11 || i3 < 1 || i3 > iE0 || i4 < 1 || i4 > 7 || i5 < 0 || i5 >= 86400000 || iE0 < 28 || iE0 > 31) {
            kp5.e();
            return 0;
        }
        z97 z97Var = this.o0;
        if (z97Var != null && i >= this.m0) {
            return z97Var.d(i, i2, i3, i4, i5);
        }
        int[] iArr = new int[2];
        i((km4.A(i, i2, i3) * 86400000) + ((long) i5), true, 3, 1, iArr);
        return iArr[0] + iArr[1];
    }

    @Override // defpackage.qa8
    public final void e(long j, boolean z, int[] iArr) {
        z97 z97Var = this.o0;
        if (z97Var == null || j < this.n0) {
            i(j, z, 4, 12, iArr);
        } else {
            z97Var.e(j, z, iArr);
        }
    }

    @Override // defpackage.qa8
    public final boolean equals(Object obj) {
        z97 z97Var;
        if (!super.equals(obj)) {
            return false;
        }
        o95 o95Var = (o95) obj;
        byte[] bArr = o95Var.l0;
        byte[] bArr2 = this.l0;
        if (ns8.b(bArr2, bArr)) {
            return true;
        }
        if (this.m0 == o95Var.m0) {
            z97 z97Var2 = this.o0;
            if (z97Var2 == null && o95Var.o0 == null) {
                return true;
            }
            if (z97Var2 != null && (z97Var = o95Var.o0) != null && z97Var2.equals(z97Var) && this.h0 == o95Var.h0 && this.i0 == o95Var.i0 && ns8.a(this.j0, o95Var.j0) && ns8.c(this.k0, o95Var.k0) && ns8.b(bArr2, o95Var.l0)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qa8
    public final int f() {
        int[] iArr = new int[2];
        e(System.currentTimeMillis(), false, iArr);
        return iArr[0];
    }

    @Override // defpackage.g40
    public final void g(long j, int[] iArr) {
        z97 z97Var = this.o0;
        if (z97Var == null || j < this.n0) {
            i(j, true, p61.c(1), p61.c(2), iArr);
        } else {
            z97Var.g(j, iArr);
        }
    }

    public final int h(int i) {
        return this.k0[(i >= 0 ? (this.l0[i] & 255) * 2 : 0) + 1];
    }

    @Override // defpackage.qa8
    public final int hashCode() {
        int i = this.m0;
        int i2 = this.h0;
        int i3 = i ^ ((i >>> 4) + i2);
        int i4 = i2 >>> 6;
        int i5 = this.i0;
        long j = i3 ^ (i4 + i5);
        long jDoubleToLongBits = Double.doubleToLongBits(this.n0) + ((long) (i5 >>> 8));
        z97 z97Var = this.o0;
        int i6 = 0;
        int iHashCode = (int) (j ^ ((jDoubleToLongBits + ((long) (z97Var == null ? 0 : z97Var.hashCode()))) + ((long) this.X.hashCode())));
        if (this.j0 != null) {
            int i7 = 0;
            while (true) {
                long[] jArr = this.j0;
                if (i7 >= jArr.length) {
                    break;
                }
                long j2 = jArr[i7];
                iHashCode = (int) (((long) iHashCode) + (j2 ^ (j2 >>> 8)));
                i7++;
            }
        }
        int i8 = 0;
        while (true) {
            int[] iArr = this.k0;
            if (i8 >= iArr.length) {
                break;
            }
            int i9 = iArr[i8];
            iHashCode += i9 ^ (i9 >>> 8);
            i8++;
        }
        if (this.l0 != null) {
            while (true) {
                byte[] bArr = this.l0;
                if (i6 >= bArr.length) {
                    break;
                }
                iHashCode += bArr[i6] & 255;
                i6++;
            }
        }
        return iHashCode;
    }

    public final void i(long j, boolean z, int i, int i2, int[] iArr) {
        byte[] bArr;
        int i3;
        int i4;
        int[] iArr2 = this.k0;
        int i5 = 0;
        int i6 = this.h0;
        if (i6 == 0) {
            iArr[0] = iArr2[0] * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
            iArr[1] = iArr2[1] * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
            return;
        }
        long jB = km4.B(j, 1000L);
        long[] jArr = this.j0;
        if (!z && jB < jArr[0]) {
            iArr[0] = iArr2[0] * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
            iArr[1] = iArr2[1] * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
            return;
        }
        int i7 = i6 - 1;
        while (true) {
            bArr = this.l0;
            if (i7 < 0) {
                i5 = i5;
                break;
            }
            long j2 = jArr[i7];
            if (z && jB >= j2 - 86400) {
                int i8 = i7 - 1;
                int i9 = i8 >= 0 ? (bArr[i8] & 255) * 2 : i5;
                int i10 = iArr2[i9] + iArr2[i9 + 1];
                int i11 = h(i8) != 0 ? 1 : i5;
                int i12 = i7 >= 0 ? (bArr[i7] & 255) * 2 : i5;
                int i13 = iArr2[i12] + iArr2[i12 + 1];
                int i14 = h(i7) != 0 ? 1 : i5;
                int i15 = (i11 == 0 || i14 != 0) ? i5 : 1;
                int i16 = (i11 != 0 || i14 == 0) ? i5 : 1;
                j2 += (i13 - i10 < 0 ? ((i3 = i2 & 3) != 1 || i15 == 0) && ((i3 != 3 || i16 == 0) && ((i3 == 1 && i16 != 0) || ((i3 == 3 && i15 != 0) || (i2 & 12) == 4))) : ((i4 = i & 3) == 1 && i15 != 0) || ((i4 == 3 && i16 != 0) || ((i4 != 1 || i16 == 0) && ((i4 != 3 || i15 == 0) && (i & 12) == 12)))) ? i10 : i13;
            }
            if (jB >= j2) {
                break;
            }
            i7--;
            i5 = i5;
        }
        iArr[i5] = iArr2[i7 >= 0 ? (bArr[i7] & 255) * 2 : i5] * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
        iArr[1] = h(i7) * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
    }

    @Override // defpackage.qa8
    public final boolean isFrozen() {
        return this.p0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('[');
        sb.append("transitionCount=" + this.h0);
        sb.append(",typeCount=" + this.i0);
        sb.append(",transitionTimes=");
        long[] jArr = this.j0;
        if (jArr != null) {
            sb.append('[');
            for (int i = 0; i < jArr.length; i++) {
                if (i > 0) {
                    sb.append(',');
                }
                sb.append(Long.toString(jArr[i]));
            }
            sb.append(']');
        } else {
            sb.append("null");
        }
        sb.append(",typeOffsets=");
        int[] iArr = this.k0;
        if (iArr != null) {
            sb.append('[');
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if (i2 > 0) {
                    sb.append(',');
                }
                sb.append(Integer.toString(iArr[i2]));
            }
            sb.append(']');
        } else {
            sb.append("null");
        }
        sb.append(",typeMapData=");
        byte[] bArr = this.l0;
        if (bArr != null) {
            sb.append('[');
            for (int i3 = 0; i3 < bArr.length; i3++) {
                if (i3 > 0) {
                    sb.append(',');
                }
                sb.append(Byte.toString(bArr[i3]));
            }
        } else {
            sb.append("null");
        }
        sb.append(",finalStartYear=" + this.m0);
        sb.append(",finalStartMillis=" + this.n0);
        sb.append(",finalZone=" + this.o0);
        sb.append(']');
        return sb.toString();
    }
}
