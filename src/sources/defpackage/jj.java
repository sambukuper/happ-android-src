package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jj extends g24 implements gn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ kj Z;
    public final /* synthetic */ long f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj(kj kjVar, long j, byte b) {
        super(1);
        this.Y = b;
        this.Z = kjVar;
        this.f0 = j;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        ta2 ta2Var;
        byte b = this.Y;
        long j = 0;
        long j2 = this.f0;
        kj kjVar = this.Z;
        switch (b) {
            case 0:
                wd8 wd8Var = (wd8) obj;
                if (!dh3.f(wd8Var.a(), kjVar.t0.a())) {
                    lh7 lh7Var = (lh7) kjVar.t0.c.g(wd8Var.a());
                    j2 = lh7Var != null ? ((pf3) lh7Var.getValue()).a : 0L;
                } else if (!pf3.a(kjVar.A0, -9223372034707292160L)) {
                    j2 = kjVar.A0;
                }
                lh7 lh7Var2 = (lh7) kjVar.t0.c.g(wd8Var.c());
                j = lh7Var2 != null ? ((pf3) lh7Var2.getValue()).a : 0L;
                bb7 bb7Var = (bb7) kjVar.s0.getValue();
                return (bb7Var == null || (ta2Var = (ta2) bb7Var.a.K(new pf3(j2), new pf3(j))) == null) ? wl7.V(0.0f, 400.0f, null, 5) : ta2Var;
            default:
                if (dh3.f(obj, kjVar.t0.a())) {
                    j = pf3.a(kjVar.A0, -9223372034707292160L) ? j2 : kjVar.A0;
                } else {
                    lh7 lh7Var3 = (lh7) kjVar.t0.c.g(obj);
                    if (lh7Var3 != null) {
                        j = ((pf3) lh7Var3.getValue()).a;
                    }
                }
                return new pf3(j);
        }
    }
}
