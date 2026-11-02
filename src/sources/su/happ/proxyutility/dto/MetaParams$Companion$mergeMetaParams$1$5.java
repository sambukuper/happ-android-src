package su.happ.proxyutility.dto;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(k = 3, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 1328)
final /* synthetic */ class MetaParams$Companion$mergeMetaParams$1$5 extends p05 {
    public static final MetaParams$Companion$mergeMetaParams$1$5 INSTANCE = new MetaParams$Companion$mergeMetaParams$1$5(MetaParams.class, "fragmentBean", "getFragmentBean-gLo-z28()Ljava/util/Map;", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(Object obj, Object obj2) {
        XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean tcpMaskSettingBean = (XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean) obj2;
        ((MetaParams) obj).v1(tcpMaskSettingBean != null ? tcpMaskSettingBean.getValue() : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object get(Object obj) {
        Map fragmentBean = ((MetaParams) obj).getFragmentBean();
        if (fragmentBean != null) {
            return new XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean(fragmentBean);
        }
        return null;
    }
}
