package androidx.work.multiprocess;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import defpackage.bd6;
import defpackage.c1;
import defpackage.fl5;
import defpackage.h37;
import defpackage.jh0;
import defpackage.jn0;
import defpackage.km4;
import defpackage.kp5;
import defpackage.lh4;
import defpackage.nr4;
import defpackage.pd6;
import defpackage.qd6;
import defpackage.r57;
import defpackage.rd6;
import defpackage.sc4;
import defpackage.wy7;
import defpackage.x39;
import defpackage.xy0;
import defpackage.yr2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteWorkManagerClient extends pd6 {
    public static final kp5 j;
    public final Context b;
    public final x39 c;
    public final h37 d;
    public volatile long f;
    public final int g;
    public final yr2 h;
    public final Object e = new Object();
    public qd6 a = null;
    public final rd6 i = new rd6(this);

    static {
        lh4.a1("RemoteWorkManagerClient");
        j = new kp5((byte) 10);
    }

    public RemoteWorkManagerClient(Context context, x39 x39Var) {
        this.b = context.getApplicationContext();
        this.c = x39Var;
        this.d = (h37) x39Var.l0.Y;
        xy0 xy0Var = x39Var.j0;
        xy0Var.getClass();
        this.g = 600000;
        this.h = (yr2) xy0Var.h0;
    }

    @Override // defpackage.pd6
    public final wy7 a(String str) {
        return km4.d0(e(new jh0(str, (byte) 2)), j, this.d);
    }

    @Override // defpackage.pd6
    public final wy7 b(String str, fl5 fl5Var) {
        return km4.d0(e(new jn0(fl5Var, str, (byte) 9)), j, this.d);
    }

    public final void d() {
        synchronized (this.e) {
            lh4.P0().getClass();
            this.a = null;
        }
    }

    public final wy7 e(bd6 bd6Var) {
        r57 r57Var;
        Intent intent = new Intent(this.b, (Class<?>) RemoteWorkManagerService.class);
        synchronized (this.e) {
            try {
                this.f++;
                if (this.a == null) {
                    lh4.P0().getClass();
                    qd6 qd6Var = new qd6(this);
                    this.a = qd6Var;
                    try {
                        if (!this.b.bindService(intent, qd6Var, 1)) {
                            qd6 qd6Var2 = this.a;
                            RuntimeException runtimeException = new RuntimeException("Unable to bind to service");
                            lh4.P0().getClass();
                            qd6Var2.a.h(runtimeException);
                        }
                    } catch (Throwable th) {
                        qd6 qd6Var3 = this.a;
                        lh4.P0().getClass();
                        qd6Var3.a.h(th);
                    }
                }
                ((Handler) this.h.Y).removeCallbacks(this.i);
                r57Var = this.a.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        sc4 sc4Var = new sc4(this, r57Var, (byte) 8);
        h37 h37Var = this.d;
        r57Var.a(sc4Var, h37Var);
        wy7 wy7VarS = nr4.s(h37Var, r57Var, bd6Var);
        wy7VarS.Y.a(new c1(this, (byte) 29), h37Var);
        return wy7VarS;
    }
}
