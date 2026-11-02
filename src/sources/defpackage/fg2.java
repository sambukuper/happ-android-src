package defpackage;

import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fg2 implements ze2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ea6 Y;

    public /* synthetic */ fg2(ea6 ea6Var, byte b) {
        this.X = b;
        this.Y = ea6Var;
    }

    @Override // defpackage.ze2
    public final Object l(Object obj, q51 q51Var) {
        Object value;
        byte b = this.X;
        ea6 ea6Var = this.Y;
        switch (b) {
            case 0:
                ea6Var.X = obj;
                throw new h(this);
            case 1:
                ea6Var.X = obj;
                throw new h(this);
            default:
                long jLongValue = ((Number) obj).longValue();
                oh7 oh7Var = ((MainViewModel) ea6Var.X).C;
                do {
                    value = oh7Var.getValue();
                } while (!oh7Var.k(value, new Long(jLongValue)));
                return dn8.a;
        }
    }
}
