package defpackage;

import su.happ.proxyutility.feature.settings.OtherSettingsFragment;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class wd5 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ OtherSettingsFragment i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd5(OtherSettingsFragment otherSettingsFragment, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = otherSettingsFragment;
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
        OtherSettingsFragment otherSettingsFragment = this.i0;
        switch (b) {
            case 0:
                return new wd5(otherSettingsFragment, q51Var, (byte) 0);
            default:
                return new wd5(otherSettingsFragment, q51Var, (byte) 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        q51 q51Var = null;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (z) {
                    if (z) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                OtherSettingsFragment otherSettingsFragment = this.i0;
                xe2 xe2VarT = w51.t(new o(((p67) otherSettingsFragment.M().W0.getValue()).d, (byte) 22));
                yy0 yy0Var = new yy0(2, otherSettingsFragment, OtherSettingsFragment.class, "setStateButtonUpdate", "setStateButtonUpdate(Z)V", 4, (byte) 1);
                this.h0 = true;
                return z91.n(xe2VarT, yy0Var, this) == c71Var ? c71Var : dn8Var;
            default:
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
                OtherSettingsFragment otherSettingsFragment2 = this.i0;
                wd5 wd5Var = new wd5(otherSettingsFragment2, q51Var, (byte) 0);
                this.h0 = true;
                return u15.L(otherSettingsFragment2, wd5Var, this) == c71Var ? c71Var : dn8Var;
        }
    }
}
