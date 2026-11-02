package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vw implements b85 {
    public static final vw a = new vw();
    public static final x82 b = x82.a("eventTimeMs");
    public static final x82 c = x82.a("eventCode");
    public static final x82 d = x82.a("eventUptimeMs");
    public static final x82 e = x82.a("sourceExtension");
    public static final x82 f = x82.a("sourceExtensionJsonProto3");
    public static final x82 g = x82.a("timezoneOffsetSeconds");
    public static final x82 h = x82.a("networkConnectionInfo");

    @Override // defpackage.u02
    public final void a(Object obj, Object obj2) {
        af4 af4Var = (af4) obj;
        c85 c85Var = (c85) obj2;
        c85Var.e(b, ((ty) af4Var).a);
        ty tyVar = (ty) af4Var;
        c85Var.a(c, tyVar.b);
        c85Var.e(d, tyVar.c);
        c85Var.a(e, tyVar.d);
        c85Var.a(f, tyVar.e);
        c85Var.e(g, tyVar.f);
        c85Var.a(h, tyVar.g);
    }
}
