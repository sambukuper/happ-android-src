package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f22 extends xg3 implements w24 {
    public long A0;
    public q8 B0;
    public final e22 C0;
    public final e22 D0;
    public ce8 r0;
    public sd8 s0;
    public sd8 t0;
    public sd8 u0;
    public g22 v0;
    public h62 w0;
    public x77 x0;
    public dn2 y0;
    public t12 z0;

    public f22(ce8 ce8Var, sd8 sd8Var, sd8 sd8Var2, sd8 sd8Var3, g22 g22Var, h62 h62Var, x77 x77Var, dn2 dn2Var, t12 t12Var) {
        super((byte) 1);
        this.r0 = ce8Var;
        this.s0 = sd8Var;
        this.t0 = sd8Var2;
        this.u0 = sd8Var3;
        this.v0 = g22Var;
        this.w0 = h62Var;
        this.x0 = x77Var;
        this.y0 = dn2Var;
        this.z0 = t12Var;
        this.A0 = -9223372034707292160L;
        s31.b(0, 0, 0, 0, 15);
        this.C0 = new e22(this, (byte) 0);
        this.D0 = new e22(this, (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    @Override // defpackage.xg3, defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        rd8 rd8VarA;
        rd8 rd8VarA2;
        gd8 gd8Var;
        rd8 rd8VarA3;
        rd8 rd8VarA4;
        long j2;
        long j3;
        rd8 rd8VarA5;
        tk tkVar;
        sk skVar;
        float fFloatValue;
        if (this.r0.c() == this.r0.d.getValue()) {
            this.B0 = null;
        } else if (this.B0 == null) {
            q8 q8VarA1 = a1();
            if (q8VarA1 == null) {
                q8VarA1 = pz2.Z;
            }
            this.B0 = q8VarA1;
        }
        boolean zC0 = zr4Var.c0();
        e02 e02Var = e02.X;
        if (zC0) {
            eo5 eo5VarO = tr4Var.o(j);
            long j4 = (((long) eo5VarO.X) << 32) | (((long) eo5VarO.Y) & 4294967295L);
            this.A0 = j4;
            return zr4Var.g0((int) (j4 >> 32), (int) (j4 & 4294967295L), e02Var, new ck(eo5VarO, (byte) 1));
        }
        if (!((Boolean) this.y0.invoke()).booleanValue()) {
            eo5 eo5VarO2 = tr4Var.o(j);
            return zr4Var.g0(eo5VarO2.X, eo5VarO2.Y, e02Var, new ck(eo5VarO2, (byte) 2));
        }
        t12 t12Var = this.z0;
        sd8 sd8Var = t12Var.a;
        x77 x77Var = t12Var.b;
        sd8 sd8Var2 = t12Var.c;
        ce8 ce8Var = t12Var.d;
        g22 g22Var = t12Var.e;
        be8 be8Var = g22Var.a;
        h62 h62Var = t12Var.f;
        sd8 sd8Var3 = t12Var.g;
        if (sd8Var != null) {
            rd8VarA = sd8Var.a(new v12(g22Var, h62Var, (byte) 0), x77Var.a() ? Float.valueOf(x77Var.f) : null, null, new w12(g22Var, h62Var, x77Var, (byte) 0));
        } else {
            rd8VarA = null;
        }
        if (sd8Var2 != null) {
            v12 v12Var = new v12(g22Var, h62Var, (byte) 1);
            Float fValueOf = x77Var.a() ? Float.valueOf(x77Var.g) : null;
            if (x77Var.a()) {
                vu8 vu8Var = x77Var.j;
                if (vu8Var != null) {
                    float fB = vu8Var.b();
                    Float fValueOf2 = Float.valueOf(fB);
                    if (Float.isNaN(fB)) {
                        fValueOf2 = null;
                    }
                    if (fValueOf2 != null) {
                        fFloatValue = fValueOf2.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                } else {
                    fFloatValue = 0.0f;
                }
                skVar = new sk(fFloatValue);
            } else {
                skVar = null;
            }
            rd8VarA2 = sd8Var2.a(v12Var, fValueOf, skVar, new w12(g22Var, h62Var, x77Var, (byte) 1));
        } else {
            rd8VarA2 = null;
        }
        if (ce8Var.c() == r12.X) {
            qw6 qw6Var = be8Var.d;
            if (qw6Var != null) {
                gd8Var = new gd8(qw6Var.b);
            } else {
                qw6 qw6Var2 = h62Var.a.d;
                if (qw6Var2 != null) {
                    gd8Var = new gd8(qw6Var2.b);
                } else {
                    gd8Var = null;
                }
            }
        } else {
            qw6 qw6Var3 = h62Var.a.d;
            if (qw6Var3 != null) {
                gd8Var = new gd8(qw6Var3.b);
            } else {
                qw6 qw6Var4 = be8Var.d;
                if (qw6Var4 != null) {
                    gd8Var = new gd8(qw6Var4.b);
                } else {
                    gd8Var = null;
                }
            }
        }
        if (sd8Var3 != null) {
            rd8VarA3 = sd8Var3.a(ti.m0, x77Var.a() ? new gd8(x77Var.h) : null, null, new x12(gd8Var, g22Var, h62Var, x77Var));
        } else {
            rd8VarA3 = null;
        }
        x12 x12Var = new x12(x77Var, rd8VarA, rd8VarA2, rd8VarA3);
        eo5 eo5VarO3 = tr4Var.o(j);
        long j5 = (((long) eo5VarO3.X) << 32) | (((long) eo5VarO3.Y) & 4294967295L);
        long j6 = !pf3.a(this.A0, -9223372034707292160L) ? this.A0 : j5;
        sd8 sd8Var4 = this.s0;
        if (sd8Var4 != null) {
            rd8VarA4 = sd8Var4.a(this.C0, null, null, new d22(this, j6, (byte) 0));
        } else {
            rd8VarA4 = null;
        }
        long jD = s31.d(j, rd8VarA4 != null ? ((pf3) rd8VarA4.getValue()).a : j5);
        sd8 sd8Var5 = this.t0;
        if (sd8Var5 != null) {
            j2 = 0;
            j3 = ((hf3) sd8Var5.a(ti.v0, null, null, new d22(this, j6, (byte) 2)).getValue()).a;
        } else {
            j2 = 0;
            j3 = 0;
        }
        sd8 sd8Var6 = this.u0;
        if (sd8Var6 != null) {
            x77 x77Var2 = this.x0;
            hf3 hf3Var = x77Var2.a() ? new hf3(x77Var2.i) : null;
            if (this.x0.a()) {
                float fB2 = tu8.b(j2);
                Float fValueOf3 = Float.valueOf(fB2);
                if (Float.isNaN(fB2)) {
                    fValueOf3 = null;
                }
                float fFloatValue2 = fValueOf3 != null ? fValueOf3.floatValue() : 0.0f;
                float fC = tu8.c(j2);
                Float fValueOf4 = !Float.isNaN(fC) ? Float.valueOf(fC) : null;
                tkVar = new tk(fFloatValue2, fValueOf4 != null ? fValueOf4.floatValue() : 0.0f);
            } else {
                tkVar = null;
            }
            rd8VarA5 = sd8Var6.a(this.D0, hf3Var, tkVar, new d22(this, j6, (byte) 1));
        } else {
            rd8VarA5 = null;
        }
        return zr4Var.g0((int) (jD >> 32), (int) (jD & 4294967295L), e02Var, new c22(this, rd8VarA5, j5, j6, jD, eo5VarO3, j3, x12Var));
    }

    @Override // defpackage.jx4
    public final void Q0() {
        this.A0 = -9223372034707292160L;
    }

    public final q8 a1() {
        q8 q8Var;
        q8 q8Var2;
        if (this.r0.f().b(r12.X, r12.Y)) {
            fp0 fp0Var = this.v0.a.c;
            if (fp0Var != null && (q8Var2 = fp0Var.a) != null) {
                return q8Var2;
            }
            fp0 fp0Var2 = this.w0.a.c;
            if (fp0Var2 != null) {
                return fp0Var2.a;
            }
            return null;
        }
        fp0 fp0Var3 = this.w0.a.c;
        if (fp0Var3 != null && (q8Var = fp0Var3.a) != null) {
            return q8Var;
        }
        fp0 fp0Var4 = this.v0.a.c;
        if (fp0Var4 != null) {
            return fp0Var4.a;
        }
        return null;
    }

    @Override // defpackage.w24
    public final void n(y24 y24Var) {
    }
}
