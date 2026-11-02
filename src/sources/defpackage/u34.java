package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u34 implements yr4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ gn2 d;
    public final /* synthetic */ v34 e;
    public final /* synthetic */ b44 f;
    public final /* synthetic */ gn2 g;

    public u34(int i, int i2, Map map, gn2 gn2Var, v34 v34Var, b44 b44Var, gn2 gn2Var2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = gn2Var;
        this.e = v34Var;
        this.f = b44Var;
        this.g = gn2Var2;
    }

    @Override // defpackage.yr4
    public final int a() {
        return this.b;
    }

    @Override // defpackage.yr4
    public final int b() {
        return this.a;
    }

    @Override // defpackage.yr4
    public final Map c() {
        return this.c;
    }

    @Override // defpackage.yr4
    public final void d() {
        ed3 ed3Var;
        LayoutNode layoutNode = this.f.X;
        boolean zC0 = this.e.c0();
        gn2 gn2Var = this.g;
        if (!zC0 || (ed3Var = ((fd3) layoutNode.H0.f0).f1) == null) {
            gn2Var.B(((fd3) layoutNode.H0.f0).r0);
        } else {
            gn2Var.B(ed3Var.r0);
        }
    }

    @Override // defpackage.yr4
    public final gn2 g() {
        return this.d;
    }
}
