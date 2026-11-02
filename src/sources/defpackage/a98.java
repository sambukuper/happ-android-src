package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a98 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ b98 a;

    public a98(b98 b98Var) {
        this.a = b98Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        hi5.z0("TextureViewImpl");
        b98 b98Var = this.a;
        b98Var.f = surfaceTexture;
        if (b98Var.g == null) {
            b98Var.j();
            return;
        }
        b98Var.h.getClass();
        Objects.toString(b98Var.h);
        hi5.z0("TextureViewImpl");
        b98Var.h.k.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b98 b98Var = this.a;
        b98Var.f = null;
        ud0 ud0Var = b98Var.g;
        if (ud0Var == null) {
            hi5.z0("TextureViewImpl");
            return true;
        }
        xd6 xd6Var = new xd6((byte) 17, this, surfaceTexture, false);
        ud0Var.a(new zo2(ud0Var, xd6Var, (byte) 0), w79.y(b98Var.e.getContext()));
        b98Var.j = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        hi5.z0("TextureViewImpl");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        qd0 qd0Var = (qd0) this.a.k.getAndSet(null);
        if (qd0Var != null) {
            qd0Var.b(null);
        }
    }
}
