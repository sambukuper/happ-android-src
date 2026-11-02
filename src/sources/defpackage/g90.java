package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g90 implements Closeable {
    public i90 X;
    public boolean Y;
    public mz6 Z;
    public byte[] g0;
    public long f0 = -1;
    public int h0 = -1;
    public int i0 = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.X == null) {
            bt.i("not attached to a buffer");
            return;
        }
        this.X = null;
        this.Z = null;
        this.f0 = -1L;
        this.g0 = null;
        this.h0 = -1;
        this.i0 = -1;
    }

    public final void g(long j) {
        i90 i90Var = this.X;
        if (i90Var == null) {
            bt.i("not attached to a buffer");
            return;
        }
        if (!this.Y) {
            bt.i("resizeBuffer() only permitted for read/write buffers");
            return;
        }
        long j2 = i90Var.Y;
        if (j <= j2) {
            if (j < 0) {
                em7.c(ie2.f(j, "newSize < 0: "));
                return;
            }
            long j3 = j2 - j;
            while (j3 > 0) {
                mz6 mz6Var = i90Var.X;
                mz6Var.getClass();
                mz6 mz6Var2 = mz6Var.g;
                mz6Var2.getClass();
                int i = mz6Var2.c;
                long j4 = i - mz6Var2.b;
                if (j4 > j3) {
                    mz6Var2.c = i - ((int) j3);
                    break;
                } else {
                    i90Var.X = mz6Var2.a();
                    pz6.a(mz6Var2);
                    j3 -= j4;
                }
            }
            this.Z = null;
            this.f0 = j;
            this.g0 = null;
            this.h0 = -1;
            this.i0 = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                mz6 mz6VarU0 = i90Var.u0(i2);
                int iMin = (int) Math.min(j5, 8192 - mz6VarU0.c);
                int i3 = mz6VarU0.c + iMin;
                mz6VarU0.c = i3;
                j5 -= (long) iMin;
                if (z) {
                    this.Z = mz6VarU0;
                    this.f0 = j2;
                    this.g0 = mz6VarU0.a;
                    this.h0 = i3 - iMin;
                    this.i0 = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        i90Var.Y = j;
    }

    public final int k(long j) {
        i90 i90Var = this.X;
        if (i90Var == null) {
            bt.i("not attached to a buffer");
            return 0;
        }
        if (j >= -1) {
            long j2 = i90Var.Y;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.Z = null;
                    this.f0 = j;
                    this.g0 = null;
                    this.h0 = -1;
                    this.i0 = -1;
                    return -1;
                }
                mz6 mz6Var = i90Var.X;
                mz6 mz6Var2 = this.Z;
                long j3 = 0;
                if (mz6Var2 != null) {
                    long j4 = this.f0 - ((long) (this.h0 - mz6Var2.b));
                    if (j4 > j) {
                        mz6Var2 = mz6Var;
                        mz6Var = mz6Var2;
                        j2 = j4;
                    } else {
                        j3 = j4;
                    }
                } else {
                    mz6Var2 = mz6Var;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        mz6Var2.getClass();
                        long j5 = ((long) (mz6Var2.c - mz6Var2.b)) + j3;
                        if (j < j5) {
                            break;
                        }
                        mz6Var2 = mz6Var2.f;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        mz6Var.getClass();
                        mz6Var = mz6Var.g;
                        mz6Var.getClass();
                        j2 -= (long) (mz6Var.c - mz6Var.b);
                    }
                    mz6Var2 = mz6Var;
                    j3 = j2;
                }
                if (this.Y) {
                    mz6Var2.getClass();
                    if (mz6Var2.d) {
                        byte[] bArr = mz6Var2.a;
                        mz6 mz6Var3 = new mz6(Arrays.copyOf(bArr, bArr.length), mz6Var2.b, mz6Var2.c, false, true);
                        if (i90Var.X == mz6Var2) {
                            i90Var.X = mz6Var3;
                        }
                        mz6Var2.b(mz6Var3);
                        mz6 mz6Var4 = mz6Var3.g;
                        mz6Var4.getClass();
                        mz6Var4.a();
                        mz6Var2 = mz6Var3;
                    }
                }
                this.Z = mz6Var2;
                this.f0 = j;
                mz6Var2.getClass();
                this.g0 = mz6Var2.a;
                int i = mz6Var2.b + ((int) (j - j3));
                this.h0 = i;
                int i2 = mz6Var2.c;
                this.i0 = i2;
                return i2 - i;
            }
        }
        StringBuilder sbS = pc6.s(j, "offset=", " > size=");
        sbS.append(i90Var.Y);
        throw new ArrayIndexOutOfBoundsException(sbS.toString());
    }
}
