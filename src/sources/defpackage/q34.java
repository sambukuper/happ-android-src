package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q34 {
    public static final ii1 a = i21.b();

    public static final mf5 a(LayoutNode layoutNode) {
        mf5 mf5Var = layoutNode.q0;
        if (mf5Var != null) {
            return mf5Var;
        }
        throw p61.j("LayoutNode should be attached to an owner");
    }
}
