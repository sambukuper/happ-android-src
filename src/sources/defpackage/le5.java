package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class le5 {
    public final ArrayList a;
    public final LinkedHashMap b;
    public final af c;
    public final LinkedHashMap d;

    public le5(ArrayList arrayList, LinkedHashMap linkedHashMap, af afVar, LinkedHashMap linkedHashMap2) {
        this.a = arrayList;
        this.b = linkedHashMap;
        this.c = afVar;
        this.d = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le5)) {
            return false;
        }
        le5 le5Var = (le5) obj;
        return this.a.equals(le5Var.a) && this.b.equals(le5Var.b) && dh3.f(this.c, le5Var.c) && this.d.equals(le5Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        af afVar = this.c;
        return this.d.hashCode() + ((iHashCode + (afVar == null ? 0 : afVar.hashCode())) * 31);
    }

    public final String toString() {
        return "OutputConfigurations(all=" + this.a + ", deferred=" + this.b + ", postviewOutput=" + this.c + ", outputSurfaceMap=" + this.d + ')';
    }
}
