package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pz6 {
    public static final mz6 a = new mz6(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(mz6 mz6Var) {
        mz6Var.getClass();
        if (mz6Var.f != null || mz6Var.g != null) {
            bt.q("Failed requirement.");
            return;
        }
        if (mz6Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        mz6 mz6Var2 = a;
        mz6 mz6Var3 = (mz6) atomicReference.getAndSet(mz6Var2);
        if (mz6Var3 == mz6Var2) {
            return;
        }
        int i = mz6Var3 != null ? mz6Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(mz6Var3);
            return;
        }
        mz6Var.f = mz6Var3;
        mz6Var.b = 0;
        mz6Var.c = i + 8192;
        atomicReference.set(mz6Var);
    }

    public static final mz6 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        mz6 mz6Var = a;
        mz6 mz6Var2 = (mz6) atomicReference.getAndSet(mz6Var);
        if (mz6Var2 == mz6Var) {
            return new mz6();
        }
        if (mz6Var2 == null) {
            atomicReference.set(null);
            return new mz6();
        }
        atomicReference.set(mz6Var2.f);
        mz6Var2.f = null;
        mz6Var2.c = 0;
        return mz6Var2;
    }
}
