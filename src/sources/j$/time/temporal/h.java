package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public enum h implements q {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    public final String a;

    static {
        Duration.x(31556952L, 0);
        Duration.x(7889238L, 0);
    }

    h(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.q
    public final l t(l lVar, long j) {
        int i = b.a[ordinal()];
        if (i == 1) {
            g gVar = i.c;
            return lVar.b(Math.addExact(lVar.h(gVar), j), gVar);
        }
        if (i == 2) {
            return lVar.c(j / 4, a.YEARS).c((j % 4) * 3, a.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
