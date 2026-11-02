package defpackage;

import j$.time.DateTimeException;
import j$.time.LocalTime;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xd4 implements Comparable<xd4>, Serializable {
    public static final wd4 Companion = new wd4();
    public final LocalTime X;

    static {
        LocalTime localTime = LocalTime.MIN;
        localTime.getClass();
        new xd4(localTime);
        LocalTime localTime2 = LocalTime.MAX;
        localTime2.getClass();
        new xd4(localTime2);
    }

    public xd4(int i, int i2, int i3, int i4) {
        try {
            LocalTime localTimeOf = LocalTime.of(i, i2, i3, i4);
            localTimeOf.getClass();
            this.X = localTimeOf;
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(xd4 xd4Var) {
        xd4 xd4Var2 = xd4Var;
        xd4Var2.getClass();
        return this.X.compareTo(xd4Var2.X);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xd4) {
            return dh3.f(this.X, ((xd4) obj).X);
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

    public xd4(LocalTime localTime) {
        localTime.getClass();
        this.X = localTime;
    }
}
