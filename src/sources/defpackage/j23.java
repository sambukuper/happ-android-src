package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j23 implements je7 {
    public final ba0 X;
    public int Y;
    public int Z;
    public int f0;
    public int g0;
    public int h0;

    public j23(ba0 ba0Var) {
        this.X = ba0Var;
    }

    @Override // defpackage.je7
    public final long read(i90 i90Var, long j) throws IOException {
        int i;
        int i2;
        i90Var.getClass();
        do {
            int i3 = this.g0;
            ba0 ba0Var = this.X;
            if (i3 == 0) {
                ba0Var.skip(this.h0);
                this.h0 = 0;
                if ((this.Z & 4) == 0) {
                    i = this.f0;
                    int iQ = ks8.q(ba0Var);
                    this.g0 = iQ;
                    this.Y = iQ;
                    int i4 = ba0Var.readByte() & 255;
                    this.Z = ba0Var.readByte() & 255;
                    Logger logger = k23.f0;
                    if (logger.isLoggable(Level.FINE)) {
                        kb0 kb0Var = s13.a;
                        logger.fine(s13.a(true, this.f0, this.Y, i4, this.Z));
                    }
                    i2 = ba0Var.readInt() & Integer.MAX_VALUE;
                    this.f0 = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long j2 = ba0Var.read(i90Var, Math.min(j, i3));
                if (j2 != -1) {
                    this.g0 -= (int) j2;
                    return j2;
                }
            }
            return -1L;
        } while (i2 == i);
        u52.s("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // defpackage.je7
    public final ta8 timeout() {
        return this.X.timeout();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
