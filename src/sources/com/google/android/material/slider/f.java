package com.google.android.material.slider;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {
    public int X = -1;
    public final /* synthetic */ BaseSlider Y;

    public f(BaseSlider baseSlider) {
        this.Y = baseSlider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Y.m0.w(this.X, 4);
    }
}
