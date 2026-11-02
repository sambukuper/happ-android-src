package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y78 {
    public final u58 a;
    public final u58 b;
    public final rh5 c;
    public final rh5 d;
    public final rh5 e;
    public final rh5 f;
    public final q80 g;

    public y78() {
        u58 u58Var = new u58();
        this.a = u58Var;
        this.b = u58Var;
        lh4 lh4Var = lh4.i0;
        this.c = new rh5(null, lh4Var);
        this.d = new rh5(null, lh4Var);
        this.e = new rh5(null, lh4Var);
        this.f = z51.H(new kt1(0.0f));
        this.g = new q80();
    }

    public final long a(long j) {
        s86 s86VarH;
        y24 y24VarE = e();
        s86 s86Var = s86.e;
        if (y24VarE != null) {
            if (y24VarE.g()) {
                y24 y24VarB = b();
                s86VarH = y24VarB != null ? y24VarB.H(y24VarE, true) : null;
            } else {
                s86VarH = s86Var;
            }
            if (s86VarH != null) {
                s86Var = s86VarH;
            }
        }
        return ys7.b(j, s86Var);
    }

    public final y24 b() {
        return (y24) this.e.getValue();
    }

    public final x78 c() {
        return (x78) this.b.getValue();
    }

    public final int d(long j, boolean z) {
        x78 x78VarC = c();
        if (x78VarC == null) {
            return -1;
        }
        if (z) {
            j = a(j);
        }
        return x78VarC.b.f(ys7.c(this, j));
    }

    public final y24 e() {
        return (y24) this.c.getValue();
    }

    public final boolean f(long j) {
        x78 x78VarC = c();
        if (x78VarC == null) {
            return false;
        }
        long jC = ys7.c(this, a(j));
        int iD = x78VarC.b.d(Float.intBitsToFloat((int) (4294967295L & jC)));
        int i = (int) (jC >> 32);
        return Float.intBitsToFloat(i) >= x78VarC.f(iD) && Float.intBitsToFloat(i) <= x78VarC.g(iD);
    }
}
