package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lk3 implements f72 {
    @Override // defpackage.f72
    public final int a() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.f72
    public final int b(jd0 jd0Var, jd0 jd0Var2, sx4 sx4Var) {
        boolean z;
        ho2 ho2Var;
        jd0Var.getClass();
        jd0Var2.getClass();
        if ((jd0Var instanceof ld0) && (jd0Var2 instanceof ho2) && !zz3.A(jd0Var2)) {
            int i = ta0.l;
            ho2 ho2Var2 = (ho2) jd0Var2;
            fd1 fd1Var = (fd1) ho2Var2;
            v15 name = fd1Var.getName();
            name.getClass();
            if (ff7.e.contains(name)) {
                ld0 ld0VarB = gv3.B((ld0) jd0Var);
                z = jd0Var instanceof ho2;
                if (z) {
                    ho2Var = (ho2) jd0Var;
                } else {
                    ho2Var = null;
                }
                if (ho2Var == null) {
                    if (sx4Var instanceof p44) {
                        if (w39.u(jd0Var, jd0Var2)) {
                            return 3;
                        }
                    } else if (w39.u(jd0Var, jd0Var2)) {
                        return 3;
                    }
                } else if (sx4Var instanceof p44) {
                    if (w39.u(jd0Var, jd0Var2)) {
                        return 3;
                    }
                } else if (w39.u(jd0Var, jd0Var2)) {
                    return 3;
                }
            } else {
                ArrayList arrayList = ff7.a;
                v15 name2 = fd1Var.getName();
                name2.getClass();
                if (ff7.j.contains(name2)) {
                    ld0 ld0VarB2 = gv3.B((ld0) jd0Var);
                    z = jd0Var instanceof ho2;
                    if (z) {
                        ho2Var = (ho2) jd0Var;
                    } else {
                        ho2Var = null;
                    }
                    if ((ho2Var == null && ho2Var2.c0() == ho2Var.c0()) || (ld0VarB2 != null && ho2Var2.c0())) {
                        if ((sx4Var instanceof p44) || ho2Var2.O() != null || ld0VarB2 == null || gv3.D(sx4Var, ld0VarB2)) {
                            if (w39.u(jd0Var, jd0Var2)) {
                                return 3;
                            }
                        } else if ((ld0VarB2 instanceof ho2) && z && ta0.a((ho2) ld0VarB2) != null) {
                            String strY = w45.y(ho2Var2, 2);
                            ho2 ho2VarA = ((ho2) jd0Var).a();
                            ho2VarA.getClass();
                            if (strY.equals(w45.y(ho2VarA, 2))) {
                                if (w39.u(jd0Var, jd0Var2)) {
                                    return 3;
                                }
                            }
                        }
                    }
                } else if (w39.u(jd0Var, jd0Var2)) {
                    return 3;
                }
            }
        } else if (w39.u(jd0Var, jd0Var2)) {
            return 3;
        }
        return 2;
    }
}
