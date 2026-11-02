package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s73 {
    public static final /* synthetic */ int g = 0;
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final ge4 f;

    static {
        ge4 ge4Var = ge4.Z;
    }

    public s73(boolean z, int i, boolean z2, int i2, int i3, ge4 ge4Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = ge4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s73)) {
            return false;
        }
        s73 s73Var = (s73) obj;
        return this.a == s73Var.a && this.b == s73Var.b && this.c == s73Var.c && this.d == s73Var.d && this.e == s73Var.e && dh3.f(this.f, s73Var.f);
    }

    public final int hashCode() {
        return this.f.X.hashCode() + oi0.e(this.e, oi0.e(this.d, pc6.f(oi0.e(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + vx3.a(this.b) + ", autoCorrect=" + this.c + ", keyboardType=" + xx3.a(this.d) + ", imeAction=" + l73.a(this.e) + ", platformImeOptions=null, hintLocales=" + this.f + ")";
    }
}
