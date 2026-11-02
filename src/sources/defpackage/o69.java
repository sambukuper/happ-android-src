package defpackage;

import com.google.gson.a;
import su.happ.proxyutility.dto.TestPingViaProxyData;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class o69 extends uy7 implements rn2 {
    public final /* synthetic */ TestPingViaProxyData g0;
    public final /* synthetic */ String h0;
    public final /* synthetic */ ii i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o69(TestPingViaProxyData testPingViaProxyData, String str, ii iiVar, q51 q51Var) {
        super(2, q51Var);
        this.g0 = testPingViaProxyData;
        this.h0 = str;
        this.i0 = iiVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        o69 o69VarN = n((q51) obj2, (b71) obj);
        dn8 dn8Var = dn8.a;
        o69VarN.q(dn8Var);
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new o69(this.g0, this.h0, this.i0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        w39.n0(obj);
        a aVar = yw2.b;
        TestPingViaProxyData testPingViaProxyData = this.g0;
        String config = testPingViaProxyData.getConfig();
        aVar.getClass();
        XRayConfig xRayConfig = (XRayConfig) aVar.c(config, new yi8(XRayConfig.class));
        XRayConfig.OutboundBean outboundBeanJ = xRayConfig.j();
        if (outboundBeanJ != null) {
            outboundBeanJ.n(this.h0);
        }
        of7 of7Var = of7.a;
        this.i0.B(new Long(of7.e(yw2.d.h(xRayConfig), testPingViaProxyData.getType())));
        return dn8.a;
    }
}
