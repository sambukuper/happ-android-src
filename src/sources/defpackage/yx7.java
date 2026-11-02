package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yx7 implements AutoCloseable {
    public final cl7 X;
    public final v06 Y;
    public final jl0 Z;
    public final Map f0;
    public final Object g0;
    public final LinkedHashMap h0;
    public final LinkedHashMap i0;
    public boolean j0;
    public boolean k0;

    public yx7(cl7 cl7Var, yr2 yr2Var, jl0 jl0Var, Map map) {
        yr2Var.getClass();
        map.getClass();
        this.X = cl7Var;
        this.Y = yr2Var;
        this.Z = jl0Var;
        this.f0 = map;
        this.g0 = new Object();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ((o63) entry.getValue()).getClass();
            linkedHashMap.put(key, null);
        }
        this.h0 = linkedHashMap;
        this.i0 = new LinkedHashMap();
        this.j0 = true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean zIsTerminated;
        synchronized (this.g0) {
            if (this.k0) {
                return;
            }
            this.k0 = true;
            this.h0.clear();
            List<AutoCloseable> listY0 = wv0.Y0(this.i0.values());
            this.i0.clear();
            for (AutoCloseable autoCloseable : listY0) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
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
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        kp5.e();
                        return;
                    }
                    ((MediaDrm) autoCloseable).release();
                }
            }
        }
    }

    public final void g() {
        Map linkedHashMap;
        synchronized (this.g0) {
            linkedHashMap = new LinkedHashMap();
            loop0: for (al7 al7Var : this.X.Z) {
                for (fl0 fl0Var : al7Var.l) {
                    Surface surface = (Surface) this.h0.get(new dl7(fl0Var.a));
                    if (surface == null) {
                        if (!(al7Var.f != null)) {
                            linkedHashMap = e02.X;
                            break loop0;
                        }
                    } else {
                        linkedHashMap.put(new dl7(fl0Var.a), surface);
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        ef0 ef0Var = (ef0) this.Y.get();
        ef0Var.getClass();
        synchronized (ef0Var.q) {
            if (ef0Var.c()) {
                return;
            }
            ef0Var.A = linkedHashMap;
            sn0 sn0Var = ef0Var.z;
            if (sn0Var != null) {
                sn0Var.j(linkedHashMap);
            }
        }
    }

    public final void k() {
        synchronized (this.g0) {
            try {
                if (this.k0) {
                    throw new IllegalStateException("Check failed.");
                }
                for (Surface surface : this.h0.values()) {
                    this.i0.put(surface, this.Z.a(surface));
                }
                this.j0 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() throws Exception {
        List<AutoCloseable> listY0;
        boolean zIsTerminated;
        synchronized (this.g0) {
            this.j0 = false;
            listY0 = wv0.Y0(this.i0.values());
            this.i0.clear();
        }
        for (AutoCloseable autoCloseable : listY0) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
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
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    kp5.e();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
    }
}
