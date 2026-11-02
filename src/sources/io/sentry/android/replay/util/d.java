package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Paint;
import defpackage.dn2;
import defpackage.g24;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends g24 implements dn2 {
    public static final d Z;
    public static final d f0;
    public final /* synthetic */ byte Y;

    static {
        int i = 0;
        Z = new d((byte) 0, i);
        f0 = new d((byte) 1, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(byte b, int i) {
        super(i);
        this.Y = b;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        switch (this.Y) {
            case 0:
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            default:
                return new Paint();
        }
    }
}
