package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class p13 extends n13 {
    public long f0;
    public final /* synthetic */ r13 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p13(r13 r13Var, long j) {
        super(r13Var);
        this.g0 = r13Var;
        this.f0 = j;
        if (j == 0) {
            g();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zR;
        if (this.Y) {
            return;
        }
        if (this.f0 != 0) {
            byte[] bArr = ks8.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zR = ks8.r(this, 100);
            } catch (IOException unused) {
                zR = false;
            }
            if (!zR) {
                this.g0.b.k();
                g();
            }
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
        long j2 = this.f0;
        if (j2 == 0) {
            return -1L;
        }
        long j3 = super.read(i90Var, Math.min(j2, j));
        if (j3 == -1) {
            this.g0.b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            g();
            throw protocolException;
        }
        long j4 = this.f0 - j3;
        this.f0 = j4;
        if (j4 == 0) {
            g();
        }
        return j3;
    }
}
