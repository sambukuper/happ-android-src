package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lx0 implements me6 {
    public final LinkedHashMap X = new LinkedHashMap();
    public volatile Map Y = e02.X;

    @Override // defpackage.me6
    public final void C(final te6 te6Var, final long j, final long j2) {
        te6Var.getClass();
        for (Map.Entry entry : this.Y.entrySet()) {
            final me6 me6Var = (me6) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: kx0
                @Override // java.lang.Runnable
                public final void run() {
                    me6Var.C(te6Var, j, j2);
                }
            });
        }
    }

    @Override // defpackage.me6
    public final void J(te6 te6Var, long j, de deVar) {
        for (Map.Entry entry : this.Y.entrySet()) {
            ((Executor) entry.getValue()).execute(new hx0((me6) entry.getKey(), te6Var, j, deVar, (byte) 0));
        }
    }

    @Override // defpackage.me6
    public final void R(te6 te6Var) {
        te6Var.getClass();
        for (Map.Entry entry : this.Y.entrySet()) {
            ((Executor) entry.getValue()).execute(new gx0((me6) entry.getKey(), te6Var, (byte) 2));
        }
    }

    @Override // defpackage.me6
    public final void U(te6 te6Var, long j, ee eeVar) {
        te6Var.getClass();
        for (Map.Entry entry : this.Y.entrySet()) {
            ((Executor) entry.getValue()).execute(new ix0((me6) entry.getKey(), te6Var, j, eeVar, (byte) 1));
        }
    }

    @Override // defpackage.me6
    public final void X(te6 te6Var, long j, se6 se6Var) {
        for (Map.Entry entry : this.Y.entrySet()) {
            ((Executor) entry.getValue()).execute(new ix0((me6) entry.getKey(), te6Var, j, se6Var, (byte) 0));
        }
    }

    @Override // defpackage.me6
    public final void Y(te6 te6Var, long j, de deVar) {
        for (Map.Entry entry : this.Y.entrySet()) {
            ((Executor) entry.getValue()).execute(new hx0((me6) entry.getKey(), te6Var, j, deVar, (byte) 1));
        }
    }

    public final void a(me6 me6Var, ob obVar) {
        obVar.getClass();
        if (this.Y.containsKey(me6Var)) {
            throw new IllegalStateException((me6Var + " was already registered!").toString());
        }
        synchronized (this.X) {
            this.X.put(me6Var, obVar);
            this.Y = zp4.Q(this.X);
        }
    }

    @Override // defpackage.me6
    public final void a0(ne6 ne6Var) {
        ne6Var.getClass();
        for (Map.Entry entry : this.Y.entrySet()) {
            ((Executor) entry.getValue()).execute(new sc((me6) entry.getKey(), ne6Var, (byte) 12));
        }
    }

    public final void b(me6 me6Var) {
        me6Var.getClass();
        synchronized (this.X) {
            this.X.remove(me6Var);
            this.Y = zp4.Q(this.X);
        }
    }

    @Override // defpackage.me6
    public final void g(final te6 te6Var, final long j, final int i, final int i2) {
        for (Map.Entry entry : this.Y.entrySet()) {
            final me6 me6Var = (me6) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: jx0
                @Override // java.lang.Runnable
                public final void run() {
                    me6Var.g(te6Var, j, i, i2);
                }
            });
        }
    }

    @Override // defpackage.me6
    public final void m(te6 te6Var) {
        te6Var.getClass();
        for (Map.Entry entry : this.Y.entrySet()) {
            ((Executor) entry.getValue()).execute(new gx0((me6) entry.getKey(), te6Var, (byte) 1));
        }
    }

    @Override // defpackage.me6
    public final void p(te6 te6Var, long j) {
        te6Var.getClass();
        for (Map.Entry entry : this.Y.entrySet()) {
            ((Executor) entry.getValue()).execute(new vg0((me6) entry.getKey(), te6Var, j, (byte) 1));
        }
    }

    @Override // defpackage.me6
    public final void u(te6 te6Var) {
        te6Var.getClass();
        for (Map.Entry entry : this.Y.entrySet()) {
            ((Executor) entry.getValue()).execute(new gx0((me6) entry.getKey(), te6Var, (byte) 0));
        }
    }
}
