package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b07 {
    public final a07 a;
    public final a07 b;
    public final boolean c;

    public b07(a07 a07Var, a07 a07Var2, boolean z) {
        this.a = a07Var;
        this.b = a07Var2;
        this.c = z;
    }

    public static b07 a(b07 b07Var, a07 a07Var, a07 a07Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            a07Var = b07Var.a;
        }
        if ((i & 2) != 0) {
            a07Var2 = b07Var.b;
        }
        b07Var.getClass();
        return new b07(a07Var, a07Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b07)) {
            return false;
        }
        b07 b07Var = (b07) obj;
        return dh3.f(this.a, b07Var.a) && dh3.f(this.b, b07Var.b) && this.c == b07Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return p61.o(sb, this.c, ")");
    }
}
