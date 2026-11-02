package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import defpackage.cb0;
import defpackage.g44;
import defpackage.hg;
import defpackage.w74;
import defpackage.x97;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.m;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.d0;
import io.sentry.android.replay.k0;
import io.sentry.s5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements j {
    public final ReplayIntegration a;
    public final SentryAndroidOptions b;
    public final d0 c;
    public final hg d;
    public final ScheduledExecutorService e;
    public final io.sentry.d f;
    public final Bitmap g;
    public final g44 h;
    public final AtomicBoolean i;
    public final io.sentry.android.replay.util.f j;
    public final AtomicBoolean k;
    public final AtomicInteger l;
    public final AtomicBoolean m;
    public final AtomicBoolean n;
    public final g44 o;
    public final g44 p;
    public final Rect q;
    public final RectF r;
    public final int[] s;
    public final int[] t;

    public i(k0 k0Var, ReplayIntegration replayIntegration, SentryAndroidOptions sentryAndroidOptions, d0 d0Var, io.sentry.android.replay.util.b bVar, hg hgVar) {
        k0Var.getClass();
        this.a = replayIntegration;
        this.b = sentryAndroidOptions;
        this.c = d0Var;
        this.d = hgVar;
        this.e = k0Var.g0;
        this.f = k0Var.f0;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(d0Var.a, d0Var.b, sentryAndroidOptions.getSessionReplay().o ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        bitmapCreateBitmap.getClass();
        this.g = bitmapCreateBitmap;
        h hVar = new h(this, (byte) 0);
        w74 w74Var = w74.Y;
        this.h = x97.P(w74Var, hVar);
        this.i = new AtomicBoolean(false);
        this.j = new io.sentry.android.replay.util.f();
        this.k = new AtomicBoolean(false);
        this.l = new AtomicInteger(0);
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.o = x97.P(w74Var, g.Y);
        this.p = x97.P(w74Var, new h(this, (byte) 1));
        this.q = new Rect();
        this.r = new RectF();
        this.s = new int[2];
        this.t = new int[2];
    }

    public static final void f(AtomicInteger atomicInteger, final i iVar, final View view, final cb0[] cb0VarArr, final io.sentry.android.replay.viewhierarchy.g gVar, final int i, final int i2, final boolean z) {
        if (atomicInteger.decrementAndGet() == 0 && iVar.e.submit(new io.sentry.android.replay.util.h(new Runnable() { // from class: io.sentry.android.replay.screenshot.f
            /* JADX WARN: Code duplicated, block: B:18:0x0098  */
            @Override // java.lang.Runnable
            public final void run() {
                int i3;
                int i4;
                i iVar2 = this.X;
                int i5 = i;
                int i6 = i2;
                View view2 = view;
                io.sentry.android.replay.viewhierarchy.g gVar2 = gVar;
                boolean z2 = z;
                try {
                    boolean z3 = iVar2.m.get();
                    cb0[] cb0VarArr2 = cb0VarArr;
                    if (!z3 && !iVar2.g.isRecycled()) {
                        int i7 = 0;
                        for (int length = cb0VarArr2.length; i7 < length; length = length) {
                            cb0 cb0Var = cb0VarArr2[i7];
                            if (cb0Var != null) {
                                Bitmap bitmap = (Bitmap) cb0Var.f0;
                                if (bitmap.isRecycled()) {
                                    i3 = i5;
                                    i4 = i6;
                                } else {
                                    Canvas canvas = (Canvas) iVar2.p.getValue();
                                    Paint paint = (Paint) iVar2.o.getValue();
                                    Rect rect = iVar2.q;
                                    RectF rectF = iVar2.r;
                                    int i8 = cb0Var.Y;
                                    int i9 = cb0Var.Z;
                                    i3 = i5;
                                    d0 d0Var = iVar2.c;
                                    i4 = i6;
                                    float f = d0Var.c;
                                    float f2 = d0Var.d;
                                    canvas.getClass();
                                    paint.getClass();
                                    rect.getClass();
                                    rectF.getClass();
                                    float f3 = (i8 - i3) * f;
                                    float f4 = (i9 - i4) * f2;
                                    rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                    rectF.set(f3, f4, (bitmap.getWidth() * f) + f3, (bitmap.getHeight() * f2) + f4);
                                    canvas.drawBitmap(bitmap, rect, rectF, paint);
                                    bitmap.recycle();
                                }
                            } else {
                                i3 = i5;
                                i4 = i6;
                            }
                            i7++;
                            i5 = i3;
                            i6 = i4;
                        }
                        iVar2.d(view2, gVar2, z2);
                        iVar2.h();
                        return;
                    }
                    iVar2.b.getLogger().h(s5.DEBUG, "PixelCopyStrategy is closed, skipping compositing", new Object[0]);
                    for (cb0 cb0Var2 : cb0VarArr2) {
                        if (cb0Var2 != null) {
                            Bitmap bitmap2 = (Bitmap) cb0Var2.f0;
                            if (!bitmap2.isRecycled()) {
                                bitmap2.recycle();
                            }
                        }
                    }
                    iVar2.h();
                } catch (Throwable th) {
                    iVar2.h();
                    throw th;
                }
            }
        }, "screenshot_recorder.composite")) == null) {
            for (cb0 cb0Var : cb0VarArr) {
                if (cb0Var != null) {
                    Bitmap bitmap = (Bitmap) cb0Var.f0;
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
            }
            iVar.h();
        }
    }

    @Override // io.sentry.android.replay.screenshot.j
    public final boolean a() {
        return this.i.get();
    }

    @Override // io.sentry.android.replay.screenshot.j
    public final void b(View view) throws IllegalAccessException {
        Window windowK = io.sentry.config.a.k(view);
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (windowK == null) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (!this.n.compareAndSet(false, true)) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "PixelCopyStrategy capture is already in flight, skipping", new Object[0]);
            this.d.invoke();
            return;
        }
        if (this.m.get()) {
            sentryAndroidOptions.getLogger().h(s5.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            h();
            return;
        }
        try {
            this.k.set(false);
            PixelCopy.request(windowK, this.g, new m(this, view, (byte) 1), (Handler) this.f.Y);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().e(s5.WARNING, "Failed to capture replay recording", th);
            this.l.set(0);
            this.i.set(false);
            h();
        }
    }

    @Override // io.sentry.android.replay.screenshot.j
    public final void c() {
        if (this.n.compareAndSet(false, true)) {
            if (!this.i.get() || this.g.isRecycled()) {
                h();
                return;
            }
            if (this.e.submit(new io.sentry.android.replay.util.h(new c(this, (byte) 1), "PixelCopyStrategy.emit")) == null) {
                h();
            }
        }
    }

    @Override // io.sentry.android.replay.screenshot.j
    public final void close() {
        this.m.set(true);
        this.l.set(0);
        g();
    }

    public final void d(View view, io.sentry.android.replay.viewhierarchy.g gVar, boolean z) {
        boolean z2 = this.m.get();
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (!z2) {
            Bitmap bitmap = this.g;
            if (!bitmap.isRecycled()) {
                this.j.g(bitmap, gVar, (Matrix) this.h.getValue());
                sentryAndroidOptions.getReplayController().getClass();
                this.a.u0(bitmap);
                this.i.set(true);
                this.k.set(false);
                if (z) {
                    this.l.set(0);
                    return;
                }
                return;
            }
        }
        sentryAndroidOptions.getLogger().h(s5.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    public final void e(final View view, ArrayList arrayList, final io.sentry.android.replay.viewhierarchy.g gVar, final boolean z) {
        cb0[] cb0VarArr;
        final i iVar;
        SurfaceHolder holder;
        i iVar2 = this;
        int[] iArr = iVar2.t;
        int[] iArr2 = iVar2.s;
        view.getLocationOnScreen(iArr2);
        char c = 0;
        int i = iArr2[0];
        int i2 = iArr2[1];
        cb0[] cb0VarArr2 = new cb0[arrayList.size()];
        AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
        Iterator it = arrayList.iterator();
        final cb0[] cb0VarArr3 = cb0VarArr2;
        final int i3 = 0;
        while (it.hasNext()) {
            int i4 = i3 + 1;
            SurfaceView surfaceView = (SurfaceView) ((io.sentry.android.replay.viewhierarchy.e) it.next()).h.get();
            final Bitmap bitmapCreateBitmap = null;
            Surface surface = (surfaceView == null || (holder = surfaceView.getHolder()) == null) ? null : holder.getSurface();
            if (surfaceView == null || surface == null) {
                iVar2 = this;
            } else {
                if (surface.isValid()) {
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                        try {
                            surfaceView.getLocationOnScreen(iArr);
                            try {
                                final int i5 = iArr[c];
                                final int i6 = i;
                                try {
                                    final int i7 = iArr[1];
                                    final int i8 = i2;
                                    final AtomicInteger atomicInteger2 = atomicInteger;
                                    iVar = this;
                                    try {
                                        PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener = new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.e
                                            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                            public final void onPixelCopyFinished(int i9) {
                                                i iVar3 = this.a;
                                                boolean z2 = iVar3.m.get();
                                                Bitmap bitmap = bitmapCreateBitmap;
                                                cb0[] cb0VarArr4 = cb0VarArr3;
                                                AtomicInteger atomicInteger3 = atomicInteger2;
                                                View view2 = view;
                                                io.sentry.android.replay.viewhierarchy.g gVar2 = gVar;
                                                int i10 = i6;
                                                int i11 = i8;
                                                boolean z3 = z;
                                                if (z2) {
                                                    bitmap.recycle();
                                                    i.f(atomicInteger3, iVar3, view2, cb0VarArr4, gVar2, i10, i11, z3);
                                                    return;
                                                }
                                                if (i9 == 0) {
                                                    cb0VarArr4[i3] = new cb0(bitmap, i5, i7);
                                                } else {
                                                    bitmap.recycle();
                                                    iVar3.b.getLogger().h(s5.INFO, "Failed to capture SurfaceView: %d", Integer.valueOf(i9));
                                                }
                                                i.f(atomicInteger3, iVar3, view2, cb0VarArr4, gVar2, i10, i11, z3);
                                            }
                                        };
                                        atomicInteger = atomicInteger2;
                                        i = i6;
                                        i2 = i8;
                                        try {
                                            PixelCopy.request(surfaceView, bitmapCreateBitmap, onPixelCopyFinishedListener, (Handler) iVar.f.Y);
                                            atomicInteger = atomicInteger;
                                        } catch (Throwable th) {
                                            th = th;
                                            bitmapCreateBitmap = bitmapCreateBitmap;
                                            iVar.b.getLogger().e(s5.WARNING, "Failed to capture SurfaceView", th);
                                            if (bitmapCreateBitmap != null) {
                                                bitmapCreateBitmap.recycle();
                                            }
                                            i iVar3 = iVar;
                                            atomicInteger = atomicInteger;
                                            cb0VarArr = cb0VarArr3;
                                            f(atomicInteger, iVar3, view, cb0VarArr, gVar, i, i2, z);
                                            cb0VarArr3 = cb0VarArr;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        atomicInteger = atomicInteger2;
                                        i = i6;
                                        i2 = i8;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    i = i6;
                                    iVar = this;
                                    bitmapCreateBitmap = bitmapCreateBitmap;
                                    iVar.b.getLogger().e(s5.WARNING, "Failed to capture SurfaceView", th);
                                    if (bitmapCreateBitmap != null) {
                                        bitmapCreateBitmap.recycle();
                                    }
                                    i iVar4 = iVar;
                                    atomicInteger = atomicInteger;
                                    cb0VarArr = cb0VarArr3;
                                    f(atomicInteger, iVar4, view, cb0VarArr, gVar, i, i2, z);
                                    cb0VarArr3 = cb0VarArr;
                                    c = 0;
                                    iVar2 = this;
                                    i3 = i4;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            atomicInteger = atomicInteger;
                            iVar = iVar2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        atomicInteger = atomicInteger;
                        iVar = iVar2;
                    }
                    c = 0;
                    iVar2 = this;
                    i3 = i4;
                }
                cb0VarArr3 = cb0VarArr;
                c = 0;
                iVar2 = this;
                i3 = i4;
            }
            cb0VarArr = cb0VarArr3;
            f(atomicInteger, iVar2, view, cb0VarArr, gVar, i, i2, z);
            cb0VarArr3 = cb0VarArr;
            c = 0;
            iVar2 = this;
            i3 = i4;
        }
    }

    public final void g() {
        if (this.n.compareAndSet(false, true)) {
            io.sentry.android.replay.util.h hVar = new io.sentry.android.replay.util.h(new c(this, (byte) 0), "PixelCopyStrategy.close");
            if (this.e.submit(hVar) == null) {
                hVar.run();
            }
        }
    }

    public final void h() {
        this.n.set(false);
        if (this.m.get()) {
            g();
        }
    }

    @Override // io.sentry.android.replay.screenshot.j
    public final void onContentChanged() {
        this.k.set(true);
    }
}
