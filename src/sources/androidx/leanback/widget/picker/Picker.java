package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;
import defpackage.an5;
import defpackage.cn5;
import defpackage.cw8;
import defpackage.f66;
import defpackage.h36;
import defpackage.kp5;
import defpackage.p61;
import defpackage.q46;
import defpackage.u36;
import defpackage.zm5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Picker extends FrameLayout {
    public final ViewGroup f0;
    public final ArrayList g0;
    public ArrayList h0;
    public final float i0;
    public final float j0;
    public final float k0;
    public final short l0;
    public final DecelerateInterpolator m0;
    public float n0;
    public float o0;
    public int p0;
    public final ArrayList q0;
    public int r0;
    public int s0;
    public final zm5 t0;

    public Picker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g0 = new ArrayList();
        this.n0 = 3.0f;
        this.o0 = 1.0f;
        this.p0 = 0;
        this.q0 = new ArrayList();
        this.t0 = new zm5(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f66.lbPicker, i, 0);
        cw8.m(this, context, f66.lbPicker, attributeSet, typedArrayObtainStyledAttributes, i);
        this.r0 = typedArrayObtainStyledAttributes.getResourceId(f66.lbPicker_pickerItemLayout, q46.lb_picker_item);
        this.s0 = typedArrayObtainStyledAttributes.getResourceId(f66.lbPicker_pickerItemTextViewId, 0);
        typedArrayObtainStyledAttributes.recycle();
        setEnabled(true);
        setDescendantFocusability(262144);
        this.j0 = 1.0f;
        this.i0 = 1.0f;
        this.k0 = 0.5f;
        this.l0 = (short) 200;
        this.m0 = new DecelerateInterpolator(2.5f);
        this.f0 = (ViewGroup) ((ViewGroup) LayoutInflater.from(getContext()).inflate(q46.lb_picker, (ViewGroup) this, true)).findViewById(u36.picker);
    }

    public final void a(int i, cn5 cn5Var) {
        this.h0.set(i, cn5Var);
        VerticalGridView verticalGridView = (VerticalGridView) this.g0.get(i);
        an5 an5Var = (an5) verticalGridView.getAdapter();
        if (an5Var != null) {
            an5Var.a.b();
        }
        verticalGridView.setSelectedPosition(cn5Var.a - cn5Var.b);
    }

    public final void b(int i, View view, boolean z, boolean z2) {
        boolean z3 = i == this.p0 || !hasFocus();
        DecelerateInterpolator decelerateInterpolator = this.m0;
        if (z) {
            if (z3) {
                c(view, z2, this.j0, decelerateInterpolator);
                return;
            } else {
                c(view, z2, this.i0, decelerateInterpolator);
                return;
            }
        }
        if (z3) {
            c(view, z2, this.k0, decelerateInterpolator);
        } else {
            c(view, z2, 0.0f, decelerateInterpolator);
        }
    }

    public final void c(View view, boolean z, float f, DecelerateInterpolator decelerateInterpolator) {
        view.animate().cancel();
        if (z) {
            view.animate().alpha(f).setDuration(this.l0).setInterpolator(decelerateInterpolator).start();
        } else {
            view.setAlpha(f);
        }
    }

    public final void d(int i) {
        VerticalGridView verticalGridView = (VerticalGridView) this.g0.get(i);
        int selectedPosition = verticalGridView.getSelectedPosition();
        int i2 = 0;
        while (i2 < verticalGridView.getAdapter().a()) {
            View viewD = verticalGridView.getLayoutManager().D(i2);
            if (viewD != null) {
                b(i, viewD, selectedPosition == i2, true);
            }
            i2++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isActivated()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 23 && keyCode != 66) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            performClick();
        }
        return true;
    }

    public final void e() {
        for (int i = 0; i < getColumnsCount(); i++) {
            f((VerticalGridView) this.g0.get(i));
        }
    }

    public final void f(VerticalGridView verticalGridView) {
        ViewGroup.LayoutParams layoutParams = verticalGridView.getLayoutParams();
        float activatedVisibleItemCount = isActivated() ? getActivatedVisibleItemCount() : getVisibleItemCount();
        layoutParams.height = (int) p61.e(activatedVisibleItemCount, 1.0f, verticalGridView.getVerticalSpacing(), getPickerItemHeightPixels() * activatedVisibleItemCount);
        verticalGridView.setLayoutParams(layoutParams);
    }

    public float getActivatedVisibleItemCount() {
        return this.n0;
    }

    public int getColumnsCount() {
        ArrayList arrayList = this.h0;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public int getPickerItemHeightPixels() {
        return getContext().getResources().getDimensionPixelSize(h36.picker_item_height);
    }

    public final int getPickerItemLayoutId() {
        return this.r0;
    }

    public final int getPickerItemTextViewId() {
        return this.s0;
    }

    public int getSelectedColumn() {
        return this.p0;
    }

    @Deprecated
    public final CharSequence getSeparator() {
        return (CharSequence) this.q0.get(0);
    }

    public final List<CharSequence> getSeparators() {
        return this.q0;
    }

    public float getVisibleItemCount() {
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int selectedColumn = getSelectedColumn();
        if (selectedColumn < 0) {
            return false;
        }
        ArrayList arrayList = this.g0;
        if (selectedColumn < arrayList.size()) {
            return ((VerticalGridView) arrayList.get(selectedColumn)).requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g0;
            if (i >= arrayList.size()) {
                return;
            }
            if (((VerticalGridView) arrayList.get(i)).hasFocus()) {
                setSelectedColumn(i);
            }
            i++;
        }
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        ArrayList arrayList;
        if (z == isActivated()) {
            super.setActivated(z);
            return;
        }
        super.setActivated(z);
        boolean zHasFocus = hasFocus();
        int selectedColumn = getSelectedColumn();
        setDescendantFocusability(131072);
        if (!z && zHasFocus && isFocusable()) {
            requestFocus();
        }
        int i = 0;
        while (true) {
            int columnsCount = getColumnsCount();
            arrayList = this.g0;
            if (i >= columnsCount) {
                break;
            }
            ((VerticalGridView) arrayList.get(i)).setFocusable(z);
            i++;
        }
        e();
        boolean zIsActivated = isActivated();
        for (int i2 = 0; i2 < getColumnsCount(); i2++) {
            VerticalGridView verticalGridView = (VerticalGridView) arrayList.get(i2);
            for (int i3 = 0; i3 < verticalGridView.getChildCount(); i3++) {
                verticalGridView.getChildAt(i3).setFocusable(zIsActivated);
            }
        }
        if (z && zHasFocus && selectedColumn >= 0) {
            ((VerticalGridView) arrayList.get(selectedColumn)).requestFocus();
        }
        setDescendantFocusability(262144);
    }

    public void setActivatedVisibleItemCount(float f) {
        if (f <= 0.0f) {
            kp5.e();
        } else if (this.n0 != f) {
            this.n0 = f;
            if (isActivated()) {
                e();
            }
        }
    }

    public void setColumns(List<cn5> list) {
        ArrayList arrayList = this.q0;
        if (arrayList.size() == 0) {
            throw new IllegalStateException("Separators size is: " + arrayList.size() + ". At least one separator must be provided");
        }
        if (arrayList.size() == 1) {
            CharSequence charSequence = (CharSequence) arrayList.get(0);
            arrayList.clear();
            arrayList.add(_UrlKt.FRAGMENT_ENCODE_SET);
            for (int i = 0; i < list.size() - 1; i++) {
                arrayList.add(charSequence);
            }
            arrayList.add(_UrlKt.FRAGMENT_ENCODE_SET);
        } else if (arrayList.size() != list.size() + 1) {
            throw new IllegalStateException("Separators size: " + arrayList.size() + " mustequal the size of columns: " + list.size() + " + 1");
        }
        ArrayList arrayList2 = this.g0;
        arrayList2.clear();
        ViewGroup viewGroup = this.f0;
        viewGroup.removeAllViews();
        ArrayList arrayList3 = new ArrayList(list);
        this.h0 = arrayList3;
        if (this.p0 > arrayList3.size() - 1) {
            this.p0 = this.h0.size() - 1;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int columnsCount = getColumnsCount();
        if (!TextUtils.isEmpty((CharSequence) arrayList.get(0))) {
            TextView textView = (TextView) layoutInflaterFrom.inflate(q46.lb_picker_separator, viewGroup, false);
            textView.setText((CharSequence) arrayList.get(0));
            viewGroup.addView(textView);
        }
        int i2 = 0;
        while (i2 < columnsCount) {
            VerticalGridView verticalGridView = (VerticalGridView) layoutInflaterFrom.inflate(q46.lb_picker_column, viewGroup, false);
            f(verticalGridView);
            verticalGridView.setWindowAlignment(0);
            verticalGridView.setHasFixedSize(false);
            verticalGridView.setFocusable(isActivated());
            verticalGridView.setItemViewCacheSize(0);
            arrayList2.add(verticalGridView);
            viewGroup.addView(verticalGridView);
            int i3 = i2 + 1;
            if (!TextUtils.isEmpty((CharSequence) arrayList.get(i3))) {
                TextView textView2 = (TextView) layoutInflaterFrom.inflate(q46.lb_picker_separator, viewGroup, false);
                textView2.setText((CharSequence) arrayList.get(i3));
                viewGroup.addView(textView2);
            }
            verticalGridView.setAdapter(new an5(this, getPickerItemLayoutId(), getPickerItemTextViewId(), i2));
            verticalGridView.setOnChildViewHolderSelectedListener(this.t0);
            i2 = i3;
        }
    }

    public final void setPickerItemLayoutId(int i) {
        this.r0 = i;
    }

    public final void setPickerItemTextViewId(int i) {
        this.s0 = i;
    }

    public void setSelectedColumn(int i) {
        int i2 = this.p0;
        ArrayList arrayList = this.g0;
        if (i2 != i) {
            this.p0 = i;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                d(i3);
            }
        }
        VerticalGridView verticalGridView = (VerticalGridView) arrayList.get(i);
        if (!hasFocus() || verticalGridView.hasFocus()) {
            return;
        }
        verticalGridView.requestFocus();
    }

    public final void setSeparator(CharSequence charSequence) {
        setSeparators(Arrays.asList(charSequence));
    }

    public final void setSeparators(List<CharSequence> list) {
        ArrayList arrayList = this.q0;
        arrayList.clear();
        arrayList.addAll(list);
    }

    public void setVisibleItemCount(float f) {
        if (f <= 0.0f) {
            kp5.e();
        } else if (this.o0 != f) {
            this.o0 = f;
            if (isActivated()) {
                return;
            }
            e();
        }
    }
}
