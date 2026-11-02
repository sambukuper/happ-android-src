package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uj7 implements Runnable {
    public final fv5 X;
    public final bh7 Y;
    public final boolean Z;
    public final int f0;

    public uj7(fv5 fv5Var, bh7 bh7Var, boolean z, int i) {
        fv5Var.getClass();
        bh7Var.getClass();
        this.X = fv5Var;
        this.Y = bh7Var;
        this.Z = z;
        this.f0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a59 a59VarB;
        boolean z = this.Z;
        fv5 fv5Var = this.X;
        bh7 bh7Var = this.Y;
        if (z) {
            int i = this.f0;
            fv5Var.getClass();
            String str = bh7Var.a.a;
            synchronized (fv5Var.k) {
                a59VarB = fv5Var.b(str);
            }
            fv5.d(a59VarB, i);
        } else {
            int i2 = this.f0;
            fv5Var.getClass();
            String str2 = bh7Var.a.a;
            synchronized (fv5Var.k) {
                try {
                    if (fv5Var.f.get(str2) != null) {
                        lh4.P0().getClass();
                    } else {
                        Set set = (Set) fv5Var.h.get(str2);
                        if (set != null && set.contains(bh7Var)) {
                            fv5.d(fv5Var.b(str2), i2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        lh4 lh4VarP0 = lh4.P0();
        lh4.a1("StopWorkRunnable");
        String str3 = this.Y.a.a;
        lh4VarP0.getClass();
    }
}
