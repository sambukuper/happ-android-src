package defpackage;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e60 implements sa7 {
    @Override // defpackage.sa7
    public final ta8 timeout() {
        return ta8.NONE;
    }

    @Override // defpackage.sa7
    public final void write(i90 i90Var, long j) throws EOFException {
        i90Var.getClass();
        i90Var.skip(j);
    }

    @Override // defpackage.sa7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.sa7, java.io.Flushable
    public final void flush() {
    }
}
