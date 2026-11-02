package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h82 implements sa7 {
    public final sa7 X;
    public final y0 Y;
    public boolean Z;

    public h82(sa7 sa7Var, y0 y0Var) {
        this.X = sa7Var;
        this.Y = y0Var;
    }

    @Override // defpackage.sa7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.X.close();
        } catch (IOException e) {
            this.Z = true;
            this.Y.B(e);
        }
    }

    @Override // defpackage.sa7, java.io.Flushable
    public final void flush() {
        try {
            this.X.flush();
        } catch (IOException e) {
            this.Z = true;
            this.Y.B(e);
        }
    }

    @Override // defpackage.sa7
    public final ta8 timeout() {
        return this.X.timeout();
    }

    @Override // defpackage.sa7
    public final void write(i90 i90Var, long j) throws EOFException {
        if (this.Z) {
            i90Var.skip(j);
            return;
        }
        try {
            this.X.write(i90Var, j);
        } catch (IOException e) {
            this.Z = true;
            this.Y.B(e);
        }
    }
}
