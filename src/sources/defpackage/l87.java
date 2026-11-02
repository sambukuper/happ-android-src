package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l87 implements t25 {
    public final /* synthetic */ o87 X;
    public final /* synthetic */ gn2 Y;

    public l87(o87 o87Var, gn2 gn2Var) {
        this.X = o87Var;
        this.Y = gn2Var;
    }

    @Override // defpackage.t25
    public final Object B(long j, long j2, q51 q51Var) {
        this.Y.B(new Float(tu8.c(j2)));
        return new tu8(j2);
    }

    @Override // defpackage.t25
    public final long N(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        t5 t5Var = this.X.d;
        float fE = t5Var.e(fIntBitsToFloat);
        nh5 nh5Var = (nh5) t5Var.k0;
        float fL = Float.isNaN(nh5Var.l()) ? 0.0f : nh5Var.l();
        nh5Var.m(fE);
        return a(fE - fL);
    }

    public final long a(float f) {
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    @Override // defpackage.t25
    public final long s0(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        t5 t5Var = this.X.d;
        float fE = t5Var.e(Float.intBitsToFloat((int) (4294967295L & j2)));
        nh5 nh5Var = (nh5) t5Var.k0;
        float fL = Float.isNaN(nh5Var.l()) ? 0.0f : nh5Var.l();
        nh5Var.m(fE);
        return a(fE - fL);
    }

    @Override // defpackage.t25
    public final Object z0(long j, q51 q51Var) {
        float fC = tu8.c(j);
        o87 o87Var = this.X;
        float f = o87Var.d.f();
        float fC2 = o87Var.d.d().c();
        if (fC >= 0.0f || f <= fC2) {
            j = 0;
        } else {
            this.Y.B(new Float(fC));
        }
        return new tu8(j);
    }
}
