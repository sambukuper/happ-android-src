package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yh extends u61 {
    public static final vz7 o0 = new vz7(new x((byte) 18));
    public static final wh p0 = new wh((byte) 0);
    public final Choreographer Z;
    public final Handler f0;
    public boolean k0;
    public boolean l0;
    public final ai n0;
    public final Object g0 = new Object();
    public final kt h0 = new kt();
    public ArrayList i0 = new ArrayList();
    public ArrayList j0 = new ArrayList();
    public final xh m0 = new xh(this);

    public yh(Choreographer choreographer, Handler handler) {
        this.Z = choreographer;
        this.f0 = handler;
        this.n0 = new ai(choreographer, this);
    }

    @Override // defpackage.u61
    public final void Z0(s61 s61Var, Runnable runnable) {
        synchronized (this.g0) {
            this.h0.addLast(runnable);
            if (!this.k0) {
                this.k0 = true;
                this.f0.post(this.m0);
                if (!this.l0) {
                    this.l0 = true;
                    this.Z.postFrameCallback(this.m0);
                }
            }
        }
    }

    public final void d1() {
        Runnable runnable;
        boolean z;
        do {
            synchronized (this.g0) {
                kt ktVar = this.h0;
                runnable = (Runnable) (ktVar.isEmpty() ? null : ktVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (this.g0) {
                    kt ktVar2 = this.h0;
                    runnable = (Runnable) (ktVar2.isEmpty() ? null : ktVar2.removeFirst());
                }
            }
            synchronized (this.g0) {
                if (this.h0.isEmpty()) {
                    z = false;
                    this.k0 = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
