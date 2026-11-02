package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h23 implements Closeable {
    public static final t57 B0;
    public final LinkedHashSet A0;
    public final y13 X;
    public final LinkedHashMap Y = new LinkedHashMap();
    public final String Z;
    public int f0;
    public int g0;
    public boolean h0;
    public final f28 i0;
    public final e28 j0;
    public final e28 k0;
    public final e28 l0;
    public final qe4 m0;
    public long n0;
    public long o0;
    public long p0;
    public long q0;
    public final t57 r0;
    public t57 s0;
    public long t0;
    public long u0;
    public long v0;
    public long w0;
    public final Socket x0;
    public final p23 y0;
    public final c3 z0;

    static {
        t57 t57Var = new t57();
        t57Var.b(7, 65535);
        t57Var.b(5, Http2.INITIAL_MAX_FRAME_SIZE);
        B0 = t57Var;
    }

    public h23(fu6 fu6Var) {
        this.X = (y13) fu6Var.i0;
        String str = (String) fu6Var.f0;
        if (str == null) {
            dh3.T("connectionName");
            throw null;
        }
        this.Z = str;
        this.g0 = 3;
        f28 f28Var = (f28) fu6Var.Y;
        this.i0 = f28Var;
        this.j0 = f28Var.d();
        this.k0 = f28Var.d();
        this.l0 = f28Var.d();
        this.m0 = qe4.p0;
        t57 t57Var = new t57();
        t57Var.b(7, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        this.r0 = t57Var;
        t57 t57Var2 = B0;
        this.s0 = t57Var2;
        this.w0 = t57Var2.a();
        Socket socket = (Socket) fu6Var.Z;
        if (socket == null) {
            dh3.T("socket");
            throw null;
        }
        this.x0 = socket;
        i76 i76Var = (i76) fu6Var.h0;
        if (i76Var == null) {
            dh3.T("sink");
            throw null;
        }
        this.y0 = new p23(i76Var);
        j76 j76Var = (j76) fu6Var.g0;
        if (j76Var == null) {
            dh3.T("source");
            throw null;
        }
        this.z0 = new c3((byte) 14, this, new k23(j76Var), false);
        this.A0 = new LinkedHashSet();
    }

    public final void C(int i, boolean z, i90 i90Var, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.y0.k(z, i, i90Var, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.v0;
                            j3 = this.w0;
                            if (j2 >= j3) {
                                if (!this.Y.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.y0.Z);
                j4 = iMin;
                this.v0 += j4;
            }
            j -= j4;
            this.y0.k(z && j == 0, i, i90Var, iMin);
        }
    }

    public final void D(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        this.j0.c(new c23(this.Z + '[' + i + "] writeSynReset", this, i, i2, (byte) 2), 0L);
    }

    public final void J(int i, long j) {
        this.j0.c(new g23(this.Z + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g(1, 9, null);
    }

    public final void g(int i, int i2, IOException iOException) {
        int i3;
        Object[] array = null;
        if (i == 0 || i2 == 0) {
            throw null;
        }
        byte[] bArr = ks8.a;
        try {
            p(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.Y.isEmpty()) {
                array = this.Y.values().toArray(new o23[0]);
                this.Y.clear();
            }
        }
        o23[] o23VarArr = (o23[]) array;
        if (o23VarArr != null) {
            for (o23 o23Var : o23VarArr) {
                try {
                    o23Var.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.y0.close();
        } catch (IOException unused3) {
        }
        try {
            this.x0.close();
        } catch (IOException unused4) {
        }
        this.j0.e();
        this.k0.e();
        this.l0.e();
    }

    public final synchronized o23 k(int i) {
        return (o23) this.Y.get(Integer.valueOf(i));
    }

    public final synchronized o23 m(int i) {
        o23 o23Var;
        o23Var = (o23) this.Y.remove(Integer.valueOf(i));
        notifyAll();
        return o23Var;
    }

    public final void p(int i) {
        if (i == 0) {
            throw null;
        }
        synchronized (this.y0) {
            synchronized (this) {
                if (this.h0) {
                    return;
                }
                this.h0 = true;
                this.y0.p(this.f0, i, ks8.a);
            }
        }
    }

    public final synchronized void u(long j) {
        long j2 = this.t0 + j;
        this.t0 = j2;
        long j3 = j2 - this.u0;
        if (j3 >= this.r0.a() / 2) {
            J(0, j3);
            this.u0 += j3;
        }
    }
}
