package defpackage;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import io.sentry.android.replay.screenshot.b;
import io.sentry.s5;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jy7 implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jy7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Semaphore semaphore = (Semaphore) obj;
                if (i == 0) {
                    hi5.z0("SurfaceViewImpl");
                } else {
                    hi5.z0("SurfaceViewImpl");
                }
                semaphore.release();
                break;
            default:
                b bVar = (b) obj;
                if (!bVar.k.get()) {
                    if (i != 0) {
                        bVar.c.getLogger().h(s5.ERROR, pc6.j(i, "Canvas Strategy: PixelCopy failed with code "), new Object[0]);
                        bVar.i.set(false);
                        break;
                    } else {
                        bVar.i.set(true);
                        Bitmap bitmap = bVar.e;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            bVar.b.u0(bitmap);
                            break;
                        }
                    }
                } else {
                    bVar.c.getLogger().h(s5.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
                    break;
                }
                break;
        }
    }
}
