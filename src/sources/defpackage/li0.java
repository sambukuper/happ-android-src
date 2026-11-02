package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class li0 {
    public final hi0 a;
    public final Map b;

    public li0(hi0 hi0Var, Map map) {
        this.a = hi0Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li0)) {
            return false;
        }
        li0 li0Var = (li0) obj;
        return this.a.equals(li0Var.a) && this.b.equals(li0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CameraGraphCreationResult(config=" + this.a + ", streamConfigMap=" + this.b + ')';
    }
}
