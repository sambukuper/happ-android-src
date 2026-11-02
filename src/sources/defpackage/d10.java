package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d10 extends jx4 implements g34, rv1, w07, kq5, nx4, ci5, w24, as2, vg2, lh2, qh2, nf5, ea0 {
    public ix4 q0;
    public c10 r0;
    public HashSet s0;

    @Override // defpackage.kq5
    public final boolean B0() {
        this.q0.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.lh2
    public final void E(hh2 hh2Var) {
        ix4 ix4Var = this.q0;
        wc3.b("applyFocusProperties called on wrong node");
        ix4Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.vg2
    public final void H(yh2 yh2Var) {
        ix4 ix4Var = this.q0;
        wc3.b("onFocusEvent called on wrong node");
        ix4Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.kq5
    public final void I() {
        this.q0.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.g34
    public final int J0(ug3 ug3Var, tr4 tr4Var, int i) {
        ix4 ix4Var = this.q0;
        ix4Var.getClass();
        return ((u31) ix4Var).c(new lh3(ug3Var, ug3Var.getLayoutDirection()), new xe1(tr4Var, bs4.Y, cs4.Y, (byte) 1), s31.b(0, i, 0, 0, 13)).a();
    }

    @Override // defpackage.g34
    public final yr4 K(zr4 zr4Var, tr4 tr4Var, long j) {
        ix4 ix4Var = this.q0;
        ix4Var.getClass();
        return ((u31) ix4Var).c(zr4Var, tr4Var, j);
    }

    @Override // defpackage.rv1
    public final void O() {
        z68.W(this);
    }

    @Override // defpackage.kq5
    public final boolean P() {
        this.q0.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.jx4
    public final void Q0() {
        Y0(true);
    }

    @Override // defpackage.jx4
    public final void R0() {
        Z0();
    }

    public final void Y0(boolean z) {
        if (!this.p0) {
            wc3.b("initializeModifier called on unattached node");
        }
        ix4 ix4Var = this.q0;
        if ((this.Z & 32) != 0 && (ix4Var instanceof ox4)) {
            ox4 ox4Var = (ox4) ix4Var;
            r06 r06Var = bh1.a;
            c10 c10Var = this.r0;
            if (c10Var == null || !c10Var.v(r06Var)) {
                c10 c10Var2 = new c10();
                c10Var2.g = ox4Var;
                this.r0 = c10Var2;
                f18 f18Var = (f18) yn0.Z(this).H0.h0;
                f18Var.getClass();
                if (f18Var.q0) {
                    mx4 modifierLocalManager = yn0.a0(this).getModifierLocalManager();
                    j05 j05Var = modifierLocalManager.b;
                    if (j05Var == null) {
                        j05Var = new j05();
                        modifierLocalManager.b = j05Var;
                    }
                    j05Var.a(this);
                    j05 j05Var2 = modifierLocalManager.c;
                    if (j05Var2 == null) {
                        j05Var2 = new j05();
                        modifierLocalManager.c = j05Var2;
                    }
                    j05Var2.a(r06Var);
                    modifierLocalManager.a();
                }
            } else {
                c10Var.g = ox4Var;
                mx4 modifierLocalManager2 = yn0.a0(this).getModifierLocalManager();
                j05 j05Var3 = modifierLocalManager2.b;
                if (j05Var3 == null) {
                    j05Var3 = new j05();
                    modifierLocalManager2.b = j05Var3;
                }
                j05Var3.a(this);
                j05 j05Var4 = modifierLocalManager2.c;
                if (j05Var4 == null) {
                    j05Var4 = new j05();
                    modifierLocalManager2.c = j05Var4;
                }
                j05Var4.a(r06Var);
                modifierLocalManager2.a();
            }
        }
        if ((this.Z & 4) != 0 && !z) {
            yn0.X(this, 2).d1();
        }
        if ((this.Z & 2) != 0) {
            f18 f18Var2 = (f18) yn0.Z(this).H0.h0;
            f18Var2.getClass();
            if (f18Var2.q0) {
                i55 i55Var = this.j0;
                i55Var.getClass();
                ((i34) i55Var).x1(this);
                lf5 lf5Var = i55Var.V0;
                if (lf5Var != null) {
                    ((au2) lf5Var).c();
                }
            }
            if (!z) {
                yn0.X(this, 2).d1();
                yn0.Z(this).H();
            }
        }
        if (ix4Var instanceof g74) {
            ((g74) ix4Var).X.m0 = yn0.Z(this);
        }
        if ((this.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && (ix4Var instanceof y58)) {
            f18 f18Var3 = (f18) yn0.Z(this).H0.h0;
            f18Var3.getClass();
            if (f18Var3.q0) {
                yn0.Z(this).H();
            }
        }
        if ((this.Z & 8) != 0) {
            ((AndroidComposeView) yn0.a0(this)).w();
        }
    }

    @Override // defpackage.nx4
    public final wl7 Z() {
        c10 c10Var = this.r0;
        return c10Var != null ? c10Var : f02.g;
    }

    public final void Z0() {
        if (!this.p0) {
            wc3.b("unInitializeModifier called on unattached node");
        }
        ix4 ix4Var = this.q0;
        if ((this.Z & 32) != 0 && (ix4Var instanceof ox4)) {
            mx4 modifierLocalManager = yn0.a0(this).getModifierLocalManager();
            r06 r06Var = bh1.a;
            j05 j05Var = modifierLocalManager.d;
            if (j05Var == null) {
                j05Var = new j05();
                modifierLocalManager.d = j05Var;
            }
            j05Var.a(yn0.Z(this));
            j05 j05Var2 = modifierLocalManager.e;
            if (j05Var2 == null) {
                j05Var2 = new j05();
                modifierLocalManager.e = j05Var2;
            }
            j05Var2.a(r06Var);
            modifierLocalManager.a();
        }
        if ((this.Z & 8) != 0) {
            ((AndroidComposeView) yn0.a0(this)).w();
        }
    }

    public final void a1() {
        if (this.p0) {
            this.s0.clear();
            of5 snapshotObserver = yn0.a0(this).getSnapshotObserver();
            snapshotObserver.a.c(this, w45.a, new o7((Object) this, (byte) 9));
        }
    }

    @Override // defpackage.ci5
    public final Object b(fi1 fi1Var, Object obj) {
        ix4 ix4Var = this.q0;
        ix4Var.getClass();
        return ((bi5) ix4Var).b(fi1Var, obj);
    }

    @Override // defpackage.ea0
    public final long e() {
        return u15.R(yn0.X(this, 128).Z);
    }

    @Override // defpackage.as2
    public final void e0(i55 i55Var) {
        ix4 ix4Var = this.q0;
        ix4Var.getClass();
        ((y58) ix4Var).e0(i55Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [jx4] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [jx4] */
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
    @Override // defpackage.nx4
    public final Object f() {
        t6 t6Var;
        r06 r06Var = pu.z;
        this.s0.add(r06Var);
        if (!this.X.p0) {
            wc3.b("visitAncestors called on an unattached node");
        }
        jx4 jx4Var = this.X.g0;
        LayoutNode layoutNodeZ = yn0.Z(this);
        while (layoutNodeZ != null) {
            if ((((jx4) layoutNodeZ.H0.i0).f0 & 32) != 0) {
                while (jx4Var != null) {
                    if ((jx4Var.Z & 32) != 0) {
                        ?? T = jx4Var;
                        ?? c15Var = 0;
                        while (T != 0) {
                            if (T instanceof nx4) {
                                nx4 nx4Var = (nx4) T;
                                if (nx4Var.Z().v(r06Var)) {
                                    return nx4Var.Z().C(r06Var);
                                }
                            } else if ((T.Z & 32) != 0 && (T instanceof oh1)) {
                                jx4 jx4Var2 = ((oh1) T).r0;
                                int i = 0;
                                T = T;
                                c15Var = c15Var;
                                while (jx4Var2 != null) {
                                    if ((jx4Var2.Z & 32) != 0) {
                                        i++;
                                        if (i == 1) {
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
                                    }
                                    jx4Var2 = jx4Var2.h0;
                                    T = T;
                                    c15Var = c15Var;
                                }
                                if (i == 1) {
                                }
                            }
                            T = yn0.T(c15Var);
                        }
                    }
                    jx4Var = jx4Var.g0;
                }
            }
            layoutNodeZ = layoutNodeZ.w();
            jx4Var = (layoutNodeZ == null || (t6Var = layoutNodeZ.H0) == null) ? null : (f18) t6Var.h0;
        }
        return r06Var.a.invoke();
    }

    @Override // defpackage.ea0
    public final fi1 getDensity() {
        return yn0.Z(this).A0;
    }

    @Override // defpackage.ea0
    public final z24 getLayoutDirection() {
        return yn0.Z(this).B0;
    }

    @Override // defpackage.w07
    public final void h(f17 f17Var) {
        ix4 ix4Var = this.q0;
        ix4Var.getClass();
        qs qsVar = (qs) ix4Var;
        t07 t07Var = new t07();
        t07Var.Z = qsVar.X;
        qsVar.Y.B(t07Var);
        f17Var.getClass();
        t07 t07Var2 = (t07) f17Var;
        s05 s05Var = t07Var2.X;
        if (t07Var.Z) {
            t07Var2.Z = true;
        }
        if (t07Var.f0) {
            t07Var2.f0 = true;
        }
        s05 s05Var2 = t07Var.X;
        Object[] objArr = s05Var2.b;
        Object[] objArr2 = s05Var2.c;
        long[] jArr = s05Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        e17 e17Var = (e17) obj;
                        if (!s05Var.b(e17Var)) {
                            s05Var.l(e17Var, obj2);
                        } else if (obj2 instanceof q3) {
                            Object objG = s05Var.g(e17Var);
                            objG.getClass();
                            q3 q3Var = (q3) objG;
                            String str = q3Var.a;
                            if (str == null) {
                                str = ((q3) obj2).a;
                            }
                            on2 on2Var = q3Var.b;
                            if (on2Var == null) {
                                on2Var = ((q3) obj2).b;
                            }
                            s05Var.l(e17Var, new q3(str, on2Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.g34
    public final int i0(ug3 ug3Var, tr4 tr4Var, int i) {
        ix4 ix4Var = this.q0;
        ix4Var.getClass();
        return ((u31) ix4Var).c(new lh3(ug3Var, ug3Var.getLayoutDirection()), new xe1(tr4Var, bs4.Y, cs4.X, (byte) 1), s31.b(0, 0, 0, i, 7)).b();
    }

    @Override // defpackage.g34
    public final int m0(ug3 ug3Var, tr4 tr4Var, int i) {
        ix4 ix4Var = this.q0;
        ix4Var.getClass();
        return ((u31) ix4Var).c(new lh3(ug3Var, ug3Var.getLayoutDirection()), new xe1(tr4Var, bs4.X, cs4.X, (byte) 1), s31.b(0, 0, 0, i, 7)).b();
    }

    @Override // defpackage.nf5
    public final boolean t() {
        return this.p0;
    }

    public final String toString() {
        return this.q0.toString();
    }

    @Override // defpackage.rv1
    public final void u0(p34 p34Var) {
        ix4 ix4Var = this.q0;
        ix4Var.getClass();
        p34Var.a();
    }

    @Override // defpackage.g34
    public final int y0(ug3 ug3Var, tr4 tr4Var, int i) {
        ix4 ix4Var = this.q0;
        ix4Var.getClass();
        return ((u31) ix4Var).c(new lh3(ug3Var, ug3Var.getLayoutDirection()), new xe1(tr4Var, bs4.X, cs4.Y, (byte) 1), s31.b(0, i, 0, 0, 13)).a();
    }

    @Override // defpackage.kq5
    public final void z(aq5 aq5Var, bq5 bq5Var, long j) {
        this.q0.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.nh1, defpackage.kq5
    public final void c() {
    }

    @Override // defpackage.w24, defpackage.as4
    public final void a(long j) {
    }

    @Override // defpackage.w24
    public final void n(y24 y24Var) {
    }
}
