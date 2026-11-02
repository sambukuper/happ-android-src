package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f55 implements h55 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [c15] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [c15] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r8v0, types: [jx4] */
    /* JADX WARN: Type inference failed for: r8v1, types: [jx4] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [jx4] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.h55
    public final boolean c(jx4 jx4Var) {
        ?? c15Var = 0;
        while (jx4Var != 0) {
            if (jx4Var instanceof kq5) {
                if (((kq5) jx4Var).P()) {
                    return true;
                }
            } else if ((jx4Var.Z & 16) != 0 && (jx4Var instanceof oh1)) {
                jx4 jx4Var2 = ((oh1) jx4Var).r0;
                int i = 0;
                while (jx4Var2 != null) {
                    if ((jx4Var2.Z & 16) != 0) {
                        i++;
                        if (i == 1) {
                            c15Var = c15Var;
                            jx4Var = jx4Var;
                            c15Var = c15Var;
                            jx4Var = jx4Var2;
                        } else {
                            if (c15Var == 0) {
                                c15Var = new c15(0, new jx4[16]);
                            }
                            if (jx4Var != 0) {
                                c15Var.b(jx4Var);
                                jx4Var = 0;
                            }
                            c15Var.b(jx4Var2);
                        }
                    } else {
                        c15Var = c15Var;
                        jx4Var = jx4Var;
                    }
                    jx4Var2 = jx4Var2.h0;
                    c15Var = c15Var;
                    jx4Var = jx4Var;
                }
                if (i == 1) {
                    c15Var = c15Var;
                    jx4Var = jx4Var;
                } else {
                    c15Var = c15Var;
                    jx4Var = jx4Var;
                }
            }
            jx4Var = yn0.T(c15Var);
        }
        return false;
    }

    @Override // defpackage.h55
    public final int e() {
        return 16;
    }

    @Override // defpackage.h55
    public final void h(LayoutNode layoutNode, long j, q03 q03Var, int i, boolean z) {
        layoutNode.D(j, q03Var, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [jx4] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [jx4] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [c15] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [c15] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.h55
    public final boolean l(q03 q03Var, LayoutNode layoutNode) {
        i55 outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        outerCoordinator$ui.getClass();
        jx4 jx4VarY0 = outerCoordinator$ui.Y0(j55.g(16));
        if (jx4VarY0 != null && jx4VarY0.p0) {
            if (!jx4VarY0.X.p0) {
                wc3.b("visitLocalDescendants called on an unattached node");
            }
            jx4 jx4Var = jx4VarY0.X;
            if ((jx4Var.f0 & 16) != 0) {
                while (jx4Var != null) {
                    if ((jx4Var.Z & 16) != 0) {
                        ?? T = jx4Var;
                        ?? c15Var = 0;
                        while (T != 0) {
                            if (T instanceof kq5) {
                                if (((kq5) T).B0()) {
                                    q03Var.Z = q03Var.X.b - 1;
                                    return true;
                                }
                            } else if ((T.Z & 16) != 0 && (T instanceof oh1)) {
                                jx4 jx4Var2 = ((oh1) T).r0;
                                int i = 0;
                                while (jx4Var2 != null) {
                                    if ((jx4Var2.Z & 16) != 0) {
                                        i++;
                                        if (i == 1) {
                                            T = T;
                                            c15Var = c15Var;
                                            c15Var = c15Var;
                                            T = jx4Var2;
                                        } else {
                                            if (c15Var == 0) {
                                                c15Var = new c15(0, new jx4[16]);
                                            }
                                            if (T != 0) {
                                                c15Var.b(T);
                                                T = 0;
                                            }
                                            c15Var.b(jx4Var2);
                                        }
                                    } else {
                                        T = T;
                                        c15Var = c15Var;
                                    }
                                    jx4Var2 = jx4Var2.h0;
                                    T = T;
                                    c15Var = c15Var;
                                }
                                if (i == 1) {
                                    T = T;
                                    c15Var = c15Var;
                                } else {
                                    T = T;
                                    c15Var = c15Var;
                                }
                            }
                            T = yn0.T(c15Var);
                        }
                    }
                    jx4Var = jx4Var.h0;
                }
            }
        }
        return false;
    }

    @Override // defpackage.h55
    public final boolean n(LayoutNode layoutNode) {
        return true;
    }
}
