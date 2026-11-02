package io.sentry;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x6 implements i0 {
    public final String a;
    public final String b;

    public x6() {
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.a = property;
        this.b = property2;
    }

    @Override // io.sentry.i0
    public final j5 b(j5 j5Var, n0 n0Var) {
        d(j5Var);
        return j5Var;
    }

    @Override // io.sentry.i0
    public final io.sentry.protocol.f0 c(io.sentry.protocol.f0 f0Var, n0 n0Var) {
        d(f0Var);
        return f0Var;
    }

    public final void d(y4 y4Var) {
        io.sentry.protocol.e eVar = y4Var.Y;
        if (eVar.i() == null) {
            eVar.v(new io.sentry.protocol.y());
        }
        io.sentry.protocol.y yVarI = eVar.i();
        if (yVarI != null && yVarI.X == null && yVarI.Y == null) {
            yVarI.X = this.b;
            yVarI.Y = this.a;
        }
    }
}
