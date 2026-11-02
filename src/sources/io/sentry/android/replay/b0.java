package io.sentry.android.replay;

import io.sentry.q4;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[q4.values().length];
        try {
            iArr[q4.CANVAS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q4.PIXEL_COPY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
