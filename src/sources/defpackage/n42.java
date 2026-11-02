package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n42 extends ck2 {
    public final long X;
    public long Y;
    public boolean Z;
    public boolean f0;
    public boolean g0;
    public final /* synthetic */ wg h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n42(wg wgVar, je7 je7Var, long j) {
        super(je7Var);
        je7Var.getClass();
        this.h0 = wgVar;
        this.X = j;
        this.Z = true;
        if (j == 0) {
            complete(null);
        }
    }

    @Override // defpackage.ck2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.g0) {
            return;
        }
        this.g0 = true;
        try {
            super.close();
            complete(null);
        } catch (IOException e) {
            throw complete(e);
        }
    }

    public final IOException complete(IOException iOException) {
        if (this.f0) {
            return iOException;
        }
        this.f0 = true;
        if (iOException == null && this.Z) {
            this.Z = false;
        }
        wg wgVar = this.h0;
        m76 m76Var = (m76) wgVar.b;
        if (iOException != null) {
            wgVar.A(iOException);
        }
        return m76Var.e(wgVar, false, true, iOException);
    }

    @Override // defpackage.ck2, defpackage.je7
    public final long read(i90 i90Var, long j) throws IOException {
        i90Var.getClass();
        if (this.g0) {
            bt.i("closed");
            return 0L;
        }
        try {
            long j2 = delegate().read(i90Var, j);
            if (this.Z) {
                this.Z = false;
            }
            if (j2 == -1) {
                complete(null);
                return -1L;
            }
            long j3 = this.Y + j2;
            long j4 = this.X;
            if (j4 == -1 || j3 <= j4) {
                this.Y = j3;
                if (j3 == j4) {
                    complete(null);
                }
                return j2;
            }
            throw new ProtocolException("expected " + j4 + " bytes but received " + j3);
        } catch (IOException e) {
            throw complete(e);
        }
    }
}
