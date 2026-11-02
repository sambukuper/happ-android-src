package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z08 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public z08(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z08)) {
            return false;
        }
        z08 z08Var = (z08) obj;
        if (dh3.f(this.a, z08Var.a) && dh3.f(this.b, z08Var.b) && dh3.f(this.c, z08Var.c) && this.d.equals(z08Var.d)) {
            return this.e.equals(z08Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + p61.f(pc6.e(pc6.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        gm7.M(wv0.y0(wv0.R0(this.d), ",", null, null, null, 62));
        gm7.M("},");
        dn8 dn8Var = dn8.a;
        sb.append(dn8Var);
        sb.append("\n            |   referenceColumnNames = {");
        gm7.M(wv0.y0(wv0.R0(this.e), ",", null, null, null, 62));
        gm7.M(" }");
        sb.append(dn8Var);
        sb.append("\n            |}\n        ");
        return gm7.M(gm7.O(sb.toString()));
    }
}
