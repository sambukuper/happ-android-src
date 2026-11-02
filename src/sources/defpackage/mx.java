package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mx {
    public final long a;
    public final long b;
    public final long c;

    public mx(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        long j4 = v88.c;
        if (v88.a(j, j4)) {
            bt.q("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
            throw null;
        }
        if (v88.a(j2, j4)) {
            bt.q("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
            throw null;
        }
        if (v88.a(j3, j4)) {
            bt.q("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
            throw null;
        }
        if (w88.a(v88.b(j), v88.b(j2))) {
            eu7.d(j, j2);
            if (Float.compare(v88.c(j), v88.c(j2)) > 0) {
                this.a = j2;
                j = j2;
            }
        }
        if (w88.a(v88.b(j3), 4294967296L)) {
            long jI = eu7.i(1.0E-4f, 4294967296L);
            eu7.d(j3, jI);
            if (Float.compare(v88.c(j3), v88.c(jI)) < 0) {
                bt.q("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
                throw null;
            }
        }
        if (v88.c(j) < 0.0f) {
            bt.q("AutoSize.StepBased: minFontSize must not be negative");
            throw null;
        }
        if (v88.c(j2) >= 0.0f) {
            return;
        }
        bt.q("AutoSize.StepBased: maxFontSize must not be negative");
        throw null;
    }

    public static boolean a(x78 x78Var) {
        bz4 bz4Var = x78Var.b;
        long j = x78Var.c;
        int i = x78Var.a.f;
        if (i == 1 || i == 3) {
            return ((float) ((int) (j >> 32))) < bz4Var.d || x78Var.d();
        }
        if (i != 4 && i != 5 && i != 2) {
            bt.q(pc6.p("TextOverflow type ", gs8.o(i), " is not supported."));
            return false;
        }
        int i2 = bz4Var.f;
        if (i2 != 0) {
            if (i2 == 1) {
                return x78Var.l(0);
            }
            if (i == 4 || i == 5) {
                return ((float) ((int) (j >> 32))) < bz4Var.d || x78Var.d();
            }
            if (i == 2) {
                return x78Var.l(i2 - 1);
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof mx)) {
            return false;
        }
        mx mxVar = (mx) obj;
        return v88.a(mxVar.a, this.a) && v88.a(mxVar.b, this.b) && v88.a(mxVar.c, this.c);
    }

    public final int hashCode() {
        w88[] w88VarArr = v88.b;
        return Long.hashCode(this.c) + p61.g(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
