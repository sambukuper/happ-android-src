package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zc5 extends aq7 {
    public final aq7 g0;
    public final int h0;
    public final int i0;
    public long j0;
    public final ArrayDeque k0 = new ArrayDeque();
    public final AtomicLong l0 = new AtomicLong();
    public long m0;

    public zc5(aq7 aq7Var, int i, int i2) {
        this.g0 = aq7Var;
        this.h0 = i;
        this.i0 = i2;
        e(0L);
    }

    @Override // defpackage.u85
    public final void b() {
        long j;
        long j2 = this.m0;
        aq7 aq7Var = this.g0;
        AtomicLong atomicLong = this.l0;
        if (j2 != 0) {
            if (j2 > atomicLong.get()) {
                aq7Var.onError(new aw4(ie2.f(j2, "More produced than requested? ")));
                return;
            }
            atomicLong.addAndGet(-j2);
        }
        do {
            j = atomicLong.get();
            if ((j & Long.MIN_VALUE) != 0) {
                return;
            }
        } while (!atomicLong.compareAndSet(j, Long.MIN_VALUE | j));
        if (j != 0) {
            mb6.W(atomicLong, this.k0, aq7Var);
        }
    }

    @Override // defpackage.u85
    public final void onError(Throwable th) {
        this.k0.clear();
        this.g0.onError(th);
    }

    @Override // defpackage.u85
    public final void onNext(Object obj) {
        long j = this.j0;
        int i = this.h0;
        ArrayDeque arrayDeque = this.k0;
        if (j == 0) {
            arrayDeque.offer(new ArrayList(i));
        }
        long j2 = j + 1;
        if (j2 == this.i0) {
            this.j0 = 0L;
        } else {
            this.j0 = j2;
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((List) it.next()).add(obj);
        }
        List list = (List) arrayDeque.peek();
        if (list == null || list.size() != i) {
            return;
        }
        arrayDeque.poll();
        this.m0++;
        this.g0.onNext(list);
    }
}
