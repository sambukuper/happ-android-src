package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x61 extends f1 {
    public static final be Z = new be(17);
    public final String Y;

    public x61(String str) {
        super(Z);
        this.Y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x61) && this.Y.equals(((x61) obj).Y);
    }

    public final int hashCode() {
        return this.Y.hashCode();
    }

    public final String toString() {
        return oi0.o(new StringBuilder("CoroutineName("), this.Y, ')');
    }
}
