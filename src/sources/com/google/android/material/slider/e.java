package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import defpackage.ac8;
import defpackage.bt7;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ BaseSlider a;

    public e(BaseSlider baseSlider) {
        this.a = baseSlider;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        int i = BaseSlider.h2;
        BaseSlider baseSlider = this.a;
        ViewGroup viewGroupD = bt7.d(baseSlider);
        ViewOverlay overlay = viewGroupD == null ? null : viewGroupD.getOverlay();
        if (overlay == null) {
            return;
        }
        Iterator it = baseSlider.q0.iterator();
        while (it.hasNext()) {
            overlay.remove((ac8) it.next());
        }
    }
}
