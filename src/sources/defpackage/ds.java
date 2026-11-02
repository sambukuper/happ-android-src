package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class ds {
    public final cs a;
    public final o88 b;
    public final o88 c;
    public final o88 d;
    public final o88 e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ds(cs csVar, o88 o88Var, o88 o88Var2, o88 o88Var3, o88 o88Var4) {
        this.a = csVar;
        this.b = o88Var;
        this.c = o88Var2;
        this.d = o88Var3;
        this.e = o88Var4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds)) {
            return false;
        }
        ds dsVar = (ds) obj;
        return this.a.equals(dsVar.a) && this.b.equals(dsVar.b) && this.c.equals(dsVar.c) && this.d.equals(dsVar.d) && this.e.equals(dsVar.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.e.hashCode() + pc6.g(this.d, pc6.g(this.c, pc6.g(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AppTypography(h=" + this.a + ", body=" + this.b + ", regular=" + this.c + ", caption=" + this.d + ", captionSm=" + this.e + ")";
    }
}
