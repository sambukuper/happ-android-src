package defpackage;

import j$.time.LocalDateTime;
import j$.time.chrono.ChronoLocalDateTime;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ld4 implements Comparable<ld4>, Serializable {
    public static final jd4 Companion = new jd4();
    public final LocalDateTime X;

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        localDateTime.getClass();
        new ld4(localDateTime);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        localDateTime2.getClass();
        new ld4(localDateTime2);
    }

    public ld4(dd4 dd4Var, xd4 xd4Var) {
        LocalDateTime localDateTimeOf = LocalDateTime.of(dd4Var.X, xd4Var.X);
        localDateTimeOf.getClass();
        this.X = localDateTimeOf;
    }

    @Override // java.lang.Comparable
    public final int compareTo(ld4 ld4Var) {
        ld4 ld4Var2 = ld4Var;
        ld4Var2.getClass();
        return this.X.compareTo((ChronoLocalDateTime<?>) ld4Var2.X);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ld4) {
            return dh3.f(this.X, ((ld4) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        String string = this.X.toString();
        string.getClass();
        return string;
    }

    public ld4(LocalDateTime localDateTime) {
        localDateTime.getClass();
        this.X = localDateTime;
    }
}
