package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hw0 {
    public final int A;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public hw0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
        this.l = i12;
        this.m = i13;
        this.n = i14;
        this.o = i15;
        this.p = i16;
        this.q = i17;
        this.r = i18;
        this.s = i19;
        this.t = i20;
        this.u = i21;
        this.v = i22;
        this.w = i23;
        this.x = i24;
        this.y = i25;
        this.z = i26;
        this.A = i27;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw0)) {
            return false;
        }
        hw0 hw0Var = (hw0) obj;
        return this.a == hw0Var.a && this.b == hw0Var.b && this.c == hw0Var.c && this.d == hw0Var.d && this.e == hw0Var.e && this.f == hw0Var.f && this.g == hw0Var.g && this.h == hw0Var.h && this.i == hw0Var.i && this.j == hw0Var.j && this.k == hw0Var.k && this.l == hw0Var.l && this.m == hw0Var.m && this.n == hw0Var.n && this.o == hw0Var.o && this.p == hw0Var.p && this.q == hw0Var.q && this.r == hw0Var.r && this.s == hw0Var.s && this.t == hw0Var.t && this.u == hw0Var.u && this.v == hw0Var.v && this.w == hw0Var.w && this.x == hw0Var.x && this.y == hw0Var.y && this.z == hw0Var.z && this.A == hw0Var.A;
    }

    public final int hashCode() {
        return Integer.hashCode(this.A) + oi0.e(this.z, oi0.e(this.y, oi0.e(this.x, oi0.e(this.w, oi0.e(this.v, oi0.e(this.u, oi0.e(this.t, oi0.e(this.s, oi0.e(this.r, oi0.e(this.q, oi0.e(this.p, oi0.e(this.o, oi0.e(this.n, oi0.e(this.m, oi0.e(this.l, oi0.e(this.k, oi0.e(this.j, oi0.e(this.i, oi0.e(this.h, oi0.e(this.g, oi0.e(this.f, oi0.e(this.e, oi0.e(this.d, oi0.e(this.c, oi0.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = oi0.r(this.a, "ColorScheme(textColor=", this.b, ", cursorColor=", ", backgroundColor=");
        oi0.x(sbR, this.c, ", gutterColor=", this.d, ", gutterDividerColor=");
        oi0.x(sbR, this.e, ", gutterCurrentLineNumberColor=", this.f, ", gutterTextColor=");
        oi0.x(sbR, this.g, ", selectedLineColor=", this.h, ", selectionColor=");
        oi0.x(sbR, this.i, ", suggestionQueryColor=", this.j, ", findResultBackgroundColor=");
        oi0.x(sbR, this.k, ", delimiterBackgroundColor=", this.l, ", numberColor=");
        oi0.x(sbR, this.m, ", operatorColor=", this.n, ", keywordColor=");
        oi0.x(sbR, this.o, ", typeColor=", this.p, ", langConstColor=");
        oi0.x(sbR, this.q, ", preprocessorColor=", this.r, ", variableColor=");
        oi0.x(sbR, this.s, ", methodColor=", this.t, ", stringColor=");
        oi0.x(sbR, this.u, ", commentColor=", this.v, ", tagColor=");
        oi0.x(sbR, this.w, ", tagNameColor=", this.x, ", attrNameColor=");
        oi0.x(sbR, this.y, ", attrValueColor=", this.z, ", entityRefColor=");
        return oi0.n(sbR, this.A, ")");
    }
}
