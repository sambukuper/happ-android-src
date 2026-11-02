package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class cs {
    public final o88 a;
    public final o88 b;
    public final o88 c;
    public final o88 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cs(o88 o88Var, o88 o88Var2, o88 o88Var3, o88 o88Var4) {
        this.a = o88Var;
        this.b = o88Var2;
        this.c = o88Var3;
        this.d = o88Var4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs)) {
            return false;
        }
        cs csVar = (cs) obj;
        return this.a.equals(csVar.a) && this.b.equals(csVar.b) && this.c.equals(csVar.c) && this.d.equals(csVar.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.d.hashCode() + pc6.g(this.c, pc6.g(this.b, this.a.hashCode() * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AppHTypo(h1=" + this.a + ", h2=" + this.b + ", h3=" + this.c + ", h4=" + this.d + ")";
    }
}
