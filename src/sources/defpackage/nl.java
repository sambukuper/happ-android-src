package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nl {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public nl(String str, int i, int i2, Object obj) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final pl a(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            xc3.b("Item.end should be set first");
        }
        return new pl(this.d, this.b, i, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl)) {
            return false;
        }
        nl nlVar = (nl) obj;
        return dh3.f(this.a, nlVar.a) && this.b == nlVar.b && this.c == nlVar.c && dh3.f(this.d, nlVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + oi0.e(this.c, oi0.e(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }
}
