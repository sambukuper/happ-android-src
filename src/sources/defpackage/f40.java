package defpackage;

import android.os.Build;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f40 {
    public static final ox1 a = new ox1(new x((byte) 28), (byte) 1);
    public static Boolean b;

    public static final void a(ql qlVar, o88 o88Var, fi2 fi2Var, List list, boolean z, lp2 lp2Var) {
        Executor executor = (Executor) lp2Var.j(a);
        if (executor == null || !b(qlVar.Y.length())) {
            lp2Var.W(317137883);
            lp2Var.p(false);
        } else {
            lp2Var.W(315439796);
            try {
                executor.execute(new d40(o88Var, (z24) lp2Var.j(y01.n), list, qlVar, (fi1) lp2Var.j(y01.h), fi2Var, z));
            } catch (RejectedExecutionException unused) {
            }
            lp2Var.p(false);
        }
    }

    public static final boolean b(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            Boolean boolValueOf = b;
            if (boolValueOf == null) {
                boolValueOf = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                b = boolValueOf;
            }
            if (boolValueOf.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
