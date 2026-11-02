package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s77 implements gq1 {
    public final u77 X;
    public final long Y;
    public final Object Z;
    public final mm0 f0;

    public s77(u77 u77Var, long j, Object obj, mm0 mm0Var) {
        this.X = u77Var;
        this.Y = j;
        this.Z = obj;
        this.f0 = mm0Var;
    }

    @Override // defpackage.gq1
    public final void a() {
        u77 u77Var = this.X;
        synchronized (u77Var) {
            if (this.Y >= u77Var.r()) {
                Object[] objArr = u77Var.j0;
                objArr.getClass();
                long j = this.Y;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    v77.d(objArr, j, v77.a);
                    u77Var.m();
                }
            }
        }
    }
}
