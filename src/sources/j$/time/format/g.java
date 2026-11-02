package j$.time.format;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements e {
    public static volatile Map.Entry b;
    public static volatile Map.Entry c;
    public final /* synthetic */ byte a;

    public /* synthetic */ g(byte b2) {
        this.a = b2;
    }

    public static int a(o oVar, CharSequence charSequence, int i, int i2, i iVar) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            oVar.e(ZoneId.of(upperCase));
            return i2;
        }
        if (charSequence.charAt(i2) == '0' || oVar.a(charSequence.charAt(i2), 'Z')) {
            oVar.e(ZoneId.of(upperCase));
            return i2;
        }
        o oVar2 = new o(oVar.a);
        oVar2.b = oVar.b;
        oVar2.c = oVar.c;
        int iX = iVar.x(oVar2, charSequence, i2);
        try {
            if (iX >= 0) {
                oVar.e(ZoneId.x(upperCase, ZoneOffset.ofTotalSeconds((int) oVar2.d(ChronoField.OFFSET_SECONDS).longValue())));
                return iX;
            }
            if (iVar == i.e) {
                return ~i;
            }
            oVar.e(ZoneId.of(upperCase));
            return i2;
        } catch (DateTimeException unused) {
            return ~i;
        }
    }

    @Override // j$.time.format.e
    public final boolean t(q qVar, StringBuilder sb) {
        int i = 0;
        switch (this.a) {
            case 0:
                Long lA = qVar.a(ChronoField.INSTANT_SECONDS);
                TemporalAccessor temporalAccessor = qVar.a;
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                Long lValueOf = temporalAccessor.i(chronoField) ? Long.valueOf(temporalAccessor.k(chronoField)) : null;
                if (lA == null) {
                    return false;
                }
                long jLongValue = lA.longValue();
                int iA = chronoField.b.a(lValueOf != null ? lValueOf.longValue() : 0L, chronoField);
                if (jLongValue >= -62167219200L) {
                    long j = jLongValue - 253402300800L;
                    long jFloorDiv = Math.floorDiv(j, 315569520000L) + 1;
                    LocalDateTime localDateTimeI = LocalDateTime.I(Math.floorMod(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
                    if (jFloorDiv > 0) {
                        sb.append('+');
                        sb.append(jFloorDiv);
                    }
                    sb.append(localDateTimeI);
                    if (localDateTimeI.b.getSecond() == 0) {
                        sb.append(":00");
                    }
                } else {
                    long j2 = jLongValue + 62167219200L;
                    long j3 = j2 / 315569520000L;
                    long j4 = j2 % 315569520000L;
                    LocalDateTime localDateTimeI2 = LocalDateTime.I(j4 - 62167219200L, 0, ZoneOffset.UTC);
                    int length = sb.length();
                    sb.append(localDateTimeI2);
                    if (localDateTimeI2.b.getSecond() == 0) {
                        sb.append(":00");
                    }
                    if (j3 < 0) {
                        if (localDateTimeI2.a.getYear() == -10000) {
                            sb.replace(length, length + 2, Long.toString(j3 - 1));
                        } else if (j4 == 0) {
                            sb.insert(length, j3);
                        } else {
                            sb.insert(length + 1, Math.abs(j3));
                        }
                    }
                }
                if (iA > 0) {
                    sb.append('.');
                    int i2 = 100000000;
                    while (true) {
                        if (iA > 0 || i % 3 != 0 || i < -2) {
                            int i3 = iA / i2;
                            sb.append((char) (i3 + 48));
                            iA -= i3 * i2;
                            i2 /= 10;
                            i++;
                        }
                    }
                }
                sb.append('Z');
                return true;
            default:
                j$.time.e eVar = DateTimeFormatterBuilder.f;
                TemporalAccessor temporalAccessor2 = qVar.a;
                Object objD = temporalAccessor2.d(eVar);
                if (objD == null && qVar.c == 0) {
                    throw new DateTimeException("Unable to extract " + eVar + " from temporal " + temporalAccessor2);
                }
                ZoneId zoneId = (ZoneId) objD;
                if (zoneId == null) {
                    return false;
                }
                sb.append(zoneId.getId());
                return true;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Instant()";
            default:
                return "ZoneRegionId()";
        }
    }

    @Override // j$.time.format.e
    public final int x(o oVar, CharSequence charSequence, int i) {
        int i2;
        int i3 = 1;
        switch (this.a) {
            case 0:
                DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
                dateTimeFormatterBuilder.a(DateTimeFormatter.ISO_LOCAL_DATE);
                DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral = dateTimeFormatterBuilder.appendLiteral('T');
                ChronoField chronoField = ChronoField.HOUR_OF_DAY;
                DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral2 = dateTimeFormatterBuilderAppendLiteral.appendValue(chronoField, 2).appendLiteral(':');
                ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
                DateTimeFormatterBuilder dateTimeFormatterBuilderAppendLiteral3 = dateTimeFormatterBuilderAppendLiteral2.appendValue(chronoField2, 2).appendLiteral(':');
                ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
                DateTimeFormatterBuilder dateTimeFormatterBuilderAppendValue = dateTimeFormatterBuilderAppendLiteral3.appendValue(chronoField3, 2);
                ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
                dateTimeFormatterBuilderAppendValue.getClass();
                dateTimeFormatterBuilderAppendValue.b(new f(chronoField4));
                d dVar = dateTimeFormatterBuilderAppendValue.appendLiteral('Z').toFormatter().a;
                if (dVar.b) {
                    dVar = new d(dVar.a, false);
                }
                o oVar2 = new o(oVar.a);
                oVar2.b = oVar.b;
                oVar2.c = oVar.c;
                int iX = dVar.x(oVar2, charSequence, i);
                if (iX < 0) {
                    return iX;
                }
                long jLongValue = oVar2.d(ChronoField.YEAR).longValue();
                int iIntValue = oVar2.d(ChronoField.MONTH_OF_YEAR).intValue();
                int iIntValue2 = oVar2.d(ChronoField.DAY_OF_MONTH).intValue();
                int iIntValue3 = oVar2.d(chronoField).intValue();
                int iIntValue4 = oVar2.d(chronoField2).intValue();
                Long lD = oVar2.d(chronoField3);
                Long lD2 = oVar2.d(chronoField4);
                int iIntValue5 = lD != null ? lD.intValue() : 0;
                int iIntValue6 = lD2 != null ? lD2.intValue() : 0;
                if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
                    iIntValue3 = 0;
                } else {
                    if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
                        oVar.c().d = true;
                        iIntValue5 = 59;
                    }
                    i3 = 0;
                }
                int i4 = ((int) jLongValue) % 10000;
                try {
                    LocalDateTime localDateTime = LocalDateTime.MIN;
                    LocalDate localDateOf = LocalDate.of(i4, iIntValue, iIntValue2);
                    LocalTime localTimeOf = LocalTime.of(iIntValue3, iIntValue4, iIntValue5, 0);
                    return oVar.f(chronoField4, iIntValue6, i, oVar.f(ChronoField.INSTANT_SECONDS, new LocalDateTime(localDateOf, localTimeOf).S(localDateOf.U(i3), localTimeOf).s(ZoneOffset.UTC) + Math.multiplyExact(jLongValue / 10000, 315569520000L), i, iX));
                } catch (RuntimeException unused) {
                    return ~i;
                }
            default:
                int length = charSequence.length();
                if (i > length) {
                    throw new IndexOutOfBoundsException();
                }
                if (i != length) {
                    char cCharAt = charSequence.charAt(i);
                    if (cCharAt == '+' || cCharAt == '-') {
                        return a(oVar, charSequence, i, i, i.e);
                    }
                    int i5 = i + 2;
                    if (length >= i5) {
                        char cCharAt2 = charSequence.charAt(i + 1);
                        if (oVar.a(cCharAt, 'U') && oVar.a(cCharAt2, 'T')) {
                            int i6 = i + 3;
                            return (length < i6 || !oVar.a(charSequence.charAt(i5), 'C')) ? a(oVar, charSequence, i, i5, i.f) : a(oVar, charSequence, i, i6, i.f);
                        }
                        if (oVar.a(cCharAt, 'G') && length >= (i2 = i + 3) && oVar.a(cCharAt2, 'M') && oVar.a(charSequence.charAt(i5), 'T')) {
                            int i7 = i + 4;
                            if (length < i7 || !oVar.a(charSequence.charAt(i2), '0')) {
                                return a(oVar, charSequence, i, i2, i.f);
                            }
                            oVar.e(ZoneId.of("GMT0"));
                            return i7;
                        }
                    }
                    Set<String> set = j$.time.zone.h.d;
                    int size = set.size();
                    Map.Entry simpleImmutableEntry = oVar.b ? b : c;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        synchronized (this) {
                            try {
                                simpleImmutableEntry = oVar.b ? b : c;
                                if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                                    Integer numValueOf = Integer.valueOf(size);
                                    k kVar = oVar.b ? new k(_UrlKt.FRAGMENT_ENCODE_SET, null, null) : new j(_UrlKt.FRAGMENT_ENCODE_SET, null, null);
                                    for (String str : set) {
                                        kVar.a(str, str);
                                    }
                                    simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, kVar);
                                    if (oVar.b) {
                                        b = simpleImmutableEntry;
                                    } else {
                                        c = simpleImmutableEntry;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    k kVar2 = (k) simpleImmutableEntry.getValue();
                    ParsePosition parsePosition = new ParsePosition(i);
                    String strC = kVar2.c(charSequence, parsePosition);
                    if (strC != null) {
                        oVar.e(ZoneId.of(strC));
                        return parsePosition.getIndex();
                    }
                    if (oVar.a(cCharAt, 'Z')) {
                        oVar.e(ZoneOffset.UTC);
                        return i + 1;
                    }
                    break;
                }
                return ~i;
        }
    }
}
