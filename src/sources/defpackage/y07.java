package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y07 {
    public final jx4 a;
    public final boolean b;
    public final LayoutNode c;
    public final t07 d;
    public y07 e;
    public final int f;

    public y07(jx4 jx4Var, boolean z, LayoutNode layoutNode, t07 t07Var) {
        this.a = jx4Var;
        this.b = z;
        this.c = layoutNode;
        this.d = t07Var;
        this.f = layoutNode.Y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [jx4] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [jx4] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [c15] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [c15] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final s86 a(i55 i55Var) {
        ?? T;
        y07 y07VarL = l();
        if (y07VarL == null) {
            return s86.e;
        }
        jx4 jx4Var = (jx4) y07VarL.c.H0.i0;
        if ((jx4Var.f0 & 8) == 0) {
            T = 0;
            break;
        }
        loop0: while (true) {
            if (jx4Var != null) {
                if ((jx4Var.Z & 8) != 0) {
                    T = jx4Var;
                    ?? c15Var = 0;
                    while (T != 0) {
                        if (T instanceof w07) {
                            if (((w07) T).k()) {
                                break loop0;
                            }
                        } else if ((T.Z & 8) != 0 && (T instanceof oh1)) {
                            jx4 jx4Var2 = ((oh1) T).r0;
                            int i = 0;
                            while (jx4Var2 != null) {
                                if ((jx4Var2.Z & 8) != 0) {
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
                if ((jx4Var.f0 & 8) != 0) {
                    jx4Var = jx4Var.h0;
                }
            }
            T = 0;
            break;
        }
        w07 w07Var = (w07) T;
        i55 i55VarX = w07Var != null ? yn0.X(w07Var, 8) : null;
        return i55VarX == null ? y07VarL.a(i55Var) : i55VarX.H(i55Var, true);
    }

    public final y07 b(kl6 kl6Var, gn2 gn2Var) {
        t07 t07Var = new t07();
        t07Var.Z = false;
        t07Var.f0 = false;
        gn2Var.B(t07Var);
        y07 y07Var = new y07(new x07(gn2Var), false, new LayoutNode(this.f + (kl6Var != null ? Http2Connection.DEGRADED_PONG_TIMEOUT_NS : 2000000000), true), t07Var);
        y07Var.e = this;
        return y07Var;
    }

    public final void c(LayoutNode layoutNode, ArrayList arrayList) {
        c15 c15VarB = layoutNode.B();
        Object[] objArr = c15VarB.X;
        int i = c15VarB.Z;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.K() && !layoutNode2.Q0) {
                if (layoutNode2.H0.j(8)) {
                    arrayList.add(dh3.c(layoutNode2, this.b));
                } else {
                    c(layoutNode2, arrayList);
                }
            }
        }
    }

    public final i55 d() {
        if (!n()) {
            w07 w07VarF = f();
            return w07VarF != null ? yn0.X(w07VarF, 8) : (fd3) this.c.H0.f0;
        }
        y07 y07VarL = l();
        if (y07VarL != null) {
            return y07VarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            y07 y07Var = (y07) arrayList.get(size2);
            if (y07Var.o()) {
                arrayList2.add(y07Var);
            } else if (!y07Var.d.f0) {
                y07Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [jx4] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [jx4] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [c15] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [c15] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final w07 f() {
        ?? T;
        boolean z;
        ?? r0;
        boolean z2 = this.d.Z;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        LayoutNode layoutNode = this.c;
        if (!z2) {
            jx4 jx4Var = (jx4) layoutNode.H0.i0;
            if ((jx4Var.f0 & 8) != 0) {
                loop3: while (jx4Var != null) {
                    if ((jx4Var.Z & 8) != 0) {
                        T = jx4Var;
                        ?? c15Var = 0;
                        while (true) {
                            if (T != 0) {
                                if (T instanceof w07) {
                                    if (((w07) T).k()) {
                                        r4 = T;
                                    }
                                } else if ((T.Z & 8) != 0 && (T instanceof oh1)) {
                                    jx4 jx4Var2 = ((oh1) T).r0;
                                    int i = 0;
                                    while (jx4Var2 != null) {
                                        if ((jx4Var2.Z & 8) != 0) {
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
                    }
                    if ((jx4Var.f0 & 8) == 0) {
                        break;
                    }
                    jx4Var = jx4Var.h0;
                }
            }
        } else {
            jx4 jx4Var3 = (jx4) layoutNode.H0.i0;
            if ((jx4Var3.f0 & 8) != 0) {
                T = 0;
                while (jx4Var3 != null) {
                    if ((jx4Var3.Z & 8) != 0) {
                        jx4 jx4VarT = jx4Var3;
                        c15 c15Var2 = null;
                        while (jx4VarT != null) {
                            if (jx4VarT instanceof w07) {
                                w07 w07Var = (w07) jx4VarT;
                                if (w07Var.k()) {
                                    if (w07Var.I0()) {
                                        r0 = T;
                                        r0 = T;
                                        return w07Var;
                                    }
                                    if (T == 0) {
                                        r0 = w07Var;
                                    }
                                }
                                r0 = T;
                                z = false;
                                T = r0;
                            } else {
                                z = true;
                            }
                            if (z) {
                                T = T;
                                if ((jx4VarT.Z & 8) != 0 && (jx4VarT instanceof oh1)) {
                                    int i2 = 0;
                                    for (jx4 jx4Var4 = ((oh1) jx4VarT).r0; jx4Var4 != null; jx4Var4 = jx4Var4.h0) {
                                        if ((jx4Var4.Z & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                jx4VarT = jx4Var4;
                                            } else {
                                                if (c15Var2 == null) {
                                                    c15Var2 = new c15(0, new jx4[16]);
                                                }
                                                if (jx4VarT != null) {
                                                    c15Var2.b(jx4VarT);
                                                    jx4VarT = null;
                                                }
                                                c15Var2.b(jx4Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            } else {
                                T = T;
                            }
                            jx4VarT = yn0.T(c15Var2);
                        }
                    }
                    if ((jx4Var3.f0 & 8) == 0) {
                        break;
                    }
                    jx4Var3 = jx4Var3.h0;
                    T = T;
                }
                r4 = T;
            }
        }
        return (w07) r4;
    }

    public final s86 g() {
        i55 i55VarD = d();
        if (i55VarD != null) {
            if (!i55VarD.V0().p0) {
                i55VarD = null;
            }
            if (i55VarD != null) {
                return jm4.x(i55VarD).H(i55VarD, true);
            }
        }
        return s86.e;
    }

    public final s86 h() {
        i55 i55VarD = d();
        if (i55VarD != null) {
            if (!i55VarD.V0().p0) {
                i55VarD = null;
            }
            if (i55VarD != null) {
                return jm4.r(i55VarD, true);
            }
        }
        return s86.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.f0) {
            return d02.X;
        }
        ArrayList arrayList = new ArrayList();
        if (!o()) {
            return q(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final t07 k() {
        boolean zO = o();
        t07 t07Var = this.d;
        if (!zO) {
            return t07Var;
        }
        t07 t07VarB = t07Var.b();
        p(new ArrayList(), t07VarB);
        return t07VarB;
    }

    public final y07 l() {
        LayoutNode layoutNodeW;
        y07 y07Var = this.e;
        if (y07Var != null) {
            return y07Var;
        }
        LayoutNode layoutNode = this.c;
        boolean z = this.b;
        if (!z) {
            layoutNodeW = null;
            break;
        }
        layoutNodeW = layoutNode.w();
        while (true) {
            if (layoutNodeW == null) {
                layoutNodeW = null;
                break;
            }
            t07 t07VarY = layoutNodeW.y();
            if (t07VarY != null && t07VarY.Z) {
                break;
            }
            layoutNodeW = layoutNodeW.w();
        }
        if (layoutNodeW == null) {
            for (LayoutNode layoutNodeW2 = layoutNode.w(); layoutNodeW2 != null; layoutNodeW2 = layoutNodeW2.w()) {
                if (layoutNodeW2.H0.j(8)) {
                    layoutNodeW = layoutNodeW2;
                }
            }
            layoutNodeW = null;
        }
        if (layoutNodeW == null) {
            return null;
        }
        return dh3.c(layoutNodeW, z);
    }

    public final s86 m() {
        nh1 nh1VarF = f();
        if (nh1VarF == null) {
            return ((fd3) this.c.H0.f0).s1();
        }
        jx4 jx4Var = ((jx4) nh1VarF).X;
        Object objG = this.d.X.g(s07.b);
        if (objG == null) {
            objG = null;
        }
        return ch3.s(jx4Var, objG != null, true);
    }

    public final boolean n() {
        return this.e != null;
    }

    public final boolean o() {
        return this.b && this.d.Z;
    }

    public final void p(ArrayList arrayList, t07 t07Var) {
        if (this.d.f0) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            y07 y07Var = (y07) arrayList.get(size2);
            if (!y07Var.o()) {
                t07Var.e(y07Var.d);
                y07Var.p(arrayList, t07Var);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z) {
        if (n()) {
            return d02.X;
        }
        c(this.c, arrayList);
        if (z) {
            t07 t07Var = this.d;
            s05 s05Var = t07Var.X;
            Object objG = s05Var.g(c17.z);
            if (objG == null) {
                objG = null;
            }
            kl6 kl6Var = (kl6) objG;
            if (kl6Var != null && t07Var.Z && !arrayList.isEmpty()) {
                arrayList.add(b(kl6Var, new t16((Object) kl6Var, (byte) 15)));
            }
            e17 e17Var = c17.a;
            if (s05Var.c(e17Var) && !arrayList.isEmpty() && t07Var.Z) {
                Object objG2 = s05Var.g(e17Var);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) wv0.t0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new m40(str, (byte) 27)));
                }
            }
        }
        return arrayList;
    }
}
