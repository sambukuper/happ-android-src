package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x89 extends o89 {
    public final y18 b;
    public final z18 c;
    public final ra d;

    public x89(int i, y18 y18Var, z18 z18Var, ra raVar) {
        super(i);
        this.c = z18Var;
        this.b = y18Var;
        this.d = raVar;
        if (i == 2 && y18Var.b) {
            bt.q("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.o89
    public final k82[] a(i89 i89Var) {
        return this.b.a;
    }

    @Override // defpackage.o89
    public final boolean b(i89 i89Var) {
        return this.b.b;
    }

    @Override // defpackage.o89
    public final int c(i89 i89Var) {
        return this.b.c;
    }

    @Override // defpackage.o89
    public final void d(Status status) {
        this.d.getClass();
        this.c.b(status.Z != null ? new hf6(status) : new pn(status));
    }

    @Override // defpackage.o89
    public final void e(Exception exc) {
        this.c.b(exc);
    }

    @Override // defpackage.o89
    public final void f(c89 c89Var, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) c89Var.Y;
        z18 z18Var = this.c;
        map.put(z18Var, boolValueOf);
        z18Var.a.a(new c89(c89Var, z18Var));
    }

    @Override // defpackage.o89
    public final void g(i89 i89Var) throws DeadObjectException {
        z18 z18Var = this.c;
        try {
            y18 y18Var = this.b;
            ((zc6) ((y18) y18Var.d).d).accept(i89Var.h, z18Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            d(o89.h(e2));
        } catch (RuntimeException e3) {
            z18Var.b(e3);
        }
    }
}
