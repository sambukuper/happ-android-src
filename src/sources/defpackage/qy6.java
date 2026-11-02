package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qy6 extends uy7 implements rn2 {
    public sy6 g0;
    public da6 h0;
    public long i0;
    public boolean j0;
    public /* synthetic */ Object k0;
    public final /* synthetic */ sy6 l0;
    public final /* synthetic */ da6 m0;
    public final /* synthetic */ long n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy6(sy6 sy6Var, da6 da6Var, long j, q51 q51Var) {
        super(2, q51Var);
        this.l0 = sy6Var;
        this.m0 = da6Var;
        this.n0 = j;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((qy6) n((q51) obj2, (ry6) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        qy6 qy6Var = new qy6(this.l0, this.m0, this.n0, q51Var);
        qy6Var.k0 = obj;
        return qy6Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        sy6 sy6Var;
        da6 da6Var;
        sy6 sy6Var2;
        long j;
        boolean z = this.j0;
        sd5 sd5Var = sd5.Y;
        byte b = 1;
        if (!z) {
            w39.n0(obj);
            ry6 ry6Var = (ry6) this.k0;
            sy6Var = this.l0;
            w9 w9Var = new w9(sy6Var, ry6Var, b);
            he2 he2Var = sy6Var.c;
            da6 da6Var2 = this.m0;
            long j2 = da6Var2.X;
            sd5 sd5Var2 = sy6Var.d;
            long j3 = this.n0;
            float fE = sy6Var.e(sd5Var2 == sd5Var ? tu8.b(j3) : tu8.c(j3));
            this.k0 = sy6Var;
            this.g0 = sy6Var;
            this.h0 = da6Var2;
            this.i0 = j2;
            this.j0 = true;
            obj = he2Var.a(w9Var, fE, this);
            c71 c71Var = c71.X;
            if (obj == c71Var) {
                return c71Var;
            }
            da6Var = da6Var2;
            sy6Var2 = sy6Var;
            j = j2;
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.i0;
            da6Var = this.h0;
            sy6Var = this.g0;
            sy6Var2 = (sy6) this.k0;
            w39.n0(obj);
        }
        float fE2 = sy6Var2.e(((Number) obj).floatValue());
        da6Var.X = sy6Var.d == sd5Var ? tu8.a(j, fE2, 0.0f, 2) : tu8.a(j, 0.0f, fE2, 1);
        return dn8.a;
    }
}
