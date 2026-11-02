package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.dto.ExcludeSettingsCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class m52 extends xw8 {
    public final vz7 b = new vz7(new w01((byte) 25));
    public final oh7 c;
    public final h76 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m52() {
        oh7 oh7VarA = ph7.a(new k52("", km5.f0));
        this.c = oh7VarA;
        this.d = jm4.n(oh7VarA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void e(s51 s51Var) {
        l52 l52Var;
        if (s51Var instanceof l52) {
            l52Var = (l52) s51Var;
            int i = l52Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                l52Var.h0 = i - Integer.MIN_VALUE;
            } else {
                l52Var = new l52(this, s51Var);
            }
        } else {
            l52Var = new l52(this, s51Var);
        }
        Object obj = l52Var.f0;
        int i2 = l52Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            h76 h76Var = f().c;
            k kVar = new k(this, (q51) null, (byte) 10);
            h76Var.getClass();
            l52Var.h0 = 1;
            if (z91.n(h76Var, kVar, l52Var) == c71.X) {
                return;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            w39.n0(obj);
        }
        bt.i("SharedFlow never completes, this call should never return.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final u42 f() {
        return (u42) this.b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final dn8 g(String str, ub ubVar, ub ubVar2) {
        rj6 rj6Var;
        Object next;
        Object value;
        rj6 rj6Var2 = dn8.a;
        str.getClass();
        u42 u42VarF = f();
        oh7 oh7Var = u42VarF.b;
        try {
            Iterator it = ((Iterable) oh7Var.getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!dh3.f(((ExcludeSettingsCache) next).getValue(), str));
            ExcludeSettingsCache excludeSettingsCache = (ExcludeSettingsCache) next;
            if (excludeSettingsCache != null) {
                do {
                    value = oh7Var.getValue();
                } while (!oh7Var.k(value, q57.X((Set) value, excludeSettingsCache)));
                w39.n0(u42VarF.d());
            }
            rj6Var = rj6Var2;
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (sj6.a(rj6Var) == null) {
            if (ubVar != null) {
                ubVar.invoke();
                return rj6Var2;
            }
        } else if (ubVar2 != null) {
            ubVar2.invoke();
            return rj6Var2;
        }
        return null;
    }
}
