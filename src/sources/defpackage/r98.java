package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r98 extends uy7 implements rn2 {
    public boolean g0;
    public final /* synthetic */ s98 h0;
    public final /* synthetic */ gn2 i0;
    public final /* synthetic */ short j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public r98(s98 s98Var, gn2 gn2Var, long j, q51 q51Var) {
        super(2, q51Var);
        this.h0 = s98Var;
        this.i0 = gn2Var;
        this.j0 = (int) j;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((r98) n((q51) obj2, (b71) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        return new r98(this.h0, this.i0, this.j0, q51Var);
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        boolean z = this.g0;
        q51 q51Var = null;
        byte b = 1;
        if (z) {
            if (z) {
                w39.n0(obj);
                return obj;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj);
        s98 s98Var = this.h0;
        yg1 yg1VarJ = w51.j(s98Var.b, s98Var.f, new u68(this.i0, q51Var, b), 2);
        long j = this.j0;
        ym7 ym7Var = new ym7(yg1VarJ, q51Var, (byte) 6);
        this.g0 = true;
        Object objX = a28.x(j, ym7Var, this);
        c71 c71Var = c71.X;
        return objX == c71Var ? c71Var : objX;
    }
}
