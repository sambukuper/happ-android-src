package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vj extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public vj(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        xj xjVar = new xj(null);
        Drawable drawableNewDrawable = this.a.newDrawable();
        xjVar.X = drawableNewDrawable;
        drawableNewDrawable.setCallback(xjVar.h0);
        return xjVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        xj xjVar = new xj(null);
        Drawable drawableNewDrawable = this.a.newDrawable(resources);
        xjVar.X = drawableNewDrawable;
        drawableNewDrawable.setCallback(xjVar.h0);
        return xjVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        xj xjVar = new xj(null);
        Drawable drawableNewDrawable = this.a.newDrawable(resources, theme);
        xjVar.X = drawableNewDrawable;
        drawableNewDrawable.setCallback(xjVar.h0);
        return xjVar;
    }
}
