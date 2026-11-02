package j$.time.temporal;

import j$.time.DateTimeException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public interface TemporalAccessor {
    default Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == p.a || temporalQuery == p.b || temporalQuery == p.c) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    default int h(TemporalField temporalField) {
        s sVarL = l(temporalField);
        if (!sVarL.d()) {
            throw new r("Invalid field " + temporalField + " for get() method, use getLong() instead");
        }
        long jK = k(temporalField);
        if (sVarL.e(jK)) {
            return (int) jK;
        }
        throw new DateTimeException("Invalid value for " + temporalField + " (valid values " + sVarL + "): " + jK);
    }

    boolean i(TemporalField temporalField);

    long k(TemporalField temporalField);

    default s l(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            Objects.requireNonNull(temporalField, "field");
            return temporalField.x(this);
        }
        if (i(temporalField)) {
            return ((ChronoField) temporalField).b;
        }
        throw new r(j$.time.c.a("Unsupported field: ", temporalField));
    }
}
