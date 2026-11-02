package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nh extends uy7 implements rn2 {
    public boolean g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ w05 i0;
    public final /* synthetic */ kd8 j0;
    public final /* synthetic */ y78 k0;
    public final /* synthetic */ mj0 l0;
    public final /* synthetic */ rf m0;
    public final /* synthetic */ s73 n0;
    public final /* synthetic */ gn2 o0;
    public final /* synthetic */ dn2 p0;
    public final /* synthetic */ fw8 q0;
    public final /* synthetic */ gn2 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh(w05 w05Var, kd8 kd8Var, y78 y78Var, mj0 mj0Var, rf rfVar, s73 s73Var, gn2 gn2Var, dn2 dn2Var, fw8 fw8Var, gn2 gn2Var2, q51 q51Var) {
        super(2, q51Var);
        this.i0 = w05Var;
        this.j0 = kd8Var;
        this.k0 = y78Var;
        this.l0 = mj0Var;
        this.m0 = rfVar;
        this.n0 = s73Var;
        this.o0 = gn2Var;
        this.p0 = dn2Var;
        this.q0 = fw8Var;
        this.r0 = gn2Var2;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        ((nh) n((q51) obj2, (b71) obj)).q(dn8.a);
        return c71.X;
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        nh nhVar = new nh(this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, this.o0, this.p0, this.q0, this.r0, q51Var);
        nhVar.h0 = obj;
        return nhVar;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        boolean z = this.g0;
        q51 q51Var = null;
        byte b = 1;
        if (z) {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
            b61.n();
            return null;
        }
        w39.n0(obj);
        b71 b71Var = (b71) this.h0;
        kd8 kd8Var = this.j0;
        mj0 mj0Var = this.l0;
        w51.G(b71Var, null, e71.f0, new q0(kd8Var, mj0Var, q51Var, (byte) 4), 1);
        w05 w05Var = this.i0;
        if (w05Var != null) {
            w51.G(b71Var, null, null, new y9(w05Var, mj0Var, q51Var, b), 3);
        }
        kh khVar = new kh(this.j0, this.n0, this.l0, this.o0, new f81(kd8Var, this.k0, mj0Var, b71Var), this.k0, this.p0, this.q0, this.r0);
        this.g0 = true;
        this.m0.a(khVar, this);
        return c71.X;
    }
}
