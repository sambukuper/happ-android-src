package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class za0 implements je7 {
    public final ByteBuffer X;
    public final int Y;

    public za0(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.X = byteBufferSlice;
        this.Y = byteBufferSlice.capacity();
    }

    @Override // defpackage.je7
    public final long read(i90 i90Var, long j) {
        ByteBuffer byteBuffer = this.X;
        int iPosition = byteBuffer.position();
        int i = this.Y;
        if (iPosition == i) {
            return -1L;
        }
        int iPosition2 = (int) (((long) byteBuffer.position()) + j);
        if (iPosition2 <= i) {
            i = iPosition2;
        }
        byteBuffer.limit(i);
        return i90Var.write(byteBuffer);
    }

    @Override // defpackage.je7
    public final ta8 timeout() {
        return ta8.NONE;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
