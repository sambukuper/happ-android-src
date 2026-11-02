package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gm3 extends we4 implements gq1, bb3 {
    public rm3 f0;

    @Override // defpackage.gq1
    public final void a() {
        gm3 gm3Var;
        Unsafe unsafe;
        long j;
        rm3 rm3VarJ = j();
        while (true) {
            Object objM = rm3VarJ.M();
            if (objM instanceof gm3) {
                if (objM != this) {
                    return;
                }
                do {
                    unsafe = iu.a;
                    j = rm3.Y;
                    if (unsafe.compareAndSwapObject(rm3VarJ, j, objM, sm3.g)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(rm3VarJ, j) == objM);
            } else {
                if (!(objM instanceof bb3) || ((bb3) objM).l() == null) {
                    return;
                }
                while (true) {
                    Object objF = this.f();
                    if (objF instanceof ud6) {
                        return;
                    }
                    if (objF == this) {
                        return;
                    }
                    objF.getClass();
                    we4 we4Var = (we4) objF;
                    Unsafe unsafe2 = iu.a;
                    long j2 = we4.Z;
                    ud6 ud6Var = (ud6) unsafe2.getObjectVolatile(we4Var, j2);
                    if (ud6Var == null) {
                        ud6Var = new ud6(we4Var);
                        unsafe2.putObjectVolatile(we4Var, j2, ud6Var);
                    }
                    ud6 ud6Var2 = ud6Var;
                    while (true) {
                        Unsafe unsafe3 = iu.a;
                        long j3 = we4.X;
                        gm3Var = this;
                        if (unsafe3.compareAndSwapObject(gm3Var, j3, objF, ud6Var2)) {
                            we4Var.d();
                            return;
                        } else if (unsafe3.getObjectVolatile(gm3Var, j3) != objF) {
                            break;
                        } else {
                            this = gm3Var;
                        }
                    }
                    this = gm3Var;
                }
            }
        }
    }

    public final rm3 j() {
        rm3 rm3Var = this.f0;
        if (rm3Var != null) {
            return rm3Var;
        }
        dh3.T("job");
        throw null;
    }

    @Override // defpackage.bb3
    public final boolean k() {
        return true;
    }

    @Override // defpackage.bb3
    public final k55 l() {
        return null;
    }

    public boolean m() {
        return false;
    }

    public abstract void n(Throwable th);

    @Override // defpackage.we4
    public final String toString() {
        return getClass().getSimpleName() + '@' + zc1.L(this) + "[job@" + zc1.L(j()) + ']';
    }
}
