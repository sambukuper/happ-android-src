package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class li1 {
    public final e26 a;
    public final byte b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public li1(e26 e26Var, int i, int i2) {
        this.a = e26Var;
        this.b = i;
        this.c = i2;
    }

    public static li1 a(Class cls) {
        return new li1(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof li1)) {
            return false;
        }
        li1 li1Var = (li1) obj;
        return this.a.equals(li1Var.a) && this.b == li1Var.b && this.c == li1Var.c;
    }

    public final int hashCode() {
        return (this.c ? 1 : 0) ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        byte b = this.b;
        if (b == 1) {
            str = "required";
        } else {
            str = b == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        boolean z = this.c;
        if (z == 0) {
            str2 = "direct";
        } else if (z == 1) {
            str2 = "provider";
        } else {
            if (z != 2) {
                bt.g(pc6.j(z ? 1 : 0, "Unsupported injection: "));
                return null;
            }
            str2 = "deferred";
        }
        return oi0.p(sb, str2, "}");
    }

    public li1(int i, int i2, Class cls) {
        this(e26.a(cls), i, i2);
    }
}
