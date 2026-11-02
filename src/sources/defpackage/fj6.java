package defpackage;

import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.enums.GoPingType;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fj6 extends p05 {
    public static final fj6 X = new fj6(MetaParams.class, "proxyPingMode", "getProxyPingMode()Lsu/happ/proxyutility/dto/enums/GoPingType;", 0);

    @Override // defpackage.p05, defpackage.yv3
    public final void H(Object obj, Object obj2) {
        ((MetaParams) obj).m2((GoPingType) obj2);
    }

    @Override // defpackage.p05, defpackage.lw3
    public final Object get(Object obj) {
        return ((MetaParams) obj).getProxyPingMode();
    }
}
