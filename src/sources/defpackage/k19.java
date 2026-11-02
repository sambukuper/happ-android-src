package defpackage;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k19 {
    public final w19 a;
    public fe3[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public k19(w19 w19Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = w19Var;
        c(w19Var);
    }

    public final void a() {
        fe3[] fe3VarArr = this.b;
        if (fe3VarArr != null) {
            fe3 fe3VarH = fe3VarArr[0];
            fe3 fe3VarH2 = fe3VarArr[1];
            w19 w19Var = this.a;
            if (fe3VarH2 == null) {
                fe3VarH2 = w19Var.a.h(2);
            }
            if (fe3VarH == null) {
                fe3VarH = w19Var.a.h(1);
            }
            h(fe3.a(fe3VarH, fe3VarH2));
            fe3 fe3Var = this.b[du7.c(16)];
            if (fe3Var != null) {
                g(fe3Var);
            }
            fe3 fe3Var2 = this.b[du7.c(32)];
            if (fe3Var2 != null) {
                e(fe3Var2);
            }
            fe3 fe3Var3 = this.b[du7.c(64)];
            if (fe3Var3 != null) {
                i(fe3Var3);
            }
        }
    }

    public abstract w19 b();

    public void c(w19 w19Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listE = w19Var.a.e(i);
            int iC = du7.c(i);
            this.c[iC] = (Rect[]) listE.toArray(new Rect[listE.size()]);
            if (i != 8) {
                List<Rect> listF = w19Var.a.f(i);
                this.d[iC] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            }
        }
    }

    public void d(int i, fe3 fe3Var) {
        if (this.b == null) {
            this.b = new fe3[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[du7.c(i2)] = fe3Var;
            }
        }
    }

    public abstract void f(fe3 fe3Var);

    public abstract void h(fe3 fe3Var);

    public k19() {
        this(new w19());
    }

    public void e(fe3 fe3Var) {
    }

    public void g(fe3 fe3Var) {
    }

    public void i(fe3 fe3Var) {
    }
}
