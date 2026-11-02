package j$.time.chrono;

import j$.time.temporal.ChronoField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements j$.time.temporal.o, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final k a;
    public final int b;
    public final int c;
    public final int d;

    static {
        j$.time.b.a(new Object[]{j$.time.temporal.a.YEARS, j$.time.temporal.a.MONTHS, j$.time.temporal.a.DAYS});
    }

    public f(k kVar, int i, int i2, int i3) {
        this.a = kVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.a.equals(fVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.l t(ChronoLocalDate chronoLocalDate) {
        j$.time.temporal.l lVarC;
        k kVar = (k) chronoLocalDate.d(j$.time.temporal.p.b);
        if (kVar != null && !this.a.equals(kVar)) {
            j$.time.g.f("Chronology mismatch, expected: ", this.a.getId(), ", actual: ", kVar.getId());
            return null;
        }
        if (this.c == 0) {
            int i = this.b;
            if (i != 0) {
                lVarC = chronoLocalDate;
                lVarC = chronoLocalDate.c(i, (j$.time.temporal.q) j$.time.temporal.a.YEARS);
            }
        } else {
            j$.time.temporal.s sVarV = this.a.v(ChronoField.MONTH_OF_YEAR);
            long j = (sVarV.a == sVarV.b && sVarV.c == sVarV.d && sVarV.d()) ? (sVarV.d - sVarV.a) + 1 : -1L;
            int i2 = this.b;
            ChronoLocalDate chronoLocalDateC = chronoLocalDate;
            if (j > 0) {
                lVarC = chronoLocalDate.c((((long) i2) * j) + ((long) this.c), (j$.time.temporal.q) j$.time.temporal.a.MONTHS);
            } else {
                if (i2 != 0) {
                    chronoLocalDateC = chronoLocalDate.c(i2, (j$.time.temporal.q) j$.time.temporal.a.YEARS);
                }
                lVarC = chronoLocalDateC.c(this.c, (j$.time.temporal.q) j$.time.temporal.a.MONTHS);
            }
        }
        lVarC = chronoLocalDate;
        int i3 = this.d;
        return i3 != 0 ? lVarC.c(i3, j$.time.temporal.a.DAYS) : lVarC;
    }

    public final String toString() {
        if (this.b == 0 && this.c == 0 && this.d == 0) {
            return this.a.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        sb.append(" P");
        int i = this.b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    public Object writeReplace() {
        return new d0((byte) 9, this);
    }
}
