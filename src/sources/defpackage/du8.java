package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class du8 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public du8(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        eu8 eu8Var = new eu8();
        eu8Var.X = (VectorDrawable) this.a.newDrawable();
        return eu8Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        eu8 eu8Var = new eu8();
        eu8Var.X = (VectorDrawable) this.a.newDrawable(resources);
        return eu8Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        eu8 eu8Var = new eu8();
        eu8Var.X = (VectorDrawable) this.a.newDrawable(resources, theme);
        return eu8Var;
    }
}
