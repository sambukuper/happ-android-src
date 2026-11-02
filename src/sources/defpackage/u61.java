package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u61 extends f1 implements q61 {
    public static final t61 Y = new t61(pz2.E0, new h80(8));

    public u61() {
        super(pz2.E0);
    }

    @Override // defpackage.f1, defpackage.s61
    public final q61 H0(r61 r61Var) {
        q61 q61Var;
        r61Var.getClass();
        if (r61Var instanceof t61) {
            t61 t61Var = (t61) r61Var;
            r61 r61Var2 = this.X;
            if ((r61Var2 == t61Var || t61Var.Y == r61Var2) && (q61Var = (q61) t61Var.X.B(this)) != null) {
                return q61Var;
            }
        } else if (pz2.E0 == r61Var) {
            return this;
        }
        return null;
    }

    public void Z0(s61 s61Var, Runnable runnable) {
        s61Var.getClass();
        runnable.getClass();
        f71.f0.Z0(s61Var, runnable);
    }

    @Override // defpackage.f1, defpackage.s61
    public final s61 a0(r61 r61Var) {
        r61Var.getClass();
        if (r61Var instanceof t61) {
            t61 t61Var = (t61) r61Var;
            r61 r61Var2 = this.X;
            if ((r61Var2 != t61Var && t61Var.Y != r61Var2) || ((q61) t61Var.X.B(this)) == null) {
                return this;
            }
        } else if (pz2.E0 != r61Var) {
            return this;
        }
        return b02.X;
    }

    public void a1(s61 s61Var, Runnable runnable) {
        op1.b(this, s61Var, runnable);
    }

    public boolean b1(s61 s61Var) {
        return !(this instanceof vl8);
    }

    public u61 c1(int i) {
        z51.r(i);
        return new u94(this, i);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + zc1.L(this);
    }
}
