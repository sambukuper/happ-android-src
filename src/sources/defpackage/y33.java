package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class y33 extends ld2 {
    public char[] d;
    public int[] e;

    public final int l(z33 z33Var, String str) {
        int iB;
        int i = this.b;
        int i2 = 0;
        while (i2 < i) {
            int i3 = (i2 + i) >>> 1;
            char[] cArr = this.d;
            if (cArr != null) {
                char c = cArr[i3];
                int i4 = z33Var.f;
                iB = c < i4 ? b33.b(str, z33Var.b, c) : b33.b(str, z33Var.d.b, c - i4);
            } else {
                int i5 = this.e[i3];
                iB = i5 >= 0 ? b33.b(str, z33Var.b, i5) : b33.b(str, z33Var.d.b, i5 & Integer.MAX_VALUE);
            }
            if (iB < 0) {
                i = i3;
            } else {
                if (iB <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final boolean m(String str, b8 b8Var) {
        int iL = l((z33) b8Var.c, str);
        if (iL < 0) {
            return false;
        }
        b8Var.b = h((z33) b8Var.c, iL);
        return true;
    }

    public final String n(z33 z33Var, int i) {
        if (i < 0 || this.b <= i) {
            return null;
        }
        char[] cArr = this.d;
        if (cArr == null) {
            int i2 = this.e[i];
            if (i2 >= 0) {
                return z33.j(i2, z33Var.b);
            }
            return z33.j(i2 & Integer.MAX_VALUE, z33Var.d.b);
        }
        char c = cArr[i];
        int i3 = z33Var.f;
        if (c < i3) {
            return z33.j(c, z33Var.b);
        }
        return z33.j(c - i3, z33Var.d.b);
    }
}
