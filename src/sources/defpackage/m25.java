package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m25 {
    public z47 a;
    public boolean b;

    public final void a() {
        z47 z47Var = this.a;
        if (z47Var == null) {
            bt.i("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            z47Var.s(this, null);
        }
        n25 n25Var = (n25) z47Var.Z;
        o61 o61Var = (o61) z47Var.Y;
        if (equals(n25Var.h) && -1 == n25Var.g) {
            k25 k25VarC = n25Var.f;
            if (k25VarC == null) {
                k25VarC = n25Var.c(-1);
            }
            n25Var.f = null;
            n25Var.g = 0;
            n25Var.h = null;
            if (k25VarC == null) {
                ((z95) o61Var.Y).a.run();
            } else {
                k25VarC.b();
            }
            n25Var.a.n(null, o25.i0);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
