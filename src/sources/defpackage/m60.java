package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m60 extends e1 {
    public final Thread g0;
    public final d42 h0;

    public m60(s61 s61Var, Thread thread, d42 d42Var) {
        super(s61Var, true);
        this.g0 = thread;
        this.h0 = d42Var;
    }

    @Override // defpackage.rm3
    public final void d(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.g0;
        if (dh3.f(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
