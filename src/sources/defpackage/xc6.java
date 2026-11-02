package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xc6 extends f1 implements v61 {
    public final /* synthetic */ p01 Y;
    public final /* synthetic */ yc6 Z;

    /* JADX WARN: Illegal instructions before constructor call */
    public xc6(p01 p01Var, yc6 yc6Var) {
        oy1 oy1Var = oy1.p0;
        this.Y = p01Var;
        this.Z = yc6Var;
        super(oy1Var);
    }

    @Override // defpackage.v61
    public final void J(s61 s61Var, Throwable th) throws Throwable {
        p01 p01Var = this.Y;
        yc6 yc6Var = this.Z;
        os4.U(th, new p5(p01Var, yc6Var, (byte) 18));
        v61 v61Var = (v61) yc6Var.X.H0(oy1.p0);
        if (v61Var == null) {
            throw th;
        }
        v61Var.J(s61Var, th);
    }
}
