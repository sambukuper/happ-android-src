package defpackage;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g99 implements Runnable {
    public final /* synthetic */ byte X;
    public final Object Y;

    public g99(d89 d89Var, b8 b8Var) {
        this.X = (byte) 0;
        Objects.requireNonNull(d89Var);
        this.Y = b8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                throw null;
            case 1:
                xz8 xz8Var = (xz8) this.Y;
                synchronized (xz8Var.a) {
                    try {
                        if (xz8Var.b()) {
                            String.valueOf(xz8Var.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                            xz8Var.d();
                            if (xz8Var.b()) {
                                xz8Var.c = 1;
                                xz8Var.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 2:
                ((z18) this.Y).b(new IOException("TIMEOUT"));
                return;
            default:
                na9 na9Var = (na9) this.Y;
                synchronized (na9Var.Z) {
                    ((ba5) na9Var.f0).c();
                    break;
                }
                return;
        }
    }

    public /* synthetic */ g99(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }
}
