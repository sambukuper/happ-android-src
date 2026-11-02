package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class an0 implements me6, dt2 {
    public final long X;
    public final sv Y;
    public ht2 Z;

    public an0(long j) {
        this.X = j;
        if (j <= 0) {
            bt.q("Failed requirement.");
            throw null;
        }
        sv svVar = new sv();
        svVar.a = 0L;
        this.Y = svVar;
    }

    @Override // defpackage.me6
    public final void Y(te6 te6Var, long j, de deVar) {
        long j2;
        long j3;
        sv svVar = this.Y;
        do {
            j2 = svVar.a;
            j3 = j2 != -1 ? 1 + j2 : -1L;
        } while (!iu.a.compareAndSwapLong(svVar, sv.c, j2, j3));
        if (j3 == this.X) {
            Objects.toString(this.Z);
            ht2 ht2Var = this.Z;
            ht2Var.getClass();
            ht2Var.U(true);
        }
    }

    @Override // defpackage.dt2
    public final void a() {
        long j;
        sv svVar = this.Y;
        do {
            j = svVar.a;
        } while (!iu.a.compareAndSwapLong(svVar, sv.c, j, j != -1 ? 0L : -1L));
        ht2 ht2Var = this.Z;
        ht2Var.getClass();
        ht2Var.U(false);
        ht2 ht2Var2 = this.Z;
        ht2Var2.getClass();
        ht2Var2.toString();
    }

    @Override // defpackage.dt2
    public final void b() {
        this.Y.a = -1L;
        ht2 ht2Var = this.Z;
        ht2Var.getClass();
        ht2Var.U(false);
    }

    @Override // defpackage.dt2
    public final void c() {
    }
}
