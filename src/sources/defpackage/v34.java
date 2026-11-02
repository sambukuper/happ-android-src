package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v34 implements wp7 {
    public z24 X = z24.Y;
    public float Y;
    public float Z;
    public final /* synthetic */ b44 f0;

    public v34(b44 b44Var) {
        this.f0 = b44Var;
    }

    @Override // defpackage.fi1
    public final float b0() {
        return this.Z;
    }

    @Override // defpackage.ug3
    public final boolean c0() {
        k34 k34Var = this.f0.X.I0.d;
        return k34Var == k34.f0 || k34Var == k34.Y;
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        return this.Y;
    }

    @Override // defpackage.ug3
    public final z24 getLayoutDirection() {
        return this.X;
    }

    @Override // defpackage.zr4
    public final yr4 u(int i, int i2, Map map, gn2 gn2Var, gn2 gn2Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            wc3.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new u34(i, i2, map, gn2Var, this, this.f0, gn2Var2);
    }

    @Override // defpackage.wp7
    public final List x(rn2 rn2Var, Object obj) {
        b44 b44Var = this.f0;
        b44Var.h();
        LayoutNode layoutNode = b44Var.X;
        k34 k34Var = layoutNode.I0.d;
        k34 k34Var2 = k34.Z;
        k34 k34Var3 = k34.X;
        if (k34Var != k34Var3 && k34Var != k34Var2 && k34Var != k34.Y && k34Var != k34.f0) {
            wc3.b("subcompose can only be used inside the measure or layout blocks");
        }
        s05 s05Var = b44Var.i0;
        Object objG = s05Var.g(obj);
        if (objG == null) {
            objG = (LayoutNode) b44Var.l0.j(obj);
            if (objG != null) {
                if (b44Var.q0 <= 0) {
                    wc3.b("Check failed.");
                }
                b44Var.q0--;
            } else {
                objG = b44Var.n(obj);
                if (objG == null) {
                    int i = b44Var.f0;
                    LayoutNode layoutNode2 = new LayoutNode(2);
                    layoutNode.s0 = true;
                    layoutNode.E(i, layoutNode2);
                    layoutNode.s0 = false;
                    objG = layoutNode2;
                }
            }
            s05Var.l(obj, objG);
        }
        LayoutNode layoutNode3 = (LayoutNode) objG;
        if (wv0.u0(b44Var.f0, layoutNode.n()) != layoutNode3) {
            int i2 = ((c15) ((h05) layoutNode.n()).Y).i(layoutNode3);
            if (i2 < b44Var.f0) {
                wc3.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = b44Var.f0;
            if (i3 != i2) {
                b44Var.j(i2, i3);
            }
        }
        b44Var.f0++;
        b44Var.m(layoutNode3, obj, false, rn2Var);
        return (k34Var == k34Var3 || k34Var == k34Var2) ? layoutNode3.m() : layoutNode3.l();
    }
}
