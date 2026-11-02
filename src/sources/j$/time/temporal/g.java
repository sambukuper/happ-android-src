package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.format.u;
import j$.time.format.v;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g implements TemporalField {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ g[] b;

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.TemporalField
            public final TemporalAccessor C(Map map, u uVar, v vVar) {
                LocalDate localDateOf;
                long jSubtractExact;
                ChronoField chronoField = ChronoField.YEAR;
                HashMap map2 = (HashMap) map;
                Long l = (Long) map2.get(chronoField);
                TemporalField temporalField = g.QUARTER_OF_YEAR;
                Long l2 = (Long) map2.get(temporalField);
                if (l != null && l2 != null) {
                    int iA = chronoField.b.a(l.longValue(), chronoField);
                    long jLongValue = ((Long) map2.get(g.DAY_OF_QUARTER)).longValue();
                    g gVar2 = i.a;
                    if (j$.time.chrono.k.o(uVar).equals(j$.time.chrono.r.c)) {
                        if (vVar == v.LENIENT) {
                            localDateOf = LocalDate.of(iA, 1, 1).V(Math.multiplyExact(Math.subtractExact(l2.longValue(), 1L), 3L));
                            jSubtractExact = Math.subtractExact(jLongValue, 1L);
                        } else {
                            localDateOf = LocalDate.of(iA, ((temporalField.range().a(l2.longValue(), temporalField) - 1) * 3) + 1, 1);
                            if (jLongValue < 1 || jLongValue > 90) {
                                if (vVar == v.STRICT) {
                                    x(localDateOf).b(jLongValue, this);
                                } else {
                                    range().b(jLongValue, this);
                                }
                            }
                            jSubtractExact = jLongValue - 1;
                        }
                        map2.remove(this);
                        map2.remove(chronoField);
                        map2.remove(temporalField);
                        return localDateOf.U(jSubtractExact);
                    }
                    j$.time.g.a("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.TemporalField
            public final long I(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                int iH = temporalAccessor.h(ChronoField.DAY_OF_YEAR);
                int iH2 = temporalAccessor.h(ChronoField.MONTH_OF_YEAR);
                long jK = temporalAccessor.k(ChronoField.YEAR);
                int i = (iH2 - 1) / 3;
                j$.time.chrono.r.c.getClass();
                return iH - g.a[i + (j$.time.chrono.r.R(jK) ? 4 : 0)];
            }

            @Override // j$.time.temporal.TemporalField
            public final l N(l lVar, long j) {
                long jI = I(lVar);
                range().b(j, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return lVar.b((j - jI) + lVar.k(chronoField), chronoField);
            }

            @Override // j$.time.temporal.TemporalField
            public final s range() {
                return s.g(90L, 92L);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean t(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.i(ChronoField.DAY_OF_YEAR) || !temporalAccessor.i(ChronoField.MONTH_OF_YEAR) || !temporalAccessor.i(ChronoField.YEAR)) {
                    return false;
                }
                g gVar2 = i.a;
                return j$.time.chrono.k.o(temporalAccessor).equals(j$.time.chrono.r.c);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.TemporalField
            public final s x(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                long jK = temporalAccessor.k(g.QUARTER_OF_YEAR);
                if (jK == 1) {
                    long jK2 = temporalAccessor.k(ChronoField.YEAR);
                    j$.time.chrono.r.c.getClass();
                    return j$.time.chrono.r.R(jK2) ? s.f(1L, 91L) : s.f(1L, 90L);
                }
                if (jK == 2) {
                    return s.f(1L, 91L);
                }
                return (jK == 3 || jK == 4) ? s.f(1L, 92L) : range();
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.TemporalField
            public final long I(TemporalAccessor temporalAccessor) {
                if (t(temporalAccessor)) {
                    return (temporalAccessor.k(ChronoField.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new r("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final l N(l lVar, long j) {
                long jI = I(lVar);
                range().b(j, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return lVar.b(((j - jI) * 3) + lVar.k(chronoField), chronoField);
            }

            @Override // j$.time.temporal.TemporalField
            public final s range() {
                return s.f(1L, 4L);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean t(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.i(ChronoField.MONTH_OF_YEAR)) {
                    return false;
                }
                g gVar3 = i.a;
                return j$.time.chrono.k.o(temporalAccessor).equals(j$.time.chrono.r.c);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final s x(TemporalAccessor temporalAccessor) {
                if (t(temporalAccessor)) {
                    return range();
                }
                throw new r("Unsupported field: QuarterOfYear");
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.TemporalField
            public final TemporalAccessor C(Map map, u uVar, v vVar) {
                LocalDate localDateB;
                long j;
                TemporalField temporalField = g.WEEK_BASED_YEAR;
                HashMap map2 = (HashMap) map;
                Long l = (Long) map2.get(temporalField);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l2 = (Long) map2.get(chronoField);
                if (l != null && l2 != null) {
                    int iA = temporalField.range().a(l.longValue(), temporalField);
                    long jLongValue = ((Long) map2.get(g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                    g gVar4 = i.a;
                    if (j$.time.chrono.k.o(uVar).equals(j$.time.chrono.r.c)) {
                        LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                        if (vVar == v.LENIENT) {
                            long jLongValue2 = l2.longValue();
                            if (jLongValue2 > 7) {
                                long j2 = jLongValue2 - 1;
                                localDateOf = localDateOf.W(j2 / 7);
                                j = j2 % 7;
                            } else {
                                if (jLongValue2 < 1) {
                                    localDateOf = localDateOf.W(Math.subtractExact(jLongValue2, 7L) / 7);
                                    j = (jLongValue2 + 6) % 7;
                                }
                                localDateB = localDateOf.W(Math.subtractExact(jLongValue, 1L)).b(jLongValue2, chronoField);
                            }
                            jLongValue2 = j + 1;
                            localDateB = localDateOf.W(Math.subtractExact(jLongValue, 1L)).b(jLongValue2, chronoField);
                        } else {
                            int iA2 = chronoField.b.a(l2.longValue(), chronoField);
                            if (jLongValue < 1 || jLongValue > 52) {
                                if (vVar == v.STRICT) {
                                    s.f(1L, g.R(g.Q(localDateOf))).b(jLongValue, this);
                                } else {
                                    range().b(jLongValue, this);
                                }
                            }
                            localDateB = localDateOf.W(jLongValue - 1).b(iA2, chronoField);
                        }
                        map2.remove(this);
                        map2.remove(temporalField);
                        map2.remove(chronoField);
                        return localDateB;
                    }
                    j$.time.g.a("Resolve requires IsoChronology");
                }
                return null;
            }

            @Override // j$.time.temporal.TemporalField
            public final long I(TemporalAccessor temporalAccessor) {
                if (t(temporalAccessor)) {
                    return g.P(LocalDate.C(temporalAccessor));
                }
                throw new r("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final l N(l lVar, long j) {
                range().b(j, this);
                return lVar.c(Math.subtractExact(j, I(lVar)), a.WEEKS);
            }

            @Override // j$.time.temporal.TemporalField
            public final s range() {
                return s.g(52L, 53L);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean t(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.i(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                g gVar4 = i.a;
                return j$.time.chrono.k.o(temporalAccessor).equals(j$.time.chrono.r.c);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final s x(TemporalAccessor temporalAccessor) {
                if (t(temporalAccessor)) {
                    return s.f(1L, g.R(g.Q(LocalDate.C(temporalAccessor))));
                }
                throw new r("Unsupported field: WeekOfWeekBasedYear");
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.TemporalField
            public final long I(TemporalAccessor temporalAccessor) {
                if (t(temporalAccessor)) {
                    return g.Q(LocalDate.C(temporalAccessor));
                }
                throw new r("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final l N(l lVar, long j) {
                if (!t(lVar)) {
                    throw new r("Unsupported field: WeekBasedYear");
                }
                int iA = ChronoField.YEAR.b.a(j, g.WEEK_BASED_YEAR);
                LocalDate localDateC = LocalDate.C(lVar);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                int iH = localDateC.h(chronoField);
                int iP = g.P(localDateC);
                if (iP == 53 && g.R(iA) == 52) {
                    iP = 52;
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                return lVar.j(localDateOf.U(((iP - 1) * 7) + (iH - localDateOf.h(chronoField))));
            }

            @Override // j$.time.temporal.TemporalField
            public final s range() {
                return ChronoField.YEAR.b;
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean t(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.i(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                g gVar5 = i.a;
                return j$.time.chrono.k.o(temporalAccessor).equals(j$.time.chrono.r.c);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.TemporalField
            public final s x(TemporalAccessor temporalAccessor) {
                if (t(temporalAccessor)) {
                    return ChronoField.YEAR.b;
                }
                throw new r("Unsupported field: WeekBasedYear");
            }
        };
        WEEK_BASED_YEAR = gVar4;
        b = new g[]{gVar, gVar2, gVar3, gVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int P(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int dayOfYear = localDate.getDayOfYear() - 1;
        int i = (3 - iOrdinal) + dayOfYear;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (dayOfYear < i3) {
            if (localDate.getDayOfYear() != 180) {
                localDate = LocalDate.S(localDate.a, 180);
            }
            return (int) s.f(1L, R(Q(localDate.X(-1L)))).d;
        }
        int i4 = ((dayOfYear - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.P())) {
            return i4;
        }
        return 1;
    }

    public static int Q(LocalDate localDate) {
        int year = localDate.getYear();
        int dayOfYear = localDate.getDayOfYear();
        if (dayOfYear <= 3) {
            return dayOfYear - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (dayOfYear >= 363) {
            return ((dayOfYear - 363) - (localDate.P() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }

    public static int R(int i) {
        LocalDate localDateOf = LocalDate.of(i, 1, 1);
        if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.P()) ? 53 : 52;
        }
        return 53;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean isDateBased() {
        return true;
    }
}
