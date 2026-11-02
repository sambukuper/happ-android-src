package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d37 extends AtomicReference implements cq7 {
    @Override // defpackage.cq7
    public final boolean a() {
        return get() == ko8.X;
    }

    @Override // defpackage.cq7
    public final void c() {
        cq7 cq7Var;
        cq7 cq7Var2 = (cq7) get();
        ko8 ko8Var = ko8.X;
        if (cq7Var2 == ko8Var || (cq7Var = (cq7) getAndSet(ko8Var)) == null || cq7Var == ko8Var) {
            return;
        }
        cq7Var.c();
    }
}
