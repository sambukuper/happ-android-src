package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j03 implements Executor {
    public static volatile j03 Z;
    public final /* synthetic */ byte X;
    public final Executor Y;

    public j03() {
        this.X = (byte) 0;
        this.Y = Executors.newSingleThreadExecutor(new i03((byte) 0));
    }

    public static Executor a() {
        if (Z != null) {
            return Z;
        }
        synchronized (j03.class) {
            try {
                if (Z == null) {
                    Z = new j03();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Z;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.X) {
            case 0:
                ((ExecutorService) this.Y).execute(runnable);
                break;
            default:
                this.Y.execute(new zu6(runnable, (byte) 0));
                break;
        }
    }

    public j03(ExecutorService executorService) {
        this.X = (byte) 1;
        this.Y = executorService;
    }
}
