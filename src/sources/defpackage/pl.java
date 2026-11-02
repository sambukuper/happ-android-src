package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pl {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public pl(String str, int i, int i2, Object obj) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        xc3.a("Reversed range is not supported");
    }

    public static pl a(pl plVar, ml mlVar, int i, int i2, int i3) {
        Object obj = mlVar;
        if ((i3 & 1) != 0) {
            obj = plVar.a;
        }
        if ((i3 & 2) != 0) {
            i = plVar.b;
        }
        if ((i3 & 4) != 0) {
            i2 = plVar.c;
        }
        return new pl(plVar.d, i, i2, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl)) {
            return false;
        }
        pl plVar = (pl) obj;
        return dh3.f(this.a, plVar.a) && this.b == plVar.b && this.c == plVar.c && dh3.f(this.d, plVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + oi0.e(this.c, oi0.e(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public pl(int i, int i2, Object obj) {
        this(_UrlKt.FRAGMENT_ENCODE_SET, i, i2, obj);
    }
}
