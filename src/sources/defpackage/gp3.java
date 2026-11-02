package defpackage;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gp3 implements Serializable {
    public static final gp3 Z = new gp3(null, null);
    public final Set X;
    public final Boolean Y;

    public gp3(Set set, Boolean bool) {
        this.X = set;
        this.Y = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == gp3.class) {
            gp3 gp3Var = (gp3) obj;
            if (Objects.equals(this.Y, gp3Var.Y) && Objects.equals(this.X, gp3Var.X)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set set = this.X;
        return (Boolean.TRUE.equals(this.Y) ? 1 : 0) + (set == null ? 0 : set.hashCode());
    }

    public final String toString() {
        return String.format("JsonIncludeProperties.Value(included=%s,ordered=%s)", this.X, this.Y);
    }
}
