package defpackage;

import android.R;

/* JADX INFO: loaded from: classes.dex */
public final class f60 {
    public static final int[] m = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
    public static final byte[][] n = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}};
    public int b = 0;
    public byte[] c = null;
    public byte[] d = null;
    public byte[] e = null;
    public final byte[] f = new byte[64];
    public int g = 0;
    public final int[] h = new int[16];
    public final int[] i = new int[8];
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public final int a = 32;

    public f60() {
        new s18("BLAKE2s");
        a81.a();
        e(null, null, null);
    }

    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this.h;
        int i7 = iArr[i3] + iArr[i4] + i;
        iArr[i3] = i7;
        int iRotateRight = Integer.rotateRight(iArr[i6] ^ i7, 16);
        iArr[i6] = iRotateRight;
        int i8 = iArr[i5] + iRotateRight;
        iArr[i5] = i8;
        int iRotateRight2 = Integer.rotateRight(iArr[i4] ^ i8, 12);
        iArr[i4] = iRotateRight2;
        int i9 = iArr[i3] + iRotateRight2 + i2;
        iArr[i3] = i9;
        int iRotateRight3 = Integer.rotateRight(iArr[i6] ^ i9, 8);
        iArr[i6] = iRotateRight3;
        int i10 = iArr[i5] + iRotateRight3;
        iArr[i5] = i10;
        iArr[i4] = Integer.rotateRight(iArr[i4] ^ i10, 7);
    }

    public final void b(int i, byte[] bArr) {
        f60 f60Var = this;
        int[] iArr = f60Var.i;
        int length = iArr.length;
        int[] iArr2 = f60Var.h;
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int length2 = iArr.length;
        int[] iArr3 = m;
        System.arraycopy(iArr3, 0, iArr2, length2, 4);
        iArr2[12] = f60Var.j ^ iArr3[4];
        iArr2[13] = f60Var.k ^ iArr3[5];
        iArr2[14] = f60Var.l ^ iArr3[6];
        iArr2[15] = iArr3[7];
        int[] iArr4 = new int[16];
        int i2 = i;
        for (int i3 = 0; i3 < 16; i3++) {
            iArr4[i3] = ci8.D(i2, bArr);
            i2 += 4;
        }
        int i4 = 0;
        while (i4 < 10) {
            byte[][] bArr2 = n;
            byte[] bArr3 = bArr2[i4];
            int i5 = i4;
            int[] iArr5 = iArr4;
            f60Var.a(iArr4[bArr3[0]], iArr4[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i5];
            a(iArr5[bArr4[2]], iArr5[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i5];
            a(iArr5[bArr5[4]], iArr5[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i5];
            a(iArr5[bArr6[6]], iArr5[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i5];
            a(iArr5[bArr7[8]], iArr5[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i5];
            a(iArr5[bArr8[10]], iArr5[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i5];
            a(iArr5[bArr9[12]], iArr5[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i5];
            int i6 = iArr5[bArr10[14]];
            int i7 = iArr5[bArr10[15]];
            f60Var = this;
            f60Var.a(i6, i7, 3, 4, 9, 14);
            i4 = i5 + 1;
            iArr4 = iArr5;
        }
        for (int i8 = 0; i8 < iArr.length; i8++) {
            iArr[i8] = (iArr[i8] ^ iArr2[i8]) ^ iArr2[i8 + 8];
        }
    }

    public final int c() {
        return this.a;
    }

    public final void d(int i) {
        int i2 = this.j + i;
        this.j = i2;
        if (w45.w(i2, i) < 0) {
            this.k++;
        }
    }

    public final void e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 != null && bArr3.length > 0) {
            int length = bArr3.length;
            this.b = length;
            if (length > 32) {
                bt.q("Keys > 32 bytes are not supported");
                return;
            }
            byte[] bArr4 = new byte[length];
            this.e = bArr4;
            System.arraycopy(bArr3, 0, bArr4, 0, length);
            System.arraycopy(bArr3, 0, this.f, 0, this.b);
            this.g = 64;
        }
        int[] iArr = m;
        int i = iArr[0] ^ (((this.b << 8) | this.a) | R.attr.theme);
        int[] iArr2 = this.i;
        iArr2[0] = i;
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        if (bArr != null) {
            if (bArr.length != 8) {
                bt.q("Salt length must be exactly 8 bytes");
                return;
            }
            byte[] bArr5 = new byte[8];
            this.c = bArr5;
            System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
            iArr2[4] = iArr2[4] ^ ci8.D(0, bArr);
            iArr2[5] = ci8.D(4, bArr) ^ iArr2[5];
        }
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
        if (bArr2 != null) {
            if (bArr2.length != 8) {
                bt.q("Personalization length must be exactly 8 bytes");
                return;
            }
            byte[] bArr6 = new byte[8];
            this.d = bArr6;
            System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
            iArr2[6] = iArr2[6] ^ ci8.D(0, bArr2);
            iArr2[7] = iArr2[7] ^ ci8.D(4, bArr2);
        }
    }
}
