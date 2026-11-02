package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xa7 extends g24 implements gn2 {
    public final /* synthetic */ long Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ int f0;
    public final /* synthetic */ zr4 g0;
    public final /* synthetic */ eo5 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa7(ya7 ya7Var, long j, int i, int i2, zr4 zr4Var, eo5 eo5Var) {
        super(1);
        this.Y = j;
        this.Z = i;
        this.f0 = i2;
        this.g0 = zr4Var;
        this.h0 = eo5Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        do5 do5Var = (do5) obj;
        long j = (((long) this.Z) << 32) | (((long) this.f0) & 4294967295L);
        z24 layoutDirection = this.g0.getLayoutDirection();
        long j2 = this.Y;
        float f = (((int) (j >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float f2 = (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f;
        float f3 = layoutDirection == z24.X ? -1.0f : (-1.0f) * (-1.0f);
        float f4 = (1.0f - 1.0f) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        do5.g(do5Var, this.h0, (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32));
        return dn8.a;
    }
}
