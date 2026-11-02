package defpackage;

import java.util.ArrayList;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class zt {
    public final mt d;
    public ge7 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public zt(lr lrVar) {
        this.d = new mt(this, lrVar);
    }

    public final void a(ka4 ka4Var, int i) {
        ge7 ge7VarJ = ka4Var.j(i);
        mt mtVar = this.d;
        mtVar.g(ge7VarJ, 1.0f);
        mtVar.g(ka4Var.j(i), -1.0f);
    }

    public final void b(ge7 ge7Var, ge7 ge7Var2, ge7 ge7Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        mt mtVar = this.d;
        if (z) {
            mtVar.g(ge7Var, 1.0f);
            mtVar.g(ge7Var2, -1.0f);
            mtVar.g(ge7Var3, -1.0f);
        } else {
            mtVar.g(ge7Var, -1.0f);
            mtVar.g(ge7Var2, 1.0f);
            mtVar.g(ge7Var3, 1.0f);
        }
    }

    public final void c(ge7 ge7Var, ge7 ge7Var2, ge7 ge7Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        mt mtVar = this.d;
        if (z) {
            mtVar.g(ge7Var, 1.0f);
            mtVar.g(ge7Var2, -1.0f);
            mtVar.g(ge7Var3, 1.0f);
        } else {
            mtVar.g(ge7Var, -1.0f);
            mtVar.g(ge7Var2, 1.0f);
            mtVar.g(ge7Var3, -1.0f);
        }
    }

    public ge7 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final ge7 f(boolean[] zArr, ge7 ge7Var) {
        int i;
        mt mtVar = this.d;
        int iD = mtVar.d();
        ge7 ge7Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iD; i2++) {
            float f2 = mtVar.f(i2);
            if (f2 < 0.0f) {
                ge7 ge7VarE = mtVar.e(i2);
                if ((zArr == null || !zArr[ge7VarE.Y]) && ge7VarE != ge7Var && (((i = ge7VarE.n0) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    ge7Var2 = ge7VarE;
                }
            }
        }
        return ge7Var2;
    }

    public final void g(ge7 ge7Var) {
        ge7 ge7Var2 = this.a;
        mt mtVar = this.d;
        if (ge7Var2 != null) {
            mtVar.g(ge7Var2, -1.0f);
            this.a.Z = -1;
            this.a = null;
        }
        float fH = mtVar.h(ge7Var, true) * (-1.0f);
        this.a = ge7Var;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        int i = mtVar.h;
        for (int i2 = 0; i != -1 && i2 < mtVar.a; i2++) {
            float[] fArr = mtVar.g;
            fArr[i] = fArr[i] / fH;
            i = mtVar.f[i];
        }
    }

    public final void h(ka4 ka4Var, ge7 ge7Var, boolean z) {
        if (ge7Var.h0) {
            mt mtVar = this.d;
            float fC = mtVar.c(ge7Var);
            this.b = (ge7Var.g0 * fC) + this.b;
            mtVar.h(ge7Var, z);
            if (z) {
                ge7Var.b(this);
            }
            if (mtVar.d() == 0) {
                this.e = true;
                ka4Var.b = true;
            }
        }
    }

    public void i(ka4 ka4Var, zt ztVar, boolean z) {
        mt mtVar = this.d;
        mtVar.getClass();
        float fC = mtVar.c(ztVar.a);
        mtVar.h(ztVar.a, z);
        mt mtVar2 = ztVar.d;
        int iD = mtVar2.d();
        for (int i = 0; i < iD; i++) {
            ge7 ge7VarE = mtVar2.e(i);
            mtVar.a(ge7VarE, mtVar2.c(ge7VarE) * fC, z);
        }
        this.b = (ztVar.b * fC) + this.b;
        if (z) {
            ztVar.a.b(this);
        }
        if (this.a == null || mtVar.d() != 0) {
            return;
        }
        this.e = true;
        ka4Var.b = true;
    }

    public String toString() {
        boolean z;
        String strConcat = (this.a == null ? "0" : _UrlKt.FRAGMENT_ENCODE_SET + this.a).concat(" = ");
        if (this.b != 0.0f) {
            strConcat = strConcat + this.b;
            z = true;
        } else {
            z = false;
        }
        mt mtVar = this.d;
        int iD = mtVar.d();
        for (int i = 0; i < iD; i++) {
            ge7 ge7VarE = mtVar.e(i);
            if (ge7VarE != null) {
                float f = mtVar.f(i);
                if (f != 0.0f) {
                    String string = ge7VarE.toString();
                    if (z) {
                        if (f > 0.0f) {
                            strConcat = strConcat.concat(" + ");
                        } else {
                            strConcat = strConcat.concat(" - ");
                            f *= -1.0f;
                        }
                    } else if (f < 0.0f) {
                        strConcat = strConcat.concat("- ");
                        f *= -1.0f;
                    }
                    strConcat = f == 1.0f ? strConcat.concat(string) : strConcat + f + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }
}
