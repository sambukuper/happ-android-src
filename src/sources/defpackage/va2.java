package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class va2 implements v00 {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.v00
    public final void a(boolean z) {
        synchronized (xa2.j) {
            try {
                for (xa2 xa2Var : new ArrayList(xa2.k.values())) {
                    if (xa2Var.e.get()) {
                        Iterator it = xa2Var.i.iterator();
                        while (it.hasNext()) {
                            xa2 xa2Var2 = ((ua2) it.next()).a;
                            if (!z) {
                                ((ue1) xa2Var2.h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
