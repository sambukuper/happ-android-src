package j$.time.temporal;

import j$.time.format.u;
import j$.time.format.v;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public interface TemporalField {
    default TemporalAccessor C(Map map, u uVar, v vVar) {
        return null;
    }

    long I(TemporalAccessor temporalAccessor);

    l N(l lVar, long j);

    boolean isDateBased();

    s range();

    boolean t(TemporalAccessor temporalAccessor);

    s x(TemporalAccessor temporalAccessor);
}
