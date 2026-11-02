package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bp4 implements nr5 {
    public final wl6 X;
    public pf3 Y;
    public z24 Z;
    public pf3 f0;
    public hf3 g0;

    public bp4(wl6 wl6Var) {
        this.X = wl6Var;
    }

    @Override // defpackage.nr5
    public final long x(lf3 lf3Var, long j, z24 z24Var, long j2) {
        hf3 hf3Var = this.g0;
        if (hf3Var != null) {
            pf3 pf3Var = this.Y;
            if ((pf3Var == null ? false : pf3.a(pf3Var.a, j)) && this.Z == z24Var) {
                pf3 pf3Var2 = this.f0;
                if (pf3Var2 != null ? pf3.a(pf3Var2.a, j2) : false) {
                    return hf3Var.a;
                }
            }
        }
        long jX = this.X.x(lf3Var, j, z24Var, j2);
        this.Y = new pf3(j);
        this.Z = z24Var;
        this.f0 = new pf3(j2);
        this.g0 = new hf3(jX);
        return jX;
    }
}
