package io.sentry.cache.tape;

import defpackage.bt;
import defpackage.ie2;
import defpackage.oi0;
import defpackage.pc6;
import defpackage.u52;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Closeable, Iterable {
    public static final byte[] n0 = new byte[4096];
    public RandomAccessFile X;
    public final File Y;
    public long Z;
    public int f0;
    public h g0;
    public h h0;
    public final byte[] i0 = new byte[32];
    public int j0 = 0;
    public final int k0;
    public final boolean l0;
    public boolean m0;

    public j(File file, RandomAccessFile randomAccessFile, int i, boolean z) throws IOException {
        this.Y = file;
        this.X = randomAccessFile;
        this.k0 = i;
        this.l0 = z;
        X();
    }

    public static RandomAccessFile R(File file, boolean z) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                randomAccessFile.writeInt(-2147483647);
                randomAccessFile.writeLong(4096L);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    u52.s("Rename failed!");
                    return null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        return new RandomAccessFile(file, z ? "rwd" : "rw");
    }

    public static void V0(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static int Y(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void Z0(long j, byte[] bArr, int i) {
        bArr[i] = (byte) (j >> 56);
        bArr[i + 1] = (byte) (j >> 48);
        bArr[i + 2] = (byte) (j >> 40);
        bArr[i + 3] = (byte) (j >> 32);
        bArr[i + 4] = (byte) (j >> 24);
        bArr[i + 5] = (byte) (j >> 16);
        bArr[i + 6] = (byte) (j >> 8);
        bArr[i + 7] = (byte) j;
    }

    public static long a0(int i, byte[] bArr) {
        return ((((long) bArr[i]) & 255) << 56) + ((((long) bArr[i + 1]) & 255) << 48) + ((((long) bArr[i + 2]) & 255) << 40) + ((((long) bArr[i + 3]) & 255) << 32) + ((((long) bArr[i + 4]) & 255) << 24) + ((((long) bArr[i + 5]) & 255) << 16) + ((((long) bArr[i + 6]) & 255) << 8) + (((long) bArr[i + 7]) & 255);
    }

    public final boolean B0(long j, byte[] bArr, int i) throws IOException {
        try {
            long jH0 = H0(j);
            long j2 = ((long) i) + jH0;
            long j3 = this.Z;
            RandomAccessFile randomAccessFile = this.X;
            if (j2 <= j3) {
                randomAccessFile.seek(jH0);
                this.X.readFully(bArr, 0, i);
                return true;
            }
            int i2 = (int) (j3 - jH0);
            randomAccessFile.seek(jH0);
            this.X.readFully(bArr, 0, i2);
            this.X.seek(32L);
            this.X.readFully(bArr, i2, i - i2);
            return true;
        } catch (EOFException unused) {
            u0();
            return false;
        } catch (IOException e) {
            throw e;
        } catch (Throwable unused2) {
            u0();
            return false;
        }
    }

    public final void C0(long j, byte[] bArr, int i) throws IOException {
        long jH0 = H0(j);
        long j2 = ((long) i) + jH0;
        long j3 = this.Z;
        RandomAccessFile randomAccessFile = this.X;
        if (j2 <= j3) {
            randomAccessFile.seek(jH0);
            this.X.write(bArr, 0, i);
            return;
        }
        int i2 = (int) (j3 - jH0);
        randomAccessFile.seek(jH0);
        this.X.write(bArr, 0, i2);
        this.X.seek(32L);
        this.X.write(bArr, i2, i - i2);
    }

    public final long H0(long j) {
        long j2 = this.Z;
        return j < j2 ? j : (j + 32) - j2;
    }

    public final void J0(long j, int i, long j2, long j3) throws IOException {
        this.X.seek(0L);
        byte[] bArr = this.i0;
        V0(0, -2147483647, bArr);
        Z0(j, bArr, 4);
        V0(12, i, bArr);
        Z0(j2, bArr, 16);
        Z0(j3, bArr, 24);
        this.X.write(bArr, 0, 32);
    }

    public final h U(long j) {
        if (j != 0) {
            byte[] bArr = this.i0;
            if (B0(j, bArr, 4)) {
                return new h(j, Y(0, bArr));
            }
        }
        return h.c;
    }

    public final void X() throws IOException {
        this.X.seek(0L);
        RandomAccessFile randomAccessFile = this.X;
        byte[] bArr = this.i0;
        randomAccessFile.readFully(bArr);
        this.Z = a0(4, bArr);
        this.f0 = Y(12, bArr);
        long jA0 = a0(16, bArr);
        long jA1 = a0(24, bArr);
        long j = this.Z;
        long length = this.X.length();
        long j2 = this.Z;
        if (j > length) {
            StringBuilder sbS = pc6.s(j2, "File is truncated. Expected length: ", ", Actual length: ");
            sbS.append(this.X.length());
            throw new IOException(sbS.toString());
        }
        if (j2 > 32) {
            this.g0 = U(jA0);
            this.h0 = U(jA1);
        } else {
            u52.s(ie2.g(this.Z, ") is invalid.", new StringBuilder("File is corrupt; length stored in header (")));
        }
    }

    public final void c0(int i) throws IOException {
        if (i < 0) {
            bt.q(ie2.h("Cannot remove negative (", i, ") number of elements."));
            return;
        }
        if (i == 0) {
            return;
        }
        int i2 = this.f0;
        if (i == i2) {
            clear();
            return;
        }
        if (i2 == 0) {
            bt.n();
            return;
        }
        if (i > i2) {
            bt.q(oi0.n(ie2.l("Cannot remove more elements (", i, ") than present in queue ("), this.f0, ")."));
            return;
        }
        h hVar = this.g0;
        long j = hVar.a;
        int iY = hVar.b;
        long jH0 = j;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            j2 += (long) (iY + 4);
            jH0 = H0(jH0 + 4 + ((long) iY));
            byte[] bArr = this.i0;
            if (!B0(jH0, bArr, 4)) {
                return;
            }
            iY = Y(0, bArr);
        }
        J0(this.Z, this.f0 - i, jH0, this.h0.a);
        this.f0 -= i;
        this.j0++;
        this.g0 = new h(jH0, iY);
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, 4096L);
            C0(j, n0, iMin);
            long j3 = iMin;
            j2 -= j3;
            j += j3;
        }
    }

    public final void clear() throws IOException {
        if (this.m0) {
            bt.i("closed");
            return;
        }
        J0(4096L, 0, 0L, 0L);
        this.X.seek(32L);
        this.X.write(n0, 0, 4064);
        this.f0 = 0;
        h hVar = h.c;
        this.g0 = hVar;
        this.h0 = hVar;
        if (this.Z > 4096) {
            this.X.setLength(4096L);
            this.X.getChannel().force(true);
        }
        this.Z = 4096L;
        this.j0++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.m0 = true;
        this.X.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new i(this);
    }

    public final String toString() {
        return "QueueFile{file=" + this.Y + ", zero=true, length=" + this.Z + ", size=" + this.f0 + ", first=" + this.g0 + ", last=" + this.h0 + '}';
    }

    public final void u0() throws IOException {
        this.X.close();
        File file = this.Y;
        file.delete();
        this.X = R(file, this.l0);
        X();
    }
}
