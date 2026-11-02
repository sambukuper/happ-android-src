package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class db extends CameraDevice.StateCallback {
    public final String a;
    public final jj0 b;
    public final int c;
    public final long d;
    public final u08 e;
    public final eg0 f;
    public final bg0 g;
    public final jg0 h;
    public final s98 i;
    public final pw j;
    public final CameraDevice.StateCallback k;
    public final dq l;
    public final int m;
    public final Object n;
    public boolean o;
    public cb p;
    public boolean q;
    public final CountDownLatch r;
    public final long s;
    public ya8 t;
    public final oh7 u;

    public db(String str, jj0 jj0Var, int i, long j, u08 u08Var, eg0 eg0Var, bg0 bg0Var, jg0 jg0Var, s98 s98Var, pw pwVar, CameraDevice.StateCallback stateCallback, dq dqVar) {
        str.getClass();
        jj0Var.getClass();
        u08Var.getClass();
        eg0Var.getClass();
        bg0Var.getClass();
        jg0Var.getClass();
        s98Var.getClass();
        pwVar.getClass();
        this.a = str;
        this.b = jj0Var;
        this.c = i;
        this.d = j;
        this.e = u08Var;
        this.f = eg0Var;
        this.g = bg0Var;
        this.h = jg0Var;
        this.i = s98Var;
        this.j = pwVar;
        this.k = stateCallback;
        this.l = dqVar;
        qv qvVar = ry8.b;
        qvVar.getClass();
        this.m = qv.b.incrementAndGet(qvVar);
        this.n = new Object();
        this.r = new CountDownLatch(1);
        this.u = ph7.a(yk0.a);
        vi0.b(str);
        this.s = i != 1 ? SystemClock.elapsedRealtimeNanos() : j;
    }

    public static boolean e(jg0 jg0Var, String str, ai0 ai0Var) {
        jg0Var.getClass();
        str.getClass();
        jg0Var.b.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            return false;
        }
        ij0 ij0Var = jj0.h;
        jj0 jj0VarA = ((hg0) jg0Var.a).a(str);
        ij0Var.getClass();
        return ij0.c(jj0VarA) && ai0Var == null;
    }

    public final void a() {
        mk0 mk0Var = (mk0) this.u.getValue();
        yh0 yh0Var = mk0Var instanceof rk0 ? ((rk0) mk0Var).a : null;
        b(yh0Var != null ? (CameraDevice) yh0Var.C0(yb6.a.b(CameraDevice.class)) : null, new cb(wu0.X, null, null, 14));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    public final void b(CameraDevice cameraDevice, cb cbVar) {
        db dbVar;
        mk0 mk0Var = (mk0) this.u.getValue();
        yh0 yh0Var = mk0Var instanceof rk0 ? ((rk0) mk0Var).a : null;
        synchronized (this.n) {
            if (this.p == null) {
                this.p = cbVar;
                if (this.o) {
                    cbVar = null;
                }
            } else {
                cbVar = null;
            }
        }
        if (cbVar != null) {
            ai0 ai0Var = cbVar.c;
            if (ai0Var != null && cbVar.a != wu0.h0) {
                this.f.a(ai0Var.a, this.a, false);
            }
            this.u.n(null, new qk0(cbVar.c));
            if (cbVar.a != wu0.Z) {
                jg0 jg0Var = this.h;
                String str = this.a;
                boolean z = e(jg0Var, str, cbVar.c) && jg0Var.a(str);
                if (z) {
                    synchronized (this.n) {
                        this.q = true;
                    }
                }
                dbVar = this;
                this.g.a(yh0Var, cameraDevice, dbVar, this.j, z, e(this.h, this.a, cbVar.c));
            } else {
                dbVar = this;
            }
            dbVar.u.n(null, dbVar.c(cbVar));
        }
    }

    public final pk0 c(cb cbVar) {
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        ya8 ya8Var = this.t;
        long j = cbVar.b;
        jx1 jx1Var = ya8Var != null ? new jx1(ya8Var.a - this.d) : null;
        jx1 jx1Var2 = ya8Var != null ? new jx1(ya8Var.a - this.s) : null;
        jx1 jx1Var3 = ya8Var == null ? null : new jx1(j - ya8Var.a);
        long j2 = jElapsedRealtimeNanos - j;
        wu0 wu0Var = cbVar.a;
        int i = this.c - 1;
        return new pk0(this.a, wu0Var, Integer.valueOf(i), jx1Var, cbVar.d, jx1Var2, jx1Var3, new jx1(j2), cbVar.c);
    }

    public final void d(CameraDevice cameraDevice) {
        Trace.beginSection(((Object) vi0.b(this.a)) + "#onFinalized");
        toString();
        b(cameraDevice, new cb(wu0.Z, null, null, 14));
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        if (!dh3.f(cameraDevice.getId(), this.a)) {
            bt.i("Check failed.");
            return;
        }
        vi0.b(this.a);
        this.r.countDown();
        synchronized (this.n) {
            if (this.q) {
                toString();
            } else {
                d(cameraDevice);
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        String id = cameraDevice.getId();
        String str = this.a;
        if (!dh3.f(id, str)) {
            bt.i("Check failed.");
            return;
        }
        Trace.beginSection(((Object) vi0.b(str)) + "#onDisconnected");
        vi0.b(str);
        this.r.countDown();
        b(cameraDevice, new cb(wu0.f0, new ai0(6), null, 10));
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onDisconnected(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        cameraDevice.getClass();
        String id = cameraDevice.getId();
        String str = this.a;
        if (!dh3.f(id, str)) {
            bt.i("Check failed.");
            return;
        }
        Trace.beginSection(((Object) vi0.b(str)) + "#onError-" + i);
        vi0.b(str);
        this.r.countDown();
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            bt.q(pc6.j(i, "Unexpected StateCallback error code: "));
                            return;
                        }
                    }
                }
            }
        }
        b(cameraDevice, new cb(wu0.g0, new ai0(i2), null, 10));
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onError(cameraDevice, i);
        }
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        cb cbVar;
        cb cbVar2;
        cameraDevice.getClass();
        if (!dh3.f(cameraDevice.getId(), this.a)) {
            bt.i("Check failed.");
            return;
        }
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.t = new ya8(jElapsedRealtimeNanos);
        Trace.beginSection(((Object) vi0.b(this.a)) + "#onOpened");
        long j = jElapsedRealtimeNanos - this.s;
        long j2 = jElapsedRealtimeNanos - this.d;
        int i = this.c;
        String str = this.a;
        byte b = 1;
        q51 q51Var = null;
        if (i == 1) {
            vi0.b(str);
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000.0d)}, 1));
        } else {
            vi0.b(str);
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000.0d)}, 1));
            String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1000000.0d)}, 1));
        }
        synchronized (this.n) {
            cbVar = this.p;
            if (cbVar == null) {
                this.o = true;
            }
        }
        CameraDevice.StateCallback stateCallback = this.k;
        if (stateCallback != null) {
            stateCallback.onOpened(cameraDevice);
        }
        if (cbVar != null) {
            bg0 bg0Var = this.g;
            pw pwVar = this.j;
            jg0 jg0Var = this.h;
            String str2 = this.a;
            bg0Var.a(null, cameraDevice, this, pwVar, (e(jg0Var, str2, cbVar.c) && jg0Var.a(str2)) ? (byte) 1 : (byte) 0, e(this.h, this.a, cbVar.c));
            return;
        }
        za zaVar = new za(this.b, cameraDevice, this.a, this.f, this.l, this.i);
        pw pwVar2 = this.j;
        pwVar2.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            synchronized (pwVar2.c) {
                pwVar2.e.add(zaVar);
                qw qwVarA = pwVar2.a();
                if (qwVarA != null) {
                    wl6 wl6Var = pwVar2.b;
                    m51 m51Var = pwVar2.a;
                    k kVar = new k(zaVar, qwVarA, q51Var, b);
                    wl6Var.getClass();
                    m51Var.getClass();
                    w51.G(m51Var, null, e71.f0, new wu1(wl6Var, kVar, q51Var, (byte) 4), 1);
                }
            }
        }
        this.u.n(null, new rk0(zaVar));
        synchronized (this.n) {
            this.o = false;
            cbVar2 = this.p;
        }
        if (cbVar2 != null) {
            this.u.n(null, new qk0(cbVar2.c));
            bg0 bg0Var2 = this.g;
            pw pwVar3 = this.j;
            jg0 jg0Var2 = this.h;
            String str3 = this.a;
            bg0Var2.a(zaVar, cameraDevice, this, pwVar3, e(jg0Var2, str3, cbVar2.c) && jg0Var2.a(str3), e(this.h, this.a, cbVar2.c));
            this.u.n(null, c(cbVar2));
        }
        Trace.endSection();
    }

    public final String toString() {
        return "CameraState-" + this.m;
    }
}
