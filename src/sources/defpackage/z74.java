package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z74 extends t14 {
    public final ve4 Y;
    public final dn2 Z;
    public final te4 f0;

    public z74(ve4 ve4Var, dn2 dn2Var) {
        this.Y = ve4Var;
        this.Z = dn2Var;
        this.f0 = new te4(ve4Var, dn2Var);
    }

    @Override // defpackage.t14
    public final et4 K() {
        return r0().K();
    }

    @Override // defpackage.t14
    public final List l0() {
        return r0().l0();
    }

    @Override // defpackage.t14
    public final ch8 m0() {
        return r0().m0();
    }

    @Override // defpackage.t14
    public final lh8 n0() {
        return r0().n0();
    }

    @Override // defpackage.t14
    public final boolean o0() {
        return r0().o0();
    }

    @Override // defpackage.t14
    public final t14 p0(z14 z14Var) {
        return new z74(this.Y, new zk3(z14Var, this, (byte) 14));
    }

    @Override // defpackage.t14
    public final mo8 q0() {
        t14 t14VarR0 = r0();
        while (t14VarR0 instanceof z74) {
            t14VarR0 = ((z74) t14VarR0).r0();
        }
        t14VarR0.getClass();
        return (mo8) t14VarR0;
    }

    public final t14 r0() {
        return (t14) this.f0.invoke();
    }

    public final String toString() {
        te4 te4Var = this.f0;
        return (te4Var.Z == ue4.X || te4Var.Z == ue4.Y) ? "<Not computed yet>" : r0().toString();
    }
}
