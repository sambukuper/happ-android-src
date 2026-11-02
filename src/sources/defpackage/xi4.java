package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xi4 extends vi4 implements tr4 {
    public yr4 A0;
    public final f05 B0;
    public final i55 w0;
    public LinkedHashMap y0;
    public long x0 = 0;
    public final yi4 z0 = new yi4(this);

    public xi4(i55 i55Var) {
        this.w0 = i55Var;
        f05 f05Var = g85.a;
        this.B0 = new f05();
    }

    @Override // defpackage.vi4
    public final void F0() {
        S(this.x0, 0.0f, null);
    }

    public void J0() {
        s0().d();
    }

    public final void K0(long j) {
        if (!hf3.a(this.x0, j)) {
            this.x0 = j;
            i55 i55Var = this.w0;
            bj4 bj4Var = i55Var.w0.I0.q;
            if (bj4Var != null) {
                bj4Var.j0();
            }
            vi4.z0(i55Var);
        }
        if (this.q0) {
            return;
        }
        j0(s0());
    }

    public final long M0(xi4 xi4Var, boolean z) {
        long jC = 0;
        while (!this.equals(xi4Var)) {
            if (!this.n0 || !z) {
                jC = hf3.c(jC, this.x0);
            }
            i55 i55Var = this.w0.y0;
            i55Var.getClass();
            this = i55Var.T0();
            this.getClass();
        }
        return jC;
    }

    public final void N0(yr4 yr4Var) {
        LinkedHashMap linkedHashMap;
        if (yr4Var != null) {
            V((((long) yr4Var.a()) & 4294967295L) | (((long) yr4Var.b()) << 32));
        } else {
            V(0L);
        }
        if (!dh3.f(this.A0, yr4Var) && yr4Var != null && ((((linkedHashMap = this.y0) != null && !linkedHashMap.isEmpty()) || !yr4Var.c().isEmpty()) && !dh3.f(yr4Var.c(), this.y0))) {
            bj4 bj4Var = this.w0.w0.I0.q;
            bj4Var.getClass();
            bj4Var.u0.f();
            LinkedHashMap linkedHashMap2 = this.y0;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.y0 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(yr4Var.c());
        }
        this.A0 = yr4Var;
    }

    @Override // defpackage.eo5
    public final void S(long j, float f, gn2 gn2Var) {
        K0(j);
        if (this.p0) {
            return;
        }
        J0();
    }

    @Override // defpackage.fi1
    public final float b0() {
        return this.w0.b0();
    }

    @Override // defpackage.vi4, defpackage.ug3
    public final boolean c0() {
        return true;
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        return this.w0.getDensity();
    }

    @Override // defpackage.ug3
    public final z24 getLayoutDirection() {
        return this.w0.w0.B0;
    }

    @Override // defpackage.vi4
    public final vi4 l0() {
        i55 i55Var = this.w0.x0;
        if (i55Var != null) {
            return i55Var.T0();
        }
        return null;
    }

    @Override // defpackage.vi4
    public final y24 m0() {
        return this.z0;
    }

    @Override // defpackage.vi4
    public final boolean q0() {
        return this.A0 != null;
    }

    @Override // defpackage.vi4
    public final LayoutNode r0() {
        return this.w0.w0;
    }

    @Override // defpackage.vi4
    public final yr4 s0() {
        yr4 yr4Var = this.A0;
        if (yr4Var != null) {
            return yr4Var;
        }
        throw p61.j("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.vi4
    public final vi4 t0() {
        i55 i55Var = this.w0.y0;
        if (i55Var != null) {
            return i55Var.T0();
        }
        return null;
    }

    @Override // defpackage.vi4
    public final long u0() {
        return this.x0;
    }

    @Override // defpackage.eo5, defpackage.tr4
    public final Object w() {
        return this.w0.w();
    }
}
