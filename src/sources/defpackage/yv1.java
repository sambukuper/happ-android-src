package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yv1 implements d53 {
    public final Drawable a;

    public yv1(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.d53
    public final int a() {
        return at8.a(this.a);
    }

    @Override // defpackage.d53
    public final int b() {
        return at8.b(this.a);
    }

    @Override // defpackage.d53
    public final boolean c() {
        return false;
    }

    @Override // defpackage.d53
    public final void d(Canvas canvas) {
        this.a.draw(canvas);
    }

    @Override // defpackage.d53
    public final long e() {
        Drawable drawable = this.a;
        long jB = ((long) at8.b(drawable)) * 4 * ((long) at8.a(drawable));
        if (jB < 0) {
            return 0L;
        }
        return jB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yv1) && dh3.f(this.a, ((yv1) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
