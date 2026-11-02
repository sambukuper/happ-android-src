package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import defpackage.b61;
import defpackage.b96;
import defpackage.bt;
import defpackage.c35;
import defpackage.c7;
import defpackage.c96;
import defpackage.cr5;
import defpackage.cw8;
import defpackage.d7;
import defpackage.d96;
import defpackage.dw8;
import defpackage.f96;
import defpackage.ff1;
import defpackage.g82;
import defpackage.g96;
import defpackage.gw8;
import defpackage.h96;
import defpackage.hw8;
import defpackage.i36;
import defpackage.i96;
import defpackage.j96;
import defpackage.k96;
import defpackage.kp5;
import defpackage.l96;
import defpackage.l97;
import defpackage.lg5;
import defpackage.lr0;
import defpackage.m96;
import defpackage.mg5;
import defpackage.o96;
import defpackage.om0;
import defpackage.p61;
import defpackage.q96;
import defpackage.qi4;
import defpackage.r96;
import defpackage.rb0;
import defpackage.rp2;
import defpackage.s56;
import defpackage.s96;
import defpackage.sw8;
import defpackage.t26;
import defpackage.t96;
import defpackage.td5;
import defpackage.u52;
import defpackage.ul2;
import defpackage.uo1;
import defpackage.v86;
import defpackage.v96;
import defpackage.vj8;
import defpackage.w86;
import defpackage.wi3;
import defpackage.wv8;
import defpackage.x86;
import defpackage.xd6;
import defpackage.xr0;
import defpackage.z39;
import io.sentry.c2;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView {
    public static boolean F1 = false;
    public static boolean G1 = false;
    public static final int[] H1 = {R.attr.nestedScrollingEnabled};
    public static final float I1 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean J1 = true;
    public static final boolean K1 = true;
    public static final Class[] L1;
    public static final wi3 M1;
    public static final r96 N1;
    public boolean A0;
    public int A1;
    public int B0;
    public int B1;
    public boolean C0;
    public final boolean C1;
    public boolean D0;
    public final w86 D1;
    public boolean E0;
    public final uo1 E1;
    public int F0;
    public boolean G0;
    public final AccessibilityManager H0;
    public ArrayList I0;
    public boolean J0;
    public boolean K0;
    public int L0;
    public int M0;
    public c96 N0;
    public EdgeEffect O0;
    public EdgeEffect P0;
    public EdgeEffect Q0;
    public EdgeEffect R0;
    public d96 S0;
    public int T0;
    public int U0;
    public VelocityTracker V0;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public int a1;
    public g96 b1;
    public final int c1;
    public final int d1;
    public final float e1;
    public final float f0;
    public final float f1;
    public final ul2 g0;
    public boolean g1;
    public final k h0;
    public final t96 h1;
    public m96 i0;
    public rp2 i1;
    public final d7 j0;
    public final xr0 j1;
    public final lr0 k0;
    public final q96 k1;
    public final xd6 l0;
    public i96 l1;
    public boolean m0;
    public ArrayList m1;
    public final v86 n0;
    public boolean n1;
    public final Rect o0;
    public boolean o1;
    public final Rect p0;
    public final w86 p1;
    public final RectF q0;
    public boolean q1;
    public f r0;
    public v96 r1;
    public j s0;
    public final int[] s1;
    public l96 t0;
    public c35 t1;
    public final ArrayList u0;
    public final int[] u1;
    public final ArrayList v0;
    public final int[] v1;
    public final ArrayList w0;
    public final int[] w1;
    public h96 x0;
    public final ArrayList x1;
    public boolean y0;
    public final v86 y1;
    public boolean z0;
    public boolean z1;

    static {
        Class cls = Integer.TYPE;
        L1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        M1 = new wi3((byte) 2);
        N1 = new r96();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        float fA;
        TypedArray typedArray;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        byte b = 2;
        this.g0 = new ul2(this, b);
        this.h0 = new k(this);
        this.l0 = new xd6((byte) 23);
        this.n0 = new v86(this, (byte) 0);
        this.o0 = new Rect();
        this.p0 = new Rect();
        this.q0 = new RectF();
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.B0 = 0;
        this.J0 = false;
        this.K0 = false;
        this.L0 = 0;
        this.M0 = 0;
        this.N0 = N1;
        ff1 ff1Var = new ff1();
        ff1Var.a = null;
        ff1Var.b = new ArrayList();
        ff1Var.c = (byte) 120;
        ff1Var.d = (byte) 120;
        ff1Var.e = (short) 250;
        ff1Var.f = (short) 250;
        byte b2 = 1;
        ff1Var.g = true;
        ff1Var.h = new ArrayList();
        ff1Var.i = new ArrayList();
        ff1Var.j = new ArrayList();
        ff1Var.k = new ArrayList();
        ff1Var.l = new ArrayList();
        ff1Var.m = new ArrayList();
        ff1Var.n = new ArrayList();
        ff1Var.o = new ArrayList();
        ff1Var.p = new ArrayList();
        ff1Var.q = new ArrayList();
        ff1Var.r = new ArrayList();
        this.S0 = ff1Var;
        this.T0 = 0;
        this.U0 = -1;
        this.e1 = Float.MIN_VALUE;
        this.f1 = Float.MIN_VALUE;
        this.g1 = true;
        this.h1 = new t96(this);
        this.j1 = K1 ? new xr0(b) : null;
        q96 q96Var = new q96();
        q96Var.a = -1;
        q96Var.b = 0;
        q96Var.c = 0;
        q96Var.d = (byte) 1;
        q96Var.e = 0;
        q96Var.f = false;
        q96Var.g = false;
        q96Var.h = false;
        q96Var.i = false;
        q96Var.j = false;
        q96Var.k = false;
        this.k1 = q96Var;
        this.n1 = false;
        this.o1 = false;
        w86 w86Var = new w86(this);
        this.p1 = w86Var;
        this.q1 = false;
        this.s1 = new int[2];
        this.u1 = new int[2];
        this.v1 = new int[2];
        this.w1 = new int[2];
        this.x1 = new ArrayList();
        this.y1 = new v86(this, b2);
        this.A1 = 0;
        this.B1 = 0;
        this.D1 = new w86(this);
        this.E1 = new uo1(getContext(), new x86(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.a1 = viewConfiguration.getScaledTouchSlop();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            Method method = hw8.a;
            fA = gw8.b(viewConfiguration);
        } else {
            fA = hw8.a(viewConfiguration, context);
        }
        this.e1 = fA;
        this.f1 = i2 >= 26 ? gw8.c(viewConfiguration) : hw8.a(viewConfiguration, context);
        this.c1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.d1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f0 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.S0.a = w86Var;
        this.j0 = new d7(new x86(this));
        this.k0 = new lr0(new w86(this));
        WeakHashMap weakHashMap = cw8.a;
        if ((i2 >= 26 ? wv8.a(this) : 0) == 0 && i2 >= 26) {
            wv8.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.H0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new v96(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s56.RecyclerView, i, 0);
        cw8.m(this, context, s56.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(s56.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(s56.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.m0 = typedArrayObtainStyledAttributes.getBoolean(s56.RecyclerView_android_clipToPadding, true);
        if (typedArrayObtainStyledAttributes.getBoolean(s56.RecyclerView_fastScrollEnabled, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(s56.RecyclerView_fastScrollVerticalThumbDrawable);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(s56.RecyclerView_fastScrollVerticalTrackDrawable);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(s56.RecyclerView_fastScrollHorizontalThumbDrawable);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(s56.RecyclerView_fastScrollHorizontalTrackDrawable);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                bt.q("Trying to set fast scroller without both required drawables.".concat(C()));
                throw null;
            }
            Resources resources = getContext().getResources();
            typedArray = typedArrayObtainStyledAttributes;
            new g82(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(i36.fastscroll_default_thickness), resources.getDimensionPixelSize(i36.fastscroll_minimum_range), resources.getDimensionPixelOffset(i36.fastscroll_margin));
        } else {
            typedArray = typedArrayObtainStyledAttributes;
        }
        typedArray.recycle();
        this.C1 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(j.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(L1);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((j) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    kp5.i(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    kp5.i(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    kp5.i(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    kp5.i(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    kp5.i(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e7);
                    throw null;
                }
            }
        }
        int[] iArr = H1;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        cw8.m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(cr5.b, Boolean.TRUE);
    }

    public static RecyclerView H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewH = H(viewGroup.getChildAt(i));
            if (recyclerViewH != null) {
                return recyclerViewH;
            }
        }
        return null;
    }

    public static l N(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).X;
    }

    private c35 getScrollingChildHelper() {
        c35 c35Var = this.t1;
        if (c35Var != null) {
            return c35Var;
        }
        c35 c35Var2 = new c35(this);
        this.t1 = c35Var2;
        return c35Var2;
    }

    public static void l(l lVar) {
        WeakReference weakReference = lVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == lVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            lVar.b = null;
        }
    }

    public static int o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && z39.v(edgeEffect) != 0.0f) {
            int iRound = Math.round(z39.C(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || z39.v(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(z39.C(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        F1 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        G1 = z;
    }

    public final void A() {
        if (this.Q0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.N0.a(this, 2);
        this.Q0 = edgeEffectA;
        if (this.m0) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.P0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.N0.a(this, 1);
        this.P0 = edgeEffectA;
        if (this.m0) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String C() {
        return " " + super.toString() + ", adapter:" + this.r0 + ", layout:" + this.s0 + ", context:" + getContext();
    }

    public final void D(q96 q96Var) {
        if (getScrollState() != 2) {
            q96Var.o = 0;
            q96Var.p = 0;
        } else {
            OverScroller overScroller = this.h1.Z;
            q96Var.o = overScroller.getFinalX() - overScroller.getCurrX();
            q96Var.p = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public final View E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean F(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.w0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            h96 h96Var = (h96) arrayList.get(i);
            if (h96Var.c(this, motionEvent) && action != 3) {
                this.x0 = h96Var;
                return true;
            }
        }
        return false;
    }

    public final void G(int[] iArr) {
        lr0 lr0Var = this.k0;
        int iE = lr0Var.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iE; i3++) {
            l lVarN = N(lr0Var.d(i3));
            if (!lVarN.p()) {
                int iC = lVarN.c();
                if (iC < i) {
                    i = iC;
                }
                if (iC > i2) {
                    i2 = iC;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final l I(int i) {
        l lVar = null;
        if (this.J0) {
            return null;
        }
        lr0 lr0Var = this.k0;
        int iH = lr0Var.h();
        for (int i2 = 0; i2 < iH; i2++) {
            l lVarN = N(lr0Var.g(i2));
            if (lVarN != null && !lVarN.i() && K(lVarN) == i) {
                if (!lr0Var.c.contains(lVarN.a)) {
                    return lVarN;
                }
                lVar = lVarN;
            }
        }
        return lVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0149  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:163:0x0215  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean J(int i, int i2, int i3, int i4) {
        int iMax;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        int minFlingVelocity;
        boolean z4;
        td5 td5VarF;
        int iT;
        PointF pointFA;
        int i6;
        int i7;
        j jVar = this.s0;
        if (jVar != null && !this.D0) {
            boolean zP = jVar.p();
            boolean zQ = this.s0.q();
            int i8 = (!zP || Math.abs(i) < i3) ? 0 : i;
            int iMax2 = (!zQ || Math.abs(i2) < i3) ? 0 : i2;
            if (i8 != 0 || iMax2 != 0) {
                if (i8 == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.O0;
                    if (edgeEffect == null || z39.v(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.Q0;
                        if (edgeEffect2 == null || z39.v(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (k0(this.Q0, i8, getWidth())) {
                            this.Q0.onAbsorb(i8);
                            i8 = 0;
                        }
                    } else {
                        int i9 = -i8;
                        if (k0(this.O0, i9, getWidth())) {
                            this.O0.onAbsorb(i9);
                            i8 = 0;
                        }
                    }
                    iMax = i8;
                    i8 = 0;
                }
                if (iMax2 == 0) {
                    i5 = iMax2;
                    iMax2 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.P0;
                    if (edgeEffect3 == null || z39.v(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.R0;
                        if (edgeEffect4 == null || z39.v(edgeEffect4) == 0.0f) {
                            i5 = iMax2;
                            iMax2 = 0;
                        } else if (k0(this.R0, iMax2, getHeight())) {
                            this.R0.onAbsorb(iMax2);
                            iMax2 = 0;
                        }
                    } else {
                        int i10 = -iMax2;
                        if (k0(this.P0, i10, getHeight())) {
                            this.P0.onAbsorb(i10);
                            iMax2 = 0;
                        }
                    }
                    i5 = 0;
                }
                t96 t96Var = this.h1;
                if (iMax != 0 || iMax2 != 0) {
                    int i11 = -i4;
                    iMax = Math.max(i11, Math.min(iMax, i4));
                    iMax2 = Math.max(i11, Math.min(iMax2, i4));
                    q0(1);
                    t96Var.a(iMax, iMax2);
                }
                if (i8 != 0 || i5 != 0) {
                    float f = i8;
                    float f2 = i5;
                    if (!dispatchNestedPreFling(f, f2)) {
                        boolean z5 = zP || zQ;
                        dispatchNestedFling(f, f2, z5);
                        g96 g96Var = this.b1;
                        if (g96Var != null) {
                            mg5 mg5Var = (mg5) g96Var;
                            j layoutManager = mg5Var.a.getLayoutManager();
                            if (layoutManager == 0 || mg5Var.a.getAdapter() == null || ((Math.abs(i5) <= (minFlingVelocity = mg5Var.a.getMinFlingVelocity()) && Math.abs(i8) <= minFlingVelocity) || !((z4 = layoutManager instanceof o96)))) {
                                z = z5;
                                z2 = true;
                                z3 = false;
                            } else {
                                View view = null;
                                lg5 lg5Var = !z4 ? null : new lg5(mg5Var, mg5Var.a.getContext());
                                if (lg5Var == null) {
                                    z = z5;
                                    z2 = true;
                                    z3 = false;
                                } else {
                                    int iS = layoutManager.S();
                                    if (iS != 0) {
                                        if (layoutManager.q()) {
                                            td5VarF = mg5Var.g(layoutManager);
                                        } else {
                                            td5VarF = layoutManager.p() ? mg5Var.f(layoutManager) : null;
                                        }
                                        if (td5VarF == null) {
                                            z = z5;
                                            z2 = true;
                                            iT = -1;
                                            i6 = -1;
                                            z3 = false;
                                        } else {
                                            z3 = false;
                                            int I = layoutManager.I();
                                            z2 = true;
                                            int i12 = 0;
                                            int i13 = Integer.MIN_VALUE;
                                            int i14 = Integer.MAX_VALUE;
                                            View view2 = null;
                                            while (i12 < I) {
                                                boolean z6 = z5;
                                                View viewH = layoutManager.H(i12);
                                                if (viewH == null) {
                                                    i7 = I;
                                                } else {
                                                    i7 = I;
                                                    int iC = mg5.c(viewH, td5VarF);
                                                    if (iC <= 0 && iC > i13) {
                                                        view2 = viewH;
                                                        i13 = iC;
                                                    }
                                                    if (iC >= 0 && iC < i14) {
                                                        view = viewH;
                                                        i14 = iC;
                                                    }
                                                }
                                                i12++;
                                                z5 = z6;
                                                I = i7;
                                            }
                                            z = z5;
                                            Object[] objArr = !layoutManager.p() ? i5 <= 0 : i8 <= 0;
                                            if (objArr == true && view != null) {
                                                iT = j.T(view);
                                            } else if (objArr == true || view2 == null) {
                                                if (objArr != false) {
                                                    view = view2;
                                                }
                                                if (view == null) {
                                                    iT = -1;
                                                } else {
                                                    iT = ((z4 && (pointFA = ((o96) layoutManager).a(layoutManager.S() + (-1))) != null && ((pointFA.x > 0.0f ? 1 : (pointFA.x == 0.0f ? 0 : -1)) < 0 || (pointFA.y > 0.0f ? 1 : (pointFA.y == 0.0f ? 0 : -1)) < 0)) == objArr ? -1 : 1) + j.T(view);
                                                    if (iT < 0 || iT >= iS) {
                                                        iT = -1;
                                                    }
                                                }
                                            } else {
                                                iT = j.T(view2);
                                            }
                                            i6 = -1;
                                        }
                                    } else {
                                        z = z5;
                                        z2 = true;
                                        iT = -1;
                                        i6 = -1;
                                        z3 = false;
                                    }
                                    if (iT != i6) {
                                        lg5Var.a = iT;
                                        layoutManager.Y0(lg5Var);
                                        return z2;
                                    }
                                }
                            }
                        } else {
                            z = z5;
                            z2 = true;
                            z3 = false;
                        }
                        if (!z) {
                            return z3;
                        }
                        boolean z7 = z2;
                        q0(z7 ? 1 : 0);
                        int i15 = -i4;
                        t96Var.a(Math.max(i15, Math.min(i8, i4)), Math.max(i15, Math.min(i5, i4)));
                        return z7;
                    }
                } else if (iMax != 0 || iMax2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int K(l lVar) {
        if ((lVar.j & 524) == 0 && lVar.f()) {
            int i = lVar.c;
            ArrayList arrayList = (ArrayList) this.j0.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                c7 c7Var = (c7) arrayList.get(i2);
                byte b = c7Var.a;
                if (b != 1) {
                    if (b == 2) {
                        int i3 = c7Var.b;
                        if (i3 <= i) {
                            int i4 = c7Var.d;
                            if (i3 + i4 <= i) {
                                i -= i4;
                            }
                        } else {
                            continue;
                        }
                    } else if (b == 8) {
                        int i5 = c7Var.b;
                        if (i5 == i) {
                            i = c7Var.d;
                        } else {
                            if (i5 < i) {
                                i--;
                            }
                            if (c7Var.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (c7Var.b <= i) {
                    i += c7Var.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long L(l lVar) {
        return this.r0.b ? lVar.e : lVar.c;
    }

    public final l M(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return N(view);
        }
        b61.l("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect O(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        boolean z = layoutParams.Z;
        Rect rect = layoutParams.Y;
        if (!z || (this.k1.g && (layoutParams.X.l() || layoutParams.X.g()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.v0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.o0;
            rect2.set(0, 0, 0, 0);
            ((g) arrayList.get(i)).f(rect2, view, this);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.Z = false;
        return rect;
    }

    public final boolean P() {
        return !this.A0 || this.J0 || this.j0.y();
    }

    public boolean Q() {
        return isChildrenDrawingOrderEnabled();
    }

    public final boolean R() {
        return this.L0 > 0;
    }

    public final void S(int i) {
        if (this.s0 == null) {
            return;
        }
        setScrollState(2);
        this.s0.N0(i);
        awakenScrollBars();
    }

    public final void T() {
        lr0 lr0Var = this.k0;
        int iH = lr0Var.h();
        for (int i = 0; i < iH; i++) {
            ((LayoutParams) lr0Var.g(i).getLayoutParams()).Z = true;
        }
        ArrayList arrayList = this.h0.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutParams layoutParams = (LayoutParams) ((l) arrayList.get(i2)).a.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.Z = true;
            }
        }
    }

    public final void U(int i, int i2, boolean z) {
        int i3 = i + i2;
        lr0 lr0Var = this.k0;
        int iH = lr0Var.h();
        for (int i4 = 0; i4 < iH; i4++) {
            l lVarN = N(lr0Var.g(i4));
            if (lVarN != null && !lVarN.p()) {
                int i5 = lVarN.c;
                q96 q96Var = this.k1;
                if (i5 >= i3) {
                    if (G1) {
                        lVarN.toString();
                    }
                    lVarN.m(-i2, z);
                    q96Var.f = true;
                } else if (i5 >= i) {
                    if (G1) {
                        lVarN.toString();
                    }
                    lVarN.a(8);
                    lVarN.m(-i2, z);
                    lVarN.c = i - 1;
                    q96Var.f = true;
                }
            }
        }
        k kVar = this.h0;
        ArrayList arrayList = kVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l lVar = (l) arrayList.get(size);
            if (lVar != null) {
                int i6 = lVar.c;
                if (i6 >= i3) {
                    if (G1) {
                        lVar.toString();
                    }
                    lVar.m(-i2, z);
                } else if (i6 >= i) {
                    lVar.a(8);
                    kVar.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void V() {
        this.L0++;
    }

    public final void W(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.L0 - 1;
        this.L0 = i2;
        if (i2 < 1) {
            if (F1 && i2 < 0) {
                bt.i("layout or scroll counter cannot go below zero.Some calls are not matching".concat(C()));
                return;
            }
            this.L0 = 0;
            if (z) {
                int i3 = this.F0;
                this.F0 = 0;
                if (i3 != 0 && (accessibilityManager = this.H0) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.x1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    l lVar = (l) arrayList.get(size);
                    if (lVar.a.getParent() == this && !lVar.p() && (i = lVar.q) != -1) {
                        lVar.a.setImportantForAccessibility(i);
                        lVar.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void X(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.U0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.U0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.Y0 = x;
            this.W0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.Z0 = y;
            this.X0 = y;
        }
    }

    public final void Y() {
        if (this.q1 || !this.y0) {
            return;
        }
        WeakHashMap weakHashMap = cw8.a;
        postOnAnimation(this.y1);
        this.q1 = true;
    }

    public final void Z() {
        boolean z;
        boolean z2 = this.J0;
        d7 d7Var = this.j0;
        boolean z3 = false;
        if (z2) {
            d7Var.J((ArrayList) d7Var.d);
            d7Var.J((ArrayList) d7Var.e);
            d7Var.b = 0;
            if (this.K0) {
                this.s0.p0();
            }
        }
        if (this.S0 != null && this.s0.Z0()) {
            d7Var.H();
        } else {
            d7Var.o();
        }
        boolean z4 = this.n1 || this.o1;
        boolean z5 = this.A0 && this.S0 != null && ((z = this.J0) || z4 || this.s0.h0) && (!z || this.r0.b);
        q96 q96Var = this.k1;
        q96Var.j = z5;
        if (z5 && z4 && !this.J0 && this.S0 != null && this.s0.Z0()) {
            z3 = true;
        }
        q96Var.k = z3;
    }

    public final void a0(boolean z) {
        this.K0 = z | this.K0;
        this.J0 = true;
        lr0 lr0Var = this.k0;
        int iH = lr0Var.h();
        for (int i = 0; i < iH; i++) {
            l lVarN = N(lr0Var.g(i));
            if (lVarN != null && !lVarN.p()) {
                lVarN.a(6);
            }
        }
        T();
        k kVar = this.h0;
        ArrayList arrayList = kVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            l lVar = (l) arrayList.get(i2);
            if (lVar != null) {
                lVar.a(6);
                lVar.a(1024);
            }
        }
        f fVar = kVar.h.r0;
        if (fVar == null || !fVar.b) {
            kVar.g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        j jVar = this.s0;
        if (jVar == null || !jVar.f0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public final void b0(l lVar, rb0 rb0Var) {
        lVar.j &= -8193;
        boolean z = this.k1.h;
        xd6 xd6Var = this.l0;
        if (z && lVar.l() && !lVar.i() && !lVar.p()) {
            ((qi4) xd6Var.Z).f(L(lVar), lVar);
        }
        l97 l97Var = (l97) xd6Var.Y;
        sw8 sw8VarA = (sw8) l97Var.get(lVar);
        if (sw8VarA == null) {
            sw8VarA = sw8.a();
            l97Var.put(lVar, sw8VarA);
        }
        sw8VarA.b = rb0Var;
        sw8VarA.a |= 4;
    }

    public final void c0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.O0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.O0.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.P0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.P0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.Q0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.Q0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.R0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.R0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.s0.r((LayoutParams) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        j jVar = this.s0;
        if (jVar != null && jVar.p()) {
            return this.s0.v(this.k1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        j jVar = this.s0;
        if (jVar != null && jVar.p()) {
            return this.s0.w(this.k1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        j jVar = this.s0;
        if (jVar != null && jVar.p()) {
            return this.s0.x(this.k1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        j jVar = this.s0;
        if (jVar != null && jVar.q()) {
            return this.s0.y(this.k1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        j jVar = this.s0;
        if (jVar != null && jVar.q()) {
            return this.s0.z(this.k1);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        j jVar = this.s0;
        if (jVar != null && jVar.q()) {
            return this.s0.A(this.k1);
        }
        return 0;
    }

    public final int d0(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.O0;
        float f2 = 0.0f;
        if (edgeEffect == null || z39.v(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.Q0;
            if (edgeEffect2 != null && z39.v(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.Q0;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fC = z39.C(edgeEffect3, width, height);
                    if (z39.v(this.Q0) == 0.0f) {
                        this.Q0.onRelease();
                    }
                    f2 = fC;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.O0;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -z39.C(edgeEffect4, -width, 1.0f - height);
                if (z39.v(this.O0) == 0.0f) {
                    this.O0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        j layoutManager = getLayoutManager();
        int iA = 0;
        if (layoutManager != null) {
            if (layoutManager.q()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        n0(0, measuredHeight, false);
                        return true;
                    }
                    n0(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean Z = layoutManager.Z();
                    if (keyCode == 122) {
                        if (Z) {
                            iA = getAdapter().a();
                        }
                    } else if (!Z) {
                        iA = getAdapter().a();
                    }
                    o0(iA);
                    return true;
                }
            } else if (layoutManager.p()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        n0(measuredWidth, 0, false);
                        return true;
                    }
                    n0(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean Z2 = layoutManager.Z();
                    if (keyCode2 == 122) {
                        if (Z2) {
                            iA = getAdapter().a();
                        }
                    } else if (!Z2) {
                        iA = getAdapter().a();
                    }
                    o0(iA);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent viewParentD;
        c35 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d && (viewParentD = scrollingChildHelper.d(0)) != null) {
            try {
                return viewParentD.onNestedFling(scrollingChildHelper.c, f, f2, z);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentD);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().a(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().b(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().c(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.v0;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((g) arrayList.get(i)).h(canvas, this);
        }
        EdgeEffect edgeEffect = this.O0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.m0 ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.O0;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.P0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.m0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.P0;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.Q0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.m0 ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.Q0;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.R0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.m0) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.R0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.S0 == null || arrayList.size() <= 0 || !this.S0.f()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final int e0(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.P0;
        float f2 = 0.0f;
        if (edgeEffect == null || z39.v(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.R0;
            if (edgeEffect2 != null && z39.v(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.R0;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fC = z39.C(edgeEffect3, height, 1.0f - width);
                    if (z39.v(this.R0) == 0.0f) {
                        this.R0.onRelease();
                    }
                    f2 = fC;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.P0;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -z39.C(edgeEffect4, -height, width);
                if (z39.v(this.P0) == 0.0f) {
                    this.P0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    public final void f0(g gVar) {
        j jVar = this.s0;
        if (jVar != null) {
            jVar.n("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.v0;
        arrayList.remove(gVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        T();
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:112:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0163  */
    /* JADX WARN: Code duplicated, block: B:118:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x016a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x017d  */
    /* JADX WARN: Code duplicated, block: B:129:0x017f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0181  */
    /* JADX WARN: Code duplicated, block: B:133:0x0185  */
    /* JADX WARN: Code duplicated, block: B:134:0x0187  */
    /* JADX WARN: Code duplicated, block: B:135:0x0189  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:83:0x0117  */
    /* JADX WARN: Code duplicated, block: B:84:0x0119  */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0167, code lost:
    
        if (r16 > 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0174, code lost:
    
        if (r5 > 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0177, code lost:
    
        if (r16 < 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x017a, code lost:
    
        if (r5 < 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0182, code lost:
    
        if ((r5 * r6) <= 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x018a, code lost:
    
        if ((r5 * r6) >= 0) goto L138;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r19, int r20) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.o0;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.Z) {
                Rect rect2 = layoutParams2.Y;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.s0.J0(this, view, this.o0, !this.A0, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        j jVar = this.s0;
        if (jVar != null) {
            return jVar.E();
        }
        bt.i("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        j jVar = this.s0;
        if (jVar != null) {
            return jVar.F(getContext(), attributeSet);
        }
        bt.i("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public f getAdapter() {
        return this.r0;
    }

    @Override // android.view.View
    public int getBaseline() {
        j jVar = this.s0;
        if (jVar == null) {
            return super.getBaseline();
        }
        jVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.m0;
    }

    public v96 getCompatAccessibilityDelegate() {
        return this.r1;
    }

    public c96 getEdgeEffectFactory() {
        return this.N0;
    }

    public d96 getItemAnimator() {
        return this.S0;
    }

    public int getItemDecorationCount() {
        return this.v0.size();
    }

    public j getLayoutManager() {
        return this.s0;
    }

    public int getMaxFlingVelocity() {
        return this.d1;
    }

    public int getMinFlingVelocity() {
        return this.c1;
    }

    public long getNanoTime() {
        if (K1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public g96 getOnFlingListener() {
        return this.b1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.g1;
    }

    public k96 getRecycledViewPool() {
        return this.h0.c();
    }

    public int getScrollState() {
        return this.T0;
    }

    public final void h(l lVar) {
        View view = lVar.a;
        boolean z = view.getParent() == this;
        this.h0.m(M(view));
        boolean zK = lVar.k();
        lr0 lr0Var = this.k0;
        if (zK) {
            lr0Var.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            lr0Var.a(view, -1, true);
            return;
        }
        int iIndexOfChild = lr0Var.a.a.indexOfChild(view);
        if (iIndexOfChild < 0) {
            u52.j(view, "view is not a child, cannot hide ");
        } else {
            lr0Var.b.k(iIndexOfChild);
            lr0Var.i(view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe A[DONT_INVERT, PHI: r7
  0x00fe: PHI (r7v9 boolean) = (r7v7 boolean), (r7v10 boolean) binds: [B:33:0x00e5, B:31:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    public final boolean h0(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        p();
        f fVar = this.r0;
        int[] iArr = this.w1;
        if (fVar != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            i0(i, i2, iArr);
            i4 = iArr[0];
            i5 = iArr[1];
            i6 = i - i4;
            i7 = i2 - i5;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.v0.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        w(i4, i5, i6, i7, this.u1, i3, iArr);
        int i8 = iArr[0];
        int i9 = i6 - i8;
        int i10 = iArr[1];
        int i11 = i7 - i10;
        boolean z4 = (i8 == 0 && i10 == 0) ? false : true;
        int i12 = this.Y0;
        int[] iArr2 = this.u1;
        int i13 = iArr2[0];
        this.Y0 = i12 - i13;
        int i14 = this.Z0;
        int i15 = iArr2[1];
        this.Z0 = i14 - i15;
        int[] iArr3 = this.v1;
        iArr3[0] = iArr3[0] + i13;
        iArr3[1] = iArr3[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || vj8.U(motionEvent, 8194)) {
                z = true;
                z2 = false;
            } else {
                float x = motionEvent.getX();
                float f = i9;
                float y = motionEvent.getY();
                float f2 = i11;
                if (f < 0.0f) {
                    z();
                    z = true;
                    z2 = false;
                    z39.C(this.O0, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    z2 = false;
                    if (f > 0.0f) {
                        A();
                        z39.C(this.Q0, f / getWidth(), y / getHeight());
                    } else {
                        z3 = false;
                    }
                    if (f2 < 0.0f) {
                        B();
                        z39.C(this.P0, (-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        y();
                        z39.C(this.R0, f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else {
                        if (z3 || f != 0.0f || f2 != 0.0f) {
                            postInvalidateOnAnimation();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && vj8.U(motionEvent, 4194304)) {
                            c0();
                        }
                    }
                    z3 = z;
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        c0();
                    }
                }
                z3 = z;
                if (f2 < 0.0f) {
                    B();
                    z39.C(this.P0, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    y();
                    z39.C(this.R0, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else {
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        c0();
                    }
                }
                z3 = z;
                if (z3) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidateOnAnimation();
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    c0();
                }
            }
            n(i, i2);
        } else {
            z = true;
            z2 = false;
        }
        if (i4 != 0 || i5 != 0) {
            x(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i4 == 0 && i5 == 0) ? z2 : z;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().e(0);
    }

    public final void i(g gVar) {
        j jVar = this.s0;
        if (jVar != null) {
            jVar.n("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.v0;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(gVar);
        T();
        requestLayout();
    }

    public final void i0(int i, int i2, int[] iArr) {
        l lVar;
        p0();
        V();
        Trace.beginSection("RV Scroll");
        q96 q96Var = this.k1;
        D(q96Var);
        k kVar = this.h0;
        int iM0 = i != 0 ? this.s0.M0(i, q96Var, kVar) : 0;
        int iO0 = i2 != 0 ? this.s0.O0(i2, q96Var, kVar) : 0;
        Trace.endSection();
        lr0 lr0Var = this.k0;
        int iE = lr0Var.e();
        for (int i3 = 0; i3 < iE; i3++) {
            View viewD = lr0Var.d(i3);
            l lVarM = M(viewD);
            if (lVarM != null && (lVar = lVarM.i) != null) {
                View view = lVar.a;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        W(true);
        r0(false);
        if (iArr != null) {
            iArr[0] = iM0;
            iArr[1] = iO0;
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.y0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.D0;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(i96 i96Var) {
        ArrayList arrayList = this.m1;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.m1 = arrayList;
        }
        arrayList.add(i96Var);
    }

    public void j0(int i) {
        if (this.D0) {
            return;
        }
        t0();
        j jVar = this.s0;
        if (jVar == null) {
            return;
        }
        jVar.N0(i);
        awakenScrollBars();
    }

    public final void k(String str) {
        if (!R()) {
            if (this.M0 > 0) {
                new IllegalStateException(C());
            }
        } else if (str == null) {
            bt.i("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(C()));
        } else {
            bt.i(str);
        }
    }

    public final boolean k0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fV = z39.v(edgeEffect) * i2;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f0 * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = I1;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fV;
    }

    public void l0(int i, int i2) {
        m0(i, i2);
    }

    public final void m() {
        lr0 lr0Var = this.k0;
        int iH = lr0Var.h();
        for (int i = 0; i < iH; i++) {
            l lVarN = N(lr0Var.g(i));
            if (!lVarN.p()) {
                lVarN.d = -1;
                lVarN.g = -1;
            }
        }
        k kVar = this.h0;
        ArrayList arrayList = kVar.a;
        ArrayList arrayList2 = kVar.c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            l lVar = (l) arrayList2.get(i2);
            lVar.d = -1;
            lVar.g = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            l lVar2 = (l) arrayList.get(i3);
            lVar2.d = -1;
            lVar2.g = -1;
        }
        ArrayList arrayList3 = kVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                l lVar3 = (l) kVar.b.get(i4);
                lVar3.d = -1;
                lVar3.g = -1;
            }
        }
    }

    public void m0(int i, int i2) {
        n0(i, i2, false);
    }

    public final void n(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.O0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.O0.onRelease();
            zIsFinished = this.O0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.Q0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.Q0.onRelease();
            zIsFinished |= this.Q0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.P0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.P0.onRelease();
            zIsFinished |= this.P0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.R0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.R0.onRelease();
            zIsFinished |= this.R0.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void n0(int i, int i2, boolean z) {
        j jVar = this.s0;
        if (jVar == null || this.D0) {
            return;
        }
        if (!jVar.p()) {
            i = 0;
        }
        if (!this.s0.q()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().f(i3, 1);
        }
        this.h1.c(i, i2, Integer.MIN_VALUE, null);
    }

    public void o0(int i) {
        j jVar;
        if (this.D0 || (jVar = this.s0) == null) {
            return;
        }
        jVar.X0(this, i);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.L0 = 0;
        this.y0 = true;
        this.A0 = this.A0 && !isLayoutRequested();
        this.h0.e();
        j jVar = this.s0;
        if (jVar != null) {
            jVar.i0 = true;
            jVar.g0(this);
        }
        this.q1 = false;
        if (K1) {
            ThreadLocal threadLocal = rp2.g0;
            rp2 rp2Var = (rp2) threadLocal.get();
            this.i1 = rp2Var;
            if (rp2Var == null) {
                this.i1 = new rp2();
                WeakHashMap weakHashMap = cw8.a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                rp2 rp2Var2 = this.i1;
                rp2Var2.Z = (long) (1.0E9f / refreshRate);
                threadLocal.set(rp2Var2);
            }
            ArrayList arrayList = this.i1.X;
            if (F1 && arrayList.contains(this)) {
                bt.i("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        rp2 rp2Var;
        super.onDetachedFromWindow();
        d96 d96Var = this.S0;
        if (d96Var != null) {
            d96Var.e();
        }
        t0();
        int i = 0;
        this.y0 = false;
        j jVar = this.s0;
        if (jVar != null) {
            jVar.i0 = false;
            jVar.h0(this);
        }
        this.x1.clear();
        removeCallbacks(this.y1);
        this.l0.getClass();
        while (sw8.d.a() != null) {
        }
        k kVar = this.h0;
        ArrayList arrayList = kVar.c;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            cr5.a(((l) arrayList.get(i2)).a);
        }
        kVar.f(kVar.h.r0, false);
        int i3 = cr5.a;
        while (i < getChildCount()) {
            int i4 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = cr5.b(childAt).a;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((dw8) arrayList2.get(size)).a.e();
                }
            }
            i = i4;
        }
        if (!K1 || (rp2Var = this.i1) == null) {
            return;
        }
        boolean zRemove = rp2Var.X.remove(this);
        if (!F1 || zRemove) {
            this.i1 = null;
        } else {
            bt.i("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.v0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((g) arrayList.get(i)).g(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        boolean z;
        if (this.s0 != null && !this.D0 && motionEvent.getAction() == 8) {
            float f = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f2 = this.s0.q() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.s0.p() ? motionEvent.getAxisValue(10) : 0.0f;
                i = 0;
                z = false;
                f = f2;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.s0.q()) {
                    float f3 = -axisValue;
                    axisValue = 0.0f;
                    f = f3;
                } else if (!this.s0.p()) {
                    axisValue = 0.0f;
                }
                i = 26;
                z = this.C1;
            } else {
                axisValue = 0.0f;
                i = 0;
                z = false;
            }
            int i2 = (int) (f * this.f1);
            int i3 = (int) (axisValue * this.e1);
            if (z) {
                OverScroller overScroller = this.h1.Z;
                n0((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, true);
            } else {
                j jVar = this.s0;
                if (jVar != null && !this.D0) {
                    int[] iArr = this.w1;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zP = jVar.p();
                    boolean zQ = this.s0.q();
                    int i4 = zQ ? (zP ? 1 : 0) | 2 : zP ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iD0 = i3 - d0(i3, y);
                    int iE0 = i2 - e0(i2, x);
                    getScrollingChildHelper().f(i4, 1);
                    if (v(zP ? iD0 : 0, zQ ? iE0 : 0, 1, this.w1, this.u1)) {
                        iD0 -= iArr[0];
                        iE0 -= iArr[1];
                    }
                    h0(zP ? iD0 : 0, zQ ? iE0 : 0, motionEvent, 1);
                    rp2 rp2Var = this.i1;
                    if (rp2Var != null && (iD0 != 0 || iE0 != 0)) {
                        rp2Var.a(this, iD0, iE0);
                    }
                    s0(1);
                }
            }
            if (i != 0 && !z) {
                this.E1.a(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.D0) {
            this.x0 = null;
            if (F(motionEvent)) {
                VelocityTracker velocityTracker = this.V0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                s0(0);
                c0();
                setScrollState(0);
                return true;
            }
            j jVar = this.s0;
            if (jVar != null) {
                boolean zP = jVar.p();
                boolean zQ = this.s0.q();
                VelocityTracker velocityTrackerObtain = this.V0;
                if (velocityTrackerObtain == null) {
                    velocityTrackerObtain = VelocityTracker.obtain();
                    this.V0 = velocityTrackerObtain;
                }
                velocityTrackerObtain.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.E0) {
                        this.E0 = false;
                    }
                    this.U0 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.Y0 = x;
                    this.W0 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.Z0 = y;
                    this.X0 = y;
                    EdgeEffect edgeEffect = this.O0;
                    if (edgeEffect == null || z39.v(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        z39.C(this.O0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.Q0;
                    if (edgeEffect2 != null && z39.v(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        z39.C(this.Q0, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.P0;
                    if (edgeEffect3 != null && z39.v(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        z39.C(this.P0, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.R0;
                    if (edgeEffect4 != null && z39.v(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        z39.C(this.R0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.T0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        s0(1);
                    }
                    int[] iArr = this.v1;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    q0(0);
                } else if (actionMasked == 1) {
                    this.V0.clear();
                    s0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.U0);
                    if (iFindPointerIndex >= 0) {
                        int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        if (this.T0 != 1) {
                            int i = x2 - this.W0;
                            int i2 = y2 - this.X0;
                            if (!zP || Math.abs(i) <= this.a1) {
                                z2 = false;
                            } else {
                                this.Y0 = x2;
                                z2 = true;
                            }
                            if (zQ && Math.abs(i2) > this.a1) {
                                this.Z0 = y2;
                                z2 = true;
                            }
                            if (z2) {
                                setScrollState(1);
                            }
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.V0;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    s0(0);
                    c0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.U0 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.Y0 = x3;
                    this.W0 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.Z0 = y3;
                    this.X0 = y3;
                } else if (actionMasked == 6) {
                    X(motionEvent);
                }
                if (this.T0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.A0 = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        j jVar = this.s0;
        if (jVar == null) {
            q(i, i2);
            return;
        }
        boolean zY = jVar.Y();
        k kVar = this.h0;
        boolean z = false;
        q96 q96Var = this.k1;
        if (zY) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.s0.w0(kVar, q96Var, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.z1 = z;
            if (z || this.r0 == null) {
                return;
            }
            if (q96Var.d == 1) {
                t();
            }
            this.s0.Q0(i, i2);
            q96Var.i = true;
            u();
            this.s0.S0(i, i2);
            if (this.s0.V0()) {
                this.s0.Q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                q96Var.i = true;
                u();
                this.s0.S0(i, i2);
            }
            this.A1 = getMeasuredWidth();
            this.B1 = getMeasuredHeight();
            return;
        }
        if (this.z0) {
            this.s0.w0(kVar, q96Var, i, i2);
            return;
        }
        if (this.G0) {
            p0();
            V();
            Z();
            W(true);
            if (q96Var.k) {
                q96Var.g = true;
            } else {
                this.j0.o();
                q96Var.g = false;
            }
            this.G0 = false;
            r0(false);
        } else if (q96Var.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        f fVar = this.r0;
        if (fVar != null) {
            q96Var.e = fVar.a();
        } else {
            q96Var.e = 0;
        }
        p0();
        this.s0.w0(kVar, q96Var, i, i2);
        r0(false);
        q96Var.g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (R()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m96)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m96 m96Var = (m96) parcelable;
        this.i0 = m96Var;
        super.onRestoreInstanceState(m96Var.X);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        m96 m96Var = new m96(super.onSaveInstanceState());
        m96 m96Var2 = this.i0;
        if (m96Var2 != null) {
            m96Var.Z = m96Var2.Z;
            return m96Var;
        }
        j jVar = this.s0;
        if (jVar != null) {
            m96Var.Z = jVar.z0();
            return m96Var;
        }
        m96Var.Z = null;
        return m96Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.R0 = null;
        this.P0 = null;
        this.Q0 = null;
        this.O0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00f6 A[PHI: r1
  0x00f6: PHI (r1v46 int) = (r1v30 int), (r1v50 int) binds: [B:55:0x00e1, B:60:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zF;
        boolean z;
        if (!this.D0 && !this.E0) {
            h96 h96Var = this.x0;
            if (h96Var == null) {
                zF = motionEvent.getAction() == 0 ? false : F(motionEvent);
            } else {
                h96Var.a(this, motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.x0 = null;
                }
                zF = true;
            }
            if (zF) {
                VelocityTracker velocityTracker = this.V0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                s0(0);
                c0();
                setScrollState(0);
                return true;
            }
            j jVar = this.s0;
            if (jVar != null) {
                boolean zP = jVar.p();
                boolean zQ = this.s0.q();
                if (this.V0 == null) {
                    this.V0 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.v1;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.V0.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker2 = this.V0;
                        int i = this.d1;
                        velocityTracker2.computeCurrentVelocity(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax, i);
                        float f = zP ? -this.V0.getXVelocity(this.U0) : 0.0f;
                        float f2 = zQ ? -this.V0.getYVelocity(this.U0) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !J((int) f, (int) f2, this.c1, i)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker3 = this.V0;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        s0(0);
                        c0();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.U0);
                        if (iFindPointerIndex >= 0) {
                            int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                            int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                            int iMax = this.Y0 - x;
                            int iMax2 = this.Z0 - y;
                            if (this.T0 != 1) {
                                if (zP) {
                                    int i2 = this.a1;
                                    iMax = iMax > 0 ? Math.max(0, iMax - i2) : Math.min(0, iMax + i2);
                                    if (iMax != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else {
                                    z = false;
                                }
                                if (zQ) {
                                    int i3 = this.a1;
                                    iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i3) : Math.min(0, iMax2 + i3);
                                    if (iMax2 != 0) {
                                        z = true;
                                    }
                                }
                                if (z) {
                                    setScrollState(1);
                                }
                            }
                            if (this.T0 == 1) {
                                int[] iArr2 = this.w1;
                                iArr2[0] = 0;
                                iArr2[1] = 0;
                                int iD0 = iMax - d0(iMax, motionEvent.getY());
                                int iE0 = iMax2 - e0(iMax2, motionEvent.getX());
                                boolean zV = v(zP ? iD0 : 0, zQ ? iE0 : 0, 0, this.w1, this.u1);
                                int[] iArr3 = this.u1;
                                if (zV) {
                                    iD0 -= iArr2[0];
                                    iE0 -= iArr2[1];
                                    iArr[0] = iArr[0] + iArr3[0];
                                    iArr[1] = iArr[1] + iArr3[1];
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                int i4 = iD0;
                                int i5 = iE0;
                                this.Y0 = x - iArr3[0];
                                this.Z0 = y - iArr3[1];
                                if (h0(zP ? i4 : 0, zQ ? i5 : 0, motionEvent, 0)) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                rp2 rp2Var = this.i1;
                                if (rp2Var != null && (i4 != 0 || i5 != 0)) {
                                    rp2Var.a(this, i4, i5);
                                }
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker4 = this.V0;
                        if (velocityTracker4 != null) {
                            velocityTracker4.clear();
                        }
                        s0(0);
                        c0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.U0 = motionEvent.getPointerId(actionIndex);
                        int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.Y0 = x2;
                        this.W0 = x2;
                        int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.Z0 = y2;
                        this.X0 = y2;
                    } else if (actionMasked == 6) {
                        X(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.U0 = motionEvent.getPointerId(0);
                int x3 = (int) (motionEvent.getX() + 0.5f);
                this.Y0 = x3;
                this.W0 = x3;
                int y3 = (int) (motionEvent.getY() + 0.5f);
                this.Z0 = y3;
                this.X0 = y3;
                q0(0);
                this.V0.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (!this.A0 || this.J0) {
            Trace.beginSection("RV FullInvalidate");
            s();
            Trace.endSection();
            return;
        }
        d7 d7Var = this.j0;
        if (d7Var.y()) {
            int i = d7Var.b;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (d7Var.y()) {
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            p0();
            V();
            d7Var.H();
            if (!this.C0) {
                lr0 lr0Var = this.k0;
                int iE = lr0Var.e();
                for (int i2 = 0; i2 < iE; i2++) {
                    l lVarN = N(lr0Var.d(i2));
                    if (lVarN != null && !lVarN.p() && lVarN.l()) {
                        s();
                    }
                }
                d7Var.k();
            }
            r0(true);
            W(true);
            Trace.endSection();
        }
    }

    public final void p0() {
        int i = this.B0 + 1;
        this.B0 = i;
        if (i != 1 || this.D0) {
            return;
        }
        this.C0 = false;
    }

    public final void q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = cw8.a;
        setMeasuredDimension(j.s(i, paddingRight, getMinimumWidth()), j.s(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0(int i) {
        boolean zP = this.s0.p();
        int i2 = zP;
        if (this.s0.q()) {
            i2 = (zP ? 1 : 0) | 2;
        }
        getScrollingChildHelper().f(i2, i);
    }

    public final void r(View view) {
        N(view);
        ArrayList arrayList = this.I0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((f96) this.I0.get(size)).b(view);
            }
        }
    }

    public final void r0(boolean z) {
        int i = this.B0;
        if (i < 1) {
            if (F1) {
                bt.i("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(C()));
                return;
            } else {
                this.B0 = 1;
                i = 1;
            }
        }
        if (!z && !this.D0) {
            this.C0 = false;
        }
        if (i == 1) {
            if (z && this.C0 && !this.D0 && this.s0 != null && this.r0 != null) {
                s();
            }
            if (!this.D0) {
                this.C0 = false;
            }
        }
        this.B0--;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        l lVarN = N(view);
        if (lVarN != null) {
            if (lVarN.k()) {
                lVarN.j &= -257;
            } else if (!lVarN.p()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(lVarN);
                om0.j(sb, C());
                return;
            }
        } else if (F1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            om0.j(sb2, C());
            return;
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.s0.x0(this, view, view2) && view2 != null) {
            g0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.s0.I0(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.w0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((h96) arrayList.get(i)).e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.B0 != 0 || this.D0) {
            this.C0 = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0250  */
    /* JADX WARN: Code duplicated, block: B:163:0x031e  */
    /* JADX WARN: Code duplicated, block: B:182:0x035c  */
    /* JADX WARN: Code duplicated, block: B:184:0x035f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0372  */
    /* JADX WARN: Code duplicated, block: B:192:0x0378  */
    /* JADX WARN: Code duplicated, block: B:194:0x037c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0384  */
    /* JADX WARN: Code duplicated, block: B:200:0x038b  */
    /* JADX WARN: Code duplicated, block: B:203:0x0395 A[LOOP:4: B:196:0x0382->B:203:0x0395, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:209:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:212:0x03b2 A[LOOP:5: B:205:0x03a0->B:212:0x03b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:214:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:244:0x0398 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0398 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0393 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x03b5 A[EDGE_INSN: B:249:0x03b5->B:213:0x03b5 BREAK  A[LOOP:5: B:205:0x03a0->B:212:0x03b2], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void s() {
        boolean z;
        long j;
        l lVar;
        int i;
        int iB;
        int i2;
        int iMin;
        l lVarI;
        View view;
        l lVarI2;
        View view2;
        int i3;
        View viewFindViewById;
        boolean z2;
        l97 l97Var;
        rb0 rb0Var;
        ?? r2;
        RecyclerView recyclerView;
        boolean zG;
        boolean z3;
        if (this.r0 == null || this.s0 == null) {
            return;
        }
        q96 q96Var = this.k1;
        boolean z4 = false;
        q96Var.i = false;
        boolean z5 = true;
        boolean z6 = this.z1 && !(this.A1 == getWidth() && this.B1 == getHeight());
        this.A1 = 0;
        this.B1 = 0;
        this.z1 = false;
        if (q96Var.d == 1) {
            t();
            this.s0.P0(this);
            u();
        } else {
            d7 d7Var = this.j0;
            if ((((ArrayList) d7Var.e).isEmpty() || ((ArrayList) d7Var.d).isEmpty()) && !z6 && this.s0.p0 == getWidth() && this.s0.q0 == getHeight()) {
                this.s0.P0(this);
            } else {
                this.s0.P0(this);
                u();
            }
        }
        q96Var.a(4);
        p0();
        V();
        q96Var.d = (byte) 1;
        boolean z7 = q96Var.j;
        lr0 lr0Var = this.k0;
        k kVar = this.h0;
        xd6 xd6Var = this.l0;
        if (z7) {
            int iE = lr0Var.e() - 1;
            while (iE >= 0) {
                l lVarN = N(lr0Var.d(iE));
                if (lVarN.p()) {
                    z3 = z5;
                } else {
                    long jL = L(lVarN);
                    this.S0.getClass();
                    rb0 rb0Var2 = new rb0();
                    rb0Var2.a(lVarN);
                    qi4 qi4Var = (qi4) xd6Var.Z;
                    l97 l97Var2 = (l97) xd6Var.Y;
                    l lVar2 = (l) qi4Var.b(jL);
                    if (lVar2 == null || lVar2.p()) {
                        z3 = z5;
                        xd6Var.g(lVarN, rb0Var2);
                    } else {
                        z3 = z5;
                        sw8 sw8Var = (sw8) l97Var2.get(lVar2);
                        boolean z8 = (sw8Var == null || (sw8Var.a & 1) == 0) ? false : z3;
                        sw8 sw8Var2 = (sw8) l97Var2.get(lVarN);
                        boolean z9 = (sw8Var2 == null || (sw8Var2.a & 1) == 0) ? false : z3;
                        if (z8 && lVar2 == lVarN) {
                            xd6Var.g(lVarN, rb0Var2);
                        } else {
                            rb0 rb0VarA = xd6Var.A(lVar2, 4);
                            xd6Var.g(lVarN, rb0Var2);
                            rb0 rb0VarA2 = xd6Var.A(lVarN, 8);
                            if (rb0VarA == null) {
                                int iE2 = lr0Var.e();
                                for (int i4 = 0; i4 < iE2; i4++) {
                                    l lVarN2 = N(lr0Var.d(i4));
                                    if (lVarN2 != lVarN && L(lVarN2) == jL) {
                                        f fVar = this.r0;
                                        if (fVar == null || !fVar.b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(lVarN2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(lVarN);
                                            c2.l(sb, C());
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(lVarN2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(lVarN);
                                        c2.l(sb2, C());
                                        return;
                                    }
                                }
                                Objects.toString(lVar2);
                                Objects.toString(lVarN);
                                C();
                            } else {
                                lVar2.o(false);
                                if (z8) {
                                    h(lVar2);
                                }
                                if (lVar2 != lVarN) {
                                    if (z9) {
                                        h(lVarN);
                                    }
                                    lVar2.h = lVarN;
                                    h(lVar2);
                                    kVar.m(lVar2);
                                    lVarN.o(false);
                                    lVarN.i = lVar2;
                                }
                                if (this.S0.a(lVar2, lVarN, rb0VarA, rb0VarA2)) {
                                    Y();
                                }
                            }
                        }
                    }
                }
                iE--;
                z5 = z3;
            }
            z = z5;
            l97 l97Var3 = (l97) xd6Var.Y;
            int i5 = l97Var3.Z - 1;
            while (i5 >= 0) {
                l lVar3 = (l) l97Var3.g(i5);
                sw8 sw8Var3 = (sw8) l97Var3.h(i5);
                int i6 = sw8Var3.a;
                int i7 = i6 & 3;
                w86 w86Var = this.D1;
                if (i7 == 3) {
                    RecyclerView recyclerView2 = w86Var.a;
                    recyclerView2.s0.G0(lVar3.a, recyclerView2.h0);
                } else if ((i6 & 1) != 0) {
                    rb0 rb0Var3 = sw8Var3.b;
                    if (rb0Var3 == null) {
                        RecyclerView recyclerView3 = w86Var.a;
                        recyclerView3.s0.G0(lVar3.a, recyclerView3.h0);
                    } else {
                        w86Var.b(lVar3, rb0Var3, sw8Var3.c);
                    }
                } else {
                    if ((i6 & 14) == 14) {
                        w86Var.a(lVar3, sw8Var3.b, sw8Var3.c);
                    } else if ((i6 & 12) == 12) {
                        rb0 rb0Var4 = sw8Var3.b;
                        rb0 rb0Var5 = sw8Var3.c;
                        w86Var.getClass();
                        lVar3.o(z4);
                        RecyclerView recyclerView4 = w86Var.a;
                        boolean z10 = recyclerView4.J0;
                        d96 d96Var = recyclerView4.S0;
                        if (z10) {
                            if (d96Var.a(lVar3, lVar3, rb0Var4, rb0Var5)) {
                                recyclerView4.Y();
                            }
                            l97Var = l97Var3;
                        } else {
                            ff1 ff1Var = (ff1) d96Var;
                            ff1Var.getClass();
                            int i8 = rb0Var4.a;
                            int i9 = rb0Var5.a;
                            if (i8 == i9) {
                                l97Var = l97Var3;
                                if (rb0Var4.b == rb0Var5.b) {
                                    ff1Var.c(lVar3);
                                    recyclerView = recyclerView4;
                                    zG = false;
                                }
                                if (zG) {
                                    recyclerView.Y();
                                }
                            } else {
                                l97Var = l97Var3;
                            }
                            recyclerView = recyclerView4;
                            zG = ff1Var.g(lVar3, i8, rb0Var4.b, i9, rb0Var5.b);
                            if (zG) {
                                recyclerView.Y();
                            }
                        }
                        r2 = 0;
                        rb0Var = null;
                    } else {
                        l97Var = l97Var3;
                        if ((i6 & 4) != 0) {
                            rb0Var = null;
                            w86Var.b(lVar3, sw8Var3.b, null);
                        } else {
                            rb0Var = null;
                            if ((i6 & 8) != 0) {
                                w86Var.a(lVar3, sw8Var3.b, sw8Var3.c);
                            }
                        }
                        r2 = 0;
                    }
                    sw8Var3.a = r2;
                    sw8Var3.b = rb0Var;
                    sw8Var3.c = rb0Var;
                    sw8.d.d(sw8Var3);
                    i5--;
                    l97Var3 = l97Var;
                    z4 = false;
                }
                l97Var = l97Var3;
                r2 = z4;
                rb0Var = null;
                sw8Var3.a = r2;
                sw8Var3.b = rb0Var;
                sw8Var3.c = rb0Var;
                sw8.d.d(sw8Var3);
                i5--;
                l97Var3 = l97Var;
                z4 = false;
            }
        } else {
            z = true;
        }
        View view3 = null;
        this.s0.F0(kVar);
        q96Var.b = q96Var.e;
        this.J0 = false;
        this.K0 = false;
        q96Var.j = false;
        q96Var.k = false;
        this.s0.h0 = false;
        ArrayList arrayList = kVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        j jVar = this.s0;
        if (jVar.m0) {
            jVar.l0 = 0;
            jVar.m0 = false;
            kVar.n();
        }
        this.s0.v0(q96Var);
        boolean z11 = z;
        W(z11);
        r0(false);
        ((l97) xd6Var.Y).clear();
        ((qi4) xd6Var.Z).a();
        int[] iArr = this.s1;
        int i10 = iArr[0];
        int i11 = iArr[z11 ? 1 : 0];
        G(iArr);
        if (iArr[0] != i10 || iArr[z11 ? 1 : 0] != i11) {
            x(0, 0);
        }
        if (this.g1 && this.r0 != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = q96Var.m;
                if (j == -1) {
                    lVar = null;
                } else {
                    lVar = null;
                }
                if (lVar != null) {
                    view = lVar.a;
                    if (!lr0Var.c.contains(view)) {
                        if (lr0Var.e() > 0) {
                            int i12 = q96Var.l;
                            if (i12 != -1) {
                            }
                            iB = q96Var.b();
                            i2 = i;
                            while (true) {
                                if (i2 < iB) {
                                    lVarI2 = I(i2);
                                    if (lVarI2 != null) {
                                        view2 = lVarI2.a;
                                        if (view2.hasFocusable()) {
                                            view3 = view2;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iB, i) - 1; iMin >= 0; iMin--) {
                                    lVarI = I(iMin);
                                    if (lVarI == null) {
                                        break;
                                        break;
                                    }
                                    view = lVarI.a;
                                    if (view.hasFocusable()) {
                                        view3 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (lr0Var.e() > 0) {
                        int i13 = q96Var.l;
                        if (i13 != -1) {
                        }
                        iB = q96Var.b();
                        i2 = i;
                        while (true) {
                            if (i2 < iB) {
                                lVarI2 = I(i2);
                                if (lVarI2 != null) {
                                    view2 = lVarI2.a;
                                    if (view2.hasFocusable()) {
                                        view3 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                lVarI = I(iMin);
                                if (lVarI == null) {
                                    break;
                                    break;
                                }
                                view = lVarI.a;
                                if (view.hasFocusable()) {
                                    view3 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (lr0Var.e() > 0) {
                    int i14 = q96Var.l;
                    if (i14 != -1) {
                    }
                    iB = q96Var.b();
                    i2 = i;
                    while (true) {
                        if (i2 < iB) {
                            lVarI2 = I(i2);
                            if (lVarI2 != null) {
                                view2 = lVarI2.a;
                                if (view2.hasFocusable()) {
                                    view3 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            lVarI = I(iMin);
                            if (lVarI == null) {
                                break;
                                break;
                            }
                            view = lVarI.a;
                            if (view.hasFocusable()) {
                                view3 = view;
                                break;
                            }
                        }
                    }
                }
                if (view3 != null) {
                    i3 = q96Var.n;
                    if (i3 != -1) {
                        view3 = viewFindViewById;
                    }
                    view3.requestFocus();
                }
            } else if (lr0Var.c.contains(getFocusedChild())) {
                j = q96Var.m;
                if (j == -1 && (z2 = this.r0.b) && z2) {
                    int iH = lr0Var.h();
                    lVar = null;
                    for (int i15 = 0; i15 < iH; i15++) {
                        l lVarN3 = N(lr0Var.g(i15));
                        if (lVarN3 != null && !lVarN3.i() && lVarN3.e == j) {
                            if (!lr0Var.c.contains(lVarN3.a)) {
                                lVar = lVarN3;
                                break;
                            }
                            lVar = lVarN3;
                        }
                    }
                } else {
                    lVar = null;
                }
                if (lVar != null) {
                    view = lVar.a;
                    if (!lr0Var.c.contains(view) && view.hasFocusable()) {
                        view3 = view;
                        break;
                    }
                    if (lr0Var.e() > 0) {
                        int i16 = q96Var.l;
                        i = i16 != -1 ? i16 : 0;
                        iB = q96Var.b();
                        i2 = i;
                        while (true) {
                            if (i2 < iB) {
                                lVarI2 = I(i2);
                                if (lVarI2 != null) {
                                    view2 = lVarI2.a;
                                    if (view2.hasFocusable()) {
                                        view3 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                lVarI = I(iMin);
                                if (lVarI == null) {
                                    break;
                                }
                                view = lVarI.a;
                                if (view.hasFocusable()) {
                                    view3 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (lr0Var.e() > 0) {
                    int i17 = q96Var.l;
                    if (i17 != -1) {
                    }
                    iB = q96Var.b();
                    i2 = i;
                    while (true) {
                        if (i2 < iB) {
                            lVarI2 = I(i2);
                            if (lVarI2 != null) {
                                view2 = lVarI2.a;
                                if (view2.hasFocusable()) {
                                    view3 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            lVarI = I(iMin);
                            if (lVarI == null) {
                                break;
                                break;
                            }
                            view = lVarI.a;
                            if (view.hasFocusable()) {
                                view3 = view;
                                break;
                            }
                        }
                    }
                }
                if (view3 != null) {
                    i3 = q96Var.n;
                    if (i3 != -1 && (viewFindViewById = view3.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view3 = viewFindViewById;
                    }
                    view3.requestFocus();
                }
            }
        }
        q96Var.m = -1L;
        q96Var.l = -1;
        q96Var.n = -1;
    }

    public final void s0(int i) {
        getScrollingChildHelper().g(i);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        j jVar = this.s0;
        if (jVar == null || this.D0) {
            return;
        }
        boolean zP = jVar.p();
        boolean zQ = this.s0.q();
        if (zP || zQ) {
            if (!zP) {
                i = 0;
            }
            if (!zQ) {
                i2 = 0;
            }
            h0(i, i2, null, 0);
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!R()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.F0 |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(v96 v96Var) {
        this.r1 = v96Var;
        cw8.n(this, v96Var);
    }

    public void setAdapter(f fVar) {
        setLayoutFrozen(false);
        f fVar2 = this.r0;
        ul2 ul2Var = this.g0;
        if (fVar2 != null) {
            fVar2.a.unregisterObserver(ul2Var);
            this.r0.h(this);
        }
        d96 d96Var = this.S0;
        if (d96Var != null) {
            d96Var.e();
        }
        j jVar = this.s0;
        k kVar = this.h0;
        if (jVar != null) {
            jVar.E0(kVar);
            this.s0.F0(kVar);
        }
        kVar.a.clear();
        kVar.g();
        d7 d7Var = this.j0;
        d7Var.J((ArrayList) d7Var.d);
        d7Var.J((ArrayList) d7Var.e);
        d7Var.b = 0;
        f fVar3 = this.r0;
        this.r0 = fVar;
        if (fVar != null) {
            fVar.a.registerObserver(ul2Var);
            fVar.d(this);
        }
        j jVar2 = this.s0;
        if (jVar2 != null) {
            jVar2.e0(fVar3);
        }
        f fVar4 = this.r0;
        kVar.a.clear();
        kVar.g();
        kVar.f(fVar3, true);
        k96 k96VarC = kVar.c();
        if (fVar3 != null) {
            k96VarC.b--;
        }
        if (k96VarC.b == 0) {
            SparseArray sparseArray = k96VarC.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                j96 j96Var = (j96) sparseArray.valueAt(i);
                Iterator it = j96Var.a.iterator();
                while (it.hasNext()) {
                    cr5.a(((l) it.next()).a);
                }
                j96Var.a.clear();
            }
        }
        if (fVar4 != null) {
            k96VarC.b++;
        }
        kVar.e();
        this.k1.f = true;
        a0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(b96 b96Var) {
        if (b96Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.m0) {
            this.R0 = null;
            this.P0 = null;
            this.Q0 = null;
            this.O0 = null;
        }
        this.m0 = z;
        super.setClipToPadding(z);
        if (this.A0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(c96 c96Var) {
        c96Var.getClass();
        this.N0 = c96Var;
        this.R0 = null;
        this.P0 = null;
        this.Q0 = null;
        this.O0 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.z0 = z;
    }

    public void setItemAnimator(d96 d96Var) {
        d96 d96Var2 = this.S0;
        if (d96Var2 != null) {
            d96Var2.e();
            this.S0.a = null;
        }
        this.S0 = d96Var;
        if (d96Var != null) {
            d96Var.a = this.p1;
        }
    }

    public void setItemViewCacheSize(int i) {
        k kVar = this.h0;
        kVar.e = i;
        kVar.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(j jVar) {
        RecyclerView recyclerView;
        if (jVar == this.s0) {
            return;
        }
        t0();
        j jVar2 = this.s0;
        k kVar = this.h0;
        if (jVar2 != null) {
            d96 d96Var = this.S0;
            if (d96Var != null) {
                d96Var.e();
            }
            this.s0.E0(kVar);
            this.s0.F0(kVar);
            kVar.a.clear();
            kVar.g();
            if (this.y0) {
                j jVar3 = this.s0;
                jVar3.i0 = false;
                jVar3.h0(this);
            }
            this.s0.T0(null);
            this.s0 = null;
        } else {
            kVar.a.clear();
            kVar.g();
        }
        lr0 lr0Var = this.k0;
        lr0Var.b.j();
        ArrayList arrayList = lr0Var.c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = lr0Var.a.a;
            if (size < 0) {
                break;
            }
            l lVarN = N((View) arrayList.get(size));
            if (lVarN != null) {
                int i = lVarN.p;
                if (recyclerView.R()) {
                    lVarN.q = i;
                    recyclerView.x1.add(lVarN);
                } else {
                    lVarN.a.setImportantForAccessibility(i);
                }
                lVarN.p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.s0 = jVar;
        if (jVar != null) {
            if (jVar.Y != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(jVar);
                String strC = jVar.Y.C();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(strC);
                throw new IllegalArgumentException(sb.toString());
            }
            jVar.T0(this);
            if (this.y0) {
                j jVar4 = this.s0;
                jVar4.i0 = true;
                jVar4.g0(this);
            }
        }
        kVar.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            bt.q("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        c35 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = cw8.a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(g96 g96Var) {
        this.b1 = g96Var;
    }

    @Deprecated
    public void setOnScrollListener(i96 i96Var) {
        this.l1 = i96Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.g1 = z;
    }

    public void setRecycledViewPool(k96 k96Var) {
        k kVar = this.h0;
        RecyclerView recyclerView = kVar.h;
        kVar.f(recyclerView.r0, false);
        k96 k96Var2 = kVar.g;
        if (k96Var2 != null) {
            k96Var2.b--;
        }
        kVar.g = k96Var;
        if (k96Var != null && recyclerView.getAdapter() != null) {
            kVar.g.b++;
        }
        kVar.e();
    }

    @Deprecated
    public void setRecyclerListener(l96 l96Var) {
        this.t0 = l96Var;
    }

    public void setScrollState(int i) {
        c cVar;
        if (i == this.T0) {
            return;
        }
        if (G1) {
            new Exception();
        }
        this.T0 = i;
        if (i != 2) {
            t96 t96Var = this.h1;
            t96Var.i0.removeCallbacks(t96Var);
            t96Var.Z.abortAnimation();
            j jVar = this.s0;
            if (jVar != null && (cVar = jVar.g0) != null) {
                cVar.e();
            }
        }
        j jVar2 = this.s0;
        if (jVar2 != null) {
            jVar2.A0(i);
        }
        i96 i96Var = this.l1;
        if (i96Var != null) {
            i96Var.a(this, i);
        }
        ArrayList arrayList = this.m1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((i96) this.m1.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0 || i != 1) {
            this.a1 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.a1 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(s96 s96Var) {
        this.h0.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().f(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().g(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.D0) {
            k("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.D0 = true;
                this.E0 = true;
                t0();
                return;
            }
            this.D0 = false;
            if (this.C0 && this.s0 != null && this.r0 != null) {
                requestLayout();
            }
            this.C0 = false;
        }
    }

    public final void t() {
        sw8 sw8Var;
        View viewE;
        q96 q96Var = this.k1;
        q96Var.a(1);
        D(q96Var);
        q96Var.i = false;
        p0();
        xd6 xd6Var = this.l0;
        l97 l97Var = (l97) xd6Var.Y;
        l97 l97Var2 = (l97) xd6Var.Y;
        l97Var.clear();
        qi4 qi4Var = (qi4) xd6Var.Z;
        qi4Var.a();
        V();
        Z();
        l lVarM = null;
        View focusedChild = (this.g1 && hasFocus() && this.r0 != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewE = E(focusedChild)) != null) {
            lVarM = M(viewE);
        }
        if (lVarM == null) {
            q96Var.m = -1L;
            q96Var.l = -1;
            q96Var.n = -1;
        } else {
            q96Var.m = this.r0.b ? lVarM.e : -1L;
            q96Var.l = this.J0 ? -1 : lVarM.i() ? lVarM.d : lVarM.b();
            View focusedChild2 = lVarM.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            q96Var.n = id;
        }
        q96Var.h = q96Var.j && this.o1;
        this.o1 = false;
        this.n1 = false;
        q96Var.g = q96Var.k;
        q96Var.e = this.r0.a();
        G(this.s1);
        boolean z = q96Var.j;
        lr0 lr0Var = this.k0;
        if (z) {
            int iE = lr0Var.e();
            for (int i = 0; i < iE; i++) {
                l lVarN = N(lr0Var.d(i));
                if (!lVarN.p() && (!lVarN.g() || this.r0.b)) {
                    d96 d96Var = this.S0;
                    d96.b(lVarN);
                    lVarN.d();
                    d96Var.getClass();
                    rb0 rb0Var = new rb0();
                    rb0Var.a(lVarN);
                    sw8 sw8VarA = (sw8) l97Var2.get(lVarN);
                    if (sw8VarA == null) {
                        sw8VarA = sw8.a();
                        l97Var2.put(lVarN, sw8VarA);
                    }
                    sw8VarA.b = rb0Var;
                    sw8VarA.a |= 4;
                    if (q96Var.h && lVarN.l() && !lVarN.i() && !lVarN.p() && !lVarN.g()) {
                        qi4Var.f(L(lVarN), lVarN);
                    }
                }
            }
        }
        if (q96Var.k) {
            int iH = lr0Var.h();
            for (int i2 = 0; i2 < iH; i2++) {
                l lVarN2 = N(lr0Var.g(i2));
                if (F1 && lVarN2.c == -1 && !lVarN2.i()) {
                    bt.i("view holder cannot have position -1 unless it is removed".concat(C()));
                    return;
                }
                if (!lVarN2.p() && lVarN2.d == -1) {
                    lVarN2.d = lVarN2.c;
                }
            }
            boolean z2 = q96Var.f;
            q96Var.f = false;
            this.s0.u0(this.h0, q96Var);
            q96Var.f = z2;
            for (int i3 = 0; i3 < lr0Var.e(); i3++) {
                l lVarN3 = N(lr0Var.d(i3));
                if (!lVarN3.p() && ((sw8Var = (sw8) l97Var2.get(lVarN3)) == null || (sw8Var.a & 4) == 0)) {
                    d96.b(lVarN3);
                    boolean z3 = (lVarN3.j & 8192) != 0;
                    d96 d96Var2 = this.S0;
                    lVarN3.d();
                    d96Var2.getClass();
                    rb0 rb0Var2 = new rb0();
                    rb0Var2.a(lVarN3);
                    if (z3) {
                        b0(lVarN3, rb0Var2);
                    } else {
                        sw8 sw8VarA2 = (sw8) l97Var2.get(lVarN3);
                        if (sw8VarA2 == null) {
                            sw8VarA2 = sw8.a();
                            l97Var2.put(lVarN3, sw8VarA2);
                        }
                        sw8VarA2.a |= 2;
                        sw8VarA2.b = rb0Var2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        W(true);
        r0(false);
        q96Var.d = (byte) 2;
    }

    public final void t0() {
        c cVar;
        setScrollState(0);
        t96 t96Var = this.h1;
        t96Var.i0.removeCallbacks(t96Var);
        t96Var.Z.abortAnimation();
        j jVar = this.s0;
        if (jVar == null || (cVar = jVar.g0) == null) {
            return;
        }
        cVar.e();
    }

    public final void u() {
        p0();
        V();
        q96 q96Var = this.k1;
        q96Var.a(6);
        this.j0.o();
        q96Var.e = this.r0.a();
        q96Var.c = 0;
        if (this.i0 != null) {
            f fVar = this.r0;
            fVar.getClass();
            int iB = p61.B(1);
            if (iB == 1 ? fVar.a() > 0 : iB != 2) {
                Parcelable parcelable = this.i0.Z;
                if (parcelable != null) {
                    this.s0.y0(parcelable);
                }
                this.i0 = null;
            }
        }
        q96Var.g = false;
        this.s0.u0(this.h0, q96Var);
        q96Var.f = false;
        q96Var.j = q96Var.j && this.S0 != null;
        q96Var.d = (byte) 4;
        W(true);
        r0(false);
    }

    public final boolean v(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().b(i, i2, i3, iArr, iArr2);
    }

    public final void w(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().c(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void x(int i, int i2) {
        this.M0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        i96 i96Var = this.l1;
        if (i96Var != null) {
            i96Var.b(this, i, i2);
        }
        ArrayList arrayList = this.m1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((i96) this.m1.get(size)).b(this, i, i2);
            }
        }
        this.M0--;
    }

    public final void y() {
        if (this.R0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.N0.a(this, 3);
        this.R0 = edgeEffectA;
        if (this.m0) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void z() {
        if (this.O0 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.N0.a(this, 0);
        this.O0 = edgeEffectA;
        if (this.m0) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public l X;
        public final Rect Y;
        public boolean Z;
        public boolean f0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.Y = new Rect();
            this.Z = true;
            this.f0 = false;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.Y = new Rect();
            this.Z = true;
            this.f0 = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.Y = new Rect();
            this.Z = true;
            this.f0 = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.Y = new Rect();
            this.Z = true;
            this.f0 = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.Y = new Rect();
            this.Z = true;
            this.f0 = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        j jVar = this.s0;
        if (jVar != null) {
            return jVar.G(layoutParams);
        }
        bt.i("RecyclerView has no LayoutManager".concat(C()));
        return null;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, t26.recyclerViewStyle);
    }
}
