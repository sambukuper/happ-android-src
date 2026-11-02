package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.chrono.r;
import j$.time.temporal.ChronoField;
import j$.time.temporal.n;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public final class ZoneRules implements Serializable {
    public static final long[] i = new long[0];
    public static final e[] j = new e[0];
    public static final LocalDateTime[] k = new LocalDateTime[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final ZoneOffset[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final e[] f;
    public final TimeZone g;
    public final transient ConcurrentMap h = new ConcurrentHashMap();

    public ZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                ZoneOffset zoneOffset = zoneOffsetArr2[i2];
                int i3 = i2 + 1;
                ZoneOffset zoneOffset2 = zoneOffsetArr2[i3];
                LocalDateTime localDateTimeI = LocalDateTime.I(jArr2[i2], 0, zoneOffset);
                if (zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds()) {
                    arrayList.add(localDateTimeI);
                    arrayList.add(localDateTimeI.P(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                } else {
                    arrayList.add(localDateTimeI.P(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                    arrayList.add(localDateTimeI);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.b;
        if (bVar.d.getTotalSeconds() > bVar.c.getTotalSeconds()) {
            if (localDateTime.C(localDateTime2)) {
                return bVar.c;
            }
            if (!localDateTime.C(bVar.b.P(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()))) {
                return bVar.d;
            }
        } else {
            if (!localDateTime.C(localDateTime2)) {
                return bVar.d;
            }
            if (localDateTime.C(bVar.b.P(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()))) {
                return bVar.c;
            }
        }
        return bVar;
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(Math.floorDiv(j2 + ((long) zoneOffset.getTotalSeconds()), 86400L)).getYear();
    }

    public static ZoneOffset g(int i2) {
        return ZoneOffset.ofTotalSeconds(i2 / XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public final b[] b(int i2) {
        LocalDate localDateX;
        b[] bVarArr = l;
        Integer numValueOf = Integer.valueOf(i2);
        b[] bVarArr2 = (b[]) ((ConcurrentHashMap) this.h).get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j2 = 1;
        byte b = 0;
        byte b2 = 1;
        if (this.g != null) {
            if (i2 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.MIN;
            LocalDate localDateOf = LocalDate.of(i2 - 1, 12, 31);
            ChronoField.HOUR_OF_DAY.P(0L);
            long jS = new LocalDateTime(localDateOf, LocalTime.f[0]).s(this.b[0]);
            long j3 = 1000;
            int offset = this.g.getOffset(jS * 1000);
            long j4 = 31968000 + jS;
            while (jS < j4) {
                long j5 = jS + 7776000;
                long j6 = j3;
                if (offset != this.g.getOffset(j5 * j6)) {
                    while (j5 - jS > j2) {
                        long jFloorDiv = Math.floorDiv(j5 + jS, 2L);
                        if (this.g.getOffset(jFloorDiv * j6) == offset) {
                            jS = jFloorDiv;
                        } else {
                            j5 = jFloorDiv;
                        }
                        j2 = 1;
                    }
                    if (this.g.getOffset(jS * j6) == offset) {
                        jS = j5;
                    }
                    ZoneOffset zoneOffsetG = g(offset);
                    int offset2 = this.g.getOffset(jS * j6);
                    ZoneOffset zoneOffsetG2 = g(offset2);
                    if (c(jS, zoneOffsetG2) == i2) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(jS, zoneOffsetG, zoneOffsetG2);
                    }
                    offset = offset2;
                } else {
                    jS = j5;
                }
                j3 = j6;
                j2 = 1;
            }
            if (1916 <= i2 && i2 < 2100) {
                ((ConcurrentHashMap) this.h).putIfAbsent(numValueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i3 = 0;
        while (i3 < eVarArr.length) {
            e eVar = eVarArr[i3];
            byte b3 = eVar.b;
            Month month = eVar.a;
            if (b3 < 0) {
                long j7 = i2;
                r.c.getClass();
                int iX = month.x(r.R(j7)) + 1 + eVar.b;
                LocalDate localDate = LocalDate.MIN;
                ChronoField.YEAR.P(j7);
                ChronoField.DAY_OF_MONTH.P(iX);
                localDateX = LocalDate.x(i2, month.getValue(), iX);
                DayOfWeek dayOfWeek = eVar.c;
                if (dayOfWeek != null) {
                    localDateX = localDateX.e(new n(dayOfWeek.getValue(), b2));
                }
            } else {
                LocalDate localDate2 = LocalDate.MIN;
                ChronoField.YEAR.P(i2);
                ChronoField.DAY_OF_MONTH.P(b3);
                localDateX = LocalDate.x(i2, month.getValue(), b3);
                DayOfWeek dayOfWeek2 = eVar.c;
                if (dayOfWeek2 != null) {
                    localDateX = localDateX.e(new n(dayOfWeek2.getValue(), b));
                }
            }
            if (eVar.e) {
                localDateX = localDateX.U(1L);
            }
            LocalDateTime localDateTimeOf = LocalDateTime.of(localDateX, eVar.d);
            d dVar = eVar.f;
            ZoneOffset zoneOffset = eVar.g;
            ZoneOffset zoneOffset2 = eVar.h;
            int i4 = c.a[dVar.ordinal()];
            if (i4 == 1) {
                localDateTimeOf = localDateTimeOf.P(zoneOffset2.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
            } else if (i4 == 2) {
                localDateTimeOf = localDateTimeOf.P(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds());
            }
            bVarArr3[i3] = new b(localDateTimeOf, eVar.h, eVar.i);
            i3++;
            b = 0;
        }
        if (i2 < 2100) {
            ((ConcurrentHashMap) this.h).putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return g(timeZone.getOffset(instant.I()));
        }
        if (this.c.length == 0) {
            return this.b[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.f.length > 0) {
            long[] jArr = this.c;
            if (epochSecond > jArr[jArr.length - 1]) {
                ZoneOffset[] zoneOffsetArr = this.e;
                b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
                b bVar = null;
                for (int i2 = 0; i2 < bVarArrB.length; i2++) {
                    bVar = bVarArrB[i2];
                    if (epochSecond < bVar.a) {
                        return bVar.c;
                    }
                }
                return bVar.d;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.c, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.e[iBinarySearch + 1];
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    public final Object e(LocalDateTime localDateTime) {
        boolean z;
        Object obj = null;
        int i2 = 0;
        if (this.g != null) {
            b[] bVarArrB = b(localDateTime.a.getYear());
            if (bVarArrB.length == 0) {
                return g(this.g.getOffset(localDateTime.s(this.b[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i2 < length) {
                b bVar = bVarArrB[i2];
                Object objA = a(localDateTime, bVar);
                if ((objA instanceof b) || objA.equals(bVar.c)) {
                    return objA;
                }
                i2++;
                obj = objA;
            }
            return obj;
        }
        if (this.c.length == 0) {
            return this.b[0];
        }
        if (this.f.length > 0) {
            LocalDateTime[] localDateTimeArr = this.d;
            LocalDateTime localDateTime2 = localDateTimeArr[localDateTimeArr.length - 1];
            if (localDateTime2 != null) {
                localDateTime.getClass();
                if (localDateTime.t(localDateTime2) > 0) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                long epochDay = localDateTime.m().toEpochDay();
                long epochDay2 = localDateTime2.m().toEpochDay();
                if (epochDay > epochDay2 || (epochDay == epochDay2 && localDateTime.toLocalTime().U() > localDateTime2.toLocalTime().U())) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                b[] bVarArrB2 = b(localDateTime.a.getYear());
                int length2 = bVarArrB2.length;
                while (i2 < length2) {
                    b bVar2 = bVarArrB2[i2];
                    Object objA2 = a(localDateTime, bVar2);
                    if ((objA2 instanceof b) || objA2.equals(bVar2.c)) {
                        return objA2;
                    }
                    i2++;
                    obj = objA2;
                }
                return obj;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.d, localDateTime);
        if (iBinarySearch == -1) {
            return this.e[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else {
            Object[] objArr = this.d;
            if (iBinarySearch < objArr.length - 1) {
                int i3 = iBinarySearch + 1;
                if (objArr[iBinarySearch].equals(objArr[i3])) {
                    iBinarySearch = i3;
                }
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return this.e[(iBinarySearch / 2) + 1];
        }
        LocalDateTime[] localDateTimeArr2 = this.d;
        LocalDateTime localDateTime3 = localDateTimeArr2[iBinarySearch];
        LocalDateTime localDateTime4 = localDateTimeArr2[iBinarySearch + 1];
        ZoneOffset[] zoneOffsetArr = this.e;
        int i4 = iBinarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr[i4];
        ZoneOffset zoneOffset2 = zoneOffsetArr[i4 + 1];
        return zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds() ? new b(localDateTime3, zoneOffset, zoneOffset2) : new b(localDateTime4, zoneOffset, zoneOffset2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneRules)) {
            return false;
        }
        ZoneRules zoneRules = (ZoneRules) obj;
        return Objects.equals(this.g, zoneRules.g) && Arrays.equals(this.a, zoneRules.a) && Arrays.equals(this.b, zoneRules.b) && Arrays.equals(this.c, zoneRules.c) && Arrays.equals(this.e, zoneRules.e) && Arrays.equals(this.f, zoneRules.f);
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        return bVar.d.getTotalSeconds() > bVar.c.getTotalSeconds() ? Collections.EMPTY_LIST : j$.time.b.a(new Object[]{bVar.c, bVar.d});
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) ^ ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e));
    }

    /* JADX WARN: Code duplicated, block: B:64:0x012c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0134  */
    /* JADX WARN: Code duplicated, block: B:69:0x0139  */
    public boolean isFixedOffset() {
        int iBinarySearch;
        b bVar;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || this.g.getDSTSavings() != 0) {
                return false;
            }
            Instant instantNow = Instant.now();
            b bVar2 = null;
            if (this.g != null) {
                long epochSecond = instantNow.getEpochSecond();
                if (instantNow.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                    epochSecond++;
                }
                int iC = c(epochSecond, d(instantNow));
                b[] bVarArrB = b(iC);
                int length = bVarArrB.length - 1;
                while (true) {
                    if (length >= 0) {
                        bVar = bVarArrB[length];
                        if (epochSecond > bVar.a) {
                            break;
                        }
                        length--;
                    } else if (iC > 1800) {
                        b[] bVarArrB2 = b(iC - 1);
                        int length2 = bVarArrB2.length - 1;
                        while (true) {
                            if (length2 < 0) {
                                j$.time.a.b.getClass();
                                int offset = this.g.getOffset((epochSecond - 1) * 1000);
                                long epochDay = LocalDate.of(1800, 1, 1).toEpochDay() * 86400;
                                for (long jMin = Math.min(epochSecond - 31104000, (System.currentTimeMillis() / 1000) + 31968000); epochDay <= jMin; jMin -= 7776000) {
                                    int offset2 = this.g.getOffset(jMin * 1000);
                                    if (offset != offset2) {
                                        int iC2 = c(jMin, g(offset2));
                                        b[] bVarArrB3 = b(iC2 + 1);
                                        for (int length3 = bVarArrB3.length - 1; length3 >= 0; length3--) {
                                            bVar2 = bVarArrB3[length3];
                                            if (epochSecond > bVar2.a) {
                                                break;
                                            }
                                        }
                                        b[] bVarArrB4 = b(iC2);
                                        bVar2 = bVarArrB4[bVarArrB4.length - 1];
                                        break;
                                    }
                                }
                                break;
                            }
                            bVar = bVarArrB2[length2];
                            if (epochSecond > bVar.a) {
                                break;
                            }
                            length2--;
                        }
                    }
                }
                bVar2 = bVar;
            } else if (this.c.length != 0) {
                long epochSecond2 = instantNow.getEpochSecond();
                if (instantNow.getNano() > 0 && epochSecond2 < Long.MAX_VALUE) {
                    epochSecond2++;
                }
                long[] jArr = this.c;
                long j2 = jArr[jArr.length - 1];
                if (this.f.length <= 0 || epochSecond2 <= j2) {
                    iBinarySearch = Arrays.binarySearch(this.c, epochSecond2);
                    if (iBinarySearch < 0) {
                        iBinarySearch = (-iBinarySearch) - 1;
                    }
                    if (iBinarySearch > 0) {
                        int i2 = iBinarySearch - 1;
                        long j3 = this.c[i2];
                        ZoneOffset[] zoneOffsetArr = this.e;
                        bVar2 = new b(j3, zoneOffsetArr[i2], zoneOffsetArr[iBinarySearch]);
                    }
                } else {
                    ZoneOffset[] zoneOffsetArr2 = this.e;
                    ZoneOffset zoneOffset = zoneOffsetArr2[zoneOffsetArr2.length - 1];
                    int iC3 = c(epochSecond2, zoneOffset);
                    b[] bVarArrB5 = b(iC3);
                    for (int length4 = bVarArrB5.length - 1; length4 >= 0; length4--) {
                        b bVar3 = bVarArrB5[length4];
                        if (epochSecond2 > bVar3.a) {
                            bVar2 = bVar3;
                        }
                    }
                    int i3 = iC3 - 1;
                    if (i3 > c(j2, zoneOffset)) {
                        b[] bVarArrB6 = b(i3);
                        bVar2 = bVarArrB6[bVarArrB6.length - 1];
                    } else {
                        iBinarySearch = Arrays.binarySearch(this.c, epochSecond2);
                        if (iBinarySearch < 0) {
                            iBinarySearch = (-iBinarySearch) - 1;
                        }
                        if (iBinarySearch > 0) {
                            int i4 = iBinarySearch - 1;
                            long j4 = this.c[i4];
                            ZoneOffset[] zoneOffsetArr3 = this.e;
                            bVar2 = new b(j4, zoneOffsetArr3[i4], zoneOffsetArr3[iBinarySearch]);
                        }
                    }
                }
            }
            if (bVar2 != null) {
                return false;
            }
        } else if (this.c.length != 0) {
            return false;
        }
        return true;
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        ZoneOffset[] zoneOffsetArr = this.b;
        return "ZoneRules[currentStandardOffset=" + zoneOffsetArr[zoneOffsetArr.length - 1] + "]";
    }

    public ZoneRules(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public ZoneRules(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {g(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }
}
