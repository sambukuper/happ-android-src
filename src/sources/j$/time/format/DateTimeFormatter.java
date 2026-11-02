package j$.time.format;

import j$.time.DateTimeException;
import j$.time.LocalTime;
import j$.time.Period;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_INSTANT;
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter e;
    public static final DateTimeFormatter f;
    public final d a;
    public final Locale b;
    public final v c;
    public final j$.time.chrono.k d;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        SignStyle signStyle = SignStyle.EXCEEDS_PAD;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral = dateTimeFormatterBuilder.appendValue(chronoField, 4, 10, signStyle).appendLiteral('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral2 = dateTimeFormatterBuilderAppendLiteral.appendValue(chronoField2, 2).appendLiteral('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue = dateTimeFormatterBuilderAppendLiteral2.appendValue(chronoField3, 2);
        v vVar = v.STRICT;
        j$.time.chrono.r rVar = j$.time.chrono.r.c;
        DateTimeFormatter dateTimeFormatterH = dateTimeFormatterBuilderAppendValue.h(vVar, rVar);
        ISO_LOCAL_DATE = dateTimeFormatterH;
        DateTimeFormatterBuilder caseInsensitive = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive.a(dateTimeFormatterH);
        caseInsensitive.appendOffsetId().h(vVar, rVar);
        DateTimeFormatterBuilder caseInsensitive2 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive2.a(dateTimeFormatterH);
        caseInsensitive2.g();
        caseInsensitive2.appendOffsetId().h(vVar, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral3 = dateTimeFormatterBuilder2.appendValue(chronoField4, 2).appendLiteral(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue2 = dateTimeFormatterBuilderAppendLiteral3.appendValue(chronoField5, 2);
        dateTimeFormatterBuilderAppendValue2.g();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral4 = dateTimeFormatterBuilderAppendValue2.appendLiteral(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue3 = dateTimeFormatterBuilderAppendLiteral4.appendValue(chronoField6, 2);
        dateTimeFormatterBuilderAppendValue3.g();
        dateTimeFormatterBuilderAppendValue3.b(new f(ChronoField.NANO_OF_SECOND));
        DateTimeFormatter dateTimeFormatterH2 = dateTimeFormatterBuilderAppendValue3.h(vVar, null);
        e = dateTimeFormatterH2;
        DateTimeFormatterBuilder caseInsensitive3 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive3.a(dateTimeFormatterH2);
        caseInsensitive3.appendOffsetId().h(vVar, null);
        DateTimeFormatterBuilder caseInsensitive4 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive4.a(dateTimeFormatterH2);
        caseInsensitive4.g();
        caseInsensitive4.appendOffsetId().h(vVar, null);
        DateTimeFormatterBuilder caseInsensitive5 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive5.a(dateTimeFormatterH);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral5 = caseInsensitive5.appendLiteral('T');
        dateTimeFormatterBuilderAppendLiteral5.a(dateTimeFormatterH2);
        DateTimeFormatter dateTimeFormatterH3 = dateTimeFormatterBuilderAppendLiteral5.h(vVar, rVar);
        f = dateTimeFormatterH3;
        DateTimeFormatterBuilder caseInsensitive6 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive6.a(dateTimeFormatterH3);
        l lVar = l.LENIENT;
        caseInsensitive6.b(lVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId = caseInsensitive6.appendOffsetId();
        l lVar2 = l.STRICT;
        dateTimeFormatterBuilderAppendOffsetId.b(lVar2);
        DateTimeFormatter dateTimeFormatterH4 = dateTimeFormatterBuilderAppendOffsetId.h(vVar, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.a(dateTimeFormatterH4);
        dateTimeFormatterBuilder3.g();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral6 = dateTimeFormatterBuilder3.appendLiteral('[');
        l lVar3 = l.SENSITIVE;
        dateTimeFormatterBuilderAppendLiteral6.b(lVar3);
        byte b = 1;
        dateTimeFormatterBuilderAppendLiteral6.b(new g(b));
        dateTimeFormatterBuilderAppendLiteral6.appendLiteral(']').h(vVar, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder4.a(dateTimeFormatterH3);
        dateTimeFormatterBuilder4.g();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffsetId2 = dateTimeFormatterBuilder4.appendOffsetId();
        dateTimeFormatterBuilderAppendOffsetId2.g();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral7 = dateTimeFormatterBuilderAppendOffsetId2.appendLiteral('[');
        dateTimeFormatterBuilderAppendLiteral7.b(lVar3);
        dateTimeFormatterBuilderAppendLiteral7.b(new g(b));
        dateTimeFormatterBuilderAppendLiteral7.appendLiteral(']').h(vVar, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue4 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4, 10, signStyle).appendLiteral('-').appendValue(ChronoField.DAY_OF_YEAR, 3);
        dateTimeFormatterBuilderAppendValue4.g();
        dateTimeFormatterBuilderAppendValue4.appendOffsetId().h(vVar, rVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue5 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(j$.time.temporal.i.c, 4, 10, signStyle);
        dateTimeFormatterBuilderAppendValue5.c("-W");
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral8 = dateTimeFormatterBuilderAppendValue5.appendValue(j$.time.temporal.i.b, 2).appendLiteral('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue6 = dateTimeFormatterBuilderAppendLiteral8.appendValue(chronoField7, 1);
        dateTimeFormatterBuilderAppendValue6.g();
        dateTimeFormatterBuilderAppendValue6.appendOffsetId().h(vVar, rVar);
        DateTimeFormatterBuilder caseInsensitive7 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive7.getClass();
        caseInsensitive7.b(new g((byte) 0));
        ISO_INSTANT = caseInsensitive7.h(vVar, null);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue7 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4).appendValue(chronoField2, 2).appendValue(chronoField3, 2);
        dateTimeFormatterBuilderAppendValue7.g();
        dateTimeFormatterBuilderAppendValue7.b(lVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendOffset = dateTimeFormatterBuilderAppendValue7.appendOffset("+HHMMss", "Z");
        dateTimeFormatterBuilderAppendOffset.b(lVar2);
        dateTimeFormatterBuilderAppendOffset.h(vVar, rVar);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        DateTimeFormatterBuilder caseInsensitive8 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        caseInsensitive8.b(lVar);
        caseInsensitive8.g();
        caseInsensitive8.d(chronoField7, map);
        caseInsensitive8.c(", ");
        caseInsensitive8.f();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral9 = caseInsensitive8.appendValue(chronoField3, 1, 2, SignStyle.NOT_NEGATIVE).appendLiteral(' ');
        dateTimeFormatterBuilderAppendLiteral9.d(chronoField2, map2);
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue8 = dateTimeFormatterBuilderAppendLiteral9.appendLiteral(' ').appendValue(chronoField, 4).appendLiteral(' ').appendValue(chronoField4, 2).appendLiteral(':').appendValue(chronoField5, 2);
        dateTimeFormatterBuilderAppendValue8.g();
        DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue9 = dateTimeFormatterBuilderAppendValue8.appendLiteral(':').appendValue(chronoField6, 2);
        dateTimeFormatterBuilderAppendValue9.f();
        dateTimeFormatterBuilderAppendValue9.appendLiteral(' ').appendOffset("+HHMM", "GMT").h(v.SMART, rVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, v vVar, j$.time.chrono.k kVar) {
        int i = t.a;
        this.a = dVar;
        Objects.requireNonNull(locale, "locale");
        this.b = locale;
        Objects.requireNonNull(vVar, "resolverStyle");
        this.c = vVar;
        this.d = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x027c  */
    /* JADX WARN: Code duplicated, block: B:132:0x030c  */
    /* JADX WARN: Code duplicated, block: B:134:0x031a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0345  */
    /* JADX WARN: Code duplicated, block: B:169:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0258  */
    public final u a(CharSequence charSequence) {
        TemporalField temporalField;
        ChronoField chronoField;
        ChronoField chronoField2;
        boolean zContainsKey;
        Map map;
        Period period;
        Period period2;
        TemporalField temporalField2;
        int i = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        o oVar = new o(this);
        int iX = this.a.x(oVar, charSequence, parsePosition.getIndex());
        if (iX < 0) {
            parsePosition.setErrorIndex(~iX);
            oVar = null;
        } else {
            parsePosition.setIndex(iX);
        }
        if (oVar == null || parsePosition.getErrorIndex() >= 0 || parsePosition.getIndex() < charSequence.length()) {
            String string = charSequence.length() > 64 ? charSequence.subSequence(0, 64).toString() + "..." : charSequence.toString();
            if (parsePosition.getErrorIndex() >= 0) {
                String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
                parsePosition.getErrorIndex();
                throw new DateTimeParseException(str, charSequence);
            }
            String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
            parsePosition.getIndex();
            throw new DateTimeParseException(str2, charSequence);
        }
        u uVarC = oVar.c();
        j$.time.chrono.k kVar = oVar.c().c;
        if (kVar == null && (kVar = oVar.a.d) == null) {
            kVar = j$.time.chrono.r.c;
        }
        uVarC.c = kVar;
        ZoneId zoneId = uVarC.b;
        if (zoneId == null) {
            zoneId = null;
        }
        uVarC.b = zoneId;
        uVarC.e = this.c;
        uVarC.o();
        uVarC.w(uVarC.c.L(uVarC.a, uVarC.e));
        uVarC.t();
        if (((HashMap) uVarC.a).size() > 0) {
            loop0: while (i < 50) {
                Iterator it = ((HashMap) uVarC.a).entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    temporalField2 = (TemporalField) ((Map.Entry) it.next()).getKey();
                    TemporalAccessor temporalAccessorC = temporalField2.C(uVarC.a, uVarC, uVarC.e);
                    if (temporalAccessorC != null) {
                        if (temporalAccessorC instanceof j$.time.chrono.h) {
                            j$.time.chrono.h hVar = (j$.time.chrono.h) temporalAccessorC;
                            ZoneId zoneId2 = uVarC.b;
                            if (zoneId2 == null) {
                                uVarC.b = hVar.getZone();
                            } else if (!zoneId2.equals(hVar.getZone())) {
                                throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + uVarC.b);
                            }
                            temporalAccessorC = hVar.u();
                        }
                        if (temporalAccessorC instanceof ChronoLocalDateTime) {
                            ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) temporalAccessorC;
                            uVarC.v(chronoLocalDateTime.toLocalTime(), Period.d);
                            uVarC.w(chronoLocalDateTime.m());
                            break;
                        }
                        if (temporalAccessorC instanceof ChronoLocalDate) {
                            uVarC.w((ChronoLocalDate) temporalAccessorC);
                            break;
                        }
                        if (temporalAccessorC instanceof LocalTime) {
                            uVarC.v((LocalTime) temporalAccessorC, Period.d);
                            break;
                        }
                        j$.time.g.a("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                        return null;
                    }
                } while (((HashMap) uVarC.a).containsKey(temporalField2));
                i++;
            }
            if (i == 50) {
                j$.time.g.a("One of the parsed fields has an incorrectly implemented resolve method");
                return null;
            }
            if (i > 0) {
                uVarC.o();
                uVarC.w(uVarC.c.L(uVarC.a, uVarC.e));
                uVarC.t();
            }
        }
        long j = 1000000;
        if (uVarC.g == null) {
            Map map2 = uVarC.a;
            ChronoField chronoField3 = ChronoField.MILLI_OF_SECOND;
            boolean zContainsKey2 = ((HashMap) map2).containsKey(chronoField3);
            Map map3 = uVarC.a;
            if (zContainsKey2) {
                long jLongValue = ((Long) ((HashMap) map3).remove(chronoField3)).longValue();
                Map map4 = uVarC.a;
                ChronoField chronoField4 = ChronoField.MICRO_OF_SECOND;
                boolean zContainsKey3 = ((HashMap) map4).containsKey(chronoField4);
                Map map5 = uVarC.a;
                if (zContainsKey3) {
                    long jLongValue2 = (((Long) ((HashMap) map5).get(chronoField4)).longValue() % 1000) + (jLongValue * 1000);
                    uVarC.x(chronoField3, chronoField4, Long.valueOf(jLongValue2));
                    ((HashMap) uVarC.a).remove(chronoField4);
                    ((HashMap) uVarC.a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue2 * 1000));
                } else {
                    ((HashMap) map5).put(ChronoField.NANO_OF_SECOND, Long.valueOf(jLongValue * 1000000));
                }
            } else {
                ChronoField chronoField5 = ChronoField.MICRO_OF_SECOND;
                if (((HashMap) map3).containsKey(chronoField5)) {
                    ((HashMap) uVarC.a).put(ChronoField.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) uVarC.a).remove(chronoField5)).longValue() * 1000));
                }
            }
            Map map6 = uVarC.a;
            ChronoField chronoField6 = ChronoField.HOUR_OF_DAY;
            Long l = (Long) ((HashMap) map6).get(chronoField6);
            if (l != null) {
                Map map7 = uVarC.a;
                ChronoField chronoField7 = ChronoField.MINUTE_OF_HOUR;
                Long l2 = (Long) ((HashMap) map7).get(chronoField7);
                Map map8 = uVarC.a;
                ChronoField chronoField8 = ChronoField.SECOND_OF_MINUTE;
                Long l3 = (Long) ((HashMap) map8).get(chronoField8);
                Map map9 = uVarC.a;
                ChronoField chronoField9 = ChronoField.NANO_OF_SECOND;
                Long l4 = (Long) ((HashMap) map9).get(chronoField9);
                if ((l2 != null || (l3 == null && l4 == null)) && (l2 == null || l3 != null || l4 == null)) {
                    uVarC.r(l.longValue(), l2 != null ? l2.longValue() : 0L, l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L);
                    ((HashMap) uVarC.a).remove(chronoField6);
                    ((HashMap) uVarC.a).remove(chronoField7);
                    ((HashMap) uVarC.a).remove(chronoField8);
                    ((HashMap) uVarC.a).remove(chronoField9);
                } else {
                    j = 1000000;
                }
            }
            if (uVarC.e != v.LENIENT && ((HashMap) uVarC.a).size() > 0) {
                for (Map.Entry entry : ((HashMap) uVarC.a).entrySet()) {
                    temporalField = (TemporalField) entry.getKey();
                    if (temporalField instanceof ChronoField) {
                        chronoField = (ChronoField) temporalField;
                        if (chronoField.Q()) {
                            chronoField.P(((Long) entry.getValue()).longValue());
                        }
                    }
                }
            }
        } else if (uVarC.e != v.LENIENT) {
            while (r0.hasNext()) {
                temporalField = (TemporalField) entry.getKey();
                if (temporalField instanceof ChronoField) {
                    chronoField = (ChronoField) temporalField;
                    if (chronoField.Q()) {
                        chronoField.P(((Long) entry.getValue()).longValue());
                    }
                }
            }
        }
        ChronoLocalDate chronoLocalDate = uVarC.f;
        if (chronoLocalDate != null) {
            uVarC.n(chronoLocalDate);
        }
        LocalTime localTime = uVarC.g;
        if (localTime != null) {
            uVarC.n(localTime);
            if (uVarC.f != null && ((HashMap) uVarC.a).size() > 0) {
                uVarC.n(uVarC.f.F(uVarC.g));
            }
        }
        ChronoLocalDate chronoLocalDate2 = uVarC.f;
        if (chronoLocalDate2 != null && uVarC.g != null && (period = uVarC.h) != (period2 = Period.d)) {
            uVarC.f = chronoLocalDate2.K(period);
            uVarC.h = period2;
        }
        if (uVarC.g == null) {
            if (((HashMap) uVarC.a).containsKey(ChronoField.INSTANT_SECONDS)) {
                Map map10 = uVarC.a;
                chronoField2 = ChronoField.NANO_OF_SECOND;
                zContainsKey = ((HashMap) map10).containsKey(chronoField2);
                map = uVarC.a;
                if (zContainsKey) {
                    long jLongValue3 = ((Long) ((HashMap) map).get(chronoField2)).longValue();
                    ((HashMap) uVarC.a).put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue3 / 1000));
                    ((HashMap) uVarC.a).put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue3 / j));
                } else {
                    ((HashMap) map).put(chronoField2, 0L);
                    ((HashMap) uVarC.a).put(ChronoField.MICRO_OF_SECOND, 0L);
                    ((HashMap) uVarC.a).put(ChronoField.MILLI_OF_SECOND, 0L);
                }
            } else if (((HashMap) uVarC.a).containsKey(ChronoField.SECOND_OF_DAY)) {
                Map map11 = uVarC.a;
                chronoField2 = ChronoField.NANO_OF_SECOND;
                zContainsKey = ((HashMap) map11).containsKey(chronoField2);
                map = uVarC.a;
                if (zContainsKey) {
                    long jLongValue4 = ((Long) ((HashMap) map).get(chronoField2)).longValue();
                    ((HashMap) uVarC.a).put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue4 / 1000));
                    ((HashMap) uVarC.a).put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue4 / j));
                } else {
                    ((HashMap) map).put(chronoField2, 0L);
                    ((HashMap) uVarC.a).put(ChronoField.MICRO_OF_SECOND, 0L);
                    ((HashMap) uVarC.a).put(ChronoField.MILLI_OF_SECOND, 0L);
                }
            } else if (((HashMap) uVarC.a).containsKey(ChronoField.SECOND_OF_MINUTE)) {
                Map map12 = uVarC.a;
                chronoField2 = ChronoField.NANO_OF_SECOND;
                zContainsKey = ((HashMap) map12).containsKey(chronoField2);
                map = uVarC.a;
                if (zContainsKey) {
                    long jLongValue5 = ((Long) ((HashMap) map).get(chronoField2)).longValue();
                    ((HashMap) uVarC.a).put(ChronoField.MICRO_OF_SECOND, Long.valueOf(jLongValue5 / 1000));
                    ((HashMap) uVarC.a).put(ChronoField.MILLI_OF_SECOND, Long.valueOf(jLongValue5 / j));
                } else {
                    ((HashMap) map).put(chronoField2, 0L);
                    ((HashMap) uVarC.a).put(ChronoField.MICRO_OF_SECOND, 0L);
                    ((HashMap) uVarC.a).put(ChronoField.MILLI_OF_SECOND, 0L);
                }
            }
        }
        if (uVarC.f != null && uVarC.g != null) {
            Long l5 = (Long) ((HashMap) uVarC.a).get(ChronoField.OFFSET_SECONDS);
            if (l5 != null) {
                ((HashMap) uVarC.a).put(ChronoField.INSTANT_SECONDS, Long.valueOf(uVarC.f.F(uVarC.g).B(ZoneOffset.ofTotalSeconds(l5.intValue())).O()));
                return uVarC;
            }
            if (uVarC.b != null) {
                ((HashMap) uVarC.a).put(ChronoField.INSTANT_SECONDS, Long.valueOf(uVarC.f.F(uVarC.g).B(uVarC.b).O()));
            }
        }
        return uVarC;
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        d dVar = this.a;
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            dVar.t(new q(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new DateTimeException(e2.getMessage(), e2);
        }
    }

    public <T> T parse(CharSequence charSequence, TemporalQuery<T> temporalQuery) {
        String string;
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(temporalQuery, "query");
        try {
            return (T) a(charSequence).d(temporalQuery);
        } catch (DateTimeParseException e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string + "' could not be parsed: " + e3.getMessage(), e3);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    public final String toString() {
        String string = this.a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }
}
