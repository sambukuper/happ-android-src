package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ky0 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long X = SystemClock.uptimeMillis() + 10000;
    public Runnable Y;
    public boolean Z;
    public final /* synthetic */ ComponentActivity f0;

    public ky0(ComponentActivity componentActivity) {
        this.f0 = componentActivity;
    }

    public final void a(View view) {
        if (this.Z) {
            return;
        }
        this.Z = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.Y = runnable;
        View decorView = this.f0.getWindow().getDecorView();
        decorView.getClass();
        if (!this.Z) {
            decorView.postOnAnimation(new c1(this, (byte) 12));
        } else if (dh3.f(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.Y;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.X) {
                this.Z = false;
                this.f0.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.Y = null;
        bn2 bn2Var = (bn2) this.f0.i0.getValue();
        synchronized (bn2Var.b) {
            z = bn2Var.c;
        }
        if (z) {
            this.Z = false;
            this.f0.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f0.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
