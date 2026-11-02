package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zp8 implements q61 {
    public final zp8 X;
    public final ib1 Y;

    public zp8(zp8 zp8Var, ib1 ib1Var) {
        this.X = zp8Var;
        this.Y = ib1Var;
    }

    @Override // defpackage.s61
    public final /* bridge */ s61 B0(s61 s61Var) {
        return g33.K(this, s61Var);
    }

    @Override // defpackage.s61
    public final /* bridge */ q61 H0(r61 r61Var) {
        return g33.t(this, r61Var);
    }

    @Override // defpackage.s61
    public final Object U(rn2 rn2Var, Object obj) {
        return rn2Var.K(obj, this);
    }

    public final void a(ib1 ib1Var) {
        if (this.Y == ib1Var) {
            bt.i("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        zp8 zp8Var = this.X;
        if (zp8Var != null) {
            zp8Var.a(ib1Var);
        }
    }

    @Override // defpackage.s61
    public final /* bridge */ s61 a0(r61 r61Var) {
        return g33.I(this, r61Var);
    }

    @Override // defpackage.q61
    public final r61 getKey() {
        return qe4.C0;
    }
}
