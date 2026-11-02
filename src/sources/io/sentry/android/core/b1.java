package io.sentry.android.core;

import defpackage.o8;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends InputStream {
    public final BufferedInputStream X;
    public long Y;

    public b1(BufferedInputStream bufferedInputStream, int i) {
        this.X = bufferedInputStream;
        this.Y = i;
    }

    @Override // java.io.InputStream
    public final int available() {
        return Math.min(this.X.available(), (int) this.Y);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        o8.o(this.X, this.Y);
        this.Y = 0L;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.Y;
        if (j <= 0) {
            return -1;
        }
        int i3 = this.X.read(bArr, i, Math.min(i2, (int) j));
        if (i3 > 0) {
            this.Y -= (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = this.X.skip(Math.min(j, this.Y));
        this.Y -= jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.Y <= 0) {
            return -1;
        }
        int i = this.X.read();
        if (i != -1) {
            this.Y--;
        }
        return i;
    }
}
