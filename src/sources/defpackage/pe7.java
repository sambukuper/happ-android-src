package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pe7 implements AutoCloseable {
    public final ba0 X;

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.X.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pe7) {
            return this.X.equals(((pe7) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.X + ")";
    }
}
