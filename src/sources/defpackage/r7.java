package defpackage;

import su.happ.proxyutility.feature.settings.AdvancedSettingsFragment;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class r7 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ AdvancedSettingsFragment i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7(AdvancedSettingsFragment advancedSettingsFragment, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = advancedSettingsFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                n(q51Var, b71Var).q(dn8Var);
                return c71.X;
            default:
                return n(q51Var, b71Var).q(dn8Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        AdvancedSettingsFragment advancedSettingsFragment = this.i0;
        switch (b) {
            case 0:
                return new r7(advancedSettingsFragment, q51Var, (byte) 0);
            default:
                return new r7(advancedSettingsFragment, q51Var, (byte) 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        AdvancedSettingsFragment advancedSettingsFragment = this.i0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (z) {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w39.n0(obj);
                    }
                    return null;
                }
                w39.n0(obj);
                f76 f76Var = ((ig8) advancedSettingsFragment.e1.getValue()).e;
                p7 p7Var = new p7(advancedSettingsFragment, null, (byte) 2);
                this.h0 = true;
                if (z91.n(f76Var, p7Var, this) == c71Var) {
                    return c71Var;
                }
                bt.i("SharedFlow never completes, this call should never return.");
                return null;
            default:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    ig8 ig8Var = (ig8) advancedSettingsFragment.e1.getValue();
                    this.h0 = true;
                    if (ig8Var.b(this) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8.a;
        }
    }
}
