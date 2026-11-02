package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import defpackage.a31;
import defpackage.c36;
import defpackage.c46;
import defpackage.cw8;
import defpackage.f4;
import defpackage.j36;
import defpackage.nu0;
import defpackage.o56;
import defpackage.pu0;
import defpackage.s46;
import defpackage.u26;
import defpackage.v56;
import defpackage.w79;
import defpackage.ys0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.url._UrlKt;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends RadialViewGroup implements pu0 {
    public final RectF A0;
    public final Rect B0;
    public final SparseArray C0;
    public final a D0;
    public final int[] E0;
    public final float[] F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final String[] K0;
    public float L0;
    public final ColorStateList M0;
    public f N0;
    public final ClockHandView y0;
    public final Rect z0;

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.z0 = new Rect();
        this.A0 = new RectF();
        this.B0 = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.C0 = sparseArray;
        this.F0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v56.ClockFaceView, i, o56.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListX = ys0.x(context, typedArrayObtainStyledAttributes, v56.ClockFaceView_clockNumberTextColor);
        this.M0 = colorStateListX;
        byte b = 1;
        LayoutInflater.from(context).inflate(s46.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(c46.material_clock_hand);
        this.y0 = clockHandView;
        this.G0 = resources.getDimensionPixelSize(j36.material_clock_hand_padding);
        int colorForState = colorStateListX.getColorForState(new int[]{R.attr.state_selected}, colorStateListX.getDefaultColor());
        this.E0 = new int[]{colorForState, colorForState, colorStateListX.getDefaultColor()};
        clockHandView.h0.add(this);
        int defaultColor = w79.v(context, c36.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListX2 = ys0.x(context, typedArrayObtainStyledAttributes, v56.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateListX2 != null ? colorStateListX2.getDefaultColor() : defaultColor);
        typedArrayObtainStyledAttributes.recycle();
        setOutlineProvider(new nu0((byte) 0));
        setFocusable(true);
        setClipToOutline(true);
        this.D0 = new a(this, b);
        String[] strArr = new String[12];
        Arrays.fill(strArr, _UrlKt.FRAGMENT_ENCODE_SET);
        this.K0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.K0.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.K0.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(s46.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.K0[i2]);
                textView.setTag(c46.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(c46.material_clock_level, Integer.valueOf(i3));
                z = i3 > 1 ? true : z;
                cw8.n(textView, this.D0);
                textView.setTextColor(this.M0);
            }
        }
        ClockHandView clockHandView2 = this.y0;
        if (clockHandView2.g0 && !z) {
            clockHandView2.r0 = 1;
        }
        clockHandView2.g0 = z;
        clockHandView2.invalidate();
        this.H0 = resources.getDimensionPixelSize(j36.material_time_picker_minimum_screen_height);
        this.I0 = resources.getDimensionPixelSize(j36.material_time_picker_minimum_screen_width);
        this.J0 = resources.getDimensionPixelSize(j36.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public final void m() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.b(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != c46.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(c46.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iRound = this.w0;
            if (iIntValue == 2) {
                iRound = Math.round(iRound * 0.66f);
            }
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                int i3 = c46.circle_center;
                Integer numValueOf = Integer.valueOf(id);
                HashMap map2 = dVar.b;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id), new androidx.constraintlayout.widget.c());
                }
                a31 a31Var = ((androidx.constraintlayout.widget.c) map2.get(Integer.valueOf(id))).d;
                a31Var.z = i3;
                a31Var.A = iRound;
                a31Var.B = size;
                size += 360.0f / list.size();
            }
        }
        dVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.C0;
            if (i4 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i4)).setVisibility(0);
            i4++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.y0.l0;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.C0;
            int size = sparseArray.size();
            rect = this.z0;
            rectF = this.A0;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.B0;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.E0, this.F0, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f4.a(1, this.K0.length, 1).X);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int iIntValue;
        int length;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.C0;
            if (i2 >= sparseArray.size()) {
                iIntValue = -1;
                break;
            }
            TextView textView = (TextView) sparseArray.valueAt(i2);
            if (textView.isSelected()) {
                iIntValue = ((Integer) textView.getTag(c46.material_value_index)).intValue();
                break;
            }
            i2++;
        }
        if (!isShown() || iIntValue == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i != 66) {
            String[] strArr = this.K0;
            switch (i) {
                case 19:
                case 22:
                    length = (iIntValue + 1) % strArr.length;
                    break;
                case 20:
                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                    length = ((iIntValue - 1) + strArr.length) % strArr.length;
                    break;
                case 23:
                    break;
                default:
                    return super.onKeyDown(i, keyEvent);
            }
            if (length == iIntValue) {
                return super.onKeyDown(i, keyEvent);
            }
            int i3 = (length / 12) + 1;
            ClockHandView clockHandView = this.y0;
            if (i3 != clockHandView.r0) {
                clockHandView.r0 = i3;
                clockHandView.invalidate();
            }
            clockHandView.a((length % 12) * 30.0f);
            n();
            return true;
        }
        f fVar = this.N0;
        if (fVar != null) {
            fVar.a.v0.isChecked();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.J0 / Math.max(Math.max(this.H0 / displayMetrics.heightPixels, this.I0 / displayMetrics.widthPixels), 1.0f));
        if (View.MeasureSpec.getMode(i) != 0) {
            iMax = Math.min(iMax, View.MeasureSpec.getSize(i));
        }
        if (View.MeasureSpec.getMode(i2) != 0) {
            iMax = Math.min(iMax, View.MeasureSpec.getSize(i2));
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        ClockHandView clockHandView = this.y0;
        int i3 = ((iMax / 2) - clockHandView.i0) - this.G0;
        int i4 = this.w0;
        if (i3 != i4 && i3 != i4) {
            this.w0 = i3;
            m();
            clockHandView.q0 = this.w0;
            clockHandView.invalidate();
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u26.materialClockStyle);
    }
}
