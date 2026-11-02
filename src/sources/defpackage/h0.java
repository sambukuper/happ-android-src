package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements dn2 {
    public final fu6 X;
    public final wb4 Y;
    public final d2 Z;
    public final int f0;
    public final int g0;

    public h0(fu6 fu6Var, wb4 wb4Var, d2 d2Var, int i, int i2) {
        this.X = fu6Var;
        this.Y = wb4Var;
        this.Z = d2Var;
        this.f0 = i;
        this.g0 = i2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    @Override // defpackage.dn2
    public final Object invoke() {
        int size;
        d2 d2Var = this.Z;
        boolean z = d2Var instanceof vy5;
        int i = 0;
        if (z) {
            size = ((vy5) d2Var).q0.size();
        } else {
            size = d2Var instanceof cz5 ? ((cz5) d2Var).q0.size() : 0;
        }
        wb4 wb4Var = this.Y;
        if (z) {
            int i2 = ((vy5) d2Var).Z;
            if ((i2 & 32) == 32 || (i2 & 64) == 64) {
                i = 1;
            }
        } else if (d2Var instanceof cz5) {
            int i3 = ((cz5) d2Var).Z;
            if ((i3 & 32) == 32 || (i3 & 64) == 64) {
                i = 1;
            }
        } else {
            if (!(d2Var instanceof iy5)) {
                throw new UnsupportedOperationException("Unsupported message: " + d2Var.getClass());
            }
            c06 c06Var = (c06) wb4Var;
            if (c06Var.h == ey5.ENUM_CLASS) {
                i = 2;
            } else if (c06Var.i) {
                i = 1;
            }
        }
        return this.X.d0(wb4Var, d2Var, this.f0, size + i + this.g0);
    }
}
