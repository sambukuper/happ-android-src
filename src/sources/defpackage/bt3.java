package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bt3 extends gv3 {
    public final String d;
    public final String e;

    public bt3(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt3)) {
            return false;
        }
        bt3 bt3Var = (bt3) obj;
        return dh3.f(this.d, bt3Var.d) && dh3.f(this.e, bt3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return this.d + ':' + this.e;
    }
}
