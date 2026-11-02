package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u12 extends g24 implements rn2 {
    public final /* synthetic */ ce8 Y;
    public final /* synthetic */ dn2 Z;
    public final /* synthetic */ int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u12(ce8 ce8Var, dn2 dn2Var, int i) {
        super(2);
        this.Y = ce8Var;
        this.Z = dn2Var;
        this.f0 = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = w79.P(this.f0 | 1);
        b22.a(this.Y, this.Z, (lp2) obj, iP);
        return dn8.a;
    }
}
