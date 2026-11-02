package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends a implements Serializable {
    public static final f0 c = new f0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private f0() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate D(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof h0 ? (h0) temporalAccessor : new h0(LocalDate.C(temporalAccessor));
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDateTime E(LocalDateTime localDateTime) {
        return super.E(localDateTime);
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate G() {
        return new h0(LocalDate.C(LocalDate.R(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate J(int i, int i2, int i3) {
        return new h0(LocalDate.of(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.k
    public final ChronoLocalDate L(Map map, j$.time.format.v vVar) {
        return (h0) super.L(map, vVar);
    }

    @Override // j$.time.chrono.k
    public final h M(Instant instant, ZoneId zoneId) {
        return j.C(this, instant, zoneId);
    }

    @Override // j$.time.chrono.k
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate n(long j) {
        return new h0(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.k
    public final String q() {
        return "buddhist";
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate r(int i, int i2) {
        return new h0(LocalDate.S(i - 543, i2));
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.s v(ChronoField chronoField) {
        int i = e0.a[chronoField.ordinal()];
        if (i == 1) {
            j$.time.temporal.s sVar = ChronoField.PROLEPTIC_MONTH.b;
            return j$.time.temporal.s.f(sVar.a + 6516, sVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.s sVar2 = ChronoField.YEAR.b;
            return j$.time.temporal.s.g((-(sVar2.a + 543)) + 1, sVar2.d + 543);
        }
        if (i != 3) {
            return chronoField.b;
        }
        j$.time.temporal.s sVar3 = ChronoField.YEAR.b;
        return j$.time.temporal.s.f(sVar3.a + 543, sVar3.d + 543);
    }

    @Override // j$.time.chrono.k
    public final List w() {
        return j$.time.b.a(i0.values());
    }

    public Object writeReplace() {
        return new d0((byte) 1, this);
    }

    @Override // j$.time.chrono.k
    public final l y(int i) {
        if (i == 0) {
            return i0.BEFORE_BE;
        }
        if (i == 1) {
            return i0.BE;
        }
        j$.time.g.b("Invalid era: ", i);
        return null;
    }

    @Override // j$.time.chrono.k
    public final int z(l lVar, int i) {
        if (lVar instanceof i0) {
            return lVar == i0.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }
}
