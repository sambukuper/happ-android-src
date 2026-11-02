package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ku5 implements Runnable {
    public final /* synthetic */ byte X;
    public final su5 Y;
    public final /* synthetic */ wu5 Z;

    public /* synthetic */ ku5(wu5 wu5Var, su5 su5Var, byte b) {
        this.X = b;
        this.Z = wu5Var;
        this.Y = su5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.X;
        su5 su5Var = this.Y;
        wu5 wu5Var = this.Z;
        switch (b) {
            case 0:
                AtomicLong atomicLong = wu5Var.f0;
                atomicLong.lazySet(atomicLong.get() + 1);
                if (((uu5) su5Var.get()).a()) {
                    wu5Var.Z.offerLast(su5Var);
                    wu5Var.e();
                }
                break;
            default:
                sa4 sa4Var = wu5Var.Z;
                if (sa4Var.b(su5Var)) {
                    su5 su5Var2 = su5Var.Y;
                    su5 su5Var3 = su5Var.Z;
                    if (su5Var2 == null) {
                        sa4Var.X = su5Var3;
                    } else {
                        su5Var2.Z = su5Var3;
                        su5Var.Y = null;
                    }
                    if (su5Var3 == null) {
                        sa4Var.Y = su5Var2;
                    } else {
                        su5Var3.Y = su5Var2;
                        su5Var.Z = null;
                    }
                }
                wu5Var.f(su5Var);
                break;
        }
    }
}
