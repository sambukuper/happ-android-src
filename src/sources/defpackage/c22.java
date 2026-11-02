package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c22 extends g24 implements gn2 {
    public final /* synthetic */ f22 Y;
    public final /* synthetic */ lh7 Z;
    public final /* synthetic */ long f0;
    public final /* synthetic */ long g0;
    public final /* synthetic */ eo5 h0;
    public final /* synthetic */ long i0;
    public final /* synthetic */ x12 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c22(f22 f22Var, rd8 rd8Var, long j, long j2, long j3, eo5 eo5Var, long j4, x12 x12Var) {
        super(1);
        this.Y = f22Var;
        this.Z = rd8Var;
        this.f0 = j2;
        this.g0 = j3;
        this.h0 = eo5Var;
        this.i0 = j4;
        this.j0 = x12Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        do5 do5Var = (do5) obj;
        f22 f22Var = this.Y;
        x77 x77Var = f22Var.x0;
        long jA = 0;
        lh7 lh7Var = this.Z;
        long j = lh7Var != null ? ((hf3) lh7Var.getValue()).a : 0L;
        x77Var.b();
        x77Var.b();
        long jC = hf3.c(j, 0L);
        if (x77Var.b()) {
            x77Var.i = jC;
        }
        q8 q8Var = f22Var.B0;
        if (q8Var != null) {
            jA = q8Var.a(this.f0, this.g0, z24.X);
        }
        long jC2 = hf3.c(jA, jC);
        long j2 = this.i0;
        eo5 eo5Var = this.h0;
        do5Var.d(eo5Var);
        eo5Var.S(hf3.c((((long) (((int) (jC2 >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (jC2 & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), eo5Var.g0), 0.0f, this.j0);
        return dn8.a;
    }
}
