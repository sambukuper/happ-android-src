package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z34 implements up7 {
    public final wz4 a;
    public final /* synthetic */ b44 b;
    public final /* synthetic */ Object c;

    public z34(b44 b44Var, Object obj) {
        this.b = b44Var;
        this.c = obj;
        int[] iArr = of3.a;
        this.a = new wz4();
    }

    @Override // defpackage.up7
    public final void a() {
        this.b.g(this.c);
    }

    @Override // defpackage.up7
    public final void b(nb nbVar) {
        t6 t6Var;
        LayoutNode layoutNode = (LayoutNode) this.b.l0.g(this.c);
        jx4 jx4Var = (layoutNode == null || (t6Var = layoutNode.H0) == null) ? null : (jx4) t6Var.i0;
        if (jx4Var == null || !jx4Var.p0) {
            return;
        }
        ts7.i(jx4Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", nbVar);
    }

    @Override // defpackage.up7
    public final int c() {
        List<LayoutNode> children$ui;
        LayoutNode layoutNode = (LayoutNode) this.b.l0.g(this.c);
        if (layoutNode == null || (children$ui = layoutNode.getChildren$ui()) == null) {
            return 0;
        }
        return children$ui.size();
    }

    @Override // defpackage.up7
    public final void d(int i, long j) {
        b44 b44Var = this.b;
        LayoutNode layoutNode = (LayoutNode) b44Var.l0.g(this.c);
        if (layoutNode == null || !layoutNode.K()) {
            return;
        }
        int size = layoutNode.getChildren$ui().size();
        if (i < 0 || i >= size) {
            wc3.d("Index (" + i + ") is out of bound of [0, " + size + ")");
        }
        if (layoutNode.L()) {
            wc3.a("Pre-measure called on node that is not placed");
        }
        LayoutNode layoutNode2 = b44Var.X;
        layoutNode2.s0 = true;
        ((AndroidComposeView) q34.a(layoutNode)).r(layoutNode.getChildren$ui().get(i), j);
        layoutNode2.s0 = false;
        this.a.a(i);
    }
}
