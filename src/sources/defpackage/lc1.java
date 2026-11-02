package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lc1 extends hc1 {
    public static final kc1 Companion = new kc1();
    public final int b;

    public lc1(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        em7.c(ie2.h("Unit duration must be positive, but was ", i, " months."));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lc1) {
            return this.b == ((lc1) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ 131072;
    }

    public final String toString() {
        int i = this.b;
        if (i % 1200 == 0) {
            return oc1.a(i / 1200, "CENTURY");
        }
        if (i % 12 == 0) {
            return oc1.a(i / 12, "YEAR");
        }
        return i % 3 == 0 ? oc1.a(i / 3, "QUARTER") : oc1.a(i, "MONTH");
    }
}
