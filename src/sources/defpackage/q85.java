package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class q85 {
    public final o85 X;

    public q85(o85 o85Var) {
        this.X = o85Var;
    }

    public static q85 c(o85 o85Var) {
        return new q85(jr6.a(o85Var));
    }

    public final void a(w4 w4Var) {
        m5 m5Var = new m5(w4Var);
        if (this.X == null) {
            bt.i("onSubscribe function can not be null.");
            return;
        }
        cv6 cv6Var = new cv6(m5Var);
        try {
            o85 o85Var = this.X;
            mr6.c.b().getClass();
            o85Var.mo8a(cv6Var);
            mr6.c.b().getClass();
        } catch (Throwable th) {
            vr3.c0(th);
            if (cv6Var.X.Y) {
                jr6.b(jr6.c(th));
                return;
            }
            try {
                cv6Var.onError(jr6.c(th));
            } catch (Throwable th2) {
                vr3.c0(th2);
                ja5 ja5Var = new ja5("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                jr6.c(ja5Var);
                throw ja5Var;
            }
        }
    }

    public final void d(aq7 aq7Var) {
        try {
            aq7Var.d();
            o85 o85Var = this.X;
            mr6.c.b().getClass();
            o85Var.mo8a(aq7Var);
            mr6.c.b().getClass();
        } catch (Throwable th) {
            vr3.c0(th);
            try {
                aq7Var.onError(jr6.c(th));
            } catch (Throwable th2) {
                vr3.c0(th2);
                ja5 ja5Var = new ja5("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                jr6.c(ja5Var);
                throw ja5Var;
            }
        }
    }
}
