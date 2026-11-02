package defpackage;

import su.happ.proxyutility.feature.about_settings.AboutSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class p extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ AboutSettingsActivity i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(AboutSettingsActivity aboutSettingsActivity, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = aboutSettingsActivity;
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
        AboutSettingsActivity aboutSettingsActivity = this.i0;
        switch (b) {
            case 0:
                return new p(aboutSettingsActivity, q51Var, (byte) 0);
            default:
                return new p(aboutSettingsActivity, q51Var, (byte) 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        AboutSettingsActivity aboutSettingsActivity = this.i0;
        c71 c71Var = c71.X;
        byte b2 = 0;
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
                int i = AboutSettingsActivity.T0;
                o oVar = new o(((y) aboutSettingsActivity.R0.getValue()).d, (byte) 0);
                k kVar = new k(aboutSettingsActivity, (q51) null, (byte) 0);
                this.h0 = true;
                return z91.n(oVar, kVar, this) == c71Var ? c71Var : dn8Var;
            default:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    p pVar = new p(aboutSettingsActivity, q51Var, b2);
                    this.h0 = true;
                    return u15.L(aboutSettingsActivity, pVar, this) == c71Var ? c71Var : dn8Var;
                }
                if (z2) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
