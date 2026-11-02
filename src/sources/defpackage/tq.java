package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import io.sentry.util.c;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tq {
    public final TextView a;
    public z11 b;
    public z11 c;
    public z11 d;
    public z11 e;
    public z11 f;
    public z11 g;
    public z11 h;
    public final zq i;
    public Typeface l;
    public boolean n;
    public int j = 0;
    public int k = -1;
    public String m = null;

    public tq(TextView textView) {
        this.a = textView;
        this.i = new zq(textView);
    }

    public static void d(TextView textView, Typeface typeface, int i) {
        int i2 = Build.VERSION.SDK_INT;
        String str = null;
        if (i2 >= 26) {
            String strB = rq.b(textView);
            if (!TextUtils.isEmpty(strB)) {
                rq.e(textView, null);
            }
            str = strB;
        }
        textView.setTypeface(typeface, i);
        if (i2 < 26 || TextUtils.isEmpty(str)) {
            return;
        }
        rq.e(textView, str);
    }

    public static z11 e(Context context, aq aqVar, int i) {
        ColorStateList colorStateListF;
        synchronized (aqVar) {
            colorStateListF = aqVar.a.f(context, i);
        }
        if (colorStateListF == null) {
            return null;
        }
        z11 z11Var = new z11();
        z11Var.b = true;
        z11Var.c = colorStateListF;
        return z11Var;
    }

    public final void a(Drawable drawable, z11 z11Var) {
        if (drawable == null || z11Var == null) {
            return;
        }
        int[] drawableState = this.a.getDrawableState();
        PorterDuff.Mode mode = aq.b;
        rf6.h(drawable, z11Var, drawableState);
    }

    public final void b() {
        z11 z11Var = this.b;
        TextView textView = this.a;
        if (z11Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final void c(boolean z) {
        Typeface typeface = this.l;
        TextView textView = this.a;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        } else if (z) {
            textView.setTypeface(null);
        }
        String str = this.m;
        if (str == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        rq.e(textView, str);
    }

    public final ColorStateList f() {
        z11 z11Var = this.h;
        if (z11Var != null) {
            return (ColorStateList) z11Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode g() {
        z11 z11Var = this.h;
        if (z11Var != null) {
            return (PorterDuff.Mode) z11Var.d;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:210:0x038a  */
    /* JADX WARN: Code duplicated, block: B:212:0x038f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0396 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:216:0x0398  */
    /* JADX WARN: Code duplicated, block: B:218:0x039d  */
    /* JADX WARN: Code duplicated, block: B:220:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:222:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:225:? A[RETURN, SYNTHETIC] */
    public final void h(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        float dimensionPixelSize;
        int i2;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        TextView textView = this.a;
        Context context = textView.getContext();
        aq aqVarA = aq.a();
        zv7 zv7VarR = zv7.r(i, 0, context, attributeSet, h66.AppCompatTextHelper);
        cw8.m(textView, textView.getContext(), h66.AppCompatTextHelper, attributeSet, (TypedArray) zv7VarR.Y, i);
        int i3 = h66.AppCompatTextHelper_android_textAppearance;
        TypedArray typedArray = (TypedArray) zv7VarR.Y;
        int resourceId3 = typedArray.getResourceId(i3, -1);
        if (typedArray.hasValue(h66.AppCompatTextHelper_android_drawableLeft)) {
            this.b = e(context, aqVarA, typedArray.getResourceId(h66.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (typedArray.hasValue(h66.AppCompatTextHelper_android_drawableTop)) {
            this.c = e(context, aqVarA, typedArray.getResourceId(h66.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (typedArray.hasValue(h66.AppCompatTextHelper_android_drawableRight)) {
            this.d = e(context, aqVarA, typedArray.getResourceId(h66.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (typedArray.hasValue(h66.AppCompatTextHelper_android_drawableBottom)) {
            this.e = e(context, aqVarA, typedArray.getResourceId(h66.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (typedArray.hasValue(h66.AppCompatTextHelper_android_drawableStart)) {
            this.f = e(context, aqVarA, typedArray.getResourceId(h66.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (typedArray.hasValue(h66.AppCompatTextHelper_android_drawableEnd)) {
            this.g = e(context, aqVarA, typedArray.getResourceId(h66.AppCompatTextHelper_android_drawableEnd, 0));
        }
        zv7VarR.v();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, h66.TextAppearance);
            zv7 zv7Var = new zv7(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(h66.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z = typedArrayObtainStyledAttributes.getBoolean(h66.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            o(context, zv7Var);
            string = typedArrayObtainStyledAttributes.hasValue(h66.TextAppearance_textLocale) ? typedArrayObtainStyledAttributes.getString(h66.TextAppearance_textLocale) : null;
            zv7Var.v();
        } else {
            z = false;
            z2 = false;
            string = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h66.TextAppearance, i, 0);
        zv7 zv7Var2 = new zv7(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(h66.TextAppearance_textAllCaps)) {
            z = typedArrayObtainStyledAttributes2.getBoolean(h66.TextAppearance_textAllCaps, false);
            z2 = true;
        }
        if (typedArrayObtainStyledAttributes2.hasValue(h66.TextAppearance_textLocale)) {
            string = typedArrayObtainStyledAttributes2.getString(h66.TextAppearance_textLocale);
        }
        if (Build.VERSION.SDK_INT >= 28 && typedArrayObtainStyledAttributes2.hasValue(h66.TextAppearance_android_textSize) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(h66.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        o(context, zv7Var2);
        zv7Var2.v();
        if (!z3 && z2) {
            textView.setAllCaps(z);
        }
        c(false);
        if (string != null) {
            textView.setTextLocales(LocaleList.forLanguageTags(string));
        }
        zq zqVar = this.i;
        Context context2 = zqVar.j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, h66.AppCompatTextView, i, 0);
        TextView textView2 = zqVar.i;
        cw8.m(textView2, textView2.getContext(), h66.AppCompatTextView, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(h66.AppCompatTextView_autoSizeTextType)) {
            zqVar.a = typedArrayObtainStyledAttributes3.getInt(h66.AppCompatTextView_autoSizeTextType, 0);
        }
        float f = -1.0f;
        float dimension = typedArrayObtainStyledAttributes3.hasValue(h66.AppCompatTextView_autoSizeStepGranularity) ? typedArrayObtainStyledAttributes3.getDimension(h66.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(h66.AppCompatTextView_autoSizeMinTextSize) ? typedArrayObtainStyledAttributes3.getDimension(h66.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(h66.AppCompatTextView_autoSizeMaxTextSize) ? typedArrayObtainStyledAttributes3.getDimension(h66.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes3.hasValue(h66.AppCompatTextView_autoSizePresetSizes) || (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(h66.AppCompatTextView_autoSizePresetSizes, 0)) <= 0) {
            f = -1.0f;
        } else {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[i4] = typedArrayObtainTypedArray.getDimensionPixelSize(i4, -1);
                }
                zqVar.f = zq.b(iArr);
                zqVar.h();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!zqVar.i()) {
            zqVar.a = 0;
        } else if (zqVar.a == 1) {
            if (!zqVar.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == f) {
                    dimension = 1.0f;
                }
                zqVar.j(dimension2, dimension3, dimension);
            }
            zqVar.g();
        }
        if (cy8.c && zqVar.a != 0) {
            int[] iArr2 = zqVar.f;
            if (iArr2.length > 0) {
                if (rq.a(textView) != f) {
                    rq.c(textView, Math.round(zqVar.d), Math.round(zqVar.e), Math.round(zqVar.c));
                } else {
                    rq.d(textView, iArr2);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, h66.AppCompatTextView);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(h66.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawableB = resourceId4 != -1 ? aqVarA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(h66.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawableB2 = resourceId5 != -1 ? aqVarA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(h66.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawableB3 = resourceId6 != -1 ? aqVarA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(h66.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawableB4 = resourceId7 != -1 ? aqVarA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(h66.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawableB5 = resourceId8 != -1 ? aqVarA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(h66.AppCompatTextView_drawableEndCompat, -1);
        Drawable drawableB6 = resourceId9 != -1 ? aqVarA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(h66.AppCompatTextView_drawableTint)) {
            int i5 = h66.AppCompatTextView_drawableTint;
            if (!typedArrayObtainStyledAttributes4.hasValue(i5) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(i5, 0)) == 0 || (colorStateList = w79.v(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(i5);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(h66.AppCompatTextView_drawableTintMode)) {
            textView.setCompoundDrawableTintMode(dw1.c(typedArrayObtainStyledAttributes4.getInt(h66.AppCompatTextView_drawableTintMode, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(h66.AppCompatTextView_firstBaselineToTopHeight, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(h66.AppCompatTextView_lastBaselineToBottomHeight, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(h66.AppCompatTextView_lineHeight)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(h66.AppCompatTextView_lineHeight);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(h66.AppCompatTextView_lineHeight, -1);
            } else {
                int i6 = typedValuePeekValue.data;
                i2 = i6 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i6);
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != -1) {
                hw7.f(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != -1) {
                hw7.g(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != f) {
                if (i2 == -1) {
                    hw7.h(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    u3.F(textView, i2, dimensionPixelSize);
                } else {
                    hw7.h(textView, Math.round(TypedValue.applyDimension(i2, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        dimensionPixelSize = f;
        i2 = -1;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != -1) {
            hw7.f(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            hw7.g(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != f) {
            if (i2 == -1) {
                hw7.h(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                u3.F(textView, i2, dimensionPixelSize);
            } else {
                hw7.h(textView, Math.round(TypedValue.applyDimension(i2, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void i(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, h66.TextAppearance);
        zv7 zv7Var = new zv7(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(h66.TextAppearance_textAllCaps);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(h66.TextAppearance_textAllCaps, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(h66.TextAppearance_android_textSize) && typedArrayObtainStyledAttributes.getDimensionPixelSize(h66.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        boolean zO = o(context, zv7Var);
        zv7Var.v();
        c(zO);
    }

    public final void j(int i, int i2, int i3, int i4) {
        zq zqVar = this.i;
        if (zqVar.i()) {
            DisplayMetrics displayMetrics = zqVar.j.getResources().getDisplayMetrics();
            zqVar.j(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (zqVar.g()) {
                zqVar.a();
            }
        }
    }

    public final void k(int[] iArr, int i) {
        zq zqVar = this.i;
        if (zqVar.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = zqVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                zqVar.f = zq.b(iArrCopyOf);
                if (!zqVar.h()) {
                    c.a(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                zqVar.g = false;
            }
            if (zqVar.g()) {
                zqVar.a();
            }
        }
    }

    public final void l(int i) {
        zq zqVar = this.i;
        if (zqVar.i()) {
            if (i == 0) {
                zqVar.a = 0;
                zqVar.d = -1.0f;
                zqVar.e = -1.0f;
                zqVar.c = -1.0f;
                zqVar.f = new int[0];
                zqVar.b = false;
                return;
            }
            if (i != 1) {
                bt.q(pc6.j(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = zqVar.j.getResources().getDisplayMetrics();
            zqVar.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (zqVar.g()) {
                zqVar.a();
            }
        }
    }

    public final void m(ColorStateList colorStateList) {
        z11 z11Var = this.h;
        if (z11Var == null) {
            z11Var = new z11();
            this.h = z11Var;
        }
        z11 z11Var2 = z11Var;
        z11Var.c = colorStateList;
        z11Var.b = colorStateList != null;
        this.b = z11Var2;
        this.c = z11Var2;
        this.d = z11Var2;
        this.e = z11Var2;
        this.f = z11Var2;
        this.g = z11Var2;
    }

    public final void n(PorterDuff.Mode mode) {
        z11 z11Var = this.h;
        if (z11Var == null) {
            z11Var = new z11();
            this.h = z11Var;
        }
        z11 z11Var2 = z11Var;
        z11Var.d = mode;
        z11Var.a = mode != null;
        this.b = z11Var2;
        this.c = z11Var2;
        this.d = z11Var2;
        this.e = z11Var2;
        this.f = z11Var2;
        this.g = z11Var2;
    }

    public final boolean o(Context context, zv7 zv7Var) {
        String string;
        int i;
        Typeface typeface;
        int i2 = h66.TextAppearance_android_textStyle;
        int i3 = this.j;
        TypedArray typedArray = (TypedArray) zv7Var.Y;
        this.j = typedArray.getInt(i2, i3);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i5 = typedArray.getInt(h66.TextAppearance_android_textFontWeight, -1);
            this.k = i5;
            if (i5 != -1) {
                this.j &= 2;
            }
        }
        if (i4 >= 26 && typedArray.hasValue(h66.TextAppearance_fontVariationSettings)) {
            this.m = typedArray.getString(h66.TextAppearance_fontVariationSettings);
        }
        if (typedArray.hasValue(h66.TextAppearance_android_fontFamily) || typedArray.hasValue(h66.TextAppearance_fontFamily)) {
            this.l = null;
            int i6 = typedArray.hasValue(h66.TextAppearance_fontFamily) ? h66.TextAppearance_fontFamily : h66.TextAppearance_android_fontFamily;
            int i7 = this.k;
            int i8 = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface typefaceG = zv7Var.g(i6, this.j, new oq(this, i7, i8, new WeakReference(this.a)));
                    if (typefaceG != null) {
                        if (i4 < 28 || this.k == -1) {
                            this.l = typefaceG;
                        } else {
                            this.l = en.d(Typeface.create(typefaceG, 0), this.k, (this.j & 2) != 0);
                        }
                    }
                    this.n = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l == null && (string = typedArray.getString(i6)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                    this.l = Typeface.create(string, this.j);
                } else {
                    this.l = en.d(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
                }
            }
        } else {
            if (!typedArray.hasValue(h66.TextAppearance_android_typeface)) {
                if (i4 < 28 || (i = this.k) == -1 || (typeface = this.l) == null) {
                    return false;
                }
                this.l = en.d(typeface, i, (this.j & 2) != 0);
                return true;
            }
            this.n = false;
            int i9 = typedArray.getInt(h66.TextAppearance_android_typeface, 1);
            if (i9 == 1) {
                this.l = Typeface.SANS_SERIF;
                return true;
            }
            if (i9 == 2) {
                this.l = Typeface.SERIF;
                return true;
            }
            if (i9 == 3) {
                this.l = Typeface.MONOSPACE;
                return true;
            }
        }
        return true;
    }
}
