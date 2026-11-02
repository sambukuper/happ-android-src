package defpackage;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b18 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public b18(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b18)) {
            return false;
        }
        b18 b18Var = (b18) obj;
        if (!this.a.equals(b18Var.a) || !this.b.equals(b18Var.b) || !this.c.equals(b18Var.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = b18Var.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(c18.d(wv0.S0(this.b.values(), new mv4((byte) 10))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(c18.d(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        sb.append(c18.d(set != null ? wv0.S0(set, new mv4((byte) 11)) : d02.X));
        sb.append("\n            |}\n        ");
        return gm7.O(sb.toString());
    }
}
