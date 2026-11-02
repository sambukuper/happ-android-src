package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.r;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public final class LocalTime implements j$.time.temporal.l, j$.time.temporal.m, Comparable<LocalTime>, Serializable {
    public static final LocalTime MAX;
    public static final LocalTime MIN;
    public static final LocalTime e;
    public static final LocalTime[] f = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = f;
            if (i >= localTimeArr.length) {
                LocalTime localTime = localTimeArr[0];
                e = localTime;
                LocalTime localTime2 = localTimeArr[12];
                MIN = localTime;
                MAX = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i] = new LocalTime(i, 0, 0, 0);
            i++;
        }
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static LocalTime I(long j) {
        ChronoField.NANO_OF_DAY.P(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return t(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static LocalTime T(DataInput dataInput) throws IOException {
        int i;
        int i2;
        int i3 = dataInput.readByte();
        int i4 = 0;
        if (i3 < 0) {
            i3 = ~i3;
            i2 = 0;
            i = 0;
        } else {
            byte b = dataInput.readByte();
            if (b < 0) {
                int i5 = ~b;
                i = 0;
                i4 = i5;
                i2 = 0;
            } else {
                byte b2 = dataInput.readByte();
                if (b2 < 0) {
                    i2 = ~b2;
                    i = 0;
                    i4 = b;
                } else {
                    i = dataInput.readInt();
                    i4 = b;
                    i2 = b2;
                }
            }
        }
        return of(i3, i4, i2, i);
    }

    public static LocalTime of(int i, int i2, int i3, int i4) {
        ChronoField.HOUR_OF_DAY.P(i);
        ChronoField.MINUTE_OF_HOUR.P(i2);
        ChronoField.SECOND_OF_MINUTE.P(i3);
        ChronoField.NANO_OF_SECOND.P(i4);
        return t(i, i2, i3, i4);
    }

    public static LocalTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.e;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalTime) dateTimeFormatter.parse(charSequence, new e((byte) 2));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static LocalTime t(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? f[i] : new LocalTime(i, i2, i3, i4);
    }

    private Object writeReplace() {
        return new m((byte) 4, this);
    }

    public static LocalTime x(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.d(j$.time.temporal.p.g);
        if (localTime != null) {
            return localTime;
        }
        g.f("Unable to obtain LocalTime from TemporalAccessor: ", temporalAccessor, " of type ", temporalAccessor.getClass().getName());
        return null;
    }

    public final int C(TemporalField temporalField) {
        switch (i.a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                throw new r("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.d / XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax;
            case 4:
                throw new r("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.d / 1000000;
            case 6:
                return (int) (U() / 1000000);
            case 7:
                return this.c;
            case 8:
                return V();
            case 9:
                return this.b;
            case 10:
                return (this.a * 60) + this.b;
            case 11:
                return this.a % 12;
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                int i = this.a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.a;
            case 14:
                byte b = this.a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.a / 12;
            default:
                throw new r(c.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final LocalTime c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (LocalTime) qVar.t(this, j);
        }
        switch (i.b[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return R(j);
            case 2:
                return R((j % 86400000000L) * 1000);
            case 3:
                return R((j % 86400000) * 1000000);
            case 4:
                return S(j);
            case 5:
                return Q(j);
            case 6:
                return P(j);
            case 7:
                return P((j % 2) * 12);
            default:
                g.d("Unsupported unit: ", qVar);
                return null;
        }
    }

    public final LocalTime P(long j) {
        return j == 0 ? this : t(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final LocalTime Q(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return t(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final LocalTime R(long j) {
        if (j != 0) {
            long jU = U();
            long j2 = (((j % 86400000000000L) + jU) + 86400000000000L) % 86400000000000L;
            if (jU != j2) {
                return t((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public final LocalTime S(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return t(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final long U() {
        return (((long) this.c) * 1000000000) + (((long) this.b) * 60000000000L) + (((long) this.a) * 3600000000000L) + ((long) this.d);
    }

    public final int V() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalTime b(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalTime) temporalField.N(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.P(j);
        switch (i.a[chronoField.ordinal()]) {
            case 1:
                return X((int) j);
            case 2:
                return I(j);
            case 3:
                return X(((int) j) * XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax);
            case 4:
                return I(j * 1000);
            case 5:
                return X(((int) j) * 1000000);
            case 6:
                return I(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.c != i) {
                    ChronoField.SECOND_OF_MINUTE.P(i);
                    return t(this.a, this.b, i, this.d);
                }
                return this;
            case 8:
                return S(j - ((long) V()));
            case 9:
                int i2 = (int) j;
                if (this.b != i2) {
                    ChronoField.MINUTE_OF_HOUR.P(i2);
                    return t(this.a, i2, this.c, this.d);
                }
                return this;
            case 10:
                return Q(j - ((long) ((this.a * 60) + this.b)));
            case 11:
                return P(j - ((long) (this.a % 12)));
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                if (j == 12) {
                    j = 0;
                }
                return P(j - ((long) (this.a % 12)));
            case 13:
                int i3 = (int) j;
                if (this.a != i3) {
                    ChronoField.HOUR_OF_DAY.P(i3);
                    return t(i3, this.b, this.c, this.d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.a != i4) {
                    ChronoField.HOUR_OF_DAY.P(i4);
                    return t(i4, this.b, this.c, this.d);
                }
                return this;
            case 15:
                return P((j - ((long) (this.a / 12))) * 12);
            default:
                throw new r(c.a("Unsupported field: ", temporalField));
        }
    }

    public final LocalTime X(int i) {
        if (this.d == i) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.P(i);
        return t(this.a, this.b, this.c, i);
    }

    public final void Y(DataOutput dataOutput) throws IOException {
        if (this.d != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(this.c);
            dataOutput.writeInt(this.d);
            return;
        }
        if (this.c != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(~this.c);
            return;
        }
        byte b = this.b;
        byte b2 = this.a;
        if (b == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~this.b);
        }
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j, j$.time.temporal.q qVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = c(Long.MAX_VALUE, qVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.c(j2, qVar);
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.a, localTime.a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.b, localTime.b)) == 0 && (iCompare = Integer.compare(this.c, localTime.c)) == 0) ? Integer.compare(this.d, localTime.d) : iCompare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.b || temporalQuery == j$.time.temporal.p.a || temporalQuery == j$.time.temporal.p.e || temporalQuery == j$.time.temporal.p.d) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.p.g) {
            return this;
        }
        if (temporalQuery == j$.time.temporal.p.f) {
            return null;
        }
        return temporalQuery == j$.time.temporal.p.c ? j$.time.temporal.a.NANOS : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: e */
    public final j$.time.temporal.l j(LocalDate localDate) {
        return (LocalTime) localDate.f(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l f(j$.time.temporal.l lVar) {
        return lVar.b(U(), ChronoField.NANO_OF_DAY);
    }

    public int getHour() {
        return this.a;
    }

    public int getMinute() {
        return this.b;
    }

    public int getNano() {
        return this.d;
    }

    public int getSecond() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? C(temporalField) : super.h(temporalField);
    }

    public int hashCode() {
        long jU = U();
        return (int) (jU ^ (jU >>> 32));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).Q();
        }
        return temporalField != null && temporalField.t(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.I(this);
        }
        if (temporalField == ChronoField.NANO_OF_DAY) {
            return U();
        }
        return temporalField == ChronoField.MICRO_OF_DAY ? U() / 1000 : C(temporalField);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        byte b2 = this.b;
        byte b3 = this.c;
        int i = this.d;
        sb.append(b < 10 ? "0" : _UrlKt.FRAGMENT_ENCODE_SET);
        sb.append((int) b);
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax).substring(1));
                } else if (i % XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax == 0) {
                    sb.append(Integer.toString((i / XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + Http2Connection.DEGRADED_PONG_TIMEOUT_NS).substring(1));
                }
            }
        }
        return sb.toString();
    }
}
