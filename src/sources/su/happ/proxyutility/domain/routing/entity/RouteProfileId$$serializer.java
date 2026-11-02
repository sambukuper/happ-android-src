package su.happ.proxyutility.domain.routing.entity;

import defpackage.dq2;
import defpackage.e37;
import defpackage.ol7;
import defpackage.ow3;
import defpackage.rd1;
import defpackage.sc3;
import defpackage.ti1;
import defpackage.yl7;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"su/happ/proxyutility/domain/routing/entity/RouteProfileId.$serializer", "Ldq2;", "Lsu/happ/proxyutility/domain/routing/entity/RouteProfileId;", "Le37;", "descriptor", "Le37;", "d", "()Le37;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
@ti1
public final /* synthetic */ class RouteProfileId$$serializer implements dq2 {
    public static final int $stable = 0;
    public static final RouteProfileId$$serializer INSTANCE;
    private static final e37 descriptor;

    static {
        RouteProfileId$$serializer routeProfileId$$serializer = new RouteProfileId$$serializer();
        INSTANCE = routeProfileId$$serializer;
        sc3 sc3Var = new sc3("su.happ.proxyutility.domain.routing.entity.RouteProfileId", routeProfileId$$serializer);
        sc3Var.k("value", false);
        descriptor = sc3Var;
    }

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        String value = ((RouteProfileId) obj).getValue();
        value.getClass();
        ol7Var.i(descriptor).t(value);
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        String strS = rd1Var.p(descriptor).s();
        strS.getClass();
        return new RouteProfileId(strS);
    }

    @Override // defpackage.dq2
    public final ow3[] c() {
        return new ow3[]{yl7.a};
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return descriptor;
    }
}
