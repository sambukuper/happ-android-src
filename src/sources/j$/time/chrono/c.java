package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements ChronoLocalDate, j$.time.temporal.l, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static ChronoLocalDate t(k kVar, j$.time.temporal.l lVar) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) lVar;
        if (kVar.equals(chronoLocalDate.g())) {
            return chronoLocalDate;
        }
        j$.time.g.e("Chronology mismatch, expected: ", kVar.getId(), chronoLocalDate.g().getId());
        return null;
    }

    public abstract ChronoLocalDate C(long j);

    public abstract ChronoLocalDate I(long j);

    @Override // j$.time.chrono.ChronoLocalDate
    public ChronoLocalDate K(j$.time.temporal.o oVar) {
        return super.K(oVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public ChronoLocalDate c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return super.c(j, qVar);
        }
        switch (b.a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return x(j);
            case 2:
                return x(Math.multiplyExact(j, 7L));
            case 3:
                return C(j);
            case 4:
                return I(j);
            case 5:
                return I(Math.multiplyExact(j, 10L));
            case 6:
                return I(Math.multiplyExact(j, 100L));
            case 7:
                return I(Math.multiplyExact(j, 1000L));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return b(Math.addExact(k(chronoField), j), (TemporalField) chronoField);
            default:
                j$.time.g.d("Unsupported unit: ", qVar);
                return null;
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && compareTo((ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return g().hashCode() ^ ((int) (epochDay ^ (epochDay >>> 32)));
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public ChronoLocalDate j(j$.time.temporal.m mVar) {
        return super.j(mVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final String toString() {
        long jK = k(ChronoField.YEAR_OF_ERA);
        long jK2 = k(ChronoField.MONTH_OF_YEAR);
        long jK3 = k(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(g().toString());
        sb.append(" ");
        sb.append(H());
        sb.append(" ");
        sb.append(jK);
        sb.append(jK2 < 10 ? "-0" : "-");
        sb.append(jK2);
        sb.append(jK3 < 10 ? "-0" : "-");
        sb.append(jK3);
        return sb.toString();
    }

    public abstract ChronoLocalDate x(long j);

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public ChronoLocalDate a(long j, j$.time.temporal.q qVar) {
        return super.a(j, qVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public ChronoLocalDate b(long j, TemporalField temporalField) {
        return super.b(j, temporalField);
    }
}
