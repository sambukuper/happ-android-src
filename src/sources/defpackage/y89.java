package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import io.sentry.c2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y89 extends o89 {
    public final z18 b;

    public y89(z18 z18Var) {
        super(4);
        this.b = z18Var;
    }

    @Override // defpackage.o89
    public final void d(Status status) {
        this.b.b(new pn(status));
    }

    @Override // defpackage.o89
    public final void e(Exception exc) {
        this.b.b(exc);
    }

    @Override // defpackage.o89
    public final void g(i89 i89Var) throws DeadObjectException {
        try {
            i(i89Var);
        } catch (DeadObjectException e) {
            d(o89.h(e));
            throw e;
        } catch (RemoteException e2) {
            d(o89.h(e2));
        } catch (RuntimeException e3) {
            this.b.b(e3);
        }
    }

    public final void i(i89 i89Var) {
        if (i89Var.l.remove(null) == null) {
            this.b.c(Boolean.FALSE);
        } else {
            c2.m();
        }
    }
}
