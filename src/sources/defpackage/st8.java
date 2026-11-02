package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class st8 implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ tt8 Y;

    public /* synthetic */ st8(tt8 tt8Var, byte b) {
        this.X = b;
        this.Y = tt8Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        tt8 tt8Var = this.Y;
        switch (b) {
            case 0:
                tt8Var.d = true;
                tt8Var.f.invoke();
                return dn8Var;
            default:
                sv1 sv1Var = (sv1) obj;
                ou2 ou2Var = tt8Var.b;
                float f = tt8Var.k;
                float f2 = tt8Var.l;
                lr lrVarN0 = sv1Var.n0();
                long jP = lrVarN0.p();
                lrVarN0.k().g();
                try {
                    ((wl6) lrVarN0.Y).U(f, f2, 0L);
                    ou2Var.a(sv1Var);
                    return dn8Var;
                } finally {
                    p61.w(lrVarN0, jP);
                }
        }
    }
}
