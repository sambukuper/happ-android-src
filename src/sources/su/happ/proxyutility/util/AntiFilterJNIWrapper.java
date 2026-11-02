package su.happ.proxyutility.util;

import java.util.ArrayList;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.service.AntiFilterVpnSupportsSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082 ¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lsu/happ/proxyutility/util/AntiFilterJNIWrapper;", "", "Lsu/happ/proxyutility/service/AntiFilterVpnSupportsSet;", "vpnSupportsSet", "", "", "arguments", "", "runAntiFilter", "(Lsu/happ/proxyutility/service/AntiFilterVpnSupportsSet;[Ljava/lang/String;)I", "antiFilterId", "Ldn8;", "stopAntiFilter", "(I)V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class AntiFilterJNIWrapper {
    public final AntiFilterVpnSupportsSet a;
    public Integer b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AntiFilterJNIWrapper(AntiFilterVpnSupportsSet antiFilterVpnSupportsSet) {
        this.a = antiFilterVpnSupportsSet;
        System.loadLibrary("core");
    }

    private final native int runAntiFilter(AntiFilterVpnSupportsSet vpnSupportsSet, String[] arguments);

    private final native void stopAntiFilter(int antiFilterId);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(ArrayList arrayList) {
        b();
        this.b = Integer.valueOf(runAntiFilter(this.a, (String[]) arrayList.toArray(new String[0])));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        Integer num = this.b;
        if (num != null) {
            stopAntiFilter(num.intValue());
            this.b = null;
        }
    }
}
