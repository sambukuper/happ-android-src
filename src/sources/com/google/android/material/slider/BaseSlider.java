package com.google.android.material.slider;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.slider.BaseSlider;
import defpackage.a77;
import defpackage.ac8;
import defpackage.aj1;
import defpackage.bt;
import defpackage.bt7;
import defpackage.c0;
import defpackage.c36;
import defpackage.c98;
import defpackage.cw8;
import defpackage.e48;
import defpackage.gr4;
import defpackage.i21;
import defpackage.ie2;
import defpackage.j36;
import defpackage.m20;
import defpackage.m30;
import defpackage.mr4;
import defpackage.o56;
import defpackage.oi0;
import defpackage.om0;
import defpackage.oy1;
import defpackage.p61;
import defpackage.qw0;
import defpackage.rk;
import defpackage.u26;
import defpackage.u70;
import defpackage.v56;
import defpackage.vx2;
import defpackage.w79;
import defpackage.xh2;
import defpackage.xw3;
import defpackage.yn0;
import defpackage.ys0;
import defpackage.yv8;
import defpackage.z28;
import defpackage.z39;
import defpackage.z67;
import defpackage.z91;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import su.happ.proxyutility.ui.foundation.component.HappSliderField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends vx2, T> extends View {
    public static final int h2 = o56.Widget_MaterialComponents_Slider;
    public static final int i2 = u26.motionDurationMedium4;
    public static final int j2 = u26.motionDurationShort3;
    public static final int k2 = u26.motionEasingEmphasizedInterpolator;
    public static final int l2 = u26.motionEasingEmphasizedAccelerateInterpolator;
    public final int A0;
    public int A1;
    public final int B0;
    public int B1;
    public final int C0;
    public int C1;
    public final int D0;
    public boolean D1;
    public final int E0;
    public boolean E1;
    public final int F0;
    public ColorStateList F1;
    public int G0;
    public ColorStateList G1;
    public final int H0;
    public ColorStateList H1;
    public int I0;
    public ColorStateList I1;
    public int J0;
    public ColorStateList J1;
    public int K0;
    public final Path K1;
    public int L0;
    public final RectF L1;
    public int M0;
    public final RectF M1;
    public int N0;
    public final RectF N1;
    public int O0;
    public final RectF O1;
    public int P0;
    public final Rect P1;
    public int Q0;
    public final RectF Q1;
    public int R0;
    public final Rect R1;
    public int S0;
    public final Matrix S1;
    public int T0;
    public final ArrayList T1;
    public int U0;
    public Drawable U1;
    public int V0;
    public List V1;
    public boolean W0;
    public float W1;
    public Drawable X0;
    public float X1;
    public boolean Y0;
    public ColorStateList Y1;
    public Drawable Z0;
    public ColorStateList Z1;
    public boolean a1;
    public float a2;
    public ColorStateList b1;
    public int b2;
    public Drawable c1;
    public final int c2;
    public boolean d1;
    public final b d2;
    public Drawable e1;
    public final c e2;
    public final Paint f0;
    public boolean f1;
    public final d f2;
    public final Paint g0;
    public ColorStateList g1;
    public boolean g2;
    public final Paint h0;
    public int h1;
    public final Paint i0;
    public final int i1;
    public final Paint j0;
    public final int j1;
    public final Paint k0;
    public float k1;
    public final Paint l0;
    public float l1;
    public final g m0;
    public MotionEvent m1;
    public final AccessibilityManager n0;
    public final Rect n1;
    public f o0;
    public final ArrayList o1;
    public final int p0;
    public List p1;
    public final ArrayList q0;
    public boolean q1;
    public final ArrayList r0;
    public float r1;
    public final ArrayList s0;
    public float s1;
    public boolean t0;
    public ArrayList t1;
    public ValueAnimator u0;
    public int u1;
    public ValueAnimator v0;
    public int v1;
    public final int w0;
    public float w1;
    public final int x0;
    public int x1;
    public final int y0;
    public float[] y1;
    public final int z0;
    public int z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.google.android.material.slider.b] */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.android.material.slider.c] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.google.android.material.slider.d] */
    public BaseSlider(Context context, AttributeSet attributeSet, int i) {
        int i3;
        int i4 = h2;
        super(mr4.b(context, attributeSet, i, i4), attributeSet, i);
        this.q0 = new ArrayList();
        this.r0 = new ArrayList();
        this.s0 = new ArrayList();
        this.t0 = false;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.W0 = false;
        this.Y0 = false;
        this.a1 = false;
        this.d1 = false;
        this.f1 = false;
        this.n1 = new Rect();
        this.o1 = new ArrayList();
        this.p1 = new ArrayList();
        this.q1 = false;
        this.t1 = new ArrayList();
        this.u1 = -1;
        this.v1 = -1;
        this.w1 = 0.0f;
        this.x1 = 0;
        this.D1 = false;
        this.K1 = new Path();
        this.L1 = new RectF();
        this.M1 = new RectF();
        this.N1 = new RectF();
        this.O1 = new RectF();
        this.P1 = new Rect();
        this.Q1 = new RectF();
        this.R1 = new Rect();
        this.S1 = new Matrix();
        this.T1 = new ArrayList();
        this.V1 = Collections.EMPTY_LIST;
        this.b2 = 0;
        this.d2 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.b
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                int i5 = BaseSlider.h2;
                this.X.F();
            }
        };
        this.e2 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.slider.c
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i5 = BaseSlider.h2;
                this.X.F();
            }
        };
        this.f2 = new Runnable() { // from class: com.google.android.material.slider.d
            @Override // java.lang.Runnable
            public final void run() {
                int i5 = BaseSlider.h2;
                BaseSlider baseSlider = this.X;
                baseSlider.setActiveThumbIndex(-1);
                baseSlider.invalidate();
            }
        };
        Context context2 = getContext();
        this.g2 = isShown();
        this.f0 = new Paint();
        this.g0 = new Paint();
        Paint paint = new Paint(1);
        this.h0 = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.i0 = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.j0 = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.k0 = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.l0 = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        this.x0 = context2.getResources().getDimensionPixelSize(j36.m3_slider_focus_ring_thumb_height_decrease);
        Resources resources = context2.getResources();
        this.H0 = resources.getDimensionPixelSize(j36.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(j36.mtrl_slider_track_side_padding);
        this.y0 = dimensionPixelOffset;
        this.L0 = dimensionPixelOffset;
        this.z0 = resources.getDimensionPixelSize(j36.mtrl_slider_thumb_radius);
        this.A0 = resources.getDimensionPixelSize(j36.mtrl_slider_track_height);
        this.B0 = resources.getDimensionPixelSize(j36.mtrl_slider_tick_radius);
        this.C0 = resources.getDimensionPixelSize(j36.mtrl_slider_tick_radius);
        this.D0 = resources.getDimensionPixelSize(j36.mtrl_slider_tick_min_spacing);
        this.j1 = resources.getDimensionPixelSize(j36.mtrl_slider_label_padding);
        this.i1 = resources.getDimensionPixelOffset(j36.m3_slider_track_icon_padding);
        this.F0 = resources.getDimensionPixelSize(j36.mtrl_min_touch_target_size);
        int[] iArr = v56.Slider;
        c98.a(context2, attributeSet, i, i4);
        c98.b(context2, attributeSet, iArr, i, i4, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i4);
        setOrientation(typedArrayObtainStyledAttributes.getInt(v56.Slider_android_orientation, 0));
        this.p0 = typedArrayObtainStyledAttributes.getResourceId(v56.Slider_labelStyle, o56.Widget_MaterialComponents_Tooltip);
        this.r1 = typedArrayObtainStyledAttributes.getFloat(v56.Slider_android_valueFrom, 0.0f);
        this.s1 = typedArrayObtainStyledAttributes.getFloat(v56.Slider_android_valueTo, 1.0f);
        setCentered(typedArrayObtainStyledAttributes.getBoolean(v56.Slider_centered, false));
        this.w1 = typedArrayObtainStyledAttributes.getFloat(v56.Slider_android_stepSize, 0.0f);
        this.x1 = typedArrayObtainStyledAttributes.getInt(v56.Slider_continuousModeTickCount, 0);
        this.E0 = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(v56.Slider_minTouchTargetSize, u70.h0(context2)));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(v56.Slider_trackColor);
        int i5 = zHasValue ? v56.Slider_trackColor : v56.Slider_trackColorInactive;
        int i6 = zHasValue ? v56.Slider_trackColor : v56.Slider_trackColorActive;
        ColorStateList colorStateListX = ys0.x(context2, typedArrayObtainStyledAttributes, i5);
        setTrackInactiveTintList(colorStateListX == null ? w79.v(context2, c36.material_slider_inactive_track_color) : colorStateListX);
        ColorStateList colorStateListX2 = ys0.x(context2, typedArrayObtainStyledAttributes, i6);
        setTrackActiveTintList(colorStateListX2 == null ? w79.v(context2, c36.material_slider_active_track_color) : colorStateListX2);
        ColorStateList colorStateListX3 = ys0.x(context2, typedArrayObtainStyledAttributes, v56.Slider_thumbColor);
        setThumbTintList(colorStateListX3 == null ? w79.v(context2, c36.material_slider_thumb_color) : colorStateListX3);
        if (typedArrayObtainStyledAttributes.hasValue(v56.Slider_thumbStrokeColor)) {
            setThumbStrokeColor(ys0.x(context2, typedArrayObtainStyledAttributes, v56.Slider_thumbStrokeColor));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(v56.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateListX4 = ys0.x(context2, typedArrayObtainStyledAttributes, v56.Slider_haloColor);
        setHaloTintList(colorStateListX4 == null ? w79.v(context2, c36.material_slider_halo_color) : colorStateListX4);
        if (typedArrayObtainStyledAttributes.hasValue(v56.Slider_tickVisibilityMode)) {
            i3 = typedArrayObtainStyledAttributes.getInt(v56.Slider_tickVisibilityMode, -1);
        } else {
            i3 = typedArrayObtainStyledAttributes.getBoolean(v56.Slider_tickVisible, true) ? 0 : 2;
        }
        this.z1 = i3;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(v56.Slider_tickColor);
        int i7 = zHasValue2 ? v56.Slider_tickColor : v56.Slider_tickColorInactive;
        int i8 = zHasValue2 ? v56.Slider_tickColor : v56.Slider_tickColorActive;
        ColorStateList colorStateListX5 = ys0.x(context2, typedArrayObtainStyledAttributes, i7);
        setTickInactiveTintList(colorStateListX5 == null ? w79.v(context2, c36.material_slider_inactive_tick_marks_color) : colorStateListX5);
        ColorStateList colorStateListX6 = ys0.x(context2, typedArrayObtainStyledAttributes, i8);
        setTickActiveTintList(colorStateListX6 == null ? w79.v(context2, c36.material_slider_active_tick_marks_color) : colorStateListX6);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.Slider_trackStopIndicatorSize, 0));
        setTrackCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.Slider_trackCornerSize, -1));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.Slider_trackInsideCornerSize, 0));
        setTrackIconActiveStart(ys0.B(context2, typedArrayObtainStyledAttributes, v56.Slider_trackIconActiveStart));
        setTrackIconActiveEnd(ys0.B(context2, typedArrayObtainStyledAttributes, v56.Slider_trackIconActiveEnd));
        setTrackIconActiveColor(ys0.x(context2, typedArrayObtainStyledAttributes, v56.Slider_trackIconActiveColor));
        setTrackIconInactiveStart(ys0.B(context2, typedArrayObtainStyledAttributes, v56.Slider_trackIconInactiveStart));
        setTrackIconInactiveEnd(ys0.B(context2, typedArrayObtainStyledAttributes, v56.Slider_trackIconInactiveEnd));
        setTrackIconInactiveColor(ys0.x(context2, typedArrayObtainStyledAttributes, v56.Slider_trackIconInactiveColor));
        setTrackIconSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.Slider_trackIconSize, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.Slider_haloRadius, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(v56.Slider_thumbElevation, 0.0f));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.Slider_tickRadiusActive, this.T0 / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(v56.Slider_tickRadiusInactive, this.T0 / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(v56.Slider_labelBehavior, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(v56.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        setValues(Float.valueOf(this.r1));
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        this.w0 = ViewConfiguration.get(context2).getScaledTouchSlop();
        g gVar = new g(this);
        this.m0 = gVar;
        cw8.n(this, gVar);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.n0 = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            this.c2 = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
        } else {
            this.c2 = 120000;
        }
    }

    public final void A(ArrayList arrayList) {
        ViewGroup viewGroupD;
        int resourceId;
        ViewGroup viewGroupD2;
        if (arrayList.isEmpty()) {
            bt.q("At least one value must be set");
            return;
        }
        Collections.sort(arrayList);
        if (this.t1.size() == arrayList.size() && this.t1.equals(arrayList)) {
            return;
        }
        this.t1 = arrayList;
        this.E1 = true;
        ArrayList arrayList2 = this.T1;
        byte b = 0;
        if (arrayList2.size() != this.t1.size()) {
            arrayList2.clear();
            for (int i = 0; i < this.t1.size(); i++) {
                gr4 gr4Var = new gr4();
                gr4Var.w();
                gr4Var.t(getThumbTintList());
                oy1 oy1Var = new oy1(b);
                oy1 oy1Var2 = new oy1(b);
                oy1 oy1Var3 = new oy1(b);
                oy1 oy1Var4 = new oy1(b);
                float f = this.M0 / 2.0f;
                z91 z91VarQ = i21.q(0);
                c0 c0Var = new c0(f);
                c0 c0Var2 = new c0(f);
                c0 c0Var3 = new c0(f);
                c0 c0Var4 = new c0(f);
                a77 a77Var = new a77();
                a77Var.a = z91VarQ;
                a77Var.b = z91VarQ;
                a77Var.c = z91VarQ;
                a77Var.d = z91VarQ;
                a77Var.e = c0Var;
                a77Var.f = c0Var2;
                a77Var.g = c0Var3;
                a77Var.h = c0Var4;
                a77Var.i = oy1Var;
                a77Var.j = oy1Var2;
                a77Var.k = oy1Var3;
                a77Var.l = oy1Var4;
                gr4Var.setShapeAppearanceModel(a77Var);
                gr4Var.setBounds(0, 0, this.M0, this.N0);
                gr4Var.s(getThumbElevation());
                gr4Var.A(getThumbStrokeWidth());
                gr4Var.z(getThumbStrokeColor());
                gr4Var.setState(getDrawableState());
                arrayList2.add(gr4Var);
            }
        }
        this.v1 = 0;
        E();
        ArrayList arrayList3 = this.q0;
        if (arrayList3.size() > this.t1.size()) {
            List<ac8> listSubList = arrayList3.subList(this.t1.size(), arrayList3.size());
            for (ac8 ac8Var : listSubList) {
                if (isAttachedToWindow() && (viewGroupD2 = bt7.d(this)) != null) {
                    viewGroupD2.getOverlay().remove(ac8Var);
                    viewGroupD2.removeOnLayoutChangeListener(ac8Var.M0);
                }
            }
            listSubList.clear();
        }
        while (arrayList3.size() < this.t1.size()) {
            Context context = getContext();
            int i3 = this.p0;
            ac8 ac8Var2 = new ac8(context, i3);
            TypedArray typedArrayD = c98.d(ac8Var2.J0, null, v56.Tooltip, 0, i3, new int[0]);
            Context context2 = ac8Var2.J0;
            ac8Var2.T0 = context2.getResources().getDimensionPixelSize(j36.mtrl_tooltip_arrowSize);
            boolean z = typedArrayD.getBoolean(v56.Tooltip_showMarker, true);
            ac8Var2.S0 = z;
            if (z) {
                z67 z67VarK = ac8Var2.k().k();
                z67VarK.k = ac8Var2.G();
                ac8Var2.setShapeAppearanceModel(z67VarK.a());
            } else {
                ac8Var2.T0 = 0;
            }
            CharSequence text = typedArrayD.getText(v56.Tooltip_android_text);
            boolean zEquals = TextUtils.equals(ac8Var2.I0, text);
            e48 e48Var = ac8Var2.L0;
            if (!zEquals) {
                ac8Var2.I0 = text;
                e48Var.d = true;
                ac8Var2.invalidateSelf();
            }
            int i4 = v56.Tooltip_android_textAppearance;
            z28 z28Var = (!typedArrayD.hasValue(i4) || (resourceId = typedArrayD.getResourceId(i4, 0)) == 0) ? null : new z28(context2, resourceId);
            if (z28Var != null && typedArrayD.hasValue(v56.Tooltip_android_textColor)) {
                z28Var.k = ys0.x(context2, typedArrayD, v56.Tooltip_android_textColor);
            }
            e48Var.b(z28Var, context2);
            ac8Var2.t(ColorStateList.valueOf(typedArrayD.getColor(v56.Tooltip_backgroundTint, qw0.b(qw0.d(yn0.b0(context2, u70.i0(u26.colorOnBackground, context2, ac8.class.getCanonicalName())), 153), qw0.d(yn0.b0(context2, u70.i0(R.attr.colorBackground, context2, ac8.class.getCanonicalName())), 229)))));
            ac8Var2.y(ColorStateList.valueOf(yn0.b0(context2, u70.i0(u26.colorSurface, context2, ac8.class.getCanonicalName()))));
            ac8Var2.O0 = typedArrayD.getDimensionPixelSize(v56.Tooltip_android_padding, 0);
            ac8Var2.P0 = typedArrayD.getDimensionPixelSize(v56.Tooltip_android_minWidth, 0);
            ac8Var2.Q0 = typedArrayD.getDimensionPixelSize(v56.Tooltip_android_minHeight, 0);
            ac8Var2.R0 = typedArrayD.getDimensionPixelSize(v56.Tooltip_android_layout_margin, 0);
            typedArrayD.recycle();
            arrayList3.add(ac8Var2);
            if (isAttachedToWindow() && (viewGroupD = bt7.d(this)) != null) {
                int[] iArr = new int[2];
                viewGroupD.getLocationOnScreen(iArr);
                ac8Var2.U0 = iArr[0];
                viewGroupD.getWindowVisibleDisplayFrame(ac8Var2.N0);
                viewGroupD.addOnLayoutChangeListener(ac8Var2.M0);
            }
        }
        int i5 = arrayList3.size() == 1 ? 0 : 1;
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            ((ac8) it.next()).A(i5);
        }
        for (vx2 vx2Var : this.r0) {
            for (Float f2 : this.t1) {
                f2.getClass();
                vx2Var.getClass();
                m30 m30Var = vx2Var.a;
                int i6 = HappSliderField.j0;
                m30Var.x((Slider) this, f2, Boolean.FALSE);
            }
        }
        postInvalidate();
    }

    public final boolean B(int i, float f) {
        ViewParent parent;
        this.v1 = i;
        if (Math.abs(f - ((Float) this.t1.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.b2 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f2 = (minSeparation - this.L0) / this.C1;
                float f3 = this.r1;
                minSeparation = p61.e(f3, this.s1, f2, f3);
            }
        }
        if (s() || t()) {
            minSeparation = -minSeparation;
        }
        int i3 = i + 1;
        int i4 = i - 1;
        this.t1.set(i, Float.valueOf(z91.l(f, i4 < 0 ? this.r1 : minSeparation + ((Float) this.t1.get(i4)).floatValue(), i3 >= this.t1.size() ? this.s1 : ((Float) this.t1.get(i3)).floatValue() - minSeparation)));
        for (vx2 vx2Var : this.r0) {
            Float f4 = (Float) this.t1.get(i);
            f4.getClass();
            vx2Var.getClass();
            m30 m30Var = vx2Var.a;
            int i5 = HappSliderField.j0;
            m30Var.x((Slider) this, f4, Boolean.TRUE);
        }
        AccessibilityManager accessibilityManager = this.n0;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            f fVar = this.o0;
            if (fVar == null) {
                this.o0 = new f(this);
            } else {
                removeCallbacks(fVar);
            }
            f fVar2 = this.o0;
            fVar2.X = i;
            postDelayed(fVar2, 200L);
            g gVar = this.m0;
            View view = gVar.k0;
            if (i != Integer.MIN_VALUE && gVar.j0.isEnabled() && (parent = view.getParent()) != null) {
                AccessibilityEvent accessibilityEventK = gVar.k(i, 2048);
                accessibilityEventK.setContentChangeTypes(0);
                parent.requestSendAccessibilityEvent(view, accessibilityEventK);
            }
        }
        return true;
    }

    public final void C() {
        double dRound;
        float f = this.a2;
        float f2 = this.w1;
        if (f2 > 0.0f) {
            int i = (int) ((this.s1 - this.r1) / f2);
            dRound = ((double) Math.round(f * i)) / ((double) i);
        } else {
            dRound = f;
        }
        if (s() || t()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.s1;
        float f4 = this.r1;
        B(this.u1, (float) ((dRound * ((double) (f3 - f4))) + ((double) f4)));
    }

    public final void D(int i, Rect rect) {
        int iV = this.L0 + ((int) (v(getValues().get(i).floatValue()) * this.C1));
        int iD = d();
        int iMax = Math.max(this.E0, this.F0) / 2;
        int iMax2 = Math.max(this.M0 / 2, iMax);
        int iMax3 = Math.max(this.N0 / 2, iMax);
        RectF rectF = new RectF(iV - iMax2, iD - iMax3, iV + iMax2, iD + iMax3);
        if (t()) {
            this.S1.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void E() {
        float f;
        float f2;
        float f3;
        float f4;
        RippleDrawable rippleDrawableN;
        float fV = (v(((Float) this.t1.get(this.v1)).floatValue()) * this.C1) + this.L0;
        int iD = d();
        if (n() != null && getMeasuredWidth() > 0 && (rippleDrawableN = n()) != null) {
            int i = this.O0;
            float f5 = i;
            float[] fArr = {fV - f5, iD - i, f5 + fV, i + iD};
            if (t()) {
                this.S1.mapPoints(fArr);
            }
            rippleDrawableN.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
        float f6 = iD;
        FocusRingDrawable focusRingDrawableC = FocusRingDrawable.c(getBackground());
        if (focusRingDrawableC != null) {
            float dimensionPixelOffset = getResources().getDimensionPixelOffset(j36.m3_slider_focus_ring_padding);
            float f7 = (dimensionPixelOffset * 2.0f) + (this.M0 / 2.0f);
            float f8 = (this.N0 / 2.0f) + dimensionPixelOffset;
            if (t()) {
                f = f6 - f8;
                float f9 = f6 + f8;
                f2 = fV - f7;
                f3 = fV + f7;
                f4 = f9;
            } else {
                f = fV - f7;
                f4 = fV + f7;
                f2 = f6 - f8;
                f3 = f6 + f8;
            }
            focusRingDrawableC.mutate();
            int i3 = (int) f;
            int i4 = (int) f2;
            int i5 = (int) f4;
            int i6 = (int) f3;
            xh2 xh2Var = focusRingDrawableC.q0;
            if (xh2Var.w == null) {
                xh2Var.w = new Rect();
            }
            focusRingDrawableC.q0.w.set(i3, i4, i5, i6);
        }
    }

    public final void F() {
        float f;
        boolean zT = t();
        boolean zS = s();
        float f2 = 0.5f;
        if (zT && zS) {
            f = 0.5f;
            f2 = -0.2f;
        } else {
            f = 1.2f;
            if (zT) {
                f2 = 1.2f;
                f = 0.5f;
            }
        }
        for (ac8 ac8Var : this.q0) {
            ac8Var.X0 = f2;
            ac8Var.Y0 = f;
            ac8Var.invalidateSelf();
        }
        int i = this.J0;
        if (i == 0 || i == 1) {
            if (this.u1 == -1 || !isEnabled()) {
                l();
                return;
            } else {
                k(false);
                return;
            }
        }
        if (i == 2) {
            l();
            return;
        }
        if (i != 3) {
            xw3.h(this.J0, "Unexpected labelBehavior: ");
            return;
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            bt7.d(this).getHitRect(rect);
            if (getLocalVisibleRect(rect) && this.g2) {
                k(true);
                return;
            }
        }
        l();
    }

    public final void G() {
        if (this.P0 > 0 && this.U1 == null && this.V1.isEmpty()) {
            int i = this.M0;
            this.Q0 = i;
            this.S0 = this.N0;
            this.R0 = this.P0;
            int iRound = Math.round(i * 0.5f);
            FocusRingDrawable focusRingDrawableC = FocusRingDrawable.c(getBackground());
            y(iRound, (focusRingDrawableC == null || !focusRingDrawableC.q0.c) ? -1 : this.N0 - this.x0, Integer.valueOf(this.u1));
        }
    }

    public final void H() {
        int iMin;
        P();
        float f = this.w1;
        if (f <= 0.0f) {
            I(this.x1);
            return;
        }
        int i = this.z1;
        if (i != 0) {
            iMin = 0;
            if (i == 1) {
                int i3 = (int) (((this.s1 - this.r1) / f) + 1.0f);
                if (i3 <= (this.C1 / this.D0) + 1) {
                    iMin = i3;
                }
            } else if (i != 2) {
                om0.e(this.z1, "Unexpected tickVisibilityMode: ");
                return;
            }
        } else {
            iMin = Math.min((int) (((this.s1 - this.r1) / f) + 1.0f), (this.C1 / this.D0) + 1);
        }
        I(iMin);
    }

    public final void I(int i) {
        if (i == 0) {
            this.y1 = null;
            return;
        }
        float[] fArr = this.y1;
        if (fArr == null || fArr.length != i * 2) {
            this.y1 = new float[i * 2];
        }
        float f = this.C1 / (i - 1);
        float fD = d();
        for (int i3 = 0; i3 < i * 2; i3 += 2) {
            float[] fArr2 = this.y1;
            fArr2[i3] = ((i3 / 2.0f) * f) + this.L0;
            fArr2[i3 + 1] = fD;
        }
        if (t()) {
            this.S1.mapPoints(this.y1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    public final void J(Canvas canvas, Paint paint, RectF rectF, float f, int i) {
        float fMax;
        if (rectF.isEmpty()) {
            return;
        }
        if (this.t1.isEmpty() || this.P0 <= 0) {
            fMax = f;
        } else {
            float fR = R(((Float) this.t1.get((s() || t()) ? this.t1.size() - 1 : 0)).floatValue()) - this.L0;
            if (fR < f) {
                fMax = Math.max(fR, this.V0);
            } else {
                fMax = f;
            }
        }
        if (!this.t1.isEmpty() && this.P0 > 0) {
            float fR2 = R(((Float) this.t1.get((s() || t()) ? 0 : this.t1.size() - 1)).floatValue()) - this.L0;
            float f2 = this.C1;
            if (fR2 > f2 - f) {
                f = Math.max(f2 - fR2, this.V0);
            }
        }
        int iB = p61.B(i);
        if (iB == 1) {
            f = this.V0;
        } else if (iB == 2) {
            fMax = this.V0;
        } else if (iB == 3) {
            fMax = this.V0;
            f = fMax;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        if (this.P0 > 0) {
            paint.setAntiAlias(true);
        }
        RectF rectF2 = new RectF(rectF);
        boolean zT = t();
        Matrix matrix = this.S1;
        if (zT) {
            matrix.mapRect(rectF2);
        }
        Path path = this.K1;
        path.reset();
        if (rectF.width() >= fMax + f) {
            path.addRoundRect(rectF2, t() ? new float[]{fMax, fMax, fMax, fMax, f, f, f, f} : new float[]{fMax, fMax, f, f, f, f, fMax, fMax}, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        float fMin = Math.min(fMax, f);
        float fMax2 = Math.max(fMax, f);
        canvas.save();
        path.addRoundRect(rectF2, fMin, fMin, Path.Direction.CW);
        canvas.clipPath(path);
        int iB2 = p61.B(i);
        RectF rectF3 = this.O1;
        if (iB2 == 1) {
            float f3 = rectF.left;
            rectF3.set(f3, rectF.top, (2.0f * fMax2) + f3, rectF.bottom);
        } else if (iB2 != 2) {
            rectF3.set(rectF.centerX() - fMax2, rectF.top, rectF.centerX() + fMax2, rectF.bottom);
        } else {
            float f4 = rectF.right;
            rectF3.set(f4 - (2.0f * fMax2), rectF.top, f4, rectF.bottom);
        }
        if (t()) {
            matrix.mapRect(rectF3);
        }
        canvas.drawRoundRect(rectF3, fMax2, fMax2, paint);
        canvas.restore();
    }

    public final void K() {
        Drawable drawableMutate = this.Z0;
        if (drawableMutate != null) {
            boolean z = this.a1;
            if (!z && this.b1 != null) {
                drawableMutate = drawableMutate.mutate();
                this.Z0 = drawableMutate;
                z = true;
                this.a1 = true;
            }
            if (z) {
                drawableMutate.setTintList(this.b1);
            }
        }
    }

    public final void L() {
        Drawable drawableMutate = this.X0;
        if (drawableMutate != null) {
            boolean z = this.Y0;
            if (!z && this.b1 != null) {
                drawableMutate = drawableMutate.mutate();
                this.X0 = drawableMutate;
                z = true;
                this.Y0 = true;
            }
            if (z) {
                drawableMutate.setTintList(this.b1);
            }
        }
    }

    public final void M() {
        Drawable drawableMutate = this.e1;
        if (drawableMutate != null) {
            boolean z = this.f1;
            if (!z && this.g1 != null) {
                drawableMutate = drawableMutate.mutate();
                this.e1 = drawableMutate;
                z = true;
                this.f1 = true;
            }
            if (z) {
                drawableMutate.setTintList(this.g1);
            }
        }
    }

    public final void N() {
        Drawable drawableMutate = this.c1;
        if (drawableMutate != null) {
            boolean z = this.d1;
            if (!z && this.g1 != null) {
                drawableMutate = drawableMutate.mutate();
                this.c1 = drawableMutate;
                z = true;
                this.d1 = true;
            }
            if (z) {
                drawableMutate.setTintList(this.g1);
            }
        }
    }

    public final void O(boolean z) {
        int paddingTop;
        int paddingBottom;
        boolean z2;
        if (t()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i = paddingBottom + paddingTop;
        int iMax = Math.max(this.H0, Math.max(this.K0 + i, this.N0 + i));
        boolean z3 = true;
        if (iMax == this.I0) {
            z2 = false;
        } else {
            this.I0 = iMax;
            z2 = true;
        }
        int iMax2 = Math.max(Math.max(Math.max((this.M0 / 2) - this.z0, 0), Math.max((this.K0 - this.A0) / 2, 0)), Math.max(Math.max(this.A1 - this.B0, 0), Math.max(this.B1 - this.C0, 0))) + this.y0;
        if (this.L0 == iMax2) {
            z3 = false;
        } else {
            this.L0 = iMax2;
            if (isLaidOut()) {
                this.C1 = Math.max((t() ? getHeight() : getWidth()) - (this.L0 * 2), 0);
                H();
            }
        }
        if (t()) {
            float fD = d();
            Matrix matrix = this.S1;
            matrix.reset();
            matrix.setRotate(90.0f, fD, fD);
        }
        if (z2 || z) {
            requestLayout();
        } else if (z3) {
            postInvalidate();
        }
    }

    public final void P() {
        if (this.E1) {
            float f = this.r1;
            float f2 = this.s1;
            if (f >= f2) {
                throw new IllegalStateException("valueFrom(" + f + ") must be smaller than valueTo(" + f2 + ")");
            }
            for (Float f3 : this.t1) {
                if (f3.floatValue() < this.r1 || f3.floatValue() > this.s1) {
                    throw new IllegalStateException("Slider value(" + f3 + ") must be greater or equal to valueFrom(" + this.r1 + "), and lower or equal to valueTo(" + this.s1 + ")");
                }
                if (this.w1 > 0.0f && !Q(f3.floatValue())) {
                    float f4 = this.r1;
                    float f5 = this.w1;
                    throw new IllegalStateException("Value(" + f3 + ") must be equal to valueFrom(" + f4 + ") plus a multiple of stepSize(" + f5 + ") when using stepSize(" + f5 + ")");
                }
            }
            if (this.w1 > 0.0f && !Q(this.s1)) {
                float f6 = this.w1;
                float f7 = this.r1;
                float f8 = this.s1;
                StringBuilder sbK = ie2.k("The stepSize(", f6, ") must be 0, or a factor of the valueFrom(", f7, ")-valueTo(");
                sbK.append(f8);
                sbK.append(") range");
                throw new IllegalStateException(sbK.toString());
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f9 = this.w1;
            if (f9 > 0.0f && minSeparation > 0.0f) {
                if (this.b2 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + f9 + ")");
                }
                if (minSeparation < f9 || !p(minSeparation)) {
                    float f10 = this.w1;
                    StringBuilder sbK2 = ie2.k("minSeparation(", minSeparation, ") must be greater or equal and a multiple of stepSize(", f10, ") when using stepSize(");
                    sbK2.append(f10);
                    sbK2.append(")");
                    throw new IllegalStateException(sbK2.toString());
                }
            }
            if (this.w1 != 0.0f) {
                float f11 = this.s1;
                int i = (((int) f11) > f11 ? 1 : (((int) f11) == f11 ? 0 : -1));
            }
            this.E1 = false;
        }
    }

    public final boolean Q(float f) {
        return p(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.r1)), MathContext.DECIMAL64).doubleValue());
    }

    public final float R(float f) {
        return (v(f) * this.C1) + this.L0;
    }

    public final void a(int i, Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, this.N0);
        } else {
            float fMax = Math.max(i, this.N0) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final void b(Canvas canvas, RectF rectF, Drawable drawable, boolean z) {
        if (drawable != null) {
            int i = this.h1;
            float f = rectF.right - rectF.left;
            int i3 = this.i1;
            float f2 = (i3 * 2) + i;
            RectF rectF2 = this.Q1;
            if (f >= f2) {
                float f3 = z ^ (s() || t()) ? rectF.left + i3 : (rectF.right - i3) - i;
                float f4 = i;
                float fD = d() - (f4 / 2.0f);
                rectF2.set(f3, fD, f3 + f4, f4 + fD);
            } else {
                rectF2.setEmpty();
            }
            if (rectF2.isEmpty()) {
                return;
            }
            if (t()) {
                this.S1.mapRect(rectF2);
            }
            Rect rect = this.R1;
            rectF2.round(rect);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }

    public final int c(int i) {
        if (!this.q1 || i != this.u1 || this.U1 != null || !this.V1.isEmpty()) {
            return this.P0;
        }
        return this.P0 - ((this.M0 - Math.round(this.M0 * 0.5f)) / 2);
    }

    public final int d() {
        int i = this.I0 / 2;
        int i3 = this.J0;
        int intrinsicHeight = 0;
        if (i3 == 1 || i3 == 3) {
            ArrayList arrayList = this.q0;
            if (!arrayList.isEmpty()) {
                intrinsicHeight = ((ac8) arrayList.get(0)).getIntrinsicHeight();
            }
        }
        return i + intrinsicHeight;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.m0.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f0.setColor(o(this.J1));
        this.g0.setColor(o(this.I1));
        this.j0.setColor(o(this.H1));
        this.k0.setColor(o(this.G1));
        this.l0.setColor(o(this.H1));
        for (ac8 ac8Var : this.q0) {
            if (ac8Var.isStateful()) {
                ac8Var.setState(getDrawableState());
            }
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.T1;
            if (i >= arrayList.size()) {
                int iO = o(this.F1);
                Paint paint = this.i0;
                paint.setColor(iO);
                paint.setAlpha(63);
                return;
            }
            if (((gr4) arrayList.get(i)).isStateful()) {
                ((gr4) arrayList.get(i)).setState(getDrawableState());
            }
            i++;
        }
    }

    public final ValueAnimator e(boolean z) {
        int iG0;
        TimeInterpolator timeInterpolatorD;
        float fFloatValue = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.v0 : this.u0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z ? 1.0f : 0.0f);
        if (z) {
            iG0 = u70.g0(getContext(), i2, 83);
            timeInterpolatorD = z39.D(getContext(), k2, rk.e);
        } else {
            iG0 = u70.g0(getContext(), j2, 117);
            timeInterpolatorD = z39.D(getContext(), l2, rk.c);
        }
        valueAnimatorOfFloat.setDuration(iG0);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorD);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = BaseSlider.h2;
                float fFloatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                BaseSlider baseSlider = this.a;
                for (ac8 ac8Var : baseSlider.q0) {
                    ac8Var.V0 = fFloatValue2;
                    ac8Var.W0 = fFloatValue2;
                    ac8Var.Z0 = rk.b(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue2);
                    ac8Var.invalidateSelf();
                }
                baseSlider.postInvalidateOnAnimation();
            }
        });
        return valueAnimatorOfFloat;
    }

    public final void f(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF, int i, int i3) {
        if (f2 - f > getTrackCornerSize() - i3) {
            rectF.set(f, f3, f2, f4);
        } else {
            rectF.setEmpty();
        }
        J(canvas, this.f0, rectF, getTrackCornerSize(), i);
    }

    public final void g(Canvas canvas, float f, float f2) {
        for (int i = 0; i < this.t1.size(); i++) {
            float fR = R(((Float) this.t1.get(i)).floatValue());
            float fC = (this.M0 / 2.0f) + c(i);
            if (f >= fR - fC && f <= fR + fC) {
                return;
            }
        }
        boolean zT = t();
        Paint paint = this.l0;
        if (zT) {
            canvas.drawPoint(f2, f, paint);
        } else {
            canvas.drawPoint(f, f2, paint);
        }
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.m0.m0;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public abstract float getThumbElevation();

    public abstract int getThumbRadius();

    public abstract ColorStateList getThumbStrokeColor();

    public abstract float getThumbStrokeWidth();

    public abstract ColorStateList getThumbTintList();

    public abstract int getTrackCornerSize();

    public abstract float getValueFrom();

    public abstract float getValueTo();

    public List<Float> getValues() {
        return new ArrayList(this.t1);
    }

    public final void h(Canvas canvas, int i, int i3, float f, Drawable drawable) {
        canvas.save();
        if (t()) {
            canvas.concat(this.S1);
        }
        canvas.translate((this.L0 + ((int) (v(f) * i))) - (drawable.getBounds().width() / 2.0f), i3 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    public final void i(int i, int i3, Canvas canvas, Paint paint) {
        while (i < i3) {
            boolean zT = t();
            float[] fArr = this.y1;
            float f = zT ? fArr[i + 1] : fArr[i];
            int i4 = 0;
            while (true) {
                if (i4 >= this.t1.size()) {
                    if (!((Slider) this).W0) {
                        float[] fArr2 = this.y1;
                        canvas.drawPoint(fArr2[i], fArr2[i + 1], paint);
                        break;
                        break;
                    }
                    float f2 = ((this.L0 * 2) + this.C1) / 2.0f;
                    float f3 = this.P0;
                    if (f >= f2 - f3 && f <= f2 + f3) {
                        break;
                    }
                    float[] fArr3 = this.y1;
                    canvas.drawPoint(fArr3[i], fArr3[i + 1], paint);
                    break;
                }
                float fR = R(((Float) this.t1.get(i4)).floatValue());
                float fC = (this.M0 / 2.0f) + c(i4);
                if (f >= fR - fC && f <= fR + fC) {
                    break;
                } else {
                    i4++;
                }
            }
            i += 2;
        }
    }

    public final void j(Canvas canvas, RectF rectF, RectF rectF2) {
        if (this.X0 == null && this.Z0 == null && this.c1 == null && this.e1 == null) {
            return;
        }
        this.t1.size();
        b(canvas, rectF, this.X0, true);
        b(canvas, rectF2, this.c1, true);
        b(canvas, rectF, this.Z0, false);
        b(canvas, rectF2, this.e1, false);
    }

    public final void k(boolean z) {
        if (!this.t0) {
            this.t0 = true;
            ValueAnimator valueAnimatorE = e(true);
            this.u0 = valueAnimatorE;
            this.v0 = null;
            valueAnimatorE.start();
        }
        ArrayList arrayList = this.q0;
        Iterator it = arrayList.iterator();
        if (z) {
            for (int i = 0; i < this.t1.size() && it.hasNext(); i++) {
                if (i != this.v1) {
                    z((ac8) it.next(), ((Float) this.t1.get(i)).floatValue());
                }
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.t1.size())));
        }
        z((ac8) it.next(), ((Float) this.t1.get(this.v1)).floatValue());
    }

    public final void l() {
        if (this.t0) {
            this.t0 = false;
            ValueAnimator valueAnimatorE = e(false);
            this.v0 = valueAnimatorE;
            this.u0 = null;
            valueAnimatorE.addListener(new e(this));
            this.v0.start();
        }
    }

    public final float[] m() {
        float fFloatValue = ((Float) this.t1.get(0)).floatValue();
        float fFloatValue2 = ((Float) oi0.h(1, this.t1)).floatValue();
        if (this.t1.size() == 1) {
            fFloatValue = this.r1;
        }
        float fV = v(fFloatValue);
        float fV2 = v(fFloatValue2);
        Slider slider = (Slider) this;
        if (slider.W0) {
            float fMin = Math.min(0.5f, fV2);
            fV2 = Math.max(0.5f, fV2);
            fV = fMin;
        }
        return (slider.W0 || !(s() || t())) ? new float[]{fV, fV2} : new float[]{fV2, fV};
    }

    public final RippleDrawable n() {
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            return (RippleDrawable) background;
        }
        return null;
    }

    public final int o(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g2 = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.d2);
        getViewTreeObserver().addOnGlobalLayoutListener(this.e2);
        for (ac8 ac8Var : this.q0) {
            ViewGroup viewGroupD = bt7.d(this);
            if (viewGroupD == null) {
                ac8Var.getClass();
            } else {
                ac8Var.getClass();
                int[] iArr = new int[2];
                viewGroupD.getLocationOnScreen(iArr);
                ac8Var.U0 = iArr[0];
                viewGroupD.getWindowVisibleDisplayFrame(ac8Var.N0);
                viewGroupD.addOnLayoutChangeListener(ac8Var.M0);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        f fVar = this.o0;
        if (fVar != null) {
            removeCallbacks(fVar);
        }
        this.t0 = false;
        for (ac8 ac8Var : this.q0) {
            ViewGroup viewGroupD = bt7.d(this);
            if (viewGroupD != null) {
                viewGroupD.getOverlay().remove(ac8Var);
                viewGroupD.removeOnLayoutChangeListener(ac8Var.M0);
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.d2);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.e2);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:127:0x027f  */
    /* JADX WARN: Code duplicated, block: B:84:0x019f  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a5  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iC;
        int iC2;
        int i;
        int iC3;
        float f;
        float f2;
        int i3;
        int i4;
        BaseSlider<S, L, T> baseSlider = this;
        if (baseSlider.E1) {
            baseSlider.P();
            baseSlider.H();
        }
        super.onDraw(canvas);
        int iD = baseSlider.d();
        int i5 = baseSlider.C1;
        float[] fArrM = baseSlider.m();
        float f3 = iD;
        float f4 = baseSlider.K0 / 2.0f;
        float f5 = f3 - f4;
        float f6 = f4 + f3;
        Slider slider = (Slider) baseSlider;
        if (slider.W0 && fArrM[0] == 0.5f) {
            iC = baseSlider.P0;
        } else {
            iC = baseSlider.c((baseSlider.s() || baseSlider.t()) ? baseSlider.t1.size() - 1 : 0);
        }
        int i6 = iC;
        float trackCornerSize = baseSlider.L0 - baseSlider.getTrackCornerSize();
        float f7 = i5;
        float f8 = ((fArrM[0] * f7) + baseSlider.L0) - i6;
        RectF rectF = baseSlider.M1;
        baseSlider.f(trackCornerSize, f8, f5, f6, canvas, rectF, 2, i6);
        if (slider.W0 && fArrM[1] == 0.5f) {
            iC2 = baseSlider.P0;
        } else {
            iC2 = baseSlider.c((baseSlider.s() || baseSlider.t()) ? 0 : baseSlider.t1.size() - 1);
        }
        int i7 = iC2;
        int i8 = baseSlider.L0;
        float f9 = (fArrM[1] * f7) + i8 + i7;
        float trackCornerSize2 = i8 + i5 + baseSlider.getTrackCornerSize();
        RectF rectF2 = baseSlider.N1;
        int i9 = 3;
        baseSlider.f(f9, trackCornerSize2, f5, f6, canvas, rectF2, 3, i7);
        int i10 = baseSlider.C1;
        float[] fArrM2 = baseSlider.m();
        float f10 = baseSlider.L0;
        float f11 = i10;
        float f12 = (fArrM2[1] * f11) + f10;
        float fC = (fArrM2[0] * f11) + f10;
        int i11 = 2;
        float fR = f12;
        RectF rectF3 = baseSlider.L1;
        if (fC >= f12) {
            rectF3.setEmpty();
        } else {
            if (baseSlider.t1.size() != 1 || slider.W0) {
                i9 = 4;
            } else if (!baseSlider.s() && !baseSlider.t()) {
                i9 = 2;
            }
            int i12 = i9;
            int i13 = 0;
            while (i13 < baseSlider.t1.size()) {
                if (baseSlider.t1.size() > 1) {
                    fR = i13 > 0 ? baseSlider.R(((Float) baseSlider.t1.get(i13 - 1)).floatValue()) : fC;
                    float fR2 = baseSlider.R(((Float) baseSlider.t1.get(i13)).floatValue());
                    if (baseSlider.s() || baseSlider.t()) {
                        fC = fR2;
                    } else {
                        fC = fR;
                        fR = fR2;
                    }
                }
                int trackCornerSize3 = baseSlider.getTrackCornerSize();
                int iB = p61.B(i12);
                if (iB != 1) {
                    if (iB != i11) {
                        i = i11;
                        if (iB == 3) {
                            if (i13 > 0) {
                                fC += baseSlider.c(i13 - 1);
                                iC3 = baseSlider.c(i13);
                            } else if (fArrM2[1] == 0.5f) {
                                fC += baseSlider.c(i13);
                            } else if (fArrM2[0] == 0.5f) {
                                iC3 = baseSlider.c(i13);
                            }
                        }
                    } else {
                        i = i11;
                        fC += baseSlider.c(i13);
                        fR += trackCornerSize3;
                    }
                    f = fR;
                    f2 = fC;
                    if (f2 >= f) {
                        rectF3.setEmpty();
                    } else {
                        float f13 = baseSlider.K0 / 2.0f;
                        rectF3.set(f2, f3 - f13, f, f13 + f3);
                        baseSlider.J(canvas, baseSlider.g0, rectF3, trackCornerSize3, i12);
                    }
                    i13++;
                    fR = f;
                    fC = f2;
                    i11 = i;
                } else {
                    i = i11;
                    fC -= trackCornerSize3;
                    iC3 = baseSlider.c(i13);
                }
                fR -= iC3;
                f = fR;
                f2 = fC;
                if (f2 >= f) {
                    rectF3.setEmpty();
                } else {
                    float f14 = baseSlider.K0 / 2.0f;
                    rectF3.set(f2, f3 - f14, f, f14 + f3);
                    baseSlider.J(canvas, baseSlider.g0, rectF3, trackCornerSize3, i12);
                }
                i13++;
                fR = f;
                fC = f2;
                i11 = i;
            }
        }
        Canvas canvas2 = canvas;
        int i14 = i11;
        if (baseSlider.s() || baseSlider.t()) {
            baseSlider.j(canvas2, rectF3, rectF);
        } else {
            baseSlider.j(canvas2, rectF3, rectF2);
        }
        float[] fArr = baseSlider.y1;
        if (fArr != null && fArr.length != 0) {
            float[] fArrM3 = baseSlider.m();
            int iCeil = (int) Math.ceil(((baseSlider.y1.length / 2.0f) - 1.0f) * fArrM3[0]);
            int iFloor = (int) Math.floor(((baseSlider.y1.length / 2.0f) - 1.0f) * fArrM3[1]);
            Paint paint = baseSlider.j0;
            if (iCeil > 0) {
                baseSlider.i(0, iCeil * 2, canvas2, paint);
            }
            if (iCeil <= iFloor) {
                baseSlider.i(iCeil * 2, (iFloor + 1) * 2, canvas2, baseSlider.k0);
            }
            int i15 = (iFloor + 1) * 2;
            float[] fArr2 = baseSlider.y1;
            if (i15 < fArr2.length) {
                baseSlider.i(i15, fArr2.length, canvas2, paint);
            }
        }
        if (baseSlider.T0 > 0 && !baseSlider.t1.isEmpty()) {
            float fFloatValue = ((Float) oi0.h(1, baseSlider.t1)).floatValue();
            float f15 = baseSlider.s1;
            if (fFloatValue < f15) {
                baseSlider.g(canvas2, baseSlider.R(f15), f3);
            }
            if (slider.W0 || (baseSlider.t1.size() > 1 && ((Float) baseSlider.t1.get(0)).floatValue() > baseSlider.r1)) {
                baseSlider.g(canvas2, baseSlider.R(baseSlider.r1), f3);
            }
        }
        if ((baseSlider.q1 || baseSlider.isFocused()) && baseSlider.isEnabled()) {
            int i16 = baseSlider.C1;
            if (baseSlider.n() == null) {
                float[] fArr3 = new float[i14];
                fArr3[0] = (baseSlider.v(((Float) baseSlider.t1.get(baseSlider.v1)).floatValue()) * i16) + baseSlider.L0;
                fArr3[1] = f3;
                if (baseSlider.t()) {
                    baseSlider.S1.mapPoints(fArr3);
                }
                if (Build.VERSION.SDK_INT < 28) {
                    float f16 = fArr3[0];
                    float f17 = baseSlider.O0;
                    float f18 = fArr3[1];
                    canvas.clipRect(f16 - f17, f18 - f17, f16 + f17, f18 + f17, Region.Op.UNION);
                    canvas2 = canvas;
                }
                i3 = 0;
                canvas2.drawCircle(fArr3[0], fArr3[1], baseSlider.O0, baseSlider.i0);
            } else {
                baseSlider = baseSlider;
                i3 = 0;
            }
        } else {
            baseSlider = baseSlider;
            i3 = 0;
        }
        baseSlider.F();
        int i17 = baseSlider.C1;
        int i18 = i3;
        while (i18 < baseSlider.t1.size()) {
            float fFloatValue2 = ((Float) baseSlider.t1.get(i18)).floatValue();
            Drawable drawable = baseSlider.U1;
            if (drawable != null) {
                i4 = iD;
                baseSlider.h(canvas2, i17, i4, fFloatValue2, drawable);
            } else {
                BaseSlider<S, L, T> baseSlider2 = baseSlider;
                i4 = iD;
                if (i18 < baseSlider2.V1.size()) {
                    baseSlider2.h(canvas, i17, i4, fFloatValue2, (Drawable) baseSlider2.V1.get(i18));
                } else {
                    if (!baseSlider2.isEnabled()) {
                        canvas.drawCircle((baseSlider2.v(fFloatValue2) * i17) + baseSlider2.L0, f3, baseSlider2.getThumbRadius(), baseSlider2.h0);
                    }
                    baseSlider2.h(canvas, i17, i4, fFloatValue2, (Drawable) baseSlider2.T1.get(i18));
                }
            }
            i18++;
            baseSlider = this;
            canvas2 = canvas;
            iD = i4;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        g gVar = this.m0;
        if (!z) {
            x();
            this.u1 = -1;
            gVar.j(this.v1);
            return;
        }
        if (this.u1 == -1) {
            int i3 = Integer.MAX_VALUE;
            if (i == 1) {
                u(Integer.MAX_VALUE);
            } else if (i == 2) {
                u(Integer.MIN_VALUE);
            } else if (i == 17) {
                u((s() || t()) ? -2147483647 : Integer.MAX_VALUE);
            } else if (i == 66) {
                if (!s() && !t()) {
                    i3 = Integer.MIN_VALUE;
                }
                u(i3);
            }
            this.u1 = this.v1;
        }
        x();
        G();
        gVar.v(this.v1);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Float fValueOf;
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.u1 = this.v1;
        boolean zIsLongPress = this.D1 | keyEvent.isLongPress();
        this.D1 = zIsLongPress;
        float fRound = this.w1;
        if (zIsLongPress) {
            if (fRound == 0.0f) {
                fRound = 1.0f;
            }
            float f = (this.s1 - this.r1) / fRound;
            if (f > 20.0f) {
                fRound *= Math.round(f / 20.0f);
            }
        } else if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        if (i == 21) {
            if (!s()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i == 22) {
            if (s()) {
                fRound = -fRound;
            }
            fValueOf = Float.valueOf(fRound);
        } else if (i != 69) {
            fValueOf = (i == 70 || i == 81) ? Float.valueOf(fRound) : null;
        } else {
            fValueOf = Float.valueOf(-fRound);
        }
        if (fValueOf != null) {
            if (B(this.u1, fValueOf.floatValue() + ((Float) this.t1.get(this.u1)).floatValue())) {
                E();
                postInvalidate();
            }
            return true;
        }
        if (i != 61) {
            return super.onKeyDown(i, keyEvent);
        }
        x();
        if (keyEvent.hasNoModifiers()) {
            return u(1);
        }
        if (keyEvent.isShiftPressed()) {
            return u(-1);
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.D1 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i3, int i4, int i5) {
        super.onLayout(z, i, i3, i4, i5);
        Rect rect = this.n1;
        rect.left = 0;
        rect.top = 0;
        rect.right = i4 - i;
        rect.bottom = i5 - i3;
        ArrayList arrayList = this.o1;
        if (!arrayList.contains(rect)) {
            arrayList.add(rect);
        }
        WeakHashMap weakHashMap = cw8.a;
        if (Build.VERSION.SDK_INT >= 29) {
            yv8.c(this, arrayList);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        int i4 = this.J0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.I0 + ((i4 == 1 || i4 == 3) ? ((ac8) this.q0.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (t()) {
            super.onMeasure(iMakeMeasureSpec, i3);
        } else {
            super.onMeasure(i, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        m20 m20Var = (m20) parcelable;
        super.onRestoreInstanceState(m20Var.getSuperState());
        this.r1 = m20Var.X;
        this.s1 = m20Var.Y;
        A(m20Var.Z);
        this.w1 = m20Var.f0;
        if (m20Var.g0) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        m20 m20Var = new m20(super.onSaveInstanceState());
        m20Var.X = this.r1;
        m20Var.Y = this.s1;
        m20Var.Z = new ArrayList(this.t1);
        m20Var.f0 = this.w1;
        m20Var.g0 = hasFocus();
        return m20Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i3, int i4, int i5) {
        if (t()) {
            i = i3;
        }
        this.C1 = Math.max(i - (this.L0 * 2), 0);
        H();
        E();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            float y = t() ? motionEvent.getY() : motionEvent.getX();
            float x = t() ? motionEvent.getX() : motionEvent.getY();
            float f = (y - this.L0) / this.C1;
            this.a2 = f;
            float fMax = Math.max(0.0f, f);
            this.a2 = fMax;
            this.a2 = Math.min(1.0f, fMax);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                ArrayList arrayList = this.s0;
                int i = this.w0;
                if (actionMasked == 1) {
                    this.q1 = false;
                    MotionEvent motionEvent2 = this.m1;
                    if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                        float f2 = i;
                        if (Math.abs(this.m1.getX() - motionEvent.getX()) <= f2 && Math.abs(this.m1.getY() - motionEvent.getY()) <= f2) {
                            Slider slider = (Slider) this;
                            if (slider.getActiveThumbIndex() == -1) {
                                slider.setActiveThumbIndex(0);
                            }
                            w();
                        }
                    }
                    if (this.u1 != -1) {
                        C();
                        E();
                        x();
                        this.u1 = -1;
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            throw p61.k(it);
                        }
                    }
                    invalidate();
                } else if (actionMasked == 2) {
                    if (!this.q1) {
                        if ((t() || !r(motionEvent) || Math.abs(y - this.k1) >= i) && (!t() || !q(motionEvent) || Math.abs(x - this.l1) >= i * 0.8f)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            Slider slider2 = (Slider) this;
                            if (slider2.getActiveThumbIndex() == -1) {
                                slider2.setActiveThumbIndex(0);
                            }
                            this.q1 = true;
                            G();
                            w();
                        }
                    }
                    C();
                    E();
                    invalidate();
                } else if (actionMasked == 3) {
                    this.q1 = false;
                    if (this.u1 != -1 && !this.p1.isEmpty()) {
                        for (int i3 = 0; i3 < this.t1.size(); i3++) {
                            if (i3 == this.u1) {
                                B(i3, ((Float) this.p1.get(i3)).floatValue());
                                break;
                            }
                        }
                    }
                    E();
                    x();
                    this.u1 = -1;
                    Iterator it2 = arrayList.iterator();
                    if (it2.hasNext()) {
                        throw p61.k(it2);
                    }
                    invalidate();
                }
            } else {
                this.k1 = y;
                this.l1 = x;
                this.p1.clear();
                this.p1 = getValues();
                if ((t() || !r(motionEvent)) && (!t() || !q(motionEvent))) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    Slider slider3 = (Slider) this;
                    if (slider3.getActiveThumbIndex() == -1) {
                        slider3.setActiveThumbIndex(0);
                    }
                    requestFocus();
                    this.q1 = true;
                    G();
                    w();
                    C();
                    E();
                    invalidate();
                }
            }
            setPressed(this.q1);
            this.m1 = MotionEvent.obtain(motionEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.g2 = z;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ViewGroup viewGroupD = bt7.d(this);
            ViewOverlay overlay = viewGroupD == null ? null : viewGroupD.getOverlay();
            if (overlay == null) {
                return;
            }
            Iterator it = this.q0.iterator();
            while (it.hasNext()) {
                overlay.remove((ac8) it.next());
            }
        }
    }

    public final boolean p(double d) {
        double dDoubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(Float.toString(this.w1)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final boolean q(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean s() {
        return getLayoutDirection() == 1;
    }

    public void setActiveThumbIndex(int i) {
        this.u1 = i;
    }

    public abstract void setCentered(boolean z);

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.U1 = null;
        this.V1 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.V1;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            a(this.M0, drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public abstract void setHaloRadius(int i);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i);

    public abstract void setOrientation(int i);

    public void setSeparationUnit(int i) {
        this.b2 = i;
        this.E1 = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f);

    public abstract void setThumbHeight(int i);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f);

    public abstract void setThumbTintList(ColorStateList colorStateList);

    public abstract void setThumbTrackGapSize(int i);

    public abstract void setThumbWidth(int i);

    public abstract void setTickActiveRadius(int i);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackCornerSize(int i);

    public abstract void setTrackHeight(int i);

    public abstract void setTrackIconActiveColor(ColorStateList colorStateList);

    public abstract void setTrackIconActiveEnd(Drawable drawable);

    public abstract void setTrackIconActiveStart(Drawable drawable);

    public abstract void setTrackIconInactiveColor(ColorStateList colorStateList);

    public abstract void setTrackIconInactiveEnd(Drawable drawable);

    public abstract void setTrackIconInactiveStart(Drawable drawable);

    public abstract void setTrackIconSize(int i);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i);

    public abstract void setTrackStopIndicatorSize(int i);

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        A(arrayList);
    }

    public boolean t() {
        return this.G0 == 1;
    }

    public final boolean u(int i) {
        int i3 = this.v1;
        long j = ((long) i3) + ((long) i);
        long size = this.t1.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i4 = (int) j;
        this.v1 = i4;
        if (i4 == i3) {
            return false;
        }
        this.u1 = i4;
        G();
        E();
        postInvalidate();
        return true;
    }

    public final float v(float f) {
        float f2 = this.r1;
        float f3 = (f - f2) / (this.s1 - f2);
        return (s() || t()) ? 1.0f - f3 : f3;
    }

    public final void w() {
        Iterator it = this.s0.iterator();
        if (it.hasNext()) {
            throw p61.k(it);
        }
    }

    public final void x() {
        int i;
        if (this.P0 <= 0 || (i = this.Q0) == -1 || this.R0 == -1) {
            return;
        }
        y(i, this.S0, Integer.valueOf(this.u1));
    }

    public final void y(int i, int i3, Integer num) {
        byte b = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.T1;
            if (i4 >= arrayList.size()) {
                O(false);
                return;
            }
            if (num == null || i4 == num.intValue()) {
                gr4 gr4Var = (gr4) arrayList.get(i4);
                oy1 oy1Var = new oy1(b);
                oy1 oy1Var2 = new oy1(b);
                oy1 oy1Var3 = new oy1(b);
                oy1 oy1Var4 = new oy1(b);
                float f = i / 2.0f;
                z91 z91VarQ = i21.q(0);
                c0 c0Var = new c0(f);
                c0 c0Var2 = new c0(f);
                c0 c0Var3 = new c0(f);
                c0 c0Var4 = new c0(f);
                a77 a77Var = new a77();
                a77Var.a = z91VarQ;
                a77Var.b = z91VarQ;
                a77Var.c = z91VarQ;
                a77Var.d = z91VarQ;
                a77Var.e = c0Var;
                a77Var.f = c0Var2;
                a77Var.g = c0Var3;
                a77Var.h = c0Var4;
                a77Var.i = oy1Var;
                a77Var.j = oy1Var2;
                a77Var.k = oy1Var3;
                a77Var.l = oy1Var4;
                gr4Var.setShapeAppearanceModel(a77Var);
                ((gr4) arrayList.get(i4)).setBounds(0, 0, i, i3 >= 0 ? i3 : this.N0);
            }
            i4++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:22:0x00be  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00c7  */
    public final void z(ac8 ac8Var, float f) {
        int iV;
        int intrinsicWidth;
        int iD;
        int intrinsicHeight;
        int iD2;
        Rect rect;
        ViewGroup viewGroupD;
        ViewOverlay overlay;
        String str = String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
        if (!TextUtils.equals(ac8Var.I0, str)) {
            ac8Var.I0 = str;
            ac8Var.L0.d = true;
            ac8Var.invalidateSelf();
        }
        boolean zT = t();
        int i = this.L0;
        int i3 = this.j1;
        if (zT) {
            iV = (i + ((int) (v(f) * this.C1))) - (ac8Var.getIntrinsicHeight() / 2);
            intrinsicWidth = ac8Var.getIntrinsicHeight() + iV;
            if (s()) {
                iD = d() - ((this.N0 / 2) + i3);
                intrinsicHeight = ac8Var.getIntrinsicWidth();
            } else {
                iD2 = (this.N0 / 2) + i3 + d();
                iD = ac8Var.getIntrinsicWidth() + iD2;
            }
            rect = this.P1;
            rect.set(iV, iD2, intrinsicWidth, iD);
            if (t()) {
                RectF rectF = new RectF(rect);
                this.S1.mapRect(rectF);
                rectF.round(rect);
            }
            aj1.b(bt7.d(this), this, rect);
            ac8Var.setBounds(rect);
            viewGroupD = bt7.d(this);
            if (viewGroupD == null) {
                overlay = null;
            } else {
                overlay = viewGroupD.getOverlay();
            }
            if (overlay == null) {
                return;
            }
            overlay.add(ac8Var);
        }
        iV = (i + ((int) (v(f) * this.C1))) - (ac8Var.getIntrinsicWidth() / 2);
        intrinsicWidth = ac8Var.getIntrinsicWidth() + iV;
        iD = d() - ((this.N0 / 2) + i3);
        intrinsicHeight = ac8Var.getIntrinsicHeight();
        iD2 = iD - intrinsicHeight;
        rect = this.P1;
        rect.set(iV, iD2, intrinsicWidth, iD);
        if (t()) {
            RectF rectF2 = new RectF(rect);
            this.S1.mapRect(rectF2);
            rectF2.round(rect);
        }
        aj1.b(bt7.d(this), this, rect);
        ac8Var.setBounds(rect);
        viewGroupD = bt7.d(this);
        if (viewGroupD == null) {
            overlay = null;
        } else {
            overlay = viewGroupD.getOverlay();
        }
        if (overlay == null) {
            return;
        }
        overlay.add(ac8Var);
    }

    public void setValues(List<Float> list) {
        A(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }
}
