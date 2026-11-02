package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class pq2 {
    public final b83 a;
    public final boolean b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pq2(b83 b83Var, boolean z) {
        b83Var.getClass();
        this.a = b83Var;
        this.b = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static pq2 a(pq2 pq2Var, b83 b83Var, int i) {
        if ((i & 1) != 0) {
            b83Var = pq2Var.a;
        }
        boolean z = (i & 2) != 0 ? pq2Var.b : true;
        b83Var.getClass();
        return new pq2(b83Var, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq2)) {
            return false;
        }
        pq2 pq2Var = (pq2) obj;
        return dh3.f(this.a, pq2Var.a) && this.b == pq2Var.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "GeoFileDownloadState(geoFilesProgressStates=" + this.a + ", isLoading=" + this.b + ")";
    }
}
