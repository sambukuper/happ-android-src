package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c60 implements w82 {
    public final Bitmap a;

    public c60(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.w82
    public final Object a(l12 l12Var) {
        return new b63(new d60(this.a), false, ma1.Y);
    }
}
