package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eg implements ws5, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long j0;
    public final View X;
    public boolean Z;
    public boolean h0;
    public long i0;
    public final PriorityQueue Y = new PriorityQueue(11, new cg((byte) 0));
    public final Choreographer f0 = Choreographer.getInstance();
    public final dg g0 = new dg();

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    public eg(View view) {
        float refreshRate;
        this.X = view;
        if (j0 == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            j0 = (long) (1.0E9f / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.h0 = true;
        }
    }

    @Override // defpackage.ws5
    public final void a(vs5 vs5Var) {
        this.Y.add(new ju5(1, vs5Var));
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.X.post(this);
    }

    public final boolean b() {
        dg dgVar = this.g0;
        long jA = dgVar.a();
        wa.O(jA, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.Y;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((ju5) objPeek).b.b(dgVar)) {
                priorityQueue.poll();
                z = false;
            }
            dgVar.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.h0) {
            this.i0 = j;
            this.X.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.h0 = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.h0 = false;
        this.X.removeCallbacks(this);
        this.f0.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.Y;
        if (!priorityQueue.isEmpty() && this.Z && this.h0) {
            View view = this.X;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * j0) + nanos;
                dg dgVar = this.g0;
                dgVar.a = z;
                dgVar.b = Math.max(this.i0, nanos) + j0;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (dgVar.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.f0.postFrameCallback(this);
                } else {
                    this.Z = false;
                }
                wa.O(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.Z = false;
    }
}
