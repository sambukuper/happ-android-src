package defpackage;

import android.util.Log;
import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wg1 {
    public static final boolean k;
    public static final AtomicInteger l;
    public static final AtomicInteger m;
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public qd0 d;
    public final ud0 e;
    public qd0 f;
    public final ud0 g;
    public final Size h;
    public final int i;
    public Class j;

    static {
        new Size(0, 0);
        k = hi5.i0("DeferrableSurface");
        l = new AtomicInteger(0);
        m = new AtomicInteger(0);
    }

    public wg1(int i, Size size) {
        final byte b = 0;
        this.h = size;
        this.i = i;
        ud0 ud0VarU = u15.u(new sd0(this) { // from class: sg1
            public final /* synthetic */ wg1 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.sd0
            public final Object t(qd0 qd0Var) {
                byte b2 = b;
                wg1 wg1Var = this.Y;
                switch (b2) {
                    case 0:
                        synchronized (wg1Var.a) {
                            wg1Var.d = qd0Var;
                            break;
                        }
                        return "DeferrableSurface-termination(" + wg1Var + ")";
                    default:
                        synchronized (wg1Var.a) {
                            wg1Var.f = qd0Var;
                            break;
                        }
                        return "DeferrableSurface-close(" + wg1Var + ")";
                }
            }
        });
        this.e = ud0VarU;
        final byte b2 = 1;
        this.g = u15.u(new sd0(this) { // from class: sg1
            public final /* synthetic */ wg1 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.sd0
            public final Object t(qd0 qd0Var) {
                byte b3 = b2;
                wg1 wg1Var = this.Y;
                switch (b3) {
                    case 0:
                        synchronized (wg1Var.a) {
                            wg1Var.d = qd0Var;
                            break;
                        }
                        return "DeferrableSurface-termination(" + wg1Var + ")";
                    default:
                        synchronized (wg1Var.a) {
                            wg1Var.f = qd0Var;
                            break;
                        }
                        return "DeferrableSurface-close(" + wg1Var + ")";
                }
            }
        });
        if (hi5.i0("DeferrableSurface")) {
            m.incrementAndGet();
            l.get();
            e();
            ud0VarU.Y.a(new tg1(this, Log.getStackTraceString(new Exception())), dp1.a());
        }
    }

    public void a() {
        qd0 qd0Var;
        synchronized (this.a) {
            try {
                if (this.c) {
                    qd0Var = null;
                } else {
                    this.c = true;
                    this.f.b(null);
                    if (this.b == 0) {
                        qd0Var = this.d;
                        this.d = null;
                    } else {
                        qd0Var = null;
                    }
                    if (hi5.i0("DeferrableSurface")) {
                        toString();
                        hi5.z0("DeferrableSurface");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qd0Var != null) {
            qd0Var.b(null);
        }
    }

    public final void b() {
        qd0 qd0Var;
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.b = i2;
                if (i2 == 0 && this.c) {
                    qd0Var = this.d;
                    this.d = null;
                } else {
                    qd0Var = null;
                }
                if (hi5.i0("DeferrableSurface")) {
                    toString();
                    hi5.z0("DeferrableSurface");
                    if (this.b == 0) {
                        m.get();
                        l.decrementAndGet();
                        e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qd0Var != null) {
            qd0Var.b(null);
        }
    }

    public final xb4 c() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return new u73(new ug1(this, "DeferrableSurface already closed."), (byte) 1);
                }
                return f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0 && this.c) {
                    throw new ug1(this, "Cannot begin use on a closed surface.");
                }
                this.b = i + 1;
                if (hi5.i0("DeferrableSurface")) {
                    if (this.b == 1) {
                        m.get();
                        l.incrementAndGet();
                        e();
                    }
                    toString();
                    hi5.z0("DeferrableSurface");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (!k && hi5.i0("DeferrableSurface")) {
            hi5.z0("DeferrableSurface");
        }
        toString();
        hi5.z0("DeferrableSurface");
    }

    public xb4 f() {
        return u73.Z;
    }
}
