package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z18 {
    public final fb9 a = new fb9();

    public final void a(Object obj) {
        this.a.j(obj);
    }

    public final void b(Exception exc) {
        fb9 fb9Var = this.a;
        w45.t(exc, "Exception must not be null");
        synchronized (fb9Var.a) {
            try {
                if (fb9Var.c) {
                    return;
                }
                fb9Var.c = true;
                fb9Var.f = exc;
                fb9Var.b.t(fb9Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        fb9 fb9Var = this.a;
        synchronized (fb9Var.a) {
            try {
                if (fb9Var.c) {
                    return;
                }
                fb9Var.c = true;
                fb9Var.e = obj;
                fb9Var.b.t(fb9Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
