package defpackage;

import java.util.ArrayList;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class sn4 extends uy7 implements rn2 {
    public final /* synthetic */ MainViewModel g0;
    public final /* synthetic */ String h0;
    public final /* synthetic */ ArrayList i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn4(MainViewModel mainViewModel, String str, ArrayList arrayList, q51 q51Var) {
        super(2, q51Var);
        this.g0 = mainViewModel;
        this.h0 = str;
        this.i0 = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        sn4 sn4VarN = n((q51) obj2, (b71) obj);
        dn8 dn8Var = dn8.a;
        sn4VarN.q(dn8Var);
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new sn4(this.g0, this.h0, this.i0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        w39.n0(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.i0) {
            if (((Number) obj2).longValue() > 0) {
                arrayList.add(obj2);
            }
        }
        Long l = (Long) wv0.C0(arrayList);
        this.g0.V(l != null ? l.longValue() : -1L, this.h0);
        return dn8.a;
    }
}
