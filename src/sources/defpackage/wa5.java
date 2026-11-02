package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wa5 extends AtomicLong implements iv5 {
    public final aq7 X;
    public final Object[] Y;
    public int Z;

    public wa5(aq7 aq7Var, Object[] objArr) {
        this.X = aq7Var;
        this.Y = objArr;
    }

    @Override // defpackage.iv5
    public final void request(long j) {
        if (j < 0) {
            bt.q(ie2.f(j, "n >= 0 required but it was "));
            return;
        }
        if (j == Long.MAX_VALUE) {
            if (mb6.B(this, j) == 0) {
                aq7 aq7Var = this.X;
                for (Object obj : this.Y) {
                    if (aq7Var.X.Y) {
                        return;
                    }
                    aq7Var.onNext(obj);
                }
                if (aq7Var.X.Y) {
                    return;
                }
                aq7Var.b();
                return;
            }
            return;
        }
        if (j == 0 || mb6.B(this, j) != 0) {
            return;
        }
        aq7 aq7Var2 = this.X;
        Object[] objArr = this.Y;
        int length = objArr.length;
        int i = this.Z;
        do {
            long j2 = 0;
            while (true) {
                if (j == 0 || i == length) {
                    j = get() + j2;
                    if (j == 0) {
                        break;
                    }
                } else {
                    if (aq7Var2.X.Y) {
                        return;
                    }
                    aq7Var2.onNext(objArr[i]);
                    i++;
                    if (i == length) {
                        if (aq7Var2.X.Y) {
                            return;
                        }
                        aq7Var2.b();
                        return;
                    }
                    j--;
                    j2--;
                }
            }
            this.Z = i;
            j = addAndGet(j2);
        } while (j != 0);
    }
}
