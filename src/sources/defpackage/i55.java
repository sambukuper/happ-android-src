package defpackage;

import android.os.Build;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i55 extends vi4 implements tr4, y24 {
    public static final dx4 X0 = new dx4(4);
    public static final dx4 Y0 = new dx4(5);
    public static final pk6 Z0 = new pk6();
    public static final v24 a1 = new v24();
    public static final float[] b1 = or4.a();
    public static final f55 c1 = new f55();
    public static final g55 d1 = new g55((byte) 0);
    public boolean A0;
    public gn2 B0;
    public fi1 C0;
    public z24 D0;
    public yr4 F0;
    public f05 G0;
    public float I0;
    public r05 J0;
    public v24 K0;
    public s86 M0;
    public s86 N0;
    public boolean O0;
    public boolean P0;
    public xt2 Q0;
    public sm0 R0;
    public i9 S0;
    public final e55 T0;
    public boolean U0;
    public lf5 V0;
    public xt2 W0;
    public final LayoutNode w0;
    public i55 x0;
    public i55 y0;
    public boolean z0;
    public float E0 = 0.8f;
    public long H0 = 0;
    public x67 L0 = u70.e;

    public i55(LayoutNode layoutNode) {
        this.w0 = layoutNode;
        this.C0 = layoutNode.A0;
        this.D0 = layoutNode.B0;
        s86 s86Var = s86.e;
        this.M0 = s86Var;
        this.N0 = s86Var;
        this.T0 = new e55(this, (byte) 1);
    }

    public static i55 r1(y24 y24Var) {
        i55 i55Var;
        yi4 yi4Var = y24Var instanceof yi4 ? (yi4) y24Var : null;
        if (yi4Var != null && (i55Var = yi4Var.X.w0) != null) {
            return i55Var;
        }
        y24Var.getClass();
        return (i55) y24Var;
    }

    @Override // defpackage.y24
    public final long C(y24 y24Var, long j) {
        return F(y24Var, j);
    }

    @Override // defpackage.y24
    public final long E(long j) {
        if (!V0().p0) {
            wc3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return F(jm4.x(this), ((AndroidComposeView) q34.a(this.w0)).E(j));
    }

    @Override // defpackage.y24
    public final long F(y24 y24Var, long j) {
        if (y24Var instanceof yi4) {
            yi4 yi4Var = (yi4) y24Var;
            yi4Var.X.w0.f1();
            return yi4Var.F(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        i55 i55VarR1 = r1(y24Var);
        i55VarR1.f1();
        i55 i55VarR0 = R0(i55VarR1);
        while (i55VarR1 != i55VarR0) {
            lf5 lf5Var = i55VarR1.V0;
            if (lf5Var != null) {
                au2 au2Var = (au2) lf5Var;
                float[] fArrB = au2Var.b();
                if (!au2Var.u0) {
                    j = or4.b(fArrB, j);
                }
            }
            j = nr4.J(j, i55VarR1.H0);
            i55VarR1 = i55VarR1.y0;
            i55VarR1.getClass();
        }
        return K0(i55VarR0, j);
    }

    @Override // defpackage.vi4
    public final void F0() {
        xt2 xt2Var = this.W0;
        long j = this.H0;
        if (xt2Var != null) {
            T(j, this.I0, xt2Var);
        } else {
            S(j, this.I0, this.B0);
        }
    }

    @Override // defpackage.y24
    public final s86 H(y24 y24Var, boolean z) {
        if (!V0().p0) {
            wc3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!y24Var.g()) {
            wc3.b("LayoutCoordinates " + y24Var + " is not attached!");
        }
        i55 i55VarR1 = r1(y24Var);
        i55VarR1.f1();
        i55 i55VarR0 = R0(i55VarR1);
        r05 r05Var = this.J0;
        if (r05Var == null) {
            r05Var = new r05();
            this.J0 = r05Var;
        }
        r05Var.b = 0.0f;
        r05Var.c = 0.0f;
        r05Var.d = (int) (y24Var.j() >> 32);
        r05Var.e = (int) (y24Var.j() & 4294967295L);
        while (i55VarR1 != i55VarR0) {
            i55VarR1.n1(r05Var, z, false);
            if (r05Var.b()) {
                return s86.e;
            }
            i55VarR1 = i55VarR1.y0;
            i55VarR1.getClass();
        }
        J0(i55VarR0, r05Var, z);
        return new s86(r05Var.b, r05Var.c, r05Var.d, r05Var.e);
    }

    @Override // defpackage.y24
    public final long I(long j) {
        if (!V0().p0) {
            wc3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        f1();
        while (this != null) {
            LayoutNode layoutNode = this.w0;
            if (this == layoutNode.getOuterCoordinator$ui() && !layoutNode.Z) {
                long jB = q34.a(layoutNode).getRectManager().b(layoutNode);
                if (!hf3.a(jB, 9223372034707292159L)) {
                    return nr4.J(j, jB);
                }
            }
            lf5 lf5Var = this.V0;
            if (lf5Var != null) {
                au2 au2Var = (au2) lf5Var;
                float[] fArrB = au2Var.b();
                if (!au2Var.u0) {
                    j = or4.b(fArrB, j);
                }
            }
            j = nr4.J(j, this.H0);
            this = this.y0;
        }
        return j;
    }

    public final void J0(i55 i55Var, r05 r05Var, boolean z) {
        if (i55Var == this) {
            return;
        }
        i55 i55Var2 = this.y0;
        if (i55Var2 != null) {
            i55Var2.J0(i55Var, r05Var, z);
        }
        long j = this.H0;
        float f = (int) (j >> 32);
        r05Var.b -= f;
        r05Var.d -= f;
        float f2 = (int) (j & 4294967295L);
        r05Var.c -= f2;
        r05Var.e -= f2;
        lf5 lf5Var = this.V0;
        if (lf5Var != null) {
            au2 au2Var = (au2) lf5Var;
            float[] fArrA = au2Var.a();
            if (!au2Var.u0) {
                if (fArrA == null) {
                    r05Var.b = 0.0f;
                    r05Var.c = 0.0f;
                    r05Var.d = 0.0f;
                    r05Var.e = 0.0f;
                } else {
                    or4.c(fArrA, r05Var);
                }
            }
            if (this.A0 && z) {
                long j2 = this.Z;
                r05Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final long K0(i55 i55Var, long j) {
        if (i55Var == this) {
            return j;
        }
        i55 i55Var2 = this.y0;
        return (i55Var2 == null || dh3.f(i55Var, i55Var2)) ? S0(j) : S0(i55Var2.K0(i55Var, j));
    }

    public final long M0(long j) {
        float fP;
        float fO;
        if (W0()) {
            s86 s86Var = this.M0;
            fP = s86Var.c - s86Var.a;
        } else {
            fP = P();
        }
        if (W0()) {
            s86 s86Var2 = this.M0;
            fO = s86Var2.d - s86Var2.b;
        } else {
            fO = O();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - fP;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - fO;
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final float N0(long j, long j2) {
        if (P() >= Float.intBitsToFloat((int) (j2 >> 32)) && O() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM0 = M0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - P());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - O()))) & 4294967295L);
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) <= fIntBitsToFloat2) {
            return z85.d(jFloatToRawIntBits);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void O0(sm0 sm0Var, xt2 xt2Var) {
        lf5 lf5Var = this.V0;
        if (lf5Var == null) {
            long j = this.H0;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            sm0Var.n(f, f2);
            P0(sm0Var, xt2Var);
            sm0Var.n(-f, -f2);
            return;
        }
        au2 au2Var = (au2) lf5Var;
        um0 um0Var = au2Var.o0;
        au2Var.g();
        au2Var.v0 = au2Var.X.a.M() > 0.0f;
        lr lrVar = um0Var.Y;
        lrVar.A(sm0Var);
        lrVar.Z = xt2Var;
        i21.v(um0Var, au2Var.X);
    }

    public final void P0(sm0 sm0Var, xt2 xt2Var) {
        i55 i55Var;
        sm0 sm0Var2;
        xt2 xt2Var2;
        jx4 jx4VarX0 = X0(4);
        if (jx4VarX0 == null) {
            l1(sm0Var, xt2Var);
            return;
        }
        LayoutNode layoutNode = this.w0;
        layoutNode.getClass();
        p34 sharedDrawScope = q34.a(layoutNode).getSharedDrawScope();
        long jR = u15.R(this.Z);
        sharedDrawScope.getClass();
        c15 c15Var = null;
        while (jx4VarX0 != null) {
            if (jx4VarX0 instanceof rv1) {
                i55Var = this;
                sm0Var2 = sm0Var;
                xt2Var2 = xt2Var;
                sharedDrawScope.b(sm0Var2, jR, i55Var, (rv1) jx4VarX0, xt2Var2);
            } else {
                i55Var = this;
                sm0Var2 = sm0Var;
                xt2Var2 = xt2Var;
                if ((jx4VarX0.Z & 4) != 0 && (jx4VarX0 instanceof oh1)) {
                    int i = 0;
                    for (jx4 jx4Var = ((oh1) jx4VarX0).r0; jx4Var != null; jx4Var = jx4Var.h0) {
                        if ((jx4Var.Z & 4) != 0) {
                            i++;
                            if (i == 1) {
                                jx4VarX0 = jx4Var;
                            } else {
                                if (c15Var == null) {
                                    c15Var = new c15(0, new jx4[16]);
                                }
                                if (jx4VarX0 != null) {
                                    c15Var.b(jx4VarX0);
                                    jx4VarX0 = null;
                                }
                                c15Var.b(jx4Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                sm0Var = sm0Var2;
                this = i55Var;
                xt2Var = xt2Var2;
            }
            jx4VarX0 = yn0.T(c15Var);
            sm0Var = sm0Var2;
            this = i55Var;
            xt2Var = xt2Var2;
        }
    }

    public abstract void Q0();

    public final i55 R0(i55 i55Var) {
        LayoutNode layoutNodeW = i55Var.w0;
        LayoutNode layoutNode = this.w0;
        if (layoutNodeW == layoutNode) {
            jx4 jx4VarV0 = i55Var.V0();
            jx4 jx4VarV1 = V0();
            if (!jx4VarV1.X.p0) {
                wc3.b("visitLocalAncestors called on an unattached node");
            }
            for (jx4 jx4Var = jx4VarV1.X.g0; jx4Var != null; jx4Var = jx4Var.g0) {
                if ((jx4Var.Z & 2) != 0 && jx4Var == jx4VarV0) {
                    return i55Var;
                }
            }
            return this;
        }
        while (layoutNodeW.r0 > layoutNode.r0) {
            layoutNodeW = layoutNodeW.w();
            layoutNodeW.getClass();
        }
        LayoutNode layoutNodeW2 = layoutNode;
        while (layoutNodeW2.r0 > layoutNodeW.r0) {
            layoutNodeW2 = layoutNodeW2.w();
            layoutNodeW2.getClass();
        }
        while (layoutNodeW != layoutNodeW2) {
            layoutNodeW = layoutNodeW.w();
            layoutNodeW2 = layoutNodeW2.w();
            if (layoutNodeW == null || layoutNodeW2 == null) {
                bt.q("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (layoutNodeW2 != layoutNode) {
            if (layoutNodeW != i55Var.w0) {
                return (fd3) layoutNodeW.H0.f0;
            }
            return i55Var;
        }
        return this;
    }

    public final long S0(long j) {
        long j2 = this.H0;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        lf5 lf5Var = this.V0;
        if (lf5Var != null) {
            au2 au2Var = (au2) lf5Var;
            float[] fArrA = au2Var.a();
            if (fArrA == null) {
                return 9187343241974906880L;
            }
            if (!au2Var.u0) {
                return or4.b(fArrA, jFloatToRawIntBits);
            }
        }
        return jFloatToRawIntBits;
    }

    @Override // defpackage.eo5
    public void T(long j, float f, xt2 xt2Var) {
        m1(j, f, null, xt2Var);
        if (this.p0) {
            return;
        }
        this.w0.I0.p.l0();
    }

    public abstract xi4 T0();

    public final long U0() {
        return this.C0.D0(this.w0.C0.d());
    }

    public abstract jx4 V0();

    public final boolean W0() {
        return this.O0 && !this.M0.h();
    }

    public final jx4 X0(int i) {
        boolean zG = j55.g(i);
        jx4 jx4VarV0 = V0();
        if (!zG && (jx4VarV0 = jx4VarV0.g0) == null) {
            return null;
        }
        for (jx4 jx4VarY0 = Y0(zG); jx4VarY0 != null && (jx4VarY0.f0 & i) != 0; jx4VarY0 = jx4VarY0.h0) {
            if ((jx4VarY0.Z & i) != 0) {
                return jx4VarY0;
            }
            if (jx4VarY0 == jx4VarV0) {
                return null;
            }
        }
        return null;
    }

    public final jx4 Y0(boolean z) {
        jx4 jx4VarV0;
        LayoutNode layoutNode = this.w0;
        if (layoutNode.getOuterCoordinator$ui() == this) {
            return (jx4) layoutNode.H0.i0;
        }
        i55 i55Var = this.y0;
        if (!z) {
            if (i55Var != null) {
                return i55Var.V0();
            }
            return null;
        }
        if (i55Var == null || (jx4VarV0 = i55Var.V0()) == null) {
            return null;
        }
        return jx4VarV0.h0;
    }

    public final void Z0(jx4 jx4Var, h55 h55Var, long j, q03 q03Var, int i, boolean z) {
        if (jx4Var == null) {
            c1(h55Var, j, q03Var, i, z);
            return;
        }
        if (!h55Var.f(jx4Var)) {
            Z0(w51.J(jx4Var, h55Var.e()), h55Var, j, q03Var, i, z);
            return;
        }
        int i2 = q03Var.Z;
        j05 j05Var = q03Var.X;
        q03Var.b(i2 + 1, j05Var.b);
        q03Var.Z++;
        j05Var.a(jx4Var);
        q03Var.Y.a(km4.d(-1.0f, z, false));
        Z0(w51.J(jx4Var, h55Var.e()), h55Var, j, q03Var, i, z);
        q03Var.Z = i2;
    }

    public final void a1(jx4 jx4Var, h55 h55Var, long j, q03 q03Var, int i, boolean z, float f) {
        if (jx4Var == null) {
            c1(h55Var, j, q03Var, i, z);
            return;
        }
        if (!h55Var.f(jx4Var)) {
            a1(w51.J(jx4Var, h55Var.e()), h55Var, j, q03Var, i, z, f);
            return;
        }
        int i2 = q03Var.Z;
        j05 j05Var = q03Var.X;
        q03Var.b(i2 + 1, j05Var.b);
        q03Var.Z++;
        j05Var.a(jx4Var);
        q03Var.Y.a(km4.d(f, z, false));
        k1(w51.J(jx4Var, h55Var.e()), h55Var, j, q03Var, i, z, f, true);
        q03Var.Z = i2;
    }

    @Override // defpackage.y24
    public final long b(long j) {
        long jI = I(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) q34.a(this.w0);
        androidComposeView.y();
        return or4.b(androidComposeView.Z0, jI);
    }

    @Override // defpackage.fi1
    public final float b0() {
        return this.w0.A0.b0();
    }

    public final void b1(h55 h55Var, long j, q03 q03Var, int i, boolean z) {
        boolean z2;
        j05 j05Var = q03Var.X;
        jx4 jx4VarX0 = X0(h55Var.e());
        boolean z3 = false;
        if (!v1(j)) {
            if (i == 1) {
                float fN0 = N0(j, U0());
                if ((Float.floatToRawIntBits(fN0) & Integer.MAX_VALUE) < 2139095040) {
                    if (q03Var.Z != j05Var.b - 1) {
                        if (w45.v(q03Var.a(), km4.d(fN0, false, false)) <= 0) {
                            return;
                        }
                    }
                    a1(jx4VarX0, h55Var, j, q03Var, i, false, fN0);
                    return;
                }
                return;
            }
            return;
        }
        if (jx4VarX0 == null) {
            c1(h55Var, j, q03Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < P() && fIntBitsToFloat2 < O()) {
            Z0(jx4VarX0, h55Var, j, q03Var, i, z);
            return;
        }
        float fN1 = i == 1 ? N0(j, U0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fN1) & Integer.MAX_VALUE) < 2139095040) {
            if (q03Var.Z == j05Var.b - 1) {
                z2 = z;
            } else {
                z2 = z;
                if (w45.v(q03Var.a(), km4.d(fN1, z2, false)) > 0) {
                }
            }
            z3 = true;
        } else {
            z2 = z;
        }
        k1(jx4VarX0, h55Var, j, q03Var, i, z2, fN1, z3);
    }

    public void c1(h55 h55Var, long j, q03 q03Var, int i, boolean z) {
        i55 i55Var = this.x0;
        if (i55Var != null) {
            i55Var.b1(h55Var, i55Var.S0(j), q03Var, i, z);
        }
    }

    public final void d1() {
        lf5 lf5Var = this.V0;
        if (lf5Var != null) {
            ((au2) lf5Var).c();
            return;
        }
        i55 i55Var = this.y0;
        if (i55Var != null) {
            i55Var.d1();
        }
    }

    public final boolean e1() {
        if (this.V0 != null && this.E0 <= 0.0f) {
            return true;
        }
        i55 i55Var = this.y0;
        if (i55Var != null) {
            return i55Var.e1();
        }
        return false;
    }

    public final void f1() {
        this.w0.I0.b();
    }

    @Override // defpackage.y24
    public final boolean g() {
        return V0().p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [jx4] */
    /* JADX WARN: Type inference failed for: r7v7, types: [jx4] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [c15] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [c15] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void g1() {
        jx4 jx4VarV0;
        boolean zG = j55.g(128);
        jx4 jx4VarY0 = Y0(zG);
        if (jx4VarY0 == null || (jx4VarY0.X.f0 & 128) == 0) {
            return;
        }
        dd7 dd7VarD = yn0.D();
        gn2 gn2VarE = dd7VarD != null ? dd7VarD.e() : null;
        dd7 dd7VarP = yn0.P(dd7VarD);
        try {
            if (!zG) {
                jx4VarV0 = V0().g0;
                if (jx4VarV0 == null) {
                }
                yn0.c0(dd7VarD, dd7VarP, gn2VarE);
            }
            jx4VarV0 = V0();
            for (jx4 jx4VarY1 = Y0(zG); jx4VarY1 != null && (jx4VarY1.f0 & 128) != 0; jx4VarY1 = jx4VarY1.h0) {
                if ((jx4VarY1.Z & 128) != 0) {
                    ?? T = jx4VarY1;
                    ?? c15Var = 0;
                    while (T != 0) {
                        if (T instanceof as4) {
                            ((as4) T).a(this.Z);
                        } else if ((T.Z & 128) != 0 && (T instanceof oh1)) {
                            jx4 jx4Var = ((oh1) T).r0;
                            int i = 0;
                            T = T;
                            c15Var = c15Var;
                            while (jx4Var != null) {
                                if ((jx4Var.Z & 128) != 0) {
                                    i++;
                                    if (i == 1) {
                                        c15Var = c15Var;
                                        T = jx4Var;
                                    } else {
                                        if (c15Var == 0) {
                                            c15Var = new c15(0, new jx4[16]);
                                        }
                                        if (T != 0) {
                                            c15Var.b(T);
                                            T = 0;
                                        }
                                        c15Var.b(jx4Var);
                                    }
                                }
                                jx4Var = jx4Var.h0;
                                T = T;
                                c15Var = c15Var;
                            }
                            if (i == 1) {
                            }
                        }
                        T = yn0.T(c15Var);
                    }
                }
                if (jx4VarY1 == jx4VarV0) {
                    break;
                }
            }
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
        } catch (Throwable th) {
            yn0.c0(dd7VarD, dd7VarP, gn2VarE);
            throw th;
        }
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        return this.w0.A0.getDensity();
    }

    @Override // defpackage.ug3
    public final z24 getLayoutDirection() {
        return this.w0.B0;
    }

    @Override // defpackage.y24
    public final void h(float[] fArr) {
        mf5 mf5VarA = q34.a(this.w0);
        i55 i55VarR1 = r1(jm4.x(this));
        while (!this.equals(i55VarR1)) {
            lf5 lf5Var = this.V0;
            if (lf5Var != null) {
                or4.f(fArr, ((au2) lf5Var).b());
            }
            long j = this.H0;
            if (!hf3.a(j, 0L)) {
                float[] fArr2 = b1;
                or4.d(fArr2);
                or4.g(fArr2, (int) (j >> 32), (int) (4294967295L & j));
                or4.f(fArr, fArr2);
            }
            this = this.y0;
            this.getClass();
        }
        if (mf5VarA instanceof pr4) {
            AndroidComposeView androidComposeView = (AndroidComposeView) ((pr4) mf5VarA);
            androidComposeView.y();
            or4.f(fArr, androidComposeView.Z0);
            oc.B(fArr, Float.intBitsToFloat((int) (androidComposeView.d1 >> 32)), Float.intBitsToFloat((int) (androidComposeView.d1 & 4294967295L)), androidComposeView.X0);
            return;
        }
        long jN = i55VarR1.n(0L);
        if ((9223372034707292159L & jN) != 9205357640488583168L) {
            or4.g(fArr, Float.intBitsToFloat((int) (jN >> 32)), Float.intBitsToFloat((int) (jN & 4294967295L)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [jx4] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [jx4] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void h1() {
        boolean zG = j55.g(4194304);
        jx4 jx4VarV0 = V0();
        if (!zG && (jx4VarV0 = jx4VarV0.g0) == null) {
            return;
        }
        for (jx4 jx4VarY0 = Y0(zG); jx4VarY0 != null && (jx4VarY0.f0 & 4194304) != 0; jx4VarY0 = jx4VarY0.h0) {
            if ((jx4VarY0.Z & 4194304) != 0) {
                ?? T = jx4VarY0;
                ?? c15Var = 0;
                while (T != 0) {
                    if (T instanceof w24) {
                        ((w24) T).n(this);
                    } else if ((T.Z & 4194304) != 0 && (T instanceof oh1)) {
                        jx4 jx4Var = ((oh1) T).r0;
                        int i = 0;
                        T = T;
                        c15Var = c15Var;
                        while (jx4Var != null) {
                            if ((jx4Var.Z & 4194304) != 0) {
                                i++;
                                if (i == 1) {
                                    c15Var = c15Var;
                                    T = jx4Var;
                                } else {
                                    if (c15Var == 0) {
                                        c15Var = new c15(0, new jx4[16]);
                                    }
                                    if (T != 0) {
                                        c15Var.b(T);
                                        T = 0;
                                    }
                                    c15Var.b(jx4Var);
                                }
                            }
                            jx4Var = jx4Var.h0;
                            T = T;
                            c15Var = c15Var;
                        }
                        if (i == 1) {
                        }
                    }
                    T = yn0.T(c15Var);
                }
            }
            if (jx4VarY0 == jx4VarV0) {
                return;
            }
        }
    }

    public final void i1() {
        this.z0 = true;
        this.T0.invoke();
        o1();
        if (hf3.a(this.H0, 0L)) {
            return;
        }
        this.w0.Q(this);
    }

    @Override // defpackage.y24
    public final long j() {
        return this.Z;
    }

    public final void j1() {
        boolean zG = j55.g(1048576);
        jx4 jx4VarY0 = Y0(zG);
        if (jx4VarY0 == null || (jx4VarY0.X.f0 & 1048576) == 0) {
            return;
        }
        jx4 jx4VarV0 = V0();
        if (!zG && (jx4VarV0 = jx4VarV0.g0) == null) {
            return;
        }
        for (jx4 jx4VarY1 = Y0(zG); jx4VarY1 != null && (jx4VarY1.f0 & 1048576) != 0; jx4VarY1 = jx4VarY1.h0) {
            if ((jx4VarY1.Z & 1048576) != 0) {
                jx4 jx4VarT = jx4VarY1;
                c15 c15Var = null;
                while (jx4VarT != null) {
                    if (jx4VarT instanceof ai2) {
                    } else if ((jx4VarT.Z & 1048576) != 0 && (jx4VarT instanceof oh1)) {
                        int i = 0;
                        for (jx4 jx4Var = ((oh1) jx4VarT).r0; jx4Var != null; jx4Var = jx4Var.h0) {
                            if ((jx4Var.Z & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    jx4VarT = jx4Var;
                                } else {
                                    if (c15Var == null) {
                                        c15Var = new c15(0, new jx4[16]);
                                    }
                                    if (jx4VarT != null) {
                                        c15Var.b(jx4VarT);
                                        jx4VarT = null;
                                    }
                                    c15Var.b(jx4Var);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    jx4VarT = yn0.T(c15Var);
                }
            }
            if (jx4VarY1 == jx4VarV0) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01d8 A[PHI: r3
  0x01d8: PHI (r3v18 ??) = (r3v1 ??), (r3v1 ??), (r3v20 ??) binds: [B:58:0x01a1, B:60:0x01a5, B:74:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [jx4] */
    /* JADX WARN: Type inference failed for: r2v22, types: [jx4] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v18, types: [c15] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [c15] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r4v13 */
    public final void k1(jx4 jx4Var, h55 h55Var, long j, q03 q03Var, int i, boolean z, float f, boolean z2) {
        char c;
        int i2;
        ?? T;
        j05 j05Var = q03Var.X;
        if (jx4Var == null) {
            c1(h55Var, j, q03Var, i, z);
            return;
        }
        if (!h55Var.f(jx4Var)) {
            k1(w51.J(jx4Var, h55Var.e()), h55Var, j, q03Var, i, z, f, z2);
            return;
        }
        int i3 = i;
        if (i3 == 3 || i3 == 4) {
            ?? r2 = jx4Var;
            ?? c15Var = 0;
            while (r2 != 0) {
                if (r2 instanceof kq5) {
                    long jP = ((kq5) r2).p();
                    int i4 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i4);
                    LayoutNode layoutNode = this.w0;
                    z24 z24Var = layoutNode.B0;
                    int i5 = vc8.b;
                    long j2 = Long.MIN_VALUE & jP;
                    z24 z24Var2 = z24.X;
                    if (j2 == 0 || z24Var == z24Var2) {
                        c = 30;
                        i2 = (int) jP;
                    } else {
                        c = 30;
                        i2 = (int) (jP >> 30);
                    }
                    if (fIntBitsToFloat < (-(i2 & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i4) >= P() + (((j2 == 0 || layoutNode.B0 == z24Var2) ? (int) (jP >> c) : (int) jP) & 32767)) {
                        break;
                    }
                    int i6 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i6) < (-(((int) (jP >> 15)) & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i6) >= (((int) (jP >> 45)) & 32767) + O()) {
                        break;
                    }
                    zz4 zz4Var = q03Var.Y;
                    int i7 = q03Var.Z;
                    int i8 = j05Var.b;
                    if (i7 == i8 - 1) {
                        q03Var.b(i7 + 1, i8);
                        q03Var.Z++;
                        j05Var.a(jx4Var);
                        zz4Var.a(km4.d(0.0f, z, true));
                        k1(w51.J(jx4Var, h55Var.e()), h55Var, j, q03Var, i3, z, f, z2);
                        q03Var.Z = i7;
                        return;
                    }
                    long jA = q03Var.a();
                    int i9 = q03Var.Z;
                    if (!w45.N(jA)) {
                        if (w45.K(jA) > 0.0f) {
                            int i10 = q03Var.Z;
                            q03Var.b(i10 + 1, j05Var.b);
                            q03Var.Z++;
                            j05Var.a(jx4Var);
                            zz4Var.a(km4.d(0.0f, z, true));
                            k1(w51.J(jx4Var, h55Var.e()), h55Var, j, q03Var, i, z, f, z2);
                            q03Var.Z = i10;
                            return;
                        }
                        return;
                    }
                    int i11 = j05Var.b;
                    int i12 = i11 - 1;
                    q03Var.Z = i12;
                    q03Var.b(i11, j05Var.b);
                    q03Var.Z++;
                    j05Var.a(jx4Var);
                    zz4Var.a(km4.d(0.0f, z, true));
                    k1(w51.J(jx4Var, h55Var.e()), h55Var, j, q03Var, i, z, f, z2);
                    q03Var.Z = i12;
                    if (w45.K(q03Var.a()) < 0.0f) {
                        q03Var.b(i9 + 1, q03Var.Z + 1);
                    }
                    q03Var.Z = i9;
                    return;
                }
                if ((r2.Z & 16) == 0 || !(r2 instanceof oh1)) {
                    T = r2;
                    c15Var = c15Var;
                    T = yn0.T(c15Var);
                } else {
                    jx4 jx4Var2 = ((oh1) r2).r0;
                    int i13 = 0;
                    while (jx4Var2 != null) {
                        if ((jx4Var2.Z & 16) != 0) {
                            i13++;
                            if (i13 == 1) {
                                T = r2;
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
                            T = r2;
                            c15Var = c15Var;
                        }
                        jx4Var2 = jx4Var2.h0;
                        T = T;
                        c15Var = c15Var;
                    }
                    if (i13 == 1) {
                        T = r2;
                        c15Var = c15Var;
                    } else {
                        T = r2;
                        c15Var = c15Var;
                        T = yn0.T(c15Var);
                    }
                }
                i3 = i;
                r2 = T;
                c15Var = c15Var;
            }
        }
        if (z2) {
            a1(jx4Var, h55Var, j, q03Var, i, z, f);
        } else {
            q1(jx4Var, h55Var, j, q03Var, i, z, f);
        }
    }

    @Override // defpackage.vi4
    public final vi4 l0() {
        return this.x0;
    }

    public void l1(sm0 sm0Var, xt2 xt2Var) {
        LayoutNode layoutNode = this.w0;
        mf5 mf5VarA = q34.a(layoutNode);
        c15 c15VarB = layoutNode.B();
        Object[] objArr = c15VarB.X;
        int i = c15VarB.Z;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.L()) {
                layoutNode2.i(sm0Var, xt2Var);
            }
        }
        if (mf5VarA.getShowLayoutBounds()) {
            df dfVar = fd3.g1;
            long j = this.Z;
            sm0Var.j(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, dfVar);
        }
    }

    public final void m1(long j, float f, gn2 gn2Var, xt2 xt2Var) {
        byte b = 0;
        LayoutNode layoutNode = this.w0;
        if (xt2Var != null) {
            if (gn2Var != null) {
                wc3.a("both ways to create layers shouldn't be used together");
            }
            if (this.W0 != xt2Var) {
                this.W0 = null;
                t1(null, false);
                this.W0 = xt2Var;
            }
            if (this.V0 == null) {
                mf5 mf5VarA = q34.a(layoutNode);
                i9 i9Var = this.S0;
                if (i9Var == null) {
                    i9 i9Var2 = new i9(this, new e55(this, b), (byte) 23);
                    this.S0 = i9Var2;
                    i9Var = i9Var2;
                }
                e55 e55Var = this.T0;
                lf5 lf5VarE = ((AndroidComposeView) mf5VarA).e(i9Var, e55Var, xt2Var);
                au2 au2Var = (au2) lf5VarE;
                au2Var.e(this.Z);
                au2Var.d(j);
                this.V0 = lf5VarE;
                layoutNode.L0 = true;
                e55Var.invoke();
            }
        } else {
            if (this.W0 != null) {
                this.W0 = null;
                t1(null, false);
            }
            t1(gn2Var, false);
        }
        if (!hf3.a(this.H0, j)) {
            ((AndroidComposeView) q34.a(layoutNode)).K(-4.0f);
            this.H0 = j;
            lf5 lf5Var = this.V0;
            if (lf5Var != null) {
                ((au2) lf5Var).d(j);
            } else {
                i55 i55Var = this.y0;
                if (i55Var != null) {
                    i55Var.d1();
                }
            }
            layoutNode.Q(this);
            vi4.z0(this);
            mf5 mf5Var = layoutNode.q0;
            if (mf5Var != null) {
                ((AndroidComposeView) mf5Var).t(layoutNode);
            }
        }
        this.I0 = f;
        if (this == layoutNode.getOuterCoordinator$ui() && !this.q0) {
            q34.a(layoutNode).getRectManager().g(layoutNode);
        }
        if (this.q0) {
            return;
        }
        j0(s0());
    }

    @Override // defpackage.y24
    public final long n(long j) {
        if (!V0().p0) {
            wc3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((AndroidComposeView) q34.a(this.w0)).p(I(j));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    public final void n1(r05 r05Var, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        lf5 lf5Var = this.V0;
        if (lf5Var != null) {
            if (this.A0) {
                if (z2) {
                    long jU0 = U0();
                    float f = r05Var.b;
                    float f2 = r05Var.c;
                    if (r05Var.d >= 0.0f) {
                        long j = this.Z;
                        if (f > ((int) (j >> 32)) || r05Var.e < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jU0 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jU0 & 4294967295L));
                            float f3 = (fIntBitsToFloat - (r05Var.d - r05Var.b)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (r05Var.e - r05Var.c)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-fIntBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j2 = this.Z;
                    float f7 = (int) (j2 >> 32);
                    int i = (int) (jU0 >> 32);
                    float f8 = (int) (j2 & 4294967295L);
                    int i2 = (int) (jU0 & 4294967295L);
                    r05Var.a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                } else if (z) {
                    long j3 = this.Z;
                    r05Var.a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (r05Var.b()) {
                    return;
                }
            }
            au2 au2Var = (au2) lf5Var;
            float[] fArrB = au2Var.b();
            if (!au2Var.u0) {
                if (fArrB == null) {
                    r05Var.b = 0.0f;
                    r05Var.c = 0.0f;
                    r05Var.d = 0.0f;
                    r05Var.e = 0.0f;
                } else {
                    or4.c(fArrB, r05Var);
                }
            }
        }
        long j4 = this.H0;
        float f9 = (int) (j4 >> 32);
        r05Var.b += f9;
        r05Var.d += f9;
        float f10 = (int) (j4 & 4294967295L);
        r05Var.c += f10;
        r05Var.e += f10;
    }

    public final void o1() {
        if (this.V0 != null) {
            if (this.W0 != null) {
                this.W0 = null;
            }
            t1(null, false);
            this.w0.X(false);
        }
    }

    @Override // defpackage.y24
    public final long p(long j) {
        if (!V0().p0) {
            wc3.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        y24 y24VarX = jm4.x(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) q34.a(this.w0);
        androidComposeView.y();
        return F(y24VarX, z85.e(or4.b(androidComposeView.a1, j), y24VarX.I(0L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [jx4] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [jx4] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [c15] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [c15] */
    public final void p1(yr4 yr4Var) {
        i55 i55Var;
        yr4 yr4Var2 = this.F0;
        if (yr4Var != yr4Var2) {
            this.F0 = yr4Var;
            LayoutNode layoutNode = this.w0;
            int i = 0;
            if (yr4Var2 == null || yr4Var.b() != yr4Var2.b() || yr4Var.a() != yr4Var2.a()) {
                int iB = yr4Var.b();
                int iA = yr4Var.a();
                lf5 lf5Var = this.V0;
                if (lf5Var != null) {
                    ((au2) lf5Var).e((((long) iB) << 32) | (((long) iA) & 4294967295L));
                } else if (layoutNode.L() && (i55Var = this.y0) != null) {
                    i55Var.d1();
                }
                V((((long) iA) & 4294967295L) | (((long) iB) << 32));
                if (this.B0 != null) {
                    u1(false);
                }
                boolean zG = j55.g(4);
                jx4 jx4VarV0 = V0();
                if (zG || (jx4VarV0 = jx4VarV0.g0) != null) {
                    for (jx4 jx4VarY0 = Y0(zG); jx4VarY0 != null && (jx4VarY0.f0 & 4) != 0; jx4VarY0 = jx4VarY0.h0) {
                        if ((jx4VarY0.Z & 4) != 0) {
                            ?? T = jx4VarY0;
                            ?? c15Var = 0;
                            while (T != 0) {
                                if (T instanceof rv1) {
                                    ((rv1) T).O();
                                } else if ((T.Z & 4) != 0 && (T instanceof oh1)) {
                                    jx4 jx4Var = ((oh1) T).r0;
                                    int i2 = 0;
                                    T = T;
                                    c15Var = c15Var;
                                    while (jx4Var != null) {
                                        if ((jx4Var.Z & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                c15Var = c15Var;
                                                T = jx4Var;
                                            } else {
                                                if (c15Var == 0) {
                                                    c15Var = new c15(0, new jx4[16]);
                                                }
                                                if (T != 0) {
                                                    c15Var.b(T);
                                                    T = 0;
                                                }
                                                c15Var.b(jx4Var);
                                            }
                                        }
                                        jx4Var = jx4Var.h0;
                                        T = T;
                                        c15Var = c15Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                T = yn0.T(c15Var);
                            }
                        }
                        if (jx4VarY0 == jx4VarV0) {
                            break;
                        }
                    }
                }
                mf5 mf5Var = layoutNode.q0;
                if (mf5Var != null) {
                    ((AndroidComposeView) mf5Var).t(layoutNode);
                }
                layoutNode.Q(this);
            }
            f05 f05Var = this.G0;
            if ((f05Var == null || f05Var.e == 0) && yr4Var.c().isEmpty()) {
                return;
            }
            f05 f05Var2 = this.G0;
            Map mapC = yr4Var.c();
            if (f05Var2 != null && f05Var2.e == mapC.size()) {
                Object[] objArr = f05Var2.b;
                int[] iArr = f05Var2.c;
                long[] jArr = f05Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapC.get((r8) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            layoutNode.I0.p.A0.f();
            f05 f05Var3 = this.G0;
            if (f05Var3 == null) {
                f05 f05Var4 = g85.a;
                f05Var3 = new f05();
                this.G0 = f05Var3;
            }
            f05Var3.a();
            for (Map.Entry entry : yr4Var.c().entrySet()) {
                f05Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // defpackage.vi4
    public final boolean q0() {
        return this.F0 != null;
    }

    public final void q1(jx4 jx4Var, h55 h55Var, long j, q03 q03Var, int i, boolean z, float f) {
        int i2;
        j05 j05Var = q03Var.X;
        if (jx4Var == null) {
            c1(h55Var, j, q03Var, i, z);
            return;
        }
        if (!h55Var.f(jx4Var)) {
            q1(w51.J(jx4Var, h55Var.e()), h55Var, j, q03Var, i, z, f);
            return;
        }
        if (!h55Var.c(jx4Var)) {
            k1(w51.J(jx4Var, h55Var.e()), h55Var, j, q03Var, i, z, f, false);
            return;
        }
        zz4 zz4Var = q03Var.Y;
        int i3 = q03Var.Z;
        int i4 = j05Var.b;
        if (i3 != i4 - 1) {
            long jA = q03Var.a();
            int i5 = q03Var.Z;
            int i6 = j05Var.b;
            int i7 = i6 - 1;
            q03Var.Z = i7;
            q03Var.b(i6, j05Var.b);
            q03Var.Z++;
            j05Var.a(jx4Var);
            zz4Var.a(km4.d(f, z, false));
            k1(w51.J(jx4Var, h55Var.e()), h55Var, j, q03Var, i, z, f, false);
            q03Var.Z = i7;
            long jA2 = q03Var.a();
            if (q03Var.Z + 1 >= j05Var.b - 1 || w45.v(jA, jA2) <= 0) {
                q03Var.b(q03Var.Z + 1, j05Var.b);
            } else {
                int i8 = i5 + 1;
                boolean zN = w45.N(jA2);
                int i9 = q03Var.Z;
                q03Var.b(i8, zN ? i9 + 2 : i9 + 1);
            }
            q03Var.Z = i5;
            return;
        }
        int i10 = i3 + 1;
        q03Var.b(i10, i4);
        q03Var.Z++;
        j05Var.a(jx4Var);
        zz4Var.a(km4.d(f, z, false));
        k1(w51.J(jx4Var, h55Var.e()), h55Var, j, q03Var, i, z, f, false);
        q03Var.Z = i3;
        if (i10 == j05Var.b - 1 || w45.N(q03Var.a())) {
            int i11 = q03Var.Z;
            int i12 = i11 + 1;
            j05Var.l(i12);
            if (i12 < 0 || i12 >= (i2 = zz4Var.b)) {
                kp5.k("Index must be between 0 and size");
                return;
            }
            long[] jArr = zz4Var.a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                eu.f0(jArr, jArr, i12, i11 + 2, i2);
            }
            zz4Var.b--;
        }
    }

    @Override // defpackage.vi4
    public final LayoutNode r0() {
        return this.w0;
    }

    @Override // defpackage.vi4
    public final yr4 s0() {
        yr4 yr4Var = this.F0;
        if (yr4Var != null) {
            return yr4Var;
        }
        bt.i("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    public final s86 s1() {
        if (V0().p0) {
            y24 y24VarX = jm4.x(this);
            r05 r05Var = this.J0;
            if (r05Var == null) {
                r05Var = new r05();
                this.J0 = r05Var;
            }
            long jM0 = M0(U0());
            float f = W0() ? this.M0.a : 0.0f;
            float f2 = W0() ? this.M0.b : 0.0f;
            float fP = W0() ? this.M0.c : P();
            float fO = W0() ? this.M0.d : O();
            int i = (int) (jM0 >> 32);
            r05Var.b = f - Float.intBitsToFloat(i);
            int i2 = (int) (jM0 & 4294967295L);
            r05Var.c = f2 - Float.intBitsToFloat(i2);
            r05Var.d = Float.intBitsToFloat(i) + fP;
            r05Var.e = Float.intBitsToFloat(i2) + fO;
            while (this != y24VarX) {
                this.n1(r05Var, false, true);
                if (!r05Var.b()) {
                    this = this.y0;
                    this.getClass();
                }
            }
            return new s86(r05Var.b, r05Var.c, r05Var.d, r05Var.e);
        }
        return s86.e;
    }

    @Override // defpackage.vi4, defpackage.nf5
    public final boolean t() {
        return (this.V0 == null || this.z0 || !this.w0.K()) ? false : true;
    }

    @Override // defpackage.vi4
    public final vi4 t0() {
        return this.y0;
    }

    public final void t1(gn2 gn2Var, boolean z) {
        mf5 mf5Var;
        c15 c15Var;
        Reference referencePoll;
        if (gn2Var != null && this.W0 != null) {
            wc3.a("layerBlock can't be provided when explicitLayer is provided");
        }
        byte b = 0;
        LayoutNode layoutNode = this.w0;
        boolean z2 = (!z && this.B0 == gn2Var && dh3.f(this.C0, layoutNode.A0) && this.D0 == layoutNode.B0) ? false : true;
        this.C0 = layoutNode.A0;
        this.D0 = layoutNode.B0;
        boolean zK = layoutNode.K();
        e55 e55Var = this.T0;
        if (zK && gn2Var != null) {
            this.B0 = gn2Var;
            if (this.V0 != null) {
                if (z2) {
                    u1(true);
                    return;
                }
                return;
            }
            mf5 mf5VarA = q34.a(layoutNode);
            i9 i9Var = this.S0;
            if (i9Var == null) {
                i9 i9Var2 = new i9(this, new e55(this, b), (byte) 23);
                this.S0 = i9Var2;
                i9Var = i9Var2;
            }
            lf5 lf5VarE = ((AndroidComposeView) mf5VarA).e(i9Var, e55Var, null);
            au2 au2Var = (au2) lf5VarE;
            au2Var.e(this.Z);
            au2Var.d(this.H0);
            this.V0 = lf5VarE;
            u1(true);
            layoutNode.L0 = true;
            e55Var.invoke();
            return;
        }
        this.B0 = null;
        lf5 lf5Var = this.V0;
        if (lf5Var != null) {
            au2 au2Var2 = (au2) lf5Var;
            if (!ch3.K(au2Var2.b())) {
                layoutNode.Q(this);
            }
            au2Var2.f0 = null;
            au2Var2.g0 = null;
            au2Var2.i0 = true;
            au2Var2.f(false);
            vt2 vt2Var = au2Var2.Y;
            if (vt2Var != null) {
                vt2Var.a(au2Var2.X);
                AndroidComposeView androidComposeView = au2Var2.Z;
                xd6 xd6Var = androidComposeView.q1;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) xd6Var.Z;
                    c15Var = (c15) xd6Var.Y;
                    referencePoll = referenceQueue.poll();
                    if (referencePoll != null) {
                        c15Var.j(referencePoll);
                    }
                } while (referencePoll != null);
                c15Var.b(new WeakReference(au2Var2, (ReferenceQueue) xd6Var.Z));
                androidComposeView.F0.k(au2Var2);
            }
            this.V0 = null;
            layoutNode.L0 = true;
            e55Var.invoke();
            if (V0().p0 && layoutNode.L() && (mf5Var = layoutNode.q0) != null) {
                ((AndroidComposeView) mf5Var).t(layoutNode);
            }
        }
        this.U0 = false;
    }

    @Override // defpackage.vi4
    public final long u0() {
        return this.H0;
    }

    public final void u1(boolean z) {
        char c;
        long j;
        boolean z2;
        LayoutNode layoutNode;
        dn2 dn2Var;
        int i;
        dn2 dn2Var2;
        if (this.W0 != null) {
            return;
        }
        lf5 lf5Var = this.V0;
        gn2 gn2Var = this.B0;
        if (lf5Var == null) {
            if (gn2Var == null) {
                return;
            }
            wc3.b("null layer with a non-null layerBlock");
            return;
        }
        if (gn2Var == null) {
            throw p61.j("updateLayerParameters requires a non-null layerBlock");
        }
        pk6 pk6Var = Z0;
        pk6Var.a();
        LayoutNode layoutNode2 = this.w0;
        pk6Var.v0 = layoutNode2.A0;
        pk6Var.w0 = layoutNode2.B0;
        pk6Var.t0 = u15.R(this.Z);
        aa6 aa6Var = new aa6();
        q34.a(layoutNode2).getSnapshotObserver().a.c(this, X0, new g00((Object) gn2Var, (Object) this, (Object) aa6Var, (byte) 14));
        v24 v24Var = this.K0;
        if (v24Var == null) {
            v24Var = new v24();
            this.K0 = v24Var;
        }
        v24 v24Var2 = a1;
        v24Var2.getClass();
        v24Var2.a = v24Var.a;
        v24Var2.b = v24Var.b;
        v24Var2.c = v24Var.c;
        v24Var2.d = v24Var.d;
        v24Var2.e = v24Var.e;
        v24Var2.f = v24Var.f;
        v24Var2.g = v24Var.g;
        v24Var2.h = v24Var.h;
        v24Var2.i = v24Var.i;
        v24Var.a = pk6Var.Y;
        v24Var.b = pk6Var.Z;
        v24Var.c = pk6Var.g0;
        v24Var.d = pk6Var.h0;
        v24Var.e = pk6Var.l0;
        v24Var.f = pk6Var.m0;
        v24Var.g = pk6Var.n0;
        v24Var.h = pk6Var.o0;
        v24Var.i = pk6Var.p0;
        au2 au2Var = (au2) lf5Var;
        AndroidComposeView androidComposeView = au2Var.Z;
        int i2 = pk6Var.X | au2Var.p0;
        au2Var.n0 = pk6Var.w0;
        fi1 fi1Var = pk6Var.v0;
        au2Var.m0 = fi1Var;
        if ((1048576 & i2) != 0) {
            xt2 xt2Var = au2Var.X;
            int iX0 = fi1Var.x0(pk6Var.u0.a);
            int iX1 = fi1Var.x0(pk6Var.u0.b);
            int iX2 = fi1Var.x0(pk6Var.u0.c);
            int iX3 = fi1Var.x0(pk6Var.u0.d);
            xt2Var.v = iX0;
            xt2Var.w = iX1;
            xt2Var.x = iX2;
            xt2Var.y = iX3;
            xt2Var.a.w(iX0, iX1, iX2, iX3);
            au2Var.c();
        }
        int i3 = i2 & 4096;
        if (i3 != 0) {
            au2Var.q0 = pk6Var.p0;
        }
        if ((i2 & 1) != 0) {
            xt2 xt2Var2 = au2Var.X;
            float f = pk6Var.Y;
            zt2 zt2Var = xt2Var2.a;
            if (zt2Var.c() != f) {
                zt2Var.A(f);
            }
        }
        if ((i2 & 2) != 0) {
            xt2 xt2Var3 = au2Var.X;
            float f2 = pk6Var.Z;
            zt2 zt2Var2 = xt2Var3.a;
            if (zt2Var2.N() != f2) {
                zt2Var2.o(f2);
            }
        }
        if ((i2 & 4) != 0) {
            au2Var.X.f(pk6Var.f0);
        }
        if ((i2 & 8) != 0) {
            xt2 xt2Var4 = au2Var.X;
            float f3 = pk6Var.g0;
            zt2 zt2Var3 = xt2Var4.a;
            if (zt2Var3.D() != f3) {
                zt2Var3.I(f3);
            }
        }
        if ((i2 & 16) != 0) {
            xt2 xt2Var5 = au2Var.X;
            float f4 = pk6Var.h0;
            zt2 zt2Var4 = xt2Var5.a;
            if (zt2Var4.x() != f4) {
                zt2Var4.g(f4);
            }
        }
        if ((i2 & 32) != 0) {
            xt2 xt2Var6 = au2Var.X;
            float f5 = pk6Var.i0;
            zt2 zt2Var5 = xt2Var6.a;
            if (zt2Var5.M() != f5) {
                zt2Var5.d(f5);
                xt2Var6.g = true;
                xt2Var6.a();
            }
            if (pk6Var.i0 > 0.0f && !au2Var.v0 && (dn2Var2 = au2Var.g0) != null) {
                dn2Var2.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            xt2 xt2Var7 = au2Var.X;
            long j2 = pk6Var.j0;
            zt2 zt2Var6 = xt2Var7.a;
            long jU = zt2Var6.u();
            int i4 = dw0.h;
            if (!tk8.a(j2, jU)) {
                zt2Var6.z(j2);
            }
        }
        if ((i2 & 128) != 0) {
            xt2 xt2Var8 = au2Var.X;
            long j3 = pk6Var.k0;
            zt2 zt2Var7 = xt2Var8.a;
            long jY = zt2Var7.y();
            int i5 = dw0.h;
            if (!tk8.a(j3, jY)) {
                zt2Var7.J(j3);
            }
        }
        if ((i2 & 1024) != 0) {
            xt2 xt2Var9 = au2Var.X;
            float f6 = pk6Var.n0;
            zt2 zt2Var8 = xt2Var9.a;
            if (zt2Var8.s() != f6) {
                zt2Var8.f(f6);
            }
        }
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            xt2 xt2Var10 = au2Var.X;
            float f7 = pk6Var.l0;
            zt2 zt2Var9 = xt2Var10.a;
            if (zt2Var9.G() != f7) {
                zt2Var9.O(f7);
            }
        }
        if ((i2 & 512) != 0) {
            xt2 xt2Var11 = au2Var.X;
            float f8 = pk6Var.m0;
            zt2 zt2Var10 = xt2Var11.a;
            if (zt2Var10.p() != f8) {
                zt2Var10.b(f8);
            }
        }
        if ((i2 & 2048) != 0) {
            xt2 xt2Var12 = au2Var.X;
            float f9 = pk6Var.o0;
            zt2 zt2Var11 = xt2Var12.a;
            if (zt2Var11.B() != f9) {
                zt2Var11.L(f9);
            }
        }
        if (i3 != 0) {
            j = 4294967295L;
            boolean zA = gd8.a(au2Var.q0, gd8.b);
            xt2 xt2Var13 = au2Var.X;
            if (zA) {
                c = ' ';
                if (!z85.b(xt2Var13.z, 9205357640488583168L)) {
                    xt2Var13.z = 9205357640488583168L;
                    xt2Var13.a.t(9205357640488583168L);
                }
            } else {
                c = ' ';
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (au2Var.q0 & 4294967295L)) * ((int) (au2Var.h0 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (au2Var.q0 >> 32)) * ((int) (au2Var.h0 >> 32)))) << 32);
                if (!z85.b(xt2Var13.z, jFloatToRawIntBits)) {
                    xt2Var13.z = jFloatToRawIntBits;
                    xt2Var13.a.t(jFloatToRawIntBits);
                }
            }
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            xt2 xt2Var14 = au2Var.X;
            boolean z3 = pk6Var.r0;
            if (xt2Var14.A != z3) {
                xt2Var14.A = z3;
                xt2Var14.g = true;
                xt2Var14.a();
            }
        }
        if ((131072 & i2) != 0) {
            xt2 xt2Var15 = au2Var.X;
            o60 o60Var = pk6Var.x0;
            zt2 zt2Var12 = xt2Var15.a;
            if (!dh3.f(zt2Var12.e(), o60Var)) {
                zt2Var12.E(o60Var);
            }
        }
        if ((262144 & i2) != 0) {
            xt2 xt2Var16 = au2Var.X;
            g60 g60Var = pk6Var.y0;
            zt2 zt2Var13 = xt2Var16.a;
            if (!dh3.f(zt2Var13.n(), g60Var)) {
                zt2Var13.q(g60Var);
            }
        }
        if ((524288 & i2) != 0) {
            xt2 xt2Var17 = au2Var.X;
            int i6 = pk6Var.z0;
            zt2 zt2Var14 = xt2Var17.a;
            if (zt2Var14.P() != i6) {
                zt2Var14.i(i6);
            }
        }
        if ((32768 & i2) != 0) {
            xt2 xt2Var18 = au2Var.X;
            int i7 = pk6Var.s0;
            if (i7 == 0) {
                i = 0;
            } else if (i7 == 1) {
                i = 1;
            } else {
                i = 2;
                if (i7 != 2) {
                    bt.i("Not supported composition strategy");
                    return;
                }
            }
            zt2 zt2Var15 = xt2Var18.a;
            if (zt2Var15.m() != i) {
                zt2Var15.H(i);
            }
        }
        if ((i2 & 7963) != 0) {
            au2Var.s0 = true;
            au2Var.t0 = true;
        }
        if (dh3.f(au2Var.r0, pk6Var.A0)) {
            layoutNode2 = layoutNode2;
            aa6Var = aa6Var;
            z2 = false;
        } else {
            mb6 mb6Var = pk6Var.A0;
            au2Var.r0 = mb6Var;
            if (mb6Var == null) {
                layoutNode2 = layoutNode2;
                aa6Var = aa6Var;
            } else {
                xt2 xt2Var19 = au2Var.X;
                if (mb6Var instanceof ae5) {
                    s86 s86Var = ((ae5) mb6Var).j0;
                    char c2 = c;
                    float f10 = s86Var.a;
                    float f11 = s86Var.b;
                    xt2Var19.g((((long) Float.floatToRawIntBits(f10)) << c2) | (((long) Float.floatToRawIntBits(f11)) & j), (((long) Float.floatToRawIntBits(s86Var.c - f10)) << c2) | (((long) Float.floatToRawIntBits(s86Var.d - f11)) & j), 0.0f);
                } else {
                    char c3 = c;
                    if (mb6Var instanceof zd5) {
                        lf lfVar = ((zd5) mb6Var).j0;
                        xt2Var19.k = null;
                        xt2Var19.i = 9205357640488583168L;
                        xt2Var19.h = 0L;
                        xt2Var19.j = 0.0f;
                        xt2Var19.g = true;
                        xt2Var19.n = false;
                        xt2Var19.l = lfVar;
                        xt2Var19.a();
                    } else {
                        if (!(mb6Var instanceof be5)) {
                            b61.c();
                            return;
                        }
                        be5 be5Var = (be5) mb6Var;
                        lf lfVar2 = be5Var.k0;
                        if (lfVar2 != null) {
                            xt2Var19.k = null;
                            xt2Var19.i = 9205357640488583168L;
                            xt2Var19.h = 0L;
                            xt2Var19.j = 0.0f;
                            xt2Var19.g = true;
                            xt2Var19.n = false;
                            xt2Var19.l = lfVar2;
                            xt2Var19.a();
                        } else {
                            em6 em6Var = be5Var.j0;
                            float f12 = em6Var.b;
                            float f13 = em6Var.a;
                            xt2Var19.g((((long) Float.floatToRawIntBits(f12)) & j) | (((long) Float.floatToRawIntBits(f13)) << c3), (((long) Float.floatToRawIntBits(em6Var.c - f13)) << c3) | (((long) Float.floatToRawIntBits(em6Var.d - f12)) & j), Float.intBitsToFloat((int) (em6Var.h >> c3)));
                        }
                    }
                    if (Build.VERSION.SDK_INT < 33 && (((mb6Var instanceof zd5) || ((mb6Var instanceof be5) && !pu.z(((be5) mb6Var).j0))) && (dn2Var = au2Var.g0) != null)) {
                        dn2Var.invoke();
                    }
                }
                if (Build.VERSION.SDK_INT < 33) {
                    dn2Var.invoke();
                }
            }
            z2 = true;
        }
        au2Var.p0 = pk6Var.X;
        if (i2 != 0 || z2) {
            if (Build.VERSION.SDK_INT >= 26) {
                gw8.e(androidComposeView);
            } else {
                androidComposeView.invalidate();
            }
            if (AndroidComposeView.l()) {
                androidComposeView.K(0.0f);
            }
        }
        boolean z4 = this.A0;
        this.A0 = pk6Var.r0;
        this.E0 = pk6Var.f0;
        boolean z5 = v24Var2.a == v24Var.a && v24Var2.b == v24Var.b && v24Var2.c == v24Var.c && v24Var2.d == v24Var.d && v24Var2.e == v24Var.e && v24Var2.f == v24Var.f && v24Var2.g == v24Var.g && v24Var2.h == v24Var.h && gd8.a(v24Var2.i, v24Var.i);
        if (!z || (z5 && z4 == this.A0 && !aa6Var.X)) {
            layoutNode = layoutNode2;
        } else {
            layoutNode = layoutNode2;
            mf5 mf5Var = layoutNode.q0;
            if (mf5Var != null) {
                ((AndroidComposeView) mf5Var).t(layoutNode);
            }
        }
        if (z5) {
            return;
        }
        layoutNode.Q(this);
        if (layoutNode.P0 > 0) {
            AndroidComposeView androidComposeView2 = (AndroidComposeView) q34.a(layoutNode);
            zz2 zz2Var = (zz2) androidComposeView2.U0.e;
            if (layoutNode.P0 > 0) {
                ((c15) zz2Var.Y).b(layoutNode);
                layoutNode.O0 = true;
            }
            androidComposeView2.D(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x017d  */
    public final boolean v1(long j) {
        boolean z;
        boolean z2;
        boolean zM;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        lf5 lf5Var = this.V0;
        if (lf5Var == null || !this.A0) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        xt2 xt2Var = ((au2) lf5Var).X;
        if (xt2Var.A) {
            mb6 mb6VarD = xt2Var.d();
            if (mb6VarD instanceof ae5) {
                s86 s86Var = ((ae5) mb6VarD).j0;
                if (s86Var.a > fIntBitsToFloat || fIntBitsToFloat >= s86Var.c || s86Var.b > fIntBitsToFloat2 || fIntBitsToFloat2 >= s86Var.d) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (mb6VarD instanceof be5) {
                em6 em6Var = ((be5) mb6VarD).j0;
                float f = em6Var.c;
                float f2 = em6Var.b;
                float f3 = em6Var.d;
                float f4 = em6Var.a;
                long j2 = em6Var.f;
                long j3 = em6Var.h;
                z = false;
                z2 = true;
                long j4 = em6Var.g;
                long j5 = em6Var.e;
                if (fIntBitsToFloat >= f4 && fIntBitsToFloat < f && fIntBitsToFloat2 >= f2 && fIntBitsToFloat2 < f3) {
                    int i = (int) (j5 >> 32);
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + fIntBitsToFloat3 <= f - f4) {
                        int i3 = (int) (j3 >> 32);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i3);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + fIntBitsToFloat4 <= f - f4) {
                            int i5 = (int) (j5 & 4294967295L);
                            int i6 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f3 - f2) {
                                int i7 = (int) (j2 & 4294967295L);
                                int i8 = (int) (j4 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f3 - f2) {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat(i) + f4;
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i5) + f2;
                                    float fIntBitsToFloat7 = f - Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat8 = Float.intBitsToFloat(i7) + f2;
                                    float fIntBitsToFloat9 = f - Float.intBitsToFloat(i4);
                                    float fIntBitsToFloat10 = f3 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat11 = f3 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat12 = Float.intBitsToFloat(i3) + f4;
                                    if (fIntBitsToFloat < fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                        zM = x97.M(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, em6Var.e);
                                    } else if (fIntBitsToFloat < fIntBitsToFloat12 && fIntBitsToFloat2 > fIntBitsToFloat11) {
                                        zM = x97.M(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, em6Var.h);
                                    } else if (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 >= fIntBitsToFloat8) {
                                        zM = (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) ? z2 : x97.M(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, em6Var.g);
                                    } else {
                                        zM = x97.M(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, em6Var.f);
                                    }
                                } else {
                                    lf lfVarA = nf.a();
                                    lf.c(lfVarA, em6Var);
                                    zM = x97.H(fIntBitsToFloat, fIntBitsToFloat2, lfVarA);
                                }
                            } else {
                                lf lfVarA2 = nf.a();
                                lf.c(lfVarA2, em6Var);
                                zM = x97.H(fIntBitsToFloat, fIntBitsToFloat2, lfVarA2);
                            }
                        } else {
                            lf lfVarA3 = nf.a();
                            lf.c(lfVarA3, em6Var);
                            zM = x97.H(fIntBitsToFloat, fIntBitsToFloat2, lfVarA3);
                        }
                    } else {
                        lf lfVarA4 = nf.a();
                        lf.c(lfVarA4, em6Var);
                        zM = x97.H(fIntBitsToFloat, fIntBitsToFloat2, lfVarA4);
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(mb6VarD instanceof zd5)) {
                    b61.c();
                    return false;
                }
                zM = x97.H(fIntBitsToFloat, fIntBitsToFloat2, ((zd5) mb6VarD).j0);
            }
            zM = z;
        } else {
            z = false;
            z2 = true;
        }
        return zM ? z2 : z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [jx4] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [jx4] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // defpackage.eo5, defpackage.tr4
    public final Object w() {
        LayoutNode layoutNode = this.w0;
        if (!layoutNode.H0.j(64)) {
            return null;
        }
        V0();
        Object objB = null;
        for (jx4 jx4Var = (f18) layoutNode.H0.h0; jx4Var != null; jx4Var = jx4Var.g0) {
            if ((jx4Var.Z & 64) != 0) {
                ?? T = jx4Var;
                ?? c15Var = 0;
                while (T != 0) {
                    if (T instanceof ci5) {
                        objB = ((ci5) T).b(layoutNode.A0, objB);
                    } else if ((T.Z & 64) != 0 && (T instanceof oh1)) {
                        jx4 jx4Var2 = ((oh1) T).r0;
                        int i = 0;
                        T = T;
                        c15Var = c15Var;
                        while (jx4Var2 != null) {
                            if ((jx4Var2.Z & 64) != 0) {
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
        }
        return objB;
    }

    @Override // defpackage.y24
    public final y24 y() {
        boolean z = V0().p0;
        LayoutNode layoutNode = this.w0;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (LayoutNode layoutNodeW = layoutNode; layoutNodeW != null; layoutNodeW = layoutNodeW.w()) {
                sb.append("\n|");
                sb.append(layoutNodeW);
                sb.append(" isAttached=");
                sb.append(layoutNodeW.K());
                sb.append(" modifier=");
                sb.append(layoutNodeW.M0);
                sb.append(" tail=");
                sb.append(V0());
            }
            wc3.b(sb.toString());
        }
        f1();
        return layoutNode.getOuterCoordinator$ui().y0;
    }

    @Override // defpackage.vi4
    public final y24 m0() {
        return this;
    }
}
