package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kj extends xg3 {
    public long A0;
    public sd8 r0;
    public y05 s0;
    public lj t0;
    public eo5 u0;
    public eo5 v0;
    public long w0;
    public long x0;
    public final ij y0;
    public final ij z0;

    public kj(sd8 sd8Var, y05 y05Var, lj ljVar) {
        super((byte) 1);
        this.r0 = sd8Var;
        this.s0 = y05Var;
        this.t0 = ljVar;
        this.w0 = 0L;
        this.x0 = 0L;
        this.y0 = new ij(this, (byte) 1);
        this.z0 = new ij(this, (byte) 0);
        this.A0 = -9223372034707292160L;
    }

    @Override // defpackage.xg3, defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        long j2;
        eo5 eo5VarO = tr4Var.o(j);
        if (zr4Var.c0()) {
            j2 = (((long) eo5VarO.X) << 32) | (((long) eo5VarO.Y) & 4294967295L);
        } else {
            sd8 sd8Var = this.r0;
            int i = eo5VarO.X;
            if (sd8Var == null) {
                j2 = (((long) i) << 32) | (((long) eo5VarO.Y) & 4294967295L);
                this.A0 = j2;
            } else {
                long j3 = (((long) eo5VarO.Y) & 4294967295L) | (((long) i) << 32);
                rd8 rd8VarA = sd8Var.a(new jj(this, j3, (byte) 0), null, null, new jj(this, j3, (byte) 1));
                j2 = ((pf3) rd8VarA.getValue()).a;
                this.A0 = ((pf3) rd8VarA.getValue()).a;
            }
        }
        boolean zC0 = zr4Var.c0();
        e02 e02Var = e02.X;
        if (zC0) {
            this.u0 = eo5VarO;
            this.w0 = j2;
            return zr4Var.g0((int) (j2 >> 32), (int) (j2 & 4294967295L), e02Var, this.y0);
        }
        this.v0 = eo5VarO;
        this.x0 = j2;
        return zr4Var.g0((int) (j2 >> 32), (int) (j2 & 4294967295L), e02Var, this.z0);
    }

    @Override // defpackage.jx4
    public final void S0() {
        this.A0 = -9223372034707292160L;
    }
}
