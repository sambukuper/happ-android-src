package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hv implements Executor {
    public final /* synthetic */ byte X;
    public final Handler Y;

    public hv() {
        this.X = (byte) 0;
        this.Y = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.X;
        Handler handler = this.Y;
        switch (b) {
            case 0:
                handler.post(runnable);
                break;
            case 1:
                runnable.getClass();
                if (!handler.post(runnable)) {
                    b61.g(handler);
                    break;
                }
                break;
            default:
                handler.post(runnable);
                break;
        }
    }

    public hv(Handler handler) {
        this.X = (byte) 1;
        handler.getClass();
        this.Y = handler;
    }

    public /* synthetic */ hv(f99 f99Var) {
        this.X = (byte) 2;
        this.Y = f99Var;
    }
}
