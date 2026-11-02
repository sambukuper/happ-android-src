package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ry7 {
    public static final Object a(float f, float f2, float f3, pk pkVar, rn2 rn2Var, uy7 uy7Var) {
        ug8 ug8Var = ys0.j0;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        gn2 gn2Var = ug8Var.a;
        wk wkVarC = (wk) gn2Var.B(f6);
        if (wkVarC == null) {
            wkVarC = ((wk) gn2Var.B(f4)).c();
        }
        wk wkVar = wkVarC;
        Object objB = b(new qk(ug8Var, f4, wkVar, 56), new t18(pkVar, ug8Var, f4, f5, wkVar), Long.MIN_VALUE, new py7((Object) rn2Var, (byte) 0), uy7Var);
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        if (objB != c71Var) {
            objB = dn8Var;
        }
        return objB == c71Var ? objB : dn8Var;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x019c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public static final Object b(qk qkVar, gk gkVar, long j, final gn2 gn2Var, s51 s51Var) {
        qy7 qy7Var;
        final ea6 ea6Var;
        final qk qkVar2;
        qk qkVar3;
        ea6 ea6Var2;
        Object objA;
        gn2 gn2Var2;
        ok okVar;
        ok okVar2;
        Object objA2;
        final gk gkVar2 = gkVar;
        pz2 pz2Var = pz2.T0;
        if (s51Var instanceof qy7) {
            qy7Var = (qy7) s51Var;
            int i = qy7Var.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                qy7Var.k0 = i - Integer.MIN_VALUE;
            } else {
                qy7Var = new qy7(s51Var);
            }
        } else {
            qy7Var = new qy7(s51Var);
        }
        qy7 qy7Var2 = qy7Var;
        s61 s61Var = qy7Var2.Y;
        Object obj = qy7Var2.j0;
        int i2 = qy7Var2.k0;
        byte b = 25;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(obj);
            final Object objF = gkVar2.f(0L);
            final wk wkVarD = gkVar2.d(0L);
            ea6Var = new ea6();
            if (j == Long.MIN_VALUE) {
                try {
                    s61Var.getClass();
                    final float fH = h(s61Var);
                    qkVar2 = qkVar;
                    try {
                        gn2 gn2Var3 = new gn2() { // from class: my7
                            @Override // defpackage.gn2
                            public final Object B(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                gk gkVar3 = gkVar2;
                                ug8 ug8VarC = gkVar3.c();
                                Object objG = gkVar3.g();
                                qk qkVar4 = qkVar2;
                                ok okVar3 = new ok(objF, ug8VarC, wkVarD, jLongValue, objG, jLongValue, new ny7(qkVar4, (byte) 1));
                                ry7.g(okVar3, jLongValue, fH, gkVar3, qkVar4, gn2Var);
                                ea6Var.X = okVar3;
                                return dn8.a;
                            }
                        };
                        ea6Var2 = ea6Var;
                        try {
                            qy7Var2.f0 = qkVar2;
                            qy7Var2.g0 = gkVar2;
                            qy7Var2.h0 = gn2Var;
                            qy7Var2.i0 = ea6Var2;
                            qy7Var2.k0 = 1;
                            if (!gkVar2.a()) {
                                pr2 pr2Var = new pr2(gn2Var3, b);
                                s61Var.getClass();
                                objA = z68.H(s61Var).a(pr2Var, qy7Var2);
                            } else {
                                if (qy7Var2.w().H0(pz2Var) != null) {
                                    throw new ClassCastException();
                                }
                                objA = z68.H(qy7Var2.w()).a(gn2Var3, qy7Var2);
                            }
                            if (objA != c71Var) {
                                qkVar3 = qkVar2;
                                gn2Var2 = gn2Var;
                                ea6Var = ea6Var2;
                            }
                            return c71Var;
                        } catch (CancellationException e) {
                            e = e;
                            qkVar3 = qkVar2;
                            ea6Var = ea6Var2;
                            okVar = (ok) ea6Var.X;
                            if (okVar != null) {
                                okVar.i.setValue(Boolean.FALSE);
                            }
                            okVar2 = (ok) ea6Var.X;
                            if (okVar2 != null) {
                                qkVar3.h0 = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e2) {
                        e = e2;
                        qkVar3 = qkVar2;
                        okVar = (ok) ea6Var.X;
                        if (okVar != null) {
                            okVar.i.setValue(Boolean.FALSE);
                        }
                        okVar2 = (ok) ea6Var.X;
                        if (okVar2 != null) {
                            qkVar3.h0 = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    qkVar2 = qkVar;
                }
            } else {
                ea6Var2 = ea6Var;
                try {
                    ok okVar3 = new ok(objF, gkVar2.c(), wkVarD, j, gkVar2.g(), j, new ny7(qkVar, (byte) 0));
                    s61Var.getClass();
                    g(okVar3, j, h(s61Var), gkVar2, qkVar, gn2Var);
                    ea6Var2.X = okVar3;
                    qkVar3 = qkVar;
                    gkVar2 = gkVar;
                    gn2Var2 = gn2Var;
                    ea6Var = ea6Var2;
                } catch (CancellationException e4) {
                    e = e4;
                    qkVar3 = qkVar;
                    ea6Var = ea6Var2;
                    okVar = (ok) ea6Var.X;
                    if (okVar != null) {
                        okVar.i.setValue(Boolean.FALSE);
                    }
                    okVar2 = (ok) ea6Var.X;
                    if (okVar2 != null) {
                        qkVar3.h0 = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ea6Var = qy7Var2.i0;
            gn2Var2 = qy7Var2.h0;
            gkVar2 = qy7Var2.g0;
            qkVar3 = qy7Var2.f0;
            try {
                w39.n0(obj);
            } catch (CancellationException e5) {
                e = e5;
                okVar = (ok) ea6Var.X;
                if (okVar != null) {
                    okVar.i.setValue(Boolean.FALSE);
                }
                okVar2 = (ok) ea6Var.X;
                if (okVar2 != null && okVar2.g == qkVar3.f0) {
                    qkVar3.h0 = false;
                }
                throw e;
            }
        }
        do {
            s61 s61Var2 = qy7Var2.Y;
            Object obj2 = ea6Var.X;
            obj2.getClass();
            if (!((Boolean) ((ok) obj2).i.getValue()).booleanValue()) {
                return dn8.a;
            }
            s61Var2.getClass();
            final float fH2 = h(s61Var2);
            final ea6 ea6Var3 = ea6Var;
            final gn2 gn2Var4 = gn2Var2;
            final gk gkVar3 = gkVar2;
            final qk qkVar4 = qkVar3;
            try {
                gn2 gn2Var5 = new gn2() { // from class: oy7
                    @Override // defpackage.gn2
                    public final Object B(Object obj3) {
                        long jLongValue = ((Long) obj3).longValue();
                        Object obj4 = ea6Var3.X;
                        obj4.getClass();
                        ry7.g((ok) obj4, jLongValue, fH2, gkVar3, qkVar4, gn2Var4);
                        return dn8.a;
                    }
                };
                ea6Var = ea6Var3;
                gkVar2 = gkVar3;
                qkVar3 = qkVar4;
                gn2Var2 = gn2Var4;
                qy7Var2.f0 = qkVar3;
                qy7Var2.g0 = gkVar2;
                qy7Var2.h0 = gn2Var2;
                qy7Var2.i0 = ea6Var;
                qy7Var2.k0 = 2;
                if (!gkVar2.a()) {
                    pr2 pr2Var2 = new pr2(gn2Var5, b);
                    s61Var2.getClass();
                    objA2 = z68.H(s61Var2).a(pr2Var2, qy7Var2);
                } else {
                    if (qy7Var2.w().H0(pz2Var) != null) {
                        throw new ClassCastException();
                    }
                    objA2 = z68.H(qy7Var2.w()).a(gn2Var5, qy7Var2);
                }
            } catch (CancellationException e6) {
                e = e6;
                ea6Var = ea6Var3;
                qkVar3 = qkVar4;
                okVar = (ok) ea6Var.X;
                if (okVar != null) {
                    okVar.i.setValue(Boolean.FALSE);
                }
                okVar2 = (ok) ea6Var.X;
                if (okVar2 != null) {
                    qkVar3.h0 = false;
                }
                throw e;
            }
        } while (objA2 != c71Var);
        return c71Var;
    }

    public static final Object c(qk qkVar, bd1 bd1Var, boolean z, gn2 gn2Var, s51 s51Var) {
        Object objB = b(qkVar, new ad1(bd1Var, qkVar.X, qkVar.Y.getValue(), qkVar.Z), z ? qkVar.f0 : Long.MIN_VALUE, gn2Var, s51Var);
        return objB == c71.X ? objB : dn8.a;
    }

    public static final Object d(qk qkVar, Float f, pk pkVar, boolean z, gn2 gn2Var, s51 s51Var) {
        Object objB = b(qkVar, new t18(pkVar, qkVar.X, qkVar.Y.getValue(), f, qkVar.Z), z ? qkVar.f0 : Long.MIN_VALUE, gn2Var, s51Var);
        return objB == c71.X ? objB : dn8.a;
    }

    public static final Object e(Object obj, boolean z) {
        ut3 ut3Var;
        obj.getClass();
        if (z) {
            obj = (su3) obj;
            if ((obj instanceof ru3) && (ut3Var = ((ru3) obj).i) != null) {
                String strReplace = ut3Var.f0.a.a.replace('.', '/');
                if (strReplace != null) {
                    return new qu3(strReplace);
                }
                zs3.a(7);
                throw null;
            }
        }
        return obj;
    }

    public static final long f() {
        return Thread.currentThread().getId();
    }

    public static final void g(ok okVar, long j, float f, gk gkVar, qk qkVar, gn2 gn2Var) {
        long jB = f == 0.0f ? gkVar.b() : (long) ((j - okVar.c) / f);
        okVar.g = j;
        okVar.e.setValue(gkVar.f(jB));
        okVar.f = gkVar.d(jB);
        if (gkVar.e(jB)) {
            okVar.h = okVar.g;
            okVar.i.setValue(Boolean.FALSE);
        }
        j(okVar, qkVar);
        gn2Var.B(okVar);
    }

    public static final float h(s61 s61Var) {
        ey4 ey4Var = (ey4) s61Var.H0(lh4.h0);
        float fC0 = ey4Var != null ? ey4Var.c0() : 1.0f;
        if (fC0 >= 0.0f) {
            return fC0;
        }
        yr5.b("negative scale factor");
        return fC0;
    }

    public static final pe3 i(fe3 fe3Var) {
        return new pe3(fe3Var.a, fe3Var.b, fe3Var.c, fe3Var.d);
    }

    public static final void j(ok okVar, qk qkVar) {
        qkVar.Y.setValue(okVar.e.getValue());
        wk wkVar = qkVar.Z;
        wk wkVar2 = okVar.f;
        int iB = wkVar.b();
        for (int i = 0; i < iB; i++) {
            wkVar.e(i, wkVar2.a(i));
        }
        qkVar.g0 = okVar.h;
        qkVar.f0 = okVar.g;
        qkVar.h0 = ((Boolean) okVar.i.getValue()).booleanValue();
    }
}
