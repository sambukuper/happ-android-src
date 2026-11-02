package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f58 {
    public static final f58 f = new f58(false, 9205357640488583168L, 0.0f, lf6.X, false);
    public final boolean a;
    public final long b;
    public final float c;
    public final lf6 d;
    public final boolean e;

    public f58(boolean z, long j, float f2, lf6 lf6Var, boolean z2) {
        this.a = z;
        this.b = j;
        this.c = f2;
        this.d = lf6Var;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f58)) {
            return false;
        }
        f58 f58Var = (f58) obj;
        return this.a == f58Var.a && z85.b(this.b, f58Var.b) && Float.compare(this.c, f58Var.c) == 0 && this.d == f58Var.d && this.e == f58Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + pc6.d(p61.g(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31)) * 31);
    }

    public final String toString() {
        String strH = z85.h(this.b);
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(strH);
        sb.append(", lineHeight=");
        sb.append(this.c);
        sb.append(", direction=");
        sb.append(this.d);
        sb.append(", handlesCrossed=");
        return p61.o(sb, this.e, ")");
    }
}
