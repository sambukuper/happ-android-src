package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class pk7 {
    public final j2 a;
    public final boolean b;
    public final int c;
    public final String d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        jd6 jd6Var = ld6.Companion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pk7(j2 j2Var, boolean z, int i, String str) {
        Object next;
        pb3 pb3Var;
        j2Var.getClass();
        this.a = j2Var;
        this.b = z;
        this.c = i;
        this.d = str;
        this.e = i <= 0;
        this.f = z ? 0 : 8;
        rw1 it = wv0.d1(j2Var).iterator();
        do {
            rw1 rw1Var = it;
            if (!rw1Var.Y.hasNext()) {
                next = null;
                break;
            } else {
                next = rw1Var.next();
                pb3Var = (pb3) next;
                int i2 = pb3Var.a;
            }
        } while (((ld6) pb3Var.b).h0);
        pb3 pb3Var2 = (pb3) next;
        Integer numValueOf = pb3Var2 != null ? Integer.valueOf(pb3Var2.a) : null;
        this.g = numValueOf != null ? numValueOf.intValue() : 0;
        String str2 = this.d;
        this.h = (str2 == null || fm7.o0(str2)) ? 8 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static pk7 a(pk7 pk7Var, j2 j2Var, boolean z, int i, String str, int i2) {
        if ((i2 & 1) != 0) {
            j2Var = pk7Var.a;
        }
        if ((i2 & 2) != 0) {
            z = pk7Var.b;
        }
        if ((i2 & 4) != 0) {
            i = pk7Var.c;
        }
        if ((i2 & 8) != 0) {
            str = pk7Var.d;
        }
        j2Var.getClass();
        return new pk7(j2Var, z, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk7)) {
            return false;
        }
        pk7 pk7Var = (pk7) obj;
        return dh3.f(this.a, pk7Var.a) && this.b == pk7Var.b && this.c == pk7Var.c && dh3.f(this.d, pk7Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iE = oi0.e(this.c, pc6.f(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return iE + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "StoriesState(stories=" + this.a + ", isForceOpen=" + this.b + ", secondsUntilCloseEnable=" + this.c + ", linkToOpen=" + this.d + ")";
    }
}
