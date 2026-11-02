package defpackage;

import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.enums.FragmentationDelay;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pg6 extends p05 {
    public static final pg6 X = new pg6(MetaParams.class, "fragmentationInterval", "getFragmentationInterval-1HOOb-4()Ljava/lang/String;", 0);

    @Override // defpackage.p05, defpackage.yv3
    public final void H(Object obj, Object obj2) {
        FragmentationDelay fragmentationDelay = (FragmentationDelay) obj2;
        ((MetaParams) obj).z1(fragmentationDelay != null ? fragmentationDelay.getValue() : null);
    }

    @Override // defpackage.p05, defpackage.lw3
    public final Object get(Object obj) {
        String fragmentationInterval = ((MetaParams) obj).getFragmentationInterval();
        if (fragmentationInterval != null) {
            return new FragmentationDelay(fragmentationInterval);
        }
        return null;
    }
}
