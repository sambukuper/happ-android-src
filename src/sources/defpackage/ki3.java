package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ki3 implements Executor {
    public static volatile ki3 Z;
    public final /* synthetic */ byte X;
    public final Object Y;

    public ki3(byte b) {
        this.X = b;
        switch (b) {
            case 2:
                f99 f99Var = new f99(Looper.getMainLooper());
                Looper.getMainLooper();
                this.Y = f99Var;
                break;
            default:
                this.Y = Executors.newFixedThreadPool(2, new ci0((byte) 2));
                break;
        }
    }

    public static Executor a() {
        if (Z != null) {
            return Z;
        }
        synchronized (ki3.class) {
            try {
                if (Z == null) {
                    Z = new ki3((byte) 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Z;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                ((ExecutorService) obj).execute(runnable);
                break;
            case 1:
                ((Handler) ((y5) obj).f0).post(runnable);
                break;
            default:
                ((f99) obj).post(runnable);
                break;
        }
    }

    public ki3(y5 y5Var) {
        this.X = (byte) 1;
        this.Y = y5Var;
    }
}
