package defpackage;

import android.app.Activity;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class po4 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0 = 0;
    public boolean h0;
    public final /* synthetic */ MainViewModel i0;
    public final /* synthetic */ boolean j0;
    public final /* synthetic */ String k0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po4(MainViewModel mainViewModel, String str, boolean z, q51 q51Var) {
        super(2, q51Var);
        this.i0 = mainViewModel;
        this.k0 = str;
        this.j0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
        }
        return n(q51Var, b71Var).q(dn8Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        String str = this.k0;
        boolean z = this.j0;
        MainViewModel mainViewModel = this.i0;
        switch (b) {
            case 0:
                return new po4(mainViewModel, str, z, q51Var);
            default:
                return new po4(mainViewModel, z, str, q51Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    public final Object q(Object obj) {
        Object objP;
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        boolean z = this.j0;
        MainViewModel mainViewModel = this.i0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z2 = this.h0;
                if (z2) {
                    if (z2) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                this.h0 = true;
                mainViewModel.getClass();
                HappApplication happApplication = HappApplication.M0;
                Object obj2 = (Activity) k32.i().L0.Y;
                if (obj2 == null) {
                    objP = dn8Var;
                } else {
                    MainActivity mainActivity = obj2 instanceof MainActivity ? (MainActivity) obj2 : null;
                    if (mainActivity != null) {
                        MainViewModel.C(mainViewModel, false, 3);
                        if (z) {
                            kw4 kw4Var = kw4.a;
                            String str = this.k0;
                            SubscriptionItem subscriptionItemF = kw4.f(str);
                            if (subscriptionItemF != null) {
                                k32.i().d().h(new uq0(subscriptionItemF, (byte) 13));
                                objP = MainActivity.P(mainActivity, str, subscriptionItemF, false, false, false, null, false, false, null, null, this, 1008);
                                if (objP != c71Var) {
                                    objP = dn8Var;
                                }
                            } else {
                                objP = dn8Var;
                            }
                        } else {
                            objP = dn8Var;
                        }
                    } else {
                        objP = dn8Var;
                    }
                }
                return objP == c71Var ? c71Var : dn8Var;
            default:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    this.h0 = true;
                    return mainViewModel.D(this, this.k0, z) == c71Var ? c71Var : dn8Var;
                }
                if (z3) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po4(MainViewModel mainViewModel, boolean z, String str, q51 q51Var) {
        super(2, q51Var);
        this.i0 = mainViewModel;
        this.j0 = z;
        this.k0 = str;
    }
}
