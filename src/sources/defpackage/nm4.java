package defpackage;

import java.util.ArrayList;
import java.util.List;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class nm4 implements rn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ArrayList Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ MainViewModel f0;
    public final /* synthetic */ String g0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ nm4(ArrayList arrayList, List list, MainViewModel mainViewModel, String str, byte b) {
        this.X = b;
        this.Y = arrayList;
        this.Z = list;
        this.f0 = mainViewModel;
        this.g0 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        Object value;
        xm4 xm4Var;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        String str = this.g0;
        MainViewModel mainViewModel = this.f0;
        List list = this.Z;
        ArrayList arrayList = this.Y;
        switch (b) {
            case 0:
                Long l = (Long) obj2;
                l.getClass();
                ((String) obj).getClass();
                arrayList.add(l);
                if (arrayList.size() >= list.size()) {
                    tu0 tu0VarA = zw8.a(mainViewModel);
                    nf1 nf1Var = tp1.a;
                    jm4.Q(tu0VarA, dm4.a, new sn4(mainViewModel, str, arrayList, null), 2);
                }
                oh7 oh7Var = mainViewModel.w;
                do {
                    value = oh7Var.getValue();
                    xm4Var = (xm4) value;
                    xm4Var.getClass();
                } while (!oh7Var.k(value, xm4.a(xm4Var, null, 0L, null, null, false, xm4Var.f - 1, 0, null, null, false, null, false, null, false, false, null, 65503)));
                break;
            default:
                Long l2 = (Long) obj2;
                l2.getClass();
                ((String) obj).getClass();
                arrayList.add(l2);
                if (arrayList.size() >= list.size()) {
                    tu0 tu0VarA2 = zw8.a(mainViewModel);
                    nf1 nf1Var2 = tp1.a;
                    jm4.Q(tu0VarA2, dm4.a, new nn4(mainViewModel, str, arrayList, null), 2);
                }
                break;
        }
        return dn8Var;
    }
}
