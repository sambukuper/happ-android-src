package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.l;
import defpackage.bt;
import defpackage.c98;
import defpackage.ie2;
import defpackage.j36;
import defpackage.o56;
import defpackage.u26;
import defpackage.v56;
import defpackage.ys0;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialDividerItemDecoration extends g {
    public static final int i = o56.Widget_MaterialComponents_MaterialDivider;
    public ShapeDrawable a;
    public int b;
    public int c;
    public final int d;
    public final int e;
    public final int f;
    public boolean g;
    public final Rect h;

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i2) {
        int i3 = u26.materialDividerStyle;
        this.h = new Rect();
        TypedArray typedArrayD = c98.d(context, attributeSet, v56.MaterialDivider, i3, i, new int[0]);
        this.c = ys0.x(context, typedArrayD, v56.MaterialDivider_dividerColor).getDefaultColor();
        this.b = typedArrayD.getDimensionPixelSize(v56.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(j36.material_divider_thickness));
        this.e = typedArrayD.getDimensionPixelOffset(v56.MaterialDivider_dividerInsetStart, 0);
        this.f = typedArrayD.getDimensionPixelOffset(v56.MaterialDivider_dividerInsetEnd, 0);
        this.g = typedArrayD.getBoolean(v56.MaterialDivider_lastItemDecorated, true);
        typedArrayD.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        int i4 = this.c;
        this.c = i4;
        this.a = shapeDrawable;
        shapeDrawable.setTint(i4);
        if (i2 == 0 || i2 == 1) {
            this.d = i2;
        } else {
            bt.q(ie2.h("Invalid orientation: ", i2, ". It should be either HORIZONTAL or VERTICAL"));
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final void f(Rect rect, View view, RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
        if (i(recyclerView, view)) {
            if (this.d == 1) {
                rect.bottom = this.b;
                return;
            }
            int layoutDirection = recyclerView.getLayoutDirection();
            int i2 = this.b;
            if (layoutDirection == 1) {
                rect.left = i2;
            } else {
                rect.right = i2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        boolean z;
        int i2;
        int i3;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        int i4 = 0;
        int i5 = this.f;
        int i6 = this.e;
        int i7 = this.d;
        Rect rect = this.h;
        if (i7 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            z = recyclerView.getLayoutDirection() == 1;
            int i8 = paddingLeft + (z ? i5 : i6);
            if (z) {
                i5 = i6;
            }
            int i9 = width - i5;
            int childCount = recyclerView.getChildCount();
            while (i4 < childCount) {
                View childAt = recyclerView.getChildAt(i4);
                if (i(recyclerView, childAt)) {
                    recyclerView.getLayoutManager().M(childAt, rect);
                    int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                    this.a.setBounds(i8, iRound - this.b, i9, iRound);
                    this.a.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                    this.a.draw(canvas);
                }
                i4++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int i10 = paddingTop + i6;
        int i11 = height - i5;
        z = recyclerView.getLayoutDirection() == 1;
        int childCount2 = recyclerView.getChildCount();
        while (i4 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i4);
            if (i(recyclerView, childAt2)) {
                recyclerView.getLayoutManager().M(childAt2, rect);
                int iRound2 = Math.round(childAt2.getTranslationX());
                if (z) {
                    i3 = rect.left + iRound2;
                    i2 = this.b + i3;
                } else {
                    i2 = iRound2 + rect.right;
                    i3 = i2 - this.b;
                }
                this.a.setBounds(i3, i10, i2, i11);
                this.a.setAlpha(Math.round(childAt2.getAlpha() * 255.0f));
                this.a.draw(canvas);
            }
            i4++;
        }
        canvas.restore();
    }

    public final boolean i(RecyclerView recyclerView, View view) {
        l lVarN = RecyclerView.N(view);
        int iB = lVarN != null ? lVarN.b() : -1;
        f adapter = recyclerView.getAdapter();
        return iB != -1 && (!(adapter != null && iB == adapter.a() - 1) || this.g);
    }
}
