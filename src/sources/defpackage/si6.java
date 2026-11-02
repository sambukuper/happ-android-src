package defpackage;

import su.happ.proxyutility.dto.MetaParams;
import su.happ.proxyutility.dto.enums.InboundAuthMode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class si6 extends p05 {
    public static final si6 X = new si6(MetaParams.class, "socksAuthMode", "getSocksAuthMode()Lsu/happ/proxyutility/dto/enums/InboundAuthMode;", 0);

    @Override // defpackage.p05, defpackage.yv3
    public final void H(Object obj, Object obj2) {
        ((MetaParams) obj).x2((InboundAuthMode) obj2);
    }

    @Override // defpackage.p05, defpackage.lw3
    public final Object get(Object obj) {
        return ((MetaParams) obj).getSocksAuthMode();
    }
}
