package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cr4 implements p95 {
    public final /* synthetic */ int X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ int f0;
    public final /* synthetic */ int g0;

    public cr4(View view, int i, int i2, int i3, int i4) {
        this.X = i;
        this.Y = view;
        this.Z = i2;
        this.f0 = i3;
        this.g0 = i4;
    }

    @Override // defpackage.p95
    public final w19 C(View view, w19 w19Var) {
        fe3 fe3VarH = w19Var.a.h(519);
        View view2 = this.Y;
        int i = this.X;
        if (i >= 0) {
            view2.getLayoutParams().height = i + fe3VarH.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.Z + fe3VarH.a, this.f0 + fe3VarH.b, this.g0 + fe3VarH.c, view2.getPaddingBottom());
        return w19Var;
    }
}
