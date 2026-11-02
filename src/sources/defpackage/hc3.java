package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hc3 implements hv1 {
    public final xu1 X;
    public cc3 Y;
    public fc3 Z;
    public ec3 f0;
    public dc3 g0;
    public w51 h0;
    public rb8 i0;
    public kr0 j0;
    public final b8 k0;
    public final b8 l0;

    public hc3(xu1 xu1Var) {
        this.X = xu1Var;
        b8 b8Var = new b8((byte) 4);
        b8Var.c = new j05();
        this.k0 = b8Var;
        b8 b8Var2 = new b8((byte) 8);
        b8Var2.c = new zz4();
        this.l0 = b8Var2;
    }

    public static void c(hc3 hc3Var, ac3 ac3Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        xu1 xu1Var = hc3Var.X;
        ec3 ec3Var = hc3Var.f0;
        if (ec3Var == null) {
            ec3Var = new ec3();
            ec3Var.q = null;
            ec3Var.r = Long.MAX_VALUE;
            ec3Var.s = false;
            hc3Var.f0 = ec3Var;
        }
        ec3Var.q = ac3Var;
        ec3Var.r = j;
        kr0 kr0Var = hc3Var.j0;
        sd5 sd5Var = xu1Var.s0;
        if (kr0Var == null) {
            hc3Var.j0 = new kr0(sd5Var);
        } else {
            kr0Var.c = sd5Var;
            kr0Var.b = j2;
        }
        ec3Var.s = false;
        hc3Var.h0 = ec3Var;
    }

    @Override // defpackage.nr2
    public final String Q() {
        w51 w51Var = this.h0;
        if (w51Var instanceof cc3) {
            return ((cc3) w51Var).s ? "waiting" : "idle";
        }
        if ((w51Var instanceof ec3) || (w51Var instanceof dc3)) {
            return "waiting";
        }
        return w51Var instanceof fc3 ? "recognized" : "idle";
    }

    public final void a() {
        cc3 cc3Var = this.Y;
        bc3 bc3Var = bc3.Z;
        if (cc3Var == null) {
            cc3Var = new cc3();
            cc3Var.q = bc3Var;
            cc3Var.r = false;
            cc3Var.s = false;
            this.Y = cc3Var;
        }
        cc3Var.q = bc3Var;
        cc3Var.r = false;
        cc3Var.s = false;
        this.h0 = cc3Var;
    }

    @Override // defpackage.hv1
    public final sd5 a0() {
        return this.X.s0;
    }

    public final void b(ac3 ac3Var, long j, kr0 kr0Var) {
        dc3 dc3Var = this.g0;
        if (dc3Var == null) {
            dc3Var = new dc3();
            dc3Var.q = null;
            dc3Var.r = Long.MAX_VALUE;
            this.g0 = dc3Var;
        }
        dc3Var.q = ac3Var;
        dc3Var.r = j;
        kr0Var.b = 0L;
        this.h0 = dc3Var;
    }

    public final rb8 d() {
        rb8 rb8Var = this.i0;
        if (rb8Var != null) {
            return rb8Var;
        }
        bt.q("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(ac3 ac3Var, zb3 zb3Var, long j) {
        long j2;
        float fIntBitsToFloat;
        long j3 = ac3Var.c;
        xu1 xu1Var = this.X;
        sd5 sd5Var = xu1Var.s0;
        sd5Var.getClass();
        iv1 iv1Var = jv1.a;
        long j4 = 4294967295L;
        if (Math.abs(Float.intBitsToFloat((int) (sd5Var == sd5.X ? j & 4294967295L : j >> 32))) > 2.0f) {
            rb8 rb8VarD = d();
            sd5 sd5Var2 = xu1Var.s0;
            b8 b8Var = this.k0;
            j05 j05Var = (j05) b8Var.c;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            if (z51.o(ac3Var)) {
                b8Var.b = 0;
                j05Var.d();
            }
            float fIntBitsToFloat4 = 0.0f;
            if (z51.p(ac3Var) || z51.o(ac3Var)) {
                j2 = 4294967295L;
            } else {
                if (j05Var.b == 3) {
                    int i = b8Var.b;
                    b8Var.b = i + 1;
                    j05Var.o(i, ac3Var);
                } else {
                    j05Var.a(ac3Var);
                }
                if (b8Var.b == 3) {
                    b8Var.b = 0;
                }
                Object[] objArr = j05Var.a;
                int i2 = j05Var.b;
                int i3 = 0;
                float fIntBitsToFloat5 = 0.0f;
                while (i3 < i2) {
                    fIntBitsToFloat5 += Float.intBitsToFloat((int) (((ac3) objArr[i3]).c >> 32));
                    i3++;
                    j4 = j4;
                }
                j2 = j4;
                int i4 = j05Var.b;
                fIntBitsToFloat2 = fIntBitsToFloat5 / i4;
                Object[] objArr2 = j05Var.a;
                float fIntBitsToFloat6 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    fIntBitsToFloat6 += Float.intBitsToFloat((int) (((ac3) objArr2[i5]).c & j2));
                }
                fIntBitsToFloat3 = fIntBitsToFloat6 / j05Var.b;
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
            if (sd5Var2 != null) {
                int i6 = zb3Var.a;
                if (i6 == 1) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                } else if (i6 == 2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
                }
                jFloatToRawIntBits = sd5Var2 == sd5.Y ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
            }
            ((gj4) rb8VarD.Y).f(ac3Var.b, jFloatToRawIntBits);
            b8 b8Var2 = this.l0;
            zz4 zz4Var = (zz4) b8Var2.c;
            if (zz4Var.b == 3) {
                int i7 = b8Var2.b;
                b8Var2.b = i7 + 1;
                zz4Var.f(i7, j);
            } else {
                zz4Var.a(j);
            }
            if (b8Var2.b == 3) {
                b8Var2.b = 0;
            }
            long[] jArr = zz4Var.a;
            int i8 = zz4Var.b;
            float fIntBitsToFloat7 = 0.0f;
            for (int i9 = 0; i9 < i8; i9++) {
                fIntBitsToFloat7 += Float.intBitsToFloat((int) (jArr[i9] >> 32));
            }
            int i10 = zz4Var.b;
            float f = fIntBitsToFloat7 / i10;
            long[] jArr2 = zz4Var.a;
            for (int i11 = 0; i11 < i10; i11++) {
                fIntBitsToFloat4 = Float.intBitsToFloat((int) (jArr2[i11] & j2)) + fIntBitsToFloat4;
            }
            xu1Var.g1(new fu1((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4 / zz4Var.b)) & j2), true));
        }
    }

    public final void f(ac3 ac3Var, ac3 ac3Var2, zb3 zb3Var, long j) {
        char c;
        long j2;
        float fIntBitsToFloat;
        if (this.i0 == null) {
            this.i0 = new rb8((byte) 6);
        }
        rb8 rb8VarD = d();
        xu1 xu1Var = this.X;
        sd5 sd5Var = xu1Var.s0;
        b8 b8Var = this.k0;
        j05 j05Var = (j05) b8Var.c;
        char c2 = ' ';
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (ac3Var.c >> 32));
        long j3 = 4294967295L;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (ac3Var.c & 4294967295L));
        if (z51.o(ac3Var)) {
            b8Var.b = 0;
            j05Var.d();
        }
        if (z51.p(ac3Var) || z51.o(ac3Var)) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            if (j05Var.b == 3) {
                int i = b8Var.b;
                b8Var.b = i + 1;
                j05Var.o(i, ac3Var);
            } else {
                j05Var.a(ac3Var);
            }
            if (b8Var.b == 3) {
                b8Var.b = 0;
            }
            Object[] objArr = j05Var.a;
            int i2 = j05Var.b;
            int i3 = 0;
            float fIntBitsToFloat4 = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((ac3) objArr[i3]).c >> c3));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j2 = j3;
            int i4 = j05Var.b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = j05Var.a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((ac3) objArr2[i5]).c & j2));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / j05Var.b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2);
        if (sd5Var != null) {
            int i6 = zb3Var.a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
            }
            jFloatToRawIntBits = sd5Var == sd5.Y ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        }
        ((gj4) rb8VarD.Y).f(ac3Var.b, jFloatToRawIntBits);
        long jE = z85.e(z51.N(ac3Var2, xu1Var.s0, zb3Var), j);
        if (((Boolean) xu1Var.t0.B(new oq5(1))).booleanValue()) {
            xu1Var.g1(new gu1(jE));
        }
        b8 b8Var2 = this.l0;
        b8Var2.b = 0;
        ((zz4) b8Var2.c).b = 0;
    }
}
