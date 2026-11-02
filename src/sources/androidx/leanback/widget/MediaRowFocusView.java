package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.b36;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
class MediaRowFocusView extends View {
    public final Paint f0;
    public final RectF g0;
    public int h0;

    public MediaRowFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g0 = new RectF();
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(b36.lb_playback_media_row_highlight_color));
        this.f0 = paint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        this.h0 = height;
        int height2 = ((height * 2) - getHeight()) / 2;
        float f = -height2;
        float width = getWidth();
        float height3 = getHeight() + height2;
        RectF rectF = this.g0;
        rectF.set(0.0f, f, width, height3);
        int i = this.h0;
        canvas.drawRoundRect(rectF, i, i, this.f0);
    }
}
