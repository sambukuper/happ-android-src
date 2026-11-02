package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dd7 {
    public id7 a;
    public long b;
    public boolean c;
    public int d;

    public dd7(long j, id7 id7Var) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = id7Var;
        this.b = j;
        zx6 zx6Var = kd7.a;
        if (j != 0) {
            id7 id7VarD = d();
            long j2 = id7VarD.Z;
            long[] jArr = id7VarD.f0;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = id7VarD.Y;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = id7VarD.X;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (kd7.c) {
                iA = kd7.f.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(dd7 dd7Var) {
        kd7.b.A(dd7Var);
    }

    public final void a() {
        synchronized (kd7.c) {
            b();
            p();
        }
    }

    public void b() {
        kd7.d = kd7.d.b(g());
    }

    public abstract void c();

    public id7 d() {
        return this.a;
    }

    public abstract gn2 e();

    public boolean f() {
        return false;
    }

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public gn2 i() {
        return null;
    }

    public final dd7 j() {
        f63 f63Var = kd7.b;
        dd7 dd7Var = (dd7) f63Var.get();
        f63Var.A(this);
        return dd7Var;
    }

    public void k() {
        z91.S();
        throw null;
    }

    public void l() {
        z91.S();
        throw null;
    }

    public void n(yh7 yh7Var) {
        zx6 zx6Var = kd7.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            kd7.t(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(id7 id7Var) {
        this.a = id7Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract dd7 u(gn2 gn2Var);

    public void m() {
    }
}
