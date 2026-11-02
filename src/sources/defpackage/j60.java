package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j60 extends jx4 implements g34, w07 {
    public gn2 q0;

    public j60(gn2 gn2Var) {
        this.q0 = gn2Var;
    }

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        eo5 eo5VarO = tr4Var.o(j);
        return zr4Var.g0(eo5VarO.X, eo5VarO.Y, e02.X, new p0(eo5VarO, this, (byte) 8));
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    @Override // defpackage.w07
    public final void h(f17 f17Var) {
        x67 x67Var;
        boolean z;
        i55 i55VarX = yn0.X(this, 2);
        if (i55VarX.P0) {
            x67Var = i55VarX.L0;
            z = i55VarX.O0;
        } else {
            pk6 pk6Var = jm4.f0;
            if (pk6Var == null) {
                jm4.f0 = new pk6();
            } else {
                pk6Var.a();
            }
            pk6 pk6Var2 = jm4.f0;
            pk6Var2.getClass();
            pk6Var2.v0 = i55VarX.w0.A0;
            pk6Var2.t0 = u15.R(i55VarX.Z);
            dd7 dd7VarD = yn0.D();
            gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
            dd7 dd7VarP = yn0.P(dd7VarD);
            try {
                this.q0.B(pk6Var2);
                yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                x67Var = pk6Var2.q0;
                z = pk6Var2.r0;
            } catch (Throwable th) {
                yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                throw th;
            }
        }
        if (z) {
            d17.e(f17Var, x67Var);
        }
    }

    @Override // defpackage.w07
    public final boolean k() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.q0 + ")";
    }
}
