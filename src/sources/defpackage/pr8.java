package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pr8 {
    public final m51 a;
    public final Executor b;
    public final c37 c;
    public final ThreadLocal d;
    public final ob e;
    public final m51 f;

    public pr8(m51 m51Var, Executor executor, u61 u61Var) {
        executor.getClass();
        this.a = m51Var;
        this.b = executor;
        new Handler(Looper.getMainLooper());
        this.c = new c37(executor);
        this.d = new ThreadLocal();
        ob obVar = new ob(this, (byte) 1);
        this.e = obVar;
        this.f = gv3.c(m51Var.Y.B0(pw7.b()).B0(nr4.x(obVar)));
    }
}
