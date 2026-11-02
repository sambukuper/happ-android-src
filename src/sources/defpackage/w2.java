package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 extends uy7 implements rn2 {
    public boolean g0;
    public final /* synthetic */ my6 h0;
    public final /* synthetic */ float i0;
    public final /* synthetic */ float j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(my6 my6Var, float f, float f2, q51 q51Var) {
        super(2, q51Var);
        this.h0 = my6Var;
        this.i0 = f;
        this.j0 = f2;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((w2) n((q51) obj2, (b71) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        return new w2(this.h0, this.i0, this.j0, q51Var);
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        boolean z = this.g0;
        if (!z) {
            w39.n0(obj);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.i0)) << 32) | (((long) Float.floatToRawIntBits(this.j0)) & 4294967295L);
            this.g0 = true;
            Object objB = iy6.b(this.h0.T0, jFloatToRawIntBits, this);
            c71 c71Var = c71.X;
            if (objB == c71Var) {
                return c71Var;
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
