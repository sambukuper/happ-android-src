package defpackage;

import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ho4 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public byte h0;
    public final /* synthetic */ MainViewModel i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ho4(MainViewModel mainViewModel, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = mainViewModel;
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
        MainViewModel mainViewModel = this.i0;
        switch (b) {
            case 0:
                return new ho4(mainViewModel, q51Var, (byte) 0);
            default:
                return new ho4(mainViewModel, q51Var, (byte) 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    public final Object q(Object obj) {
        Object objA;
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        MainViewModel mainViewModel = this.i0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                byte b2 = this.h0;
                if (b2 == 0) {
                    w39.n0(obj);
                    HappApplication happApplication = HappApplication.M0;
                    p72 p72Var = (p72) k32.i().w0.getValue();
                    this.h0 = (byte) 1;
                    if (p72Var.b(this) != c71Var) {
                    }
                    return c71Var;
                }
                if (b2 == 1) {
                    w39.n0(obj);
                    Object obj2 = ((sj6) obj).X;
                } else {
                    if (b2 != 2) {
                        if (b2 == 3) {
                            w39.n0(obj);
                            return dn8Var;
                        }
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                this.h0 = (byte) 3;
                objA = ((ar0) ((qq0) mainViewModel.e.getValue()).b.getValue()).a(this);
                if (objA != c71Var) {
                    objA = dn8Var;
                }
                if (objA != c71Var) {
                    objA = dn8Var;
                }
                if (objA != c71Var) {
                    return dn8Var;
                }
                return c71Var;
                this.h0 = (byte) 2;
                if (mainViewModel.k(tn.Y, this) != c71Var) {
                    this.h0 = (byte) 3;
                    objA = ((ar0) ((qq0) mainViewModel.e.getValue()).b.getValue()).a(this);
                    if (objA != c71Var) {
                        objA = dn8Var;
                    }
                    if (objA != c71Var) {
                        objA = dn8Var;
                    }
                    if (objA != c71Var) {
                        return dn8Var;
                    }
                }
                return c71Var;
            default:
                byte b3 = this.h0;
                if (b3 == 0) {
                    w39.n0(obj);
                    be beVar = gx1.Y;
                    long jM0 = vj8.m0(3000L, lx1.Z);
                    this.h0 = (byte) 1;
                    if (u70.G(jM0, this) != c71Var) {
                    }
                    return c71Var;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                this.h0 = (byte) 2;
                if (mainViewModel.i(this) != c71Var) {
                    return dn8Var;
                }
                return c71Var;
        }
    }
}
