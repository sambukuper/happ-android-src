package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eo5 {
    public int X;
    public int Y;
    public long Z = 0;
    public long f0 = fo5.b;
    public long g0 = 0;

    public abstract int N(r8 r8Var);

    public int O() {
        return (int) (this.Z & 4294967295L);
    }

    public int P() {
        return (int) (this.Z >> 32);
    }

    public final void Q() {
        this.X = x97.n((int) (this.Z >> 32), q31.j(this.f0), q31.h(this.f0));
        int iN = x97.n((int) (this.Z & 4294967295L), q31.i(this.f0), q31.g(this.f0));
        this.Y = iN;
        int i = this.X;
        long j = this.Z;
        this.g0 = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iN - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void S(long j, float f, gn2 gn2Var);

    public void T(long j, float f, xt2 xt2Var) {
        S(j, f, null);
    }

    public final void V(long j) {
        if (pf3.a(this.Z, j)) {
            return;
        }
        this.Z = j;
        Q();
    }

    public final void Z(long j) {
        if (q31.b(this.f0, j)) {
            return;
        }
        this.f0 = j;
        Q();
    }

    public Object w() {
        return null;
    }
}
