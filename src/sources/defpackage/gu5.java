package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gu5 extends zt {
    public ge7[] f;
    public ge7[] g;
    public int h;
    public zz2 i;

    @Override // defpackage.zt
    public final ge7 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            ge7[] ge7VarArr = this.f;
            ge7 ge7Var = ge7VarArr[i2];
            if (!zArr[ge7Var.Y]) {
                zz2 zz2Var = this.i;
                zz2Var.Y = ge7Var;
                int i3 = 8;
                if (i != -1) {
                    ge7 ge7Var2 = ge7VarArr[i];
                    while (i3 >= 0) {
                        float f = ge7Var2.j0[i3];
                        float f2 = ((ge7) zz2Var.Y).j0[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ((ge7) zz2Var.Y).j0[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.zt
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.zt
    public final void i(ka4 ka4Var, zt ztVar, boolean z) {
        ge7 ge7Var = ztVar.a;
        if (ge7Var == null) {
            return;
        }
        float[] fArr = ge7Var.j0;
        mt mtVar = ztVar.d;
        int iD = mtVar.d();
        for (int i = 0; i < iD; i++) {
            ge7 ge7VarE = mtVar.e(i);
            float f = mtVar.f(i);
            zz2 zz2Var = this.i;
            zz2Var.Y = ge7VarE;
            if (ge7VarE.X) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((ge7) zz2Var.Y).j0;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((ge7) zz2Var.Y).j0[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((gu5) zz2Var.Z).k((ge7) zz2Var.Y);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((ge7) zz2Var.Y).j0[i3] = f4;
                    } else {
                        ((ge7) zz2Var.Y).j0[i3] = 0.0f;
                    }
                }
                j(ge7VarE);
            }
            this.b = (ztVar.b * f) + this.b;
        }
        k(ge7Var);
    }

    public final void j(ge7 ge7Var) {
        int i;
        ge7[] ge7VarArr;
        int i2 = this.h + 1;
        ge7[] ge7VarArr2 = this.f;
        if (i2 > ge7VarArr2.length) {
            ge7[] ge7VarArr3 = (ge7[]) Arrays.copyOf(ge7VarArr2, ge7VarArr2.length * 2);
            this.f = ge7VarArr3;
            this.g = (ge7[]) Arrays.copyOf(ge7VarArr3, ge7VarArr3.length * 2);
        }
        ge7[] ge7VarArr4 = this.f;
        int i3 = this.h;
        ge7VarArr4[i3] = ge7Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && ge7VarArr4[i3].Y > ge7Var.Y) {
            int i5 = 0;
            while (true) {
                i = this.h;
                ge7VarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                ge7VarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(ge7VarArr, 0, i, new mv4((byte) 3));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        ge7Var.X = true;
        ge7Var.a(this);
    }

    public final void k(ge7 ge7Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == ge7Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        ge7Var.X = false;
                        return;
                    } else {
                        ge7[] ge7VarArr = this.f;
                        int i3 = i + 1;
                        ge7VarArr[i] = ge7VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.zt
    public final String toString() {
        zz2 zz2Var = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            zz2Var.Y = this.f[i];
            str = str + zz2Var + " ";
        }
        return str;
    }
}
