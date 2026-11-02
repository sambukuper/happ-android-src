package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ey {
    public final xx7 a;
    public final xx7 b;
    public final ArrayList c;

    public ey(xx7 xx7Var, xx7 xx7Var2, ArrayList arrayList) {
        if (xx7Var == null) {
            b61.i("Null primarySurfaceEdge");
            throw null;
        }
        this.a = xx7Var;
        if (xx7Var2 == null) {
            b61.i("Null secondarySurfaceEdge");
            throw null;
        }
        this.b = xx7Var2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ey)) {
            return false;
        }
        ey eyVar = (ey) obj;
        return this.a.equals(eyVar.a) && this.b.equals(eyVar.b) && this.c.equals(eyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.a + ", secondarySurfaceEdge=" + this.b + ", outConfigs=" + this.c + "}";
    }
}
