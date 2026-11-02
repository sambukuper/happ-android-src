package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class az1 extends pu {
    public final /* synthetic */ pu B;
    public final /* synthetic */ ThreadPoolExecutor C;

    public az1(pu puVar, ThreadPoolExecutor threadPoolExecutor) {
        this.B = puVar;
        this.C = threadPoolExecutor;
    }

    @Override // defpackage.pu
    public final void D(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.C;
        try {
            this.B.D(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.pu
    public final void E(z47 z47Var) {
        ThreadPoolExecutor threadPoolExecutor = this.C;
        try {
            this.B.E(z47Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
