package com.google.android.material.slider;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import defpackage.a4;
import defpackage.cw8;
import defpackage.h4;
import defpackage.h56;
import defpackage.j46;
import defpackage.j62;
import defpackage.z91;
import defpackage.zv8;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j62 {
    public final BaseSlider s0;
    public final Rect t0;

    public g(BaseSlider baseSlider) {
        super(baseSlider);
        this.t0 = new Rect();
        this.s0 = baseSlider;
    }

    @Override // defpackage.j62
    public final int n(float f, float f2) {
        int i = 0;
        while (true) {
            BaseSlider baseSlider = this.s0;
            if (i >= baseSlider.getValues().size()) {
                return -1;
            }
            Rect rect = this.t0;
            baseSlider.D(i, rect);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.j62
    public final void o(ArrayList arrayList) {
        for (int i = 0; i < this.s0.getValues().size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // defpackage.j62
    public final boolean r(int i, int i2, Bundle bundle) {
        BaseSlider baseSlider = this.s0;
        if (!baseSlider.isEnabled()) {
            return false;
        }
        if (i2 != 4096 && i2 != 8192) {
            if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                return false;
            }
            float f = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
            int i3 = BaseSlider.h2;
            if (!baseSlider.B(i, f)) {
                return false;
            }
            baseSlider.E();
            baseSlider.postInvalidate();
            return true;
        }
        int i4 = BaseSlider.h2;
        float fRound = baseSlider.w1;
        if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        float f2 = (baseSlider.s1 - baseSlider.r1) / fRound;
        if (f2 > 20.0f) {
            fRound *= Math.round(f2 / 20.0f);
        }
        if (i2 == 8192) {
            fRound = -fRound;
        }
        if (baseSlider.s()) {
            fRound = -fRound;
        }
        if (!baseSlider.B(i, z91.l(baseSlider.getValues().get(i).floatValue() + fRound, baseSlider.getValueFrom(), baseSlider.getValueTo()))) {
            return false;
        }
        baseSlider.setActiveThumbIndex(i);
        Slider slider = (Slider) baseSlider;
        d dVar = slider.f2;
        slider.removeCallbacks(dVar);
        slider.postDelayed(dVar, slider.c2);
        baseSlider.E();
        baseSlider.postInvalidate();
        return true;
    }

    @Override // defpackage.j62
    public final void t(int i, h4 h4Var) {
        Object tag;
        String string;
        h4Var.b(a4.s);
        BaseSlider baseSlider = this.s0;
        List<Float> values = baseSlider.getValues();
        float fFloatValue = values.get(i).floatValue();
        float valueFrom = baseSlider.getValueFrom();
        float valueTo = baseSlider.getValueTo();
        if (baseSlider.isEnabled()) {
            if (fFloatValue > valueFrom) {
                h4Var.a(8192);
            }
            if (fFloatValue < valueTo) {
                h4Var.a(4096);
            }
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        try {
            valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
            valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
            fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
        } catch (ParseException unused) {
            int i2 = BaseSlider.h2;
        }
        h4Var.a.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue));
        h4Var.m(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (baseSlider.getContentDescription() != null) {
            sb.append(baseSlider.getContentDescription());
            sb.append(",");
        }
        String str = String.format(((float) ((int) fFloatValue)) == fFloatValue ? "%.0f" : "%.2f", Float.valueOf(fFloatValue));
        String string2 = baseSlider.getContext().getString(h56.material_slider_value);
        if (values.size() > 1) {
            if (i == baseSlider.getValues().size() - 1) {
                string = baseSlider.getContext().getString(h56.material_slider_range_end);
            } else {
                string = i == 0 ? baseSlider.getContext().getString(h56.material_slider_range_start) : _UrlKt.FRAGMENT_ENCODE_SET;
            }
            string2 = string;
        }
        WeakHashMap weakHashMap = cw8.a;
        int i3 = j46.tag_state_description;
        if (Build.VERSION.SDK_INT >= 30) {
            tag = zv8.b(baseSlider);
        } else {
            tag = baseSlider.getTag(i3);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        if (TextUtils.isEmpty(charSequence)) {
            Locale.getDefault();
            sb.append(string2 + ", " + str);
        } else {
            h4Var.w(charSequence);
        }
        h4Var.p(sb.toString());
        Rect rect = this.t0;
        baseSlider.D(i, rect);
        h4Var.k(rect);
    }
}
