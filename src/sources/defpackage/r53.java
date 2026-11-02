package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r53 extends m53 {
    public q53 A0;
    public final Executor x0;
    public final Object y0 = new Object();
    public n63 z0;

    public r53(Executor executor) {
        this.x0 = executor;
    }

    @Override // defpackage.m53
    public final n63 a(q63 q63Var) {
        return q63Var.d();
    }

    @Override // defpackage.m53
    public final void c() {
        synchronized (this.y0) {
            try {
                n63 n63Var = this.z0;
                if (n63Var != null) {
                    n63Var.close();
                    this.z0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m53
    public final void e(n63 n63Var) {
        synchronized (this.y0) {
            try {
                if (!this.w0) {
                    n63Var.close();
                    return;
                }
                if (this.A0 != null) {
                    if (n63Var.r0().getTimestamp() <= this.A0.Y.r0().getTimestamp()) {
                        n63Var.close();
                    } else {
                        n63 n63Var2 = this.z0;
                        if (n63Var2 != null) {
                            n63Var2.close();
                        }
                        this.z0 = n63Var;
                    }
                    return;
                }
                q53 q53Var = new q53(n63Var, this);
                this.A0 = q53Var;
                xb4 xb4VarB = b(q53Var);
                vk1 vk1Var = new vk1((Object) q53Var, (byte) 17);
                xb4VarB.a(new zo2(xb4VarB, vk1Var, (byte) 0), dp1.a());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
