package defpackage;

import java.util.Locale;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class on5 extends uy7 implements rn2 {
    public ux0 g0;
    public boolean h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ XRayConfig.OutboundBean j0;
    public final /* synthetic */ String k0;
    public final /* synthetic */ int l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on5(XRayConfig.OutboundBean outboundBean, String str, int i, q51 q51Var) {
        super(2, q51Var);
        this.j0 = outboundBean;
        this.k0 = str;
        this.l0 = i;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((on5) n((q51) obj2, (b71) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        on5 on5Var = new on5(this.j0, this.k0, this.l0, q51Var);
        on5Var.i0 = obj;
        return on5Var;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        ux0 ux0Var;
        b71 b71Var = (b71) this.i0;
        boolean z = this.h0;
        byte b = 1;
        if (!z) {
            w39.n0(obj);
            ux0 ux0Var2 = new ux0();
            String protocol = this.j0.getProtocol();
            String lowerCase = "HYSTERIA".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            boolean zF = dh3.f(protocol, lowerCase);
            String str = this.k0;
            if (zF) {
                of7 of7Var = of7.a;
                of7.b(str, new ln5(b71Var, ux0Var2, b));
                return ux0Var2;
            }
            of7 of7Var2 = of7.a;
            this.i0 = b71Var;
            this.g0 = ux0Var2;
            this.h0 = true;
            Object objD = of7Var2.d(str, this.l0, this);
            c71 c71Var = c71.X;
            if (objD == c71Var) {
                return c71Var;
            }
            ux0Var = ux0Var2;
            obj = objD;
        } else {
            if (!z) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ux0 ux0Var3 = this.g0;
            w39.n0(obj);
            ux0Var = ux0Var3;
        }
        long jLongValue = ((Number) obj).longValue();
        nf1 nf1Var = tp1.a;
        jm4.Q(b71Var, dm4.a, new mn5(ux0Var, jLongValue, null, (byte) 2), 2);
        return ux0Var;
    }
}
