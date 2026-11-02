package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.view.PixelCopy;
import android.view.Surface;
import defpackage.jy7;
import defpackage.u15;
import io.sentry.android.replay.d0;
import io.sentry.s5;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ b Y;

    public /* synthetic */ a(b bVar, byte b) {
        this.X = b;
        this.Y = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        b bVar = this.Y;
        switch (b) {
            case 0:
                if (bVar.k.get()) {
                    bVar.c.getLogger().h(s5.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
                    return;
                }
                Picture picture = (Picture) bVar.f.getAndSet(null);
                if (picture == null) {
                    return;
                }
                try {
                    Canvas canvasLockHardwareCanvas = bVar.m.lockHardwareCanvas();
                    try {
                        canvasLockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                        picture.draw(canvasLockHardwareCanvas);
                        bVar.m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                        if (bVar.e == null) {
                            io.sentry.util.a aVar = bVar.g;
                            aVar.g();
                            try {
                                if (bVar.e == null) {
                                    d0 d0Var = bVar.d;
                                    bVar.e = Bitmap.createBitmap(d0Var.a, d0Var.b, Bitmap.Config.RGB_565);
                                }
                                u15.h(aVar, null);
                                break;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    u15.h(aVar, th);
                                    throw th2;
                                }
                            }
                        }
                        if (bVar.k.get()) {
                            bVar.c.getLogger().h(s5.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                            return;
                        }
                        Surface surface = bVar.m;
                        Bitmap bitmap = bVar.e;
                        bitmap.getClass();
                        PixelCopy.request(surface, bitmap, new jy7(bVar, (byte) 1), bVar.a.m());
                        return;
                    } catch (Throwable th3) {
                        bVar.m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    bVar.c.getLogger().e(s5.ERROR, "Canvas Strategy: picture render failed", th4);
                    bVar.i.set(false);
                    return;
                }
            default:
                Bitmap bitmap2 = bVar.e;
                if (bitmap2 != null) {
                    synchronized (bitmap2) {
                        if (!bitmap2.isRecycled()) {
                            bitmap2.recycle();
                        }
                        break;
                    }
                }
                bVar.m.release();
                bVar.l.release();
                return;
        }
    }
}
