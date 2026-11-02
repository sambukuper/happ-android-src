package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public interface h extends j$.time.temporal.l, Comparable {
    h A(ZoneId zoneId);

    default long O() {
        return ((m().toEpochDay() * 86400) + ((long) toLocalTime().V())) - ((long) getOffset().getTotalSeconds());
    }

    @Override // j$.time.temporal.l
    default h a(long j, j$.time.temporal.q qVar) {
        return j.t(g(), super.a(j, qVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.e || temporalQuery == j$.time.temporal.p.a) {
            return getZone();
        }
        if (temporalQuery == j$.time.temporal.p.d) {
            return getOffset();
        }
        if (temporalQuery == j$.time.temporal.p.g) {
            return toLocalTime();
        }
        if (temporalQuery == j$.time.temporal.p.b) {
            return g();
        }
        return temporalQuery == j$.time.temporal.p.c ? j$.time.temporal.a.NANOS : temporalQuery.queryFrom(this);
    }

    default k g() {
        return m().g();
    }

    ZoneOffset getOffset();

    ZoneId getZone();

    @Override // j$.time.temporal.TemporalAccessor
    default int h(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return super.h(temporalField);
        }
        int i = g.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? u().h(temporalField) : getOffset().getTotalSeconds();
        }
        throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.l
    default h j(j$.time.temporal.m mVar) {
        return j.t(g(), mVar.f(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.I(this);
        }
        int i = g.a[((ChronoField) temporalField).ordinal()];
        if (i != 1) {
            return i != 2 ? u().k(temporalField) : getOffset().getTotalSeconds();
        }
        return O();
    }

    @Override // j$.time.temporal.TemporalAccessor
    default j$.time.temporal.s l(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) ? ((ChronoField) temporalField).b : u().l(temporalField);
        }
        return temporalField.x(this);
    }

    default ChronoLocalDate m() {
        return u().m();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    default int compareTo(h hVar) {
        int iCompare = Long.compare(O(), hVar.O());
        return (iCompare == 0 && (iCompare = toLocalTime().getNano() - hVar.toLocalTime().getNano()) == 0 && (iCompare = u().compareTo(hVar.u())) == 0 && (iCompare = getZone().getId().compareTo(hVar.getZone().getId())) == 0) ? ((a) g()).getId().compareTo(hVar.g().getId()) : iCompare;
    }

    default LocalTime toLocalTime() {
        return u().toLocalTime();
    }

    ChronoLocalDateTime u();
}
