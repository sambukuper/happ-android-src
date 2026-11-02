package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p15 implements lm0, vz8 {
    public final mm0 X;
    public final /* synthetic */ q15 Y;

    public p15(q15 q15Var, mm0 mm0Var) {
        this.Y = q15Var;
        this.X = mm0Var;
    }

    @Override // defpackage.lm0
    public final void E(Object obj) {
        this.X.E(obj);
    }

    @Override // defpackage.vz8
    public final void a(nz6 nz6Var, int i) {
        this.X.a(nz6Var, i);
    }

    @Override // defpackage.q51
    public final void f(Object obj) {
        this.X.f(obj);
    }

    @Override // defpackage.lm0
    public final z31 j(Object obj, sn2 sn2Var) {
        q15 q15Var = this.Y;
        m30 m30Var = new m30(q15Var, this);
        z31 z31VarH = this.X.H((dn8) obj, m30Var);
        if (z31VarH != null) {
            q15.k0.set(q15Var, null);
        }
        return z31VarH;
    }

    @Override // defpackage.q51
    public final s61 w() {
        return this.X.g0;
    }

    @Override // defpackage.lm0
    public final void y(Object obj, sn2 sn2Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q15.k0;
        q15 q15Var = this.Y;
        atomicReferenceFieldUpdater.set(q15Var, null);
        vj2 vj2Var = new vj2(q15Var, this);
        mm0 mm0Var = this.X;
        mm0Var.D((dn8) obj, mm0Var.Z, new m30((Object) vj2Var, (byte) 2));
    }

    @Override // defpackage.lm0
    public final boolean z(Throwable th) {
        return this.X.z(th);
    }
}
