package defpackage;

import android.graphics.Matrix;
import android.media.Image;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ke implements n63 {
    public final Image X;
    public final wl6[] Y;
    public final oy Z;

    public ke(Image image) {
        this.X = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.Y = new wl6[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.Y[i] = new wl6((Object) planes[i], (byte) 6);
            }
        } else {
            this.Y = new wl6[0];
        }
        this.Z = new oy(d18.b, image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // defpackage.n63
    public final int a() {
        return this.X.getHeight();
    }

    @Override // defpackage.n63
    public final int b() {
        return this.X.getWidth();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.X.close();
    }

    @Override // defpackage.n63
    public final int getFormat() {
        return this.X.getFormat();
    }

    @Override // defpackage.n63
    public final m63[] n() {
        return this.Y;
    }

    @Override // defpackage.n63
    public final d63 r0() {
        return this.Z;
    }
}
