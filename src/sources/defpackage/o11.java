package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o11 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof o11) {
            return this.a == ((o11) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 1) {
            return "SUPPORTED";
        }
        return i == 2 ? "UNSUPPORTED" : "UNKNOWN";
    }
}
