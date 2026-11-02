package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class dp1 implements Executor {
    public static volatile dp1 Y;
    public static final dp1 Z = new dp1(1);
    public static final /* synthetic */ dp1 f0 = new dp1(3);
    public static final /* synthetic */ dp1 g0 = new dp1(4);
    public final /* synthetic */ byte X;

    public /* synthetic */ dp1(byte b) {
        this.X = b;
    }

    public static dp1 a() {
        if (Y != null) {
            return Y;
        }
        synchronized (dp1.class) {
            try {
                if (Y == null) {
                    Y = new dp1((byte) 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Y;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.X) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                new Thread(runnable).start();
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
