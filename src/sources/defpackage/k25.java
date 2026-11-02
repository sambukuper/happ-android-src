package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k25 {
    public ys0 a;
    public boolean b;
    public z47 c;

    public abstract void b();

    public void d(i25 i25Var) {
        i25Var.getClass();
    }

    public final void e() {
        z47 z47Var = this.c;
        if (z47Var == null || !((LinkedHashSet) z47Var.f0).remove(this)) {
            return;
        }
        n25 n25Var = (n25) z47Var.Z;
        if (equals(n25Var.f)) {
            if (n25Var.g == -1) {
                a();
            }
            n25Var.f = null;
            n25Var.g = 0;
            n25Var.h = null;
        }
        n25Var.d.remove(this);
        n25Var.e.remove(this);
        this.c = null;
        n25Var.b();
    }

    public final void f(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        z47 z47Var = this.c;
        if (z47Var != null) {
            ((n25) z47Var.Z).b();
        }
    }

    public void a() {
    }

    public void c(i25 i25Var) {
    }
}
