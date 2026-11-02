package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ka7 extends AtomicBoolean implements iv5 {
    public final aq7 X;
    public final Object Y;

    public ka7(aq7 aq7Var, Object obj) {
        this.X = aq7Var;
        this.Y = obj;
    }

    @Override // defpackage.iv5
    public final void request(long j) {
        if (j < 0) {
            bt.q("n >= 0 required");
            return;
        }
        if (j != 0 && compareAndSet(false, true)) {
            aq7 aq7Var = this.X;
            if (aq7Var.X.Y) {
                return;
            }
            Object obj = this.Y;
            try {
                aq7Var.onNext(obj);
                if (aq7Var.X.Y) {
                    return;
                }
                aq7Var.b();
            } catch (Throwable th) {
                vr3.e0(th, aq7Var, obj);
            }
        }
    }
}
