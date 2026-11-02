package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class tr {
    public final nr a;
    public final fr b;
    public final cp c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tr(nr nrVar, fr frVar, cp cpVar) {
        nrVar.getClass();
        frVar.getClass();
        cpVar.getClass();
        this.a = nrVar;
        this.b = frVar;
        this.c = cpVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr)) {
            return false;
        }
        tr trVar = (tr) obj;
        return this.a.equals(trVar.a) && this.b.equals(trVar.b) && this.c.equals(trVar.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.a.hashCode() + (this.a.a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AppShapes(menu=" + this.a + ", dialog=" + this.b + ", button=" + this.c + ")";
    }
}
