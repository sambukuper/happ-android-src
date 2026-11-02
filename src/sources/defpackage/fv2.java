package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fv2 implements nr5 {
    public final q8 X;
    public final v30 Y;
    public long Z = 0;

    public fv2(q8 q8Var, v30 v30Var) {
        this.X = q8Var;
        this.Y = v30Var;
    }

    @Override // defpackage.nr5
    public final long x(lf3 lf3Var, long j, z24 z24Var, long j2) {
        long jA = this.Y.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.Z;
        }
        this.Z = jA;
        return hf3.c(hf3.c(lf3Var.c(), nr4.M(jA)), this.X.a(j2, 0L, z24Var));
    }
}
