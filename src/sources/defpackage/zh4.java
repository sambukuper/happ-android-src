package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.dto.SubscriptionItem;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.ui.SnackbarHostActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class zh4 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0 = 0;
    public boolean h0;
    public final /* synthetic */ boolean i0;
    public Object j0;
    public final /* synthetic */ Object k0;
    public final /* synthetic */ Object l0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh4(boolean z, MainActivity mainActivity, SubscriptionItem subscriptionItem, g83 g83Var, q51 q51Var) {
        super(2, q51Var);
        this.i0 = z;
        this.j0 = mainActivity;
        this.k0 = subscriptionItem;
        this.l0 = g83Var;
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
        switch (this.g0) {
            case 0:
                return new zh4((gg4) this.k0, (ci4) this.l0, this.i0, q51Var);
            default:
                return new zh4(this.i0, (MainActivity) this.j0, (SubscriptionItem) this.k0, (g83) this.l0, q51Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        lg4 rj6Var;
        gg4 gg4Var;
        gg4 gg4Var2;
        String str;
        byte b = this.g0;
        Object obj2 = this.l0;
        boolean z = this.i0;
        c71 c71Var = c71.X;
        Object obj3 = this.k0;
        switch (b) {
            case 0:
                String strE = "";
                boolean z2 = this.h0;
                try {
                    if (!z2) {
                        w39.n0(obj);
                        gg4Var = (gg4) obj3;
                        ci4 ci4Var = (ci4) obj2;
                        if (gg4Var == null || (str = gg4Var.a) == null) {
                            this.j0 = gg4Var;
                            this.h0 = true;
                            Object objH = ci4Var.h(z, this);
                            if (objH == c71Var) {
                                return c71Var;
                            }
                            obj = objH;
                            gg4Var2 = gg4Var;
                        } else {
                            File file = new File(str);
                            if (z) {
                                da2.T(file, "");
                            } else {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), iq0.a), 8192);
                                try {
                                    strE = dt7.e(bufferedReader);
                                    bufferedReader.close();
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        oc.h(bufferedReader, th);
                                        throw th2;
                                    }
                                }
                            }
                        }
                        strE.getClass();
                        rj6Var = new lg4(gg4Var, mb6.f0(fm7.T0(strE, 750000, 750000, true)), 4, 0);
                        return new sj6(rj6Var);
                    }
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gg4Var2 = (gg4) this.j0;
                    w39.n0(obj);
                    strE = (String) obj;
                    gg4Var = gg4Var2;
                    strE.getClass();
                    rj6Var = new lg4(gg4Var, mb6.f0(fm7.T0(strE, 750000, 750000, true)), 4, 0);
                } catch (Throwable th3) {
                    if ((th3 instanceof InterruptedException) || (th3 instanceof CancellationException)) {
                        throw th3;
                    }
                    rj6Var = new rj6(th3);
                }
                return new sj6(rj6Var);
            default:
                SubscriptionItem subscriptionItem = (SubscriptionItem) obj3;
                SnackbarHostActivity snackbarHostActivity = (MainActivity) this.j0;
                boolean z3 = this.h0;
                if (z3) {
                    if (z3) {
                        w39.n0(obj);
                        return dn8.a;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                if (!z) {
                    m51 m51Var = ko1.B1;
                    km4.x(snackbarHostActivity.n());
                }
                HappApplication happApplication = HappApplication.M0;
                k32.i().d().h(new uq0(subscriptionItem, (byte) 9));
                String string = snackbarHostActivity.getString(y46.toast_success_sub_update, subscriptionItem.getRemarks());
                string.getClass();
                pu.R(snackbarHostActivity, string);
                g83 g83Var = (g83) obj2;
                if (g83Var != null) {
                    this.h0 = true;
                    if (g83Var.t(true, this) == c71Var) {
                        return c71Var;
                    }
                    return dn8.a;
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh4(gg4 gg4Var, ci4 ci4Var, boolean z, q51 q51Var) {
        super(2, q51Var);
        this.k0 = gg4Var;
        this.l0 = ci4Var;
        this.i0 = z;
    }
}
