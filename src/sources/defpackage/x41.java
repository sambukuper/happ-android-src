package defpackage;

import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x41 implements Serializable {
    public final transient Object X;

    static {
        new x41();
        new x41();
    }

    public x41(ih4 ih4Var, md0 md0Var) {
        this.X = ih4Var;
        md0Var.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof x41)) {
            return false;
        }
        Object obj2 = ((x41) obj).X;
        Object obj3 = this.X;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        if ((obj3 instanceof File) || (obj3 instanceof URL) || (obj3 instanceof URI)) {
            return obj3.equals(obj2);
        }
        return obj3 == obj2;
    }

    public final int hashCode() {
        return Objects.hashCode(this.X);
    }

    public x41() {
        this(null, md0.Z);
    }
}
