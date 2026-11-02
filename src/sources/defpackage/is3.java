package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class is3 {
    public final je6 a;
    public final je6 b;
    public final Map c = e02.X;
    public final boolean d;

    public is3(je6 je6Var, je6 je6Var2) {
        this.a = je6Var;
        this.b = je6Var2;
        new vz7(new zk3(this, (byte) 3));
        je6 je6Var3 = je6.IGNORE;
        this.d = je6Var == je6Var3 && je6Var2 == je6Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is3)) {
            return false;
        }
        is3 is3Var = (is3) obj;
        return this.a == is3Var.a && this.b == is3Var.b && this.c.equals(is3Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        je6 je6Var = this.b;
        return this.c.hashCode() + ((iHashCode + (je6Var == null ? 0 : je6Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.b + ", userDefinedLevelForSpecificAnnotation=" + this.c + ')';
    }
}
