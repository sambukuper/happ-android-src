package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 extends vj8 {
    public final AtomicReferenceFieldUpdater B0;
    public final AtomicReferenceFieldUpdater C0;
    public final AtomicReferenceFieldUpdater D0;
    public final AtomicReferenceFieldUpdater E0;
    public final AtomicReferenceFieldUpdater F0;

    public r2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.B0 = atomicReferenceFieldUpdater;
        this.C0 = atomicReferenceFieldUpdater2;
        this.D0 = atomicReferenceFieldUpdater3;
        this.E0 = atomicReferenceFieldUpdater4;
        this.F0 = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.vj8
    public final void Z(t2 t2Var, t2 t2Var2) {
        this.C0.lazySet(t2Var, t2Var2);
    }

    @Override // defpackage.vj8
    public final void a0(t2 t2Var, Thread thread) {
        this.B0.lazySet(t2Var, thread);
    }

    @Override // defpackage.vj8
    public final boolean r(u2 u2Var, q2 q2Var, q2 q2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.E0;
            if (atomicReferenceFieldUpdater.compareAndSet(u2Var, q2Var, q2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u2Var) == q2Var);
        return false;
    }

    @Override // defpackage.vj8
    public final boolean s(u2 u2Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.F0;
            if (atomicReferenceFieldUpdater.compareAndSet(u2Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u2Var) == obj);
        return false;
    }

    @Override // defpackage.vj8
    public final boolean t(u2 u2Var, t2 t2Var, t2 t2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.D0;
            if (atomicReferenceFieldUpdater.compareAndSet(u2Var, t2Var, t2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u2Var) == t2Var);
        return false;
    }
}
