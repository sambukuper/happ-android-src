package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.Http2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p23 implements Closeable {
    public static final Logger h0 = Logger.getLogger(s13.class.getName());
    public final aa0 X;
    public final i90 Y;
    public int Z;
    public boolean f0;
    public final l13 g0;

    public p23(i76 i76Var) {
        i76Var.getClass();
        this.X = i76Var;
        i90 i90Var = new i90();
        this.Y = i90Var;
        this.Z = Http2.INITIAL_MAX_FRAME_SIZE;
        this.g0 = new l13(i90Var);
    }

    public final synchronized void C(boolean z, int i, int i2) {
        if (this.f0) {
            throw new IOException("closed");
        }
        m(0, 8, 6, z ? 1 : 0);
        this.X.writeInt(i);
        this.X.writeInt(i2);
        this.X.flush();
    }

    public final synchronized void D(int i, int i2) {
        try {
            if (i2 == 0) {
                throw null;
            }
            if (this.f0) {
                throw new IOException("closed");
            }
            if (oi0.d(i2) == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            m(i, 4, 3, 0);
            this.X.writeInt(oi0.d(i2));
            this.X.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void J(int i, long j) {
        if (this.f0) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        m(i, 4, 8, 0);
        this.X.writeInt((int) j);
        this.X.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f0 = true;
        this.X.close();
    }

    public final synchronized void flush() {
        if (this.f0) {
            throw new IOException("closed");
        }
        this.X.flush();
    }

    public final synchronized void g(t57 t57Var) {
        try {
            t57Var.getClass();
            if (this.f0) {
                throw new IOException("closed");
            }
            int i = this.Z;
            int i2 = t57Var.a;
            if ((i2 & 32) != 0) {
                i = t57Var.b[5];
            }
            this.Z = i;
            if (((i2 & 2) != 0 ? t57Var.b[1] : -1) != -1) {
                l13 l13Var = this.g0;
                int iMin = Math.min((i2 & 2) != 0 ? t57Var.b[1] : -1, Http2.INITIAL_MAX_FRAME_SIZE);
                int i3 = l13Var.d;
                if (i3 != iMin) {
                    if (iMin < i3) {
                        l13Var.b = Math.min(l13Var.b, iMin);
                    }
                    l13Var.c = true;
                    l13Var.d = iMin;
                    int i4 = l13Var.h;
                    if (iMin < i4) {
                        if (iMin == 0) {
                            kz2[] kz2VarArr = l13Var.e;
                            eu.m0(0, kz2VarArr.length, null, kz2VarArr);
                            l13Var.f = l13Var.e.length - 1;
                            l13Var.g = 0;
                            l13Var.h = 0;
                        } else {
                            l13Var.a(i4 - iMin);
                        }
                    }
                }
            }
            m(0, 0, 4, 1);
            this.X.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(boolean z, int i, i90 i90Var, int i2) {
        if (this.f0) {
            throw new IOException("closed");
        }
        m(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            aa0 aa0Var = this.X;
            i90Var.getClass();
            aa0Var.write(i90Var, i2);
        }
    }

    public final void m(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = h0;
        if (logger.isLoggable(level)) {
            logger.fine(s13.a(false, i, i2, i3, i4));
        }
        if (i2 > this.Z) {
            u52.l("FRAME_SIZE_ERROR length > ", this.Z, i2, ": ");
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            em7.c(pc6.j(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = ks8.a;
        aa0 aa0Var = this.X;
        aa0Var.writeByte((i2 >>> 16) & 255);
        aa0Var.writeByte((i2 >>> 8) & 255);
        aa0Var.writeByte(i2 & 255);
        aa0Var.writeByte(i3 & 255);
        aa0Var.writeByte(i4 & 255);
        aa0Var.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void p(int i, int i2, byte[] bArr) {
        try {
            if (i2 == 0) {
                throw null;
            }
            if (this.f0) {
                throw new IOException("closed");
            }
            if (oi0.d(i2) == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            m(0, bArr.length + 8, 7, 0);
            this.X.writeInt(i);
            this.X.writeInt(oi0.d(i2));
            if (bArr.length != 0) {
                this.X.write(bArr);
            }
            this.X.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void u(boolean z, int i, ArrayList arrayList) {
        if (this.f0) {
            throw new IOException("closed");
        }
        this.g0.d(arrayList);
        long j = this.Y.Y;
        long jMin = Math.min(this.Z, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        m(i, (int) jMin, 1, i2);
        this.X.write(this.Y, jMin);
        if (j > jMin) {
            long j2 = j - jMin;
            while (j2 > 0) {
                long jMin2 = Math.min(this.Z, j2);
                j2 -= jMin2;
                m(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                this.X.write(this.Y, jMin2);
            }
        }
    }
}
