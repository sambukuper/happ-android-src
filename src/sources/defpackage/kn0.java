package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kn0 implements ln0 {
    public final Map X;
    public final Map Y;

    public kn0(Map map, Map map2) {
        this.X = map;
        this.Y = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn0)) {
            return false;
        }
        kn0 kn0Var = (kn0) obj;
        return this.X.equals(kn0Var.X) && this.Y.equals(kn0Var.Y);
    }

    public final int hashCode() {
        return this.Y.hashCode() + (this.X.hashCode() * 31);
    }

    public final String toString() {
        return "Success(deferred=" + this.X + ", outputSurfaceMap=" + this.Y + ')';
    }
}
