package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g51 extends cw0 implements i86 {
    public final /* synthetic */ byte f0 = 1;
    public final v15 g0;
    public final Object h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g51(jd0 jd0Var, t14 t14Var, v15 v15Var) {
        super(t14Var);
        jd0Var.getClass();
        t14Var.getClass();
        this.h0 = jd0Var;
        this.g0 = v15Var;
    }

    public final v15 F0() {
        switch (this.f0) {
            case 0:
                break;
        }
        return this.g0;
    }

    public final String toString() {
        byte b = this.f0;
        Object obj = this.h0;
        switch (b) {
            case 0:
                return c() + ": Ctx { " + ((sx4) obj) + " }";
            default:
                return "Cxt { " + ((jd0) obj) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g51(sx4 sx4Var, t14 t14Var, v15 v15Var) {
        super(t14Var);
        t14Var.getClass();
        this.h0 = sx4Var;
        this.g0 = v15Var;
    }
}
