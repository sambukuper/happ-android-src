package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kx1 implements ow3 {
    public static final kx1 a = new kx1();
    public static final bu5 b = new bu5("kotlin.time.Duration", zt5.U);

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        long j = ((gx1) obj).X;
        be beVar = gx1.Y;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jK = j < 0 ? gx1.k(j) : j;
        long j2 = gx1.j(jK, lx1.HOURS);
        int iE = gx1.e(jK);
        int iG = gx1.g(jK);
        int iF = gx1.f(jK);
        if (gx1.h(j)) {
            j2 = 9999999999999L;
        }
        boolean z = false;
        boolean z2 = j2 != 0;
        boolean z3 = (iG == 0 && iF == 0) ? false : true;
        if (iE != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(j2);
            sb.append('H');
        }
        if (z) {
            sb.append(iE);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            gx1.b(sb, iG, iF, 9, "S", true);
        }
        ol7Var.t(sb.toString());
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        be beVar = gx1.Y;
        String strS = rd1Var.s();
        strS.getClass();
        try {
            long jY = vj8.Y(strS);
            if (jY == gx1.g0) {
                throw new IllegalStateException("invariant failed");
            }
            return new gx1(jY);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(pc6.p("Invalid ISO duration string format: '", strS, "'."), e);
        }
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return b;
    }
}
