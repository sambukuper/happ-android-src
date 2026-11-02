package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.TypedValue;
import android.util.Xml;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z28 {
    public final ColorStateList a;
    public final String b;
    public String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public ColorStateList k;
    public float l;
    public final int m;
    public boolean n = false;
    public boolean o = false;
    public Typeface p;

    public z28(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, h66.TextAppearance);
        this.l = typedArrayObtainStyledAttributes.getDimension(h66.TextAppearance_android_textSize, 0.0f);
        this.k = ys0.x(context, typedArrayObtainStyledAttributes, h66.TextAppearance_android_textColor);
        ys0.x(context, typedArrayObtainStyledAttributes, h66.TextAppearance_android_textColorHint);
        ys0.x(context, typedArrayObtainStyledAttributes, h66.TextAppearance_android_textColorLink);
        this.d = typedArrayObtainStyledAttributes.getInt(h66.TextAppearance_android_textStyle, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(h66.TextAppearance_android_typeface, 1);
        int i2 = h66.TextAppearance_fontFamily;
        i2 = typedArrayObtainStyledAttributes.hasValue(i2) ? i2 : h66.TextAppearance_android_fontFamily;
        this.m = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(h66.TextAppearance_textAllCaps, false);
        this.a = ys0.x(context, typedArrayObtainStyledAttributes, h66.TextAppearance_android_shadowColor);
        this.f = typedArrayObtainStyledAttributes.getFloat(h66.TextAppearance_android_shadowDx, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(h66.TextAppearance_android_shadowDy, 0.0f);
        this.h = typedArrayObtainStyledAttributes.getFloat(h66.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, v56.MaterialTextAppearance);
        this.i = typedArrayObtainStyledAttributes2.hasValue(v56.MaterialTextAppearance_android_letterSpacing);
        this.j = typedArrayObtainStyledAttributes2.getFloat(v56.MaterialTextAppearance_android_letterSpacing, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            int i3 = v56.MaterialTextAppearance_fontVariationSettings;
            this.c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(i3) ? i3 : v56.MaterialTextAppearance_android_fontVariationSettings);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        Typeface typeface;
        String str;
        Typeface typefaceCreate = this.p;
        int i = this.d;
        if (typefaceCreate == null && (str = this.b) != null) {
            typefaceCreate = Typeface.create(str, i);
            this.p = typefaceCreate;
        }
        if (typefaceCreate == null) {
            int i2 = this.e;
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
                this.p = typeface;
            } else if (i2 == 2) {
                typeface = Typeface.SERIF;
                this.p = typeface;
            } else if (i2 != 3) {
                typeface = Typeface.DEFAULT;
                this.p = typeface;
            } else {
                typeface = Typeface.MONOSPACE;
                this.p = typeface;
            }
            this.p = Typeface.create(typeface, i);
        }
    }

    public final void b(Context context, a38 a38Var) {
        if (!c(context)) {
            a();
        }
        int i = this.m;
        if (i == 0) {
            this.n = true;
        }
        if (this.n) {
            a38Var.e(this.p, true);
            return;
        }
        try {
            x28 x28Var = new x28(this, a38Var);
            ThreadLocal threadLocal = xf6.a;
            if (context.isRestricted()) {
                x28Var.r(-4);
            } else {
                xf6.a(context, i, new TypedValue(), 0, x28Var, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.n = true;
            a38Var.d(1);
        } catch (Exception unused2) {
            this.n = true;
            a38Var.d(-3);
        }
    }

    public final boolean c(Context context) {
        Context context2;
        Typeface typefaceA;
        String string;
        Typeface typefaceCreate;
        if (this.n) {
            return true;
        }
        int i = this.m;
        if (i != 0) {
            ThreadLocal threadLocal = xf6.a;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceA = null;
            } else {
                context2 = context;
                typefaceA = xf6.a(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (typefaceA != null) {
                this.p = typefaceA;
                this.n = true;
                return true;
            }
            if (!this.o) {
                this.o = true;
                Resources resources = context2.getResources();
                int i2 = this.m;
                if (i2 == 0 || !resources.getResourceTypeName(i2).equals("font")) {
                    string = null;
                    break;
                }
                try {
                    XmlResourceParser xml = resources.getXml(i2);
                    while (true) {
                        if (xml.getEventType() == 1) {
                            string = null;
                            break;
                        }
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), c66.FontFamily);
                            string = typedArrayObtainAttributes.getString(c66.FontFamily_fontProviderSystemFontFamily);
                            typedArrayObtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                        string = null;
                        break;
                    }
                } catch (Throwable unused) {
                }
                if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                    typefaceCreate2 = Typeface.create(typefaceCreate, this.d);
                }
            }
            if (typefaceCreate2 != null) {
                this.p = typefaceCreate2;
                this.n = true;
                return true;
            }
        }
        return false;
    }

    public final void d(Context context, TextPaint textPaint, a38 a38Var) {
        e(context, textPaint, a38Var);
        ColorStateList colorStateList = this.k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(this.h, this.f, this.g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(Context context, TextPaint textPaint, a38 a38Var) {
        Typeface typeface;
        if (c(context) && this.n && (typeface = this.p) != null) {
            f(context, textPaint, typeface);
            return;
        }
        a();
        f(context, textPaint, this.p);
        b(context, new y28(this, context, textPaint, a38Var));
    }

    public final void f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceS = tc.s(context.getResources().getConfiguration(), typeface);
        if (typefaceS != null) {
            typeface = typefaceS;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(null);
            textPaint.setFontVariationSettings(this.c);
        }
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
