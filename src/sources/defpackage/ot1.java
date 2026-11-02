package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ot1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ot1) && kt1.b(10.0f, 10.0f) && kt1.b(40.0f, 40.0f) && kt1.b(10.0f, 10.0f) && kt1.b(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + pc6.d(pc6.d(pc6.d(Float.hashCode(10.0f) * 31, 40.0f, 31), 10.0f, 31), 40.0f, 31);
    }

    public final String toString() {
        String strC = kt1.c(10.0f);
        String strC2 = kt1.c(40.0f);
        return oi0.q(oi0.t("DpTouchBoundsExpansion(start=", strC, ", top=", strC2, ", end="), kt1.c(10.0f), ", bottom=", kt1.c(40.0f), ", isLayoutDirectionAware=true)");
    }
}
