package defpackage;

import java.io.Serializable;
import java.util.Objects;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wr3 implements Serializable {
    public final ur3 X;
    public final tr3 Y;
    public final String Z;
    public final Class f0;
    public final boolean g0;
    public final Boolean h0;
    public final Boolean i0;

    public wr3(ur3 ur3Var, tr3 tr3Var, String str, Class cls, boolean z, Boolean bool, Boolean bool2) {
        this.f0 = cls;
        this.X = ur3Var;
        this.Y = tr3Var;
        this.Z = str;
        this.g0 = z;
        this.h0 = bool;
        this.i0 = bool2;
    }

    public static wr3 a(ur3 ur3Var, tr3 tr3Var, String str, Class cls, boolean z, Boolean bool, Boolean bool2) {
        if (str == null || str.isEmpty()) {
            str = ur3Var != null ? ur3Var.X : _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String str2 = str;
        if (cls == null || cls.isAnnotation()) {
            cls = null;
        }
        return new wr3(ur3Var, tr3Var, str2, cls, z, bool, bool2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == wr3.class) {
            wr3 wr3Var = (wr3) obj;
            if (this.X == wr3Var.X && this.Y == wr3Var.Y && this.f0 == wr3Var.f0 && this.g0 == wr3Var.g0 && Objects.equals(this.Z, wr3Var.Z) && Objects.equals(this.h0, wr3Var.h0) && Objects.equals(this.i0, wr3Var.i0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ur3 ur3Var = this.X;
        int iHashCode = ((ur3Var != null ? ur3Var.hashCode() : 0) + 31) * 31;
        tr3 tr3Var = this.Y;
        int iHashCode2 = (iHashCode + (tr3Var != null ? tr3Var.hashCode() : 0)) * 31;
        String str = this.Z;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Class cls = this.f0;
        return Objects.hashCode(this.i0) + ((((Objects.hashCode(this.h0) + ((iHashCode3 + (cls != null ? cls.hashCode() : 0)) * 31)) * 31) + (this.g0 ? 11 : -17)) * 31);
    }

    public final String toString() {
        Class cls = this.f0;
        String name = cls == null ? "NULL" : cls.getName();
        StringBuilder sb = new StringBuilder("JsonTypeInfo.Value(idType=");
        sb.append(this.X);
        sb.append(",includeAs=");
        sb.append(this.Y);
        sb.append(",propertyName=");
        oi0.y(sb, this.Z, ",defaultImpl=", name, ",idVisible=");
        sb.append(this.g0);
        sb.append(",requireTypeIdForSubtypes=");
        sb.append(this.h0);
        sb.append(",writeTypeIdForDefaultImpl=");
        sb.append(this.i0);
        sb.append(")");
        return sb.toString();
    }
}
