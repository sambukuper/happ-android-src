package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m76 implements Cloneable {
    public final l95 X;
    public final y5 Y;
    public final ry1 Z;
    public final l76 f0;
    public final AtomicBoolean g0;
    public Object h0;
    public p42 i0;
    public p76 j0;
    public wg k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public volatile boolean o0;
    public volatile wg p0;
    public volatile p76 q0;

    public m76(l95 l95Var, y5 y5Var) {
        this.X = l95Var;
        this.Y = y5Var;
        this.Z = (ry1) l95Var.Y.Y;
        l76 l76Var = new l76(this);
        l76Var.timeout(l95Var.q0, TimeUnit.MILLISECONDS);
        this.f0 = l76Var;
        this.g0 = new AtomicBoolean();
        this.n0 = true;
    }

    public final void a(p76 p76Var) {
        byte[] bArr = ks8.a;
        if (this.j0 != null) {
            bt.i("Check failed.");
        } else {
            this.j0 = p76Var;
            p76Var.p.add(new k76(this, this.h0));
        }
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket socketG;
        byte[] bArr = ks8.a;
        p76 p76Var = this.j0;
        if (p76Var != null) {
            synchronized (p76Var) {
                socketG = g();
            }
            if (this.j0 == null) {
                if (socketG != null) {
                    ks8.d(socketG);
                }
            } else if (socketG != null) {
                bt.i("Check failed.");
                return null;
            }
        }
        if (this.f0.exit()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            interruptedIOException.getClass();
        }
        return interruptedIOException;
    }

    public final void c(boolean z) {
        wg wgVar;
        synchronized (this) {
            if (!this.n0) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (wgVar = this.p0) != null) {
            ((o42) wgVar.d).cancel();
            ((m76) wgVar.b).e(wgVar, true, true, null);
        }
        this.k0 = null;
    }

    public final Object clone() {
        return new m76(this.X, this.Y);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007a  */
    public final zf6 d() throws Throwable {
        ArrayList arrayList = new ArrayList();
        bw0.d0(arrayList, this.X.Z);
        arrayList.add(new r11(this.X));
        arrayList.add(new m80(this.X.g0));
        byte b = 1;
        arrayList.add(new r11(b));
        arrayList.add(r11.b);
        bw0.d0(arrayList, this.X.f0);
        arrayList.add(new r11((byte) 2));
        y5 y5Var = this.Y;
        l95 l95Var = this.X;
        try {
            zf6 zf6VarB = new y76(this, arrayList, 0, null, y5Var, l95Var.r0, l95Var.s0, l95Var.t0).b(y5Var);
            if (this.o0) {
                ks8.c(zf6VarB);
                throw new IOException("Canceled");
            }
            f(null);
            return zf6VarB;
        } catch (IOException e) {
            try {
                IOException iOExceptionF = f(e);
                iOExceptionF.getClass();
                throw iOExceptionF;
            } catch (Throwable th) {
                th = th;
                if (b == 0) {
                    f(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            b = 0;
            if (b == 0) {
                f(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0020 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:8:0x0011, B:17:0x0020, B:19:0x0024, B:20:0x0026, B:22:0x002a, B:27:0x0033, B:29:0x0037, B:14:0x001a), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0024 A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:8:0x0011, B:17:0x0020, B:19:0x0024, B:20:0x0026, B:22:0x002a, B:27:0x0033, B:29:0x0037, B:14:0x001a), top: B:53:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0030  */
    public final IOException e(wg wgVar, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        wgVar.getClass();
        if (wgVar.equals(this.p0)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (this.l0) {
                            if (z) {
                                this.l0 = false;
                            }
                            if (z2) {
                                this.m0 = false;
                            }
                            z5 = this.l0;
                            if (z5) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (!z5) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        } else if (z2 || !this.m0) {
                            z4 = false;
                        } else {
                            if (z) {
                                this.l0 = false;
                            }
                            if (z2) {
                                this.m0 = false;
                            }
                            z5 = this.l0;
                            if (z5 || this.m0) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (!z5 && !this.m0 && !this.n0) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z2) {
                    }
                    z4 = false;
                }
            }
            if (z3) {
                this.p0 = null;
                p76 p76Var = this.j0;
                if (p76Var != null) {
                    synchronized (p76Var) {
                        p76Var.m++;
                    }
                }
            }
            if (z4) {
                return b(iOException);
            }
        }
        return iOException;
    }

    public final IOException f(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.n0) {
                this.n0 = false;
                if (!this.l0 && !this.m0) {
                    z = true;
                }
            }
        }
        return z ? b(iOException) : iOException;
    }

    public final Socket g() {
        p76 p76Var = this.j0;
        p76Var.getClass();
        byte[] bArr = ks8.a;
        ArrayList arrayList = p76Var.p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (dh3.f(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            bt.i("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.j0 = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        p76Var.q = System.nanoTime();
        ry1 ry1Var = this.Z;
        e28 e28Var = (e28) ry1Var.b;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) ry1Var.d;
        byte[] bArr2 = ks8.a;
        if (!p76Var.j) {
            e28Var.c((f23) ry1Var.c, 0L);
            return null;
        }
        p76Var.j = true;
        concurrentLinkedQueue.remove(p76Var);
        if (concurrentLinkedQueue.isEmpty()) {
            e28Var.a();
        }
        Socket socket = p76Var.d;
        socket.getClass();
        return socket;
    }
}
