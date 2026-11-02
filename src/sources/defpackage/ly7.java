package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ly7 extends s65 {
    public SurfaceView e;
    public final ky7 f;

    public ly7(FrameLayout frameLayout, rt5 rt5Var) {
        super(frameLayout, rt5Var);
        this.f = new ky7(this);
    }

    @Override // defpackage.s65
    public final View c() {
        return this.e;
    }

    @Override // defpackage.s65
    public final Bitmap d() {
        SurfaceView surfaceView = this.e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.e.getHolder().getSurface().isValid()) {
            return null;
        }
        Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.e.getWidth(), this.e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.e, bitmapCreateBitmap, new jy7(semaphore, (byte) 0), new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                hi5.z0("SurfaceViewImpl");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException unused) {
            hi5.z0("SurfaceViewImpl");
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // defpackage.s65
    public final void g(hy7 hy7Var, mf1 mf1Var) {
        SurfaceView surfaceView = this.e;
        boolean zEquals = Objects.equals((Size) this.b, hy7Var.b);
        if (surfaceView == null || !zEquals) {
            Size size = hy7Var.b;
            this.b = size;
            FrameLayout frameLayout = (FrameLayout) this.c;
            size.getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.b).getWidth(), ((Size) this.b).getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.e);
            this.e.getHolder().addCallback(this.f);
        }
        Executor executorY = w79.y(this.e.getContext());
        hy7Var.j.a(new fl6(mf1Var, (byte) 8), executorY);
        this.e.post(new j0((Object) this, (Object) hy7Var, (Object) mf1Var, (byte) 16));
    }
}
