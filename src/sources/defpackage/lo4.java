package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class lo4 extends uy7 implements sn2 {
    public final /* synthetic */ byte g0 = 0;
    public /* synthetic */ long h0;
    public /* synthetic */ Object i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo4(wb7 wb7Var, q51 q51Var) {
        super(3, q51Var);
        this.i0 = wb7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        float fL;
        switch (this.g0) {
            case 0:
                pm4 pm4Var = (pm4) this.i0;
                long j = this.h0;
                w39.n0(obj);
                return new pm4(pm4Var.a, pm4Var.b, j);
            default:
                w39.n0(obj);
                long j2 = this.h0;
                wb7 wb7Var = (wb7) this.i0;
                if (wb7Var.n0 == sd5.X) {
                    fL = Float.intBitsToFloat((int) (j2 & 4294967295L));
                } else {
                    fL = wb7Var.k0 ? wb7Var.i0.l() - Float.intBitsToFloat((int) (j2 >> 32)) : Float.intBitsToFloat((int) (j2 >> 32));
                }
                wb7Var.r0.m(fL - wb7Var.q0.l());
                return dn8.a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                long jLongValue = ((Number) obj2).longValue();
                lo4 lo4Var = new lo4(3, (q51) obj3);
                lo4Var.i0 = (pm4) obj;
                lo4Var.h0 = jLongValue;
                return lo4Var.q(dn8Var);
            default:
                long j = ((z85) obj2).a;
                lo4 lo4Var2 = new lo4((wb7) this.i0, (q51) obj3);
                lo4Var2.h0 = j;
                lo4Var2.q(dn8Var);
                return dn8Var;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR (r2v0 int), (r3v0 q51) call: uy7.<init>(int, q51):void type: SUPER */
    public /* synthetic */ lo4(int i, q51 q51Var) {
        super(i, q51Var);
    }
}
