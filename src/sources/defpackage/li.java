package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class li extends uy7 implements gn2 {
    public final /* synthetic */ byte g0;
    public final /* synthetic */ Object h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ li(Object obj, q51 q51Var, byte b) {
        super(1, q51Var);
        this.g0 = b;
        this.h0 = obj;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) throws InterruptedException {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        q51 q51Var = (q51) obj;
        switch (b) {
            case 0:
                ((li) m(q51Var)).q(dn8Var);
                return dn8Var;
            case 1:
                return ((li) m(q51Var)).q(dn8Var);
            case 2:
                ((li) m(q51Var)).q(dn8Var);
                return dn8Var;
            default:
                ((li) m(q51Var)).q(dn8Var);
                return dn8Var;
        }
    }

    @Override // defpackage.r10
    public final q51 m(q51 q51Var) {
        byte b = this.g0;
        Object obj = this.h0;
        switch (b) {
            case 0:
                return new li((oi) obj, q51Var, (byte) 0);
            case 1:
                return new li((ea6) obj, q51Var, (byte) 1);
            case 2:
                return new li((sn0) obj, q51Var, (byte) 2);
            default:
                return new li((n48) obj, q51Var, (byte) 3);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws InterruptedException {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.h0;
        switch (b) {
            case 0:
                w39.n0(obj);
                ((oi) obj2).c();
                return dn8Var;
            case 1:
                w39.n0(obj);
                ((ea6) obj2).X = null;
                return new hb5(null, new ai0(13), 1);
            case 2:
                w39.n0(obj);
                ((sn0) obj2).x.await();
                return dn8Var;
            default:
                w39.n0(obj);
                ((n48) obj2).w0.t.setValue(Boolean.FALSE);
                return dn8Var;
        }
    }
}
