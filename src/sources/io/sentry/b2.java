package io.sentry;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b2 implements e2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ m2 Y;

    public /* synthetic */ b2(k2 k2Var, m2 m2Var) {
        this.X = (byte) 1;
        this.Y = m2Var;
    }

    @Override // io.sentry.e2
    public final Object b() {
        byte b = this.X;
        m2 m2Var = this.Y;
        switch (b) {
            case 0:
                return m2Var.r();
            case 1:
                double dNextDouble = m2Var.nextDouble();
                int i = (int) dNextDouble;
                return ((double) i) == dNextDouble ? Integer.valueOf(i) : Double.valueOf(dNextDouble);
            default:
                return Boolean.valueOf(m2Var.m());
        }
    }

    public /* synthetic */ b2(m2 m2Var, byte b) {
        this.X = b;
        this.Y = m2Var;
    }
}
