package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o41 extends jx4 implements s01, as4 {
    public sd5 q0;
    public final sy6 r0;
    public boolean s0;
    public w80 t0;
    public final ly6 u0;
    public boolean w0;
    public boolean y0;
    public final yr2 v0 = new yr2((byte) 11);
    public long x0 = -1;

    public o41(sd5 sd5Var, sy6 sy6Var, boolean z, w80 w80Var, ly6 ly6Var) {
        this.q0 = sd5Var;
        this.r0 = sy6Var;
        this.s0 = z;
        this.t0 = w80Var;
        this.u0 = ly6Var;
    }

    public static boolean a1(o41 o41Var, s86 s86Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = o41Var.Z0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jC1 = o41Var.c1(s86Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jC1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jC1 & 4294967295L))) <= 0.5f;
    }

    @Override // defpackage.jx4
    public final boolean N0() {
        return false;
    }

    public final float Y0(w80 w80Var, long j) {
        float f;
        s86 s86Var;
        int iCompare;
        long j2 = this.x0;
        c15 c15Var = (c15) this.v0.Y;
        int i = c15Var.Z - 1;
        Object[] objArr = c15Var.X;
        if (i < objArr.length) {
            s86Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                s86 s86Var2 = (s86) ((l41) objArr[i]).a.invoke();
                if (s86Var2 != null) {
                    long jE = s86Var2.e();
                    long jR = u15.R(Z0());
                    f = 0.0f;
                    int iOrdinal = this.q0.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jE & 4294967295L)), Float.intBitsToFloat((int) (jR & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            b61.c();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jE >> 32)), Float.intBitsToFloat((int) (jR >> 32)));
                    }
                    if (iCompare > 0) {
                        if (s86Var != null) {
                            break;
                        }
                        s86Var = s86Var2;
                        break;
                    }
                    s86Var = s86Var2;
                }
                i--;
            }
        } else {
            f = 0.0f;
            s86Var = null;
        }
        if (s86Var == null) {
            s86 s86Var3 = this.w0 ? (s86) this.u0.invoke() : null;
            if (s86Var3 == null) {
                return f;
            }
            s86Var = s86Var3;
        }
        long jR2 = u15.R(j2);
        int iOrdinal2 = this.q0.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = s86Var.b;
            return w80Var.a(f2 - ((int) (j & 4294967295L)), s86Var.d - f2, Float.intBitsToFloat((int) (jR2 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = s86Var.a;
            return w80Var.a(f3 - ((int) (j >> 32)), s86Var.c - f3, Float.intBitsToFloat((int) (jR2 >> 32)));
        }
        b61.c();
        return f;
    }

    public final long Z0() {
        long j = this.x0;
        if (pf3.a(j, -1L)) {
            return 0L;
        }
        return j;
    }

    @Override // defpackage.as4
    public final void a(long j) {
        int iK;
        long j2;
        long jZ0 = Z0();
        this.x0 = j;
        int iOrdinal = this.q0.ordinal();
        if (iOrdinal == 0) {
            iK = dh3.k((int) (j & 4294967295L), (int) (jZ0 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                b61.c();
                return;
            }
            iK = dh3.k((int) (j >> 32), (int) (jZ0 >> 32));
        }
        if (iK >= 0) {
            return;
        }
        if (this.s0) {
            j2 = 0;
        } else {
            j2 = this.q0 == sd5.X ? ((long) (((int) (jZ0 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jZ0 >> 32)) - ((int) (j >> 32)))) << 32;
        }
        long j3 = j2;
        s86 s86Var = (s86) this.u0.invoke();
        if (s86Var == null || this.y0 || this.w0 || !a1(this, s86Var, jZ0, 0L, 2) || a1(this, s86Var, 0L, j3, 1)) {
            return;
        }
        this.w0 = true;
        b1(j3);
    }

    public final void b1(long j) {
        w80 w80Var = this.t0;
        if (w80Var == null) {
            w80Var = (w80) hi5.W(this, y80.a);
        }
        w80 w80Var2 = w80Var;
        if (this.y0) {
            zc3.c("launchAnimation called when previous animation was running");
        }
        w80 w80Var3 = this.t0;
        if (w80Var3 == null) {
            w80Var3 = (w80) hi5.W(this, y80.a);
        }
        w80Var3.getClass();
        w80.a.getClass();
        qo8 qo8Var = new qo8(v80.b);
        w51.G(M0(), null, e71.f0, new n41(this, qo8Var, w80Var2, j, null), 1);
    }

    public final long c1(s86 s86Var, long j, long j2) {
        long jR = u15.R(j);
        int iOrdinal = this.q0.ordinal();
        if (iOrdinal == 0) {
            w80 w80Var = this.t0;
            if (w80Var == null) {
                w80Var = (w80) hi5.W(this, y80.a);
            }
            float f = s86Var.b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(w80Var.a(f - ((int) (j2 & 4294967295L)), s86Var.d - f, Float.intBitsToFloat((int) (jR & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            b61.c();
            return 0L;
        }
        w80 w80Var2 = this.t0;
        if (w80Var2 == null) {
            w80Var2 = (w80) hi5.W(this, y80.a);
        }
        float f2 = s86Var.a;
        return (((long) Float.floatToRawIntBits(w80Var2.a(f2 - ((int) (j2 >> 32)), s86Var.c - f2, Float.intBitsToFloat((int) (jR >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }
}
