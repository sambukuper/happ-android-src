package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jh1 implements sa7 {
    public final i76 X;
    public final Deflater Y;
    public boolean Z;

    public jh1(i76 i76Var, Deflater deflater) {
        this.X = i76Var;
        this.Y = deflater;
    }

    @Override // defpackage.sa7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.Y;
        if (this.Z) {
            return;
        }
        deflater.finish();
        g(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.X.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.Z = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.sa7, java.io.Flushable
    public final void flush() throws IOException {
        g(true);
        this.X.flush();
    }

    public final void g(boolean z) throws IOException {
        mz6 mz6VarU0;
        int iDeflate;
        i76 i76Var = this.X;
        i90 i90Var = i76Var.Y;
        while (true) {
            mz6VarU0 = i90Var.u0(1);
            byte[] bArr = mz6VarU0.a;
            int i = mz6VarU0.c;
            Deflater deflater = this.Y;
            if (z) {
                try {
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (IllegalStateException e) {
                    throw new IOException("Deflater already closed", e);
                } catch (NullPointerException e2) {
                    throw new IOException("Deflater already closed", e2);
                }
            } else {
                iDeflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (iDeflate > 0) {
                mz6VarU0.c += iDeflate;
                i90Var.Y += (long) iDeflate;
                i76Var.O();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (mz6VarU0.b == mz6VarU0.c) {
            i90Var.X = mz6VarU0.a();
            pz6.a(mz6VarU0);
        }
    }

    @Override // defpackage.sa7
    public final ta8 timeout() {
        return this.X.X.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.X + ')';
    }

    @Override // defpackage.sa7
    public final void write(i90 i90Var, long j) throws IOException {
        i90Var.getClass();
        os4.i(i90Var.Y, 0L, j);
        while (true) {
            Deflater deflater = this.Y;
            if (j <= 0) {
                deflater.setInput(g33.d, 0, 0);
                return;
            }
            mz6 mz6Var = i90Var.X;
            mz6Var.getClass();
            int iMin = (int) Math.min(j, mz6Var.c - mz6Var.b);
            deflater.setInput(mz6Var.a, mz6Var.b, iMin);
            g(false);
            long j2 = iMin;
            i90Var.Y -= j2;
            int i = mz6Var.b + iMin;
            mz6Var.b = i;
            if (i == mz6Var.c) {
                i90Var.X = mz6Var.a();
                pz6.a(mz6Var);
            }
            j -= j2;
        }
    }
}
