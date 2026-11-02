package defpackage;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dd4 implements Comparable<dd4>, Serializable {
    public static final bd4 Companion = new bd4();
    public final LocalDate X;

    static {
        LocalDate localDate = LocalDate.MIN;
        localDate.getClass();
        new dd4(localDate);
        LocalDate localDate2 = LocalDate.MAX;
        localDate2.getClass();
        new dd4(localDate2);
    }

    public dd4(int i, int i2, int i3) {
        try {
            LocalDate localDateOf = LocalDate.of(i, i2, i3);
            localDateOf.getClass();
            this.X = localDateOf;
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final uc1 a() {
        DayOfWeek dayOfWeek = this.X.getDayOfWeek();
        dayOfWeek.getClass();
        return (uc1) uc1.Y.get(dayOfWeek.getValue() - 1);
    }

    @Override // java.lang.Comparable
    public final int compareTo(dd4 dd4Var) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.getClass();
        return this.X.compareTo((ChronoLocalDate) dd4Var2.X);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dd4) {
            return dh3.f(this.X, ((dd4) obj).X);
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

    public dd4(LocalDate localDate) {
        localDate.getClass();
        this.X = localDate;
    }
}
