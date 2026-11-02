package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qd0 {
    public Object a;
    public ud0 b;
    public if6 c;
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        if6 if6Var = this.c;
        if (if6Var != null) {
            if6Var.a(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        this.d = true;
        ud0 ud0Var = this.b;
        boolean z = ud0Var != null && ud0Var.Y.j(obj);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void c() {
        this.d = true;
        ud0 ud0Var = this.b;
        if (ud0Var == null || !ud0Var.Y.cancel(true)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final boolean d(Throwable th) {
        this.d = true;
        ud0 ud0Var = this.b;
        boolean z = ud0Var != null && ud0Var.Y.k(th);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void finalize() {
        if6 if6Var;
        ud0 ud0Var = this.b;
        if (ud0Var != null && !ud0Var.Y.isDone()) {
            ud0Var.b(new rd0("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
        }
        if (this.d || (if6Var = this.c) == null) {
            return;
        }
        if6Var.j(null);
    }
}
