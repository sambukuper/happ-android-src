package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements k {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        new Locale("ja", "JP", "JP");
    }

    public static k C(k kVar, String str) {
        String strQ;
        k kVar2 = (k) a.putIfAbsent(str, kVar);
        if (kVar2 == null && (strQ = kVar.q()) != null) {
            b.putIfAbsent(strQ, kVar);
        }
        return kVar2;
    }

    public static ChronoLocalDate I(ChronoLocalDate chronoLocalDate, long j, long j2, long j3) {
        long j4;
        ChronoLocalDate chronoLocalDateC = chronoLocalDate.c(j, (j$.time.temporal.q) j$.time.temporal.a.MONTHS);
        j$.time.temporal.a aVar = j$.time.temporal.a.WEEKS;
        ChronoLocalDate chronoLocalDateC2 = chronoLocalDateC.c(j2, (j$.time.temporal.q) aVar);
        if (j3 <= 7) {
            if (j3 < 1) {
                chronoLocalDateC2 = chronoLocalDateC2.c(Math.subtractExact(j3, 7L) / 7, (j$.time.temporal.q) aVar);
                j4 = (j3 + 6) % 7;
            }
            return chronoLocalDateC2.j(new j$.time.temporal.n(DayOfWeek.t((int) j3).getValue(), (byte) 0));
        }
        long j5 = j3 - 1;
        chronoLocalDateC2 = chronoLocalDateC2.c(j5 / 7, (j$.time.temporal.q) aVar);
        j4 = j5 % 7;
        j3 = j4 + 1;
        return chronoLocalDateC2.j(new j$.time.temporal.n(DayOfWeek.t((int) j3).getValue(), (byte) 0));
    }

    public static void t(Map map, ChronoField chronoField, long j) {
        Long l = (Long) map.get(chronoField);
        if (l == null || l.longValue() == j) {
            map.put(chronoField, Long.valueOf(j));
            return;
        }
        throw new DateTimeException("Conflict found: " + chronoField + " " + l + " differs from " + chronoField + " " + j);
    }

    public static k x(String str) {
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = a;
            k kVar = (k) concurrentHashMap.get(str);
            if (kVar == null) {
                kVar = (k) b.get(str);
            }
            if (kVar != null) {
                return kVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                for (k kVar2 : ServiceLoader.load(k.class)) {
                    if (str.equals(kVar2.getId()) || str.equals(kVar2.q())) {
                        return kVar2;
                    }
                }
                j$.time.g.a("Unknown chronology: ".concat(str));
                return null;
            }
            n nVar = n.l;
            nVar.getClass();
            C(nVar, "Hijrah-umalqura");
            u uVar = u.c;
            uVar.getClass();
            C(uVar, "Japanese");
            z zVar = z.c;
            zVar.getClass();
            C(zVar, "Minguo");
            f0 f0Var = f0.c;
            f0Var.getClass();
            C(f0Var, "ThaiBuddhist");
            try {
                for (a aVar : Arrays.asList(new a[0])) {
                    if (!aVar.getId().equals("ISO")) {
                        C(aVar, aVar.getId());
                    }
                }
                r rVar = r.c;
                rVar.getClass();
                C(rVar, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    @Override // j$.time.chrono.k
    public ChronoLocalDate L(Map map, j$.time.format.v vVar) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return n(((Long) map.remove(chronoField)).longValue());
        }
        N(map, vVar);
        ChronoLocalDate chronoLocalDateQ = Q(map, vVar);
        if (chronoLocalDateQ != null) {
            return chronoLocalDateQ;
        }
        ChronoField chronoField2 = ChronoField.YEAR;
        if (map.containsKey(chronoField2)) {
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            byte b2 = 0;
            if (map.containsKey(chronoField3)) {
                if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                    return P(map, vVar);
                }
                ChronoField chronoField4 = ChronoField.ALIGNED_WEEK_OF_MONTH;
                if (map.containsKey(chronoField4)) {
                    ChronoField chronoField5 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                    if (map.containsKey(chronoField5)) {
                        int iA = v(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                        if (vVar == j$.time.format.v.LENIENT) {
                            long jSubtractExact = Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L);
                            return J(iA, 1, 1).c(jSubtractExact, (j$.time.temporal.q) j$.time.temporal.a.MONTHS).c(Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.WEEKS).c(Math.subtractExact(((Long) map.remove(chronoField5)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
                        }
                        int iA2 = v(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                        ChronoLocalDate chronoLocalDateC = J(iA, iA2, 1).c((v(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5) - 1) + ((v(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4) - 1) * 7), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
                        if (vVar != j$.time.format.v.STRICT || chronoLocalDateC.h(chronoField3) == iA2) {
                            return chronoLocalDateC;
                        }
                        j$.time.g.a("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                    ChronoField chronoField6 = ChronoField.DAY_OF_WEEK;
                    if (map.containsKey(chronoField6)) {
                        int iA3 = v(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                        if (vVar == j$.time.format.v.LENIENT) {
                            return I(J(iA3, 1, 1), Math.subtractExact(((Long) map.remove(chronoField3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField6)).longValue(), 1L));
                        }
                        int iA4 = v(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                        ChronoLocalDate chronoLocalDateJ = J(iA3, iA4, 1).c((v(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4) - 1) * 7, (j$.time.temporal.q) j$.time.temporal.a.DAYS).j(new j$.time.temporal.n(DayOfWeek.t(v(chronoField6).a(((Long) map.remove(chronoField6)).longValue(), chronoField6)).getValue(), b2));
                        if (vVar != j$.time.format.v.STRICT || chronoLocalDateJ.h(chronoField3) == iA4) {
                            return chronoLocalDateJ;
                        }
                        j$.time.g.a("Strict mode rejected resolved date as it is in a different month");
                        return null;
                    }
                }
            }
            ChronoField chronoField7 = ChronoField.DAY_OF_YEAR;
            if (map.containsKey(chronoField7)) {
                int iA5 = v(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                if (vVar != j$.time.format.v.LENIENT) {
                    return r(iA5, v(chronoField7).a(((Long) map.remove(chronoField7)).longValue(), chronoField7));
                }
                return r(iA5, 1).c(Math.subtractExact(((Long) map.remove(chronoField7)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
            }
            ChronoField chronoField8 = ChronoField.ALIGNED_WEEK_OF_YEAR;
            if (map.containsKey(chronoField8)) {
                ChronoField chronoField9 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
                if (map.containsKey(chronoField9)) {
                    int iA6 = v(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (vVar == j$.time.format.v.LENIENT) {
                        return r(iA6, 1).c(Math.subtractExact(((Long) map.remove(chronoField8)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.WEEKS).c(Math.subtractExact(((Long) map.remove(chronoField9)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
                    }
                    ChronoLocalDate chronoLocalDateC2 = r(iA6, 1).c((v(chronoField9).a(((Long) map.remove(chronoField9)).longValue(), chronoField9) - 1) + ((v(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8) - 1) * 7), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
                    if (vVar != j$.time.format.v.STRICT || chronoLocalDateC2.h(chronoField2) == iA6) {
                        return chronoLocalDateC2;
                    }
                    j$.time.g.a("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
                ChronoField chronoField10 = ChronoField.DAY_OF_WEEK;
                if (map.containsKey(chronoField10)) {
                    int iA7 = v(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (vVar == j$.time.format.v.LENIENT) {
                        return I(r(iA7, 1), 0L, Math.subtractExact(((Long) map.remove(chronoField8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(chronoField10)).longValue(), 1L));
                    }
                    ChronoLocalDate chronoLocalDateJ2 = r(iA7, 1).c((v(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8) - 1) * 7, (j$.time.temporal.q) j$.time.temporal.a.DAYS).j(new j$.time.temporal.n(DayOfWeek.t(v(chronoField10).a(((Long) map.remove(chronoField10)).longValue(), chronoField10)).getValue(), b2));
                    if (vVar != j$.time.format.v.STRICT || chronoLocalDateJ2.h(chronoField2) == iA7) {
                        return chronoLocalDateJ2;
                    }
                    j$.time.g.a("Strict mode rejected resolved date as it is in a different year");
                    return null;
                }
            }
        }
        return null;
    }

    public void N(Map map, j$.time.format.v vVar) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (vVar != j$.time.format.v.LENIENT) {
                chronoField.P(l.longValue());
            }
            ChronoLocalDate chronoLocalDateB = G().b(1L, (TemporalField) ChronoField.DAY_OF_MONTH).b(l.longValue(), (TemporalField) chronoField);
            ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
            t(map, chronoField2, chronoLocalDateB.h(chronoField2));
            ChronoField chronoField3 = ChronoField.YEAR;
            t(map, chronoField3, chronoLocalDateB.h(chronoField3));
        }
    }

    public ChronoLocalDate P(Map map, j$.time.format.v vVar) {
        ChronoField chronoField = ChronoField.YEAR;
        int iA = v(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (vVar == j$.time.format.v.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return J(iA, 1, 1).c(jSubtractExact, (j$.time.temporal.q) j$.time.temporal.a.MONTHS).c(Math.subtractExact(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.q) j$.time.temporal.a.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iA2 = v(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iA3 = v(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (vVar != j$.time.format.v.SMART) {
            return J(iA, iA2, iA3);
        }
        try {
            return J(iA, iA2, iA3);
        } catch (DateTimeException unused) {
            return J(iA, iA2, 1).j(new j$.time.e((byte) 5));
        }
    }

    public ChronoLocalDate Q(Map map, j$.time.format.v vVar) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l == null) {
            ChronoField chronoField2 = ChronoField.ERA;
            if (!map.containsKey(chronoField2)) {
                return null;
            }
            v(chronoField2).b(((Long) map.get(chronoField2)).longValue(), chronoField2);
            return null;
        }
        ChronoField chronoField3 = ChronoField.ERA;
        Long l2 = (Long) map.remove(chronoField3);
        int iA = vVar != j$.time.format.v.LENIENT ? v(chronoField).a(l.longValue(), chronoField) : Math.toIntExact(l.longValue());
        if (l2 != null) {
            t(map, ChronoField.YEAR, z(y(v(chronoField3).a(l2.longValue(), chronoField3)), iA));
            return null;
        }
        ChronoField chronoField4 = ChronoField.YEAR;
        if (map.containsKey(chronoField4)) {
            t(map, chronoField4, z(r(v(chronoField4).a(((Long) map.get(chronoField4)).longValue(), chronoField4), 1).H(), iA));
            return null;
        }
        if (vVar == j$.time.format.v.STRICT) {
            map.put(chronoField, l);
            return null;
        }
        List listW = w();
        if (listW.isEmpty()) {
            t(map, chronoField4, iA);
            return null;
        }
        t(map, chronoField4, z((l) listW.get(listW.size() - 1), iA));
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getId().compareTo(((k) obj).getId());
    }

    @Override // j$.time.chrono.k
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && getId().compareTo(((a) obj).getId()) == 0;
    }

    @Override // j$.time.chrono.k
    public final int hashCode() {
        return getId().hashCode() ^ getClass().hashCode();
    }

    @Override // j$.time.chrono.k
    public final String toString() {
        return getId();
    }
}
