package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a18 {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public a18(String str, boolean z, List list, List list2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a18) {
            a18 a18Var = (a18) obj;
            String str = a18Var.a;
            if (this.b == a18Var.b && this.c.equals(a18Var.c) && dh3.f(this.d, a18Var.d)) {
                String str2 = this.a;
                return mm7.Z(str2, false, "index_") ? mm7.Z(str, false, "index_") : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + p61.f((((mm7.Z(str, false, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        gm7.M(wv0.y0(this.c, ",", null, null, null, 62));
        gm7.M("},");
        dn8 dn8Var = dn8.a;
        sb.append(dn8Var);
        sb.append("\n            |   orders = {");
        gm7.M(wv0.y0(this.d, ",", null, null, null, 62));
        gm7.M(" }");
        sb.append(dn8Var);
        sb.append("\n            |}\n        ");
        return gm7.M(gm7.O(sb.toString()));
    }
}
