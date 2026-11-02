package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n87 extends uy7 implements tn2 {
    public boolean g0;
    public /* synthetic */ ha h0;
    public /* synthetic */ lp4 i0;
    public /* synthetic */ p87 j0;
    public final /* synthetic */ o87 k0;
    public final /* synthetic */ float l0;
    public final /* synthetic */ ta2 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n87(o87 o87Var, float f, ta2 ta2Var, q51 q51Var) {
        super(4, q51Var);
        this.k0 = o87Var;
        this.l0 = f;
        this.m0 = ta2Var;
    }

    @Override // defpackage.tn2
    public final Object F(Object obj, Object obj2, Object obj3, Object obj4) {
        float f = this.l0;
        ta2 ta2Var = this.m0;
        n87 n87Var = new n87(this.k0, f, ta2Var, (q51) obj4);
        n87Var.h0 = (ha) obj;
        n87Var.i0 = (lp4) obj2;
        n87Var.j0 = (p87) obj3;
        return n87Var.q(dn8.a);
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        boolean z = this.g0;
        byte b = 1;
        if (!z) {
            w39.n0(obj);
            ha haVar = this.h0;
            float fD = this.i0.d(this.j0);
            if (!Float.isNaN(fD)) {
                ba6 ba6Var = new ba6();
                o87 o87Var = this.k0;
                float fL = Float.isNaN(((nh5) o87Var.d.k0).l()) ? 0.0f : ((nh5) o87Var.d.k0).l();
                ba6Var.X = fL;
                j9 j9Var = new j9(haVar, ba6Var, b);
                this.h0 = null;
                this.i0 = null;
                this.g0 = true;
                Object objA = ry7.a(fL, fD, this.l0, this.m0, j9Var, this);
                c71 c71Var = c71.X;
                if (objA == c71Var) {
                    return c71Var;
                }
            }
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8.a;
    }
}
