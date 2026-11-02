package su.happ.proxyutility.dto;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"su/happ/proxyutility/dto/AdditionalInfoCode.$serializer", "Ldq2;", "Lsu/happ/proxyutility/dto/AdditionalInfoCode;", "Le37;", "descriptor", "Le37;", "d", "()Le37;", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
@ti1
public final /* synthetic */ class AdditionalInfoCode$$serializer implements dq2 {
    public static final int $stable = 0;
    public static final AdditionalInfoCode$$serializer INSTANCE;
    private static final e37 descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AdditionalInfoCode$$serializer additionalInfoCode$$serializer = new AdditionalInfoCode$$serializer();
        INSTANCE = additionalInfoCode$$serializer;
        sc3 sc3Var = new sc3("su.happ.proxyutility.dto.AdditionalInfoCode", additionalInfoCode$$serializer);
        sc3Var.k("value", false);
        descriptor = sc3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(ol7 ol7Var, Object obj) {
        ol7Var.i(descriptor).k(((AdditionalInfoCode) obj).getValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object b(rd1 rd1Var) {
        return new AdditionalInfoCode(rd1Var.p(descriptor).l());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ow3[] c() {
        return new ow3[]{nf3.a};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final e37 d() {
        return descriptor;
    }
}
