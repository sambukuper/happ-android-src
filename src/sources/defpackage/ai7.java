package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ai7 implements Runnable {
    public static final Object j0 = new Object();
    public final Executor X;
    public final n85 Y;
    public final AtomicReference f0;
    public final AtomicBoolean Z = new AtomicBoolean(true);
    public Object g0 = j0;
    public int h0 = -1;
    public boolean i0 = false;

    public ai7(AtomicReference atomicReference, Executor executor, n85 n85Var) {
        this.f0 = atomicReference;
        this.X = executor;
        this.Y = n85Var;
    }

    public final void a(int i) {
        synchronized (this) {
            try {
                if (this.Z.get()) {
                    if (i <= this.h0) {
                        return;
                    }
                    this.h0 = i;
                    if (this.i0) {
                        return;
                    }
                    this.i0 = true;
                    try {
                        this.X.execute(this);
                    } catch (Throwable unused) {
                        synchronized (this) {
                            this.i0 = false;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.Z.get()) {
                    this.i0 = false;
                    return;
                }
                Object obj = this.f0.get();
                int i = this.h0;
                while (true) {
                    if (!Objects.equals(this.g0, obj)) {
                        this.g0 = obj;
                        boolean z = obj instanceof hz;
                        n85 n85Var = this.Y;
                        if (z) {
                            n85Var.onError(null);
                        } else {
                            n85Var.a(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i == this.h0 || !this.Z.get()) {
                                break;
                                break;
                            } else {
                                obj = this.f0.get();
                                i = this.h0;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.i0 = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
