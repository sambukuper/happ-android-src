package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.format.u;
import j$.time.format.v;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public enum j implements TemporalField {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient s b;
    public final transient int c;

    static {
        a aVar = a.NANOS;
    }

    j(String str, long j) {
        this.a = str;
        this.b = s.f((-365243219162L) + j, 365241780471L + j);
        this.c = (int) j;
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalAccessor C(Map map, u uVar, v vVar) {
        long j = this.c;
        long jLongValue = ((Long) ((HashMap) map).remove(this)).longValue();
        j$.time.chrono.k kVarO = j$.time.chrono.k.o(uVar);
        if (vVar == v.LENIENT) {
            return kVarO.n(Math.subtractExact(jLongValue, j));
        }
        this.b.b(jLongValue, this);
        return kVarO.n(jLongValue - j);
    }

    @Override // j$.time.temporal.TemporalField
    public final long I(TemporalAccessor temporalAccessor) {
        return temporalAccessor.k(ChronoField.EPOCH_DAY) + ((long) this.c);
    }

    @Override // j$.time.temporal.TemporalField
    public final l N(l lVar, long j) {
        if (this.b.e(j)) {
            return lVar.b(Math.subtractExact(j, this.c), ChronoField.EPOCH_DAY);
        }
        throw new DateTimeException("Invalid value: " + this.a + " " + j);
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }

    @Override // j$.time.temporal.TemporalField
    public final s range() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean t(TemporalAccessor temporalAccessor) {
        return temporalAccessor.i(ChronoField.EPOCH_DAY);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalField
    public final s x(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.i(ChronoField.EPOCH_DAY)) {
            return this.b;
        }
        j$.time.g.g("Unsupported field: ", this);
        return null;
    }
}
