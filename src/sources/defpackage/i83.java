package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class i83 {
    public final vz7 a = new vz7(new tv2((byte) 21));
    public final vz7 b = new vz7(new tv2((byte) 22));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final l81 a(String str) {
        l81 rj6Var;
        l81 l81Var;
        ((h83) this.b.getValue()).getClass();
        boolean zG0 = fm7.G0('[', fm7.R0(str).toString());
        try {
            bo3 bo3VarL = z51.L(str);
            boolean z = true;
            if (bo3VarL instanceof en3) {
                boolean z2 = false;
                for (bo3 bo3Var : bo3VarL.b().X) {
                    kw2 kw2Var = kw2.a;
                    kw4 kw4Var = kw4.a;
                    if (kw2.b(kw4.g().g(bo3Var), 6, null).getCount() > 0) {
                        z2 = true;
                    }
                }
                l81Var = new l81(true, z2);
            } else {
                kw2 kw2Var2 = kw2.a;
                if (kw2.b(str, 6, null).getCount() <= 0) {
                    z = false;
                }
                rj6Var = new l81(false, z);
                l81Var = rj6Var;
            }
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (sj6.a(l81Var) != null) {
            l81Var = new l81(zG0, false);
        }
        return l81Var;
    }
}
