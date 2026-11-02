package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ac8 extends gr4 implements d48 {
    public CharSequence I0;
    public final Context J0;
    public final Paint.FontMetrics K0;
    public final e48 L0;
    public final f70 M0;
    public final Rect N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public boolean S0;
    public int T0;
    public int U0;
    public float V0;
    public float W0;
    public float X0;
    public float Y0;
    public float Z0;

    public ac8(Context context, int i) {
        super(context, null, 0, i);
        this.K0 = new Paint.FontMetrics();
        e48 e48Var = new e48(this);
        this.L0 = e48Var;
        this.M0 = new f70(this, (byte) 2);
        this.N0 = new Rect();
        this.V0 = 1.0f;
        this.W0 = 1.0f;
        this.X0 = 0.5f;
        this.Y0 = 0.5f;
        this.Z0 = 1.0f;
        this.J0 = context;
        float f = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = e48Var.a;
        textPaint.density = f;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final float F() {
        int i;
        Rect rect = this.N0;
        if (((rect.right - getBounds().right) - this.U0) - this.R0 < 0) {
            i = ((rect.right - getBounds().right) - this.U0) - this.R0;
        } else {
            if (((rect.left - getBounds().left) - this.U0) + this.R0 <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.U0) + this.R0;
        }
        return i;
    }

    public final a95 G() {
        float f = -F();
        float fWidth = (float) ((((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.T0))) / 2.0d);
        return new a95(new bq4(this.T0), Math.min(Math.max(f, -fWidth), fWidth));
    }

    @Override // defpackage.gr4, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float F = F();
        float f = (float) (-((Math.sqrt(2.0d) * ((double) this.T0)) - ((double) this.T0)));
        canvas.scale(this.V0, this.W0, (getBounds().width() * this.X0) + getBounds().left, (getBounds().height() * this.Y0) + getBounds().top);
        canvas.translate(F, f);
        super.draw(canvas);
        if (this.I0 == null) {
            canvas2 = canvas;
        } else {
            Rect bounds = getBounds();
            float fCenterY = bounds.centerY();
            e48 e48Var = this.L0;
            TextPaint textPaint = e48Var.a;
            Paint.FontMetrics fontMetrics = this.K0;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (e48Var.f != null) {
                textPaint.drawableState = getState();
                e48Var.f.d(this.J0, e48Var.a, e48Var.b);
                textPaint.setAlpha((int) (this.Z0 * 255.0f));
            }
            CharSequence charSequence = this.I0;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), i, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.L0.a.getTextSize(), this.Q0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.O0 * 2;
        CharSequence charSequence = this.I0;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.L0.a(charSequence.toString())), this.P0);
    }

    @Override // defpackage.gr4, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.S0) {
            z67 z67VarK = k().k();
            z67VarK.k = G();
            setShapeAppearanceModel(z67VarK.a());
        }
    }
}
