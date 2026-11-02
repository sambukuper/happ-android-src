package defpackage;

import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ag0 implements fh0 {
    public final /* synthetic */ CountDownLatch a;
    public final /* synthetic */ pv b;
    public final /* synthetic */ Surface c;
    public final /* synthetic */ SurfaceTexture d;

    public ag0(CountDownLatch countDownLatch, pv pvVar, Surface surface, SurfaceTexture surfaceTexture) {
        this.a = countDownLatch;
        this.b = pvVar;
        this.c = surface;
        this.d = surfaceTexture;
    }

    @Override // defpackage.fh0
    public final void d(gh0 gh0Var) {
        if (this.b.a()) {
            this.c.release();
            this.d.release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fh0
    public final void g(gh0 gh0Var) throws Exception {
        boolean zIsTerminated;
        if (gh0Var instanceof AutoCloseable) {
            gh0Var.close();
        } else if (gh0Var instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) gh0Var;
            if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z = false;
                while (!zIsTerminated) {
                    try {
                        zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        } else if (gh0Var instanceof TypedArray) {
            ((TypedArray) gh0Var).recycle();
        } else if (gh0Var instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) gh0Var).release();
        } else {
            if (!(gh0Var instanceof MediaDrm)) {
                kp5.e();
                return;
            }
            ((MediaDrm) gh0Var).release();
        }
        this.a.countDown();
    }

    @Override // defpackage.fh0
    public final void h(gh0 gh0Var) {
        if (this.b.a()) {
            this.c.release();
            this.d.release();
        }
        this.a.countDown();
    }

    @Override // defpackage.n57
    public final void a() {
    }

    @Override // defpackage.n57
    public final void b() {
    }

    @Override // defpackage.fh0
    public final void c(gh0 gh0Var) {
    }

    @Override // defpackage.fh0
    public final void e(gh0 gh0Var) {
    }

    @Override // defpackage.fh0
    public final void f(gh0 gh0Var) {
    }
}
