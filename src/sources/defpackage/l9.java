package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l9 extends uy7 implements tn2 {
    public boolean g0;
    public /* synthetic */ ia h0;
    public /* synthetic */ ke1 i0;
    public /* synthetic */ Object j0;
    public final /* synthetic */ la k0;
    public final /* synthetic */ pk l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(la laVar, pk pkVar, q51 q51Var) {
        super(4, q51Var);
        this.k0 = laVar;
        this.l0 = pkVar;
    }

    @Override // defpackage.tn2
    public final Object F(Object obj, Object obj2, Object obj3, Object obj4) {
        l9 l9Var = new l9(this.k0, this.l0, (q51) obj4);
        l9Var.h0 = (ia) obj;
        l9Var.i0 = (ke1) obj2;
        l9Var.j0 = obj3;
        return l9Var.q(dn8.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    @Override // defpackage.r10
    public final Object q(Object obj) {
        Object objA;
        boolean z = this.g0;
        dn8 dn8Var = dn8.a;
        if (!z) {
            w39.n0(obj);
            ia iaVar = this.h0;
            ke1 ke1Var = this.i0;
            Object obj2 = this.j0;
            la laVar = this.k0;
            float fL = laVar.g.l();
            this.h0 = null;
            this.i0 = null;
            this.g0 = true;
            float fC = ke1Var.c(obj2);
            ba6 ba6Var = new ba6();
            ba6Var.X = Float.isNaN(laVar.f.l()) ? 0.0f : laVar.f.l();
            boolean zIsNaN = Float.isNaN(fC);
            c71 c71Var = c71.X;
            if (zIsNaN) {
                objA = dn8Var;
            } else {
                float f = ba6Var.X;
                if (f == fC) {
                    objA = dn8Var;
                } else {
                    objA = ry7.a(f, fC, fL, this.l0, new i9(iaVar, ba6Var, (byte) 0), this);
                    if (objA != c71Var) {
                        objA = dn8Var;
                    }
                }
            }
            if (objA == c71Var) {
                return c71Var;
            }
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8Var;
    }
}
