package defpackage;

import java.util.List;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class yn4 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ MainViewModel i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn4(MainViewModel mainViewModel, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = mainViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                n((q51) obj2, (List) obj).q(dn8Var);
                break;
            default:
                n((q51) obj2, (pm4) obj).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        MainViewModel mainViewModel = this.i0;
        switch (b) {
            case 0:
                yn4 yn4Var = new yn4(mainViewModel, q51Var, (byte) 0);
                yn4Var.h0 = obj;
                return yn4Var;
            default:
                yn4 yn4Var2 = new yn4(mainViewModel, q51Var, (byte) 1);
                yn4Var2.h0 = obj;
                return yn4Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        Object value;
        Object value2;
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        MainViewModel mainViewModel = this.i0;
        Object obj2 = this.h0;
        switch (b) {
            case 0:
                List list = (List) obj2;
                w39.n0(obj);
                oh7 oh7Var = mainViewModel.w;
                do {
                    value = oh7Var.getValue();
                } while (!oh7Var.k(value, xm4.a((xm4) value, null, 0L, null, mb6.d0(list), false, 0, 0, null, null, false, null, false, null, false, false, null, 65527)));
                break;
            default:
                pm4 pm4Var = (pm4) obj2;
                w39.n0(obj);
                oh7 oh7Var2 = mainViewModel.w;
                do {
                    value2 = oh7Var2.getValue();
                } while (!oh7Var2.k(value2, xm4.a((xm4) value2, null, 0L, null, null, false, 0, 0, null, null, false, null, false, pm4Var, false, false, null, 61439)));
                break;
        }
        return dn8Var;
    }
}
