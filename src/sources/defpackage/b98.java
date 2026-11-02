package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b98 extends s65 {
    public TextureView e;
    public SurfaceTexture f;
    public ud0 g;
    public hy7 h;
    public boolean i;
    public SurfaceTexture j;
    public AtomicReference k;
    public mf1 l;

    @Override // defpackage.s65
    public final View c() {
        return this.e;
    }

    @Override // defpackage.s65
    public final Bitmap d() {
        TextureView textureView = this.e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.e.getBitmap();
    }

    @Override // defpackage.s65
    public final void e() {
        if (!this.i || this.j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.j;
        if (surfaceTexture != surfaceTexture2) {
            this.e.setSurfaceTexture(surfaceTexture2);
            this.j = null;
            this.i = false;
        }
    }

    @Override // defpackage.s65
    public final void f() {
        this.i = true;
    }

    @Override // defpackage.s65
    public final void g(hy7 hy7Var, mf1 mf1Var) {
        mf1 mf1Var2;
        Size size = hy7Var.b;
        this.b = size;
        FrameLayout frameLayout = (FrameLayout) this.c;
        size.getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.b).getWidth(), ((Size) this.b).getHeight()));
        this.e.setSurfaceTextureListener(new a98(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.e);
        hy7 hy7Var2 = this.h;
        if (hy7Var2 != null && hy7Var2.c() && (mf1Var2 = this.l) != null) {
            mf1Var2.c();
            this.l = null;
        }
        this.h = hy7Var;
        this.l = mf1Var;
        hy7Var.j.a(new sc4(this, hy7Var, (byte) 14), w79.y(this.e.getContext()));
        j();
    }

    @Override // defpackage.s65
    public final xb4 i() {
        qd0 qd0Var = new qd0();
        qd0Var.c = new if6();
        ud0 ud0Var = new ud0(qd0Var);
        qd0Var.b = ud0Var;
        qd0Var.a = p61.class;
        try {
            this.k.set(qd0Var);
            qd0Var.a = "textureViewImpl_waitForNextFrame";
            return ud0Var;
        } catch (Exception e) {
            ud0Var.b(e);
            return ud0Var;
        }
    }

    public final void j() {
        SurfaceTexture surfaceTexture;
        Size size = (Size) this.b;
        if (size == null || (surfaceTexture = this.f) == null || this.h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), ((Size) this.b).getHeight());
        Surface surface = new Surface(this.f);
        hy7 hy7Var = this.h;
        ud0 ud0VarU = u15.u(new jn0(this, surface, (byte) 15));
        this.g = ud0VarU;
        ud0VarU.Y.a(new rg0(this, surface, ud0VarU, hy7Var, (byte) 3), w79.y(this.e.getContext()));
        this.a = true;
        h();
    }
}
