package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y02 {
    public final String a;

    public y02(String str) {
        if (str != null) {
            this.a = str;
        } else {
            b61.i("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y02)) {
            return false;
        }
        return this.a.equals(((y02) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return oi0.p(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
