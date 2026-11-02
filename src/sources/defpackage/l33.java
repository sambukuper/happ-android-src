package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l33 extends r33 {
    @Override // defpackage.al8
    public final byte[] e() {
        int i;
        int i2;
        z33 z33Var = (z33) this.b.h0;
        int i3 = this.e;
        z33Var.getClass();
        byte[] bArr = z33.r;
        int i4 = 268435455 & i3;
        if ((i3 >>> 28) != 1) {
            return null;
        }
        if (i4 == 0 || (i2 = z33Var.a.getInt((i = i4 << 2))) == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        int i5 = i + 4;
        if (i2 > 16) {
            ByteBuffer byteBufferDuplicate = z33Var.a.duplicate();
            byteBufferDuplicate.position(i5);
            byteBufferDuplicate.get(bArr2);
            return bArr2;
        }
        int i6 = 0;
        while (i6 < i2) {
            bArr2[i6] = z33Var.a.get(i5);
            i6++;
            i5++;
        }
        return bArr2;
    }

    @Override // defpackage.al8
    public final int p() {
        return 1;
    }
}
