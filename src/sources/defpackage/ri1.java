package defpackage;

import android.os.Trace;
import androidx.compose.ui.node.LayoutNode;
import androidx.constraintlayout.widget.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ri1 {
    public boolean a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public RandomAccess f;
    public Object g;
    public Object h;

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static boolean g(LayoutNode layoutNode, q31 q31Var) {
        boolean zR0;
        LayoutNode layoutNode2 = layoutNode.k0;
        r34 r34Var = layoutNode.I0;
        if (layoutNode2 == null) {
            return false;
        }
        if (q31Var == null) {
            bj4 bj4Var = r34Var.q;
            q31 q31Var2 = bj4Var != null ? bj4Var.p0 : null;
            if (q31Var2 == null || layoutNode2 == null) {
                zR0 = false;
            } else {
                bj4Var.getClass();
                zR0 = bj4Var.r0(q31Var2.a);
            }
        } else if (layoutNode2 != null) {
            bj4 bj4Var2 = r34Var.q;
            bj4Var2.getClass();
            zR0 = bj4Var2.r0(q31Var.a);
        } else {
            zR0 = false;
        }
        LayoutNode layoutNodeW = layoutNode.w();
        if (zR0 && layoutNodeW != null) {
            if (layoutNodeW.k0 == null) {
                LayoutNode.Y(layoutNodeW, false, 3);
                return zR0;
            }
            if (layoutNode.s() == m34.X) {
                LayoutNode.W(layoutNodeW, false, 3);
                return zR0;
            }
            if (layoutNode.s() == m34.Y) {
                layoutNodeW.V(false);
            }
        }
        return zR0;
    }

    public static boolean h(LayoutNode layoutNode, q31 q31Var) {
        boolean zR0;
        m34 m34Var = m34.Z;
        if (q31Var != null) {
            if (layoutNode.E0 == m34Var) {
                layoutNode.e();
            }
            zR0 = layoutNode.I0.p.r0(q31Var.a);
        } else {
            wr4 wr4Var = layoutNode.I0.p;
            q31 q31Var2 = wr4Var.l0 ? new q31(wr4Var.f0) : null;
            if (q31Var2 != null) {
                if (layoutNode.E0 == m34Var) {
                    layoutNode.e();
                }
                zR0 = layoutNode.I0.p.r0(q31Var2.a);
            } else {
                layoutNode.getClass();
                zR0 = false;
            }
        }
        LayoutNode layoutNodeW = layoutNode.w();
        if (zR0 && layoutNodeW != null) {
            if (layoutNode.r() == m34.X) {
                LayoutNode.Y(layoutNodeW, false, 3);
                return zR0;
            }
            if (layoutNode.r() == m34.Y) {
                layoutNodeW.X(false);
            }
        }
        return zR0;
    }

    public static boolean n(LayoutNode layoutNode) {
        bj4 bj4Var;
        o34 o34Var;
        if (layoutNode.I0.e) {
            return (layoutNode.s() == m34.Z && ((bj4Var = layoutNode.I0.q) == null || (o34Var = bj4Var.u0) == null || !o34Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean o(LayoutNode layoutNode) {
        if (!layoutNode.q()) {
            return false;
        }
        do {
            if (layoutNode.r() == m34.Z && !layoutNode.I0.p.A0.e()) {
                LayoutNode layoutNodeW = layoutNode.w();
                if ((layoutNodeW != null ? layoutNodeW.I0.d : null) != k34.X) {
                    return false;
                }
            }
            layoutNode = layoutNode.w();
            if (layoutNode == null) {
                return false;
            }
        } while (!layoutNode.L());
        return true;
    }

    public static boolean p(LayoutNode layoutNode) {
        bj4 bj4Var;
        o34 o34Var;
        r34 r34Var = layoutNode.I0;
        return layoutNode.L() || r34Var.p.w0 || o(layoutNode) || dh3.f(layoutNode.M(), Boolean.TRUE) || n(layoutNode) || r34Var.p.A0.e() || !((bj4Var = r34Var.q) == null || (o34Var = bj4Var.u0) == null || !o34Var.e());
    }

    public void A(long j) {
        LayoutNode layoutNode = (LayoutNode) this.c;
        q31 q31Var = (q31) this.h;
        if (q31Var == null ? false : q31.b(q31Var.a, j)) {
            return;
        }
        if (this.a) {
            wc3.a("updateRootConstraints called while measuring");
        }
        this.h = new q31(j);
        boolean zK = layoutNode.K();
        r34 r34Var = layoutNode.I0;
        if (zK) {
            LayoutNode layoutNode2 = layoutNode.k0;
            if (layoutNode2 != null) {
                r34Var.e = true;
            }
            r34Var.p.x0 = true;
            ((lr) this.d).a(layoutNode, layoutNode2 != null ? bi3.X : bi3.Z);
        }
    }

    public void a(si1 si1Var, int i, ArrayList arrayList, br6 br6Var) {
        k09 k09Var = si1Var.d;
        br6 br6Var2 = k09Var.c;
        si1 si1Var2 = k09Var.i;
        si1 si1Var3 = k09Var.h;
        if (br6Var2 == null) {
            n31 n31Var = (n31) this.c;
            if (k09Var == n31Var.d || k09Var == n31Var.e) {
                return;
            }
            if (br6Var == null) {
                br6Var = new br6();
                br6Var.a = null;
                br6Var.b = new ArrayList();
                br6Var.a = k09Var;
                arrayList.add(br6Var);
            }
            k09Var.c = br6Var;
            br6Var.b.add(k09Var);
            for (mi1 mi1Var : si1Var3.k) {
                if (mi1Var instanceof si1) {
                    a((si1) mi1Var, i, arrayList, br6Var);
                }
            }
            for (mi1 mi1Var2 : si1Var2.k) {
                if (mi1Var2 instanceof si1) {
                    a((si1) mi1Var2, i, arrayList, br6Var);
                }
            }
            if (i == 1 && (k09Var instanceof kv8)) {
                for (mi1 mi1Var3 : ((kv8) k09Var).k.k) {
                    if (mi1Var3 instanceof si1) {
                        a((si1) mi1Var3, i, arrayList, br6Var);
                    }
                }
            }
            Iterator it = si1Var3.l.iterator();
            while (it.hasNext()) {
                a((si1) it.next(), i, arrayList, br6Var);
            }
            Iterator it2 = si1Var2.l.iterator();
            while (it2.hasNext()) {
                a((si1) it2.next(), i, arrayList, br6Var);
            }
            if (i == 1 && (k09Var instanceof kv8)) {
                Iterator it3 = ((kv8) k09Var).k.l.iterator();
                while (it3.hasNext()) {
                    a((si1) it3.next(), i, arrayList, br6Var);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:114:0x020f  */
    /* JADX WARN: Code duplicated, block: B:121:0x024c  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:145:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:147:0x0311  */
    /* JADX WARN: Code duplicated, block: B:153:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0215 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0254 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x020b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0208 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x000a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:94:0x019c  */
    /* JADX WARN: Code duplicated, block: B:95:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x01a7 A[DONT_INVERT] */
    public void b(n31 n31Var) {
        int i;
        int iQ;
        int iK;
        int iK2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f;
        int i12;
        int i13;
        ArrayList<m31> arrayList = n31Var.q0;
        int[] iArr = n31Var.p0;
        for (m31 m31Var : arrayList) {
            int[] iArr2 = m31Var.p0;
            u21[] u21VarArr = m31Var.Q;
            u21 u21Var = m31Var.L;
            u21 u21Var2 = m31Var.J;
            u21 u21Var3 = m31Var.K;
            u21 u21Var4 = m31Var.I;
            int i14 = iArr2[0];
            int i15 = iArr2[1];
            if (m31Var.g0 == 8) {
                m31Var.a = true;
            } else {
                float f2 = m31Var.w;
                if (f2 < 1.0f && i14 == 3) {
                    m31Var.r = 2;
                }
                float f3 = m31Var.z;
                if (f3 < 1.0f && i15 == 3) {
                    m31Var.s = 2;
                }
                if (m31Var.W > 0.0f) {
                    if (i14 == 3 && (i15 == 2 || i15 == 1)) {
                        m31Var.r = 3;
                    } else if (i15 == 3 && (i14 == 2 || i14 == 1)) {
                        m31Var.s = 3;
                    } else if (i14 == 3 && i15 == 3) {
                        if (m31Var.r == 0) {
                            m31Var.r = 3;
                        }
                        if (m31Var.s == 0) {
                            m31Var.s = 3;
                        }
                    }
                }
                if (i14 == 3 && m31Var.r == 1 && (u21Var4.f == null || u21Var3.f == null)) {
                    i14 = 2;
                }
                if (i15 == 3 && m31Var.s == 1 && (u21Var2.f == null || u21Var.f == null)) {
                    i15 = 2;
                }
                y03 y03Var = m31Var.d;
                y03Var.d = i14;
                int i16 = m31Var.r;
                y03Var.a = i16;
                kv8 kv8Var = m31Var.e;
                kv8Var.d = i15;
                int i17 = m31Var.s;
                kv8Var.a = i17;
                if (i14 == 4 || i14 == 1) {
                    if (i15 == 4) {
                        if (i15 != 1) {
                            i3 = 2;
                            if (i15 != 2) {
                                if (i14 != 3) {
                                    i4 = i15;
                                    i5 = 1;
                                } else if (i15 == i3 && i15 != 1) {
                                    i4 = i15;
                                    i6 = 3;
                                    i5 = 1;
                                    if (i4 == i6) {
                                        if (i14 == i3 && i14 != i5) {
                                            i10 = i6;
                                            i7 = i4;
                                            i8 = i3;
                                        } else if (i17 == i6) {
                                            if (i14 == i3) {
                                                q(i3, 0, i3, 0, m31Var);
                                            }
                                            int iQ2 = m31Var.q();
                                            f = m31Var.W;
                                            if (m31Var.X == -1) {
                                                f = 1.0f / f;
                                            }
                                            q(i5, iQ2, i5, (int) ((iQ2 * f) + 0.5f), m31Var);
                                            m31Var.d.e.d(m31Var.q());
                                            m31Var.e.e.d(m31Var.k());
                                            m31Var.a = true;
                                        } else {
                                            i7 = i4;
                                            i8 = i3;
                                            if (i17 == 1) {
                                                q(i14, 0, i8, 0, m31Var);
                                                m31Var.e.e.m = m31Var.k();
                                            } else if (i17 == 2) {
                                                i11 = iArr[1];
                                                if (i11 != i5 || i11 == 4) {
                                                    q(i14, m31Var.q(), i5, (int) ((f3 * n31Var.k()) + 0.5f), m31Var);
                                                    m31Var.d.e.d(m31Var.q());
                                                    m31Var.e.e.d(m31Var.k());
                                                    m31Var.a = true;
                                                } else {
                                                    i10 = 3;
                                                }
                                            } else if (u21VarArr[2].f != null || u21VarArr[3].f == null) {
                                                q(i8, 0, i7, 0, m31Var);
                                                m31Var.d.e.d(m31Var.q());
                                                m31Var.e.e.d(m31Var.k());
                                                m31Var.a = true;
                                            } else {
                                                i10 = 3;
                                            }
                                        }
                                        i9 = 1;
                                    } else {
                                        i7 = i4;
                                        i8 = i3;
                                        i9 = 1;
                                        i10 = 3;
                                    }
                                    if (i14 != i10 && i7 == i10) {
                                        if (i16 == i9 || i17 == i9) {
                                            q(i8, 0, i8, 0, m31Var);
                                            m31Var.d.e.m = m31Var.q();
                                            m31Var.e.e.m = m31Var.k();
                                        } else if (i17 == 2 && i16 == 2 && iArr[0] == i5 && iArr[i9] == i5) {
                                            q(i5, (int) ((f2 * n31Var.q()) + 0.5f), i5, (int) ((f3 * n31Var.k()) + 0.5f), m31Var);
                                            m31Var.d.e.d(m31Var.q());
                                            m31Var.e.e.d(m31Var.k());
                                            m31Var.a = true;
                                        }
                                    }
                                } else if (i16 == 3) {
                                    if (i15 == i3) {
                                        q(i3, 0, i3, 0, m31Var);
                                    }
                                    int iK3 = m31Var.k();
                                    q(1, (int) ((iK3 * m31Var.W) + 0.5f), 1, iK3, m31Var);
                                    m31Var.d.e.d(m31Var.q());
                                    m31Var.e.e.d(m31Var.k());
                                    m31Var.a = true;
                                } else {
                                    i12 = i3;
                                    i5 = 1;
                                    if (i16 == 1) {
                                        q(i12, 0, i15, 0, m31Var);
                                        m31Var.d.e.m = m31Var.q();
                                    } else {
                                        i3 = i12;
                                        i4 = i15;
                                        if (i16 == 2) {
                                            i13 = iArr[0];
                                            if (i13 != 1 || i13 == 4) {
                                                q(1, (int) ((f2 * n31Var.q()) + 0.5f), i4, m31Var.k(), m31Var);
                                                m31Var.d.e.d(m31Var.q());
                                                m31Var.e.e.d(m31Var.k());
                                                m31Var.a = true;
                                            }
                                        } else if (u21VarArr[0].f != null || u21VarArr[1].f == null) {
                                            q(i3, 0, i4, 0, m31Var);
                                            m31Var.d.e.d(m31Var.q());
                                            m31Var.e.e.d(m31Var.k());
                                            m31Var.a = true;
                                        }
                                    }
                                }
                                i6 = 3;
                                if (i4 == i6) {
                                    i7 = i4;
                                    i8 = i3;
                                    i9 = 1;
                                    i10 = 3;
                                } else if (i14 == i3) {
                                    if (i17 == i6) {
                                        if (i14 == i3) {
                                            q(i3, 0, i3, 0, m31Var);
                                        }
                                        int iQ3 = m31Var.q();
                                        f = m31Var.W;
                                        if (m31Var.X == -1) {
                                            f = 1.0f / f;
                                        }
                                        q(i5, iQ3, i5, (int) ((iQ3 * f) + 0.5f), m31Var);
                                        m31Var.d.e.d(m31Var.q());
                                        m31Var.e.e.d(m31Var.k());
                                        m31Var.a = true;
                                    } else {
                                        i7 = i4;
                                        i8 = i3;
                                        if (i17 == 1) {
                                            q(i14, 0, i8, 0, m31Var);
                                            m31Var.e.e.m = m31Var.k();
                                        } else if (i17 == 2) {
                                            i11 = iArr[1];
                                            if (i11 != i5) {
                                            }
                                            q(i14, m31Var.q(), i5, (int) ((f3 * n31Var.k()) + 0.5f), m31Var);
                                            m31Var.d.e.d(m31Var.q());
                                            m31Var.e.e.d(m31Var.k());
                                            m31Var.a = true;
                                        } else {
                                            if (u21VarArr[2].f != null) {
                                            }
                                            q(i8, 0, i7, 0, m31Var);
                                            m31Var.d.e.d(m31Var.q());
                                            m31Var.e.e.d(m31Var.k());
                                            m31Var.a = true;
                                        }
                                    }
                                } else if (i17 == i6) {
                                    if (i14 == i3) {
                                        q(i3, 0, i3, 0, m31Var);
                                    }
                                    int iQ4 = m31Var.q();
                                    f = m31Var.W;
                                    if (m31Var.X == -1) {
                                        f = 1.0f / f;
                                    }
                                    q(i5, iQ4, i5, (int) ((iQ4 * f) + 0.5f), m31Var);
                                    m31Var.d.e.d(m31Var.q());
                                    m31Var.e.e.d(m31Var.k());
                                    m31Var.a = true;
                                } else {
                                    i7 = i4;
                                    i8 = i3;
                                    if (i17 == 1) {
                                        q(i14, 0, i8, 0, m31Var);
                                        m31Var.e.e.m = m31Var.k();
                                    } else if (i17 == 2) {
                                        i11 = iArr[1];
                                        if (i11 != i5) {
                                        }
                                        q(i14, m31Var.q(), i5, (int) ((f3 * n31Var.k()) + 0.5f), m31Var);
                                        m31Var.d.e.d(m31Var.q());
                                        m31Var.e.e.d(m31Var.k());
                                        m31Var.a = true;
                                    } else {
                                        if (u21VarArr[2].f != null) {
                                        }
                                        q(i8, 0, i7, 0, m31Var);
                                        m31Var.d.e.d(m31Var.q());
                                        m31Var.e.e.d(m31Var.k());
                                        m31Var.a = true;
                                    }
                                }
                                if (i14 != i10) {
                                }
                            }
                        } else {
                            i = 1;
                        }
                        iQ = m31Var.q();
                        if (i14 == 4) {
                            iQ = (n31Var.q() - u21Var4.g) - u21Var3.g;
                            i14 = i;
                        }
                        iK = m31Var.k();
                        if (i15 == 4) {
                            iK2 = (n31Var.k() - u21Var2.g) - u21Var.g;
                            i2 = i;
                        } else {
                            iK2 = iK;
                            i2 = i15;
                        }
                        q(i14, iQ, i2, iK2, m31Var);
                        m31Var.d.e.d(m31Var.q());
                        m31Var.e.e.d(m31Var.k());
                        m31Var.a = true;
                    }
                    i = 1;
                    iQ = m31Var.q();
                    if (i14 == 4) {
                        iQ = (n31Var.q() - u21Var4.g) - u21Var3.g;
                        i14 = i;
                    }
                    iK = m31Var.k();
                    if (i15 == 4) {
                        iK2 = (n31Var.k() - u21Var2.g) - u21Var.g;
                        i2 = i;
                    } else {
                        iK2 = iK;
                        i2 = i15;
                    }
                    q(i14, iQ, i2, iK2, m31Var);
                    m31Var.d.e.d(m31Var.q());
                    m31Var.e.e.d(m31Var.k());
                    m31Var.a = true;
                } else {
                    i3 = 2;
                    if (i14 == 2) {
                        if (i15 == 4) {
                            if (i15 != 1) {
                                i3 = 2;
                                if (i15 != 2) {
                                }
                            } else {
                                i = 1;
                            }
                            iQ = m31Var.q();
                            if (i14 == 4) {
                                iQ = (n31Var.q() - u21Var4.g) - u21Var3.g;
                                i14 = i;
                            }
                            iK = m31Var.k();
                            if (i15 == 4) {
                                iK2 = (n31Var.k() - u21Var2.g) - u21Var.g;
                                i2 = i;
                            } else {
                                iK2 = iK;
                                i2 = i15;
                            }
                            q(i14, iQ, i2, iK2, m31Var);
                            m31Var.d.e.d(m31Var.q());
                            m31Var.e.e.d(m31Var.k());
                            m31Var.a = true;
                        }
                        i = 1;
                        iQ = m31Var.q();
                        if (i14 == 4) {
                            iQ = (n31Var.q() - u21Var4.g) - u21Var3.g;
                            i14 = i;
                        }
                        iK = m31Var.k();
                        if (i15 == 4) {
                            iK2 = (n31Var.k() - u21Var2.g) - u21Var.g;
                            i2 = i;
                        } else {
                            iK2 = iK;
                            i2 = i15;
                        }
                        q(i14, iQ, i2, iK2, m31Var);
                        m31Var.d.e.d(m31Var.q());
                        m31Var.e.e.d(m31Var.k());
                        m31Var.a = true;
                    }
                    if (i14 != 3) {
                        if (i15 == i3) {
                        }
                        if (i16 == 3) {
                            if (i15 == i3) {
                                q(i3, 0, i3, 0, m31Var);
                            }
                            int iK4 = m31Var.k();
                            q(1, (int) ((iK4 * m31Var.W) + 0.5f), 1, iK4, m31Var);
                            m31Var.d.e.d(m31Var.q());
                            m31Var.e.e.d(m31Var.k());
                            m31Var.a = true;
                        } else {
                            i12 = i3;
                            i5 = 1;
                            if (i16 == 1) {
                                q(i12, 0, i15, 0, m31Var);
                                m31Var.d.e.m = m31Var.q();
                            } else {
                                i3 = i12;
                                i4 = i15;
                                if (i16 == 2) {
                                    i13 = iArr[0];
                                    if (i13 != 1) {
                                    }
                                    q(1, (int) ((f2 * n31Var.q()) + 0.5f), i4, m31Var.k(), m31Var);
                                    m31Var.d.e.d(m31Var.q());
                                    m31Var.e.e.d(m31Var.k());
                                    m31Var.a = true;
                                } else {
                                    if (u21VarArr[0].f != null) {
                                    }
                                    q(i3, 0, i4, 0, m31Var);
                                    m31Var.d.e.d(m31Var.q());
                                    m31Var.e.e.d(m31Var.k());
                                    m31Var.a = true;
                                }
                            }
                        }
                    } else {
                        i4 = i15;
                        i5 = 1;
                    }
                    i6 = 3;
                    if (i4 == i6) {
                        i7 = i4;
                        i8 = i3;
                        i9 = 1;
                        i10 = 3;
                    } else if (i14 == i3) {
                        if (i17 == i6) {
                            if (i14 == i3) {
                                q(i3, 0, i3, 0, m31Var);
                            }
                            int iQ5 = m31Var.q();
                            f = m31Var.W;
                            if (m31Var.X == -1) {
                                f = 1.0f / f;
                            }
                            q(i5, iQ5, i5, (int) ((iQ5 * f) + 0.5f), m31Var);
                            m31Var.d.e.d(m31Var.q());
                            m31Var.e.e.d(m31Var.k());
                            m31Var.a = true;
                        } else {
                            i7 = i4;
                            i8 = i3;
                            if (i17 == 1) {
                                q(i14, 0, i8, 0, m31Var);
                                m31Var.e.e.m = m31Var.k();
                            } else if (i17 == 2) {
                                i11 = iArr[1];
                                if (i11 != i5) {
                                }
                                q(i14, m31Var.q(), i5, (int) ((f3 * n31Var.k()) + 0.5f), m31Var);
                                m31Var.d.e.d(m31Var.q());
                                m31Var.e.e.d(m31Var.k());
                                m31Var.a = true;
                            } else {
                                if (u21VarArr[2].f != null) {
                                }
                                q(i8, 0, i7, 0, m31Var);
                                m31Var.d.e.d(m31Var.q());
                                m31Var.e.e.d(m31Var.k());
                                m31Var.a = true;
                            }
                        }
                    } else if (i17 == i6) {
                        if (i14 == i3) {
                            q(i3, 0, i3, 0, m31Var);
                        }
                        int iQ6 = m31Var.q();
                        f = m31Var.W;
                        if (m31Var.X == -1) {
                            f = 1.0f / f;
                        }
                        q(i5, iQ6, i5, (int) ((iQ6 * f) + 0.5f), m31Var);
                        m31Var.d.e.d(m31Var.q());
                        m31Var.e.e.d(m31Var.k());
                        m31Var.a = true;
                    } else {
                        i7 = i4;
                        i8 = i3;
                        if (i17 == 1) {
                            q(i14, 0, i8, 0, m31Var);
                            m31Var.e.e.m = m31Var.k();
                        } else if (i17 == 2) {
                            i11 = iArr[1];
                            if (i11 != i5) {
                            }
                            q(i14, m31Var.q(), i5, (int) ((f3 * n31Var.k()) + 0.5f), m31Var);
                            m31Var.d.e.d(m31Var.q());
                            m31Var.e.e.d(m31Var.k());
                            m31Var.a = true;
                        } else {
                            if (u21VarArr[2].f != null) {
                            }
                            q(i8, 0, i7, 0, m31Var);
                            m31Var.d.e.d(m31Var.q());
                            m31Var.e.e.d(m31Var.k());
                            m31Var.a = true;
                        }
                    }
                    if (i14 != i10) {
                    }
                }
            }
        }
    }

    public void c() {
        n31 n31Var = (n31) this.c;
        ArrayList arrayList = (ArrayList) this.f;
        ArrayList<k09> arrayList2 = (ArrayList) this.e;
        arrayList2.clear();
        n31 n31Var2 = (n31) this.d;
        n31Var2.d.f();
        n31Var2.e.f();
        arrayList2.add(n31Var2.d);
        arrayList2.add(n31Var2.e);
        HashSet hashSet = null;
        for (m31 m31Var : n31Var2.q0) {
            if (m31Var instanceof av2) {
                bv2 bv2Var = new bv2(m31Var);
                m31Var.d.f();
                m31Var.e.f();
                bv2Var.f = ((av2) m31Var).u0;
                arrayList2.add(bv2Var);
            } else {
                if (m31Var.x()) {
                    if (m31Var.b == null) {
                        m31Var.b = new xo0(m31Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(m31Var.b);
                } else {
                    arrayList2.add(m31Var.d);
                }
                if (m31Var.y()) {
                    if (m31Var.c == null) {
                        m31Var.c = new xo0(m31Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(m31Var.c);
                } else {
                    arrayList2.add(m31Var.e);
                }
                if (m31Var instanceof xz2) {
                    arrayList2.add(new wz2(m31Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((k09) it.next()).f();
        }
        for (k09 k09Var : arrayList2) {
            if (k09Var.b != n31Var2) {
                k09Var.d();
            }
        }
        arrayList.clear();
        k(n31Var.d, 0, arrayList);
        k(n31Var.e, 1, arrayList);
        this.a = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [c15] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [c15] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [jx4] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [jx4] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public void d() {
        c15 c15Var = (c15) this.f;
        Object[] objArr = c15Var.X;
        int i = c15Var.Z;
        for (int i2 = 0; i2 < i; i2++) {
            t6 t6Var = ((LayoutNode) objArr[i2]).H0;
            fd3 fd3Var = (fd3) t6Var.f0;
            boolean zG = j55.g(4194304);
            jx4 jx4Var = fd3Var.e1;
            if (zG || (jx4Var = jx4Var.g0) != null) {
                dx4 dx4Var = i55.X0;
                for (jx4 jx4VarY0 = fd3Var.Y0(zG); jx4VarY0 != null && (jx4VarY0.f0 & 4194304) != 0; jx4VarY0 = jx4VarY0.h0) {
                    if ((jx4VarY0.Z & 4194304) != 0) {
                        ?? T = jx4VarY0;
                        ?? c15Var2 = 0;
                        while (T != 0) {
                            if (T instanceof w24) {
                                ((w24) T).n((fd3) t6Var.f0);
                            } else if ((T.Z & 4194304) != 0 && (T instanceof oh1)) {
                                jx4 jx4Var2 = ((oh1) T).r0;
                                int i3 = 0;
                                T = T;
                                c15Var2 = c15Var2;
                                while (jx4Var2 != null) {
                                    if ((jx4Var2.Z & 4194304) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            c15Var2 = c15Var2;
                                            T = jx4Var2;
                                        } else {
                                            if (c15Var2 == 0) {
                                                c15Var2 = new c15(0, new jx4[16]);
                                            }
                                            if (T != 0) {
                                                c15Var2.b(T);
                                                T = 0;
                                            }
                                            c15Var2.b(jx4Var2);
                                        }
                                    }
                                    jx4Var2 = jx4Var2.h0;
                                    T = T;
                                    c15Var2 = c15Var2;
                                }
                                if (i3 == 1) {
                                }
                            }
                            T = yn0.T(c15Var2);
                        }
                    }
                    if (jx4VarY0 == jx4Var) {
                        break;
                    }
                }
            }
        }
        c15Var.g();
    }

    public int e(n31 n31Var, int i) {
        ArrayList arrayList;
        int i2;
        long j;
        float f;
        long j2;
        ArrayList arrayList2 = (ArrayList) this.f;
        int size = arrayList2.size();
        long j3 = 0;
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            k09 k09Var = ((br6) arrayList2.get(i3)).a;
            if (!(k09Var instanceof xo0) ? !(i != 0 ? (k09Var instanceof kv8) : (k09Var instanceof y03)) : ((xo0) k09Var).f != i) {
                si1 si1Var = (i == 0 ? n31Var.d : n31Var.e).h;
                si1 si1Var2 = (i == 0 ? n31Var.d : n31Var.e).i;
                si1 si1Var3 = k09Var.h;
                si1 si1Var4 = k09Var.i;
                boolean zContains = si1Var3.l.contains(si1Var);
                boolean zContains2 = si1Var4.l.contains(si1Var2);
                long j4 = k09Var.j();
                if (zContains && zContains2) {
                    long jB = br6.b(si1Var3, j3);
                    arrayList = arrayList2;
                    long jA = br6.a(si1Var4, j3);
                    long j5 = jB - j4;
                    int i4 = si1Var4.f;
                    i2 = i3;
                    if (j5 >= (-i4)) {
                        j5 += (long) i4;
                    }
                    long j6 = si1Var3.f;
                    long j7 = ((-jA) - j4) - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    m31 m31Var = k09Var.b;
                    if (i == 0) {
                        f = m31Var.d0;
                    } else if (i == 1) {
                        f = m31Var.e0;
                    } else {
                        m31Var.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j2 = (long) ((j5 / (1.0f - f)) + (j7 / f));
                    } else {
                        j2 = 0;
                    }
                    float f2 = j2;
                    j = (((long) si1Var3.f) + ((((long) ((f2 * f) + 0.5f)) + j4) + ((long) p61.e(1.0f, f, f2, 0.5f)))) - ((long) si1Var4.f);
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    if (zContains) {
                        j = Math.max(br6.b(si1Var3, si1Var3.f), ((long) si1Var3.f) + j4);
                    } else if (zContains2) {
                        j = Math.max(-br6.a(si1Var4, si1Var4.f), ((long) (-si1Var4.f)) + j4);
                    } else {
                        j = (k09Var.j() + ((long) si1Var3.f)) - ((long) si1Var4.f);
                    }
                }
            } else {
                arrayList = arrayList2;
                j = j3;
                i2 = i3;
            }
            jMax = Math.max(jMax, j);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            j3 = 0;
        }
        return (int) jMax;
    }

    public void f(boolean z) {
        zz2 zz2Var = (zz2) this.e;
        c15 c15Var = (c15) zz2Var.Y;
        if (z) {
            LayoutNode layoutNode = (LayoutNode) this.c;
            if (layoutNode.P0 > 0) {
                c15Var.g();
                c15Var.b(layoutNode);
                layoutNode.O0 = true;
            }
        }
        if (c15Var.Z != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                zz2Var.T();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void i() {
        c15 c15Var = (c15) this.g;
        int i = c15Var.Z;
        if (i != 0) {
            Object[] objArr = c15Var.X;
            for (int i2 = 0; i2 < i; i2++) {
                ur4 ur4Var = (ur4) objArr[i2];
                if (ur4Var.a.K()) {
                    boolean z = ur4Var.b;
                    LayoutNode layoutNode = ur4Var.a;
                    boolean z2 = ur4Var.c;
                    if (z) {
                        LayoutNode.W(layoutNode, z2, 2);
                    } else {
                        LayoutNode.Y(layoutNode, z2, 2);
                    }
                }
            }
            c15Var.g();
        }
    }

    public void j(LayoutNode layoutNode) {
        c15 c15VarC = layoutNode.C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (dh3.f(layoutNode2.M(), Boolean.TRUE) && !layoutNode2.Q0) {
                if (((lr) this.d).f(layoutNode2)) {
                    layoutNode2.N();
                }
                j(layoutNode2);
            }
        }
    }

    public void k(k09 k09Var, int i, ArrayList arrayList) {
        si1 si1Var = k09Var.h;
        si1 si1Var2 = k09Var.i;
        for (mi1 mi1Var : si1Var.k) {
            if (mi1Var instanceof si1) {
                a((si1) mi1Var, i, arrayList, null);
            } else if (mi1Var instanceof k09) {
                a(((k09) mi1Var).h, i, arrayList, null);
            }
        }
        for (mi1 mi1Var2 : si1Var2.k) {
            if (mi1Var2 instanceof si1) {
                a((si1) mi1Var2, i, arrayList, null);
            } else if (mi1Var2 instanceof k09) {
                a(((k09) mi1Var2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (mi1 mi1Var3 : ((kv8) k09Var).k.k) {
                if (mi1Var3 instanceof si1) {
                    a((si1) mi1Var3, i, arrayList, null);
                }
            }
        }
    }

    public void l(LayoutNode layoutNode, boolean z) {
        if (!this.a) {
            wc3.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? layoutNode.I0.e : layoutNode.q()) {
            wc3.a("node not yet measured");
        }
        m(layoutNode, z);
    }

    public void m(LayoutNode layoutNode, boolean z) {
        bj4 bj4Var;
        o34 o34Var;
        c15 c15VarC = layoutNode.C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            m34 m34Var = m34.X;
            if ((!z && (layoutNode2.r() == m34Var || layoutNode2.I0.p.A0.e())) || (z && (layoutNode2.s() == m34Var || ((bj4Var = layoutNode2.I0.q) != null && (o34Var = bj4Var.u0) != null && o34Var.e())))) {
                boolean zT = os4.t(layoutNode2);
                r34 r34Var = layoutNode2.I0;
                if (zT && !z) {
                    if (r34Var.e && ((lr) this.d).f(layoutNode2)) {
                        w(layoutNode2, true);
                    } else {
                        l(layoutNode2, true);
                    }
                }
                if (z ? r34Var.e : layoutNode2.q()) {
                    w(layoutNode2, z);
                }
                if (!(z ? r34Var.e : layoutNode2.q())) {
                    m(layoutNode2, z);
                }
            }
        }
        if (z ? layoutNode.I0.e : layoutNode.q()) {
            w(layoutNode, z);
        }
    }

    public void q(int i, int i2, int i3, int i4, m31 m31Var) {
        d30 d30Var = (d30) this.h;
        d30Var.a = i;
        d30Var.b = i3;
        d30Var.c = i2;
        d30Var.d = i4;
        ((b) ((e30) this.g)).b(m31Var, d30Var);
        m31Var.O(d30Var.e);
        m31Var.L(d30Var.f);
        m31Var.E = d30Var.h;
        m31Var.I(d30Var.g);
    }

    public boolean r(dn2 dn2Var) {
        boolean z;
        boolean z2;
        LayoutNode layoutNode;
        boolean z3;
        boolean zW;
        lr lrVar = (lr) this.d;
        yr2 yr2Var = (yr2) lrVar.Y;
        LayoutNode layoutNode2 = (LayoutNode) this.c;
        if (!layoutNode2.K()) {
            wc3.a("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode2.L()) {
            wc3.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.a) {
            wc3.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (((q31) this.h) != null) {
            this.a = true;
            this.b = true;
            try {
                if (lrVar.w()) {
                    z = false;
                    while (true) {
                        yr2 yr2Var2 = (yr2) lrVar.f0;
                        he7 he7Var = (he7) yr2Var2.Y;
                        yr2 yr2Var3 = (yr2) lrVar.Z;
                        he7 he7Var2 = (he7) yr2Var3.Y;
                        if (!((he7) yr2Var.Y).isEmpty()) {
                            layoutNode = (LayoutNode) ((he7) yr2Var.Y).first();
                            yr2Var.s(layoutNode);
                            z3 = layoutNode.k0 != null;
                            z2 = false;
                        } else if (!he7Var2.isEmpty()) {
                            layoutNode = (LayoutNode) he7Var2.first();
                            yr2Var3.s(layoutNode);
                            z3 = layoutNode.k0 != null;
                            z2 = true;
                        } else {
                            if (he7Var.isEmpty()) {
                                break;
                            }
                            LayoutNode layoutNode3 = (LayoutNode) he7Var.first();
                            yr2Var2.s(layoutNode3);
                            z2 = true;
                            layoutNode = layoutNode3;
                            z3 = false;
                        }
                        if (z2) {
                            zW = v(layoutNode, z3);
                        } else {
                            zW = w(layoutNode, z3);
                            if (layoutNode.I0.f) {
                                lrVar.a(layoutNode, bi3.Y);
                            }
                            if (layoutNode.p()) {
                                lrVar.a(layoutNode, bi3.f0);
                            }
                        }
                        if (layoutNode == layoutNode2 && zW) {
                            z = true;
                        }
                    }
                    if (dn2Var != null) {
                        dn2Var.invoke();
                    }
                } else {
                    z = false;
                }
                this.a = false;
                this.b = false;
                z4 = z;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.a = false;
                    this.b = false;
                    throw th2;
                }
            }
        }
        d();
        return z4;
    }

    public void s(LayoutNode layoutNode, long j) {
        LayoutNode layoutNode2 = (LayoutNode) this.c;
        boolean z = layoutNode.Q0;
        r34 r34Var = layoutNode.I0;
        if (z) {
            return;
        }
        if (layoutNode == layoutNode2) {
            wc3.a("measureAndLayout called on root");
        }
        if (!layoutNode2.K()) {
            wc3.a("performMeasureAndLayout called with unattached root");
        }
        if (!layoutNode2.L()) {
            wc3.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.a) {
            wc3.a("performMeasureAndLayout called during measure layout");
        }
        if (((q31) this.h) != null) {
            this.a = true;
            this.b = false;
            try {
                lr lrVar = (lr) this.d;
                ((yr2) lrVar.Y).s(layoutNode);
                ((yr2) lrVar.Z).s(layoutNode);
                ((yr2) lrVar.f0).s(layoutNode);
                if (g(layoutNode, new q31(j)) || r34Var.f) {
                    if (dh3.f(layoutNode.M(), Boolean.TRUE)) {
                        layoutNode.N();
                    }
                }
                j(layoutNode);
                if (layoutNode.E0 == m34.Z) {
                    layoutNode.e();
                }
                boolean zR0 = r34Var.p.r0(j);
                LayoutNode layoutNodeW = layoutNode.w();
                if (zR0 && layoutNodeW != null) {
                    if (layoutNode.r() == m34.X) {
                        LayoutNode.Y(layoutNodeW, false, 3);
                    } else if (layoutNode.r() == m34.Y) {
                        layoutNodeW.X(false);
                    }
                }
                if (layoutNode.p() && layoutNode.L()) {
                    layoutNode.U();
                    zz2 zz2Var = (zz2) this.e;
                    if (layoutNode.P0 > 0) {
                        ((c15) zz2Var.Y).b(layoutNode);
                        layoutNode.O0 = true;
                    }
                }
                i();
                this.a = false;
                this.b = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.a = false;
                    this.b = false;
                    throw th2;
                }
            }
        }
        d();
    }

    public void t() {
        LayoutNode layoutNode = (LayoutNode) this.c;
        lr lrVar = (lr) this.d;
        if (lrVar.w()) {
            if (!layoutNode.K()) {
                wc3.a("performMeasureAndLayout called with unattached root");
            }
            if (!layoutNode.L()) {
                wc3.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.a) {
                wc3.a("performMeasureAndLayout called during measure layout");
            }
            if (((q31) this.h) != null) {
                this.a = true;
                this.b = false;
                try {
                    if ((((he7) ((yr2) lrVar.f0).Y).isEmpty() || ((he7) ((yr2) lrVar.Y).Y).isEmpty()) ? false : true) {
                        if (layoutNode.k0 != null) {
                            y(layoutNode, true);
                        } else {
                            x(layoutNode);
                        }
                    }
                    y(layoutNode, false);
                    this.a = false;
                    this.b = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.a = false;
                        this.b = false;
                        throw th2;
                    }
                }
            }
        }
    }

    public void u() {
        ri1 ri1Var;
        w20 w20Var;
        for (m31 m31Var : ((n31) this.c).q0) {
            if (!m31Var.a) {
                int[] iArr = m31Var.p0;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = m31Var.r;
                int i4 = m31Var.s;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                zo1 zo1Var = m31Var.d.e;
                boolean z3 = zo1Var.j;
                zo1 zo1Var2 = m31Var.e.e;
                boolean z4 = zo1Var2.j;
                boolean z5 = z2;
                if (z3 && z4) {
                    ri1Var = this;
                    ri1Var.q(1, zo1Var.g, 1, zo1Var2.g, m31Var);
                    m31Var.a = true;
                } else if (z3 && z) {
                    ri1Var = this;
                    ri1Var.q(1, zo1Var.g, 2, zo1Var2.g, m31Var);
                    kv8 kv8Var = m31Var.e;
                    if (i2 == 3) {
                        kv8Var.e.m = m31Var.k();
                    } else {
                        kv8Var.e.d(m31Var.k());
                        m31Var.a = true;
                    }
                } else {
                    ri1Var = this;
                    if (z4 && z5) {
                        ri1Var.q(2, zo1Var.g, 1, zo1Var2.g, m31Var);
                        y03 y03Var = m31Var.d;
                        if (i == 3) {
                            y03Var.e.m = m31Var.q();
                        } else {
                            y03Var.e.d(m31Var.q());
                            m31Var.a = true;
                        }
                    }
                }
                if (m31Var.a && (w20Var = m31Var.e.l) != null) {
                    w20Var.d(m31Var.a0);
                }
                this = ri1Var;
            }
        }
    }

    public boolean v(LayoutNode layoutNode, boolean z) {
        q31 q31Var;
        LayoutNode layoutNodeW;
        LayoutNode layoutNode2 = (LayoutNode) this.c;
        boolean z2 = layoutNode.Q0;
        r34 r34Var = layoutNode.I0;
        boolean zG = false;
        if (!z2 && p(layoutNode)) {
            if (layoutNode == layoutNode2) {
                q31Var = (q31) this.h;
                q31Var.getClass();
            } else {
                q31Var = null;
            }
            if (z) {
                zG = r34Var.e ? g(layoutNode, q31Var) : false;
                if ((zG || r34Var.f) && dh3.f(layoutNode.M(), Boolean.TRUE)) {
                    layoutNode.N();
                }
            } else {
                boolean zH = layoutNode.q() ? h(layoutNode, q31Var) : false;
                if (layoutNode.p() && (layoutNode == layoutNode2 || ((layoutNodeW = layoutNode.w()) != null && layoutNodeW.L() && r34Var.p.w0))) {
                    if (layoutNode == layoutNode2) {
                        if (layoutNode.E0 == m34.Z) {
                            layoutNode.f();
                        }
                        LayoutNode layoutNodeW2 = layoutNode.w();
                        do5.h(layoutNodeW2 != null ? ((fd3) layoutNodeW2.H0.f0).r0 : q34.a(layoutNode).getPlacementScope(), r34Var.p, 0, 0);
                    } else {
                        layoutNode.U();
                    }
                    zz2 zz2Var = (zz2) this.e;
                    if (layoutNode.P0 > 0) {
                        ((c15) zz2Var.Y).b(layoutNode);
                        layoutNode.O0 = true;
                    }
                }
                zG = zH;
            }
            i();
        }
        return zG;
    }

    public boolean w(LayoutNode layoutNode, boolean z) {
        q31 q31Var;
        boolean zH = false;
        if (!layoutNode.Q0 && p(layoutNode)) {
            if (layoutNode == ((LayoutNode) this.c)) {
                q31Var = (q31) this.h;
                q31Var.getClass();
            } else {
                q31Var = null;
            }
            if (z) {
                if (layoutNode.I0.e) {
                    zH = g(layoutNode, q31Var);
                }
            } else if (layoutNode.q()) {
                zH = h(layoutNode, q31Var);
            }
            i();
        }
        return zH;
    }

    public void x(LayoutNode layoutNode) {
        c15 c15VarC = layoutNode.C();
        Object[] objArr = c15VarC.X;
        int i = c15VarC.Z;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.r() == m34.X || layoutNode2.I0.p.A0.e()) {
                if (os4.t(layoutNode2)) {
                    y(layoutNode2, true);
                } else {
                    x(layoutNode2);
                }
            }
        }
    }

    public void y(LayoutNode layoutNode, boolean z) {
        q31 q31Var;
        if (layoutNode.Q0) {
            return;
        }
        if (layoutNode == ((LayoutNode) this.c)) {
            q31Var = (q31) this.h;
            q31Var.getClass();
        } else {
            q31Var = null;
        }
        if (z) {
            g(layoutNode, q31Var);
        } else {
            h(layoutNode, q31Var);
        }
    }

    public boolean z(LayoutNode layoutNode, boolean z) {
        int iOrdinal = layoutNode.I0.d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                ((c15) this.g).b(new ur4(layoutNode, false, z));
            } else {
                if (iOrdinal != 4) {
                    b61.c();
                    return false;
                }
                if (!layoutNode.q() || z) {
                    layoutNode.I0.p.x0 = true;
                    if (!layoutNode.Q0 && (layoutNode.L() || o(layoutNode))) {
                        LayoutNode layoutNodeW = layoutNode.w();
                        if (layoutNodeW == null || !layoutNodeW.q()) {
                            ((lr) this.d).a(layoutNode, bi3.Z);
                        }
                        if (!this.b) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
