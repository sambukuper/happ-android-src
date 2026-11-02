package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cx1 implements cy7, SurfaceTexture.OnFrameAvailableListener {
    public final ax1 a;
    public final HandlerThread b;
    public final lv2 c;
    public final Handler d;
    public int e;
    public boolean f;
    public final AtomicBoolean g;
    public final LinkedHashMap h;
    public SurfaceTexture i;
    public SurfaceTexture j;

    public cx1(px1 px1Var, dq dqVar, dq dqVar2) {
        Map map = Collections.EMPTY_MAP;
        this.e = 0;
        this.f = false;
        this.g = new AtomicBoolean(false);
        this.h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new lv2(handler);
        this.a = new ax1(dqVar, dqVar2);
        try {
            f(px1Var);
        } catch (RuntimeException e) {
            a();
            throw e;
        }
    }

    @Override // defpackage.cy7
    public final void a() {
        if (this.g.getAndSet(true)) {
            return;
        }
        e(new c1(this, (byte) 18), new v7((byte) 5));
    }

    @Override // defpackage.cy7
    public final void b(hy7 hy7Var) {
        if (this.g.get()) {
            hy7Var.c();
        } else {
            e(new sc(this, hy7Var, (byte) 21), new ig1(hy7Var, (byte) 0));
        }
    }

    @Override // defpackage.cy7
    public final void c(by7 by7Var) {
        if (this.g.get()) {
            by7Var.close();
        } else {
            e(new sc(this, by7Var, (byte) 22), new c1(by7Var, (byte) 15));
        }
    }

    public final void d() {
        if (this.f && this.e == 0) {
            LinkedHashMap linkedHashMap = this.h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((by7) it.next()).close();
            }
            linkedHashMap.clear();
            this.a.h();
            this.b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new j0((Object) this, (Object) runnable2, (Object) runnable, (byte) 10));
        } catch (RejectedExecutionException unused) {
            hi5.z0("DualSurfaceProcessor");
            runnable2.run();
        }
    }

    public final void f(px1 px1Var) {
        Map map = Collections.EMPTY_MAP;
        qd0 qd0Var = new qd0();
        qd0Var.c = new if6();
        ud0 ud0Var = new ud0(qd0Var);
        qd0Var.b = ud0Var;
        qd0Var.a = p61.class;
        try {
            e(new j0(this, px1Var, qd0Var), new v7((byte) 5));
            qd0Var.a = "Init GlRenderer";
        } catch (Exception e) {
            ud0Var.b(e);
        }
        try {
            ud0Var.get();
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.g.get() || (surfaceTexture2 = this.i) == null || this.j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.j.updateTexImage();
        for (Map.Entry entry : this.h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            by7 by7Var = (by7) entry.getKey();
            if (by7Var.Z == 34) {
                try {
                    this.a.m(surfaceTexture.getTimestamp(), surface, by7Var, this.i, this.j);
                } catch (RuntimeException unused) {
                    hi5.z0("DualSurfaceProcessor");
                }
            }
        }
    }
}
