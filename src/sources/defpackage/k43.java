package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k43 implements AutoCloseable {
    public final Object X;
    public final m90 Y;
    public final md0 f0;
    public byte[] g0;
    public char[] h0;
    public boolean Z = true;
    public boolean i0 = false;

    public k43(md0 md0Var, m90 m90Var, x41 x41Var) {
        this.f0 = md0Var;
        this.Y = m90Var;
        this.X = x41Var.X;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.i0) {
            return;
        }
        this.i0 = true;
        if (this.Z) {
            this.Z = false;
            this.Y.getClass();
        }
    }

    public final void g(byte[] bArr) {
        byte[] bArr2 = this.g0;
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            bt.q("Trying to release buffer smaller than original");
            return;
        }
        this.g0 = null;
        AtomicReferenceArray atomicReferenceArray = this.Y.a;
        byte[] bArr3 = (byte[]) atomicReferenceArray.get(3);
        if (bArr3 == null || bArr.length > bArr3.length) {
            atomicReferenceArray.set(3, bArr);
        }
    }
}
