package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h90 extends InputStream {
    public final /* synthetic */ byte X;
    public final Object Y;

    public h90(ByteBuffer byteBuffer) {
        this.X = (byte) 1;
        this.Y = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return (int) Math.min(((i90) obj).Y, 2147483647L);
            case 1:
                return ((ByteBuffer) obj).remaining();
            default:
                j76 j76Var = (j76) obj;
                if (!j76Var.Z) {
                    return (int) Math.min(j76Var.Y.Y, 2147483647L);
                }
                u52.s("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.X) {
            case 0:
                break;
            case 1:
            default:
                super.close();
                break;
            case 2:
                ((j76) this.Y).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                bArr.getClass();
                return ((i90) obj).read(bArr, i, i2);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int iMin = Math.min(i2, byteBuffer.remaining());
                byteBuffer.get(bArr, i, iMin);
                return iMin;
            default:
                bArr.getClass();
                j76 j76Var = (j76) obj;
                i90 i90Var = j76Var.Y;
                if (j76Var.Z) {
                    u52.s("closed");
                    return 0;
                }
                os4.i(bArr.length, i, i2);
                if (i90Var.Y == 0 && j76Var.X.read(i90Var, 8192L) == -1) {
                    return -1;
                }
                return i90Var.read(bArr, i, i2);
        }
    }

    public String toString() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((i90) obj) + ".inputStream()";
            case 1:
            default:
                return super.toString();
            case 2:
                return ((j76) obj) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.X) {
            case 2:
                outputStream.getClass();
                j76 j76Var = (j76) this.Y;
                i90 i90Var = j76Var.Y;
                if (j76Var.Z) {
                    u52.s("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (i90Var.Y == 0 && j76Var.X.read(i90Var, 8192L) == -1) {
                        return j;
                    }
                    long j2 = i90Var.Y;
                    j += j2;
                    os4.i(j2, 0L, j2);
                    mz6 mz6Var = i90Var.X;
                    while (j2 > 0) {
                        mz6Var.getClass();
                        int iMin = (int) Math.min(j2, mz6Var.c - mz6Var.b);
                        outputStream.write(mz6Var.a, mz6Var.b, iMin);
                        int i = mz6Var.b + iMin;
                        mz6Var.b = i;
                        long j3 = iMin;
                        i90Var.Y -= j3;
                        j2 -= j3;
                        if (i == mz6Var.c) {
                            mz6 mz6VarA = mz6Var.a();
                            i90Var.X = mz6VarA;
                            pz6.a(mz6Var);
                            mz6Var = mz6VarA;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    public /* synthetic */ h90(ba0 ba0Var, byte b) {
        this.X = b;
        this.Y = ba0Var;
    }

    private final void g() {
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                i90 i90Var = (i90) obj;
                if (i90Var.Y > 0) {
                    return i90Var.readByte() & 255;
                }
                return -1;
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & 255;
                }
                return -1;
            default:
                j76 j76Var = (j76) obj;
                i90 i90Var2 = j76Var.Y;
                if (j76Var.Z) {
                    u52.s("closed");
                    return 0;
                }
                if (i90Var2.Y == 0 && j76Var.X.read(i90Var2, 8192L) == -1) {
                    return -1;
                }
                return i90Var2.readByte() & 255;
        }
    }
}
