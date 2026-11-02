package defpackage;

import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.enums.FragmentationLength;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ng6 extends p05 {
    public static final ng6 X = new ng6(MetaParams.class, "fragmentationLength", "getFragmentationLength-8mMDfP4()Ljava/lang/String;", 0);

    @Override // defpackage.p05, defpackage.yv3
    public final void H(Object obj, Object obj2) {
        FragmentationLength fragmentationLength = (FragmentationLength) obj2;
        ((MetaParams) obj).A1(fragmentationLength != null ? fragmentationLength.getValue() : null);
    }

    @Override // defpackage.p05, defpackage.lw3
    public final Object get(Object obj) {
        String fragmentationLength = ((MetaParams) obj).getFragmentationLength();
        if (fragmentationLength != null) {
            return new FragmentationLength(fragmentationLength);
        }
        return null;
    }
}
