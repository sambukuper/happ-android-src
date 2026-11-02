package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m15 {
    public final AtomicReference a = new AtomicReference(null);
    public final q15 b = r15.a();

    public final void a(j15 j15Var) {
        while (true) {
            AtomicReference atomicReference = this.a;
            j15 j15Var2 = (j15) atomicReference.get();
            if (j15Var2 != null && j15Var.a.compareTo(j15Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(j15Var2, j15Var)) {
                    if (j15Var2 != null) {
                        j15Var2.b.m(new h15("Mutation interrupted"));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == j15Var2);
        }
    }
}
