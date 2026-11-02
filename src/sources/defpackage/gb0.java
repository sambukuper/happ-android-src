package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gb0 extends hb0 {
    public final int g0;
    public final int h0;

    public gb0(byte[] bArr, int i, int i2) {
        super(bArr);
        hb0.b(i, i + i2, bArr.length);
        this.g0 = i;
        this.h0 = i2;
    }

    @Override // defpackage.hb0
    public final byte a(int i) {
        int i2 = this.h0;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.Y[this.g0 + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(pc6.j(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(pc6.m("Index > length: ", i, i2, ", "));
    }

    @Override // defpackage.hb0
    public final void d(int i, byte[] bArr) {
        System.arraycopy(this.Y, this.g0, bArr, 0, i);
    }

    @Override // defpackage.hb0
    public final int e() {
        return this.g0;
    }

    @Override // defpackage.hb0
    public final byte f(int i) {
        return this.Y[this.g0 + i];
    }

    @Override // defpackage.hb0
    public final int size() {
        return this.h0;
    }
}
