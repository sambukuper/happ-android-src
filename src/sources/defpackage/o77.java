package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o77 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ ShapeableImageView b;

    public o77(ShapeableImageView shapeableImageView) {
        this.b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.b;
        if (shapeableImageView.q0 == null) {
            return;
        }
        if (shapeableImageView.p0 == null) {
            shapeableImageView.p0 = new gr4(shapeableImageView.q0);
        }
        RectF rectF = shapeableImageView.j0;
        Rect rect = this.a;
        rectF.round(rect);
        shapeableImageView.p0.setBounds(rect);
        shapeableImageView.p0.getOutline(outline);
    }
}
