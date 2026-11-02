package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j50 extends f30 {
    public static final j50 j0 = new j50(null);

    /* JADX WARN: Code duplicated, block: B:108:0x0212  */
    /* JADX WARN: Code duplicated, block: B:132:0x0258  */
    /* JADX WARN: Code duplicated, block: B:134:0x025c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0263  */
    /* JADX WARN: Code duplicated, block: B:137:0x0266  */
    /* JADX WARN: Code duplicated, block: B:139:0x026e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0290  */
    /* JADX WARN: Code duplicated, block: B:149:0x029d  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a3 A[RETURN] */
    public final f50 a0(t37 t37Var, e50 e50Var, bl blVar, boolean z, gl glVar) throws IllegalAccessException, nh3, InstantiationException, InvocationTargetException {
        si8 si8VarM;
        boolean z2;
        boolean z3;
        Object objW;
        Class[] clsArrD;
        f50 f50Var;
        Object objO;
        c25 c25VarM;
        m85 m85Var;
        Class[] clsArrN;
        Object objR;
        boolean z4;
        Object objNewInstance;
        dh8 dh8VarQ = glVar.Q();
        e50Var.n();
        zl zlVar = new zl(dh8VarQ, glVar, e50Var.i());
        ar3 ar3VarZ = f30.Z(t37Var, glVar);
        l37 l37Var = t37Var.X;
        if (ar3VarZ instanceof h50) {
            ((h50) ar3VarZ).t(t37Var);
        }
        ar3 ar3VarU = t37Var.u(ar3VarZ, zlVar);
        if (dh8VarQ.I0() || dh8VarQ.M()) {
            dh8 dh8VarZ0 = dh8VarQ.z0();
            nj7 nj7VarS = l37Var.d().s(l37Var, glVar, dh8VarQ);
            si8VarM = nj7VarS == null ? m(l37Var, dh8VarZ0) : nj7VarS.a(l37Var, dh8VarZ0, l37Var.f0.m(l37Var, glVar, dh8VarZ0));
        } else {
            si8VarM = null;
        }
        nj7 nj7VarA = l37Var.d().A(l37Var, glVar, dh8VarQ);
        si8 si8VarM2 = nj7VarA == null ? m(l37Var, dh8VarQ) : nj7VarA.a(l37Var, dh8VarQ, l37Var.f0.m(l37Var, glVar, dh8VarQ));
        m85 m85Var2 = (m85) blVar.X;
        boolean z5 = blVar.Y;
        l37 l37Var2 = (l37) blVar.Z;
        z20 z20Var = (z20) blVar.f0;
        vp4 vp4Var = z20Var.c;
        al alVar = z20Var.e;
        try {
            dh8 dh8VarF = blVar.f(glVar, z, dh8VarQ);
            if (si8VarM != null) {
                if (dh8VarF == null) {
                    dh8VarF = dh8VarQ;
                }
                if (dh8VarF.z0() == null) {
                    t37Var.B(z20Var, e50Var, "serialization type " + dh8VarF + " has no content", new Object[0]);
                    throw null;
                }
                dh8VarF = dh8VarF.P0(si8VarM);
                dh8VarF.getClass();
            }
            dh8 dh8Var = dh8VarF == null ? dh8VarQ : dh8VarF;
            gl glVarE = e50Var.e();
            if (glVarE == null) {
                t37Var.B(z20Var, e50Var, "could not determine property type", new Object[0]);
                throw null;
            }
            glVarE.N();
            si8 si8Var = si8VarM2;
            ep3 ep3Var = (ep3) blVar.h0;
            l37Var2.getClass();
            ep3[] ep3VarArr = {ep3Var, null, null};
            ep3 ep3Var2 = ep3.g0;
            dh8 dh8Var2 = dh8Var;
            ep3 ep3Var3 = null;
            for (int i = 0; i < 3; i++) {
                ep3 ep3VarA = ep3VarArr[i];
                if (ep3VarA != null) {
                    if (ep3Var3 != null) {
                        ep3VarA = ep3Var3.a(ep3VarA);
                    }
                    ep3Var3 = ep3VarA;
                }
            }
            ep3 ep3VarA2 = ep3Var3.a(e50Var.b());
            dp3 dp3Var = ep3VarA2.X;
            if (dp3Var == dp3.g0) {
                dp3Var = dp3.X;
            }
            int iOrdinal = dp3Var.ordinal();
            dp3 dp3Var2 = dp3.Z;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            if (z5) {
                                Object obj = blVar.g0;
                                if (obj == null) {
                                    boolean zF = l37Var2.f(xp4.q0);
                                    cl clVar = (cl) alVar.z0().Y;
                                    if (clVar == null) {
                                        objNewInstance = null;
                                    } else {
                                        if (zF) {
                                            boolean zF2 = vp4Var.f(xp4.r0);
                                            Member memberB0 = clVar.B0();
                                            if (memberB0 != null) {
                                                it0.d(memberB0, zF2);
                                            }
                                        }
                                        try {
                                            objNewInstance = clVar.E0.newInstance(null);
                                        } catch (Exception e) {
                                            e = e;
                                            while (e.getCause() != null) {
                                                e = e.getCause();
                                            }
                                            Annotation[] annotationArr = it0.a;
                                            if (e instanceof Error) {
                                                throw ((Error) e);
                                            }
                                            it0.w(e);
                                            throw new IllegalArgumentException("Failed to instantiate bean of type " + alVar.C0.getName() + ": (" + e.getClass().getName() + ") " + it0.h(e), e);
                                        }
                                    }
                                    obj = objNewInstance == null ? Boolean.FALSE : objNewInstance;
                                    blVar.g0 = obj;
                                }
                                Object obj2 = obj;
                                if (obj == Boolean.FALSE) {
                                    obj2 = null;
                                }
                                if (obj2 != null) {
                                    if (l37Var.f(xp4.q0)) {
                                        boolean zF3 = l37Var2.f(xp4.r0);
                                        Member memberB1 = glVar.B0();
                                        if (memberB1 != null) {
                                            it0.d(memberB1, zF3);
                                        }
                                    }
                                    try {
                                        objR = glVar.C0(obj2);
                                        z4 = false;
                                    } catch (Exception e2) {
                                        e = e2;
                                        String strJ = e50Var.j();
                                        while (e.getCause() != null) {
                                            e = e.getCause();
                                        }
                                        Annotation[] annotationArr2 = it0.a;
                                        if (e instanceof Error) {
                                            throw ((Error) e);
                                        }
                                        it0.w(e);
                                        StringBuilder sbP = p61.p("Failed to get property '", strJ, "' of default ");
                                        sbP.append(obj2.getClass().getName());
                                        sbP.append(" instance");
                                        throw new IllegalArgumentException(sbP.toString());
                                    }
                                } else {
                                    objR = ci8.r(dh8Var2);
                                    z4 = true;
                                }
                            } else {
                                objR = ci8.r(dh8Var2);
                                z4 = true;
                            }
                            if (objR == null) {
                                if (z5) {
                                    objW = objR;
                                }
                                z3 = true;
                            } else {
                                if (objR.getClass().isArray()) {
                                    objR = z51.y(objR);
                                }
                                z3 = z4;
                                objW = objR;
                            }
                        } else if (iOrdinal != 5) {
                            z2 = false;
                        } else {
                            objW = t37Var.w(ep3VarA2.Z);
                            z3 = false;
                        }
                    }
                    clsArrD = e50Var.d();
                    if (clsArrD == null) {
                        if (!z20Var.g) {
                            z20Var.g = true;
                            m85Var = z20Var.d;
                            if (m85Var == null) {
                                clsArrN = null;
                            } else {
                                clsArrN = m85Var.N(alVar);
                            }
                            if (clsArrN == null && !vp4Var.f(xp4.u0)) {
                                clsArrN = z20.j;
                            }
                            z20Var.f = clsArrN;
                        }
                        clsArrD = z20Var.f;
                    }
                    f50Var = new f50(e50Var, glVar, alVar.K0, dh8VarQ, ar3VarU, si8Var, dh8VarF, z3, objW, clsArrD);
                    objO = m85Var2.o(glVar);
                    if (objO != null) {
                        f50Var.f(t37Var.D(glVar, objO));
                    }
                    c25VarM = m85Var2.M(glVar);
                    if (c25VarM != null) {
                        return new no8(f50Var, c25VarM);
                    }
                    return f50Var;
                }
                if (!dh8Var2.M()) {
                    z3 = true;
                    objW = null;
                    clsArrD = e50Var.d();
                    if (clsArrD == null) {
                        if (!z20Var.g) {
                            z20Var.g = true;
                            m85Var = z20Var.d;
                            if (m85Var == null) {
                                clsArrN = null;
                            } else {
                                clsArrN = m85Var.N(alVar);
                            }
                            if (clsArrN == null) {
                                clsArrN = z20.j;
                            }
                            z20Var.f = clsArrN;
                        }
                        clsArrD = z20Var.f;
                    }
                    f50Var = new f50(e50Var, glVar, alVar.K0, dh8VarQ, ar3VarU, si8Var, dh8VarF, z3, objW, clsArrD);
                    objO = m85Var2.o(glVar);
                    if (objO != null) {
                        f50Var.f(t37Var.D(glVar, objO));
                    }
                    c25VarM = m85Var2.M(glVar);
                    if (c25VarM != null) {
                        return new no8(f50Var, c25VarM);
                    }
                    return f50Var;
                }
                objW = dp3Var2;
                z3 = true;
                clsArrD = e50Var.d();
                if (clsArrD == null) {
                    if (!z20Var.g) {
                        z20Var.g = true;
                        m85Var = z20Var.d;
                        if (m85Var == null) {
                            clsArrN = null;
                        } else {
                            clsArrN = m85Var.N(alVar);
                        }
                        if (clsArrN == null) {
                            clsArrN = z20.j;
                        }
                        z20Var.f = clsArrN;
                    }
                    clsArrD = z20Var.f;
                }
                f50Var = new f50(e50Var, glVar, alVar.K0, dh8VarQ, ar3VarU, si8Var, dh8VarF, z3, objW, clsArrD);
                objO = m85Var2.o(glVar);
                if (objO != null) {
                    f50Var.f(t37Var.D(glVar, objO));
                }
                c25VarM = m85Var2.M(glVar);
                if (c25VarM != null) {
                    return new no8(f50Var, c25VarM);
                }
                return f50Var;
            }
            z2 = true;
            n37 n37Var = n37.u0;
            if (!dh8Var2.I0() || l37Var2.j(n37Var)) {
                z3 = z2;
                objW = null;
            } else {
                z3 = z2;
                objW = dp3Var2;
            }
            clsArrD = e50Var.d();
            if (clsArrD == null) {
                if (!z20Var.g) {
                    z20Var.g = true;
                    m85Var = z20Var.d;
                    if (m85Var == null) {
                        clsArrN = null;
                    } else {
                        clsArrN = m85Var.N(alVar);
                    }
                    if (clsArrN == null) {
                        clsArrN = z20.j;
                    }
                    z20Var.f = clsArrN;
                }
                clsArrD = z20Var.f;
            }
            f50Var = new f50(e50Var, glVar, alVar.K0, dh8VarQ, ar3VarU, si8Var, dh8VarF, z3, objW, clsArrD);
            objO = m85Var2.o(glVar);
            if (objO != null) {
                f50Var.f(t37Var.D(glVar, objO));
            }
            c25VarM = m85Var2.M(glVar);
            if (c25VarM != null) {
                return new no8(f50Var, c25VarM);
            }
            return f50Var;
        } catch (pp3 e3) {
            t37Var.B(z20Var, e50Var, it0.h(e3), new Object[0]);
            throw null;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36651. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final defpackage.ar3 b0(defpackage.t37 r48, defpackage.dh8 r49, defpackage.z20 r50, boolean r51) {
        /*
            Method dump skipped, instruction units count: 3665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j50.b0(t37, dh8, z20, boolean):ar3");
    }
}
