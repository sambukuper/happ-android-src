package defpackage;

import android.content.Intent;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class go4 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ Intent i0;
    public final /* synthetic */ MainViewModel j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ go4(Intent intent, MainViewModel mainViewModel, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = intent;
        this.j0 = mainViewModel;
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
        MainViewModel mainViewModel = this.j0;
        Intent intent = this.i0;
        switch (b) {
            case 0:
                return new go4(intent, mainViewModel, q51Var, (byte) 0);
            default:
                return new go4(intent, mainViewModel, q51Var, (byte) 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        MainViewModel mainViewModel = this.j0;
        Intent intent = this.i0;
        c71 c71Var = c71.X;
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
                String stringExtra = intent.getStringExtra("content");
                if (stringExtra == null) {
                    return dn8Var;
                }
                in4 in4Var = new in4(stringExtra);
                this.h0 = true;
                return mainViewModel.z(in4Var, this) == c71Var ? c71Var : dn8Var;
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
                gg8 gg8Var = (gg8) c4.m(intent, yb6.a.b(gg8.class));
                if (gg8Var == null) {
                    return dn8Var;
                }
                fn4 fn4Var = new fn4(gg8Var);
                this.h0 = true;
                return mainViewModel.z(fn4Var, this) == c71Var ? c71Var : dn8Var;
        }
    }
}
