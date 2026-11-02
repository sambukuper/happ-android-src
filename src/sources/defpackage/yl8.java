package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yl8 {
    public final int a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final boolean e;
    public final zl8 f;
    public int g;
    public Rect h;

    public yl8(int i, int i2, Integer num, zl8 zl8Var, int i3) {
        Integer numValueOf = (i3 & 4) != 0 ? null : Integer.valueOf(R.color.white);
        num = (i3 & 8) != 0 ? null : num;
        boolean z = (i3 & 16) == 0;
        this.a = i;
        this.b = i2;
        this.c = numValueOf;
        this.d = num;
        this.e = z;
        this.f = zl8Var;
    }

    public final void a(Context context, float f, Canvas canvas, Rect rect, int i, int i2, int i3, boolean z, float[] fArr) {
        canvas.getClass();
        Drawable drawable = context.getDrawable(this.a);
        if (drawable != null) {
            drawable.setTint(os4.q(context, v26.colorRvActionsIcon));
            drawable.setTintMode(PorterDuff.Mode.SRC_IN);
        } else {
            drawable = null;
        }
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : -1;
        int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : -1;
        Paint paint = new Paint();
        Rect rect2 = new Rect();
        Integer num = this.d;
        String string = num != null ? context.getString(num.intValue()) : null;
        if (string != null) {
            paint.setColor(context.getColor(R.color.white));
            paint.setTextSize(TypedValue.applyDimension(2, 10.0f, context.getResources().getDisplayMetrics()));
            paint.setTypeface(Typeface.DEFAULT);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.getTextBounds(string, 0, string.length(), rect2);
        }
        int iQ = os4.q(context, this.b);
        Integer num2 = this.c;
        Integer numValueOf = num2 != null ? Integer.valueOf(context.getColor(num2.intValue())) : null;
        ColorDrawable colorDrawable = numValueOf != null ? new ColorDrawable(numValueOf.intValue()) : null;
        int iHeight = rect2.height() + intrinsicHeight;
        int iWidth = rect.width();
        int i4 = intrinsicHeight;
        int iWidth2 = MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE;
        if (iWidth <= 200) {
            iWidth2 = rect.width();
        }
        int i5 = (iWidth2 - intrinsicWidth) / 2;
        int iHeight2 = ((rect.height() - i4) / 2) + rect.top;
        int i6 = rect.left + i5;
        int i7 = rect.right - i5;
        int i8 = intrinsicWidth;
        if (f < 0.0f) {
            Path path = new Path();
            if (fArr != null) {
                path.addRoundRect(new RectF(rect), fArr, Path.Direction.CW);
            } else {
                path.addRect(new RectF(rect), Path.Direction.CW);
            }
            Paint paint2 = new Paint();
            paint2.setColor(iQ);
            canvas.drawPath(path, paint2);
            if (i2 < i3 - 1 && numValueOf != null && colorDrawable != null) {
                colorDrawable.setBounds(rect);
                colorDrawable.getBounds().right = rect.left + ((int) TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()));
                colorDrawable.setColor(numValueOf.intValue());
                colorDrawable.draw(canvas);
            }
            Rect rect3 = new Rect(rect.left + (z ? 50 : 0), rect.top, rect.right, rect.bottom);
            if (string != null) {
                iHeight2 = ((rect.height() - iHeight) / 2) + rect3.top;
                canvas.drawText(string, rect3.left + (rect3.width() / 2), TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics()) + iHeight2 + i4 + (rect2.height() / 2), paint);
            }
            int i9 = iHeight2;
            if (drawable != null) {
                drawable.setBounds(i7 - i8, i9, i7, i9 + i4);
            }
            if (drawable != null) {
                drawable.draw(canvas);
            }
        } else {
            Path path2 = new Path();
            if (fArr != null) {
                path2.addRoundRect(new RectF(rect), fArr, Path.Direction.CW);
            } else {
                path2.addRect(new RectF(rect), Path.Direction.CW);
            }
            Paint paint3 = new Paint();
            paint3.setColor(iQ);
            canvas.drawPath(path2, paint3);
            if (i2 < i3 - 1 && numValueOf != null && colorDrawable != null) {
                colorDrawable.setBounds(rect);
                colorDrawable.getBounds().left = rect.right - ((int) TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()));
                colorDrawable.setColor(numValueOf.intValue());
                colorDrawable.draw(canvas);
            }
            Rect rect4 = new Rect(rect.left - (z ? 50 : 0), rect.top, rect.right, rect.bottom);
            if (string != null) {
                iHeight2 = ((rect4.height() - iHeight) / 2) + rect4.top;
                canvas.drawText(string, rect4.left + (rect4.width() / 2), TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics()) + iHeight2 + i4 + (rect2.height() / 2), paint);
            }
            int i10 = iHeight2;
            if (drawable != null) {
                drawable.setBounds(i6, i10, i6 + i8, i10 + i4);
            }
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
        this.h = rect;
        this.g = i;
    }
}
