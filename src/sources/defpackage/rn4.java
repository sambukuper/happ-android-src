package defpackage;

import java.util.Locale;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class rn4 extends uy7 implements rn2 {
    public nm4 g0;
    public String h0;
    public boolean i0;
    public final /* synthetic */ XRayConfig.OutboundBean j0;
    public final /* synthetic */ String k0;
    public final /* synthetic */ nm4 l0;
    public final /* synthetic */ Integer m0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn4(XRayConfig.OutboundBean outboundBean, String str, nm4 nm4Var, Integer num, q51 q51Var) {
        super(2, q51Var);
        this.j0 = outboundBean;
        this.k0 = str;
        this.l0 = nm4Var;
        this.m0 = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new rn4(this.j0, this.k0, this.l0, this.m0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) throws Throwable {
        nm4 nm4Var;
        String str;
        boolean z = this.i0;
        if (!z) {
            w39.n0(obj);
            String protocol = this.j0.getProtocol();
            String lowerCase = "HYSTERIA".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            boolean zF = dh3.f(protocol, lowerCase);
            nm4 nm4Var2 = this.l0;
            String str2 = this.k0;
            if (zF) {
                of7 of7Var = of7.a;
                of7.b(str2, new zw2(nm4Var2, str2, (byte) 15));
            } else {
                of7 of7Var2 = of7.a;
                int iIntValue = this.m0.intValue();
                this.g0 = nm4Var2;
                this.h0 = str2;
                this.i0 = true;
                obj = of7Var2.d(str2, iIntValue, this);
                c71 c71Var = c71.X;
                if (obj == c71Var) {
                    return c71Var;
                }
                nm4Var = nm4Var2;
                str = str2;
            }
            return dn8.a;
        }
        if (!z) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = this.h0;
        nm4Var = this.g0;
        w39.n0(obj);
        nm4Var.K(str, obj);
        return dn8.a;
    }
}
