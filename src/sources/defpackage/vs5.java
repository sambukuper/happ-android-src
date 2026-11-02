package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vs5 implements o64 {
    public final int X;
    public final f63 Y;
    public final gn2 Z;
    public q31 f0;
    public up7 g0;
    public a44 h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public Object l0;
    public boolean m0;
    public us5 n0;
    public boolean o0;
    public long p0;
    public long q0;
    public long r0 = yx4.a();
    public boolean s0;
    public final /* synthetic */ sa2 t0;

    public vs5(sa2 sa2Var, int i, f63 f63Var, uh3 uh3Var) {
        this.t0 = sa2Var;
        this.X = i;
        this.Y = f63Var;
        this.Z = uh3Var;
    }

    public final void a() {
        a44 a44Var = this.h0;
        if (a44Var != null) {
            switch (a44Var.a) {
                case 0:
                    break;
                default:
                    t34 t34VarB = a44Var.b();
                    if ((t34VarB != null ? t34VarB.f : null) != null) {
                        a44Var.b.g(a44Var.c);
                    }
                    break;
            }
        }
        this.h0 = null;
        up7 up7Var = this.g0;
        if (up7Var != null) {
            up7Var.a();
        }
        this.g0 = null;
        this.n0 = null;
    }

    public final boolean b(dg dgVar) {
        boolean zC;
        if (!this.t0.b) {
            return false;
        }
        if (this.o0) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zC = c(dgVar);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zC = c(dgVar);
        }
        wa.O(-1L, "compose:lazy:prefetch:execute:item");
        return zC;
    }

    /* JADX WARN: Failed to calculate best type for var: r15v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v2 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final boolean c(defpackage.dg r25) {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs5.c(dg):boolean");
    }

    @Override // defpackage.o64
    public final void cancel() {
        if (this.j0) {
            return;
        }
        this.j0 = true;
        a();
    }

    public final boolean d() {
        a44 a44Var;
        return this.k0 || ((a44Var = this.h0) != null && a44Var.c());
    }

    public final void e(Object obj, Object obj2, yz yzVar) {
        a44 a44Var;
        a44 a44Var2 = this.h0;
        byte b = 0;
        if (a44Var2 == null) {
            sa2 sa2Var = this.t0;
            rn2 rn2VarA = ((f64) sa2Var.a).a(this.X, obj, obj2);
            b44 b44VarA = ((vp7) sa2Var.c).a();
            if (b44VarA.X.K()) {
                b44VarA.k(obj, rn2VarA, true);
                a44Var = new a44(b44VarA, obj, (byte) 1);
            } else {
                a44Var = new a44(b44VarA, obj, b);
            }
            a44Var2 = a44Var;
            this.h0 = a44Var2;
            this.l0 = obj;
        }
        this.s0 = false;
        while (!a44Var2.c() && !this.s0) {
            jn0 jn0Var = new jn0(this, yzVar, (byte) 7);
            switch (a44Var2.a) {
                case 0:
                    break;
                default:
                    t34 t34VarB = a44Var2.b();
                    mj5 mj5Var = t34VarB != null ? t34VarB.f : null;
                    if (mj5Var == null || mj5Var.c()) {
                        break;
                    } else {
                        dd7 dd7VarD = yn0.D();
                        gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
                        dd7 dd7VarP = yn0.P(dd7VarD);
                        try {
                            mj5Var.e(jn0Var);
                            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                            break;
                        } catch (Throwable th) {
                            try {
                                t34VarB.getClass();
                                throw th;
                            } catch (Throwable th2) {
                                yn0.c0(dd7VarD, dd7VarP, gn2VarE);
                                throw th2;
                            }
                        }
                    }
                    break;
            }
        }
        h();
        boolean z = this.s0;
        long j = this.q0;
        if (z) {
            yzVar.b = yz.a(j, yzVar.b);
        } else {
            yzVar.a = yz.a(j, yzVar.a);
        }
    }

    public final boolean f(long j, long j2) {
        if (this.o0) {
            j2 = 0;
        }
        return j > j2;
    }

    @Override // defpackage.o64
    public final void g() {
        this.o0 = true;
    }

    public final void h() {
        long jA = yx4.a();
        long jC = ka8.c(jA, this.r0);
        long j = jC >> 1;
        be beVar = gx1.Y;
        if ((((int) jC) & 1) != 0) {
            if (j > 9223372036854L) {
                j = Long.MAX_VALUE;
            } else {
                j = j < -9223372036854L ? Long.MIN_VALUE : j * 1000000;
            }
        }
        this.q0 = j;
        long j2 = this.p0 - j;
        this.p0 = j2;
        this.r0 = jA;
        wa.O(j2, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        q31 q31Var = this.f0;
        boolean zD = d();
        boolean z = this.i0;
        boolean z2 = this.j0;
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.X);
        sb.append(", constraints = ");
        sb.append(q31Var);
        sb.append(", isComposed = ");
        sb.append(zD);
        sb.append(", isMeasured = ");
        sb.append(z);
        sb.append(", isCanceled = ");
        return p61.o(sb, z2, " }");
    }
}
