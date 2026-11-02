package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yb8 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static yb8 m0;
    public static yb8 n0;
    public final View X;
    public final CharSequence Y;
    public final int Z;
    public final xb8 f0;
    public final xb8 g0;
    public int h0;
    public int i0;
    public fc8 j0;
    public boolean k0;
    public boolean l0;

    /* JADX WARN: Type inference failed for: r0v0, types: [xb8] */
    /* JADX WARN: Type inference failed for: r0v1, types: [xb8] */
    public yb8(View view, CharSequence charSequence) {
        final byte b = 0;
        this.f0 = new Runnable(this) { // from class: xb8
            public final /* synthetic */ yb8 Y;

            {
                this.Y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                yb8 yb8Var = this.Y;
                switch (b2) {
                    case 0:
                        yb8Var.c(false);
                        break;
                    default:
                        yb8Var.a();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.g0 = new Runnable(this) { // from class: xb8
            public final /* synthetic */ yb8 Y;

            {
                this.Y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                yb8 yb8Var = this.Y;
                switch (b3) {
                    case 0:
                        yb8Var.c(false);
                        break;
                    default:
                        yb8Var.a();
                        break;
                }
            }
        };
        this.X = view;
        this.Y = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = hw8.a;
        this.Z = Build.VERSION.SDK_INT >= 28 ? en.E(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.l0 = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(yb8 yb8Var) {
        yb8 yb8Var2 = m0;
        if (yb8Var2 != null) {
            yb8Var2.X.removeCallbacks(yb8Var2.f0);
        }
        m0 = yb8Var;
        if (yb8Var != null) {
            yb8Var.X.postDelayed(yb8Var.f0, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        yb8 yb8Var = n0;
        View view = this.X;
        if (yb8Var == this) {
            n0 = null;
            fc8 fc8Var = this.j0;
            if (fc8Var != null) {
                View view2 = (View) fc8Var.Z;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) fc8Var.Y).getSystemService("window")).removeView(view2);
                }
                this.j0 = null;
                this.l0 = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (m0 == this) {
            b(null);
        }
        view.removeCallbacks(this.g0);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.X;
        if (view.isAttachedToWindow()) {
            b(null);
            yb8 yb8Var = n0;
            if (yb8Var != null) {
                yb8Var.a();
            }
            n0 = this;
            this.k0 = z;
            fc8 fc8Var = new fc8(view.getContext());
            View view2 = (View) fc8Var.Z;
            Context context = (Context) fc8Var.Y;
            this.j0 = fc8Var;
            int width = this.h0;
            int i4 = this.i0;
            boolean z2 = this.k0;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) fc8Var.g0;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) fc8Var.f0).setText(this.Y);
            int[] iArr = (int[]) fc8Var.j0;
            int[] iArr2 = (int[]) fc8Var.i0;
            Rect rect = (Rect) fc8Var.h0;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(l36.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(l36.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? l36.tooltip_y_offset_touch : l36.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i5 = width;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                i3 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                    i3 = 1;
                } else {
                    Resources resources = context.getResources();
                    i3 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i6 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i6;
                iArr2[i3] = iArr2[i3] - iArr[i3];
                layoutParams.x = (i6 + i5) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i7 = iArr2[i3];
                int i8 = ((i7 + i) - dimensionPixelOffset3) - measuredHeight;
                int i9 = i7 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i8 >= 0) {
                        layoutParams.y = i8;
                    } else {
                        layoutParams.y = i9;
                    }
                } else if (measuredHeight + i9 <= rect.height()) {
                    layoutParams.y = i9;
                } else {
                    layoutParams.y = i8;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.k0) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = cw8.a;
                if ((view.getWindowSystemUiVisibility() & 1) == i3) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            xb8 xb8Var = this.g0;
            view.removeCallbacks(xb8Var);
            view.postDelayed(xb8Var, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.j0 == null || !this.k0) {
            View view2 = this.X;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.l0 = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.j0 == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (this.l0) {
                        this.h0 = x;
                        this.i0 = y;
                        this.l0 = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x - this.h0);
                        int i = this.Z;
                        if (iAbs > i || Math.abs(y - this.i0) > i) {
                            this.h0 = x;
                            this.i0 = y;
                            this.l0 = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.h0 = view.getWidth() / 2;
        this.i0 = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
