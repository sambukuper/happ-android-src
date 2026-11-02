package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bz7 implements fi1, q51 {
    public final /* synthetic */ cz7 X;
    public final mm0 Y;
    public mm0 Z;
    public bq5 f0 = bq5.Y;
    public final /* synthetic */ cz7 g0;

    public bz7(cz7 cz7Var, mm0 mm0Var) {
        this.g0 = cz7Var;
        this.X = cz7Var;
        this.Y = mm0Var;
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
        return f / this.X.getDensity();
    }

    public final Object a(bq5 bq5Var, r10 r10Var) {
        mm0 mm0Var = new mm0(1, mb6.H(r10Var));
        mm0Var.s();
        this.f0 = bq5Var;
        this.Z = mm0Var;
        return mm0Var.q();
    }

    public final long b() {
        cz7 cz7Var = this.g0;
        long jD0 = cz7Var.D0(yn0.Z(cz7Var).C0.d());
        long j = cz7Var.z0;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jD0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jD0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // defpackage.fi1
    public final float b0() {
        return this.X.b0();
    }

    public final fw8 c() {
        return yn0.Z(this.g0).C0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(long j, rn2 rn2Var, r10 r10Var) throws Throwable {
        zy7 zy7Var;
        Throwable th;
        og7 og7Var;
        mm0 mm0Var;
        if (r10Var instanceof zy7) {
            zy7Var = (zy7) r10Var;
            int i = zy7Var.i0;
            if ((i & Integer.MIN_VALUE) != 0) {
                zy7Var.i0 = i - Integer.MIN_VALUE;
            } else {
                zy7Var = new zy7(this, r10Var);
            }
        } else {
            zy7Var = new zy7(this, r10Var);
        }
        Object objK = zy7Var.g0;
        int i2 = zy7Var.i0;
        if (i2 != 0) {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            og7Var = zy7Var.f0;
            try {
                w39.n0(objK);
                og7Var.m(gm0.X);
                return objK;
            } catch (Throwable th2) {
                th = th2;
                og7Var.m(gm0.X);
                throw th;
            }
        }
        w39.n0(objK);
        if (j <= 0 && (mm0Var = this.Z) != null) {
            mm0Var.f(new rj6(new cq5(j)));
        }
        og7 og7VarG = w51.G(this.g0.M0(), null, null, new gf2(j, this, null), 3);
        try {
            zy7Var.f0 = og7VarG;
            zy7Var.i0 = 1;
            objK = rn2Var.K(this, zy7Var);
            Object obj = c71.X;
            if (objK == obj) {
                return obj;
            }
            og7Var = og7VarG;
            og7Var.m(gm0.X);
            return objK;
        } catch (Throwable th3) {
            th = th3;
            og7Var = og7VarG;
            og7Var.m(gm0.X);
            throw th;
        }
    }

    @Override // defpackage.q51
    public final void f(Object obj) {
        cz7 cz7Var = this.g0;
        synchronized (cz7Var.w0) {
            cz7Var.v0.j(this);
        }
        this.Y.f(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(long j, rn2 rn2Var, s51 s51Var) {
        az7 az7Var;
        if (s51Var instanceof az7) {
            az7Var = (az7) s51Var;
            int i = az7Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                az7Var.h0 = i - Integer.MIN_VALUE;
            } else {
                az7Var = new az7(this, s51Var);
            }
        } else {
            az7Var = new az7(this, s51Var);
        }
        Object obj = az7Var.f0;
        int i2 = az7Var.h0;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    w39.n0(obj);
                    return obj;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
            az7Var.h0 = 1;
            Object objD = d(j, rn2Var, az7Var);
            Object obj2 = c71.X;
            return objD == obj2 ? obj2 : objD;
        } catch (cq5 unused) {
            return null;
        }
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        return this.X.getDensity();
    }

    @Override // defpackage.fi1
    public final float h0(float f) {
        return this.X.getDensity() * f;
    }

    @Override // defpackage.fi1
    public final long q(float f) {
        return this.X.q(f);
    }

    @Override // defpackage.fi1
    public final long r(long j) {
        return this.X.r(j);
    }

    @Override // defpackage.q51
    public final s61 w() {
        return b02.X;
    }

    @Override // defpackage.fi1
    public final int x0(float f) {
        return this.X.x0(f);
    }
}
