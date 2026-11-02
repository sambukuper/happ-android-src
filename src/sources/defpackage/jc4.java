package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jc4 {
    public static final /* synthetic */ int e = 0;
    public final Context a;
    public final Executor b;
    public final Object c = new Object();
    public ic4 d;

    static {
        lh4.a1("ListenableWorkerImplClient");
    }

    public jc4(Context context, Executor executor) {
        this.a = context;
        this.b = executor;
    }

    public final wy7 a(ComponentName componentName, bd6 bd6Var) {
        r57 r57Var;
        synchronized (this.c) {
            try {
                if (this.d == null) {
                    lh4 lh4VarP0 = lh4.P0();
                    componentName.getPackageName();
                    componentName.getClassName();
                    lh4VarP0.getClass();
                    this.d = new ic4();
                    try {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        if (!this.a.bindService(intent, this.d, 1)) {
                            ic4 ic4Var = this.d;
                            RuntimeException runtimeException = new RuntimeException("Unable to bind to service");
                            lh4.P0().getClass();
                            ic4Var.a.h(runtimeException);
                        }
                    } catch (Throwable th) {
                        ic4 ic4Var2 = this.d;
                        lh4.P0().getClass();
                        ic4Var2.a.h(th);
                    }
                }
                r57Var = this.d.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ((xy0) z47.I(this.a).Y).getClass();
        return nr4.s(this.b, r57Var, bd6Var);
    }

    public final void b() {
        synchronized (this.c) {
            try {
                ic4 ic4Var = this.d;
                if (ic4Var != null) {
                    this.a.unbindService(ic4Var);
                    this.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
