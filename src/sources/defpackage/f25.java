package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f25 implements Serializable {
    public final Class X;
    public final int Y;
    public final String Z;

    public f25(Class cls, String str) {
        this.X = cls;
        this.Y = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        this.Z = (str == null || str.isEmpty()) ? null : str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != f25.class) {
            return false;
        }
        f25 f25Var = (f25) obj;
        return this.X == f25Var.X && Objects.equals(this.Z, f25Var.Z);
    }

    public final int hashCode() {
        return this.Y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[NamedType, class ");
        sb.append(this.X.getName());
        sb.append(", name: ");
        String str = this.Z;
        return oi0.p(sb, str == null ? "null" : oi0.p(new StringBuilder("'"), str, "'"), "]");
    }
}
