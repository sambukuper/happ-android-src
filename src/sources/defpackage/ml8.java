package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ml8 implements rs {
    public final Object X;
    public final ArrayList Y = new ArrayList();
    public Object Z;

    public ml8(LayoutNode layoutNode) {
        this.X = layoutNode;
        this.Z = layoutNode;
    }

    public final void a() {
        this.Y.clear();
        this.Z = this.X;
        ((LayoutNode) this.X).S();
    }

    @Override // defpackage.rs
    public final Object f() {
        return this.Z;
    }

    @Override // defpackage.rs
    public final void g(int i, Object obj) {
        ((LayoutNode) this.Z).E(i, (LayoutNode) obj);
    }

    @Override // defpackage.rs
    public final void h(Object obj) {
        this.Y.add(this.Z);
        this.Z = obj;
    }

    @Override // defpackage.rs
    public final void i() {
        u86 rectManager;
        ua autofillManager;
        u86 rectManager2;
        LayoutNode layoutNode = (LayoutNode) this.Z;
        t6 t6Var = layoutNode.H0;
        if (!layoutNode.K()) {
            wc3.a("onReuse is only expected on attached node");
        }
        b44 b44Var = layoutNode.J0;
        if (b44Var != null) {
            b44Var.i(false);
        }
        layoutNode.v0 = false;
        if (layoutNode.Q0) {
            layoutNode.Q0 = false;
        } else {
            jx4 jx4Var = (f18) layoutNode.H0.h0;
            for (jx4 jx4Var2 = jx4Var; jx4Var2 != null; jx4Var2 = jx4Var2.g0) {
                if (jx4Var2.p0) {
                    jx4Var2.T0();
                }
            }
            for (jx4 jx4Var3 = jx4Var; jx4Var3 != null; jx4Var3 = jx4Var3.g0) {
                if (jx4Var3.p0) {
                    jx4Var3.V0();
                }
            }
            while (jx4Var != null) {
                if (jx4Var.p0) {
                    jx4Var.P0();
                }
                jx4Var = jx4Var.g0;
            }
        }
        int i = layoutNode.Y;
        mf5 mf5Var = layoutNode.q0;
        if (mf5Var != null && (rectManager2 = mf5Var.getRectManager()) != null) {
            rectManager2.h(layoutNode);
        }
        layoutNode.Y = v07.a.addAndGet(1);
        mf5 mf5Var2 = layoutNode.q0;
        if (mf5Var2 != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) mf5Var2;
            androidComposeView.getLayoutNodes().g(i);
            androidComposeView.getLayoutNodes().h(layoutNode.Y, layoutNode);
        }
        for (jx4 jx4Var4 = (jx4) t6Var.i0; jx4Var4 != null; jx4Var4 = jx4Var4.h0) {
            jx4Var4.O0();
        }
        t6Var.m();
        if (t6Var.j(8)) {
            layoutNode.I();
        }
        LayoutNode.Z(layoutNode);
        mf5 mf5Var3 = layoutNode.q0;
        if (mf5Var3 != null) {
            AndroidComposeView androidComposeView2 = (AndroidComposeView) mf5Var3;
            if (AndroidComposeView.b() && (autofillManager = androidComposeView2.getAutofillManager()) != null) {
                AndroidComposeView androidComposeView3 = autofillManager.Z;
                mo5 mo5Var = autofillManager.X;
                wz4 wz4Var = autofillManager.j0;
                if (wz4Var.e(i)) {
                    mo5Var.f(androidComposeView3, i, false);
                }
                t07 t07VarY = layoutNode.y();
                if (t07VarY != null && t07VarY.X.b(c17.r)) {
                    wz4Var.a(layoutNode.Y);
                    mo5Var.f(androidComposeView3, layoutNode.Y, true);
                }
            }
        }
        mf5 mf5Var4 = layoutNode.q0;
        if (mf5Var4 == null || (rectManager = mf5Var4.getRectManager()) == null) {
            return;
        }
        rectManager.g(layoutNode);
    }

    @Override // defpackage.rs
    public final void j(int i, int i2, int i3) {
        ((LayoutNode) this.Z).O(i, i2, i3);
    }

    @Override // defpackage.rs
    public final void k(int i, int i2) {
        ((LayoutNode) this.Z).T(i, i2);
    }

    @Override // defpackage.rs
    public final void l() {
        ArrayList arrayList = this.Y;
        this.Z = arrayList.remove(arrayList.size() - 1);
    }

    @Override // defpackage.rs
    public final void n(int i, Object obj) {
    }

    @Override // defpackage.rs
    public final void o() {
        mf5 mf5Var = ((LayoutNode) this.X).q0;
        if (mf5Var != null) {
            ((AndroidComposeView) mf5Var).s();
        }
    }
}
