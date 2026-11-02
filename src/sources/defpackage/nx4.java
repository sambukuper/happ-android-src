package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface nx4 extends nh1 {
    default wl7 Z() {
        return f02.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [nh1, nx4] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [jx4] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [jx4] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [c15] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [c15] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    default Object f() {
        t6 t6Var;
        r06 r06Var = pu.z;
        jx4 jx4Var = (jx4) this;
        if (!jx4Var.X.p0) {
            wc3.a("ModifierLocal accessed from an unattached node");
        }
        if (!jx4Var.X.p0) {
            wc3.b("visitAncestors called on an unattached node");
        }
        jx4 jx4Var2 = jx4Var.X.g0;
        LayoutNode layoutNodeZ = yn0.Z(this);
        while (layoutNodeZ != null) {
            if ((((jx4) layoutNodeZ.H0.i0).f0 & 32) != 0) {
                while (jx4Var2 != null) {
                    if ((jx4Var2.Z & 32) != 0) {
                        ?? T = jx4Var2;
                        ?? c15Var = 0;
                        while (T != 0) {
                            if (T instanceof nx4) {
                                nx4 nx4Var = (nx4) T;
                                if (nx4Var.Z().v(r06Var)) {
                                    return nx4Var.Z().C(r06Var);
                                }
                            } else if ((T.Z & 32) != 0 && (T instanceof oh1)) {
                                jx4 jx4Var3 = ((oh1) T).r0;
                                int i = 0;
                                T = T;
                                c15Var = c15Var;
                                while (jx4Var3 != null) {
                                    if ((jx4Var3.Z & 32) != 0) {
                                        i++;
                                        if (i == 1) {
                                            c15Var = c15Var;
                                            T = jx4Var3;
                                        } else {
                                            if (c15Var == 0) {
                                                c15Var = new c15(0, new jx4[16]);
                                            }
                                            if (T != 0) {
                                                c15Var.b(T);
                                                T = 0;
                                            }
                                            c15Var.b(jx4Var3);
                                        }
                                    }
                                    jx4Var3 = jx4Var3.h0;
                                    T = T;
                                    c15Var = c15Var;
                                }
                                if (i == 1) {
                                }
                            }
                            T = yn0.T(c15Var);
                        }
                    }
                    jx4Var2 = jx4Var2.g0;
                }
            }
            layoutNodeZ = layoutNodeZ.w();
            jx4Var2 = (layoutNodeZ == null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
        }
        return r06Var.a.invoke();
    }
}
