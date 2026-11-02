package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m23 implements je7 {
    public final long X;
    public boolean Y;
    public final i90 Z = new i90();
    public final i90 f0 = new i90();
    public boolean g0;
    public final /* synthetic */ o23 h0;

    public m23(o23 o23Var, long j, boolean z) {
        this.h0 = o23Var;
        this.X = j;
        this.Y = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        o23 o23Var = this.h0;
        synchronized (o23Var) {
            this.g0 = true;
            i90 i90Var = this.f0;
            j = i90Var.Y;
            i90Var.g();
            o23Var.notifyAll();
        }
        if (j > 0) {
            o23 o23Var2 = this.h0;
            byte[] bArr = ks8.a;
            o23Var2.b.u(j);
        }
        this.h0.a();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x003c A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:7:0x0015, B:9:0x0018, B:12:0x001c, B:14:0x0020, B:16:0x0024, B:17:0x0026, B:19:0x0029, B:21:0x002c, B:25:0x0034, B:28:0x0037, B:29:0x0038, B:31:0x003c, B:33:0x0047, B:35:0x005d, B:37:0x006c, B:38:0x0078, B:41:0x0082, B:44:0x0088, B:45:0x0094, B:58:0x00ac, B:59:0x00b3, B:62:0x00b6, B:8:0x0016, B:18:0x0027), top: B:69:0x0015, outer: #3, inners: #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0047 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:7:0x0015, B:9:0x0018, B:12:0x001c, B:14:0x0020, B:16:0x0024, B:17:0x0026, B:19:0x0029, B:21:0x002c, B:25:0x0034, B:28:0x0037, B:29:0x0038, B:31:0x003c, B:33:0x0047, B:35:0x005d, B:37:0x006c, B:38:0x0078, B:41:0x0082, B:44:0x0088, B:45:0x0094, B:58:0x00ac, B:59:0x00b3, B:62:0x00b6, B:8:0x0016, B:18:0x0027), top: B:69:0x0015, outer: #3, inners: #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0078 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:7:0x0015, B:9:0x0018, B:12:0x001c, B:14:0x0020, B:16:0x0024, B:17:0x0026, B:19:0x0029, B:21:0x002c, B:25:0x0034, B:28:0x0037, B:29:0x0038, B:31:0x003c, B:33:0x0047, B:35:0x005d, B:37:0x006c, B:38:0x0078, B:41:0x0082, B:44:0x0088, B:45:0x0094, B:58:0x00ac, B:59:0x00b3, B:62:0x00b6, B:8:0x0016, B:18:0x0027), top: B:69:0x0015, outer: #3, inners: #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x009d A[LOOP:0: B:4:0x000d->B:49:0x009d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a1 A[SYNTHETIC] */
    @Override // defpackage.je7
    public final long read(i90 i90Var, long j) throws Throwable {
        int i;
        Throwable th;
        i90 i90Var2;
        long j2;
        boolean z;
        long j3;
        long j4;
        long j5;
        i90Var.getClass();
        long j6 = 0;
        if (j < 0) {
            em7.c(ie2.f(j, "byteCount < 0: "));
            return 0L;
        }
        while (true) {
            o23 o23Var = this.h0;
            synchronized (o23Var) {
                o23Var.k.enter();
                try {
                    synchronized (o23Var) {
                        i = o23Var.m;
                    }
                    if (!z) {
                        if (j4 != -1) {
                            return j4;
                        }
                        if (th == null) {
                            return -1L;
                        }
                        throw th;
                    }
                    j6 = j3;
                } catch (Throwable th2) {
                    o23Var.k.exitAndThrowIfTimedOut();
                    throw th2;
                }
            }
            th = null;
            if (i != 0 && !this.Y) {
                Throwable el7Var = o23Var.n;
                if (el7Var == null) {
                    synchronized (o23Var) {
                        int i2 = o23Var.m;
                        if (i2 == 0) {
                            throw null;
                        }
                        el7Var = new el7(i2);
                    }
                }
                th = el7Var;
                if (!this.g0) {
                    throw new IOException("stream closed");
                }
                i90Var2 = this.f0;
                j2 = i90Var2.Y;
                z = false;
                if (j2 > j6) {
                    j4 = i90Var2.read(i90Var, Math.min(j, j2));
                    long j7 = o23Var.c + j4;
                    o23Var.c = j7;
                    j3 = j6;
                    j5 = j7 - o23Var.d;
                    if (th == null) {
                        o23Var.b.J(o23Var.a, j5);
                        o23Var.d = o23Var.c;
                    }
                } else {
                    j3 = j6;
                    if (!this.Y) {
                        o23Var.wait();
                        z = true;
                    }
                    j4 = -1;
                }
                o23Var.k.exitAndThrowIfTimedOut();
                if (!z) {
                    if (j4 != -1) {
                        return j4;
                    }
                    if (th == null) {
                        return -1L;
                    }
                    throw th;
                }
                j6 = j3;
            } else {
                if (!this.g0) {
                    throw new IOException("stream closed");
                }
                i90Var2 = this.f0;
                j2 = i90Var2.Y;
                z = false;
                if (j2 > j6) {
                    j4 = i90Var2.read(i90Var, Math.min(j, j2));
                    long j8 = o23Var.c + j4;
                    o23Var.c = j8;
                    j3 = j6;
                    j5 = j8 - o23Var.d;
                    if (th == null && j5 >= o23Var.b.r0.a() / 2) {
                        o23Var.b.J(o23Var.a, j5);
                        o23Var.d = o23Var.c;
                    }
                } else {
                    j3 = j6;
                    if (!this.Y && th == null) {
                        try {
                            o23Var.wait();
                            z = true;
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                    j4 = -1;
                }
                o23Var.k.exitAndThrowIfTimedOut();
                if (!z) {
                    if (j4 != -1) {
                        return j4;
                    }
                    if (th == null) {
                        return -1L;
                    }
                    throw th;
                }
                j6 = j3;
            }
            throw th;
        }
    }

    @Override // defpackage.je7
    public final ta8 timeout() {
        return this.h0.k;
    }
}
