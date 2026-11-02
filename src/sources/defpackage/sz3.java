package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sz3 {
    public final int a;
    public final int b;
    public final int c;

    public sz3(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz3)) {
            return false;
        }
        sz3 sz3Var = (sz3) obj;
        return this.a == sz3Var.a && this.b == sz3Var.b && this.c == sz3Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oi0.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
