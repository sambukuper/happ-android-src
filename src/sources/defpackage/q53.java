package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q53 extends yj2 {
    public final /* synthetic */ byte f0 = 1;
    public final Object g0;

    public q53(n63 n63Var, r53 r53Var) {
        super(n63Var);
        this.g0 = new WeakReference(r53Var);
        g(new p53(this, (byte) 0));
    }

    @Override // defpackage.yj2, java.lang.AutoCloseable
    public void close() {
        switch (this.f0) {
            case 1:
                if (!((AtomicBoolean) this.g0).getAndSet(true)) {
                    super.close();
                }
                break;
            default:
                super.close();
                break;
        }
    }

    public q53(n63 n63Var) {
        super(n63Var);
        this.g0 = new AtomicBoolean(false);
    }
}
