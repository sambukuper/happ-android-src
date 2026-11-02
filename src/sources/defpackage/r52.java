package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r52 implements Executor {
    public final /* synthetic */ byte X;
    public final Handler Y;

    public /* synthetic */ r52(Handler handler, byte b) {
        this.X = b;
        this.Y = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.X;
        Handler handler = this.Y;
        switch (b) {
            case 0:
                runnable.getClass();
                if (!handler.post(runnable)) {
                    b61.g(handler);
                    break;
                }
                break;
            default:
                runnable.getClass();
                if (!handler.post(runnable)) {
                    b61.g(handler);
                    break;
                }
                break;
        }
    }
}
