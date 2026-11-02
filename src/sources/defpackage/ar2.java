package defpackage;

import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ar2 extends uy7 implements sn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar2(Object obj, q51 q51Var, byte b) {
        super(3, q51Var);
        this.g0 = b;
        this.h0 = obj;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        Object value;
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                cm5 cm5Var = (cm5) this.h0;
                w39.n0(obj);
                return cm5Var;
            case 1:
                w39.n0(obj);
                oh7 oh7Var = ((MainViewModel) ((ea6) this.h0).X).C;
                do {
                    value = oh7Var.getValue();
                } while (!oh7Var.k(value, null));
                return dn8Var;
            default:
                w39.n0(obj);
                ((wb7) this.h0).p0.invoke();
                return dn8Var;
        }
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) throws Throwable {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                cm5 cm5Var = (cm5) obj;
                new ar2(3, (q51) obj3).h0 = cm5Var;
                w39.n0(dn8Var);
                return cm5Var;
            case 1:
                new ar2((ea6) this.h0, (q51) obj3, (byte) 1).q(dn8Var);
                return dn8Var;
            default:
                ((Number) obj2).floatValue();
                new ar2((wb7) this.h0, (q51) obj3, (byte) 2).q(dn8Var);
                return dn8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar2(int i, q51 q51Var) {
        super(i, q51Var);
        this.g0 = (byte) 0;
    }
}
