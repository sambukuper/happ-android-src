package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pu8 implements lu8 {
    public final uz4 X;
    public final vz4 Y;
    public final short Z;
    public final xx1 f0;
    public int[] g0 = ku8.a;
    public float[] h0;
    public wk i0;
    public wk j0;
    public wk k0;
    public wk l0;
    public float[] m0;
    public float[] n0;
    public wl6 o0;

    /* JADX WARN: Multi-variable type inference failed */
    public pu8(uz4 uz4Var, vz4 vz4Var, int i, xx1 xx1Var) {
        this.X = uz4Var;
        this.Y = vz4Var;
        this.Z = i;
        this.f0 = xx1Var;
        float[] fArr = ku8.b;
        this.h0 = fArr;
        this.m0 = fArr;
        this.n0 = fArr;
        this.o0 = ku8.c;
    }

    public final int b(int i) {
        int i2;
        uz4 uz4Var = this.X;
        int i3 = uz4Var.b;
        int i4 = 0;
        if (i3 <= 0) {
            kp5.k(_UrlKt.FRAGMENT_ENCODE_SET);
            return 0;
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = uz4Var.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float c(int i, int i2, boolean z) {
        xx1 xx1Var;
        float f;
        uz4 uz4Var = this.X;
        if (i >= uz4Var.b - 1) {
            f = i2;
        } else {
            int iC = uz4Var.c(i);
            int iC2 = uz4Var.c(i + 1);
            if (i2 != iC) {
                int i3 = iC2 - iC;
                ou8 ou8Var = (ou8) this.Y.b(iC);
                if (ou8Var == null || (xx1Var = ou8Var.b) == null) {
                    xx1Var = this.f0;
                }
                float f2 = i3;
                float fA = xx1Var.a((i2 - iC) / f2);
                return z ? fA : ((f2 * fA) + iC) / 1000.0f;
            }
            f = iC;
        }
        return f / 1000.0f;
    }

    public final void e(wk wkVar, wk wkVar2, wk wkVar3) {
        float[] fArr;
        boolean z = this.o0 != ku8.c;
        wk wkVar4 = this.i0;
        vz4 vz4Var = this.Y;
        uz4 uz4Var = this.X;
        if (wkVar4 == null) {
            this.i0 = wkVar.c();
            this.j0 = wkVar3.c();
            int i = uz4Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = uz4Var.c(i2) / 1000.0f;
            }
            this.h0 = fArr2;
            int i3 = uz4Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.g0 = iArr;
        }
        if (z) {
            if (this.o0 != ku8.c && dh3.f(this.k0, wkVar) && dh3.f(this.l0, wkVar2)) {
                return;
            }
            this.k0 = wkVar;
            this.l0 = wkVar2;
            int iB = wkVar.b() + (wkVar.b() % 2);
            this.m0 = new float[iB];
            this.n0 = new float[iB];
            int i5 = uz4Var.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iC = uz4Var.c(i6);
                ou8 ou8Var = (ou8) vz4Var.b(iC);
                if (iC == 0 && ou8Var == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = wkVar.a(i7);
                    }
                } else if (iC == this.Z && ou8Var == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = wkVar2.a(i8);
                    }
                } else {
                    ou8Var.getClass();
                    wk wkVar5 = ou8Var.a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = wkVar5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.o0 = new wl6(this.g0, this.h0, fArr3);
        }
    }

    @Override // defpackage.ju8
    public final wk m(long j, wk wkVar, wk wkVar2, wk wkVar3) {
        long j2 = j / 1000000;
        int[] iArr = ku8.a;
        long j3 = this.Z;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return wkVar3;
        }
        e(wkVar, wkVar2, wkVar3);
        wk wkVar4 = this.j0;
        wkVar4.getClass();
        int i = 0;
        if (this.o0 != ku8.c) {
            int i2 = (int) j4;
            float fC = c(b(i2), i2, false);
            float[] fArr = this.n0;
            xs[][] xsVarArr = (xs[][]) this.o0.Y;
            float f = xsVarArr[0][0].a;
            float f2 = xsVarArr[xsVarArr.length - 1][0].b;
            if (fC < f) {
                fC = f;
            }
            if (fC <= f2) {
                f2 = fC;
            }
            int length = fArr.length;
            boolean z = false;
            for (xs[] xsVarArr2 : xsVarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    xs xsVar = xsVarArr2[i4];
                    if (f2 <= xsVar.b) {
                        if (xsVar.p) {
                            fArr[i3] = xsVar.q;
                            fArr[i3 + 1] = xsVar.r;
                        } else {
                            xsVar.c(f2);
                            fArr[i3] = xsVar.a();
                            fArr[i3 + 1] = xsVar.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                wkVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            wk wkVarZ = z((j4 - 1) * 1000000, wkVar, wkVar2, wkVar3);
            wk wkVarZ2 = z(j4 * 1000000, wkVar, wkVar2, wkVar3);
            int iB = wkVarZ.b();
            while (i < iB) {
                wkVar4.e(i, (wkVarZ.a(i) - wkVarZ2.a(i)) * 1000.0f);
                i++;
            }
        }
        return wkVar4;
    }

    @Override // defpackage.lu8
    public final int v() {
        return 0;
    }

    @Override // defpackage.lu8
    public final int x() {
        return this.Z;
    }

    @Override // defpackage.ju8
    public final wk z(long j, wk wkVar, wk wkVar2, wk wkVar3) {
        wk wkVar4;
        wk wkVar5;
        wk wkVar6 = wkVar;
        long j2 = j / 1000000;
        int[] iArr = ku8.a;
        short s = this.Z;
        long j3 = s;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i = (int) j3;
        vz4 vz4Var = this.Y;
        ou8 ou8Var = (ou8) vz4Var.b(i);
        if (ou8Var != null) {
            return ou8Var.a;
        }
        if (i >= s) {
            return wkVar2;
        }
        if (i <= 0) {
            return wkVar6;
        }
        e(wkVar6, wkVar2, wkVar3);
        wk wkVar7 = this.i0;
        wkVar7.getClass();
        int i2 = 0;
        if (this.o0 != ku8.c) {
            float fC = c(b(i), i, false);
            float[] fArr = this.m0;
            xs[][] xsVarArr = (xs[][]) this.o0.Y;
            int length = xsVarArr.length - 1;
            float f = xsVarArr[0][0].a;
            float f2 = xsVarArr[length][0].b;
            int length2 = fArr.length;
            if (fC < f || fC > f2) {
                if (fC > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fC - f;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length2 - 1) {
                    xs xsVar = xsVarArr[length][i4];
                    boolean z = xsVar.p;
                    float f4 = xsVar.r;
                    float f5 = xsVar.q;
                    if (z) {
                        float f6 = xsVar.a;
                        float f7 = xsVar.k;
                        float f8 = xsVar.c;
                        fArr[i3] = (f5 * f3) + p61.e(xsVar.e, f8, (f - f6) * f7, f8);
                        float f9 = (f - f6) * f7;
                        float f10 = xsVar.d;
                        fArr[i3 + 1] = (f4 * f3) + p61.e(xsVar.f, f10, f9, f10);
                    } else {
                        xsVar.c(f);
                        fArr[i3] = (xsVar.a() * f3) + (xsVar.n * xsVar.h) + f5;
                        fArr[i3 + 1] = (xsVar.b() * f3) + (xsVar.o * xsVar.i) + f4;
                    }
                    i3 += 2;
                    i4++;
                    xsVarArr = xsVarArr;
                }
            } else {
                int length3 = xsVarArr.length;
                int i5 = 0;
                boolean z2 = false;
                while (i5 < length3) {
                    int i6 = i2;
                    int i7 = i6;
                    while (i6 < length2 - 1) {
                        xs xsVar2 = xsVarArr[i5][i7];
                        if (fC <= xsVar2.b) {
                            if (xsVar2.p) {
                                float f11 = xsVar2.a;
                                float f12 = xsVar2.k;
                                float f13 = xsVar2.c;
                                fArr[i6] = p61.e(xsVar2.e, f13, (fC - f11) * f12, f13);
                                float f14 = xsVar2.d;
                                fArr[i6 + 1] = p61.e(xsVar2.f, f14, (fC - f11) * f12, f14);
                            } else {
                                xsVar2.c(fC);
                                fArr[i6] = (xsVar2.n * xsVar2.h) + xsVar2.q;
                                fArr[i6 + 1] = (xsVar2.o * xsVar2.i) + xsVar2.r;
                            }
                            z2 = true;
                        }
                        i6 += 2;
                        i7++;
                    }
                    if (z2) {
                        break;
                    }
                    i5++;
                    i2 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i8 = 0; i8 < length4; i8++) {
                wkVar7.e(i8, fArr[i8]);
            }
        } else {
            int iB = b(i);
            float fC2 = c(iB, i, true);
            uz4 uz4Var = this.X;
            ou8 ou8Var2 = (ou8) vz4Var.b(uz4Var.c(iB));
            if (ou8Var2 != null && (wkVar5 = ou8Var2.a) != null) {
                wkVar6 = wkVar5;
            }
            ou8 ou8Var3 = (ou8) vz4Var.b(uz4Var.c(iB + 1));
            if (ou8Var3 == null || (wkVar4 = ou8Var3.a) == null) {
                wkVar4 = wkVar2;
            }
            int iB2 = wkVar7.b();
            for (int i9 = 0; i9 < iB2; i9++) {
                wkVar7.e(i9, (wkVar4.a(i9) * fC2) + ((1.0f - fC2) * wkVar6.a(i9)));
            }
        }
        return wkVar7;
    }
}
