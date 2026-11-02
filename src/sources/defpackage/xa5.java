package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xa5 extends AtomicLong implements iv5 {
    public final aq7 X;
    public final Iterator Y;

    public xa5(aq7 aq7Var, Iterator it) {
        this.X = aq7Var;
        this.Y = it;
    }

    @Override // defpackage.iv5
    public final void request(long j) {
        if (get() == Long.MAX_VALUE) {
            return;
        }
        if (j == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
            aq7 aq7Var = this.X;
            Iterator it = this.Y;
            while (!aq7Var.X.Y) {
                try {
                    aq7Var.onNext(it.next());
                    if (aq7Var.X.Y) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (aq7Var.X.Y) {
                                return;
                            }
                            aq7Var.b();
                            return;
                        }
                    } catch (Throwable th) {
                        vr3.d0(th, aq7Var);
                        return;
                    }
                } catch (Throwable th2) {
                    vr3.d0(th2, aq7Var);
                    return;
                }
            }
            return;
        }
        if (j <= 0 || mb6.B(this, j) != 0) {
            return;
        }
        aq7 aq7Var2 = this.X;
        Iterator it2 = this.Y;
        do {
            long j2 = 0;
            while (true) {
                if (j2 == j) {
                    j = get();
                    if (j2 == j) {
                        break;
                    }
                } else {
                    if (aq7Var2.X.Y) {
                        return;
                    }
                    try {
                        aq7Var2.onNext(it2.next());
                        if (aq7Var2.X.Y) {
                            return;
                        }
                        try {
                            if (!it2.hasNext()) {
                                if (aq7Var2.X.Y) {
                                    return;
                                }
                                aq7Var2.b();
                                return;
                            }
                            j2++;
                        } catch (Throwable th3) {
                            vr3.d0(th3, aq7Var2);
                            return;
                        }
                    } catch (Throwable th4) {
                        vr3.d0(th4, aq7Var2);
                        return;
                    }
                }
            }
            while (true) {
                long j3 = get();
                if (j3 == Long.MAX_VALUE) {
                    j = Long.MAX_VALUE;
                    break;
                }
                long j4 = j3 - j2;
                if (j4 < 0) {
                    bt.i(ie2.f(j4, "More produced than requested: "));
                    return;
                } else if (compareAndSet(j3, j4)) {
                    j = j4;
                    break;
                }
            }
        } while (j != 0);
    }
}
