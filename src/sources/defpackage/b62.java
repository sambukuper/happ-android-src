package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b62 extends x52 {
    public b62(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.X.mark(Integer.MAX_VALUE);
        } else {
            bt.q("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void k(long j) throws IOException {
        int i = this.Y;
        if (i > j) {
            this.Y = 0;
            this.X.reset();
        } else {
            j -= (long) i;
        }
        g((int) j);
    }

    public b62(byte[] bArr) {
        super(bArr);
        this.X.mark(Integer.MAX_VALUE);
    }
}
