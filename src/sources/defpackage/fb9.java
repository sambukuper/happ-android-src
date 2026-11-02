package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fb9 {
    public final Object a = new Object();
    public final o8 b = new o8((byte) 13);
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    public final void a(fa5 fa5Var) {
        this.b.r(new na9(b28.a, fa5Var));
        n();
    }

    public final void b(Executor executor, fa5 fa5Var) {
        this.b.r(new na9(executor, fa5Var));
        n();
    }

    public final void c(Executor executor, ab5 ab5Var) {
        this.b.r(new na9(executor, ab5Var));
        n();
    }

    public final fb9 d(Executor executor, r51 r51Var) {
        fb9 fb9Var = new fb9();
        this.b.r(new ga9(executor, r51Var, fb9Var, (byte) 0));
        n();
        return fb9Var;
    }

    public final fb9 e(Executor executor, r51 r51Var) {
        fb9 fb9Var = new fb9();
        this.b.r(new ga9(executor, r51Var, fb9Var, (byte) 1));
        n();
        return fb9Var;
    }

    public final Exception f() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    public final Object g() {
        Object obj;
        synchronized (this.a) {
            try {
                if (!this.c) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new er6(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void j(Object obj) {
        synchronized (this.a) {
            m();
            this.c = true;
            this.e = obj;
        }
        this.b.t(this);
    }

    public final void k(Exception exc) {
        w45.t(exc, "Exception must not be null");
        synchronized (this.a) {
            m();
            this.c = true;
            this.f = exc;
        }
        this.b.t(this);
    }

    public final void l() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.t(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        String strConcat;
        if (this.c) {
            if (!h()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excF = f();
            if (excF != null) {
                strConcat = "failure";
            } else if (i()) {
                strConcat = "result ".concat(String.valueOf(g()));
            } else {
                strConcat = this.d ? "cancellation" : "unknown issue";
            }
        }
    }

    public final void n() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.t(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
