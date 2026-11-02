package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ww4 extends uy7 implements sn2 {
    public /* synthetic */ float g0;
    public final /* synthetic */ gn2 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww4(gn2 gn2Var, q51 q51Var) {
        super(3, q51Var);
        this.h0 = gn2Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        w39.n0(obj);
        this.h0.B(new Float(this.g0));
        return dn8.a;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        ww4 ww4Var = new ww4(this.h0, (q51) obj3);
        ww4Var.g0 = fFloatValue;
        dn8 dn8Var = dn8.a;
        ww4Var.q(dn8Var);
        return dn8Var;
    }
}
