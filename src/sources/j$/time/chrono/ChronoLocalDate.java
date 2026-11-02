package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public interface ChronoLocalDate extends j$.time.temporal.l, j$.time.temporal.m, Comparable<ChronoLocalDate> {
    default ChronoLocalDateTime F(LocalTime localTime) {
        return new e(this, localTime);
    }

    default l H() {
        return g().y(h(ChronoField.ERA));
    }

    default ChronoLocalDate K(j$.time.temporal.o oVar) {
        return c.t(g(), oVar.t(this));
    }

    @Override // j$.time.temporal.l
    default ChronoLocalDate a(long j, j$.time.temporal.q qVar) {
        return c.t(g(), super.a(j, qVar));
    }

    @Override // j$.time.temporal.l
    default ChronoLocalDate b(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", temporalField));
        }
        return c.t(g(), temporalField.N(this, j));
    }

    @Override // j$.time.temporal.l
    default ChronoLocalDate c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return c.t(g(), qVar.t(this, j));
        }
        j$.time.g.d("Unsupported unit: ", qVar);
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    default int compareTo(ChronoLocalDate chronoLocalDate) {
        int iCompare = Long.compare(toEpochDay(), chronoLocalDate.toEpochDay());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((a) g()).getId().compareTo(chronoLocalDate.g().getId());
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.a || temporalQuery == j$.time.temporal.p.e || temporalQuery == j$.time.temporal.p.d || temporalQuery == j$.time.temporal.p.g) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.p.b) {
            return g();
        }
        return temporalQuery == j$.time.temporal.p.c ? j$.time.temporal.a.DAYS : temporalQuery.queryFrom(this);
    }

    boolean equals(Object obj);

    @Override // j$.time.temporal.m
    default j$.time.temporal.l f(j$.time.temporal.l lVar) {
        return lVar.b(toEpochDay(), ChronoField.EPOCH_DAY);
    }

    k g();

    int hashCode();

    @Override // j$.time.temporal.TemporalAccessor
    default boolean i(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.t(this);
    }

    @Override // j$.time.temporal.l
    default ChronoLocalDate j(j$.time.temporal.m mVar) {
        return c.t(g(), mVar.f(this));
    }

    default long toEpochDay() {
        return k(ChronoField.EPOCH_DAY);
    }

    String toString();
}
