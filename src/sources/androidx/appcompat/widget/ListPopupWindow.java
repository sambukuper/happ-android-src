package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import defpackage.d81;
import defpackage.h66;
import defpackage.ob4;
import defpackage.pb4;
import defpackage.qb4;
import defpackage.qw1;
import defpackage.rb4;
import defpackage.u70;
import defpackage.v87;
import defpackage.wa;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements v87 {
    public static final Method C0;
    public static final Method D0;
    public boolean A0;
    public final PopupWindow B0;
    public final Context X;
    public ListAdapter Y;
    public qw1 Z;
    public final int f0;
    public int g0;
    public int h0;
    public int i0;
    public final short j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public final int o0;
    public d81 p0;
    public View q0;
    public AdapterView.OnItemClickListener r0;
    public AdapterView.OnItemSelectedListener s0;
    public final pb4 t0;
    public final rb4 u0;
    public final qb4 v0;
    public final pb4 w0;
    public final Handler x0;
    public final Rect y0;
    public Rect z0;

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                C0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                D0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f0 = -2;
        this.g0 = -2;
        this.j0 = (short) 1002;
        this.n0 = 0;
        this.o0 = Integer.MAX_VALUE;
        this.t0 = new pb4(this, (byte) 1);
        this.u0 = new rb4(this, (byte) 0);
        this.v0 = new qb4(this);
        this.w0 = new pb4(this, (byte) 0);
        this.y0 = new Rect();
        this.X = context;
        this.x0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h66.ListPopupWindow, i, i2);
        this.h0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(h66.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(h66.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.i0 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.k0 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, h66.PopupWindow, i, i2);
        if (typedArrayObtainStyledAttributes2.hasValue(h66.PopupWindow_overlapAnchor)) {
            appCompatPopupWindow.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(h66.PopupWindow_overlapAnchor, false));
        }
        int i3 = h66.PopupWindow_android_popupBackground;
        appCompatPopupWindow.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(i3) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(i3, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(i3) : u70.O(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.B0 = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    @Override // defpackage.v87
    public final boolean a() {
        return this.B0.isShowing();
    }

    public final int b() {
        return this.h0;
    }

    public final void d(int i) {
        this.h0 = i;
    }

    @Override // defpackage.v87
    public final void dismiss() {
        PopupWindow popupWindow = this.B0;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.Z = null;
        this.x0.removeCallbacks(this.t0);
    }

    @Override // defpackage.v87
    public final void f() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        qw1 qw1Var;
        qw1 qw1Var2 = this.Z;
        Context context = this.X;
        PopupWindow popupWindow = this.B0;
        byte b = 0;
        if (qw1Var2 == null) {
            qw1 qw1VarQ = q(context, !this.A0);
            this.Z = qw1VarQ;
            qw1VarQ.setAdapter(this.Y);
            this.Z.setOnItemClickListener(this.r0);
            this.Z.setFocusable(true);
            this.Z.setFocusableInTouchMode(true);
            this.Z.setOnItemSelectedListener(new ob4(this, b));
            this.Z.setOnScrollListener(this.v0);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.s0;
            if (onItemSelectedListener != null) {
                this.Z.setOnItemSelectedListener(onItemSelectedListener);
            }
            popupWindow.setContentView(this.Z);
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.y0;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.k0) {
                this.i0 = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = popupWindow.getMaxAvailableHeight(this.q0, this.i0, popupWindow.getInputMethodMode() == 2);
        int i3 = this.f0;
        if (i3 == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i4 = this.g0;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA = this.Z.a(iMakeMeasureSpec, maxAvailableHeight);
            paddingBottom = iA + (iA > 0 ? this.Z.getPaddingBottom() + this.Z.getPaddingTop() + i : 0);
        }
        boolean z = popupWindow.getInputMethodMode() == 2;
        popupWindow.setWindowLayoutType(this.j0);
        if (popupWindow.isShowing()) {
            if (this.q0.isAttachedToWindow()) {
                int width = this.g0;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.q0.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.g0;
                    if (z) {
                        popupWindow.setWidth(i5 == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(i5 == -1 ? (byte) -1 : (byte) 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                popupWindow.setOutsideTouchable(true);
                View view = this.q0;
                int i6 = width;
                int i7 = this.h0;
                int i8 = this.i0;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                popupWindow.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.g0;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.q0.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        popupWindow.setWidth(width2);
        popupWindow.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = C0;
            if (method != null) {
                try {
                    method.invoke(popupWindow, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            wa.H(popupWindow);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.u0);
        if (this.m0) {
            popupWindow.setOverlapAnchor(this.l0);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = D0;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow, this.z0);
                } catch (Exception unused2) {
                }
            }
        } else {
            wa.G(popupWindow, this.z0);
        }
        popupWindow.showAsDropDown(this.q0, this.h0, this.i0, this.n0);
        this.Z.setSelection(-1);
        if ((!this.A0 || this.Z.isInTouchMode()) && (qw1Var = this.Z) != null) {
            qw1Var.setListSelectionHidden(true);
            qw1Var.requestLayout();
        }
        if (this.A0) {
            return;
        }
        this.x0.post(this.w0);
    }

    public final Drawable g() {
        return this.B0.getBackground();
    }

    public final void i(Drawable drawable) {
        this.B0.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.v87
    public final qw1 j() {
        return this.Z;
    }

    public final void l(int i) {
        this.i0 = i;
        this.k0 = true;
    }

    public final int o() {
        if (this.k0) {
            return this.i0;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        d81 d81Var = this.p0;
        if (d81Var == null) {
            this.p0 = new d81(this, (byte) 1);
        } else {
            ListAdapter listAdapter2 = this.Y;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(d81Var);
            }
        }
        this.Y = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.p0);
        }
        qw1 qw1Var = this.Z;
        if (qw1Var != null) {
            qw1Var.setAdapter(this.Y);
        }
    }

    public qw1 q(Context context, boolean z) {
        return new qw1(context, z);
    }

    public final void r(int i) {
        Drawable background = this.B0.getBackground();
        if (background == null) {
            this.g0 = i;
            return;
        }
        Rect rect = this.y0;
        background.getPadding(rect);
        this.g0 = rect.left + rect.right + i;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }
}
