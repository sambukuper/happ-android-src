package com.google.gson.internal.bind;

import defpackage.fr3;
import defpackage.hs3;
import defpackage.p61;
import defpackage.rq3;
import defpackage.vg8;
import defpackage.wg8;
import defpackage.yi8;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.MonthDay;
import j$.time.OffsetDateTime;
import j$.time.OffsetTime;
import j$.time.Period;
import j$.time.Year;
import j$.time.YearMonth;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class JavaTimeTypeAdapters implements wg8 {
    public static final com.google.gson.b a = new AnonymousClass1("seconds", "nanos");
    public static final com.google.gson.b b = new AnonymousClass2("seconds", "nanos");
    public static final com.google.gson.b c = new AnonymousClass3("year", "month", "day");
    public static final com.google.gson.b d = new AnonymousClass4("hour", "minute", "second", "nano");
    public static final com.google.gson.b e = new AnonymousClass6("month", "day");
    public static final com.google.gson.b f = new AnonymousClass9("years", "months", "days");
    public static final com.google.gson.b g = new AnonymousClass10("year");
    public static final com.google.gson.b h = new AnonymousClass11("year", "month");
    public static final com.google.gson.b i = new com.google.gson.b() { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.12
        @Override // com.google.gson.b
        public final Object b(rq3 rq3Var) throws IOException {
            rq3Var.F0();
            String strR = null;
            Integer numValueOf = null;
            while (rq3Var.c0() != 4) {
                String strE0 = rq3Var.e0();
                strE0.getClass();
                if (strE0.equals("totalSeconds")) {
                    numValueOf = Integer.valueOf(rq3Var.nextInt());
                } else if (strE0.equals("id")) {
                    strR = rq3Var.r();
                } else {
                    rq3Var.v();
                }
            }
            rq3Var.j0();
            if (strR != null) {
                return ZoneId.of(strR);
            }
            if (numValueOf != null) {
                return ZoneOffset.ofTotalSeconds(numValueOf.intValue());
            }
            throw new fr3("Missing id or totalSeconds field; at path ".concat(rq3Var.C()));
        }

        @Override // com.google.gson.b
        public final void c(hs3 hs3Var, Object obj) throws IOException {
            ZoneId zoneId = (ZoneId) obj;
            if (zoneId instanceof ZoneOffset) {
                hs3Var.F0();
                hs3Var.m("totalSeconds");
                hs3Var.X(((ZoneOffset) zoneId).getTotalSeconds());
                hs3Var.j0();
                return;
            }
            hs3Var.F0();
            hs3Var.m("id");
            hs3Var.c0(zoneId.getId());
            hs3Var.j0();
        }
    }.a();
    public static final vg8 j = new vg8() { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.14
        @Override // defpackage.vg8
        public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var) {
            Class cls = yi8Var.a;
            if (!cls.getName().startsWith("java.time.")) {
                return null;
            }
            if (cls == Duration.class) {
                return JavaTimeTypeAdapters.a;
            }
            if (cls == Instant.class) {
                return JavaTimeTypeAdapters.b;
            }
            if (cls == LocalDate.class) {
                return JavaTimeTypeAdapters.c;
            }
            if (cls == LocalTime.class) {
                return JavaTimeTypeAdapters.d;
            }
            if (cls == LocalDateTime.class) {
                return JavaTimeTypeAdapters.a(aVar);
            }
            if (cls == MonthDay.class) {
                return JavaTimeTypeAdapters.e;
            }
            if (cls == OffsetDateTime.class) {
                final com.google.gson.b bVarA = JavaTimeTypeAdapters.a(aVar);
                final com.google.gson.b bVarE = aVar.e(new yi8(ZoneOffset.class));
                return new com.google.gson.b() { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.7
                    @Override // com.google.gson.b
                    public final Object b(rq3 rq3Var) throws IOException {
                        rq3Var.F0();
                        LocalDateTime localDateTime = null;
                        ZoneOffset zoneOffset = null;
                        while (rq3Var.c0() != 4) {
                            String strE0 = rq3Var.e0();
                            strE0.getClass();
                            if (strE0.equals("offset")) {
                                zoneOffset = (ZoneOffset) bVarE.b(rq3Var);
                            } else if (strE0.equals("dateTime")) {
                                localDateTime = (LocalDateTime) bVarA.b(rq3Var);
                            } else {
                                rq3Var.v();
                            }
                        }
                        rq3Var.j0();
                        JavaTimeTypeAdapters.b(localDateTime, "dateTime", rq3Var);
                        JavaTimeTypeAdapters.b(zoneOffset, "offset", rq3Var);
                        return OffsetDateTime.of(localDateTime, zoneOffset);
                    }

                    @Override // com.google.gson.b
                    public final void c(hs3 hs3Var, Object obj) throws IOException {
                        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                        hs3Var.F0();
                        hs3Var.m("dateTime");
                        bVarA.c(hs3Var, offsetDateTime.toLocalDateTime());
                        hs3Var.m("offset");
                        bVarE.c(hs3Var, offsetDateTime.getOffset());
                        hs3Var.j0();
                    }
                }.a();
            }
            if (cls == OffsetTime.class) {
                com.google.gson.b bVar = JavaTimeTypeAdapters.a;
                aVar.getClass();
                final com.google.gson.b bVarE2 = aVar.e(new yi8(LocalTime.class));
                final com.google.gson.b bVarE3 = aVar.e(new yi8(ZoneOffset.class));
                return new com.google.gson.b() { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.8
                    @Override // com.google.gson.b
                    public final Object b(rq3 rq3Var) throws IOException {
                        rq3Var.F0();
                        LocalTime localTime = null;
                        ZoneOffset zoneOffset = null;
                        while (rq3Var.c0() != 4) {
                            String strE0 = rq3Var.e0();
                            strE0.getClass();
                            if (strE0.equals("offset")) {
                                zoneOffset = (ZoneOffset) bVarE3.b(rq3Var);
                            } else if (strE0.equals("time")) {
                                localTime = (LocalTime) bVarE2.b(rq3Var);
                            } else {
                                rq3Var.v();
                            }
                        }
                        rq3Var.j0();
                        JavaTimeTypeAdapters.b(localTime, "time", rq3Var);
                        JavaTimeTypeAdapters.b(zoneOffset, "offset", rq3Var);
                        return OffsetTime.of(localTime, zoneOffset);
                    }

                    @Override // com.google.gson.b
                    public final void c(hs3 hs3Var, Object obj) throws IOException {
                        OffsetTime offsetTime = (OffsetTime) obj;
                        hs3Var.F0();
                        hs3Var.m("time");
                        bVarE2.c(hs3Var, offsetTime.toLocalTime());
                        hs3Var.m("offset");
                        bVarE3.c(hs3Var, offsetTime.getOffset());
                        hs3Var.j0();
                    }
                }.a();
            }
            if (cls == Period.class) {
                return JavaTimeTypeAdapters.f;
            }
            if (cls == Year.class) {
                return JavaTimeTypeAdapters.g;
            }
            if (cls == YearMonth.class) {
                return JavaTimeTypeAdapters.h;
            }
            if (cls == ZoneId.class || cls == ZoneOffset.class) {
                return JavaTimeTypeAdapters.i;
            }
            if (cls != ZonedDateTime.class) {
                return null;
            }
            final com.google.gson.b bVarA2 = JavaTimeTypeAdapters.a(aVar);
            final com.google.gson.b bVarE4 = aVar.e(new yi8(ZoneOffset.class));
            final com.google.gson.b bVarE5 = aVar.e(new yi8(ZoneId.class));
            return new com.google.gson.b() { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.13
                @Override // com.google.gson.b
                public final Object b(rq3 rq3Var) throws IOException {
                    rq3Var.F0();
                    LocalDateTime localDateTime = null;
                    ZoneOffset zoneOffset = null;
                    ZoneId zoneId = null;
                    while (rq3Var.c0() != 4) {
                        String strE0 = rq3Var.e0();
                        strE0.getClass();
                        switch (strE0) {
                            case "offset":
                                zoneOffset = (ZoneOffset) bVarE4.b(rq3Var);
                                break;
                            case "zone":
                                zoneId = (ZoneId) bVarE5.b(rq3Var);
                                break;
                            case "dateTime":
                                localDateTime = (LocalDateTime) bVarA2.b(rq3Var);
                                break;
                            default:
                                rq3Var.v();
                                break;
                        }
                    }
                    rq3Var.j0();
                    JavaTimeTypeAdapters.b(localDateTime, "dateTime", rq3Var);
                    JavaTimeTypeAdapters.b(zoneOffset, "offset", rq3Var);
                    JavaTimeTypeAdapters.b(zoneId, "zone", rq3Var);
                    return ZonedDateTime.ofInstant(localDateTime, zoneOffset, zoneId);
                }

                @Override // com.google.gson.b
                public final void c(hs3 hs3Var, Object obj) throws IOException {
                    ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                    if (zonedDateTime == null) {
                        hs3Var.u();
                        return;
                    }
                    hs3Var.F0();
                    hs3Var.m("dateTime");
                    bVarA2.c(hs3Var, zonedDateTime.u());
                    hs3Var.m("offset");
                    bVarE4.c(hs3Var, zonedDateTime.getOffset());
                    hs3Var.m("zone");
                    bVarE5.c(hs3Var, zonedDateTime.getZone());
                    hs3Var.j0();
                }
            }.a();
        }
    };

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JavaTimeTypeAdapters$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public class AnonymousClass1 extends TypeAdapters$IntegerFieldsTypeAdapter<Duration> {
        @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
        public final Object d(long[] jArr) {
            return Duration.ofSeconds(jArr[0], jArr[1]);
        }

        @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
        public final long[] e(Object obj) {
            Duration duration = (Duration) obj;
            return new long[]{duration.getSeconds(), duration.getNano()};
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JavaTimeTypeAdapters$10, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public class AnonymousClass10 extends TypeAdapters$IntegerFieldsTypeAdapter<Year> {
        @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
        public final Object d(long[] jArr) {
            return Year.of(Math.toIntExact(jArr[0]));
        }

        @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
        public final long[] e(Object obj) {
            return new long[]{((Year) obj).getValue()};
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JavaTimeTypeAdapters$11, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public class AnonymousClass11 extends TypeAdapters$IntegerFieldsTypeAdapter<YearMonth> {
        @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
        public final Object d(long[] jArr) {
            return YearMonth.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]));
        }

        @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
        public final long[] e(Object obj) {
            YearMonth yearMonth = (YearMonth) obj;
            return new long[]{yearMonth.getYear(), yearMonth.getMonthValue()};
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JavaTimeTypeAdapters$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public class AnonymousClass2 extends TypeAdapters$IntegerFieldsTypeAdapter<Instant> {
        @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
        public final Object d(long[] jArr) {
            return Instant.ofEpochSecond(jArr[0], jArr[1]);
        }

        @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
        public final long[] e(Object obj) {
            Instant instant = (Instant) obj;
            return new long[]{instant.getEpochSecond(), instant.getNano()};
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JavaTimeTypeAdapters$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public class AnonymousClass3 extends TypeAdapters$IntegerFieldsTypeAdapter<LocalDate> {
        @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
        public final Object d(long[] jArr) {
            return LocalDate.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]));
        }

        @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
        public final long[] e(Object obj) {
            LocalDate localDate = (LocalDate) obj;
            return new long[]{localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth()};
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JavaTimeTypeAdapters$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public class AnonymousClass4 extends TypeAdapters$IntegerFieldsTypeAdapter<LocalTime> {
        @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
        public final Object d(long[] jArr) {
            return LocalTime.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]), Math.toIntExact(jArr[3]));
        }

        @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
        public final long[] e(Object obj) {
            LocalTime localTime = (LocalTime) obj;
            return new long[]{localTime.getHour(), localTime.getMinute(), localTime.getSecond(), localTime.getNano()};
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JavaTimeTypeAdapters$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public class AnonymousClass6 extends TypeAdapters$IntegerFieldsTypeAdapter<MonthDay> {
        @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
        public final Object d(long[] jArr) {
            return MonthDay.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]));
        }

        @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
        public final long[] e(Object obj) {
            MonthDay monthDay = (MonthDay) obj;
            return new long[]{monthDay.getMonthValue(), monthDay.getDayOfMonth()};
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.JavaTimeTypeAdapters$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public class AnonymousClass9 extends TypeAdapters$IntegerFieldsTypeAdapter<Period> {
        @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
        public final Object d(long[] jArr) {
            return Period.of(Math.toIntExact(jArr[0]), Math.toIntExact(jArr[1]), Math.toIntExact(jArr[2]));
        }

        @Override // com.google.gson.internal.bind.TypeAdapters$IntegerFieldsTypeAdapter
        public final long[] e(Object obj) {
            Period period = (Period) obj;
            return new long[]{period.getYears(), period.getMonths(), period.getDays()};
        }
    }

    public static com.google.gson.b a(com.google.gson.a aVar) {
        aVar.getClass();
        final com.google.gson.b bVarE = aVar.e(new yi8(LocalDate.class));
        final com.google.gson.b bVarE2 = aVar.e(new yi8(LocalTime.class));
        return new com.google.gson.b() { // from class: com.google.gson.internal.bind.JavaTimeTypeAdapters.5
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                rq3Var.F0();
                LocalDate localDate = null;
                LocalTime localTime = null;
                while (rq3Var.c0() != 4) {
                    String strE0 = rq3Var.e0();
                    strE0.getClass();
                    if (strE0.equals("date")) {
                        localDate = (LocalDate) bVarE.b(rq3Var);
                    } else if (strE0.equals("time")) {
                        localTime = (LocalTime) bVarE2.b(rq3Var);
                    } else {
                        rq3Var.v();
                    }
                }
                rq3Var.j0();
                JavaTimeTypeAdapters.b(localDate, "date", rq3Var);
                JavaTimeTypeAdapters.b(localTime, "time", rq3Var);
                return LocalDateTime.of(localDate, localTime);
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                LocalDateTime localDateTime = (LocalDateTime) obj;
                hs3Var.F0();
                hs3Var.m("date");
                bVarE.c(hs3Var, localDateTime.m());
                hs3Var.m("time");
                bVarE2.c(hs3Var, localDateTime.toLocalTime());
                hs3Var.j0();
            }
        }.a();
    }

    public static void b(Serializable serializable, String str, rq3 rq3Var) {
        if (serializable != null) {
            return;
        }
        StringBuilder sbP = p61.p("Missing ", str, " field; at path ");
        sbP.append(rq3Var.C());
        throw new fr3(sbP.toString());
    }
}
