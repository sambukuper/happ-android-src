package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vo0 {
    public static final int[] j;
    public byte a;
    public int b;
    public int[] c;
    public int[] d;
    public byte[] e;
    public boolean f;
    public int g;
    public int h;
    public int i;

    static {
        byte[] bArrA = cm7.a("expand 16-byte kexpand 32-byte k");
        int[] iArr = new int[8];
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = ci8.D(i, bArrA);
            i += 4;
        }
        j = iArr;
        cm7.a("expand 32-byte k");
        cm7.a("expand 16-byte k");
    }

    public final void a(byte[] bArr) {
        int i = this.a;
        int[] iArr = this.c;
        int[] iArr2 = this.d;
        int i2 = 16;
        if (iArr.length != 16) {
            kp5.e();
            return;
        }
        if (iArr2.length != 16) {
            kp5.e();
            return;
        }
        if (i % 2 != 0) {
            bt.q("Number of rounds must be even");
            return;
        }
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        char c = 3;
        int i6 = iArr[3];
        char c2 = 4;
        int iRotateLeft = iArr[4];
        char c3 = 5;
        int iRotateLeft2 = iArr[5];
        int iRotateLeft3 = iArr[6];
        int i7 = 7;
        int iRotateLeft4 = iArr[7];
        int i8 = 8;
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = 12;
        int iRotateLeft5 = iArr[12];
        int iRotateLeft6 = iArr[13];
        int iRotateLeft7 = iArr[14];
        int iRotateLeft8 = iArr[15];
        while (i > 0) {
            int i14 = i3 + iRotateLeft;
            char c4 = c;
            int iRotateLeft9 = Integer.rotateLeft(iRotateLeft5 ^ i14, i2);
            int i15 = i9 + iRotateLeft9;
            int iRotateLeft10 = Integer.rotateLeft(iRotateLeft ^ i15, i13);
            int i16 = i14 + iRotateLeft10;
            int iRotateLeft11 = Integer.rotateLeft(iRotateLeft9 ^ i16, i8);
            int i17 = i15 + iRotateLeft11;
            int iRotateLeft12 = Integer.rotateLeft(iRotateLeft10 ^ i17, i7);
            int i18 = i4 + iRotateLeft2;
            char c5 = c2;
            int iRotateLeft13 = Integer.rotateLeft(iRotateLeft6 ^ i18, i2);
            int i19 = i10 + iRotateLeft13;
            int iRotateLeft14 = Integer.rotateLeft(iRotateLeft2 ^ i19, i13);
            int i20 = i18 + iRotateLeft14;
            int iRotateLeft15 = Integer.rotateLeft(iRotateLeft13 ^ i20, i8);
            int i21 = i19 + iRotateLeft15;
            int iRotateLeft16 = Integer.rotateLeft(iRotateLeft14 ^ i21, i7);
            int i22 = i5 + iRotateLeft3;
            char c6 = c3;
            int iRotateLeft17 = Integer.rotateLeft(iRotateLeft7 ^ i22, i2);
            int i23 = i11 + iRotateLeft17;
            int iRotateLeft18 = Integer.rotateLeft(iRotateLeft3 ^ i23, i13);
            int i24 = i22 + iRotateLeft18;
            int iRotateLeft19 = Integer.rotateLeft(iRotateLeft17 ^ i24, i8);
            int i25 = i23 + iRotateLeft19;
            int iRotateLeft20 = Integer.rotateLeft(iRotateLeft18 ^ i25, i7);
            int i26 = i6 + iRotateLeft4;
            int iRotateLeft21 = Integer.rotateLeft(iRotateLeft8 ^ i26, 16);
            int i27 = i12 + iRotateLeft21;
            int iRotateLeft22 = Integer.rotateLeft(iRotateLeft4 ^ i27, i13);
            int i28 = i26 + iRotateLeft22;
            int iRotateLeft23 = Integer.rotateLeft(iRotateLeft21 ^ i28, 8);
            int i29 = i27 + iRotateLeft23;
            int iRotateLeft24 = Integer.rotateLeft(iRotateLeft22 ^ i29, 7);
            int i30 = i16 + iRotateLeft16;
            int iRotateLeft25 = Integer.rotateLeft(iRotateLeft23 ^ i30, 16);
            int i31 = i25 + iRotateLeft25;
            int iRotateLeft26 = Integer.rotateLeft(iRotateLeft16 ^ i31, 12);
            i3 = i30 + iRotateLeft26;
            iRotateLeft8 = Integer.rotateLeft(iRotateLeft25 ^ i3, 8);
            i11 = i31 + iRotateLeft8;
            iRotateLeft2 = Integer.rotateLeft(iRotateLeft26 ^ i11, 7);
            int i32 = i20 + iRotateLeft20;
            int iRotateLeft27 = Integer.rotateLeft(iRotateLeft11 ^ i32, 16);
            int i33 = i29 + iRotateLeft27;
            int iRotateLeft28 = Integer.rotateLeft(iRotateLeft20 ^ i33, 12);
            i4 = i32 + iRotateLeft28;
            iRotateLeft5 = Integer.rotateLeft(iRotateLeft27 ^ i4, 8);
            i12 = i33 + iRotateLeft5;
            iRotateLeft3 = Integer.rotateLeft(iRotateLeft28 ^ i12, 7);
            int i34 = i24 + iRotateLeft24;
            int iRotateLeft29 = Integer.rotateLeft(iRotateLeft15 ^ i34, 16);
            int i35 = i17 + iRotateLeft29;
            int iRotateLeft30 = Integer.rotateLeft(iRotateLeft24 ^ i35, 12);
            i5 = i34 + iRotateLeft30;
            iRotateLeft6 = Integer.rotateLeft(iRotateLeft29 ^ i5, 8);
            i9 = i35 + iRotateLeft6;
            iRotateLeft4 = Integer.rotateLeft(iRotateLeft30 ^ i9, 7);
            int i36 = i28 + iRotateLeft12;
            int iRotateLeft31 = Integer.rotateLeft(iRotateLeft19 ^ i36, 16);
            int i37 = i21 + iRotateLeft31;
            int iRotateLeft32 = Integer.rotateLeft(iRotateLeft12 ^ i37, 12);
            i6 = i36 + iRotateLeft32;
            iRotateLeft7 = Integer.rotateLeft(iRotateLeft31 ^ i6, 8);
            i10 = i37 + iRotateLeft7;
            iRotateLeft = Integer.rotateLeft(iRotateLeft32 ^ i10, 7);
            i -= 2;
            i2 = 16;
            c = c4;
            c2 = c5;
            c3 = c6;
            i7 = 7;
            i8 = 8;
            i13 = 12;
        }
        char c7 = c;
        char c8 = c2;
        char c9 = c3;
        iArr2[0] = i3 + iArr[0];
        iArr2[1] = i4 + iArr[1];
        iArr2[2] = i5 + iArr[2];
        iArr2[c7] = i6 + iArr[c7];
        iArr2[c8] = iRotateLeft + iArr[c8];
        iArr2[c9] = iRotateLeft2 + iArr[c9];
        iArr2[6] = iRotateLeft3 + iArr[6];
        iArr2[7] = iRotateLeft4 + iArr[7];
        iArr2[8] = i9 + iArr[8];
        iArr2[9] = i10 + iArr[9];
        iArr2[10] = i11 + iArr[10];
        iArr2[11] = i12 + iArr[11];
        iArr2[12] = iRotateLeft5 + iArr[12];
        iArr2[13] = iRotateLeft6 + iArr[13];
        iArr2[14] = iRotateLeft7 + iArr[14];
        iArr2[15] = iRotateLeft8 + iArr[15];
        int i38 = 0;
        for (int i39 : iArr2) {
            ci8.A(i39, i38, bArr);
            i38 += 4;
        }
    }

    public final int b(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        if (!this.f) {
            bt.i("ChaCha7539 not initialised");
            return 0;
        }
        if (i + i2 > bArr.length) {
            throw new aa1("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new re5("output buffer too short");
        }
        int i4 = this.g + i2;
        this.g = i4;
        if (i4 < i2 && i4 >= 0) {
            int i5 = this.h + 1;
            this.h = i5;
            if (i5 == 0) {
                int i6 = this.i + 1;
                this.i = i6;
                if ((i6 & 32) != 0) {
                    throw new qr4("2^70 byte limit per IV would be exceeded; Change IV");
                }
            }
        }
        for (int i7 = 0; i7 < i2; i7++) {
            byte[] bArr3 = this.e;
            int i8 = this.b;
            bArr2[i7 + i3] = (byte) (bArr3[i8] ^ bArr[i7 + i]);
            int i9 = (i8 + 1) & 63;
            this.b = i9;
            if (i9 == 0) {
                int[] iArr = this.c;
                int i10 = iArr[12] + 1;
                iArr[12] = i10;
                if (i10 == 0) {
                    bt.i("attempt to increase counter past 2^32.");
                    return 0;
                }
                a(bArr3);
            }
        }
        return i2;
    }
}
