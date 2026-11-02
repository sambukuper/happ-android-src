package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends c {
    private static final long serialVersionUID = -8722293800195731463L;
    public final transient LocalDate a;

    public h0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new d0((byte) 8, this);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate C(long j) {
        return Q(this.a.V(j));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime F(LocalTime localTime) {
        return new e(this, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final l H() {
        return N() >= 1 ? i0.BE : i0.BEFORE_BE;
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate I(long j) {
        return Q(this.a.X(j));
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate K(j$.time.temporal.o oVar) {
        return (h0) super.K(oVar);
    }

    public final int N() {
        return this.a.getYear() + 543;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final h0 b(long j, TemporalField temporalField) {
        int iA;
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return (h0) super.b(j, temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (k(chronoField) == j) {
            return this;
        }
        int[] iArr = g0.a;
        int i2 = iArr[chronoField.ordinal()];
        if (i2 == 4) {
            iA = f0.c.v(chronoField).a(j, chronoField);
            i = iArr[chronoField.ordinal()];
            if (i != 4) {
                LocalDate localDate = this.a;
                if (N() < 1) {
                    iA = 1 - iA;
                }
                return Q(localDate.b0(iA - 543));
            }
            if (i != 6) {
                return Q(this.a.b0(iA - 543));
            }
            if (i == 7) {
                return Q(this.a.b0((-542) - N()));
            }
        } else {
            if (i2 == 5) {
                f0.c.v(chronoField).b(j, chronoField);
                return Q(this.a.V(j - (((((long) N()) * 12) + ((long) this.a.getMonthValue())) - 1)));
            }
            if (i2 == 6 || i2 == 7) {
                iA = f0.c.v(chronoField).a(j, chronoField);
                i = iArr[chronoField.ordinal()];
                if (i != 4) {
                    LocalDate localDate2 = this.a;
                    if (N() < 1) {
                        iA = 1 - iA;
                    }
                    return Q(localDate2.b0(iA - 543));
                }
                if (i != 6) {
                    return Q(this.a.b0(iA - 543));
                }
                if (i == 7) {
                    return Q(this.a.b0((-542) - N()));
                }
            }
        }
        return Q(this.a.b(j, temporalField));
    }

    public final h0 Q(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new h0(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate a(long j, j$.time.temporal.q qVar) {
        return (h0) super.a(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate c(long j, j$.time.temporal.q qVar) {
        return (h0) super.c(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    /* JADX INFO: renamed from: e */
    public final j$.time.temporal.l j(LocalDate localDate) {
        return (h0) super.j(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            return this.a.equals(((h0) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final k g() {
        return f0.c;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        f0.c.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate j(j$.time.temporal.m mVar) {
        return (h0) super.j(mVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.I(this);
        }
        int i = g0.a[((ChronoField) temporalField).ordinal()];
        if (i == 4) {
            int iN = N();
            if (iN < 1) {
                iN = 1 - iN;
            }
            return iN;
        }
        if (i == 5) {
            return ((((long) N()) * 12) + ((long) this.a.getMonthValue())) - 1;
        }
        if (i == 6) {
            return N();
        }
        if (i != 7) {
            return this.a.k(temporalField);
        }
        return N() < 1 ? 0 : 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        if (!i(temporalField)) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", temporalField));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = g0.a[chronoField.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.l(temporalField);
        }
        if (i != 4) {
            return f0.c.v(chronoField);
        }
        j$.time.temporal.s sVar = ChronoField.YEAR.b;
        return j$.time.temporal.s.f(1L, N() <= 0 ? (-(sVar.a + 543)) + 1 : sVar.d + 543);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate x(long j) {
        return Q(this.a.U(j));
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l a(long j, j$.time.temporal.q qVar) {
        return (h0) super.a(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.q qVar) {
        return (h0) super.c(j, qVar);
    }
}
