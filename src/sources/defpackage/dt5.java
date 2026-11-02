package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dt5 implements fi1 {
    public final /* synthetic */ fi1 X;
    public boolean Y;
    public boolean Z;
    public final q15 f0 = new q15(false);

    public dt5(fi1 fi1Var) {
        this.X = fi1Var;
    }

    @Override // defpackage.fi1
    public final float A(long j) {
        return this.X.A(j);
    }

    @Override // defpackage.fi1
    public final long D0(long j) {
        return this.X.D0(j);
    }

    @Override // defpackage.fi1
    public final float G0(long j) {
        return this.X.G0(j);
    }

    @Override // defpackage.fi1
    public final long M(float f) {
        return this.X.M(f);
    }

    @Override // defpackage.fi1
    public final float R(int i) {
        return this.X.R(i);
    }

    @Override // defpackage.fi1
    public final float W(float f) {
        return this.X.W(f);
    }

    public final void a() {
        this.Z = true;
        q15 q15Var = this.f0;
        if (q15Var.k()) {
            q15Var.m(null);
        }
    }

    public final void b() {
        this.Y = true;
        q15 q15Var = this.f0;
        if (q15Var.k()) {
            q15Var.m(null);
        }
    }

    @Override // defpackage.fi1
    public final float b0() {
        return this.X.b0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(s51 s51Var) {
        bt5 bt5Var;
        if (s51Var instanceof bt5) {
            bt5Var = (bt5) s51Var;
            int i = bt5Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                bt5Var.h0 = i - Integer.MIN_VALUE;
            } else {
                bt5Var = new bt5(this, s51Var);
            }
        } else {
            bt5Var = new bt5(this, s51Var);
        }
        Object obj = bt5Var.f0;
        int i2 = bt5Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            bt5Var.h0 = 1;
            Object objG = this.f0.g(bt5Var);
            c71 c71Var = c71.X;
            if (objG == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        this.Y = false;
        this.Z = false;
        return dn8.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(s51 s51Var) {
        ct5 ct5Var;
        if (s51Var instanceof ct5) {
            ct5Var = (ct5) s51Var;
            int i = ct5Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ct5Var.h0 = i - Integer.MIN_VALUE;
            } else {
                ct5Var = new ct5(this, s51Var);
            }
        } else {
            ct5Var = new ct5(this, s51Var);
        }
        Object obj = ct5Var.f0;
        int i2 = ct5Var.h0;
        q15 q15Var = this.f0;
        if (i2 == 0) {
            w39.n0(obj);
            if (!this.Y && !this.Z) {
                ct5Var.h0 = 1;
                Object objG = q15Var.g(ct5Var);
                c71 c71Var = c71.X;
                if (objG == c71Var) {
                    return c71Var;
                }
            }
            return Boolean.valueOf(this.Y);
        }
        if (i2 != 1) {
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj);
        q15Var.m(null);
        return Boolean.valueOf(this.Y);
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        return this.X.getDensity();
    }

    @Override // defpackage.fi1
    public final float h0(float f) {
        return this.X.h0(f);
    }

    @Override // defpackage.fi1
    public final long q(float f) {
        return this.X.q(f);
    }

    @Override // defpackage.fi1
    public final long r(long j) {
        return this.X.r(j);
    }

    @Override // defpackage.fi1
    public final int x0(float f) {
        return this.X.x0(f);
    }
}
