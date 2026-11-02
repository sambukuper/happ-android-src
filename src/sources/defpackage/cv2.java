package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cv2 implements sa7 {
    public final i76 X;
    public final Deflater Y;
    public final jh1 Z;
    public boolean f0;
    public final CRC32 g0;

    public cv2(aa0 aa0Var) {
        i76 i76Var = new i76(aa0Var);
        this.X = i76Var;
        Deflater deflater = new Deflater(-1, true);
        this.Y = deflater;
        this.Z = new jh1(i76Var, deflater);
        this.g0 = new CRC32();
        i90 i90Var = i76Var.Y;
        i90Var.a1(8075);
        i90Var.H0(8);
        i90Var.H0(0);
        i90Var.Z0(0);
        i90Var.H0(0);
        i90Var.H0(0);
    }

    @Override // defpackage.sa7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.Y;
        i76 i76Var = this.X;
        i90 i90Var = i76Var.Y;
        if (this.f0) {
            return;
        }
        try {
            jh1 jh1Var = this.Z;
            jh1Var.Y.finish();
            jh1Var.g(false);
            int value = (int) this.g0.getValue();
            if (i76Var.Z) {
                throw new IllegalStateException("closed");
            }
            i90Var.Z0(os4.K(value));
            i76Var.O();
            int bytesRead = (int) deflater.getBytesRead();
            if (i76Var.Z) {
                throw new IllegalStateException("closed");
            }
            i90Var.Z0(os4.K(bytesRead));
            i76Var.O();
            th = null;
            try {
                deflater.end();
            } catch (Throwable th) {
                if (th == null) {
                    th = th;
                }
            }
            try {
                i76Var.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f0 = true;
            if (th != null) {
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.sa7, java.io.Flushable
    public final void flush() throws IOException {
        this.Z.flush();
    }

    @Override // defpackage.sa7
    public final ta8 timeout() {
        return this.X.X.timeout();
    }

    @Override // defpackage.sa7
    public final void write(i90 i90Var, long j) throws IOException {
        i90Var.getClass();
        if (j < 0) {
            em7.c(ie2.f(j, "byteCount < 0: "));
            return;
        }
        if (j == 0) {
            return;
        }
        mz6 mz6Var = i90Var.X;
        mz6Var.getClass();
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, mz6Var.c - mz6Var.b);
            this.g0.update(mz6Var.a, mz6Var.b, iMin);
            j2 -= (long) iMin;
            mz6Var = mz6Var.f;
            mz6Var.getClass();
        }
        this.Z.write(i90Var, j);
    }
}
