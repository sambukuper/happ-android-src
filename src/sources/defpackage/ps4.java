package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ps4 {
    public static final ps4 b = new ps4("text/*");
    public static final ps4 c = new ps4("*/*");
    public final String a;

    public ps4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps4)) {
            return false;
        }
        return this.a.equals(((ps4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return pc6.p("MediaType(representation='", this.a, "')");
    }
}
