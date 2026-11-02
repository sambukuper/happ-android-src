package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vn1 {
    public final boolean a;
    public final boolean b;
    public final boolean d;
    public final boolean e;
    public final kz6 c = kz6.X;
    public final String f = _UrlKt.FRAGMENT_ENCODE_SET;
    public final byte g = 2;

    public vn1(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.a = z;
        this.b = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vn1)) {
            return false;
        }
        vn1 vn1Var = (vn1) obj;
        return this.a == vn1Var.a && this.b == vn1Var.b && this.c == vn1Var.c && this.d == vn1Var.d && this.e == vn1Var.e && this.g == vn1Var.g;
    }

    public final int hashCode() {
        return (pc6.f(pc6.f((this.c.hashCode() + pc6.f(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e) + this.g) * 31;
    }
}
