package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sq {
    public final TextView a;
    public final d41 b;
    public Typeface c;
    public Typeface d;
    public String e;

    public sq(TextView textView, d41 d41Var) {
        this.a = textView;
        this.b = d41Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    public final boolean a(String str) {
        int i;
        String fontVariationSettings;
        boolean z;
        FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings;
        Typeface typeface = this.c;
        TextView textView = this.a;
        TextPaint paint = textView.getPaint();
        if (this.d != paint.getTypeface()) {
            typeface = paint.getTypeface();
        }
        if (Build.VERSION.SDK_INT < 31 || (i = textView.getContext().getResources().getConfiguration().fontWeightAdjustment) == Integer.MAX_VALUE) {
            i = 0;
        }
        if (i == Integer.MAX_VALUE) {
            i = 0;
        }
        qq qqVar = new qq(typeface, str, i);
        ej4 ej4Var = rq.a;
        Typeface typeface2 = (Typeface) ej4Var.a(qqVar);
        if (typeface2 != null) {
            z = true;
        } else {
            Paint paint2 = rq.b;
            if (paint2 == null) {
                paint2 = new Paint();
                rq.b = paint2;
            }
            if (i != 0) {
                if (TextUtils.isEmpty(str)) {
                    fontVariationAxisArrFromFontVariationSettings = new FontVariationAxis[0];
                } else {
                    fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(str);
                    if (fontVariationAxisArrFromFontVariationSettings == null) {
                        fontVariationSettings = str;
                        z = true;
                    }
                }
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    if (i2 >= fontVariationAxisArrFromFontVariationSettings.length) {
                        break;
                    }
                    FontVariationAxis fontVariationAxis = fontVariationAxisArrFromFontVariationSettings[i2];
                    if ("wght".equals(fontVariationAxis.getTag())) {
                        float styleValue = fontVariationAxis.getStyleValue() + i;
                        fontVariationAxisArrFromFontVariationSettings[i2] = new FontVariationAxis("wght", styleValue >= 1.0f ? Math.min(styleValue, 1000.0f) : 1.0f);
                        z2 = true;
                    }
                    i2++;
                }
                z = true;
                if (!z2) {
                    FontVariationAxis[] fontVariationAxisArr = new FontVariationAxis[fontVariationAxisArrFromFontVariationSettings.length + 1];
                    System.arraycopy(fontVariationAxisArrFromFontVariationSettings, 0, fontVariationAxisArr, 0, fontVariationAxisArrFromFontVariationSettings.length);
                    float f = i + 400;
                    fontVariationAxisArr[fontVariationAxisArrFromFontVariationSettings.length] = new FontVariationAxis("wght", f >= 1.0f ? Math.min(f, 1000.0f) : 1.0f);
                    fontVariationAxisArrFromFontVariationSettings = fontVariationAxisArr;
                }
                fontVariationSettings = FontVariationAxis.toFontVariationSettings(fontVariationAxisArrFromFontVariationSettings);
            } else {
                fontVariationSettings = str;
                z = true;
            }
            if (Objects.equals(paint2.getFontVariationSettings(), fontVariationSettings)) {
                paint2.setFontVariationSettings(null);
            }
            paint2.setTypeface(typeface);
            if (paint2.setFontVariationSettings(fontVariationSettings)) {
                typeface2 = paint2.getTypeface();
                ej4Var.b(qqVar, typeface2);
            } else {
                typeface2 = null;
            }
        }
        if (typeface2 == null) {
            return false;
        }
        this.d = typeface2;
        this.b.accept(typeface2);
        this.e = str;
        return z;
    }
}
