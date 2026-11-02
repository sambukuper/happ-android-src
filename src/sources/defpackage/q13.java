package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q13 extends n13 {
    public boolean f0;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.Y) {
            return;
        }
        if (!this.f0) {
            g();
        }
        this.Y = true;
    }

    @Override // defpackage.n13, defpackage.je7
    public final long read(i90 i90Var, long j) throws IOException {
        i90Var.getClass();
        if (j < 0) {
            em7.c(ie2.f(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.Y) {
            bt.i("closed");
            return 0L;
        }
        if (this.f0) {
            return -1L;
        }
        long j2 = super.read(i90Var, j);
        if (j2 != -1) {
            return j2;
        }
        this.f0 = true;
        g();
        return -1L;
    }
}
