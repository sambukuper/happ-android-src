package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ct3 extends g92 {
    public final /* synthetic */ byte f0;
    public final Closeable g0;

    public /* synthetic */ ct3(Closeable closeable, byte b) {
        this.f0 = b;
        this.g0 = closeable;
    }

    @Override // defpackage.g92
    public final synchronized void g() {
        byte b = this.f0;
        synchronized (this) {
            switch (b) {
                case 0:
                    ((RandomAccessFile) this.g0).close();
                    return;
                default:
                    ((FileChannel) this.g0).close();
                    return;
            }
        }
    }

    @Override // defpackage.g92
    public final synchronized int k(long j, byte[] bArr, int i, int i2) {
        byte b = this.f0;
        int i3 = 0;
        synchronized (this) {
            switch (b) {
                case 0:
                    bArr.getClass();
                    ((RandomAccessFile) this.g0).seek(j);
                    while (i3 < i2) {
                        int i4 = ((RandomAccessFile) this.g0).read(bArr, i, i2 - i3);
                        if (i4 == -1) {
                            if (i3 == 0) {
                                return -1;
                            }
                            return i3;
                        }
                        i3 += i4;
                    }
                    return i3;
                default:
                    bArr.getClass();
                    ((FileChannel) this.g0).position(j);
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
                    while (i3 < i2) {
                        int i5 = ((FileChannel) this.g0).read(byteBufferWrap);
                        if (i5 == -1) {
                            if (i3 == 0) {
                                return -1;
                            }
                            return i3;
                        }
                        i3 += i5;
                    }
                    return i3;
            }
        }
    }

    @Override // defpackage.g92
    public final synchronized long m() {
        byte b = this.f0;
        synchronized (this) {
            switch (b) {
                case 0:
                    return ((RandomAccessFile) this.g0).length();
                default:
                    return ((FileChannel) this.g0).size();
            }
        }
    }
}
