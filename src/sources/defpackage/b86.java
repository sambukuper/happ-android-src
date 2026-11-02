package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b86 implements Closeable {
    public final /* synthetic */ byte X;
    public final long Y;
    public final ba0 Z;

    public /* synthetic */ b86(long j, ba0 ba0Var, byte b) {
        this.X = b;
        this.Y = j;
        this.Z = ba0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ks8.c(source());
    }

    public final long g() {
        switch (this.X) {
            case 0:
                break;
        }
        return this.Y;
    }

    public final ba0 source() {
        byte b = this.X;
        ba0 ba0Var = this.Z;
        switch (b) {
            case 0:
                return (j76) ba0Var;
            default:
                return (i90) ba0Var;
        }
    }
}
