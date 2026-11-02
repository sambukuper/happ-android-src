package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k88 {
    public final String a;
    public String b;
    public boolean c = false;
    public wg5 d = null;

    public k88(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k88)) {
            return false;
        }
        k88 k88Var = (k88) obj;
        return dh3.f(this.a, k88Var.a) && dh3.f(this.b, k88Var.b) && this.c == k88Var.c && dh3.f(this.d, k88Var.d);
    }

    public final int hashCode() {
        int iF = pc6.f(pc6.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        wg5 wg5Var = this.d;
        return iF + (wg5Var == null ? 0 : wg5Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ")";
    }
}
