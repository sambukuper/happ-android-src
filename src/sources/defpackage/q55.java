package defpackage;

import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class q55 {
    public static final byte[] a;
    public static final SecureRandom b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        byte[] bytes = "dnstt 2020-04-13".getBytes(iq0.a);
        bytes.getClass();
        a = bytes;
        b = new SecureRandom();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final v59 a(byte[] bArr) throws p55.d {
        if (bArr.length == 32) {
            return new v59(bArr);
        }
        throw new p55.d(ie2.h("invalid key length ", bArr.length, ", expected 32"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte[] b(v59 v59Var, v59 v59Var2) {
        ((z71) a81.a.get()).getClass();
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[32];
        System.arraycopy(v59Var2.m0, 0, bArr2, 0, 32);
        byte[] bArr3 = v59Var.m0;
        ch3.U(0, 32, bArr3);
        ch3.U(0, 32, bArr2);
        ch3.U(0, 32, bArr);
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = zc1.z(i * 4, bArr3);
        }
        iArr[0] = iArr[0] & (-8);
        int i2 = iArr[7] & Integer.MAX_VALUE;
        iArr[7] = i2;
        iArr[7] = i2 | 1073741824;
        int[] iArr2 = new int[10];
        zc1.x(0, 0, bArr2, iArr2);
        zc1.x(16, 5, bArr2, iArr2);
        iArr2[9] = iArr2[9] & 16777215;
        int[] iArr3 = new int[10];
        zc1.u(0, 0, iArr2, iArr3);
        int[] iArr4 = new int[10];
        iArr4[0] = 1;
        int[] iArr5 = new int[10];
        iArr5[0] = 1;
        int[] iArr6 = new int[10];
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        int i3 = 254;
        int i4 = 1;
        while (true) {
            zc1.m(iArr5, iArr6, iArr7, iArr5);
            zc1.m(iArr3, iArr4, iArr6, iArr3);
            zc1.a0(iArr7, iArr3, iArr7);
            zc1.a0(iArr5, iArr6, iArr5);
            zc1.k0(iArr6, iArr6);
            zc1.k0(iArr3, iArr3);
            zc1.l0(iArr6, iArr3, iArr8);
            zc1.Z(iArr8, iArr4);
            zc1.k(iArr4, iArr3, iArr4);
            zc1.a0(iArr4, iArr8, iArr4);
            zc1.a0(iArr3, iArr6, iArr3);
            zc1.m(iArr7, iArr5, iArr5, iArr6);
            zc1.k0(iArr5, iArr5);
            zc1.k0(iArr6, iArr6);
            zc1.a0(iArr6, iArr2, iArr6);
            int i5 = i3 - 1;
            int i6 = (iArr[i5 >>> 5] >>> (i5 & 31)) & 1;
            int i7 = i4 ^ i6;
            zc1.w(i7, iArr3, iArr5);
            zc1.w(i7, iArr4, iArr6);
            if (i5 < 3) {
                break;
            }
            i4 = i6;
            i3 = i5;
        }
        for (int i8 = 0; i8 < 3; i8++) {
            int[] iArr9 = new int[10];
            int[] iArr10 = new int[10];
            zc1.m(iArr3, iArr4, iArr9, iArr10);
            zc1.k0(iArr9, iArr9);
            zc1.k0(iArr10, iArr10);
            zc1.a0(iArr9, iArr10, iArr3);
            zc1.l0(iArr9, iArr10, iArr9);
            zc1.Z(iArr9, iArr4);
            zc1.k(iArr4, iArr10, iArr4);
            zc1.a0(iArr4, iArr9, iArr4);
        }
        zc1.R(iArr4, iArr4);
        zc1.a0(iArr3, iArr4, iArr3);
        zc1.d0(iArr3);
        zc1.B(0, 0, bArr, iArr3);
        zc1.B(5, 16, bArr, iArr3);
        int i9 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            i9 |= bArr[i10];
        }
        if (i9 != 0) {
            return bArr;
        }
        bt.i("X25519 agreement failed");
        return null;
    }
}
