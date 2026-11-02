package defpackage;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eb5 extends wb4 {
    public final /* synthetic */ byte e = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb5(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        timeUnit.getClass();
        l49 l49Var = (l49) this.c;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            lh4.P0().getClass();
        }
        long j2 = millis < 900000 ? 900000L : millis;
        long j3 = millis < 900000 ? 900000L : millis;
        if (j2 < 900000) {
            lh4.P0().getClass();
        }
        l49Var.h = j2 >= 900000 ? j2 : 900000L;
        if (j3 < 300000) {
            lh4.P0().getClass();
        }
        if (j3 > l49Var.h) {
            lh4.P0().getClass();
        }
        l49Var.i = x97.p(j3, 300000L, l49Var.h);
    }

    @Override // defpackage.wb4
    public final g49 b() {
        byte b = this.e;
        Object obj = this.d;
        switch (b) {
            case 0:
                return new fb5((UUID) this.b, (l49) this.c, (Set) obj);
            default:
                l49 l49Var = (l49) this.c;
                if (!l49Var.q) {
                    return new fl5((UUID) this.b, l49Var, (Set) obj);
                }
                bt.q("PeriodicWorkRequests cannot be expedited");
                return null;
        }
    }

    public /* synthetic */ eb5(Class cls) {
        super(cls);
    }
}
