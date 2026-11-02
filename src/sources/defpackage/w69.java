package defpackage;

import j$.time.DateTimeException;
import j$.time.YearMonth;
import j$.time.format.DateTimeFormatter;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w69 implements Comparable<w69>, Serializable {
    public static final v69 Companion = new v69();
    public final YearMonth X;

    public w69(int i, int i2) {
        try {
            YearMonth yearMonthOf = YearMonth.of(i, i2);
            yearMonthOf.getClass();
            this.X = yearMonthOf;
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(w69 w69Var) {
        w69 w69Var2 = w69Var;
        w69Var2.getClass();
        return this.X.compareTo(w69Var2.X);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w69) {
            return dh3.f(this.X, ((w69) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        String str = ((DateTimeFormatter) e79.a.getValue()).format(this.X);
        str.getClass();
        return str;
    }

    public w69(YearMonth yearMonth) {
        yearMonth.getClass();
        this.X = yearMonth;
    }
}
