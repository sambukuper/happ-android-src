package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pj8 extends ReplacementSpan {
    public final oj8 Y;
    public TextPaint g0;
    public final Paint.FontMetricsInt X = new Paint.FontMetricsInt();
    public short Z = -1;
    public float f0 = 1.0f;

    public pj8(oj8 oj8Var) {
        mb6.r(oj8Var, "rasterizer cannot be null");
        this.Y = oj8Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.g0;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.g0 = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.Z, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        yy1.a().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        oj8 oj8Var = this.Y;
        z47 z47Var = oj8Var.b;
        Typeface typeface = (Typeface) z47Var.g0;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) z47Var.Z, oj8Var.a * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.X;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        oj8 oj8Var = this.Y;
        dv4 dv4VarB = oj8Var.b();
        int iA = dv4VarB.a(14);
        this.f0 = fAbs / (iA != 0 ? ((ByteBuffer) dv4VarB.f0).getShort(iA + dv4VarB.X) : (short) 0);
        dv4 dv4VarB2 = oj8Var.b();
        int iA2 = dv4VarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) dv4VarB2.f0).getShort(iA2 + dv4VarB2.X);
        }
        dv4 dv4VarB3 = oj8Var.b();
        int iA3 = dv4VarB3.a(12);
        short s = (short) ((iA3 != 0 ? ((ByteBuffer) dv4VarB3.f0).getShort(iA3 + dv4VarB3.X) : (short) 0) * this.f0);
        this.Z = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
