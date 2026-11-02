package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import defpackage.a77;
import defpackage.c0;
import defpackage.gr4;
import defpackage.j36;
import defpackage.lm6;
import defpackage.oy1;
import defpackage.p91;
import defpackage.u26;
import defpackage.u70;
import defpackage.v56;
import defpackage.wh2;
import defpackage.xh2;
import defpackage.y67;
import defpackage.z4;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public static final ColorDrawable r0 = new ColorDrawable(0);
    public static final int[] s0 = {R.attr.state_focused, R.attr.state_window_focused};
    public static final OvershootInterpolator t0 = new OvershootInterpolator(4.0f);
    public static final wh2 u0 = new wh2("interpolation");
    public final Paint X;
    public final RectF Y;
    public final Rect Z;
    public final Path f0;
    public final Path g0;
    public final Matrix h0;
    public final p91 i0;
    public WeakReference j0;
    public float k0;
    public ObjectAnimator l0;
    public float m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public xh2 q0;

    private FocusRingDrawable(xh2 xh2Var, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.X = paint;
        this.Y = new RectF();
        this.Z = new Rect();
        this.f0 = new Path();
        this.g0 = new Path();
        this.h0 = new Matrix();
        this.i0 = p91.h();
        this.k0 = -1.0f;
        this.m0 = 1.0f;
        this.o0 = false;
        this.p0 = false;
        xh2 xh2Var2 = new xh2(xh2Var);
        this.q0 = xh2Var2;
        Drawable.ConstantState constantState = xh2Var2.a;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.q0.j)) {
            return;
        }
        paint.setStrokeWidth(this.q0.j);
    }

    public static FocusRingDrawable c(Drawable drawable) {
        if (drawable instanceof FocusRingDrawable) {
            return (FocusRingDrawable) drawable;
        }
        if (drawable instanceof DrawableWrapper) {
            Drawable drawable2 = ((DrawableWrapper) drawable).getDrawable();
            if (drawable2 instanceof FocusRingDrawable) {
                return (FocusRingDrawable) drawable2;
            }
        }
        if (!(drawable instanceof LayerDrawable)) {
            return null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
            Drawable drawable3 = layerDrawable.getDrawable(i);
            if (drawable3 instanceof FocusRingDrawable) {
                return (FocusRingDrawable) drawable3;
            }
        }
        return null;
    }

    public static int d(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    public static FocusRingDrawable f(Context context, LayerDrawable layerDrawable, gr4 gr4Var) {
        if (!u70.f0(context.getTheme(), u26.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, r0);
        if (gr4Var != null) {
            focusRingDrawable.j0 = new WeakReference(gr4Var);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    public static float g(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    public final void a(RectF rectF) {
        Rect rect = this.q0.w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.j0;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((gr4) this.j0.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.Z;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        e(theme);
    }

    public final void b(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.Y;
        a(rectF);
        float f3 = f * 2.0f;
        float fWidth = 1.0f - (f3 / rectF.width());
        float fHeight = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.h0;
        matrix.reset();
        matrix.postScale(fWidth, fHeight, rectF.centerX(), rectF.centerY());
        Path path2 = this.f0;
        path.transform(matrix, path2);
        float f4 = f2 * this.m0;
        Paint paint = this.X;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fMax;
        Drawable drawable;
        int radius;
        super.draw(canvas);
        xh2 xh2Var = this.q0;
        if (xh2Var.c && this.o0) {
            float f = xh2Var.p;
            float f2 = xh2Var.j / 2.0f;
            float f3 = this.m0;
            float f4 = (f2 * f3) + f;
            float f5 = ((xh2Var.l / 2.0f) * f3) + f + xh2Var.r;
            Path path = this.g0;
            if (path.isEmpty()) {
                WeakReference weakReference = this.j0;
                if (weakReference == null || weakReference.get() == null) {
                    path = null;
                } else {
                    path = ((gr4) this.j0.get()).k0;
                    if (path.isEmpty()) {
                        path = null;
                    }
                }
            }
            Path path2 = path;
            xh2 xh2Var2 = this.q0;
            if (path2 != null) {
                b(canvas, path2, f5, xh2Var2.l, xh2Var2.h);
                xh2 xh2Var3 = this.q0;
                b(canvas, path2, f4, xh2Var3.j, xh2Var3.f);
                return;
            }
            if (Float.isNaN(xh2Var2.n)) {
                fMax = this.k0;
                if (fMax < 0.0f) {
                    WeakReference weakReference2 = this.j0;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        drawable = getDrawable();
                        if ((drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) {
                            fMax = 0.0f;
                        } else {
                            fMax = radius;
                        }
                    } else {
                        gr4 gr4Var = (gr4) this.j0.get();
                        float fC = gr4Var.c(gr4Var.i(), gr4Var.Y.a.d(), gr4Var.D0);
                        if (fC >= 0.0f) {
                            fC *= gr4Var.Y.j;
                        }
                        if (fC >= 0.0f) {
                            fMax = Math.max(0.0f, fC - (this.q0.j / 2.0f));
                        } else {
                            drawable = getDrawable();
                            if (drawable instanceof RippleDrawable) {
                                fMax = 0.0f;
                            } else {
                                fMax = 0.0f;
                            }
                        }
                    }
                }
            } else {
                fMax = this.q0.n;
            }
            float fMax2 = Math.max(0.0f, fMax - (this.q0.j / 2.0f));
            xh2 xh2Var4 = this.q0;
            float f6 = xh2Var4.l;
            int i = xh2Var4.h;
            RectF rectF = this.Y;
            a(rectF);
            rectF.inset(f5, f5);
            float f7 = f6 * this.m0;
            Paint paint = this.X;
            paint.setStrokeWidth(f7);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, fMax2, fMax2, paint);
            xh2 xh2Var5 = this.q0;
            float f8 = xh2Var5.j;
            int i2 = xh2Var5.f;
            a(rectF);
            rectF.inset(f4, f4);
            paint.setStrokeWidth(f8 * this.m0);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, fMax, fMax, paint);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    public final void e(Resources.Theme theme) {
        TypedValue typedValueE0;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(v56.FocusRingDrawable);
        int i = this.q0.d;
        if (i != Integer.MIN_VALUE && (typedValueE0 = u70.e0(theme, i)) != null) {
            xh2 xh2Var = this.q0;
            xh2Var.c = typedValueE0.data != 0;
            xh2Var.e = true;
        }
        xh2 xh2Var2 = this.q0;
        if (!xh2Var2.e) {
            xh2Var2.c = u70.f0(theme, u26.focusRingsEnabled, xh2Var2.c);
        }
        xh2 xh2Var3 = this.q0;
        if (xh2Var3.c) {
            int color = xh2Var3.f;
            int i2 = xh2Var3.g;
            int i3 = v56.FocusRingDrawable_focusRingsOuterStrokeColor;
            if (color == Integer.MIN_VALUE) {
                if (i2 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i2, typedValue, true)) {
                        color = typedValue.data;
                    } else {
                        color = typedArrayObtainStyledAttributes.getColor(i3, -16777216);
                    }
                } else {
                    color = typedArrayObtainStyledAttributes.getColor(i3, -16777216);
                }
            }
            xh2Var3.f = color;
            xh2 xh2Var4 = this.q0;
            int color2 = xh2Var4.h;
            int i4 = xh2Var4.i;
            int i5 = v56.FocusRingDrawable_focusRingsInnerStrokeColor;
            if (color2 == Integer.MIN_VALUE) {
                if (i4 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i4, typedValue2, true)) {
                        color2 = typedValue2.data;
                    } else {
                        color2 = typedArrayObtainStyledAttributes.getColor(i5, -1);
                    }
                } else {
                    color2 = typedArrayObtainStyledAttributes.getColor(i5, -1);
                }
            }
            xh2Var4.h = color2;
            xh2 xh2Var5 = this.q0;
            xh2Var5.j = g(xh2Var5.j, theme, xh2Var5.k, typedArrayObtainStyledAttributes, v56.FocusRingDrawable_focusRingsOuterStrokeWidth, j36.mtrl_focus_ring_outer_stroke_width);
            xh2 xh2Var6 = this.q0;
            xh2Var6.l = g(xh2Var6.l, theme, xh2Var6.m, typedArrayObtainStyledAttributes, v56.FocusRingDrawable_focusRingsInnerStrokeWidth, j36.mtrl_focus_ring_inner_stroke_width);
            xh2 xh2Var7 = this.q0;
            xh2Var7.n = g(xh2Var7.n, theme, xh2Var7.o, typedArrayObtainStyledAttributes, v56.FocusRingDrawable_focusRingsRadius, 0);
            xh2 xh2Var8 = this.q0;
            xh2Var8.p = g(xh2Var8.p, theme, xh2Var8.q, typedArrayObtainStyledAttributes, v56.FocusRingDrawable_focusRingsInset, 0);
            if (Float.isNaN(this.q0.p)) {
                this.q0.p = 0.0f;
            }
            xh2 xh2Var9 = this.q0;
            xh2Var9.r = g(xh2Var9.r, theme, xh2Var9.s, typedArrayObtainStyledAttributes, v56.FocusRingDrawable_focusRingsInnerStrokeInset, j36.mtrl_focus_ring_inner_stroke_inset);
            xh2 xh2Var10 = this.q0;
            int i6 = xh2Var10.u;
            if (i6 != Integer.MIN_VALUE) {
                xh2Var10.t = a77.h(theme.obtainStyledAttributes(i6, v56.ShapeAppearance), new c0(0.0f)).a();
            } else {
                int i7 = xh2Var10.v;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = u26.focusRingsShapeAppearance;
                }
                TypedValue typedValueE1 = u70.e0(theme, i7);
                if (typedValueE1 != null) {
                    this.q0.t = a77.h(theme.obtainStyledAttributes(typedValueE1.resourceId, v56.ShapeAppearance), new c0(0.0f)).a();
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.X;
        paint.setStyle(style);
        if (Float.isNaN(this.q0.j)) {
            return;
        }
        paint.setStrokeWidth(this.q0.j);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        xh2 xh2Var = this.q0;
        if (xh2Var.a == null) {
            return null;
        }
        xh2Var.b = getChangingConfigurations();
        return this.q0;
    }

    public final void h(y67 y67Var) {
        RectF rectF = this.Y;
        a(rectF);
        a77 a77VarB = y67Var.b(s0);
        boolean zJ = a77VarB.j(rectF);
        Path path = this.g0;
        if (!zJ) {
            this.i0.a(a77VarB, null, 1.0f, rectF, null, path);
            this.k0 = -1.0f;
            return;
        }
        xh2 xh2Var = this.q0;
        float f = ((xh2Var.j / 2.0f) * this.m0) + xh2Var.p;
        rectF.inset(f, f);
        this.k0 = a77VarB.e.a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            return super.hasFocusStateSpecified() || this.q0.c;
        } catch (NoSuchMethodError unused) {
            return this.q0.c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, v56.FocusRingDrawable, 0, 0) : resources.obtainAttributes(attributeSet, v56.FocusRingDrawable);
        this.q0.d = d(typedArrayObtainStyledAttributes, v56.FocusRingDrawable_focusRingsEnabled);
        if (this.q0.d == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(v56.FocusRingDrawable_focusRingsEnabled)) {
            xh2 xh2Var = this.q0;
            xh2Var.c = typedArrayObtainStyledAttributes.getBoolean(v56.FocusRingDrawable_focusRingsEnabled, xh2Var.c);
            this.q0.e = true;
        }
        this.q0.g = d(typedArrayObtainStyledAttributes, v56.FocusRingDrawable_focusRingsOuterStrokeColor);
        xh2 xh2Var2 = this.q0;
        if (xh2Var2.g == Integer.MIN_VALUE) {
            xh2Var2.f = typedArrayObtainStyledAttributes.getColor(v56.FocusRingDrawable_focusRingsOuterStrokeColor, Integer.MIN_VALUE);
        }
        this.q0.i = d(typedArrayObtainStyledAttributes, v56.FocusRingDrawable_focusRingsInnerStrokeColor);
        xh2 xh2Var3 = this.q0;
        if (xh2Var3.i == Integer.MIN_VALUE) {
            xh2Var3.h = typedArrayObtainStyledAttributes.getColor(v56.FocusRingDrawable_focusRingsInnerStrokeColor, Integer.MIN_VALUE);
        }
        this.q0.k = d(typedArrayObtainStyledAttributes, v56.FocusRingDrawable_focusRingsOuterStrokeWidth);
        xh2 xh2Var4 = this.q0;
        if (xh2Var4.k == Integer.MIN_VALUE) {
            xh2Var4.j = typedArrayObtainStyledAttributes.getDimension(v56.FocusRingDrawable_focusRingsOuterStrokeWidth, Float.NaN);
        }
        this.q0.m = d(typedArrayObtainStyledAttributes, v56.FocusRingDrawable_focusRingsInnerStrokeWidth);
        xh2 xh2Var5 = this.q0;
        if (xh2Var5.m == Integer.MIN_VALUE) {
            xh2Var5.l = typedArrayObtainStyledAttributes.getDimension(v56.FocusRingDrawable_focusRingsInnerStrokeWidth, Float.NaN);
        }
        this.q0.m = d(typedArrayObtainStyledAttributes, v56.FocusRingDrawable_focusRingsInnerStrokeWidth);
        xh2 xh2Var6 = this.q0;
        if (xh2Var6.m == Integer.MIN_VALUE) {
            xh2Var6.l = typedArrayObtainStyledAttributes.getDimension(v56.FocusRingDrawable_focusRingsInnerStrokeWidth, Float.NaN);
        }
        this.q0.o = d(typedArrayObtainStyledAttributes, v56.FocusRingDrawable_focusRingsRadius);
        xh2 xh2Var7 = this.q0;
        if (xh2Var7.o == Integer.MIN_VALUE) {
            xh2Var7.n = typedArrayObtainStyledAttributes.getDimension(v56.FocusRingDrawable_focusRingsRadius, Float.NaN);
        }
        this.q0.q = d(typedArrayObtainStyledAttributes, v56.FocusRingDrawable_focusRingsInset);
        xh2 xh2Var8 = this.q0;
        if (xh2Var8.q == Integer.MIN_VALUE) {
            xh2Var8.p = typedArrayObtainStyledAttributes.getDimension(v56.FocusRingDrawable_focusRingsInset, Float.NaN);
        }
        this.q0.s = d(typedArrayObtainStyledAttributes, v56.FocusRingDrawable_focusRingsInnerStrokeInset);
        xh2 xh2Var9 = this.q0;
        if (xh2Var9.s == Integer.MIN_VALUE) {
            xh2Var9.r = typedArrayObtainStyledAttributes.getDimension(v56.FocusRingDrawable_focusRingsInnerStrokeInset, Float.NaN);
        }
        this.q0.v = d(typedArrayObtainStyledAttributes, v56.FocusRingDrawable_focusRingsShapeAppearance);
        xh2 xh2Var10 = this.q0;
        int i = v56.FocusRingDrawable_focusRingsShapeAppearance;
        xh2Var10.u = typedArrayObtainStyledAttributes.getType(i) == 1 ? typedArrayObtainStyledAttributes.getResourceId(i, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        typedArrayObtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawableCreateFromXmlInner = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawableCreateFromXmlInner != null) {
            setDrawable(drawableCreateFromXmlInner);
            this.q0.a = drawableCreateFromXmlInner.getConstantState();
        } else {
            ColorDrawable colorDrawable = r0;
            setDrawable(colorDrawable);
            this.q0.a = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.q0.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.l0;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.l0 = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.p0 && super.mutate() == this) {
            this.q0 = new xh2(this.q0);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.q0.a = drawable.getConstantState();
            }
            this.p0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        a77 a77Var;
        super.onBoundsChange(rect);
        xh2 xh2Var = this.q0;
        if (xh2Var.c) {
            y67 y67Var = xh2Var.t;
            if (y67Var != null) {
                h(y67Var);
                return;
            }
            Drawable drawable = getDrawable();
            byte b = 0;
            y67 y67Var2 = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    lm6 lm6Var = new lm6();
                    lm6 lm6Var2 = new lm6();
                    lm6 lm6Var3 = new lm6();
                    lm6 lm6Var4 = new lm6();
                    oy1 oy1Var = new oy1(b);
                    oy1 oy1Var2 = new oy1(b);
                    oy1 oy1Var3 = new oy1(b);
                    oy1 oy1Var4 = new oy1(b);
                    float radius = outline.getRadius();
                    c0 c0Var = new c0(radius);
                    c0 c0Var2 = new c0(radius);
                    c0 c0Var3 = new c0(radius);
                    c0 c0Var4 = new c0(radius);
                    a77Var = new a77();
                    a77Var.a = lm6Var;
                    a77Var.b = lm6Var2;
                    a77Var.c = lm6Var3;
                    a77Var.d = lm6Var4;
                    a77Var.e = c0Var;
                    a77Var.f = c0Var2;
                    a77Var.g = c0Var3;
                    a77Var.h = c0Var4;
                    a77Var.i = oy1Var;
                    a77Var.j = oy1Var2;
                    a77Var.k = oy1Var3;
                    a77Var.l = oy1Var4;
                    y67Var2 = a77Var;
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    lm6 lm6Var5 = new lm6();
                    lm6 lm6Var6 = new lm6();
                    lm6 lm6Var7 = new lm6();
                    lm6 lm6Var8 = new lm6();
                    oy1 oy1Var5 = new oy1(b);
                    oy1 oy1Var6 = new oy1(b);
                    oy1 oy1Var7 = new oy1(b);
                    oy1 oy1Var8 = new oy1(b);
                    c0 c0Var5 = new c0(Math.min(cornerRadii[0], cornerRadii[1]));
                    c0 c0Var6 = new c0(Math.min(cornerRadii[2], cornerRadii[3]));
                    c0 c0Var7 = new c0(Math.min(cornerRadii[4], cornerRadii[5]));
                    c0 c0Var8 = new c0(Math.min(cornerRadii[6], cornerRadii[7]));
                    a77Var = new a77();
                    a77Var.a = lm6Var5;
                    a77Var.b = lm6Var6;
                    a77Var.c = lm6Var7;
                    a77Var.d = lm6Var8;
                    a77Var.e = c0Var5;
                    a77Var.f = c0Var6;
                    a77Var.g = c0Var7;
                    a77Var.h = c0Var8;
                    a77Var.i = oy1Var5;
                    a77Var.j = oy1Var6;
                    a77Var.k = oy1Var7;
                    a77Var.l = oy1Var8;
                    y67Var2 = a77Var;
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > 0.0f) {
                        lm6 lm6Var9 = new lm6();
                        lm6 lm6Var10 = new lm6();
                        lm6 lm6Var11 = new lm6();
                        lm6 lm6Var12 = new lm6();
                        oy1 oy1Var9 = new oy1(b);
                        oy1 oy1Var10 = new oy1(b);
                        oy1 oy1Var11 = new oy1(b);
                        oy1 oy1Var12 = new oy1(b);
                        c0 c0Var9 = new c0(cornerRadius);
                        c0 c0Var10 = new c0(cornerRadius);
                        c0 c0Var11 = new c0(cornerRadius);
                        c0 c0Var12 = new c0(cornerRadius);
                        a77 a77Var2 = new a77();
                        a77Var2.a = lm6Var9;
                        a77Var2.b = lm6Var10;
                        a77Var2.c = lm6Var11;
                        a77Var2.d = lm6Var12;
                        a77Var2.e = c0Var9;
                        a77Var2.f = c0Var10;
                        a77Var2.g = c0Var11;
                        a77Var2.h = c0Var12;
                        a77Var2.i = oy1Var9;
                        a77Var2.j = oy1Var10;
                        a77Var2.k = oy1Var11;
                        a77Var2.l = oy1Var12;
                        y67Var2 = a77Var2;
                    }
                }
            }
            if (y67Var2 != null) {
                h(y67Var2);
            } else {
                this.k0 = -1.0f;
                this.g0.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        xh2 xh2Var = this.q0;
        if (!xh2Var.c) {
            this.o0 = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(xh2Var.x, iArr);
        boolean z = this.o0 != zStateSetMatches;
        this.o0 = zStateSetMatches;
        if (z && iArr.length > 0 && !this.n0) {
            ObjectAnimator objectAnimator = this.l0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.l0 = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, u0, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(t0);
                objectAnimatorOfFloat.addListener(new z4(this, (byte) 4));
                this.l0 = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.m0 = 1.0f;
            }
        }
        this.n0 = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public FocusRingDrawable() {
        super(null);
        this.X = new Paint(1);
        this.Y = new RectF();
        this.Z = new Rect();
        this.f0 = new Path();
        this.g0 = new Path();
        this.h0 = new Matrix();
        this.i0 = p91.h();
        this.k0 = -1.0f;
        this.m0 = 1.0f;
        this.o0 = false;
        this.p0 = false;
        this.q0 = new xh2(null);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.X = new Paint(1);
        this.Y = new RectF();
        this.Z = new Rect();
        this.f0 = new Path();
        this.g0 = new Path();
        this.h0 = new Matrix();
        this.i0 = p91.h();
        this.k0 = -1.0f;
        this.m0 = 1.0f;
        this.o0 = false;
        this.p0 = false;
        xh2 xh2Var = new xh2(null);
        this.q0 = xh2Var;
        if (drawable != null) {
            xh2Var.a = drawable.getConstantState();
        }
        e(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(xh2 xh2Var, Resources resources, wh2 wh2Var) {
        this(xh2Var, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
