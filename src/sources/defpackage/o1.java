package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends mb6 {
    public final AtomicReferenceFieldUpdater j0;
    public final AtomicReferenceFieldUpdater k0;
    public final AtomicReferenceFieldUpdater l0;
    public final AtomicReferenceFieldUpdater m0;
    public final AtomicReferenceFieldUpdater n0;

    public o1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.j0 = atomicReferenceFieldUpdater;
        this.k0 = atomicReferenceFieldUpdater2;
        this.l0 = atomicReferenceFieldUpdater3;
        this.m0 = atomicReferenceFieldUpdater4;
        this.n0 = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.mb6
    public final void X(q1 q1Var, q1 q1Var2) {
        this.k0.lazySet(q1Var, q1Var2);
    }

    @Override // defpackage.mb6
    public final void Y(q1 q1Var, Thread thread) {
        this.j0.lazySet(q1Var, thread);
    }

    @Override // defpackage.mb6
    public final boolean k(r1 r1Var, n1 n1Var, n1 n1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.m0;
            if (atomicReferenceFieldUpdater.compareAndSet(r1Var, n1Var, n1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(r1Var) == n1Var);
        return false;
    }

    @Override // defpackage.mb6
    public final boolean l(r1 r1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.n0;
            if (atomicReferenceFieldUpdater.compareAndSet(r1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(r1Var) == obj);
        return false;
    }

    @Override // defpackage.mb6
    public final boolean m(r1 r1Var, q1 q1Var, q1 q1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.l0;
            if (atomicReferenceFieldUpdater.compareAndSet(r1Var, q1Var, q1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(r1Var) == q1Var);
        return false;
    }
}
