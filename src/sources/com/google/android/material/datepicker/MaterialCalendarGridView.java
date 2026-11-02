package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.a77;
import defpackage.by4;
import defpackage.c46;
import defpackage.cw8;
import defpackage.dr4;
import defpackage.hw1;
import defpackage.kp5;
import defpackage.lr;
import defpackage.q02;
import defpackage.tr8;
import defpackage.u26;
import defpackage.u70;
import defpackage.wq4;
import defpackage.yr2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean f0;
    public q02 g0;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        tr8.c(null);
        if (dr4.a0(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(c46.cancel_button);
            setNextFocusRightId(c46.confirm_button);
        }
        this.f0 = dr4.a0(getContext(), u26.nestedScrollable);
        cw8.n(this, new hw1((byte) 3));
    }

    public static void a(MaterialCalendarGridView materialCalendarGridView) {
        by4 by4Var = (by4) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.r0;
        if (u70.f0(context.getTheme(), u26.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            lr lrVar = by4Var.Y;
            if (lrVar != null) {
                focusRingDrawable.q0.t = (a77) ((yr2) lrVar.Y).Y;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    public final by4 b() {
        return (by4) super.getAdapter();
    }

    public final boolean c(int i, boolean z) {
        q02 q02Var;
        q02 q02Var2;
        int iA = z ? ((by4) super.getAdapter()).a(i) : ((by4) super.getAdapter()).b(i);
        if (iA != -1) {
            setSelection(iA);
            return true;
        }
        if (!z && (q02Var2 = this.g0) != null) {
            return ((wq4) q02Var2.Y).S(false);
        }
        if (!z || (q02Var = this.g0) == null) {
            return true;
        }
        return ((wq4) q02Var.Y).S(true);
    }

    public final boolean d(int i) {
        by4 by4Var = (by4) super.getAdapter();
        if (!by4Var.e(i)) {
            long itemId = by4Var.getItemId(i);
            int i2 = 1;
            while (true) {
                if (i2 >= by4Var.X.f0) {
                    i = -1;
                    break;
                }
                int i3 = i + i2;
                if ((i3 < by4.g0 && by4Var.getItemId(i3) == itemId && by4Var.e(i3)) || ((i3 = i - i2) >= 0 && by4Var.getItemId(i3) == itemId && by4Var.e(i3))) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        if (i == -1) {
            return false;
        }
        setSelection(i);
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (by4) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((by4) super.getAdapter()).notifyDataSetChanged();
        post(new Runnable() { // from class: com.google.android.material.datepicker.a
            @Override // java.lang.Runnable
            public final void run() {
                MaterialCalendarGridView.a(this.X);
            }
        });
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        by4 by4Var = (by4) super.getAdapter();
        by4Var.getClass();
        int iMax = Math.max(by4Var.c(), getFirstVisiblePosition());
        int iMin = Math.min(by4Var.f(), getLastVisiblePosition());
        by4Var.getItem(iMax);
        by4Var.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int iB;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33 || i == 1) {
            by4 by4Var = (by4) super.getAdapter();
            iB = by4Var.b(by4Var.f() + 1);
        } else if (i == 130 || i == 2) {
            by4 by4Var2 = (by4) super.getAdapter();
            iB = by4Var2.a(by4Var2.c() - 1);
        } else {
            iB = -1;
        }
        if (iB != -1) {
            setSelection(iB);
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z = getLayoutDirection() == 1;
        if (i == 21) {
            return c(selectedItemPosition, z);
        }
        if (i == 22) {
            return c(selectedItemPosition, !z);
        }
        if (i == 61) {
            int iB = keyEvent.isShiftPressed() ? ((by4) super.getAdapter()).b(selectedItemPosition) : ((by4) super.getAdapter()).a(selectedItemPosition);
            if (iB == -1) {
                return false;
            }
            setSelection(iB);
            return true;
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        by4 by4Var = (by4) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || by4Var.e(selectedItemPosition2)) {
            return true;
        }
        by4 by4Var2 = (by4) super.getAdapter();
        if (!d(selectedItemPosition2)) {
            if (19 != i) {
                if (i == 20) {
                    int numColumns = getNumColumns();
                    while (true) {
                        numColumns += selectedItemPosition2;
                        if (numColumns > by4Var2.f()) {
                            break;
                        }
                        if (!d(numColumns)) {
                            selectedItemPosition2 = getNumColumns();
                        }
                    }
                }
                return false;
            }
            int numColumns2 = getNumColumns();
            while (true) {
                selectedItemPosition2 -= numColumns2;
                if (selectedItemPosition2 < by4Var2.c()) {
                    return false;
                }
                if (d(selectedItemPosition2)) {
                    break;
                }
                numColumns2 = getNumColumns();
            }
        }
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f0) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof by4) {
            super.setAdapter(listAdapter);
        } else {
            kp5.n("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), by4.class.getCanonicalName()});
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        by4 by4Var = (by4) super.getAdapter();
        super.setSelection(Math.max(i, by4Var.a(by4Var.c() - 1)));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (by4) super.getAdapter();
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
