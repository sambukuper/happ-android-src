package defpackage;

import io.sentry.c2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class uo0 {
    public static final byte[] l = new byte[15];
    public final vo0 a;
    public final pq5 b;
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public byte[] g;
    public long h;
    public long i;
    public int j;
    public int k;

    public uo0() {
        pq5 pq5Var = new pq5();
        vo0 vo0Var = new vo0();
        vo0Var.b = 0;
        vo0Var.c = new int[16];
        vo0Var.d = new int[16];
        vo0Var.e = new byte[64];
        vo0Var.f = false;
        vo0Var.a = (byte) 20;
        this.c = new byte[32];
        this.e = new byte[80];
        this.f = new byte[16];
        this.j = 0;
        this.a = vo0Var;
        this.b = pq5Var;
        this.d = new byte[12];
    }

    public final void a() {
        int i = this.j;
        byte[] bArr = l;
        pq5 pq5Var = this.b;
        switch (i) {
            case 1:
            case 2:
                int i2 = ((int) this.h) & 15;
                if (i2 != 0) {
                    pq5Var.d(0, 16 - i2, bArr);
                }
                this.j = 3;
                break;
            case 3:
            case 7:
                break;
            case 4:
                bt.i("ChaCha20Poly1305 cannot be reused for encryption");
                break;
            case 5:
            case 6:
                int i3 = ((int) this.h) & 15;
                if (i3 != 0) {
                    pq5Var.d(0, 16 - i3, bArr);
                }
                this.j = 7;
                break;
            default:
                bt.i("ChaCha20Poly1305 needs to be initialized");
                break;
        }
    }

    public final int b(int i, byte[] bArr) {
        uo0 uo0Var;
        int i2;
        if (i < 0) {
            bt.q("'outOff' cannot be negative");
            return 0;
        }
        a();
        byte[] bArr2 = this.f;
        Arrays.fill(bArr2, (byte) 0);
        int i3 = this.j;
        byte[] bArr3 = this.e;
        pq5 pq5Var = this.b;
        if (i3 == 3) {
            int i4 = this.k;
            int i5 = i4 + 16;
            if (i > bArr.length - i5) {
                throw new re5("Output buffer too short");
            }
            if (i4 > 0) {
                uo0Var = this;
                uo0Var.g(0, i4, i, bArr3, bArr);
                pq5Var.d(i, uo0Var.k, bArr);
            } else {
                uo0Var = this;
            }
            uo0Var.c(4);
            System.arraycopy(bArr2, 0, bArr, uo0Var.k + i, 16);
            i2 = i5;
        } else {
            if (i3 != 7) {
                c2.g();
                return 0;
            }
            int i6 = this.k;
            if (i6 < 16) {
                throw new mh3("data too short");
            }
            i2 = i6 - 16;
            if (i > bArr.length - i2) {
                throw new re5("Output buffer too short");
            }
            if (i2 > 0) {
                pq5Var.d(0, i2, bArr3);
                g(0, i2, i, bArr3, bArr);
            }
            c(8);
            if (!ch3.r(bArr2, 16, i2, bArr3)) {
                throw new mh3("mac check in ChaCha20Poly1305 failed");
            }
            uo0Var = this;
        }
        uo0Var.h(false, true);
        return i2;
    }

    public final void c(int i) {
        int i2 = ((int) this.i) & 15;
        pq5 pq5Var = this.b;
        if (i2 != 0) {
            pq5Var.d(0, 16 - i2, l);
        }
        byte[] bArr = new byte[16];
        ci8.F(this.h, bArr, 0);
        ci8.F(this.i, bArr, 8);
        pq5Var.d(0, 16, bArr);
        byte[] bArr2 = this.f;
        if (16 > bArr2.length) {
            throw new re5("Output buffer is too short.");
        }
        if (pq5Var.o > 0) {
            pq5Var.c();
        }
        int i3 = pq5Var.q;
        int i4 = pq5Var.p;
        int i5 = i3 + (i4 >>> 26);
        int i6 = pq5Var.r + (i5 >>> 26);
        int i7 = pq5Var.s + (i6 >>> 26);
        int i8 = i6 & 67108863;
        int i9 = pq5Var.t + (i7 >>> 26);
        int i10 = i7 & 67108863;
        int i11 = ((i9 >>> 26) * 5) + (i4 & 67108863);
        int i12 = i9 & 67108863;
        int i13 = (i5 & 67108863) + (i11 >>> 26);
        int i14 = i11 & 67108863;
        int i15 = i14 + 5;
        int i16 = (i15 >>> 26) + i13;
        int i17 = (i16 >>> 26) + i8;
        int i18 = (i17 >>> 26) + i10;
        int i19 = 67108863 & i18;
        int i20 = ((i18 >>> 26) + i12) - 67108864;
        int i21 = (i20 >>> 31) - 1;
        int i22 = ~i21;
        int i23 = (i14 & i22) | (i15 & 67108863 & i21);
        pq5Var.p = i23;
        int i24 = (i13 & i22) | (i16 & 67108863 & i21);
        pq5Var.q = i24;
        int i25 = (i8 & i22) | (i17 & 67108863 & i21);
        pq5Var.r = i25;
        int i26 = (i19 & i21) | (i10 & i22);
        pq5Var.s = i26;
        int i27 = (i12 & i22) | (i20 & i21);
        pq5Var.t = i27;
        long j = (((long) ((i24 << 26) | i23)) & 4294967295L) + (((long) pq5Var.j) & 4294967295L);
        long j2 = (((long) ((i24 >>> 6) | (i25 << 20))) & 4294967295L) + (((long) pq5Var.k) & 4294967295L);
        long j3 = (((long) ((i25 >>> 12) | (i26 << 14))) & 4294967295L) + (((long) pq5Var.l) & 4294967295L);
        long j4 = (((long) ((i27 << 8) | (i26 >>> 18))) & 4294967295L) + (((long) pq5Var.m) & 4294967295L);
        ci8.A((int) j, 0, bArr2);
        long j5 = j2 + (j >>> 32);
        ci8.A((int) j5, 4, bArr2);
        long j6 = j3 + (j5 >>> 32);
        ci8.A((int) j6, 8, bArr2);
        ci8.A((int) (j4 + (j6 >>> 32)), 12, bArr2);
        pq5Var.o = 0;
        pq5Var.t = 0;
        pq5Var.s = 0;
        pq5Var.r = 0;
        pq5Var.q = 0;
        pq5Var.p = 0;
        this.j = i;
    }

    public final int d(int i) {
        int iMax = Math.max(0, i) + this.k;
        int i2 = this.j;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return iMax + 16;
        }
        if (i2 == 5 || i2 == 6 || i2 == 7) {
            return Math.max(0, iMax - 16);
        }
        c2.g();
        return 0;
    }

    public final void e(boolean z, lr lrVar) {
        q02 q02Var = (q02) lrVar.f0;
        byte[] bArrO = ch3.o((byte[]) lrVar.Z);
        int length = bArrO.length;
        new we5((byte) 1);
        byte[] bArr = new byte[length];
        System.arraycopy(bArrO, 0, bArr, 0, length);
        this.g = ch3.o((byte[]) lrVar.Y);
        byte[] bArr2 = (byte[]) q02Var.Y;
        if (32 != bArr2.length) {
            bt.q("Key must be 256 bits");
            return;
        }
        if (12 != bArrO.length) {
            bt.q("Nonce must be 96 bits");
            return;
        }
        int i = this.j;
        byte[] bArr3 = this.c;
        byte[] bArr4 = this.d;
        if (i != 0 && z && Arrays.equals(bArr4, bArrO) && Arrays.equals(bArr3, bArr2)) {
            bt.q("cannot reuse nonce for ChaCha20Poly1305 encryption");
            return;
        }
        if (bArr2.length != 32) {
            bt.q("len");
            return;
        }
        System.arraycopy(bArr2, 0, bArr3, 0, 32);
        System.arraycopy(bArrO, 0, bArr4, 0, 12);
        if (bArr.length != 12) {
            bt.q("ChaCha7539 requires exactly 12 bytes of IV");
            return;
        }
        vo0 vo0Var = this.a;
        int[] iArr = vo0Var.c;
        if (bArr2 == null) {
            ci8.E(13, 3, bArr, iArr);
        } else if (bArr2.length == 32) {
            int length2 = (bArr2.length - 16) / 4;
            int[] iArr2 = vo0.j;
            iArr[0] = iArr2[length2];
            iArr[1] = iArr2[length2 + 1];
            iArr[2] = iArr2[length2 + 2];
            iArr[3] = iArr2[length2 + 3];
            ci8.E(4, 8, bArr2, iArr);
            ci8.E(13, 3, bArr, iArr);
        } else {
            bt.q("ChaCha7539 requires 256 bit key");
        }
        ((z71) a81.a.get()).getClass();
        vo0Var.b = 0;
        vo0Var.g = 0;
        vo0Var.h = 0;
        vo0Var.i = 0;
        vo0Var.c[12] = 0;
        vo0Var.a(vo0Var.e);
        vo0Var.f = true;
        this.j = z ? 1 : 5;
        h(true, false);
    }

    public final int f(byte[] bArr, int i, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4;
        int i2;
        int i3;
        int i4;
        byte[] bArr5;
        int i5;
        byte[] bArr6 = bArr2;
        if (i < 0) {
            bt.q("'len' cannot be negative");
            return 0;
        }
        if (bArr.length - i < 0) {
            throw new aa1("Input buffer too short");
        }
        if (bArr == bArr6) {
            int iMax = Math.max(0, i) + this.k;
            int i6 = this.j;
            if (i6 != 1 && i6 != 2 && i6 != 3) {
                if (i6 != 5 && i6 != 6 && i6 != 7) {
                    c2.g();
                    return 0;
                }
                iMax = Math.max(0, iMax - 16);
            }
            int i7 = iMax - (iMax % 64);
            if (i > 0 && i7 > 0 && i7 > 0 && i > 0) {
                bArr = new byte[i];
                System.arraycopy(bArr6, 0, bArr, 0, i);
            }
        }
        a();
        int i8 = this.j;
        pq5 pq5Var = this.b;
        byte[] bArr7 = this.e;
        if (i8 != 3) {
            if (i8 != 7) {
                c2.g();
                return 0;
            }
            int i9 = 0;
            int i10 = 0;
            while (i10 < i) {
                int i11 = this.k;
                bArr7[i11] = bArr[i10];
                int i12 = i11 + 1;
                this.k = i12;
                if (i12 == bArr7.length) {
                    pq5Var.d(0, 64, bArr7);
                    byte[] bArr8 = bArr6;
                    bArr5 = bArr7;
                    int i13 = i9;
                    g(0, 64, i13, bArr5, bArr8);
                    System.arraycopy(bArr5, 64, bArr5, 0, 16);
                    this.k = 16;
                    i5 = i13 + 64;
                } else {
                    bArr5 = bArr7;
                    i5 = i9;
                }
                i10++;
                i9 = i5;
                bArr7 = bArr5;
                bArr6 = bArr2;
            }
            return i9;
        }
        byte[] bArr9 = bArr7;
        if (this.k != 0) {
            int i14 = i;
            i3 = 0;
            while (true) {
                if (i14 <= 0) {
                    bArr3 = bArr9;
                    bArr4 = bArr2;
                    i2 = i14;
                    i4 = 0;
                    break;
                }
                i2 = i14 - 1;
                int i15 = this.k;
                int i16 = i3 + 1;
                bArr9[i15] = bArr[i3];
                int i17 = i15 + 1;
                this.k = i17;
                if (i17 == 64) {
                    byte[] bArr10 = bArr9;
                    bArr4 = bArr2;
                    g(0, 64, 0, bArr10, bArr4);
                    bArr3 = bArr10;
                    pq5Var.d(0, 64, bArr4);
                    this.k = 0;
                    i4 = 64;
                    i3 = i16;
                    break;
                }
                i14 = i2;
                i3 = i16;
                bArr9 = bArr9;
            }
        } else {
            bArr3 = bArr9;
            bArr4 = bArr2;
            i2 = i;
            i3 = 0;
            i4 = 0;
        }
        while (i2 >= 64) {
            int i18 = i3;
            g(i18, 64, i4, bArr, bArr4);
            pq5Var.d(i4, 64, bArr4);
            i3 = i18 + 64;
            i2 -= 64;
            i4 += 64;
        }
        byte[] bArr11 = bArr;
        if (i2 > 0) {
            System.arraycopy(bArr11, i3, bArr3, 0, i2);
            this.k = i2;
        }
        return i4;
    }

    public final void g(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        if (i3 > bArr2.length - i2) {
            throw new re5("Output buffer too short");
        }
        this.a.b(i, i2, i3, bArr, bArr2);
        long j = this.i;
        long j2 = i2;
        if (Long.compare(j ^ Long.MIN_VALUE, (274877906880L - j2) ^ Long.MIN_VALUE) <= 0) {
            this.i = j + j2;
        } else {
            bt.i("Limit exceeded");
        }
    }

    public final void h(boolean z, boolean z2) {
        pq5 pq5Var = this.b;
        Arrays.fill(this.e, (byte) 0);
        if (z) {
            Arrays.fill(this.f, (byte) 0);
        }
        this.h = 0L;
        this.i = 0L;
        this.k = 0;
        switch (this.j) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.j = 4;
                return;
            case 6:
            case 7:
            case 8:
                this.j = 5;
                break;
            default:
                bt.i("ChaCha20Poly1305 needs to be initialized");
                return;
        }
        vo0 vo0Var = this.a;
        if (z2) {
            vo0Var.b = 0;
            vo0Var.g = 0;
            vo0Var.h = 0;
            vo0Var.i = 0;
            vo0Var.c[12] = 0;
            vo0Var.a(vo0Var.e);
        }
        byte[] bArr = new byte[64];
        try {
            vo0Var.b(0, 64, 0, bArr, bArr);
            pq5Var.a(new q02(bArr, 32));
            Arrays.fill(bArr, (byte) 0);
            byte[] bArr2 = this.g;
            if (bArr2 != null) {
                int length = bArr2.length;
                if (length < 0) {
                    bt.q("'len' cannot be negative");
                    return;
                }
                if (bArr2.length - length < 0) {
                    throw new aa1("Input buffer too short");
                }
                int i = this.j;
                if (i == 1) {
                    this.j = 2;
                } else if (i != 2) {
                    if (i == 4) {
                        bt.i("ChaCha20Poly1305 cannot be reused for encryption");
                        return;
                    } else if (i == 5) {
                        this.j = 6;
                    } else if (i != 6) {
                        bt.i("ChaCha20Poly1305 needs to be initialized");
                        return;
                    }
                }
                if (length > 0) {
                    long j = this.h;
                    long j2 = length;
                    if (Long.compare(j ^ Long.MIN_VALUE, ((-1) - j2) ^ Long.MIN_VALUE) > 0) {
                        bt.i("Limit exceeded");
                    } else {
                        this.h = j + j2;
                        pq5Var.d(0, length, bArr2);
                    }
                }
            }
        } catch (Throwable th) {
            Arrays.fill(bArr, (byte) 0);
            throw th;
        }
    }
}
