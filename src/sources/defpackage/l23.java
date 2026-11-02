package defpackage;

import java.io.InterruptedIOException;
import okhttp3.internal.http2.Http2Stream;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l23 implements sa7 {
    public final boolean X;
    public final i90 Y = new i90();
    public boolean Z;
    public final /* synthetic */ o23 f0;

    public l23(o23 o23Var, boolean z) {
        this.f0 = o23Var;
        this.X = z;
    }

    @Override // defpackage.sa7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        o23 o23Var = this.f0;
        byte[] bArr = ks8.a;
        synchronized (o23Var) {
            if (this.Z) {
                return;
            }
            synchronized (o23Var) {
                z = o23Var.m == 0;
            }
            o23 o23Var2 = this.f0;
            if (!o23Var2.j.X) {
                if (this.Y.Y > 0) {
                    while (this.Y.Y > 0) {
                        g(true);
                    }
                } else if (z) {
                    o23Var2.b.C(o23Var2.a, true, null, 0L);
                }
            }
            synchronized (this.f0) {
                this.Z = true;
            }
            this.f0.b.y0.flush();
            this.f0.a();
        }
    }

    @Override // defpackage.sa7, java.io.Flushable
    public final void flush() {
        o23 o23Var = this.f0;
        byte[] bArr = ks8.a;
        synchronized (o23Var) {
            o23Var.b();
        }
        while (this.Y.Y > 0) {
            g(false);
            this.f0.b.y0.flush();
        }
    }

    public final void g(boolean z) {
        long jMin;
        boolean z2;
        o23 o23Var = this.f0;
        synchronized (o23Var) {
            o23Var.l.enter();
            while (o23Var.e >= o23Var.f && !this.X && !this.Z) {
                try {
                    synchronized (o23Var) {
                        int i = o23Var.m;
                        if (i != 0) {
                            break;
                        }
                        try {
                            o23Var.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    o23Var.l.exitAndThrowIfTimedOut();
                    throw th;
                }
            }
            o23Var.l.exitAndThrowIfTimedOut();
            o23Var.b();
            jMin = Math.min(o23Var.f - o23Var.e, this.Y.Y);
            o23Var.e += jMin;
            z2 = z && jMin == this.Y.Y;
        }
        this.f0.l.enter();
        try {
            o23 o23Var2 = this.f0;
            o23Var2.b.C(o23Var2.a, z2, this.Y, jMin);
        } finally {
            this.f0.l.exitAndThrowIfTimedOut();
        }
    }

    @Override // defpackage.sa7
    public final ta8 timeout() {
        return this.f0.l;
    }

    @Override // defpackage.sa7
    public final void write(i90 i90Var, long j) {
        i90Var.getClass();
        byte[] bArr = ks8.a;
        i90 i90Var2 = this.Y;
        i90Var2.write(i90Var, j);
        while (i90Var2.Y >= Http2Stream.EMIT_BUFFER_SIZE) {
            g(false);
        }
    }
}
