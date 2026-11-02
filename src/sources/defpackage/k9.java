package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k9 extends uy7 implements tn2 {
    public boolean g0;
    public /* synthetic */ ha h0;
    public /* synthetic */ lp4 i0;
    public /* synthetic */ Object j0;
    public final /* synthetic */ t5 k0;
    public final /* synthetic */ float l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(t5 t5Var, float f, q51 q51Var) {
        super(4, q51Var);
        this.k0 = t5Var;
        this.l0 = f;
    }

    @Override // defpackage.tn2
    public final Object F(Object obj, Object obj2, Object obj3, Object obj4) {
        k9 k9Var = new k9(this.k0, this.l0, (q51) obj4);
        k9Var.h0 = (ha) obj;
        k9Var.i0 = (lp4) obj2;
        k9Var.j0 = obj3;
        return k9Var.q(dn8.a);
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        boolean z = this.g0;
        if (!z) {
            w39.n0(obj);
            ha haVar = this.h0;
            float fD = this.i0.d(this.j0);
            if (!Float.isNaN(fD)) {
                ba6 ba6Var = new ba6();
                t5 t5Var = this.k0;
                float fL = Float.isNaN(((nh5) t5Var.k0).l()) ? 0.0f : ((nh5) t5Var.k0).l();
                ba6Var.X = fL;
                ta2 ta2Var = ((o87) ((hr5) t5Var.Z).Y).c;
                j9 j9Var = new j9(haVar, ba6Var, (byte) 0);
                this.h0 = null;
                this.i0 = null;
                this.g0 = true;
                Object objA = ry7.a(fL, fD, this.l0, ta2Var, j9Var, this);
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
