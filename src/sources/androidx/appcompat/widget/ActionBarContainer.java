package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.d46;
import defpackage.h66;
import defpackage.x4;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean f0;
    public View g0;
    public View h0;
    public Drawable i0;
    public Drawable j0;
    public Drawable k0;
    public final boolean l0;
    public boolean m0;
    public final int n0;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        setBackground(new x4(this, (byte) 0));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h66.ActionBar);
        this.i0 = typedArrayObtainStyledAttributes.getDrawable(h66.ActionBar_background);
        this.j0 = typedArrayObtainStyledAttributes.getDrawable(h66.ActionBar_backgroundStacked);
        this.n0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(h66.ActionBar_height, -1);
        if (getId() == d46.split_action_bar) {
            this.l0 = true;
            this.k0 = typedArrayObtainStyledAttributes.getDrawable(h66.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.l0 ? !(this.i0 != null || this.j0 != null) : this.k0 == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.i0;
        if (drawable != null && drawable.isStateful()) {
            this.i0.setState(getDrawableState());
        }
        Drawable drawable2 = this.j0;
        if (drawable2 != null && drawable2.isStateful()) {
            this.j0.setState(getDrawableState());
        }
        Drawable drawable3 = this.k0;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.k0.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.i0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.j0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.k0;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g0 = findViewById(d46.action_bar);
        this.h0 = findViewById(d46.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f0 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.l0) {
            Drawable drawable = this.k0;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.i0 == null) {
                z2 = false;
            } else if (this.g0.getVisibility() == 0 || ((view = this.h0) != null && view.getVisibility() == 0)) {
                this.i0.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                this.i0.setBounds(0, 0, 0, 0);
            }
            this.m0 = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.g0 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.n0) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.g0 == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.i0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.i0);
        }
        this.i0 = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.g0 != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.l0 ? !(this.i0 != null || this.j0 != null) : this.k0 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.k0;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.k0);
        }
        this.k0 = drawable;
        boolean z = this.l0;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.k0) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.i0 != null || this.j0 != null) : this.k0 == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.j0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.j0);
        }
        this.j0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.m0 && this.j0 != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.l0 ? !(this.i0 != null || this.j0 != null) : this.k0 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.f0 = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.i0;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.j0;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.k0;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.i0;
        boolean z = this.l0;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.j0 && this.m0) {
            return true;
        }
        return (drawable == this.k0 && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(c cVar) {
    }
}
