package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ky6 implements t25 {
    public final sy6 X;
    public boolean Y;

    public ky6(sy6 sy6Var, boolean z) {
        this.X = sy6Var;
        this.Y = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.t25
    public final Object B(long j, long j2, q51 q51Var) throws Throwable {
        jy6 jy6Var;
        long jD;
        if (q51Var instanceof jy6) {
            jy6Var = (jy6) q51Var;
            int i = jy6Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                jy6Var.i0 = i - Integer.MIN_VALUE;
            } else {
                jy6Var = new jy6(this, (s51) q51Var);
            }
        } else {
            jy6Var = new jy6(this, (s51) q51Var);
        }
        Object objA = jy6Var.g0;
        int i2 = jy6Var.i0;
        if (i2 == 0) {
            w39.n0(objA);
            jD = 0;
            if (this.Y) {
                sy6 sy6Var = this.X;
                if (!sy6Var.i) {
                    jy6Var.f0 = j2;
                    jy6Var.i0 = 1;
                    objA = sy6Var.a(j2, jy6Var);
                    c71 c71Var = c71.X;
                    if (objA == c71Var) {
                        return c71Var;
                    }
                }
                jD = tu8.d(j2, jD);
            }
            return new tu8(jD);
        }
        if (i2 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = jy6Var.f0;
        w39.n0(objA);
        jD = ((tu8) objA).a;
        jD = tu8.d(j2, jD);
        return new tu8(jD);
    }

    @Override // defpackage.t25
    public final long s0(int i, long j, long j2) {
        if (!this.Y) {
            return 0L;
        }
        sy6 sy6Var = this.X;
        if (sy6Var.a.b()) {
            return 0L;
        }
        return sy6Var.i(sy6Var.e(sy6Var.a.n(sy6Var.e(sy6Var.h(j2)))));
    }
}
