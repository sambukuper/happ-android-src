package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class la1 {
    public final byte[] a;
    public int b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public la1(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a() throws zq1.g {
        int i = this.b;
        byte[] bArr = this.a;
        if (i >= bArr.length) {
            throw new zq1.g();
        }
        int i2 = bArr[i] & 255;
        this.b = i + 1;
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b() {
        return a() | (a() << 8);
    }
}
