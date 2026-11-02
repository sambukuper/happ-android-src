package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e65 extends ks0 {
    public final boolean i0;
    public final ArrayList j0;
    public final ft0 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e65(ve4 ve4Var, bt0 bt0Var, v15 v15Var, boolean z, int i) {
        super(ve4Var, bt0Var, v15Var, ke7.G);
        bt0Var.getClass();
        this.i0 = z;
        kf3 kf3VarA0 = x97.a0(0, i);
        ArrayList arrayList = new ArrayList(xv0.Z(kf3VarA0, 10));
        Iterator it = kf3VarA0.iterator();
        while (true) {
            jf3 jf3Var = (jf3) it;
            if (!jf3Var.Z) {
                this.j0 = arrayList;
                List listD = pw7.d(this);
                int i2 = el1.a;
                vx4 vx4VarC = bl1.c(this);
                vx4VarC.getClass();
                this.k0 = new ft0(this, listD, w45.U(vx4VarC.f().e()), ve4Var);
                return;
            }
            int iNextInt = jf3Var.nextInt();
            arrayList.add(ii8.K0(this, rt8.INVARIANT, v15.e("T" + iNextInt), iNextInt, ve4Var));
        }
    }

    @Override // defpackage.sx4
    public final Collection B() {
        return m02.X;
    }

    @Override // defpackage.ts4
    public final boolean C() {
        return false;
    }

    @Override // defpackage.sx4, defpackage.ts4
    public final fl1 e() {
        fl1 fl1Var = gl1.e;
        fl1Var.getClass();
        return fl1Var;
    }

    @Override // defpackage.sx4
    public final us0 g0() {
        return us0.X;
    }

    @Override // defpackage.zk
    public final sm getAnnotations() {
        return oy1.f0;
    }

    @Override // defpackage.sx4
    public final boolean i() {
        return false;
    }

    @Override // defpackage.ts4
    public final boolean j0() {
        return false;
    }

    @Override // defpackage.ks0, defpackage.ts4
    public final boolean k() {
        return false;
    }

    @Override // defpackage.sx4, defpackage.pt0
    public final List k0() {
        return this.j0;
    }

    @Override // defpackage.ot0
    public final lh8 l() {
        return this.k0;
    }

    @Override // defpackage.sx4, defpackage.ts4
    public final fx4 m() {
        return fx4.Y;
    }

    @Override // defpackage.pt0
    public final boolean n() {
        return this.i0;
    }

    @Override // defpackage.sx4
    public final et4 o0() {
        return dt4.b;
    }

    @Override // defpackage.sx4
    public final et4 s0(z14 z14Var) {
        return dt4.b;
    }

    @Override // defpackage.sx4
    public final gs0 t0() {
        return null;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // defpackage.sx4
    public final ft8 u0() {
        return null;
    }

    @Override // defpackage.sx4
    public final boolean v0() {
        return false;
    }

    @Override // defpackage.sx4
    public final boolean w0() {
        return false;
    }

    @Override // defpackage.sx4
    public final boolean x0() {
        return false;
    }

    @Override // defpackage.sx4
    public final boolean y0() {
        return false;
    }
}
