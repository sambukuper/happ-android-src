package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gi3 extends ld2 {
    public final i66 d;

    public gi3(i66 i66Var) {
        super(i66Var.b, i66Var.c, (byte) 2);
        this.d = i66Var;
    }

    @Override // defpackage.ld2
    public final byte[] j() {
        byte[] bArrJ = this.d.j();
        int i = this.b * this.c;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (255 - (bArrJ[i2] & 255));
        }
        return bArr;
    }

    @Override // defpackage.ld2
    public final byte[] k(int i, byte[] bArr) {
        byte[] bArrK = this.d.k(i, bArr);
        int i2 = this.b;
        for (int i3 = 0; i3 < i2; i3++) {
            bArrK[i3] = (byte) (255 - (bArrK[i3] & 255));
        }
        return bArrK;
    }
}
