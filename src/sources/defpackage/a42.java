package defpackage;

import android.util.Range;
import android.util.Rational;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a42 {
    public final boolean a;
    public final int b;
    public final Range c;
    public final Rational d;

    public a42(boolean z, int i, Range range, Rational rational) {
        this.a = z;
        this.b = i;
        this.c = range;
        this.d = rational;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a42)) {
            return false;
        }
        a42 a42Var = (a42) obj;
        return this.a == a42Var.a && this.b == a42Var.b && this.c.equals(a42Var.c) && this.d.equals(a42Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + oi0.e(this.b, Boolean.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "EvCompValue(supported=" + this.a + ", index=" + this.b + ", range=" + this.c + ", step=" + this.d + ')';
    }
}
