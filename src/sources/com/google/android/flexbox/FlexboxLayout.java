package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.b8;
import defpackage.bt;
import defpackage.cw8;
import defpackage.om0;
import defpackage.pc6;
import defpackage.td2;
import defpackage.u56;
import defpackage.ud2;
import defpackage.vd2;
import defpackage.wd2;
import defpackage.y5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import okhttp3.internal.http2.Http2Connection;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements td2 {
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public Drawable l0;
    public Drawable m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int[] r0;
    public SparseIntArray s0;
    public final y5 t0;
    public List u0;
    public final b8 v0;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements ud2 {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();
        public int X;
        public float Y;
        public float Z;
        public int f0;
        public float g0;
        public int h0;
        public int i0;
        public int j0;
        public int k0;
        public boolean l0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.X = 1;
            this.Y = 0.0f;
            this.Z = 1.0f;
            this.f0 = -1;
            this.g0 = -1.0f;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 16777215;
            this.k0 = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u56.FlexboxLayout_Layout);
            this.X = typedArrayObtainStyledAttributes.getInt(u56.FlexboxLayout_Layout_layout_order, 1);
            this.Y = typedArrayObtainStyledAttributes.getFloat(u56.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.Z = typedArrayObtainStyledAttributes.getFloat(u56.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.f0 = typedArrayObtainStyledAttributes.getInt(u56.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.g0 = typedArrayObtainStyledAttributes.getFraction(u56.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(u56.FlexboxLayout_Layout_layout_minWidth, -1);
            this.i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(u56.FlexboxLayout_Layout_layout_minHeight, -1);
            this.j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(u56.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.k0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(u56.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.l0 = typedArrayObtainStyledAttributes.getBoolean(u56.FlexboxLayout_Layout_layout_wrapBefore, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // defpackage.ud2
        public final int A() {
            return this.j0;
        }

        @Override // defpackage.ud2
        public final int a() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // defpackage.ud2
        public final int b() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // defpackage.ud2
        public final int f() {
            return this.f0;
        }

        @Override // defpackage.ud2
        public final int getOrder() {
            return this.X;
        }

        @Override // defpackage.ud2
        public final float h() {
            return this.Z;
        }

        @Override // defpackage.ud2
        public final int i() {
            return this.h0;
        }

        @Override // defpackage.ud2
        public final void j(int i) {
            this.h0 = i;
        }

        @Override // defpackage.ud2
        public final int n() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // defpackage.ud2
        public final int o() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // defpackage.ud2
        public final int q() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // defpackage.ud2
        public final void r(int i) {
            this.i0 = i;
        }

        @Override // defpackage.ud2
        public final float s() {
            return this.Y;
        }

        @Override // defpackage.ud2
        public final float t() {
            return this.g0;
        }

        @Override // defpackage.ud2
        public final int v() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // defpackage.ud2
        public final int w() {
            return this.i0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.X);
            parcel.writeFloat(this.Y);
            parcel.writeFloat(this.Z);
            parcel.writeInt(this.f0);
            parcel.writeFloat(this.g0);
            parcel.writeInt(this.h0);
            parcel.writeInt(this.i0);
            parcel.writeInt(this.j0);
            parcel.writeInt(this.k0);
            parcel.writeByte(this.l0 ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // defpackage.ud2
        public final boolean x() {
            return this.l0;
        }

        @Override // defpackage.ud2
        public final int z() {
            return this.k0;
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k0 = -1;
        this.t0 = new y5(this);
        this.u0 = new ArrayList();
        this.v0 = new b8((byte) 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u56.FlexboxLayout, i, 0);
        this.f0 = typedArrayObtainStyledAttributes.getInt(u56.FlexboxLayout_flexDirection, 0);
        this.g0 = typedArrayObtainStyledAttributes.getInt(u56.FlexboxLayout_flexWrap, 0);
        this.h0 = typedArrayObtainStyledAttributes.getInt(u56.FlexboxLayout_justifyContent, 0);
        this.i0 = typedArrayObtainStyledAttributes.getInt(u56.FlexboxLayout_alignItems, 0);
        this.j0 = typedArrayObtainStyledAttributes.getInt(u56.FlexboxLayout_alignContent, 0);
        this.k0 = typedArrayObtainStyledAttributes.getInt(u56.FlexboxLayout_maxLine, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(u56.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(u56.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(u56.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(u56.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.o0 = i2;
            this.n0 = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(u56.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.o0 = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(u56.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.n0 = i4;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.u0.size();
        for (int i = 0; i < size; i++) {
            vd2 vd2Var = (vd2) this.u0.get(i);
            for (int i2 = 0; i2 < vd2Var.h; i2++) {
                int i3 = vd2Var.o + i2;
                View viewO = o(i3);
                if (viewO != null && viewO.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                    if (p(i3, i2)) {
                        n(canvas, z ? viewO.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewO.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.q0, vd2Var.b, vd2Var.g);
                    }
                    if (i2 == vd2Var.h - 1 && (this.o0 & 4) > 0) {
                        n(canvas, z ? (viewO.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.q0 : viewO.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, vd2Var.b, vd2Var.g);
                    }
                }
            }
            if (q(i)) {
                m(canvas, paddingLeft, z2 ? vd2Var.d : vd2Var.b - this.p0, iMax);
            }
            if (r(i) && (this.n0 & 4) > 0) {
                m(canvas, paddingLeft, z2 ? vd2Var.b - this.p0 : vd2Var.d, iMax);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        SparseIntArray sparseIntArray = this.s0;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.s0 = sparseIntArray;
        }
        y5 y5Var = this.t0;
        td2 td2Var = (td2) y5Var.Y;
        int flexItemCount = td2Var.getFlexItemCount();
        ArrayList arrayListC = y5Var.C(flexItemCount);
        wd2 wd2Var = new wd2();
        if (view == null || !(layoutParams instanceof ud2)) {
            wd2Var.Y = 1;
        } else {
            wd2Var.Y = ((ud2) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= td2Var.getFlexItemCount()) {
            wd2Var.X = flexItemCount;
        } else {
            wd2Var.X = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((wd2) arrayListC.get(i2)).X++;
            }
        }
        arrayListC.add(wd2Var);
        this.r0 = y5.c0(flexItemCount + 1, arrayListC, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // defpackage.td2
    public final View b(int i) {
        return o(i);
    }

    @Override // defpackage.td2
    public final int c(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // defpackage.td2
    public final void d(View view, int i, int i2, vd2 vd2Var) {
        if (p(i, i2)) {
            boolean zJ = j();
            int i3 = vd2Var.e;
            if (zJ) {
                int i4 = this.q0;
                vd2Var.e = i3 + i4;
                vd2Var.f += i4;
            } else {
                int i5 = this.p0;
                vd2Var.e = i3 + i5;
                vd2Var.f += i5;
            }
        }
    }

    @Override // defpackage.td2
    public final View e(int i) {
        return getChildAt(i);
    }

    @Override // defpackage.td2
    public final int f(View view, int i, int i2) {
        int i3;
        int i4;
        if (j()) {
            i3 = p(i, i2) ? this.q0 : 0;
            if ((this.o0 & 4) <= 0) {
                return i3;
            }
            i4 = this.q0;
        } else {
            i3 = p(i, i2) ? this.p0 : 0;
            if ((this.n0 & 4) <= 0) {
                return i3;
            }
            i4 = this.p0;
        }
        return i3 + i4;
    }

    @Override // defpackage.td2
    public final int g(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.X = 1;
            layoutParams3.Y = 0.0f;
            layoutParams3.Z = 1.0f;
            layoutParams3.f0 = -1;
            layoutParams3.g0 = -1.0f;
            layoutParams3.h0 = -1;
            layoutParams3.i0 = -1;
            layoutParams3.j0 = 16777215;
            layoutParams3.k0 = 16777215;
            layoutParams3.X = layoutParams2.X;
            layoutParams3.Y = layoutParams2.Y;
            layoutParams3.Z = layoutParams2.Z;
            layoutParams3.f0 = layoutParams2.f0;
            layoutParams3.g0 = layoutParams2.g0;
            layoutParams3.h0 = layoutParams2.h0;
            layoutParams3.i0 = layoutParams2.i0;
            layoutParams3.j0 = layoutParams2.j0;
            layoutParams3.k0 = layoutParams2.k0;
            layoutParams3.l0 = layoutParams2.l0;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.X = 1;
            layoutParams4.Y = 0.0f;
            layoutParams4.Z = 1.0f;
            layoutParams4.f0 = -1;
            layoutParams4.g0 = -1.0f;
            layoutParams4.h0 = -1;
            layoutParams4.i0 = -1;
            layoutParams4.j0 = 16777215;
            layoutParams4.k0 = 16777215;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.X = 1;
        layoutParams5.Y = 0.0f;
        layoutParams5.Z = 1.0f;
        layoutParams5.f0 = -1;
        layoutParams5.g0 = -1.0f;
        layoutParams5.h0 = -1;
        layoutParams5.i0 = -1;
        layoutParams5.j0 = 16777215;
        layoutParams5.k0 = 16777215;
        return layoutParams5;
    }

    @Override // defpackage.td2
    public int getAlignContent() {
        return this.j0;
    }

    @Override // defpackage.td2
    public int getAlignItems() {
        return this.i0;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.l0;
    }

    public Drawable getDividerDrawableVertical() {
        return this.m0;
    }

    @Override // defpackage.td2
    public int getFlexDirection() {
        return this.f0;
    }

    @Override // defpackage.td2
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<vd2> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.u0.size());
        for (vd2 vd2Var : this.u0) {
            if (vd2Var.a() != 0) {
                arrayList.add(vd2Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.td2
    public List<vd2> getFlexLinesInternal() {
        return this.u0;
    }

    @Override // defpackage.td2
    public int getFlexWrap() {
        return this.g0;
    }

    public int getJustifyContent() {
        return this.h0;
    }

    @Override // defpackage.td2
    public int getLargestMainSize() {
        Iterator it = this.u0.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((vd2) it.next()).e);
        }
        return iMax;
    }

    @Override // defpackage.td2
    public int getMaxLine() {
        return this.k0;
    }

    public int getShowDividerHorizontal() {
        return this.n0;
    }

    public int getShowDividerVertical() {
        return this.o0;
    }

    @Override // defpackage.td2
    public int getSumOfCrossSize() {
        int size = this.u0.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            vd2 vd2Var = (vd2) this.u0.get(i2);
            if (q(i2)) {
                i += j() ? this.p0 : this.q0;
            }
            if (r(i2)) {
                i += j() ? this.p0 : this.q0;
            }
            i += vd2Var.g;
        }
        return i;
    }

    @Override // defpackage.td2
    public final void h(vd2 vd2Var) {
        if (j()) {
            if ((this.o0 & 4) > 0) {
                int i = vd2Var.e;
                int i2 = this.q0;
                vd2Var.e = i + i2;
                vd2Var.f += i2;
                return;
            }
            return;
        }
        if ((this.n0 & 4) > 0) {
            int i3 = vd2Var.e;
            int i4 = this.p0;
            vd2Var.e = i3 + i4;
            vd2Var.f += i4;
        }
    }

    @Override // defpackage.td2
    public final boolean j() {
        int i = this.f0;
        return i == 0 || i == 1;
    }

    @Override // defpackage.td2
    public final int k(View view) {
        return 0;
    }

    public final void l(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.u0.size();
        for (int i = 0; i < size; i++) {
            vd2 vd2Var = (vd2) this.u0.get(i);
            for (int i2 = 0; i2 < vd2Var.h; i2++) {
                int i3 = vd2Var.o + i2;
                View viewO = o(i3);
                if (viewO != null && viewO.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                    if (p(i3, i2)) {
                        m(canvas, vd2Var.a, z2 ? viewO.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewO.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.p0, vd2Var.g);
                    }
                    if (i2 == vd2Var.h - 1 && (this.n0 & 4) > 0) {
                        m(canvas, vd2Var.a, z2 ? (viewO.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.p0 : viewO.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, vd2Var.g);
                    }
                }
            }
            if (q(i)) {
                n(canvas, z ? vd2Var.c : vd2Var.a - this.q0, paddingTop, iMax);
            }
            if (r(i) && (this.o0 & 4) > 0) {
                n(canvas, z ? vd2Var.a - this.q0 : vd2Var.c, paddingTop, iMax);
            }
        }
    }

    public final void m(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.l0;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.p0 + i2);
        this.l0.draw(canvas);
    }

    public final void n(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.m0;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.q0 + i, i3 + i2);
        this.m0.draw(canvas);
    }

    public final View o(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.r0;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.m0 == null && this.l0 == null) {
            return;
        }
        if (this.n0 == 0 && this.o0 == 0) {
            return;
        }
        WeakHashMap weakHashMap = cw8.a;
        int layoutDirection = getLayoutDirection();
        int i = this.f0;
        if (i == 0) {
            a(canvas, layoutDirection == 1, this.g0 == 2);
            return;
        }
        if (i == 1) {
            a(canvas, layoutDirection != 1, this.g0 == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.g0 == 2) {
                z = !z;
            }
            l(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = layoutDirection == 1;
        if (this.g0 == 2) {
            z2 = !z2;
        }
        l(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        WeakHashMap weakHashMap = cw8.a;
        int layoutDirection = getLayoutDirection();
        int i5 = this.f0;
        if (i5 == 0) {
            s(i, layoutDirection == 1, i2, i3, i4);
            return;
        }
        if (i5 == 1) {
            s(i, layoutDirection != 1, i2, i3, i4);
            return;
        }
        if (i5 == 2) {
            z2 = layoutDirection == 1;
            if (this.g0 == 2) {
                z2 = !z2;
            }
            t(z2, false, i, i2, i3, i4);
            return;
        }
        if (i5 != 3) {
            om0.e(this.f0, "Invalid flex direction is set: ");
            return;
        }
        z2 = layoutDirection == 1;
        if (this.g0 == 2) {
            z2 = !z2;
        }
        t(z2, true, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        SparseIntArray sparseIntArray = this.s0;
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray(getChildCount());
            this.s0 = sparseIntArray;
        }
        y5 y5Var = this.t0;
        td2 td2Var = (td2) y5Var.Y;
        int flexItemCount = td2Var.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            SparseIntArray sparseIntArray2 = this.s0;
            int flexItemCount2 = ((td2) y5Var.Y).getFlexItemCount();
            this.r0 = y5.c0(flexItemCount2, y5Var.C(flexItemCount2), sparseIntArray2);
            break;
        }
        for (int i3 = 0; i3 < flexItemCount; i3++) {
            View viewE = td2Var.e(i3);
            if (viewE != null && ((ud2) viewE.getLayoutParams()).getOrder() != sparseIntArray.get(i3)) {
                SparseIntArray sparseIntArray3 = this.s0;
                int flexItemCount3 = ((td2) y5Var.Y).getFlexItemCount();
                this.r0 = y5.c0(flexItemCount3, y5Var.C(flexItemCount3), sparseIntArray3);
                break;
            }
        }
        int i4 = this.f0;
        b8 b8Var = this.v0;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                om0.e(this.f0, "Invalid value for the flex direction is set: ");
                return;
            }
            this.u0.clear();
            b8Var.c = null;
            b8Var.b = 0;
            this.t0.v(this.v0, i2, i, Integer.MAX_VALUE, 0, -1, null);
            this.u0 = (List) b8Var.c;
            y5Var.E(i, i2, 0);
            y5Var.D(i, i2, getPaddingRight() + getPaddingLeft());
            y5Var.f0(0);
            u(this.f0, i, i2, b8Var.b);
            return;
        }
        this.u0.clear();
        b8Var.c = null;
        b8Var.b = 0;
        this.t0.v(this.v0, i, i2, Integer.MAX_VALUE, 0, -1, null);
        this.u0 = (List) b8Var.c;
        y5Var.E(i, i2, 0);
        if (this.i0 == 3) {
            for (vd2 vd2Var : this.u0) {
                int iMax = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < vd2Var.h; i5++) {
                    View viewO = o(vd2Var.o + i5);
                    if (viewO != null && viewO.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                        int i6 = this.g0;
                        int i7 = vd2Var.l;
                        iMax = i6 != 2 ? Math.max(iMax, viewO.getMeasuredHeight() + Math.max(i7 - viewO.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewO.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(viewO.getBaseline() + (i7 - viewO.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                vd2Var.g = iMax;
            }
        }
        y5Var.D(i, i2, getPaddingBottom() + getPaddingTop());
        y5Var.f0(0);
        u(this.f0, i, i2, b8Var.b);
    }

    public final boolean p(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewO = o(i - i3);
            if (viewO != null && viewO.getVisibility() != 8) {
                if (j()) {
                    return (this.o0 & 2) != 0;
                }
                return (this.n0 & 2) != 0;
            }
        }
        if (j()) {
            return (this.o0 & 1) != 0;
        }
        return (this.n0 & 1) != 0;
    }

    public final boolean q(int i) {
        if (i >= 0 && i < this.u0.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (((vd2) this.u0.get(i2)).a() > 0) {
                    if (j()) {
                        return (this.n0 & 2) != 0;
                    }
                    return (this.o0 & 2) != 0;
                }
            }
            if (j()) {
                return (this.n0 & 1) != 0;
            }
            if ((this.o0 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean r(int i) {
        if (i >= 0 && i < this.u0.size()) {
            for (int i2 = i + 1; i2 < this.u0.size(); i2++) {
                if (((vd2) this.u0.get(i2)).a() > 0) {
                    return false;
                }
            }
            if (j()) {
                return (this.n0 & 4) != 0;
            }
            if ((this.o0 & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0122  */
    /* JADX WARN: Code duplicated, block: B:64:0x0147  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x0191  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x01df  */
    public final void s(int i, boolean z, int i2, int i3, int i4) {
        float measuredWidth;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        View viewO;
        boolean z2;
        int i7;
        int i8;
        float f3;
        float f4;
        int i9;
        float f5;
        int i10;
        View view;
        y5 y5Var;
        vd2 vd2Var;
        y5 y5Var2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i11 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.u0.size();
        for (int i12 = 0; i12 < size; i12++) {
            vd2 vd2Var2 = (vd2) this.u0.get(i12);
            if (q(i12)) {
                int i13 = this.p0;
                paddingBottom -= i13;
                paddingTop += i13;
            }
            int i14 = paddingBottom;
            int i15 = this.h0;
            char c = 4;
            int i16 = 2;
            boolean z3 = true;
            if (i15 == 0) {
                measuredWidth = paddingLeft;
                f = i11 - paddingRight;
            } else if (i15 != 1) {
                if (i15 == 2) {
                    int i17 = vd2Var2.e;
                    measuredWidth = paddingLeft + ((i11 - i17) / 2.0f);
                    f = (i11 - paddingRight) - ((i11 - i17) / 2.0f);
                } else if (i15 == 3) {
                    measuredWidth = paddingLeft;
                    int iA = vd2Var2.a();
                    f2 = (i11 - vd2Var2.e) / (iA != 1 ? iA - 1 : 1.0f);
                    f = i11 - paddingRight;
                } else if (i15 == 4) {
                    int iA2 = vd2Var2.a();
                    float f6 = iA2 != 0 ? (i11 - vd2Var2.e) / iA2 : 0.0f;
                    float f7 = f6 / 2.0f;
                    measuredWidth = paddingLeft + f7;
                    float f8 = (i11 - paddingRight) - f7;
                    f2 = f6;
                    f = f8;
                } else {
                    if (i15 != 5) {
                        om0.e(this.h0, "Invalid justifyContent is set: ");
                        return;
                    }
                    int iA3 = vd2Var2.a();
                    f2 = iA3 != 0 ? (i11 - vd2Var2.e) / (iA3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i11 - paddingRight) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < vd2Var2.h) {
                    i6 = vd2Var2.o + i5;
                    viewO = o(i6);
                    char c2 = c;
                    if (viewO != null) {
                        z2 = z3;
                        if (viewO.getVisibility() == 8) {
                            z2 = z2;
                        } else {
                            LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                            f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            if (p(i6, i5)) {
                                int i18 = this.q0;
                                float f9 = i18;
                                f3 += f9;
                                f4 -= f9;
                                i9 = i18;
                            } else {
                                i9 = 0;
                            }
                            f5 = f4;
                            if (i5 == vd2Var2.h - 1 || (this.o0 & 4) <= 0) {
                                i10 = 0;
                            } else {
                                i10 = this.q0;
                            }
                            if (this.g0 == i16) {
                                i8 = i16;
                                y5Var2 = this.t0;
                                if (z) {
                                    view = viewO;
                                    y5Var2.S(view, vd2Var2, Math.round(f5) - viewO.getMeasuredWidth(), i14 - viewO.getMeasuredHeight(), Math.round(f5), i14);
                                } else {
                                    view = viewO;
                                    y5Var2.S(view, vd2Var2, Math.round(f3), i14 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i14);
                                }
                                i7 = i14;
                            } else {
                                i5 = i5;
                                view = viewO;
                                z2 = z2;
                                i8 = i16;
                                i7 = i14;
                                y5Var = this.t0;
                                if (z) {
                                    y5Var.S(view, vd2Var2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i19 = paddingTop;
                                    y5Var.S(view, vd2Var2, Math.round(f3), i19, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i19);
                                    paddingTop = i19;
                                }
                            }
                            measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            float measuredWidth2 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                            if (z) {
                                vd2Var = vd2Var2;
                                vd2Var.b(view, i10, 0, i9, 0);
                            } else {
                                vd2Var = vd2Var2;
                                vd2Var.b(view, i9, 0, i10, 0);
                            }
                            vd2Var2 = vd2Var;
                            f = measuredWidth2;
                        }
                        i5++;
                        c = c2;
                        i16 = i8;
                        z3 = z2;
                        i14 = i7;
                    } else {
                        z2 = z3;
                    }
                    i8 = i16;
                    i5 = i5;
                    i7 = i14;
                    i5++;
                    c = c2;
                    i16 = i8;
                    z3 = z2;
                    i14 = i7;
                }
                int i20 = vd2Var2.g;
                paddingTop += i20;
                paddingBottom = i14 - i20;
            } else {
                int i21 = vd2Var2.e;
                f = i21 - paddingLeft;
                measuredWidth = (i11 - i21) + paddingRight;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < vd2Var2.h) {
                i6 = vd2Var2.o + i5;
                viewO = o(i6);
                char c3 = c;
                if (viewO != null) {
                    z2 = z3;
                    if (viewO.getVisibility() == 8) {
                        z2 = z2;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) viewO.getLayoutParams();
                        f3 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        if (p(i6, i5)) {
                            int i110 = this.q0;
                            float f10 = i110;
                            f3 += f10;
                            f4 -= f10;
                            i9 = i110;
                        } else {
                            i9 = 0;
                        }
                        f5 = f4;
                        if (i5 == vd2Var2.h - 1) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                        }
                        if (this.g0 == i16) {
                            i8 = i16;
                            y5Var2 = this.t0;
                            if (z) {
                                view = viewO;
                                y5Var2.S(view, vd2Var2, Math.round(f5) - viewO.getMeasuredWidth(), i14 - viewO.getMeasuredHeight(), Math.round(f5), i14);
                            } else {
                                view = viewO;
                                y5Var2.S(view, vd2Var2, Math.round(f3), i14 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f3), i14);
                            }
                            i7 = i14;
                        } else {
                            i5 = i5;
                            view = viewO;
                            z2 = z2;
                            i8 = i16;
                            i7 = i14;
                            y5Var = this.t0;
                            if (z) {
                                y5Var.S(view, vd2Var2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), view.getMeasuredHeight() + paddingTop);
                            } else {
                                int i111 = paddingTop;
                                y5Var.S(view, vd2Var2, Math.round(f3), i111, view.getMeasuredWidth() + Math.round(f3), view.getMeasuredHeight() + i111);
                                paddingTop = i111;
                            }
                        }
                        measuredWidth = f3 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth3 = f5 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z) {
                            vd2Var = vd2Var2;
                            vd2Var.b(view, i10, 0, i9, 0);
                        } else {
                            vd2Var = vd2Var2;
                            vd2Var.b(view, i9, 0, i10, 0);
                        }
                        vd2Var2 = vd2Var;
                        f = measuredWidth3;
                    }
                    i5++;
                    c = c3;
                    i16 = i8;
                    z3 = z2;
                    i14 = i7;
                } else {
                    z2 = z3;
                }
                i8 = i16;
                i5 = i5;
                i7 = i14;
                i5++;
                c = c3;
                i16 = i8;
                z3 = z2;
                i14 = i7;
            }
            int i22 = vd2Var2.g;
            paddingTop += i22;
            paddingBottom = i14 - i22;
        }
    }

    public void setAlignContent(int i) {
        if (this.j0 != i) {
            this.j0 = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.i0 != i) {
            this.i0 = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.l0) {
            return;
        }
        this.l0 = drawable;
        if (drawable != null) {
            this.p0 = drawable.getIntrinsicHeight();
        } else {
            this.p0 = 0;
        }
        if (this.l0 == null && this.m0 == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.m0) {
            return;
        }
        this.m0 = drawable;
        if (drawable != null) {
            this.q0 = drawable.getIntrinsicWidth();
        } else {
            this.q0 = 0;
        }
        if (this.l0 == null && this.m0 == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.f0 != i) {
            this.f0 = i;
            requestLayout();
        }
    }

    @Override // defpackage.td2
    public void setFlexLines(List<vd2> list) {
        this.u0 = list;
    }

    public void setFlexWrap(int i) {
        if (this.g0 != i) {
            this.g0 = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.h0 != i) {
            this.h0 = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.k0 != i) {
            this.k0 = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.n0) {
            this.n0 = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.o0) {
            this.o0 = i;
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x0137  */
    /* JADX WARN: Code duplicated, block: B:64:0x0154  */
    /* JADX WARN: Code duplicated, block: B:66:0x015c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c3  */
    public final void t(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float measuredHeight;
        float f;
        float f2;
        float fMax;
        int i5;
        int i6;
        int i7;
        View viewO;
        char c;
        int i8;
        int i9;
        float f3;
        float f4;
        int i10;
        float f5;
        int i11;
        y5 y5Var;
        vd2 vd2Var;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i12 = i4 - i2;
        int i13 = (i3 - i) - paddingRight;
        int size = this.u0.size();
        for (int i14 = 0; i14 < size; i14++) {
            vd2 vd2Var2 = (vd2) this.u0.get(i14);
            if (q(i14)) {
                int i15 = this.q0;
                paddingLeft += i15;
                i13 -= i15;
            }
            int i16 = i13;
            int i17 = this.h0;
            char c2 = 4;
            int i18 = 1;
            if (i17 == 0) {
                measuredHeight = paddingTop;
                f = i12 - paddingBottom;
            } else if (i17 != 1) {
                if (i17 == 2) {
                    float f6 = (i12 - vd2Var2.e) / 2.0f;
                    measuredHeight = paddingTop + f6;
                    f = (i12 - paddingBottom) - f6;
                } else if (i17 == 3) {
                    measuredHeight = paddingTop;
                    int iA = vd2Var2.a();
                    f2 = (i12 - vd2Var2.e) / (iA != 1 ? iA - 1 : 1.0f);
                    f = i12 - paddingBottom;
                } else if (i17 == 4) {
                    int iA2 = vd2Var2.a();
                    f2 = iA2 != 0 ? (i12 - vd2Var2.e) / iA2 : 0.0f;
                    float f7 = f2 / 2.0f;
                    measuredHeight = paddingTop + f7;
                    f = (i12 - paddingBottom) - f7;
                } else {
                    if (i17 != 5) {
                        om0.e(this.h0, "Invalid justifyContent is set: ");
                        return;
                    }
                    int iA3 = vd2Var2.a();
                    f2 = iA3 != 0 ? (i12 - vd2Var2.e) / (iA3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f2;
                    f = (i12 - paddingBottom) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < vd2Var2.h) {
                    i6 = vd2Var2.o + i5;
                    i7 = i18;
                    viewO = o(i6);
                    if (viewO != null) {
                        c = c2;
                        if (viewO.getVisibility() == 8) {
                            LayoutParams layoutParams = (LayoutParams) viewO.getLayoutParams();
                            f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (p(i6, i5)) {
                                i10 = this.p0;
                                float f8 = i10;
                                f3 += f8;
                                f4 -= f8;
                            } else {
                                i10 = 0;
                            }
                            f5 = f4;
                            if (i5 == vd2Var2.h - i7 || (this.n0 & 4) <= 0) {
                                i11 = 0;
                            } else {
                                i11 = this.p0;
                            }
                            i9 = i5;
                            y5Var = this.t0;
                            if (z) {
                                if (z2) {
                                    y5Var.T(viewO, vd2Var2, true, i16 - viewO.getMeasuredWidth(), Math.round(f5) - viewO.getMeasuredHeight(), i16, Math.round(f5));
                                } else {
                                    y5Var.T(viewO, vd2Var2, true, i16 - viewO.getMeasuredWidth(), Math.round(f3), i16, viewO.getMeasuredHeight() + Math.round(f3));
                                }
                                i8 = i16;
                            } else {
                                i9 = i9;
                                i7 = i7;
                                i8 = i16;
                                if (z2) {
                                    y5Var.T(viewO, vd2Var2, false, paddingLeft, Math.round(f5) - viewO.getMeasuredHeight(), viewO.getMeasuredWidth() + paddingLeft, Math.round(f5));
                                } else {
                                    int i19 = paddingLeft;
                                    y5Var.T(viewO, vd2Var2, false, i19, Math.round(f3), viewO.getMeasuredWidth() + i19, viewO.getMeasuredHeight() + Math.round(f3));
                                    paddingLeft = i19;
                                }
                            }
                            measuredHeight = f3 + viewO.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            float measuredHeight2 = f5 - ((viewO.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                            if (z2) {
                                vd2Var = vd2Var2;
                                vd2Var.b(viewO, 0, i11, 0, i10);
                            } else {
                                vd2Var = vd2Var2;
                                vd2Var.b(viewO, 0, i10, 0, i11);
                            }
                            vd2Var2 = vd2Var;
                            f = measuredHeight2;
                        }
                        i5 = i9 + 1;
                        c2 = c;
                        i18 = i7;
                        i16 = i8;
                    } else {
                        c = c2;
                    }
                    i9 = i5;
                    i7 = i7;
                    i8 = i16;
                    i5 = i9 + 1;
                    c2 = c;
                    i18 = i7;
                    i16 = i8;
                }
                int i20 = vd2Var2.g;
                paddingLeft += i20;
                i13 = i16 - i20;
            } else {
                int i21 = vd2Var2.e;
                f = i21 - paddingTop;
                measuredHeight = (i12 - i21) + paddingBottom;
            }
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < vd2Var2.h) {
                i6 = vd2Var2.o + i5;
                i7 = i18;
                viewO = o(i6);
                if (viewO != null) {
                    c = c2;
                    if (viewO.getVisibility() == 8) {
                        LayoutParams layoutParams2 = (LayoutParams) viewO.getLayoutParams();
                        f3 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        f4 = f - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        if (p(i6, i5)) {
                            i10 = this.p0;
                            float f9 = i10;
                            f3 += f9;
                            f4 -= f9;
                        } else {
                            i10 = 0;
                        }
                        f5 = f4;
                        if (i5 == vd2Var2.h - i7) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                        }
                        i9 = i5;
                        y5Var = this.t0;
                        if (z) {
                            if (z2) {
                                y5Var.T(viewO, vd2Var2, true, i16 - viewO.getMeasuredWidth(), Math.round(f5) - viewO.getMeasuredHeight(), i16, Math.round(f5));
                            } else {
                                y5Var.T(viewO, vd2Var2, true, i16 - viewO.getMeasuredWidth(), Math.round(f3), i16, viewO.getMeasuredHeight() + Math.round(f3));
                            }
                            i8 = i16;
                        } else {
                            i9 = i9;
                            i7 = i7;
                            i8 = i16;
                            if (z2) {
                                y5Var.T(viewO, vd2Var2, false, paddingLeft, Math.round(f5) - viewO.getMeasuredHeight(), viewO.getMeasuredWidth() + paddingLeft, Math.round(f5));
                            } else {
                                int i110 = paddingLeft;
                                y5Var.T(viewO, vd2Var2, false, i110, Math.round(f3), viewO.getMeasuredWidth() + i110, viewO.getMeasuredHeight() + Math.round(f3));
                                paddingLeft = i110;
                            }
                        }
                        measuredHeight = f3 + viewO.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        float measuredHeight3 = f5 - ((viewO.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin);
                        if (z2) {
                            vd2Var = vd2Var2;
                            vd2Var.b(viewO, 0, i11, 0, i10);
                        } else {
                            vd2Var = vd2Var2;
                            vd2Var.b(viewO, 0, i10, 0, i11);
                        }
                        vd2Var2 = vd2Var;
                        f = measuredHeight3;
                    }
                    i5 = i9 + 1;
                    c2 = c;
                    i18 = i7;
                    i16 = i8;
                } else {
                    c = c2;
                }
                i9 = i5;
                i7 = i7;
                i8 = i16;
                i5 = i9 + 1;
                c2 = c;
                i18 = i7;
                i16 = i8;
            }
            int i22 = vd2Var2.g;
            paddingLeft += i22;
            i13 = i16 - i22;
        }
    }

    public final void u(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                bt.q(pc6.j(i, "Invalid flex direction: "));
                return;
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else if (mode != 1073741824) {
            bt.i(pc6.j(mode, "Unknown width mode is set: "));
            return;
        } else {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
        } else if (mode2 != 1073741824) {
            bt.i(pc6.j(mode2, "Unknown height mode is set: "));
            return;
        } else {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // defpackage.td2
    public final void i(View view, int i) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
