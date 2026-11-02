package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
class ControlBar extends LinearLayout {
    public int f0;
    public final boolean g0;

    public ControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f0 = -1;
        this.g0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (i != 33 && i != 130) {
            super.addFocusables(arrayList, i, i2);
            return;
        }
        int i3 = this.f0;
        if (i3 >= 0 && i3 < getChildCount()) {
            arrayList.add(getChildAt(this.f0));
        } else if (getChildCount() > 0) {
            arrayList.add(getChildAt(this.g0 ? getChildCount() / 2 : 0));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int childCount;
        if (getChildCount() > 0) {
            int i2 = this.f0;
            if (i2 < 0 || i2 >= getChildCount()) {
                childCount = this.g0 ? getChildCount() / 2 : 0;
            } else {
                childCount = this.f0;
            }
            if (getChildAt(childCount).requestFocus(i, rect)) {
                return true;
            }
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.f0 = indexOfChild(view);
    }
}
