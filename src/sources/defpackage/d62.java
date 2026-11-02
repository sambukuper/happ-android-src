package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d62 extends InputStream {
    public final InputStream X;
    public int Y = 1073741824;

    public d62(InputStream inputStream) {
        this.X = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.Y;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.X.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.X.read();
        if (i == -1) {
            this.Y = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.X.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.X.read(bArr);
        if (i == -1) {
            this.Y = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.X.read(bArr, i, i2);
        if (i3 == -1) {
            this.Y = 0;
        }
        return i3;
    }
}
