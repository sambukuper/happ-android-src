package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vp7 {
    public final yp7 a;
    public b44 b;
    public final tp7 c;
    public final tp7 d;
    public final tp7 e;

    /* JADX WARN: Type inference failed for: r2v1, types: [tp7] */
    /* JADX WARN: Type inference failed for: r2v2, types: [tp7] */
    /* JADX WARN: Type inference failed for: r2v3, types: [tp7] */
    public vp7(yp7 yp7Var) {
        this.a = yp7Var;
        final byte b = 0;
        this.c = new rn2(this) { // from class: tp7
            public final /* synthetic */ vp7 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.rn2
            public final Object K(Object obj, Object obj2) {
                byte b2 = b;
                dn8 dn8Var = dn8.a;
                vp7 vp7Var = this.Y;
                switch (b2) {
                    case 0:
                        yp7 yp7Var2 = vp7Var.a;
                        LayoutNode layoutNode = (LayoutNode) obj;
                        b44 b44Var = layoutNode.J0;
                        if (b44Var == null) {
                            b44Var = new b44(layoutNode, yp7Var2);
                            layoutNode.J0 = b44Var;
                        }
                        vp7Var.b = b44Var;
                        vp7Var.a().h();
                        b44 b44VarA = vp7Var.a();
                        if (b44VarA.Z != yp7Var2) {
                            b44VarA.Z = yp7Var2;
                            b44VarA.i(false);
                            LayoutNode.Y(b44VarA.X, false, 7);
                        }
                        break;
                    case 1:
                        vp7Var.a().Y = (m01) obj2;
                        break;
                    default:
                        b44 b44VarA2 = vp7Var.a();
                        ((LayoutNode) obj).f0(new x34(b44VarA2, (rn2) obj2, b44VarA2.r0));
                        break;
                }
                return dn8Var;
            }
        };
        final byte b2 = 1;
        this.d = new rn2(this) { // from class: tp7
            public final /* synthetic */ vp7 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.rn2
            public final Object K(Object obj, Object obj2) {
                byte b3 = b2;
                dn8 dn8Var = dn8.a;
                vp7 vp7Var = this.Y;
                switch (b3) {
                    case 0:
                        yp7 yp7Var2 = vp7Var.a;
                        LayoutNode layoutNode = (LayoutNode) obj;
                        b44 b44Var = layoutNode.J0;
                        if (b44Var == null) {
                            b44Var = new b44(layoutNode, yp7Var2);
                            layoutNode.J0 = b44Var;
                        }
                        vp7Var.b = b44Var;
                        vp7Var.a().h();
                        b44 b44VarA = vp7Var.a();
                        if (b44VarA.Z != yp7Var2) {
                            b44VarA.Z = yp7Var2;
                            b44VarA.i(false);
                            LayoutNode.Y(b44VarA.X, false, 7);
                        }
                        break;
                    case 1:
                        vp7Var.a().Y = (m01) obj2;
                        break;
                    default:
                        b44 b44VarA2 = vp7Var.a();
                        ((LayoutNode) obj).f0(new x34(b44VarA2, (rn2) obj2, b44VarA2.r0));
                        break;
                }
                return dn8Var;
            }
        };
        final byte b3 = 2;
        this.e = new rn2(this) { // from class: tp7
            public final /* synthetic */ vp7 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.rn2
            public final Object K(Object obj, Object obj2) {
                byte b4 = b3;
                dn8 dn8Var = dn8.a;
                vp7 vp7Var = this.Y;
                switch (b4) {
                    case 0:
                        yp7 yp7Var2 = vp7Var.a;
                        LayoutNode layoutNode = (LayoutNode) obj;
                        b44 b44Var = layoutNode.J0;
                        if (b44Var == null) {
                            b44Var = new b44(layoutNode, yp7Var2);
                            layoutNode.J0 = b44Var;
                        }
                        vp7Var.b = b44Var;
                        vp7Var.a().h();
                        b44 b44VarA = vp7Var.a();
                        if (b44VarA.Z != yp7Var2) {
                            b44VarA.Z = yp7Var2;
                            b44VarA.i(false);
                            LayoutNode.Y(b44VarA.X, false, 7);
                        }
                        break;
                    case 1:
                        vp7Var.a().Y = (m01) obj2;
                        break;
                    default:
                        b44 b44VarA2 = vp7Var.a();
                        ((LayoutNode) obj).f0(new x34(b44VarA2, (rn2) obj2, b44VarA2.r0));
                        break;
                }
                return dn8Var;
            }
        };
    }

    public final b44 a() {
        b44 b44Var = this.b;
        if (b44Var != null) {
            return b44Var;
        }
        bt.q("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
