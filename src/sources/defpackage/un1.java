package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AbstractComposeView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class un1 extends AbstractComposeView implements no1, p95 {
    public final Window p0;
    public final rh5 q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;

    public un1(Context context, Window window) {
        super(context);
        this.p0 = window;
        this.q0 = z51.H(z68.a);
        WeakHashMap weakHashMap = cw8.a;
        uv8.c(this, this);
        c19.a(this, new tn1(this));
    }

    @Override // defpackage.p95
    public final w19 C(View view, w19 w19Var) {
        if (!this.s0) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return w19Var.a.q(iMax, iMax2, iMax3, iMax4);
            }
        }
        return w19Var;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(int i, lp2 lp2Var) {
        lp2Var.X(1735448596);
        int i2 = (lp2Var.h(this) ? 4 : 2) | i;
        if (lp2Var.N(i2 & 1, (i2 & 3) != 2)) {
            ((rn2) this.q0.getValue()).K(lp2Var, 0);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new b1(this, i, (byte) 7);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void g(int i, boolean z, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.u0;
    }

    @Override // defpackage.no1
    public final Window getWindow() {
        return this.p0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void h(int i, int i2) {
        int iA;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.h(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.p0;
        if (mode != Integer.MIN_VALUE || this.r0 || window.getAttributes().height != -2) {
            iA = size2;
        } else if (this.s0) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                iA = cn.a.a(window);
            } else if (i3 < 32) {
                iA = hn.a.a(window);
            } else {
                iA = size2;
            }
        } else {
            iA = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iA - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.s0 || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.r0) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
