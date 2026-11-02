package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nd implements Executor {
    public final /* synthetic */ byte X;

    public /* synthetic */ nd(byte b) {
        this.X = b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.X) {
            case 0:
                runnable.run();
                break;
            case 1:
                ys.y().a.b.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
