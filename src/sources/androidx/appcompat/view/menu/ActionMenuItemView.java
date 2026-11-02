package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.a38;
import defpackage.e5;
import defpackage.f5;
import defpackage.h66;
import defpackage.j5;
import defpackage.ju4;
import defpackage.mt4;
import defpackage.nt4;
import defpackage.st4;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements ju4, View.OnClickListener, j5 {
    public st4 n0;
    public CharSequence o0;
    public Drawable p0;
    public mt4 q0;
    public e5 r0;
    public f5 s0;
    public boolean t0;
    public boolean u0;
    public final int v0;
    public int w0;
    public final int x0;

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.t0 = h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h66.ActionMenuItemView, i, 0);
        this.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(h66.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.x0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.w0 = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.j5
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.j5
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.n0.getIcon() == null;
    }

    @Override // defpackage.ju4
    public final void c(st4 st4Var) {
        this.n0 = st4Var;
        setIcon(st4Var.getIcon());
        setTitle(st4Var.getTitleCondensed());
        setId(st4Var.a);
        setVisibility(st4Var.isVisible() ? 0 : 8);
        setEnabled(st4Var.isEnabled());
        if (st4Var.hasSubMenu() && this.r0 == null) {
            this.r0 = new e5(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.ju4
    public st4 getItemData() {
        return this.n0;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void i() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.o0);
        if (this.p0 != null && ((this.n0.y & 4) != 4 || (!this.t0 && !this.u0))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.o0 : null);
        CharSequence charSequence = this.n0.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.n0.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.n0.r;
        if (TextUtils.isEmpty(charSequence2)) {
            a38.f(this, z3 ? null : this.n0.e);
        } else {
            a38.f(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mt4 mt4Var = this.q0;
        if (mt4Var != null) {
            mt4Var.a(this.n0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.t0 = h();
        i();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.w0) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.v0;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.p0 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.p0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e5 e5Var;
        if (this.n0.hasSubMenu() && (e5Var = this.r0) != null && e5Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.u0 != z) {
            this.u0 = z;
            st4 st4Var = this.n0;
            if (st4Var != null) {
                nt4 nt4Var = st4Var.n;
                nt4Var.k = true;
                nt4Var.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.p0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.x0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public void setItemInvoker(mt4 mt4Var) {
        this.q0 = mt4Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.w0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(f5 f5Var) {
        this.s0 = f5Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.o0 = charSequence;
        i();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
