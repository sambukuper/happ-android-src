package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yc5 extends AtomicBoolean implements iv5 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ aq7 Y;

    public /* synthetic */ yc5(aq7 aq7Var, byte b) {
        this.X = b;
        this.Y = aq7Var;
    }

    @Override // defpackage.iv5
    public final void request(long j) {
        byte b = this.X;
        aq7 aq7Var = this.Y;
        long j2 = 0;
        switch (b) {
            case 0:
                zc5 zc5Var = (zc5) aq7Var;
                AtomicLong atomicLong = zc5Var.l0;
                int i = zc5Var.i0;
                ArrayDeque arrayDeque = zc5Var.k0;
                aq7 aq7Var2 = zc5Var.g0;
                if (j < 0) {
                    bt.q(ie2.f(j, "n >= 0 required but it was "));
                } else {
                    if (j != 0) {
                        while (true) {
                            long j3 = atomicLong.get();
                            long j4 = j3 & Long.MIN_VALUE;
                            long j5 = j2;
                            if (!atomicLong.compareAndSet(j3, mb6.f(j3 & Long.MAX_VALUE, j) | j4)) {
                                j2 = j5;
                            } else if (j3 == Long.MIN_VALUE) {
                                mb6.W(atomicLong, arrayDeque, aq7Var2);
                                break;
                            } else if (j4 != j5) {
                            }
                        }
                    } else if ((atomicLong.get() & Long.MIN_VALUE) == 0) {
                    }
                    if (j != 0) {
                        if (!get() && compareAndSet(false, true)) {
                            zc5Var.e(mb6.f(mb6.Q(i, j - 1), zc5Var.h0));
                        } else {
                            zc5Var.e(mb6.Q(i, j));
                        }
                    }
                }
                break;
            default:
                if (j < 0) {
                    bt.q(ie2.f(j, "n >= 0 required but it was "));
                } else if (j != 0) {
                    ad5 ad5Var = (ad5) aq7Var;
                    int i2 = ad5Var.i0;
                    int i3 = ad5Var.h0;
                    if (!get() && compareAndSet(false, true)) {
                        ad5Var.e(mb6.f(mb6.Q(j, i3), mb6.Q(i2 - i3, j - 1)));
                    } else {
                        ad5Var.e(mb6.Q(j, i2));
                    }
                }
                break;
        }
    }
}
