package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s34 implements wp7, zr4 {
    public final /* synthetic */ v34 X;
    public final /* synthetic */ b44 Y;

    public s34(b44 b44Var) {
        this.Y = b44Var;
        this.X = b44Var.j0;
    }

    @Override // defpackage.fi1
    public final float A(long j) {
        return this.X.A(j);
    }

    @Override // defpackage.fi1
    public final long D0(long j) {
        return this.X.D0(j);
    }

    @Override // defpackage.fi1
    public final float G0(long j) {
        return this.X.G0(j);
    }

    @Override // defpackage.fi1
    public final long M(float f) {
        return this.X.M(f);
    }

    @Override // defpackage.fi1
    public final float R(int i) {
        return this.X.R(i);
    }

    @Override // defpackage.fi1
    public final float W(float f) {
        return f / this.X.getDensity();
    }

    @Override // defpackage.fi1
    public final float b0() {
        return this.X.Z;
    }

    @Override // defpackage.ug3
    public final boolean c0() {
        return this.X.c0();
    }

    @Override // defpackage.zr4
    public final yr4 g0(int i, int i2, Map map, gn2 gn2Var) {
        return this.X.u(i, i2, map, null, gn2Var);
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        return this.X.Y;
    }

    @Override // defpackage.ug3
    public final z24 getLayoutDirection() {
        return this.X.X;
    }

    @Override // defpackage.fi1
    public final float h0(float f) {
        return this.X.getDensity() * f;
    }

    @Override // defpackage.fi1
    public final long q(float f) {
        return this.X.q(f);
    }

    @Override // defpackage.fi1
    public final long r(long j) {
        return this.X.r(j);
    }

    @Override // defpackage.zr4
    public final yr4 u(int i, int i2, Map map, gn2 gn2Var, gn2 gn2Var2) {
        return this.X.u(i, i2, map, gn2Var, gn2Var2);
    }

    @Override // defpackage.wp7
    public final List x(rn2 rn2Var, Object obj) {
        b44 b44Var = this.Y;
        LayoutNode layoutNode = b44Var.X;
        s05 s05Var = b44Var.i0;
        LayoutNode layoutNode2 = (LayoutNode) s05Var.g(obj);
        if (layoutNode2 != null && ((c15) ((h05) layoutNode.n()).Y).i(layoutNode2) < b44Var.f0) {
            return layoutNode2.m();
        }
        s05 s05Var2 = b44Var.n0;
        s05 s05Var3 = b44Var.l0;
        c15 c15Var = b44Var.o0;
        if (c15Var.Z < b44Var.g0) {
            wc3.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        LayoutNode layoutNode3 = (LayoutNode) s05Var.g(obj);
        int i = c15Var.Z;
        int i2 = b44Var.g0;
        if (i == i2) {
            c15Var.b(obj);
        } else {
            Object[] objArr = c15Var.X;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        b44Var.g0++;
        boolean zB = s05Var3.b(obj);
        if (zB || layoutNode3 != null) {
            if (!zB && layoutNode3 != null) {
                b44Var.j(((c15) ((h05) layoutNode.n()).Y).i(layoutNode3), ((c15) ((h05) layoutNode.n()).Y).Z);
                b44Var.q0++;
                s05Var.j(obj);
                s05Var3.l(obj, layoutNode3);
                s05Var2.l(obj, b44Var.e(obj));
                if (layoutNode.K()) {
                    b44Var.h();
                }
            }
            LayoutNode layoutNode4 = (LayoutNode) s05Var3.g(obj);
            t34 t34Var = layoutNode4 != null ? (t34) b44Var.h0.g(layoutNode4) : null;
            if (t34Var != null && t34Var.d) {
                b44Var.m(layoutNode4, obj, false, rn2Var);
            }
            if ((t34Var != null ? t34Var.f : null) != null) {
                b44Var.c(t34Var, true);
            }
        } else {
            b44Var.k(obj, rn2Var, false);
            s05Var2.l(obj, b44Var.e(obj));
        }
        LayoutNode layoutNode5 = (LayoutNode) s05Var3.g(obj);
        if (layoutNode5 == null) {
            return d02.X;
        }
        List listA0 = layoutNode5.I0.p.a0();
        h05 h05Var = (h05) listA0;
        int i3 = ((c15) h05Var.Y).Z;
        for (int i4 = 0; i4 < i3; i4++) {
            ((wr4) h05Var.get(i4)).h0.b = true;
        }
        return listA0;
    }

    @Override // defpackage.fi1
    public final int x0(float f) {
        return this.X.x0(f);
    }
}
