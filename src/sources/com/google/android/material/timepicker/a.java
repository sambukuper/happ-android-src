package com.google.android.material.timepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import defpackage.a4;
import defpackage.c46;
import defpackage.g4;
import defpackage.h4;
import defpackage.t3;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends t3 {
    public final /* synthetic */ byte f0;
    public final /* synthetic */ ViewGroup g0;

    public /* synthetic */ a(ViewGroup viewGroup, byte b) {
        this.f0 = b;
        this.g0 = viewGroup;
    }

    @Override // defpackage.t3
    public final void d(View view, h4 h4Var) {
        byte b = this.f0;
        ViewGroup viewGroup = this.g0;
        View.AccessibilityDelegate accessibilityDelegate = this.X;
        switch (b) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = h4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                h4Var.x(((EditText) view).getText());
                h4Var.r(((ChipTextInputComboView) viewGroup).h0.getText());
                accessibilityNodeInfo.setMaxTextLength(2);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = h4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                int iIntValue = ((Integer) view.getTag(c46.material_value_index)).intValue();
                if (iIntValue > 0) {
                    accessibilityNodeInfo2.setTraversalAfter((View) ((ClockFaceView) viewGroup).C0.get(iIntValue - 1));
                }
                h4Var.o(g4.a(0, view.isSelected(), 1, iIntValue, 1));
                accessibilityNodeInfo2.setClickable(true);
                h4Var.b(a4.g);
                break;
        }
    }

    @Override // defpackage.t3
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f0) {
            case 1:
                ClockFaceView clockFaceView = (ClockFaceView) this.g0;
                ClockHandView clockHandView = clockFaceView.y0;
                Rect rect = clockFaceView.z0;
                if (i != 16) {
                    return super.g(view, i, bundle);
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                view.getHitRect(rect);
                float fCenterX = rect.centerX();
                float fCenterY = rect.centerY();
                clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                return true;
            default:
                return super.g(view, i, bundle);
        }
    }
}
