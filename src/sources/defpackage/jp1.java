package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jp1 implements AutoCloseable {
    public final ip1 X;
    public boolean Y;
    public final /* synthetic */ lp1 Z;

    public jp1(lp1 lp1Var, ip1 ip1Var) {
        this.Z = lp1Var;
        this.X = ip1Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.Y) {
            return;
        }
        this.Y = true;
        lp1 lp1Var = this.Z;
        synchronized (lp1Var.j0) {
            ip1 ip1Var = this.X;
            int i = ip1Var.h - 1;
            ip1Var.h = i;
            if (i == 0 && ip1Var.f) {
                lp1Var.R(ip1Var);
            }
        }
    }
}
