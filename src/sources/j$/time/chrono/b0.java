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
public final class b0 extends c {
    private static final long serialVersionUID = 1300372329181994526L;
    public final transient LocalDate a;

    public b0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new d0((byte) 7, this);
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
        return N() >= 1 ? c0.ROC : c0.BEFORE_ROC;
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate I(long j) {
        return Q(this.a.X(j));
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate K(j$.time.temporal.o oVar) {
        return (b0) super.K(oVar);
    }

    public final int N() {
        return this.a.getYear() - 1911;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final b0 b(long j, TemporalField temporalField) {
        int iA;
        int i;
        int i2;
        if (!(temporalField instanceof ChronoField)) {
            return (b0) super.b(j, temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (k(chronoField) == j) {
            return this;
        }
        int[] iArr = a0.a;
        int i3 = iArr[chronoField.ordinal()];
        if (i3 == 4) {
            iA = z.c.v(chronoField).a(j, chronoField);
            i = iArr[chronoField.ordinal()];
            if (i != 4) {
                LocalDate localDate = this.a;
                if (N() >= 1) {
                    i2 = iA + 1911;
                } else {
                    i2 = 1912 - iA;
                }
                return Q(localDate.b0(i2));
            }
            if (i != 6) {
                return Q(this.a.b0(iA + 1911));
            }
            if (i == 7) {
                return Q(this.a.b0(1912 - N()));
            }
        } else {
            if (i3 == 5) {
                z.c.v(chronoField).b(j, chronoField);
                return Q(this.a.V(j - (((((long) N()) * 12) + ((long) this.a.getMonthValue())) - 1)));
            }
            if (i3 == 6 || i3 == 7) {
                iA = z.c.v(chronoField).a(j, chronoField);
                i = iArr[chronoField.ordinal()];
                if (i != 4) {
                    LocalDate localDate2 = this.a;
                    if (N() >= 1) {
                        i2 = iA + 1911;
                    } else {
                        i2 = 1912 - iA;
                    }
                    return Q(localDate2.b0(i2));
                }
                if (i != 6) {
                    return Q(this.a.b0(iA + 1911));
                }
                if (i == 7) {
                    return Q(this.a.b0(1912 - N()));
                }
            }
        }
        return Q(this.a.b(j, temporalField));
    }

    public final b0 Q(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new b0(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate a(long j, j$.time.temporal.q qVar) {
        return (b0) super.a(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate c(long j, j$.time.temporal.q qVar) {
        return (b0) super.c(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    /* JADX INFO: renamed from: e */
    public final j$.time.temporal.l j(LocalDate localDate) {
        return (b0) super.j(localDate);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return this.a.equals(((b0) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final k g() {
        return z.c;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        z.c.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate j(j$.time.temporal.m mVar) {
        return (b0) super.j(mVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.I(this);
        }
        int i = a0.a[((ChronoField) temporalField).ordinal()];
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
        int i = a0.a[chronoField.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.l(temporalField);
        }
        if (i != 4) {
            return z.c.v(chronoField);
        }
        j$.time.temporal.s sVar = ChronoField.YEAR.b;
        return j$.time.temporal.s.f(1L, N() <= 0 ? (-sVar.a) + 1912 : sVar.d - 1911);
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
        return (b0) super.a(j, qVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l c(long j, j$.time.temporal.q qVar) {
        return (b0) super.c(j, qVar);
    }
}
