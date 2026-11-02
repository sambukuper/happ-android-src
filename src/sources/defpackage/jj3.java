package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jj3 implements Serializable {
    public static final jj3 f0 = new jj3(null, null, null);
    public final Object X;
    public final Boolean Y;
    public final Boolean Z;

    public jj3(Object obj, Boolean bool, Boolean bool2) {
        this.X = obj;
        this.Y = bool;
        this.Z = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == jj3.class) {
            jj3 jj3Var = (jj3) obj;
            if (Objects.equals(this.X, jj3Var.X) && Objects.equals(this.Y, jj3Var.Y) && Objects.equals(this.Z, jj3Var.Z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.X;
        int iHashCode = obj != null ? 1 + obj.hashCode() : 1;
        Boolean bool = this.Y;
        if (bool != null) {
            iHashCode += bool.hashCode();
        }
        Boolean bool2 = this.Z;
        return bool2 != null ? bool2.hashCode() + iHashCode : iHashCode;
    }

    public final String toString() {
        return String.format("JacksonInject.Value(id=%s,useInput=%s,optional=%s)", this.X, this.Y, this.Z);
    }
}
