package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s51 extends r10 {
    public final s61 Y;
    public transient q51 Z;

    public s51(q51 q51Var) {
        this(q51Var, q51Var != null ? q51Var.w() : null);
    }

    @Override // defpackage.r10
    public void r() {
        Unsafe unsafe;
        long j;
        q51 q51Var = this.Z;
        if (q51Var != null && q51Var != this) {
            q61 q61VarH0 = w().H0(pz2.E0);
            q61VarH0.getClass();
            np1 np1Var = (np1) q51Var;
            do {
                unsafe = iu.a;
                j = np1.j0;
            } while (unsafe.getObjectVolatile(np1Var, j) == op1.b);
            Object objectVolatile = unsafe.getObjectVolatile(np1Var, j);
            mm0 mm0Var = objectVolatile instanceof mm0 ? (mm0) objectVolatile : null;
            if (mm0Var != null) {
                mm0Var.n();
            }
        }
        this.Z = wx0.Y;
    }

    @Override // defpackage.q51
    public s61 w() {
        s61 s61Var = this.Y;
        s61Var.getClass();
        return s61Var;
    }

    public s51(q51 q51Var, s61 s61Var) {
        super(q51Var);
        this.Y = s61Var;
    }
}
