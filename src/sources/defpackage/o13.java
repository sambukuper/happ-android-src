package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o13 extends n13 {
    public final u23 f0;
    public long g0;
    public boolean h0;
    public final /* synthetic */ r13 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o13(r13 r13Var, u23 u23Var) {
        super(r13Var);
        u23Var.getClass();
        this.i0 = r13Var;
        this.f0 = u23Var;
        this.g0 = -1L;
        this.h0 = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zR;
        if (this.Y) {
            return;
        }
        if (this.h0) {
            byte[] bArr = ks8.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zR = ks8.r(this, 100);
            } catch (IOException unused) {
                zR = false;
            }
            if (!zR) {
                this.i0.b.k();
                g();
            }
        }
        this.Y = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r11.h0 == false) goto L27;
     */
    @Override // defpackage.n13, defpackage.je7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(defpackage.i90 r12, long r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o13.read(i90, long):long");
    }
}
