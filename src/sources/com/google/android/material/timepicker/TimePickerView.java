package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import defpackage.c46;
import defpackage.rb4;
import defpackage.s46;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int w0 = 0;
    public final Chip v0;

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g gVar = new g();
        LayoutInflater.from(context).inflate(s46.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(c46.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(c46.material_clock_period_toggle);
        materialButtonToggleGroup.s0.add(new e());
        Chip chip = (Chip) findViewById(c46.material_minute_tv);
        Chip chip2 = (Chip) findViewById(c46.material_hour_tv);
        this.v0 = chip2;
        clockFaceView.N0 = new f(this);
        rb4 rb4Var = new rb4(new GestureDetector(getContext(), new h()), (byte) 1);
        chip.setOnTouchListener(rb4Var);
        chip2.setOnTouchListener(rb4Var);
        chip.setTag(c46.selection_type, 12);
        chip2.setTag(c46.selection_type, 10);
        chip.setOnClickListener(gVar);
        chip2.setOnClickListener(gVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.v0.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
