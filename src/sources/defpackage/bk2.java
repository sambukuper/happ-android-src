package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bk2 implements sa7 {
    private final sa7 delegate;

    public bk2(sa7 sa7Var) {
        sa7Var.getClass();
        this.delegate = sa7Var;
    }

    @ti1
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final sa7 m6deprecated_delegate() {
        return this.delegate;
    }

    @Override // defpackage.sa7, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final sa7 delegate() {
        return this.delegate;
    }

    @Override // defpackage.sa7, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // defpackage.sa7
    public ta8 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // defpackage.sa7
    public void write(i90 i90Var, long j) throws IOException {
        i90Var.getClass();
        this.delegate.write(i90Var, j);
    }
}
