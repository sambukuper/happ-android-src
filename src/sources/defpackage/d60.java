package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d60 implements d53 {
    public final Bitmap a;

    public d60(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.d53
    public final int a() {
        return this.a.getHeight();
    }

    @Override // defpackage.d53
    public final int b() {
        return this.a.getWidth();
    }

    @Override // defpackage.d53
    public final boolean c() {
        return true;
    }

    @Override // defpackage.d53
    public final void d(Canvas canvas) {
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
    }

    @Override // defpackage.d53
    public final long e() {
        return ue3.s(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d60) && dh3.f(this.a, ((d60) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.a + ", shareable=true)";
    }
}
