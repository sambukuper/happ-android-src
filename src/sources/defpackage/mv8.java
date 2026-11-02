package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mv8 extends ru2 {
    public static final lv8 c = lv8.Z;
    public final lv8 a = lv8.g0;
    public final s82 b = s82.Z;

    @Override // defpackage.ru2
    public final s82 a() {
        return this.b;
    }

    @Override // defpackage.ru2
    public final boolean b(aj0 aj0Var, xy0 xy0Var) {
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return true;
        }
        if (iOrdinal == 2) {
            return aj0Var.d();
        }
        if (iOrdinal == 3) {
            return aj0Var.x();
        }
        b61.c();
        return false;
    }

    public final String toString() {
        return "VideoStabilizationFeature(mode=" + this.a.name() + ')';
    }
}
