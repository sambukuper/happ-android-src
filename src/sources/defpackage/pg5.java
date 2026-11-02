package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pg5 {
    public final Number a;
    public final Integer b;

    public pg5(Number number, Integer num) {
        this.a = number;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pg5)) {
            return false;
        }
        pg5 pg5Var = (pg5) obj;
        return this.a.equals(pg5Var.a) && this.b.equals(pg5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 37);
    }
}
