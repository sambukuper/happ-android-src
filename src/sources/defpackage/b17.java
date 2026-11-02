package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b17 {
    public final LayoutNode a;
    public final k02 b;
    public final ff3 c;
    public final j05 d = new j05(2);

    public b17(LayoutNode layoutNode, k02 k02Var, vz4 vz4Var) {
        this.a = layoutNode;
        this.b = k02Var;
        this.c = vz4Var;
    }

    public final y07 a() {
        return new y07(this.b, false, this.a, new t07());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    public final void b(LayoutNode layoutNode, t07 t07Var) {
        wc wcVar;
        wc wcVar2;
        String str;
        String str2;
        ib8 ib8Var;
        ib8 ib8Var2;
        ga2 ga2Var;
        ga2 ga2Var2;
        j05 j05Var = this.d;
        Object[] objArr = j05Var.a;
        int i = j05Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ua uaVar = (ua) ((u07) objArr[i2]);
            uaVar.getClass();
            t07 t07VarY = layoutNode.y();
            int i3 = layoutNode.Y;
            mo5 mo5Var = uaVar.X;
            AndroidComposeView androidComposeView = uaVar.Z;
            if (t07Var != null) {
                Object objG = t07Var.X.g(c17.s);
                if (objG == null) {
                    objG = null;
                }
                wcVar = (wc) objG;
            } else {
                wcVar = null;
            }
            if (t07VarY != null) {
                Object objG2 = t07VarY.X.g(c17.s);
                if (objG2 == null) {
                    objG2 = null;
                }
                wcVar2 = (wc) objG2;
            } else {
                wcVar2 = null;
            }
            wc wcVar3 = oy1.m0;
            if (!dh3.f(wcVar2, wcVar3)) {
                if (dh3.f(wcVar, wcVar3) && !dh3.f(wcVar2, wcVar3)) {
                    mo5Var.f(androidComposeView, i3, true);
                }
                if (t07Var != null) {
                    Object objG3 = t07Var.X.g(c17.F);
                    if (objG3 == null) {
                        objG3 = null;
                    }
                    ql qlVar = (ql) objG3;
                    if (qlVar != null) {
                        str = qlVar.Y;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (t07VarY != null) {
                    Object objG4 = t07VarY.X.g(c17.F);
                    if (objG4 == null) {
                        objG4 = null;
                    }
                    ql qlVar2 = (ql) objG4;
                    if (qlVar2 != null) {
                        str2 = qlVar2.Y;
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                }
                if (str != str2) {
                    if (str == null) {
                        mo5Var.f(androidComposeView, i3, true);
                    } else if (str2 == null) {
                        mo5Var.f(androidComposeView, i3, false);
                    } else if (dh3.f(wcVar2, oy1.n0)) {
                        mo5Var.c(androidComposeView, i3, ue3.u(str2));
                    }
                }
                if (t07Var != null) {
                    Object objG5 = t07Var.X.g(c17.L);
                    if (objG5 == null) {
                        objG5 = null;
                    }
                    ib8Var = (ib8) objG5;
                } else {
                    ib8Var = null;
                }
                if (t07VarY != null) {
                    Object objG6 = t07VarY.X.g(c17.L);
                    if (objG6 == null) {
                        objG6 = null;
                    }
                    ib8Var2 = (ib8) objG6;
                } else {
                    ib8Var2 = null;
                }
                if (ib8Var != ib8Var2) {
                    if (ib8Var == null) {
                        mo5Var.f(androidComposeView, i3, true);
                    } else if (ib8Var2 == null) {
                        mo5Var.f(androidComposeView, i3, false);
                    } else if (dh3.f(wcVar2, oy1.o0)) {
                        int iOrdinal = ib8Var2.ordinal();
                        Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                        if (bool != null) {
                            mo5Var.c(androidComposeView, i3, ue3.v(bool.booleanValue()));
                        }
                    }
                }
                if (t07Var != null) {
                    Object objG7 = t07Var.X.g(c17.t);
                    if (objG7 == null) {
                        objG7 = null;
                    }
                    ga2Var = (ga2) objG7;
                } else {
                    ga2Var = null;
                }
                if (t07VarY != null) {
                    Object objG8 = t07VarY.X.g(c17.t);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    ga2Var2 = (ga2) objG8;
                } else {
                    ga2Var2 = null;
                }
                if (!dh3.f(ga2Var, ga2Var2)) {
                    if (ga2Var == null) {
                        mo5Var.f(androidComposeView, i3, true);
                    } else if (ga2Var2 == null) {
                        mo5Var.f(androidComposeView, i3, false);
                    } else {
                        mo5Var.c(androidComposeView, i3, ((yd) ga2Var2).a);
                    }
                }
            } else if (!dh3.f(wcVar, wcVar3)) {
                mo5Var.f(androidComposeView, i3, false);
            }
            boolean z = t07Var != null && t07Var.X.b(c17.r);
            boolean z2 = t07VarY != null && t07VarY.X.b(c17.r);
            if (z != z2) {
                wz4 wz4Var = uaVar.j0;
                if (z2) {
                    wz4Var.a(i3);
                } else {
                    wz4Var.e(i3);
                }
            }
        }
    }
}
