package androidx.leanback.widget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ReplacementSpan {
    public final int X;
    public final int Y;
    public final /* synthetic */ StreamingTextView Z;

    public c(StreamingTextView streamingTextView, int i, int i2) {
        this.Z = streamingTextView;
        this.X = i;
        this.Y = i2;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iMeasureText = (int) paint.measureText(charSequence, i, i2);
        StreamingTextView streamingTextView = this.Z;
        int width = streamingTextView.g0.getWidth();
        int i6 = width * 2;
        int i7 = iMeasureText / i6;
        int i8 = (iMeasureText % i6) / 2;
        boolean z = 1 == streamingTextView.getLayoutDirection();
        streamingTextView.f0.setSeed(this.X);
        int alpha = paint.getAlpha();
        for (int i9 = 0; i9 < i7 && this.Y + i9 < streamingTextView.i0; i9++) {
            float f2 = (width / 2) + (i9 * i6) + i8;
            float f3 = z ? ((f + iMeasureText) - f2) - width : f + f2;
            paint.setAlpha((streamingTextView.f0.nextInt(4) + 1) * 63);
            if (streamingTextView.f0.nextBoolean()) {
                Bitmap bitmap = streamingTextView.h0;
                canvas.drawBitmap(bitmap, f3, i4 - bitmap.getHeight(), paint);
            } else {
                Bitmap bitmap2 = streamingTextView.g0;
                canvas.drawBitmap(bitmap2, f3, i4 - bitmap2.getHeight(), paint);
            }
        }
        paint.setAlpha(alpha);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(charSequence, i, i2);
    }
}
