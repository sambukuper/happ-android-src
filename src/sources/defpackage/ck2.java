package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ck2 implements je7 {
    private final je7 delegate;

    public ck2(je7 je7Var) {
        je7Var.getClass();
        this.delegate = je7Var;
    }

    @ti1
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final je7 m7deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final je7 delegate() {
        return this.delegate;
    }

    @Override // defpackage.je7
    public long read(i90 i90Var, long j) throws IOException {
        i90Var.getClass();
        return this.delegate.read(i90Var, j);
    }

    @Override // defpackage.je7
    public ta8 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
