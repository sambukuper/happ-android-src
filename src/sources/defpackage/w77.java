package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class w77 extends b3 {
    public long a;
    public mm0 b;

    @Override // defpackage.b3
    public final boolean a(a3 a3Var) {
        u77 u77Var = (u77) a3Var;
        if (this.a >= 0) {
            return false;
        }
        long j = u77Var.k0;
        if (j < u77Var.l0) {
            u77Var.l0 = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.b3
    public final q51[] b(a3 a3Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((u77) a3Var).x(j);
    }
}
