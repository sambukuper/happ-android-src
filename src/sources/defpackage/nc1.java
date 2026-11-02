package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nc1 extends oc1 {
    public static final mc1 Companion = new mc1();
    public final long b;
    public final String c;
    public final long d;

    public nc1(long j) {
        this.b = j;
        if (j <= 0) {
            b61.j("Unit duration must be positive, but was ", j, " ns.");
            throw null;
        }
        if (j % 3600000000000L == 0) {
            this.c = "HOUR";
            this.d = j / 3600000000000L;
            return;
        }
        if (j % 60000000000L == 0) {
            this.c = "MINUTE";
            this.d = j / 60000000000L;
            return;
        }
        if (j % 1000000000 == 0) {
            this.c = "SECOND";
            this.d = j / 1000000000;
        } else if (j % 1000000 == 0) {
            this.c = "MILLISECOND";
            this.d = j / 1000000;
        } else if (j % 1000 == 0) {
            this.c = "MICROSECOND";
            this.d = j / 1000;
        } else {
            this.c = "NANOSECOND";
            this.d = j;
        }
    }

    public final nc1 b(int i) {
        return new nc1(Math.multiplyExact(this.b, i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nc1) {
            return this.b == ((nc1) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) j) ^ ((int) (j >> 32));
    }

    public final String toString() {
        String str = this.c;
        str.getClass();
        long j = this.d;
        if (j == 1) {
            return str;
        }
        return j + '-' + str;
    }
}
