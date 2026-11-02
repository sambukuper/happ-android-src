package defpackage;

import java.util.Locale;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.feature.main.MainViewModel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class tn4 extends uy7 implements rn2 {
    public boolean g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ XRayConfig.OutboundBean i0;
    public final /* synthetic */ String j0;
    public final /* synthetic */ int k0;
    public final /* synthetic */ MainViewModel l0;
    public final /* synthetic */ String m0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn4(XRayConfig.OutboundBean outboundBean, String str, int i, MainViewModel mainViewModel, String str2, q51 q51Var) {
        super(2, q51Var);
        this.i0 = outboundBean;
        this.j0 = str;
        this.k0 = i;
        this.l0 = mainViewModel;
        this.m0 = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        tn4 tn4Var = new tn4(this.i0, this.j0, this.k0, this.l0, this.m0, q51Var);
        tn4Var.h0 = obj;
        return tn4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) throws Throwable {
        b71 b71Var = (b71) this.h0;
        boolean z = this.g0;
        MainViewModel mainViewModel = this.l0;
        byte b = 1;
        if (!z) {
            w39.n0(obj);
            String protocol = this.i0.getProtocol();
            String lowerCase = "HYSTERIA".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            boolean zF = dh3.f(protocol, lowerCase);
            String str = this.j0;
            if (zF) {
                of7 of7Var = of7.a;
                of7.b(str, new on4(b71Var, mainViewModel, this.m0, b));
            } else {
                of7 of7Var2 = of7.a;
                this.h0 = b71Var;
                this.g0 = true;
                obj = of7Var2.d(str, this.k0, this);
                c71 c71Var = c71.X;
                if (obj == c71Var) {
                    return c71Var;
                }
            }
            return dn8.a;
        }
        if (!z) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj);
        long jLongValue = ((Number) obj).longValue();
        nf1 nf1Var = tp1.a;
        jm4.Q(b71Var, dm4.a, new pn4(mainViewModel, this.m0, jLongValue, null, (byte) 2), 2);
        return dn8.a;
    }
}
