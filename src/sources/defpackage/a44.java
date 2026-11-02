package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a44 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b44 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a44(b44 b44Var, Object obj, byte b) {
        this.a = b;
        this.b = b44Var;
        this.c = obj;
    }

    public t34 b() {
        b44 b44Var = this.b;
        LayoutNode layoutNode = (LayoutNode) b44Var.l0.g(this.c);
        if (layoutNode != null) {
            return (t34) b44Var.h0.g(layoutNode);
        }
        return null;
    }

    public final boolean c() {
        mj5 mj5Var;
        switch (this.a) {
            case 0:
                return true;
            default:
                t34 t34VarB = b();
                if (t34VarB == null || (mj5Var = t34VarB.f) == null) {
                    return true;
                }
                return mj5Var.c();
        }
    }

    private final void a() {
    }
}
