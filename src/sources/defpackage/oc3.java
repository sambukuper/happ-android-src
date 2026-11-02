package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oc3 implements je7 {
    public final j76 X;
    public final Inflater Y;
    public int Z;
    public boolean f0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oc3(je7 je7Var, Inflater inflater) {
        this(new j76(je7Var), inflater);
        je7Var.getClass();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f0) {
            return;
        }
        this.Y.end();
        this.f0 = true;
        this.X.close();
    }

    public final long g(i90 i90Var, long j) throws IOException {
        Inflater inflater = this.Y;
        i90Var.getClass();
        if (j < 0) {
            em7.c(ie2.f(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.f0) {
            bt.i("closed");
            return 0L;
        }
        if (j != 0) {
            try {
                mz6 mz6VarU0 = i90Var.u0(1);
                int iMin = (int) Math.min(j, 8192 - mz6VarU0.c);
                boolean zNeedsInput = inflater.needsInput();
                j76 j76Var = this.X;
                if (zNeedsInput && !j76Var.F()) {
                    mz6 mz6Var = j76Var.Y.X;
                    mz6Var.getClass();
                    int i = mz6Var.c;
                    int i2 = mz6Var.b;
                    int i3 = i - i2;
                    this.Z = i3;
                    inflater.setInput(mz6Var.a, i2, i3);
                }
                int iInflate = inflater.inflate(mz6VarU0.a, mz6VarU0.c, iMin);
                int i4 = this.Z;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.Z -= remaining;
                    j76Var.skip(remaining);
                }
                if (iInflate > 0) {
                    mz6VarU0.c += iInflate;
                    long j2 = iInflate;
                    i90Var.Y += j2;
                    return j2;
                }
                if (mz6VarU0.b == mz6VarU0.c) {
                    i90Var.X = mz6VarU0.a();
                    pz6.a(mz6VarU0);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }

    @Override // defpackage.je7
    public final long read(i90 i90Var, long j) throws IOException {
        i90Var.getClass();
        do {
            long jG = g(i90Var, j);
            if (jG > 0) {
                return jG;
            }
            Inflater inflater = this.Y;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.X.F());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // defpackage.je7
    public final ta8 timeout() {
        return this.X.X.timeout();
    }

    public oc3(j76 j76Var, Inflater inflater) {
        this.X = j76Var;
        this.Y = inflater;
    }
}
