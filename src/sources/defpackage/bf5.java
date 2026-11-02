package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bf5 {
    public final byte a;

    public static String a(int i) {
        return "MirrorMode(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bf5) {
            return this.a == ((bf5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
