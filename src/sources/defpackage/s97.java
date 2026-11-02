package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s97 extends u1 {
    public final lv3 Y;
    public final List Z;
    public final boolean f0;
    public final g44 g0;
    public final pw3 h0;
    public final boolean i0;
    public final boolean j0;
    public final boolean k0;
    public final zu3 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s97(lv3 lv3Var, List list, boolean z, g44 g44Var, pw3 pw3Var, boolean z2, boolean z3, boolean z4, zu3 zu3Var, dn2 dn2Var) {
        super(dn2Var);
        lv3Var.getClass();
        list.getClass();
        g44Var.getClass();
        this.Y = lv3Var;
        this.Z = list;
        this.f0 = z;
        this.g0 = g44Var;
        this.h0 = pw3Var;
        this.i0 = z2;
        this.j0 = z3;
        this.k0 = z4;
        this.l0 = zu3Var;
    }

    @Override // defpackage.u1
    public final boolean B() {
        return this.j0;
    }

    @Override // defpackage.u1
    public final boolean F() {
        return false;
    }

    @Override // defpackage.u1
    public final boolean G() {
        return this.k0;
    }

    @Override // defpackage.u1
    public final u1 K() {
        return null;
    }

    @Override // defpackage.pw3
    public final List L() {
        return this.Z;
    }

    @Override // defpackage.pw3
    public final lv3 M() {
        return this.Y;
    }

    @Override // defpackage.u1
    public final u1 N(boolean z) {
        return new s97(this.Y, this.Z, this.f0 && !z, this.g0, this.h0, z, this.j0, this.k0, this.l0, null);
    }

    @Override // defpackage.u1
    public final u1 S(boolean z) {
        zu3 zu3Var;
        lv3 lv3Var = this.Y;
        boolean z2 = lv3Var instanceof zu3;
        lv3 lv3VarB = lv3Var;
        if (z2) {
            zu3Var = (zu3) lv3Var;
            if (z) {
                lv3VarB = yb6.a.b(zc1.N(zu3Var));
            } else {
                Class clsO = zc1.O(zu3Var);
                if (clsO != null) {
                    lv3VarB = zu3Var;
                    lv3VarB = yb6.a.b(clsO);
                }
            }
        }
        lv3VarB = zu3Var;
        return new s97(lv3VarB, this.Z, z, this.g0, this.h0, false, this.j0, this.k0, this.l0, null);
    }

    @Override // defpackage.u1
    public final u1 T() {
        return null;
    }

    @Override // defpackage.u1
    public final pw3 f() {
        return this.h0;
    }

    @Override // defpackage.u1
    public final g44 t() {
        return this.g0;
    }

    @Override // defpackage.u1
    public final zu3 v() {
        return this.l0;
    }

    @Override // defpackage.u1
    public final boolean x() {
        return this.i0;
    }

    @Override // defpackage.pw3
    public final boolean z() {
        return this.f0;
    }
}
