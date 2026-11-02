package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bf7 {
    public final String a;
    public final v15 b;
    public final String c;
    public final String d;
    public final String e;

    public bf7(String str, v15 v15Var, String str2, String str3) {
        v15Var.getClass();
        this.a = str;
        this.b = v15Var;
        this.c = str2;
        this.d = str3;
        this.e = str + '.' + (v15Var + '(' + str2 + ')' + str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf7)) {
            return false;
        }
        bf7 bf7Var = (bf7) obj;
        return this.a.equals(bf7Var.a) && dh3.f(this.b, bf7Var.b) && this.c.equals(bf7Var.c) && this.d.equals(bf7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + pc6.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", parameters=");
        sb.append(this.c);
        sb.append(", returnType=");
        return oi0.o(sb, this.d, ')');
    }
}
