package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fz4 {
    public static final long a = eu7.g(14);

    public static final long a(long j, long j2) {
        if (!v88.d(j2)) {
            bt.q(pc6.p("The multiplier must be in em, but was ", v88.e(j2), "."));
            return 0L;
        }
        if (v88.d(j)) {
            bt.i(pc6.p("Cannot convert Em to Px when style.fontSize is Em (", v88.e(j2), "). Please declare the style.fontSize with Sp units instead."));
            return 0L;
        }
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            float fC = v88.c(j2);
            eu7.c(j);
            return eu7.i(v88.c(j) * fC, j3);
        }
        float fC2 = v88.c(j2);
        long j4 = a;
        eu7.c(j4);
        return eu7.i(v88.c(j4) * fC2, 1095216660480L & j4);
    }
}
