package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ep3 implements Serializable {
    public static final ep3 g0;
    public final dp3 X;
    public final dp3 Y;
    public final Class Z;
    public final Class f0;

    static {
        dp3 dp3Var = dp3.g0;
        g0 = new ep3(dp3Var, dp3Var, null, null);
    }

    public ep3(dp3 dp3Var, dp3 dp3Var2, Class cls, Class cls2) {
        dp3 dp3Var3 = dp3.g0;
        this.X = dp3Var == null ? dp3Var3 : dp3Var;
        this.Y = dp3Var2 == null ? dp3Var3 : dp3Var2;
        this.Z = cls == Void.class ? null : cls;
        this.f0 = cls2 == Void.class ? null : cls2;
    }

    public final ep3 a(ep3 ep3Var) {
        if (ep3Var == null || ep3Var == g0) {
            return this;
        }
        dp3 dp3Var = ep3Var.X;
        dp3 dp3Var2 = ep3Var.Y;
        Class cls = ep3Var.Z;
        Class cls2 = ep3Var.f0;
        dp3 dp3Var3 = dp3.g0;
        dp3 dp3Var4 = this.X;
        boolean z = (dp3Var == dp3Var4 || dp3Var == dp3Var3) ? false : true;
        dp3 dp3Var5 = this.Y;
        boolean z2 = (dp3Var2 == dp3Var5 || dp3Var2 == dp3Var3) ? false : true;
        boolean z3 = (cls == this.Z && cls2 == this.f0) ? false : true;
        if (z) {
            return z2 ? new ep3(dp3Var, dp3Var2, cls, cls2) : new ep3(dp3Var, dp3Var5, cls, cls2);
        }
        if (z2) {
            return new ep3(dp3Var4, dp3Var2, cls, cls2);
        }
        return z3 ? new ep3(dp3Var4, dp3Var5, cls, cls2) : this;
    }

    public final ep3 b(dp3 dp3Var) {
        if (dp3Var == this.X) {
            return this;
        }
        return new ep3(dp3Var, this.Y, this.Z, this.f0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != ep3.class) {
            return false;
        }
        ep3 ep3Var = (ep3) obj;
        return ep3Var.X == this.X && ep3Var.Y == this.Y && ep3Var.Z == this.Z && ep3Var.f0 == this.f0;
    }

    public final int hashCode() {
        int iHashCode = this.Y.hashCode() + (this.X.hashCode() << 2);
        Class cls = this.Z;
        int iHashCode2 = iHashCode + (cls == null ? 0 : cls.hashCode());
        Class cls2 = this.f0;
        return iHashCode2 + (cls2 != null ? cls2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("JsonInclude.Value(value=");
        sb.append(this.X);
        sb.append(",content=");
        sb.append(this.Y);
        Class cls = this.Z;
        if (cls != null) {
            sb.append(",valueFilter=");
            sb.append(cls.getName());
            sb.append(".class");
        }
        Class cls2 = this.f0;
        if (cls2 != null) {
            sb.append(",contentFilter=");
            sb.append(cls2.getName());
            sb.append(".class");
        }
        sb.append(')');
        return sb.toString();
    }
}
