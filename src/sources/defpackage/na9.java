package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class na9 implements za9, ab5, na5, ba5 {
    public final /* synthetic */ byte X;
    public final Executor Y;
    public final Object Z;
    public final Object f0;

    public na9(Executor executor, ba5 ba5Var) {
        this.X = (byte) 0;
        this.Z = new Object();
        this.Y = executor;
        this.f0 = ba5Var;
    }

    @Override // defpackage.za9
    public final void a(fb9 fb9Var) {
        boolean z = false;
        switch (this.X) {
            case 0:
                if (fb9Var.d) {
                    synchronized (this.Z) {
                        break;
                    }
                    this.Y.execute(new g99((Object) this, (byte) 3));
                    return;
                }
                return;
            case 1:
                synchronized (this.Z) {
                    break;
                }
                this.Y.execute(new zo2((byte) 20, this, fb9Var, z));
                return;
            case 2:
                if (fb9Var.i() || fb9Var.d) {
                    return;
                }
                synchronized (this.Z) {
                    break;
                }
                this.Y.execute(new zo2((byte) 21, this, fb9Var, z));
                return;
            case 3:
                if (fb9Var.i()) {
                    synchronized (this.Z) {
                        break;
                    }
                    this.Y.execute(new zo2((byte) 23, this, fb9Var, z));
                    return;
                }
                return;
            default:
                this.Y.execute(new zo2((byte) 25, this, fb9Var, z));
                return;
        }
    }

    @Override // defpackage.ab5
    public void b(Object obj) {
        ((fb9) this.f0).j(obj);
    }

    @Override // defpackage.ba5
    public void c() {
        ((fb9) this.f0).l();
    }

    @Override // defpackage.na5
    public void d(Exception exc) {
        ((fb9) this.f0).k(exc);
    }

    public na9(Executor executor, fa5 fa5Var) {
        this.X = (byte) 1;
        this.Z = new Object();
        this.Y = executor;
        this.f0 = fa5Var;
    }

    public na9(Executor executor, na5 na5Var) {
        this.X = (byte) 2;
        this.Z = new Object();
        this.Y = executor;
        this.f0 = na5Var;
    }

    public na9(Executor executor, ab5 ab5Var) {
        this.X = (byte) 3;
        this.Z = new Object();
        this.Y = executor;
        this.f0 = ab5Var;
    }

    public na9(Executor executor, iw7 iw7Var, fb9 fb9Var) {
        this.X = (byte) 4;
        this.Y = executor;
        this.Z = iw7Var;
        this.f0 = fb9Var;
    }
}
