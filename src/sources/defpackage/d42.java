package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d42 extends u61 {
    public static final /* synthetic */ int h0 = 0;
    public long Z;
    public boolean f0;
    public kt g0;

    @Override // defpackage.u61
    public final u61 c1(int i) {
        z51.r(i);
        return this;
    }

    public final void d1(boolean z) {
        long j = this.Z - (z ? 4294967296L : 1L);
        this.Z = j;
        if (j <= 0 && this.f0) {
            shutdown();
        }
    }

    public final void e1(qp1 qp1Var) {
        kt ktVar = this.g0;
        if (ktVar == null) {
            ktVar = new kt();
            this.g0 = ktVar;
        }
        ktVar.addLast(qp1Var);
    }

    public final void f1(boolean z) {
        this.Z = (z ? 4294967296L : 1L) + this.Z;
        if (z) {
            return;
        }
        this.f0 = true;
    }

    public abstract long g1();

    public final boolean h1() {
        kt ktVar = this.g0;
        if (ktVar == null) {
            return false;
        }
        qp1 qp1Var = (qp1) (ktVar.isEmpty() ? null : ktVar.removeFirst());
        if (qp1Var == null) {
            return false;
        }
        qp1Var.run();
        return true;
    }

    public abstract void shutdown();
}
