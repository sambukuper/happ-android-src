package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ul7 implements ml {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof ul7) {
            return this.a.equals(((ul7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return pc6.p("StringAnnotation(value=", this.a, ")");
    }
}
