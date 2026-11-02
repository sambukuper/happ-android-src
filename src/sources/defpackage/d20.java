package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d20 implements Comparable {
    public final String X;
    public final String Y;
    public final String Z;
    public final String f0;
    public volatile int g0;

    public d20(String str, String str2, String str3, String str4) {
        this.X = _UrlKt.FRAGMENT_ENCODE_SET;
        this.Y = _UrlKt.FRAGMENT_ENCODE_SET;
        this.Z = _UrlKt.FRAGMENT_ENCODE_SET;
        this.f0 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (str != null) {
            this.X = str;
        }
        if (str2 != null) {
            this.Y = str2;
        }
        if (str3 != null) {
            this.Z = str3;
        }
        if (str4 != null) {
            this.f0 = str4;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d20 d20Var = (d20) obj;
        int iJ = gv3.j(this.X, d20Var.X);
        return (iJ == 0 && (iJ = gv3.j(this.Y, d20Var.Y)) == 0 && (iJ = gv3.j(this.Z, d20Var.Z)) == 0) ? gv3.j(this.f0, d20Var.f0) : iJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d20)) {
            return false;
        }
        d20 d20Var = (d20) obj;
        return gv3.k(d20Var.X, this.X) && gv3.k(d20Var.Y, this.Y) && gv3.k(d20Var.Z, this.Z) && gv3.k(d20Var.f0, this.f0);
    }

    public final int hashCode() {
        int iY = this.g0;
        if (iY == 0) {
            for (int i = 0; i < this.X.length(); i++) {
                iY = (iY * 31) + gv3.Y(this.X.charAt(i));
            }
            for (int i2 = 0; i2 < this.Y.length(); i2++) {
                iY = (iY * 31) + gv3.Y(this.Y.charAt(i2));
            }
            for (int i3 = 0; i3 < this.Z.length(); i3++) {
                iY = (iY * 31) + gv3.Y(this.Z.charAt(i3));
            }
            for (int i4 = 0; i4 < this.f0.length(); i4++) {
                iY = (iY * 31) + gv3.Y(this.f0.charAt(i4));
            }
            this.g0 = iY;
        }
        return iY;
    }
}
