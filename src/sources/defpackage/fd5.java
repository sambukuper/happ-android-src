package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fd5 extends AtomicLong implements iv5 {
    public final gd5 X;

    public fd5(gd5 gd5Var) {
        this.X = gd5Var;
    }

    @Override // defpackage.iv5
    public final void request(long j) throws Throwable {
        if (j <= 0) {
            if (j >= 0) {
                return;
            }
            bt.q("n >= 0 required");
        } else {
            if (get() == Long.MAX_VALUE) {
                return;
            }
            mb6.B(this, j);
            this.X.h();
        }
    }
}
