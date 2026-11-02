package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zi1 extends zh7 implements lh7 {
    public final dn2 Y;
    public final qd7 Z;
    public yi1 f0 = new yi1(kd7.h().g());

    public zi1(dn2 dn2Var, qd7 qd7Var) {
        this.Y = dn2Var;
        this.Z = qd7Var;
    }

    @Override // defpackage.yh7
    public final bi7 c() {
        return this.f0;
    }

    @Override // defpackage.lh7
    public final Object getValue() {
        gn2 gn2VarE = kd7.h().e();
        if (gn2VarE != null) {
            gn2VarE.B(this);
        }
        dd7 dd7VarH = kd7.h();
        return l((yi1) kd7.g(this.f0, dd7VarH), dd7VarH, true, this.Y).f;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x009c A[EDGE_INSN: B:101:0x009c->B:31:0x009c BREAK  A[LOOP:1: B:16:0x0049->B:30:0x0099], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x0099, LOOP_END, TryCatch #3 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x0059, B:20:0x0065, B:22:0x006f, B:24:0x0087, B:26:0x008d, B:30:0x0099, B:31:0x009c), top: B:96:0x0023 }] */
    public final yi1 l(yi1 yi1Var, dd7 dd7Var, boolean z, dn2 dn2Var) {
        qd7 qd7Var;
        int i;
        yi1 yi1Var2 = yi1Var;
        if (yi1Var2.d(this, dd7Var)) {
            if (z) {
                c15 c15VarA = rd7.a();
                Object[] objArr = c15VarA.X;
                int i2 = c15VarA.Z;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((kp2) objArr[i3]).b();
                }
                try {
                    f05 f05Var = yi1Var2.e;
                    f63 f63Var = rd7.a;
                    mf3 mf3Var = (mf3) f63Var.get();
                    if (mf3Var == null) {
                        mf3Var = new mf3();
                        f63Var.A(mf3Var);
                    }
                    int i4 = mf3Var.a;
                    Object[] objArr2 = f05Var.b;
                    int[] iArr = f05Var.c;
                    long[] jArr = f05Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        yh7 yh7Var = (yh7) objArr2[i9];
                                        i = i6;
                                        mf3Var.a = i4 + iArr[i9];
                                        gn2 gn2VarE = dd7Var.e();
                                        if (gn2VarE != null) {
                                            gn2VarE.B(yh7Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    mf3Var.a = i4;
                } finally {
                    Object[] objArr3 = c15VarA.X;
                    int i10 = c15VarA.Z;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((kp2) objArr3[i11]).a();
                    }
                }
            }
            return yi1Var2;
        }
        f05 f05Var2 = new f05();
        f63 f63Var2 = rd7.a;
        mf3 mf3Var2 = (mf3) f63Var2.get();
        if (mf3Var2 == null) {
            mf3Var2 = new mf3();
            f63Var2.A(mf3Var2);
        }
        int i12 = mf3Var2.a;
        c15 c15VarA2 = rd7.a();
        Object[] objArr4 = c15VarA2.X;
        int i13 = c15VarA2.Z;
        for (int i14 = 0; i14 < i13; i14++) {
            ((kp2) objArr4[i14]).b();
        }
        try {
            mf3Var2.a = i12 + 1;
            Object objR = yn0.R(new k8(this, mf3Var2, f05Var2, i12), dn2Var);
            mf3Var2.a = i12;
            Object[] objArr5 = c15VarA2.X;
            int i15 = c15VarA2.Z;
            for (int i16 = 0; i16 < i15; i16++) {
                ((kp2) objArr5[i16]).a();
            }
            Object obj = kd7.c;
            synchronized (obj) {
                try {
                    dd7 dd7VarH = kd7.h();
                    Object obj2 = yi1Var2.f;
                    if (obj2 == yi1.h || (qd7Var = this.Z) == null || !qd7Var.X(objR, obj2)) {
                        yi1 yi1Var3 = this.f0;
                        synchronized (obj) {
                            bi7 bi7VarK = kd7.k(yi1Var3, this);
                            bi7VarK.a(yi1Var3);
                            bi7VarK.a = dd7VarH.g();
                            yi1Var2 = (yi1) bi7VarK;
                            yi1Var2.e = f05Var2;
                            yi1Var2.g = yi1Var2.e(this, dd7VarH);
                            yi1Var2.f = objR;
                        }
                        return yi1Var2;
                    }
                    yi1Var2.e = f05Var2;
                    yi1Var2.g = yi1Var2.e(this, dd7VarH);
                } catch (Throwable th) {
                    throw th;
                }
            }
            mf3 mf3Var3 = (mf3) rd7.a.get();
            if (mf3Var3 == null || mf3Var3.a != 0) {
                return yi1Var2;
            }
            kd7.h().m();
            synchronized (obj) {
                dd7 dd7VarH2 = kd7.h();
                yi1Var2.c = dd7VarH2.g();
                yi1Var2.d = dd7VarH2.h();
                return yi1Var2;
            }
        } catch (Throwable th2) {
            Object[] objArr6 = c15VarA2.X;
            int i17 = c15VarA2.Z;
            for (int i18 = 0; i18 < i17; i18++) {
                ((kp2) objArr6[i18]).a();
            }
            throw th2;
        }
    }

    public final yi1 m() {
        dd7 dd7VarH = kd7.h();
        return l((yi1) kd7.g(this.f0, dd7VarH), dd7VarH, false, this.Y);
    }

    public final String toString() {
        yi1 yi1Var = (yi1) kd7.f(this.f0);
        return "DerivedState(value=" + (yi1Var.d(this, kd7.h()) ? String.valueOf(yi1Var.f) : "<Not calculated>") + ")@" + hashCode();
    }

    @Override // defpackage.yh7
    public final void y(bi7 bi7Var) {
        this.f0 = (yi1) bi7Var;
    }
}
