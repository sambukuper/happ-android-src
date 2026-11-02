package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class iv1 extends uy7 implements sn2 {
    public final /* synthetic */ byte g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iv1(int i, q51 q51Var, byte b) {
        super(i, q51Var);
        this.g0 = b;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                w39.n0(obj);
                break;
            case 1:
                w39.n0(obj);
                break;
            default:
                w39.n0(obj);
                break;
        }
        return dn8Var;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        int i = 3;
        switch (b) {
            case 0:
                long j = ((z85) obj2).a;
                new iv1(i, (q51) obj3, (byte) 0).q(dn8Var);
                break;
            case 1:
                ((Number) obj2).floatValue();
                new iv1(i, (q51) obj3, (byte) 1).q(dn8Var);
                break;
            default:
                long j2 = ((z85) obj2).a;
                new iv1(i, (q51) obj3, (byte) 2).q(dn8Var);
                break;
        }
        return dn8Var;
    }
}
