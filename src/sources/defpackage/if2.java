package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class if2 extends uy7 implements sn2 {
    public jp0 g0;
    public ea6 h0;
    public jp0 i0;
    public boolean j0;
    public /* synthetic */ b71 k0;
    public /* synthetic */ ze2 l0;
    public final /* synthetic */ long m0;
    public final /* synthetic */ sf2 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if2(long j, sf2 sf2Var, q51 q51Var) {
        super(3, q51Var);
        this.m0 = j;
        this.n0 = sf2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jp0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [jp0] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // defpackage.r10
    public final Object q(Object obj) {
        ea6 ea6Var;
        ?? r0;
        ?? r6;
        b71 b71Var = this.k0;
        ze2 ze2Var = this.l0;
        boolean z = this.j0;
        byte b = 4;
        q51 q51Var = null;
        if (!z) {
            w39.n0(obj);
            q0 q0Var = new q0((Object) this.n0, q51Var, (byte) 27);
            l90 l90Var = l90.X;
            x90 x90VarB = gv3.b(-1, l90Var, null, 4);
            b02 b02Var = b02.X;
            e1 kv5Var = new kv5(ch3.M(b71Var, b02Var), x90VarB);
            e71 e71Var = e71.X;
            kv5Var.n0(e71Var, kv5Var, q0Var);
            ea6 ea6Var2 = new ea6();
            gf2 gf2Var = new gf2(this.m0, null);
            e1 kv5Var2 = new kv5(ch3.M(b71Var, b02Var), gv3.b(0, l90Var, null, 4));
            kv5Var2.n0(e71Var, kv5Var2, gf2Var);
            ea6Var = ea6Var2;
            r0 = kv5Var2;
            r6 = kv5Var;
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jp0 jp0Var = this.i0;
            ea6Var = this.h0;
            jp0 jp0Var2 = this.g0;
            w39.n0(obj);
            r0 = jp0Var;
            r6 = jp0Var2;
        }
        while (ea6Var.X != d75.c) {
            s61 s61Var = this.Y;
            s61Var.getClass();
            tz6 tz6Var = new tz6(s61Var);
            tz6Var.g(r6.o(), new co(ea6Var, (Object) r0, q51Var, b));
            tz6Var.g(r0.n(), new q0(ea6Var, ze2Var, q51Var, (byte) 26));
            this.k0 = null;
            this.l0 = ze2Var;
            this.g0 = r6;
            this.h0 = ea6Var;
            this.i0 = r0;
            this.j0 = true;
            Object objD = tz6.d(tz6Var, this);
            c71 c71Var = c71.X;
            if (objD == c71Var) {
                return c71Var;
            }
        }
        return dn8.a;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        if2 if2Var = new if2(this.m0, this.n0, (q51) obj3);
        if2Var.k0 = (b71) obj;
        if2Var.l0 = (ze2) obj2;
        return if2Var.q(dn8.a);
    }
}
