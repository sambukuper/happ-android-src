package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wb0 implements ub0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ub0
    public final boolean a(et6 et6Var) {
        switch (this.a) {
            case 0:
                return !(et6Var instanceof ct6) || ((ct6) et6Var).g().size() == 0;
            case 1:
                return et6Var.b == null;
            default:
                return false;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
