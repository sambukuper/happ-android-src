package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zb4 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ AtomicBoolean Y;
    public final /* synthetic */ qd0 Z;
    public final /* synthetic */ dn2 f0;

    public /* synthetic */ zb4(AtomicBoolean atomicBoolean, qd0 qd0Var, dn2 dn2Var, byte b) {
        this.X = b;
        this.Y = atomicBoolean;
        this.Z = qd0Var;
        this.f0 = dn2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        dn2 dn2Var = this.f0;
        qd0 qd0Var = this.Z;
        AtomicBoolean atomicBoolean = this.Y;
        switch (b) {
            case 0:
                if (!atomicBoolean.get()) {
                    try {
                        qd0Var.b(dn2Var.invoke());
                    } catch (Throwable th) {
                        qd0Var.d(th);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!atomicBoolean.get()) {
                    try {
                        qd0Var.b(dn2Var.invoke());
                    } catch (Throwable th2) {
                        qd0Var.d(th2);
                    }
                    break;
                }
                break;
        }
    }
}
