package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ww implements b85 {
    public static final ww a = new ww();
    public static final x82 b = x82.a("requestTimeMs");
    public static final x82 c = x82.a("requestUptimeMs");
    public static final x82 d = x82.a("clientInfo");
    public static final x82 e = x82.a("logSource");
    public static final x82 f = x82.a("logSourceName");
    public static final x82 g = x82.a("logEvent");
    public static final x82 h = x82.a("qosTier");

    @Override // defpackage.u02
    public final void a(Object obj, Object obj2) {
        qf4 qf4Var = (qf4) obj;
        c85 c85Var = (c85) obj2;
        c85Var.e(b, ((uy) qf4Var).a);
        uy uyVar = (uy) qf4Var;
        c85Var.e(c, uyVar.b);
        c85Var.a(d, uyVar.c);
        c85Var.a(e, uyVar.d);
        c85Var.a(f, uyVar.e);
        c85Var.a(g, uyVar.f);
        c85Var.a(h, c26.X);
    }
}
