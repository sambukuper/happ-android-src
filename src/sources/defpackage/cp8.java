package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cp8 {
    public static final bp8 Companion = new bp8();
    public final String a;
    public final int b;
    public final up8 c;

    static {
        tp8 tp8Var = up8.Companion;
    }

    public /* synthetic */ cp8(int i, String str, int i2, up8 up8Var) {
        if (7 != (i & 7)) {
            ch3.S(i, 7, ap8.a.d());
            throw null;
        }
        this.a = str;
        this.b = i2;
        this.c = up8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp8)) {
            return false;
        }
        cp8 cp8Var = (cp8) obj;
        return dh3.f(this.a, cp8Var.a) && this.b == cp8Var.b && dh3.f(this.c, cp8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oi0.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "UpdateResponse(app=" + this.a + ", fileNum=" + this.b + ", apk=" + this.c + ")";
    }
}
