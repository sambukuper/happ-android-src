package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t81 extends gr4 {
    public static final /* synthetic */ int J0 = 0;
    public r81 I0;

    public final void F(float f, float f2, float f3, float f4) {
        RectF rectF = this.I0.s;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.gr4, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.I0 = new r81(this.I0);
        return this;
    }
}
