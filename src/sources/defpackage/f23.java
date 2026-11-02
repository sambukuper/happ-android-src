package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f23 extends w18 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f23(byte b, Object obj, String str) {
        super(str, true);
        this.e = b;
        this.f = obj;
    }

    @Override // defpackage.w18
    public final long a() {
        int i = 0;
        switch (this.e) {
            case 0:
                h23 h23Var = (h23) this.f;
                h23Var.getClass();
                try {
                    h23Var.y0.C(false, 2, 0);
                    break;
                } catch (IOException e) {
                    h23Var.g(2, 2, e);
                }
                return -1L;
            case 1:
                ry1 ry1Var = (ry1) this.f;
                long jNanoTime = System.nanoTime();
                long j = Long.MIN_VALUE;
                p76 p76Var = null;
                int i2 = 0;
                for (p76 p76Var2 : (ConcurrentLinkedQueue) ry1Var.d) {
                    p76Var2.getClass();
                    synchronized (p76Var2) {
                        if (ry1Var.b(p76Var2, jNanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = jNanoTime - p76Var2.q;
                            if (j2 > j) {
                                p76Var = p76Var2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = ry1Var.a;
                if (j < j3 && i <= 5) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                p76Var.getClass();
                synchronized (p76Var) {
                    if (!p76Var.p.isEmpty()) {
                        return 0L;
                    }
                    if (p76Var.q + j != jNanoTime) {
                        return 0L;
                    }
                    p76Var.j = true;
                    ((ConcurrentLinkedQueue) ry1Var.d).remove(p76Var);
                    Socket socket = p76Var.d;
                    socket.getClass();
                    ks8.d(socket);
                    if (!((ConcurrentLinkedQueue) ry1Var.d).isEmpty()) {
                        return 0L;
                    }
                    ((e28) ry1Var.b).a();
                    return 0L;
                }
            default:
                ((dn2) this.f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f23(ry1 ry1Var, String str) {
        super(str, true);
        this.e = (byte) 1;
        this.f = ry1Var;
    }
}
