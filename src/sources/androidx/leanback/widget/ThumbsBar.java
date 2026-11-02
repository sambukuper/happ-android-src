package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.h36;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ThumbsBar extends LinearLayout {
    public int f0;
    public final int g0;
    public final int h0;
    public final int i0;
    public final int j0;
    public int k0;
    public boolean l0;

    public ThumbsBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f0 = -1;
        new SparseArray();
        this.l0 = false;
        this.g0 = context.getResources().getDimensionPixelSize(h36.lb_playback_transport_thumbs_width);
        this.h0 = context.getResources().getDimensionPixelSize(h36.lb_playback_transport_thumbs_height);
        this.j0 = context.getResources().getDimensionPixelSize(h36.lb_playback_transport_hero_thumbs_width);
        this.i0 = context.getResources().getDimensionPixelSize(h36.lb_playback_transport_hero_thumbs_height);
        this.k0 = context.getResources().getDimensionPixelSize(h36.lb_playback_transport_thumbs_margin);
    }

    public final void a() {
        int i;
        int i2;
        while (getChildCount() > this.f0) {
            removeView(getChildAt(getChildCount() - 1));
        }
        while (true) {
            int childCount = getChildCount();
            int i3 = this.f0;
            i = this.h0;
            i2 = this.g0;
            if (childCount >= i3) {
                break;
            } else {
                addView(new ImageView(getContext()), new LinearLayout.LayoutParams(i2, i));
            }
        }
        int heroIndex = getHeroIndex();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (heroIndex == i4) {
                layoutParams.width = this.i0;
                layoutParams.height = this.j0;
            } else {
                layoutParams.width = i2;
                layoutParams.height = i;
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    public int getHeroIndex() {
        return getChildCount() / 2;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int heroIndex = getHeroIndex();
        View childAt = getChildAt(heroIndex);
        int width = (getWidth() / 2) - (childAt.getMeasuredWidth() / 2);
        int measuredWidth = (childAt.getMeasuredWidth() / 2) + (getWidth() / 2);
        childAt.layout(width, getPaddingTop(), measuredWidth, childAt.getMeasuredHeight() + getPaddingTop());
        int measuredHeight = (childAt.getMeasuredHeight() / 2) + getPaddingTop();
        for (int i5 = heroIndex - 1; i5 >= 0; i5--) {
            int i6 = width - this.k0;
            View childAt2 = getChildAt(i5);
            childAt2.layout(i6 - childAt2.getMeasuredWidth(), measuredHeight - (childAt2.getMeasuredHeight() / 2), i6, (childAt2.getMeasuredHeight() / 2) + measuredHeight);
            width = i6 - childAt2.getMeasuredWidth();
        }
        while (true) {
            heroIndex++;
            if (heroIndex >= this.f0) {
                return;
            }
            int i7 = measuredWidth + this.k0;
            View childAt3 = getChildAt(heroIndex);
            childAt3.layout(i7, measuredHeight - (childAt3.getMeasuredHeight() / 2), childAt3.getMeasuredWidth() + i7, (childAt3.getMeasuredHeight() / 2) + measuredHeight);
            measuredWidth = i7 + childAt3.getMeasuredWidth();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (this.l0) {
            return;
        }
        int i3 = measuredWidth - this.i0;
        int i4 = this.g0 + this.k0;
        int i5 = ((i3 + i4) - 1) / i4;
        if (i5 < 2) {
            i5 = 2;
        } else if ((i5 & 1) != 0) {
            i5++;
        }
        int i6 = i5 + 1;
        if (this.f0 != i6) {
            this.f0 = i6;
            a();
        }
    }

    public void setNumberOfThumbs(int i) {
        this.l0 = true;
        this.f0 = i;
        a();
    }

    public void setThumbSpace(int i) {
        this.k0 = i;
        requestLayout();
    }

    public ThumbsBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
