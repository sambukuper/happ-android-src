package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bp {
    public static final bp b = new bp(dw0.b(0.3f, dw0.c));
    public static final bp c = new bp(dw0.b(0.3f, dw0.b));
    public final long a;

    public bp(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp)) {
            return false;
        }
        long j = ((bp) obj).a;
        int i = dw0.h;
        return tk8.a(this.a, j);
    }

    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return pc6.p("AppBottomSheetColors(dragHandle=", dw0.h(this.a), ")");
    }
}
