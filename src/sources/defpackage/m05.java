package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m05 extends qj6 implements rn2 {
    public fq2 Z;
    public n05 f0;
    public long[] g0;
    public int h0;
    public boolean i0;
    public /* synthetic */ Object j0;
    public final /* synthetic */ n05 k0;
    public final /* synthetic */ fq2 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m05(n05 n05Var, fq2 fq2Var, q51 q51Var) {
        super(2, q51Var);
        this.k0 = n05Var;
        this.l0 = fq2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((m05) n((q51) obj2, (v27) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        m05 m05Var = new m05(this.k0, this.l0, q51Var);
        m05Var.j0 = obj;
        return m05Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        v27 v27Var;
        n05 n05Var;
        long[] jArr;
        int i;
        fq2 fq2Var;
        boolean z = this.i0;
        if (!z) {
            w39.n0(obj);
            v27Var = (v27) this.j0;
            n05Var = this.k0;
            l05 l05Var = n05Var.Y;
            jArr = l05Var.c;
            i = l05Var.e;
            fq2Var = this.l0;
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.h0;
            jArr = this.g0;
            n05Var = this.f0;
            fq2Var = this.Z;
            v27Var = (v27) this.j0;
            w39.n0(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return dn8.a;
        }
        int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
        fq2Var.Y = i;
        Object obj2 = n05Var.Y.b[i];
        this.j0 = v27Var;
        this.Z = fq2Var;
        this.f0 = n05Var;
        this.g0 = jArr;
        this.h0 = i2;
        this.i0 = true;
        v27Var.b(this, obj2);
        return c71.X;
    }
}
