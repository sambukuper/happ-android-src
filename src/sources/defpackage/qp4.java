package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qp4 {
    public static pp4 a(Object obj, Object obj2) {
        pp4 pp4VarB = (pp4) obj;
        pp4 pp4Var = (pp4) obj2;
        if (!pp4Var.isEmpty()) {
            if (!pp4VarB.X) {
                pp4VarB = pp4VarB.b();
            }
            pp4VarB.a();
            if (!pp4Var.isEmpty()) {
                pp4VarB.putAll(pp4Var);
            }
        }
        return pp4VarB;
    }
}
