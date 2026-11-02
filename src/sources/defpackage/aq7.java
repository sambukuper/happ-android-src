package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class aq7 implements u85, cq7 {
    public final k01 X;
    public final aq7 Y;
    public iv5 Z;
    public long f0;

    public aq7(aq7 aq7Var, boolean z) {
        this.f0 = Long.MIN_VALUE;
        this.Y = aq7Var;
        this.X = (!z || aq7Var == null) ? new k01((byte) 1) : aq7Var.X;
    }

    @Override // defpackage.cq7
    public final boolean a() {
        return this.X.Y;
    }

    @Override // defpackage.cq7
    public final void c() {
        this.X.c();
    }

    public final void e(long j) {
        if (j < 0) {
            bt.q(ie2.f(j, "number requested cannot be negative: "));
            return;
        }
        synchronized (this) {
            iv5 iv5Var = this.Z;
            if (iv5Var != null) {
                iv5Var.request(j);
                return;
            }
            long j2 = this.f0;
            if (j2 == Long.MIN_VALUE) {
                this.f0 = j;
            } else {
                long j3 = j2 + j;
                if (j3 < 0) {
                    this.f0 = Long.MAX_VALUE;
                } else {
                    this.f0 = j3;
                }
            }
        }
    }

    public void f(iv5 iv5Var) {
        long j;
        aq7 aq7Var;
        boolean z;
        synchronized (this) {
            j = this.f0;
            this.Z = iv5Var;
            aq7Var = this.Y;
            z = aq7Var != null && j == Long.MIN_VALUE;
        }
        if (z) {
            aq7Var.f(iv5Var);
        } else if (j == Long.MIN_VALUE) {
            iv5Var.request(Long.MAX_VALUE);
        } else {
            iv5Var.request(j);
        }
    }

    public void d() {
    }

    public aq7() {
        this(null, false);
    }
}
