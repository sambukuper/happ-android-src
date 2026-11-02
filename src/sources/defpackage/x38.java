package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x38 {
    public static final x38 b = new x38(0);
    public static final x38 c = new x38(1);
    public static final x38 d = new x38(2);
    public final int a;

    public x38(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x38) {
            return this.a == ((x38) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        return arrayList.size() == 1 ? oi0.k(arrayList.get(0), "TextDecoration.") : pc6.p("TextDecoration[", tb4.a(arrayList, ", ", null, 62), "]");
    }
}
