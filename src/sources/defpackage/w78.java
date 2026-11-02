package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w78 {
    public final ql a;
    public final o88 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final fi1 g;
    public final z24 h;
    public final fi2 i;
    public final long j;

    public w78(ql qlVar, o88 o88Var, List list, int i, boolean z, int i2, fi1 fi1Var, z24 z24Var, fi2 fi2Var, long j) {
        this.a = qlVar;
        this.b = o88Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = fi1Var;
        this.h = z24Var;
        this.i = fi2Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w78)) {
            return false;
        }
        w78 w78Var = (w78) obj;
        return dh3.f(this.a, w78Var.a) && dh3.f(this.b, w78Var.b) && dh3.f(this.c, w78Var.c) && this.d == w78Var.d && this.e == w78Var.e && this.f == w78Var.f && dh3.f(this.g, w78Var.g) && this.h == w78Var.h && dh3.f(this.i, w78Var.i) && q31.b(this.j, w78Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + oi0.e(this.f, pc6.f((p61.f(pc6.g(this.b, this.a.hashCode() * 31, 31), 31, this.c) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + gs8.o(this.f) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + q31.l(this.j) + ")";
    }
}
