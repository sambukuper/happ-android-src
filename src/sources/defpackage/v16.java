package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v16 extends AtomicLong implements iv5, cq7, u85 {
    public final w16 X;
    public final aq7 Y;
    public long Z;

    public v16(w16 w16Var, aq7 aq7Var) {
        this.X = w16Var;
        this.Y = aq7Var;
    }

    @Override // defpackage.cq7
    public final boolean a() {
        return get() == Long.MIN_VALUE;
    }

    @Override // defpackage.u85
    public final void b() {
        if (get() != Long.MIN_VALUE) {
            this.Y.b();
        }
    }

    @Override // defpackage.cq7
    public final void c() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.X.c(this);
        }
    }

    @Override // defpackage.u85
    public final void onError(Throwable th) {
        if (get() != Long.MIN_VALUE) {
            this.Y.onError(th);
        }
    }

    @Override // defpackage.u85
    public final void onNext(Object obj) {
        long j = get();
        if (j != Long.MIN_VALUE) {
            long j2 = this.Z;
            aq7 aq7Var = this.Y;
            if (j != j2) {
                this.Z = j2 + 1;
                aq7Var.onNext(obj);
            } else {
                c();
                aq7Var.onError(new aw4("PublishSubject: could not emit value due to lack of requests"));
            }
        }
    }

    @Override // defpackage.iv5
    public final void request(long j) {
        long j2;
        if (j < 0) {
            bt.q(ie2.f(j, "n >= 0 required but it was "));
        } else if (j != 0) {
            do {
                j2 = get();
                if (j2 == Long.MIN_VALUE) {
                    return;
                }
            } while (!compareAndSet(j2, mb6.f(j2, j)));
        }
    }
}
