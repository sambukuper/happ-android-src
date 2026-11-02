package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ob implements Executor {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ ob(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                ((AndroidComposeView) obj).postOnAnimation(runnable);
                break;
            default:
                pr8 pr8Var = (pr8) obj;
                pr8Var.c.execute(new sc4((Object) pr8Var, (Object) runnable, (byte) 19));
                break;
        }
    }
}
