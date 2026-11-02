package defpackage;

import java.util.Map;
import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ci6 extends p05 {
    public static final ci6 X = new ci6(MetaParams.class, "fragmentBean", "getFragmentBean-gLo-z28()Ljava/util/Map;", 0);

    @Override // defpackage.p05, defpackage.yv3
    public final void H(Object obj, Object obj2) {
        XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean tcpMaskSettingBean = (XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean) obj2;
        ((MetaParams) obj).v1(tcpMaskSettingBean != null ? tcpMaskSettingBean.getValue() : null);
    }

    @Override // defpackage.p05, defpackage.lw3
    public final Object get(Object obj) {
        Map fragmentBean = ((MetaParams) obj).getFragmentBean();
        if (fragmentBean != null) {
            return new XRayConfig.OutboundBean.StreamSettingsBean.TcpMasksBean.TcpMaskSettingBean(fragmentBean);
        }
        return null;
    }
}
