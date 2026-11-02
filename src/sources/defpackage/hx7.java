package defpackage;

import android.util.Rational;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class hx7 {
    public final int a;
    public final int b;
    public final Rational c;
    public final boolean d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hx7(aj0 aj0Var, Rational rational) {
        this.a = aj0Var.c();
        this.b = aj0Var.j();
        this.c = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.d = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Size a(i63 i63Var) {
        int iH = i63Var.H(0);
        Size size = (Size) i63Var.a(i63.w, (Object) null);
        if (size != null) {
            int iQ = w39.Q(w39.m0(iH), this.a, 1 == this.b);
            if (iQ == 90 || iQ == 270) {
                return new Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }
}
