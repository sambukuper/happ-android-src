package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class io5 extends ReplacementSpan {
    public Paint.FontMetricsInt X;
    public boolean Y;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.X;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        dh3.T("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.Y) {
            return 0;
        }
        xc3.b("PlaceholderSpan is not laid out yet.");
        return 0;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.Y = true;
        paint.getTextSize();
        this.X = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            xc3.a("Invalid fontMetrics: line height can not be negative.");
        }
        throw null;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
