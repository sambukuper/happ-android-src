package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.a77;
import defpackage.bt;
import defpackage.c0;
import defpackage.c98;
import defpackage.j36;
import defpackage.lr5;
import defpackage.m61;
import defpackage.mr4;
import defpackage.o56;
import defpackage.q02;
import defpackage.qq4;
import defpackage.sh7;
import defpackage.t23;
import defpackage.th7;
import defpackage.tx0;
import defpackage.uh7;
import defpackage.v56;
import defpackage.vh7;
import defpackage.y67;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class MaterialButtonGroup extends LinearLayout {
    public static final int q0 = o56.Widget_Material3_MaterialButtonGroup;
    public static final Object r0 = null;
    public int f0;
    public final ArrayList g0;
    public final q02 h0;
    public final tx0 i0;
    public Integer[] j0;
    public sh7 k0;
    public th7 l0;
    public int m0;
    public vh7 n0;
    public boolean o0;
    public final ArrayList p0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonGroup(Context context, AttributeSet attributeSet, int i) {
        sh7 sh7VarB;
        int next;
        int next2;
        int i2 = q0;
        super(mr4.b(context, attributeSet, i, i2), attributeSet, i);
        this.f0 = 0;
        this.g0 = new ArrayList();
        this.h0 = new q02((Object) this, (byte) 19);
        this.i0 = new tx0(this, (byte) 1);
        this.o0 = true;
        new HashMap();
        new HashMap();
        new ArrayList();
        new ArrayList();
        this.p0 = new ArrayList();
        Context context2 = getContext();
        TypedArray typedArrayD = c98.d(context2, attributeSet, v56.MaterialButtonGroup, i, i2, new int[0]);
        if (typedArrayD.hasValue(v56.MaterialButtonGroup_buttonSizeChange)) {
            int resourceId = typedArrayD.getResourceId(v56.MaterialButtonGroup_buttonSizeChange, 0);
            vh7 vh7Var = null;
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    XmlResourceParser xml = context2.getResources().getXml(resourceId);
                    try {
                        vh7 vh7Var2 = new vh7();
                        vh7Var2.c = new int[10][];
                        vh7Var2.d = new lr5[10];
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            vh7Var2.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        vh7Var = vh7Var2;
                    } catch (Throwable th) {
                        if (xml == null) {
                            throw th;
                        }
                        try {
                            xml.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
            }
            this.n0 = vh7Var;
        }
        if (typedArrayD.hasValue(v56.MaterialButtonGroup_shapeAppearance)) {
            th7 th7VarG = th7.g(context2, typedArrayD, v56.MaterialButtonGroup_shapeAppearance);
            this.l0 = th7VarG;
            if (th7VarG == null) {
                int resourceId2 = typedArrayD.getResourceId(v56.MaterialButtonGroup_shapeAppearance, 0);
                int resourceId3 = typedArrayD.getResourceId(v56.MaterialButtonGroup_shapeAppearanceOverlay, 0);
                c0 c0Var = new c0(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId2);
                if (resourceId3 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId3, true);
                }
                this.l0 = new t23(a77.h(contextThemeWrapper.obtainStyledAttributes(v56.ShapeAppearance), c0Var).a()).c();
            }
        }
        if (typedArrayD.hasValue(v56.MaterialButtonGroup_innerCornerSize)) {
            int i3 = v56.MaterialButtonGroup_innerCornerSize;
            c0 c0Var2 = new c0(0.0f);
            int resourceId4 = typedArrayD.getResourceId(i3, 0);
            if (resourceId4 != 0 && context2.getResources().getResourceTypeName(resourceId4).equals("xml")) {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId4);
                    try {
                        sh7 sh7Var = new sh7();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml2);
                        do {
                            next = xml2.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml2.getName().equals("selector")) {
                            sh7Var.d(context2, xml2, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml2.close();
                        sh7VarB = sh7Var;
                    } catch (Throwable th3) {
                        if (xml2 == null) {
                            throw th3;
                        }
                        try {
                            xml2.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    sh7VarB = sh7.b(c0Var2);
                }
            } else {
                sh7VarB = sh7.b(a77.i(typedArrayD, i3, c0Var2));
            }
            this.k0 = sh7VarB;
        }
        this.m0 = typedArrayD.getDimensionPixelSize(v56.MaterialButtonGroup_android_spacing, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayD.getBoolean(v56.MaterialButtonGroup_android_enabled, true));
        setOverflowMode(typedArrayD.getInt(v56.MaterialButtonGroup_overflowMode, 0));
        getResources().getDimensionPixelOffset(j36.m3_btn_group_overflow_item_icon_horizontal_padding);
        typedArrayD.recycle();
    }

    public static LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LayoutParams(layoutParams.width, layoutParams.height);
    }

    public static LayoutParams e(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (h(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (h(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            View childAt2 = getChildAt(i - 1);
            if ((childAt instanceof MaterialButton) && (childAt2 instanceof MaterialButton)) {
                MaterialButton materialButton = (MaterialButton) childAt;
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (this.m0 <= 0) {
                    iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    iMin = 0;
                }
            } else {
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsD = d(childAt);
            if (getOrientation() == 0) {
                layoutParamsD.setMarginEnd(0);
                layoutParamsD.setMarginStart(this.m0 - iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = this.m0 - iMin;
                layoutParamsD.setMarginStart(0);
            }
            childAt.setLayoutParams(layoutParamsD);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParamsD2 = d((MaterialButton) getChildAt(firstVisibleChildIndex));
        if (getOrientation() == 1) {
            layoutParamsD2.topMargin = 0;
            layoutParamsD2.bottomMargin = 0;
        } else {
            layoutParamsD2.setMarginEnd(0);
            layoutParamsD2.setMarginStart(0);
            layoutParamsD2.leftMargin = 0;
            layoutParamsD2.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            i();
            this.o0 = true;
            int iIndexOfChild = indexOfChild(null);
            if (iIndexOfChild < 0 || i != -1) {
                super.addView(view, i, layoutParams);
            } else {
                super.addView(view, iIndexOfChild, layoutParams);
            }
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            materialButton.setOnPressedChangeListenerInternal(this.h0);
            this.g0.add(materialButton.getShapeAppearance());
            materialButton.setEnabled(isEnabled());
        }
    }

    public final void b() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        if (firstVisibleChildIndex == -1 || this.n0 == null) {
            return;
        }
        if (this.f0 != 2) {
            c(firstVisibleChildIndex, lastVisibleChildIndex);
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.p0;
            if (i >= arrayList.size()) {
                return;
            }
            c(((Integer) arrayList.get(i)).intValue(), (i == arrayList.size() + (-1) ? getChildCount() : ((Integer) arrayList.get(i + 1)).intValue()) - 1);
            i++;
        }
    }

    public final void c(int i, int i2) {
        float fMax;
        if (i == i2) {
            ((MaterialButton) getChildAt(i)).setWidthChangeDirection(qq4.X);
            return;
        }
        int iMin = Integer.MAX_VALUE;
        int i3 = i;
        while (i3 <= i2) {
            if (h(i3)) {
                ((MaterialButton) getChildAt(i3)).setWidthChangeDirection(i3 == i ? qq4.Z : i3 == i2 ? qq4.Y : qq4.f0);
                int iMin2 = 0;
                if (h(i3) && this.n0 != null) {
                    MaterialButton materialButton = (MaterialButton) getChildAt(i3);
                    vh7 vh7Var = this.n0;
                    int width = materialButton.getWidth();
                    int i4 = -width;
                    for (int i5 = 0; i5 < vh7Var.a; i5++) {
                        uh7 uh7Var = (uh7) vh7Var.d[i5].Y;
                        int i6 = uh7Var.a;
                        float f = uh7Var.b;
                        if (i6 == 2) {
                            fMax = Math.max(i4, f);
                        } else {
                            if (i6 == 1) {
                                fMax = Math.max(i4, width * f);
                            }
                        }
                        i4 = (int) fMax;
                    }
                    int iMax = Math.max(0, i4);
                    MaterialButton materialButtonG = g(i3);
                    int allowedWidthDecrease = materialButtonG == null ? 0 : materialButtonG.getAllowedWidthDecrease();
                    MaterialButton materialButtonF = f(i3);
                    iMin2 = Math.min(iMax, allowedWidthDecrease + (materialButtonF != null ? materialButtonF.getAllowedWidthDecrease() : 0));
                }
                if (i3 != i && i3 != i2) {
                    iMin2 /= 2;
                }
                iMin = Math.min(iMin, iMin2);
            }
            i3++;
        }
        while (i <= i2) {
            if (h(i)) {
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i);
                materialButton2.setSizeChange(this.n0);
                materialButton2.setWidthChangeMax(iMin * 2);
            }
            i++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.i0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.j0 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final MaterialButton f(int i) {
        int childCount = getChildCount();
        int i2 = i + 1;
        while (true) {
            if (i2 >= childCount) {
                i2 = -1;
                break;
            }
            if (h(i2)) {
                break;
            }
            i2++;
        }
        ArrayList arrayList = this.p0;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int iIntValue = ((Integer) arrayList.get(i3)).intValue();
                int iIntValue2 = i3 == arrayList.size() + (-1) ? childCount - 1 : ((Integer) arrayList.get(i3 + 1)).intValue() - 1;
                if (i >= iIntValue && i <= iIntValue2 && (i2 < iIntValue || i2 > iIntValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i2);
    }

    public final MaterialButton g(int i) {
        int childCount = getChildCount();
        int i2 = i - 1;
        while (true) {
            if (i2 < 0) {
                i2 = -1;
                break;
            }
            if (h(i2)) {
                break;
            }
            i2--;
        }
        ArrayList arrayList = this.p0;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int iIntValue = ((Integer) arrayList.get(i3)).intValue();
                int iIntValue2 = i3 == arrayList.size() + (-1) ? childCount : ((Integer) arrayList.get(i3 + 1)).intValue();
                if (i >= iIntValue && i < iIntValue2 && (i2 < iIntValue || i2 >= iIntValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public vh7 getButtonSizeChange() {
        return this.n0;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.j0;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public m61 getInnerCornerSize() {
        return this.k0.b;
    }

    public sh7 getInnerCornerSizeStateList() {
        return this.k0;
    }

    public Drawable getOverflowButtonIcon() {
        throw null;
    }

    public int getOverflowMode() {
        return this.f0;
    }

    public a77 getShapeAppearance() {
        th7 th7Var = this.l0;
        if (th7Var == null) {
            return null;
        }
        return th7Var.h();
    }

    public int getSpacing() {
        return this.m0;
    }

    public th7 getStateListShapeAppearance() {
        return this.l0;
    }

    public final boolean h(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void i() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.I0;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.I0 = null;
                materialButton.F0 = -2.1474836E9f;
            }
        }
    }

    public final void j() {
        int i;
        if (!(this.k0 == null && this.l0 == null) && this.o0) {
            this.o0 = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    Object obj = this.l0;
                    ArrayList arrayList = this.g0;
                    if (obj == null || (!z && !z2)) {
                        obj = (y67) arrayList.get(i2);
                    }
                    t23 t23Var = !(obj instanceof th7) ? new t23((a77) arrayList.get(i2)) : ((th7) obj).j();
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 5) << 1) | ((i & 10) >> 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i3 = ~i;
                    sh7 sh7Var = this.k0;
                    if ((i3 | 1) == i3) {
                        t23Var.f = sh7Var;
                    }
                    if ((i3 | 2) == i3) {
                        t23Var.g = sh7Var;
                    }
                    if ((i3 | 4) == i3) {
                        t23Var.h = sh7Var;
                    }
                    if ((i3 | 8) == i3) {
                        t23Var.i = sh7Var;
                    }
                    th7 th7VarC = t23Var.c();
                    boolean zF = th7VarC.f();
                    th7 th7VarH = th7VarC;
                    if (!zF) {
                        th7VarH = th7VarC.h();
                    }
                    materialButton.setShapeAppearance(th7VarH);
                }
                i2++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            i();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingBottom;
        a();
        if (this.f0 != 2) {
            paddingBottom = 0;
        } else {
            if (getOrientation() == 1) {
                bt.q("The wrap overflow mode is not compatible to the vertical orientation.");
                return;
            }
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                bt.q("The wrap overflow mode is not compatible with wrap_content layout width.");
                return;
            }
            ArrayList arrayList = this.p0;
            arrayList.clear();
            int size = View.MeasureSpec.getSize(i);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i3 = 0;
            int iMax = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                if (h(i5)) {
                    View view = (MaterialButton) getChildAt(i5);
                    measureChild(view, i, i2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth > 0) {
                        LinearLayout.LayoutParams layoutParamsD = d(view);
                        if (i3 + measuredWidth + (arrayList2.isEmpty() ? 0 : this.m0) > size || arrayList2.isEmpty()) {
                            if (!arrayList2.isEmpty()) {
                                arrayList3.add(Integer.valueOf(i3));
                            }
                            i4 += iMax + (arrayList.isEmpty() ? 0 : this.m0);
                            arrayList.add(Integer.valueOf(i5));
                            layoutParamsD.setMarginStart(-i3);
                            arrayList2.clear();
                            i3 = 0;
                            iMax = 0;
                        }
                        i3 += measuredWidth + (i3 == 0 ? 0 : this.m0);
                        iMax = Math.max(iMax, measuredHeight);
                        arrayList2.add(Integer.valueOf(i5));
                        layoutParamsD.topMargin += i4;
                        view.setLayoutParams(layoutParamsD);
                    }
                }
            }
            arrayList3.add(Integer.valueOf(i3));
            int iIntValue = ((Integer) Collections.max(arrayList3)).intValue();
            int i6 = 0;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                int iIntValue2 = ((Integer) arrayList.get(i7)).intValue();
                int iIntValue3 = ((Integer) arrayList3.get(i7)).intValue();
                MaterialButton materialButton = (MaterialButton) getChildAt(iIntValue2);
                LinearLayout.LayoutParams layoutParamsD2 = d(materialButton);
                int i8 = layoutParamsD2.gravity & 8388615;
                int absoluteGravity = Gravity.getAbsoluteGravity(i8, getLayoutDirection());
                int i9 = iIntValue - iIntValue3;
                if (i8 != 8388611) {
                    if (absoluteGravity == 1) {
                        i9 /= 2;
                    }
                    layoutParamsD2.setMarginStart((layoutParamsD2.getMarginStart() + i9) - i6);
                    materialButton.setLayoutParams(layoutParamsD2);
                    i6 = i9;
                }
            }
            paddingBottom = getPaddingBottom() + getPaddingTop() + i4 + iMax;
        }
        j();
        super.onMeasure(i, i2);
        if (this.f0 != 2 || paddingBottom == getMeasuredHeight()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), paddingBottom);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.g0.remove(iIndexOfChild);
        }
        this.o0 = true;
        j();
        i();
        a();
    }

    public void setButtonSizeChange(vh7 vh7Var) {
        if (this.n0 != vh7Var) {
            this.n0 = vh7Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(m61 m61Var) {
        this.k0 = sh7.b(m61Var);
        this.o0 = true;
        j();
        invalidate();
    }

    public void setInnerCornerSizeStateList(sh7 sh7Var) {
        this.k0 = sh7Var;
        this.o0 = true;
        j();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.o0 = true;
        }
        super.setOrientation(i);
    }

    public void setOverflowButtonIcon(Drawable drawable) {
        throw null;
    }

    public void setOverflowButtonIconResource(int i) {
        throw null;
    }

    public void setOverflowMode(int i) {
        if (this.f0 != i) {
            this.f0 = i;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(a77 a77Var) {
        this.l0 = new t23(a77Var).c();
        this.o0 = true;
        j();
        invalidate();
    }

    public void setSpacing(int i) {
        this.m0 = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(th7 th7Var) {
        this.l0 = th7Var;
        this.o0 = true;
        j();
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return e(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return e(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v56.MaterialButtonGroup_Layout);
            typedArrayObtainStyledAttributes.getDrawable(v56.MaterialButtonGroup_Layout_layout_overflowIcon);
            typedArrayObtainStyledAttributes.getText(v56.MaterialButtonGroup_Layout_layout_overflowText);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }
}
