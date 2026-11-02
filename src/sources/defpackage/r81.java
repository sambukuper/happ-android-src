package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r81 extends er4 {
    public final RectF s;

    public r81(r81 r81Var) {
        super(r81Var);
        this.s = r81Var.s;
    }

    @Override // defpackage.er4, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        s81 s81Var = new s81(this);
        s81Var.I0 = this;
        s81Var.invalidateSelf();
        return s81Var;
    }

    public r81(a77 a77Var, RectF rectF) {
        super(a77Var);
        this.s = rectF;
    }
}
