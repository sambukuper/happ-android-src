package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import io.sentry.c2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o89 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public o89(int i) {
        this.a = i;
    }

    public static Status h(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public k82[] a(i89 i89Var) {
        if (i89Var.l.get(null) == null) {
            return null;
        }
        c2.m();
        return null;
    }

    public boolean b(i89 i89Var) {
        if (i89Var.l.get(null) == null) {
            return false;
        }
        c2.m();
        return false;
    }

    public int c(i89 i89Var) {
        if (i89Var.l.get(null) == null) {
            return -1;
        }
        c2.m();
        return 0;
    }

    public abstract void d(Status status);

    public abstract void e(Exception exc);

    public abstract void g(i89 i89Var);

    public /* bridge */ /* synthetic */ void f(c89 c89Var, boolean z) {
    }
}
