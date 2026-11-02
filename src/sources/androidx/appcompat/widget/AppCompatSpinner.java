package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import defpackage.d7;
import defpackage.d98;
import defpackage.fq;
import defpackage.gq;
import defpackage.h66;
import defpackage.hq;
import defpackage.iq;
import defpackage.lq;
import defpackage.mq;
import defpackage.n51;
import defpackage.nq;
import defpackage.u46;
import defpackage.u70;
import defpackage.w26;
import defpackage.zv7;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {
    public static final int[] n0 = {R.attr.spinnerMode};
    public final d7 f0;
    public final Context g0;
    public final fq h0;
    public SpinnerAdapter i0;
    public final boolean j0;
    public final nq k0;
    public int l0;
    public final Rect m0;

    /* JADX WARN: Code duplicated, block: B:25:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc  */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i);
        this.m0 = new Rect();
        d98.a(this, getContext());
        zv7 zv7VarR = zv7.r(i, 0, context, attributeSet, h66.Spinner);
        TypedArray typedArray = (TypedArray) zv7VarR.Y;
        this.f0 = new d7(this);
        int resourceId = typedArray.getResourceId(h66.Spinner_popupTheme, 0);
        if (resourceId != 0) {
            this.g0 = new n51(context, resourceId);
        } else {
            this.g0 = context;
        }
        int i2 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n0, i, 0);
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
                }
            } catch (Exception unused) {
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i2 != 0) {
                    hq hqVar = new hq(this);
                    this.k0 = hqVar;
                    hqVar.Z = typedArray.getString(h66.Spinner_android_prompt);
                } else if (i2 == 1) {
                    lq lqVar = new lq(this, this.g0, attributeSet, i);
                    zv7 zv7VarR2 = zv7.r(i, 0, this.g0, attributeSet, h66.Spinner);
                    this.l0 = ((TypedArray) zv7VarR2.Y).getLayoutDimension(h66.Spinner_android_dropDownWidth, -2);
                    lqVar.i(zv7VarR2.e(h66.Spinner_android_popupBackground));
                    lqVar.E0 = typedArray.getString(h66.Spinner_android_prompt);
                    zv7VarR2.v();
                    this.k0 = lqVar;
                    this.h0 = new fq(this, this, lqVar);
                }
                textArray = typedArray.getTextArray(h66.Spinner_android_entries);
                if (textArray != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                    arrayAdapter.setDropDownViewResource(u46.support_simple_spinner_dropdown_item);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                zv7VarR.v();
                this.j0 = true;
                spinnerAdapter = this.i0;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.i0 = null;
                }
                this.f0.z(attributeSet, i);
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception unused2) {
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i2 != 0) {
            hq hqVar2 = new hq(this);
            this.k0 = hqVar2;
            hqVar2.Z = typedArray.getString(h66.Spinner_android_prompt);
        } else if (i2 == 1) {
            lq lqVar2 = new lq(this, this.g0, attributeSet, i);
            zv7 zv7VarR3 = zv7.r(i, 0, this.g0, attributeSet, h66.Spinner);
            this.l0 = ((TypedArray) zv7VarR3.Y).getLayoutDimension(h66.Spinner_android_dropDownWidth, -2);
            lqVar2.i(zv7VarR3.e(h66.Spinner_android_popupBackground));
            lqVar2.E0 = typedArray.getString(h66.Spinner_android_prompt);
            zv7VarR3.v();
            this.k0 = lqVar2;
            this.h0 = new fq(this, this, lqVar2);
        }
        textArray = typedArray.getTextArray(h66.Spinner_android_entries);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(u46.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        zv7VarR.v();
        this.j0 = true;
        spinnerAdapter = this.i0;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.i0 = null;
        }
        this.f0.z(attributeSet, i);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.m0;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d7 d7Var = this.f0;
        if (d7Var != null) {
            d7Var.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        nq nqVar = this.k0;
        return nqVar != null ? nqVar.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        nq nqVar = this.k0;
        return nqVar != null ? nqVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.k0 != null ? this.l0 : super.getDropDownWidth();
    }

    public final nq getInternalPopup() {
        return this.k0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        nq nqVar = this.k0;
        return nqVar != null ? nqVar.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.g0;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        nq nqVar = this.k0;
        return nqVar != null ? nqVar.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        d7 d7Var = this.f0;
        if (d7Var != null) {
            return d7Var.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d7 d7Var = this.f0;
        if (d7Var != null) {
            return d7Var.w();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nq nqVar = this.k0;
        if (nqVar == null || !nqVar.a()) {
            return;
        }
        nqVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.k0 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        mq mqVar = (mq) parcelable;
        super.onRestoreInstanceState(mqVar.getSuperState());
        if (!mqVar.X || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new gq(this, (byte) 0));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        mq mqVar = new mq(super.onSaveInstanceState());
        nq nqVar = this.k0;
        mqVar.X = nqVar != null && nqVar.a();
        return mqVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fq fqVar = this.h0;
        if (fqVar == null || !fqVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        nq nqVar = this.k0;
        if (nqVar == null) {
            return super.performClick();
        }
        if (nqVar.a()) {
            return true;
        }
        nqVar.n(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.j0) {
            this.i0 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        nq nqVar = this.k0;
        if (nqVar != null) {
            Context context = this.g0;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            iq iqVar = new iq();
            iqVar.X = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                iqVar.Y = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (!Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
            nqVar.p(iqVar);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d7 d7Var = this.f0;
        if (d7Var != null) {
            d7Var.B();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        d7 d7Var = this.f0;
        if (d7Var != null) {
            d7Var.C(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        nq nqVar = this.k0;
        if (nqVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            nqVar.m(i);
            nqVar.d(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        nq nqVar = this.k0;
        if (nqVar != null) {
            nqVar.l(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.k0 != null) {
            this.l0 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        nq nqVar = this.k0;
        if (nqVar != null) {
            nqVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(u70.O(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        nq nqVar = this.k0;
        if (nqVar != null) {
            nqVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d7 d7Var = this.f0;
        if (d7Var != null) {
            d7Var.M(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d7 d7Var = this.f0;
        if (d7Var != null) {
            d7Var.N(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w26.spinnerStyle);
    }
}
