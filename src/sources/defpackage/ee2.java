package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ee2 extends ce2 implements p81 {
    @Override // defpackage.p81
    public final mo8 f0(t14 t14Var) {
        mo8 mo8VarS;
        t14Var.getClass();
        mo8 mo8VarQ0 = t14Var.q0();
        if (mo8VarQ0 instanceof ce2) {
            mo8VarS = mo8VarQ0;
        } else {
            if (!(mo8VarQ0 instanceof aa7)) {
                b61.c();
                return null;
            }
            aa7 aa7Var = (aa7) mo8VarQ0;
            mo8VarS = dh3.s(aa7Var, aa7Var.r0(true));
        }
        return c18.g(mo8VarS, mo8VarQ0);
    }

    @Override // defpackage.p81
    public final boolean g0() {
        aa7 aa7Var = this.Y;
        return (aa7Var.n0().x() instanceof hi8) && dh3.f(aa7Var.n0(), this.Z.n0());
    }

    @Override // defpackage.t14
    public final t14 p0(z14 z14Var) {
        aa7 aa7Var = this.Y;
        aa7Var.getClass();
        aa7 aa7Var2 = this.Z;
        aa7Var2.getClass();
        return new ee2(aa7Var, aa7Var2);
    }

    @Override // defpackage.mo8
    public final mo8 r0(boolean z) {
        return dh3.s(this.Y.r0(z), this.Z.r0(z));
    }

    @Override // defpackage.mo8
    /* JADX INFO: renamed from: s0 */
    public final mo8 p0(z14 z14Var) {
        aa7 aa7Var = this.Y;
        aa7Var.getClass();
        aa7 aa7Var2 = this.Z;
        aa7Var2.getClass();
        return new ee2(aa7Var, aa7Var2);
    }

    @Override // defpackage.mo8
    public final mo8 t0(ch8 ch8Var) {
        ch8Var.getClass();
        return dh3.s(this.Y.t0(ch8Var), this.Z.t0(ch8Var));
    }

    @Override // defpackage.ce2
    public final String toString() {
        return "(" + this.Y + ".." + this.Z + ')';
    }
}
