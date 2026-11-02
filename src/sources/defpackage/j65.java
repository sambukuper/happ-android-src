package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j65 extends yh1 implements p81 {
    public final aa7 Y;

    public j65(aa7 aa7Var) {
        aa7Var.getClass();
        this.Y = aa7Var;
    }

    @Override // defpackage.p81
    public final mo8 f0(t14 t14Var) {
        t14Var.getClass();
        mo8 mo8VarQ0 = t14Var.q0();
        if (!cj8.f(mo8VarQ0) && !cj8.e(mo8VarQ0)) {
            return mo8VarQ0;
        }
        if (mo8VarQ0 instanceof aa7) {
            aa7 aa7Var = (aa7) mo8VarQ0;
            aa7 aa7VarR0 = aa7Var.r0(false);
            return !cj8.f(aa7Var) ? aa7VarR0 : new j65(aa7VarR0);
        }
        if (!(mo8VarQ0 instanceof ce2)) {
            b61.c();
            return null;
        }
        ce2 ce2Var = (ce2) mo8VarQ0;
        aa7 aa7Var2 = ce2Var.Y;
        aa7 aa7VarR1 = aa7Var2.r0(false);
        if (cj8.f(aa7Var2)) {
            aa7VarR1 = new j65(aa7VarR1);
        }
        aa7 aa7Var3 = ce2Var.Z;
        aa7 aa7VarR2 = aa7Var3.r0(false);
        if (cj8.f(aa7Var3)) {
            aa7VarR2 = new j65(aa7VarR2);
        }
        return c18.h(dh3.s(aa7VarR1, aa7VarR2), c18.e(mo8VarQ0));
    }

    @Override // defpackage.p81
    public final boolean g0() {
        return true;
    }

    @Override // defpackage.yh1, defpackage.t14
    public final boolean o0() {
        return false;
    }

    @Override // defpackage.mo8
    public final mo8 t0(ch8 ch8Var) {
        ch8Var.getClass();
        return new j65(this.Y.t0(ch8Var));
    }

    @Override // defpackage.aa7
    /* JADX INFO: renamed from: u0 */
    public final aa7 r0(boolean z) {
        return z ? this.Y.r0(true) : this;
    }

    @Override // defpackage.aa7
    /* JADX INFO: renamed from: v0 */
    public final aa7 t0(ch8 ch8Var) {
        ch8Var.getClass();
        return new j65(this.Y.t0(ch8Var));
    }

    @Override // defpackage.yh1
    public final aa7 w0() {
        return this.Y;
    }
}
