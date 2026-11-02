package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class lg4 implements ng4 {
    public final gg4 a;
    public final j2 b;
    public final int c;
    public final String d;
    public final j2 e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lg4(gg4 gg4Var, j2 j2Var, int i) {
        j2Var.getClass();
        this.a = gg4Var;
        this.b = j2Var;
        this.c = i;
        String str = (String) wv0.u0(i, j2Var);
        str = str == null ? "" : str;
        this.d = str;
        this.e = mb6.e0(new sd2(new hu(str, (byte) 6), new uh3((byte) 17), a37.X));
        int iA = j2Var.a();
        this.f = iA;
        this.g = iA > 1;
        this.h = i > 0;
        this.i = i < iA - 1;
        this.j = (gg4Var != null ? gg4Var.a : null) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static lg4 a(lg4 lg4Var, int i) {
        gg4 gg4Var = lg4Var.a;
        j2 j2Var = lg4Var.b;
        j2Var.getClass();
        return new lg4(gg4Var, j2Var, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg4)) {
            return false;
        }
        lg4 lg4Var = (lg4) obj;
        return dh3.f(this.a, lg4Var.a) && dh3.f(this.b, lg4Var.b) && this.c == lg4Var.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        gg4 gg4Var = this.a;
        int iHashCode = gg4Var == null ? 0 : gg4Var.hashCode();
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(source=");
        sb.append(this.a);
        sb.append(", pages=");
        sb.append(this.b);
        sb.append(", currentPage=");
        return oi0.n(sb, this.c, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public lg4(gg4 gg4Var, j2 j2Var, int i, int i2) {
        if ((i & 2) != 0) {
            List listAsList = Arrays.asList("");
            listAsList.getClass();
            ec7 ec7Var = ec7.Y;
            ec7Var.getClass();
            j2Var = ec7Var.e(listAsList);
        }
        this(gg4Var, j2Var, 0);
    }
}
