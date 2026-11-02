package defpackage;

import android.media.ImageWriter;
import io.sentry.c2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class me implements ImageWriter.OnImageReleasedListener, bo8, AutoCloseable {
    public final ImageWriter X;
    public final int Y;
    public final tv Z = nr4.g(null);

    public me(ImageWriter imageWriter, int i) {
        this.X = imageWriter;
        this.Y = i;
        imageWriter.getMaxImages();
        imageWriter.getFormat();
    }

    @Override // defpackage.bo8
    public final Object C0(zu3 zu3Var) {
        zu3Var.getClass();
        if (zu3Var.equals(yb6.a.b(ImageWriter.class))) {
            return this.X;
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.X.close();
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(ImageWriter imageWriter) {
        if (this.Z.a == null) {
            return;
        }
        c2.m();
    }

    public final String toString() {
        return "ImageWriter-" + yk7.a(this.X.getFormat()) + '-' + ((Object) ("Input-" + this.Y));
    }
}
