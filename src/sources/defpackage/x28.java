package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x28 extends wl7 {
    public final /* synthetic */ a38 g;
    public final /* synthetic */ z28 h;

    public x28(z28 z28Var, a38 a38Var) {
        this.h = z28Var;
        this.g = a38Var;
    }

    @Override // defpackage.wl7
    public final void S(int i) {
        this.h.n = true;
        this.g.d(i);
    }

    @Override // defpackage.wl7
    public final void T(Typeface typeface) {
        z28 z28Var = this.h;
        Typeface typefaceCreate = Typeface.create(typeface, z28Var.d);
        z28Var.p = typefaceCreate;
        z28Var.n = true;
        this.g.e(typefaceCreate, false);
    }
}
