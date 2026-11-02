package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public interface k extends Comparable {
    static k o(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        k kVar = (k) temporalAccessor.d(j$.time.temporal.p.b);
        r rVar = r.c;
        if (kVar != null) {
            return kVar;
        }
        Objects.requireNonNull(rVar, "defaultObj");
        return rVar;
    }

    ChronoLocalDate D(TemporalAccessor temporalAccessor);

    default ChronoLocalDateTime E(LocalDateTime localDateTime) {
        try {
            return D(localDateTime).F(LocalTime.x(localDateTime));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e);
        }
    }

    ChronoLocalDate G();

    ChronoLocalDate J(int i, int i2, int i3);

    ChronoLocalDate L(Map map, j$.time.format.v vVar);

    h M(Instant instant, ZoneId zoneId);

    boolean equals(Object obj);

    String getId();

    int hashCode();

    ChronoLocalDate n(long j);

    String q();

    ChronoLocalDate r(int i, int i2);

    String toString();

    j$.time.temporal.s v(ChronoField chronoField);

    List w();

    l y(int i);

    int z(l lVar, int i);
}
