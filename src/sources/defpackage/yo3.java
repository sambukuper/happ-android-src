package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yo3 implements Serializable {
    public static final yo3 h0 = new yo3(Collections.EMPTY_SET, false, false, false, true);
    public final Set X;
    public final boolean Y;
    public final boolean Z;
    public final boolean f0;
    public final boolean g0;

    public yo3(Set set, boolean z, boolean z2, boolean z3, boolean z4) {
        if (set == null) {
            this.X = Collections.EMPTY_SET;
        } else {
            this.X = set;
        }
        this.Y = z;
        this.Z = z2;
        this.f0 = z3;
        this.g0 = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == yo3.class) {
            yo3 yo3Var = (yo3) obj;
            if (this.Y == yo3Var.Y && this.g0 == yo3Var.g0 && this.Z == yo3Var.Z && this.f0 == yo3Var.f0 && this.X.equals(yo3Var.X)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode() + (this.Y ? 1 : -3) + (this.Z ? 3 : -7) + (this.f0 ? 7 : -11) + (this.g0 ? 11 : -13);
    }

    public final String toString() {
        return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this.X, Boolean.valueOf(this.Y), Boolean.valueOf(this.Z), Boolean.valueOf(this.f0), Boolean.valueOf(this.g0));
    }
}
