package su.happ.proxyutility.dto;

import kotlin.Metadata;
import su.happ.proxyutility.dto.enums.FragmentationLength;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(k = 3, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 1328)
final /* synthetic */ class MetaParams$Companion$mergeMetaParams$1$27 extends p05 {
    public static final MetaParams$Companion$mergeMetaParams$1$27 INSTANCE = new MetaParams$Companion$mergeMetaParams$1$27(MetaParams.class, "fragmentationLength", "getFragmentationLength-8mMDfP4()Ljava/lang/String;", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(Object obj, Object obj2) {
        FragmentationLength fragmentationLength = (FragmentationLength) obj2;
        ((MetaParams) obj).A1(fragmentationLength != null ? fragmentationLength.getValue() : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object get(Object obj) {
        String fragmentationLength = ((MetaParams) obj).getFragmentationLength();
        if (fragmentationLength != null) {
            return new FragmentationLength(fragmentationLength);
        }
        return null;
    }
}
