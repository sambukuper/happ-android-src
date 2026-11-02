package defpackage;

import java.util.ArrayList;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nb0 implements Cloneable, Iterable {
    public static final int[] f0 = {4, 3};
    public byte[] X;
    public int Y;
    public int Z;

    public static int c(int i, byte[] bArr) {
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        if (i3 >= 192) {
            if (i3 < 240) {
                i3 = ((i3 - 192) << 8) | (bArr[i2] & 255);
                i2 = i + 2;
            } else if (i3 < 254) {
                i3 = ((bArr[i2] & 255) << 8) | ((i3 - 240) << 16) | (bArr[i + 2] & 255);
                i2 = i + 3;
            } else if (i3 == 254) {
                i3 = ((bArr[i2] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
                i2 = i + 4;
            } else {
                i3 = (bArr[i2] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 8) | (bArr[i + 4] & 255);
                i2 = i + 5;
            }
        }
        return i2 + i3;
    }

    public static int e(int i, int i2, byte[] bArr) {
        int i3;
        byte b;
        if (i2 < 81) {
            return i2 - 16;
        }
        if (i2 < 108) {
            i3 = (i2 - 81) << 8;
            b = bArr[i];
        } else if (i2 < 126) {
            i3 = ((i2 - 108) << 16) | ((bArr[i] & 255) << 8);
            b = bArr[i + 1];
        } else if (i2 == 126) {
            i3 = ((bArr[i] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
            b = bArr[i + 2];
        } else {
            i3 = (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
            b = bArr[i + 3];
        }
        return (b & 255) | i3;
    }

    public static int h(int i, byte[] bArr) {
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = b & 255;
        if (i3 < 192) {
            return i2;
        }
        if (i3 < 240) {
            return i + 2;
        }
        return i3 < 254 ? i + 3 : (b & 1) + 3 + i2;
    }

    public static int i(int i, int i2) {
        if (i2 < 162) {
            return i;
        }
        if (i2 < 216) {
            return i + 1;
        }
        return i2 < 252 ? i + 2 : ((i2 >> 1) & 1) + 3 + i;
    }

    public final long a() {
        return (((long) this.Z) << 32) | ((long) this.Y);
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mb0 iterator() {
        byte[] bArr = this.X;
        int i = this.Y;
        int i2 = this.Z;
        mb0 mb0Var = new mb0();
        mb0Var.g0 = new ArrayList();
        mb0Var.X = bArr;
        mb0Var.Y = i;
        mb0Var.Z = i2;
        x50 x50Var = new x50();
        x50Var.b = new byte[32];
        mb0Var.f0 = x50Var;
        if (i2 >= 0) {
            int i3 = i2 + 1;
            x50Var.a(i, i3, bArr);
            mb0Var.Y += i3;
            mb0Var.Z = i2 - i3;
        }
        return mb0Var;
    }

    public final Object clone() {
        return (nb0) super.clone();
    }

    public final int d(int i) {
        int i2;
        byte[] bArr = this.X;
        int i3 = this.Y;
        if (i3 < 0) {
            return 1;
        }
        if (i < 0) {
            i += PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        int i4 = this.Z;
        int[] iArr = f0;
        if (i4 < 0) {
            while (true) {
                int i5 = i3 + 1;
                byte b = bArr[i3];
                int i6 = b & 255;
                if (i6 >= 16) {
                    if (i6 < 32) {
                        int i7 = i3 + 2;
                        if (i == (bArr[i5] & 255)) {
                            int i8 = i6 - 17;
                            this.Z = i8;
                            this.Y = i7;
                            if (i8 >= 0) {
                                break;
                            }
                            byte b2 = bArr[i7];
                            if ((b2 & 255) < 32) {
                                break;
                            }
                            return iArr[b2 & 1];
                        }
                    } else if ((b & 1) == 0) {
                        i3 = i(i5, i6);
                    }
                    this.Y = -1;
                    return 1;
                }
                if (i6 == 0) {
                    i6 = bArr[i5] & 255;
                    i5 = i3 + 2;
                }
                int i9 = i6 + 1;
                while (i9 > 5) {
                    int i10 = i5 + 1;
                    if (i < (bArr[i5] & 255)) {
                        i9 >>= 1;
                        i5 = c(i10, bArr);
                    } else {
                        i9 -= i9 >> 1;
                        i5 = h(i10, bArr);
                    }
                }
                do {
                    int i11 = i5 + 1;
                    if (i == (bArr[i5] & 255)) {
                        byte b3 = bArr[i11];
                        int i12 = b3 & 255;
                        int i13 = 3;
                        if ((b3 & 1) == 0) {
                            int i14 = i5 + 2;
                            int i15 = i12 >> 1;
                            if (i15 < 81) {
                                i2 = i15 - 16;
                            } else if (i15 < 108) {
                                i2 = ((i15 - 81) << 8) | (bArr[i14] & 255);
                                i14 = i5 + 3;
                            } else if (i15 < 126) {
                                i2 = (bArr[i5 + 3] & 255) | ((bArr[i14] & 255) << 8) | ((i15 - 108) << 16);
                                i14 = i5 + 4;
                            } else if (i15 == 126) {
                                i2 = (bArr[i5 + 4] & 255) | ((bArr[i14] & 255) << 16) | ((bArr[i5 + 3] & 255) << 8);
                                i14 = i5 + 5;
                            } else {
                                i2 = (bArr[i5 + 5] & 255) | (bArr[i14] << 24) | ((bArr[i5 + 3] & 255) << 16) | ((bArr[i5 + 4] & 255) << 8);
                                i14 = i5 + 6;
                            }
                            i11 = i2 + i14;
                            byte b4 = bArr[i11];
                            i13 = (b4 & 255) >= 32 ? iArr[b4 & 1] : 2;
                        }
                        this.Y = i11;
                        return i13;
                    }
                    i9--;
                    i5 = i(i5 + 2, bArr[i11] & 255);
                } while (i9 > 1);
                int i16 = i5 + 1;
                if (i != (bArr[i5] & 255)) {
                    this.Y = -1;
                    return 1;
                }
                this.Y = i16;
                byte b5 = bArr[i16];
                if ((b5 & 255) < 32) {
                    break;
                }
                return iArr[b5 & 1];
            }
        }
        int i17 = i3 + 1;
        if (i != (bArr[i3] & 255)) {
            this.Y = -1;
            return 1;
        }
        int i18 = i4 - 1;
        this.Z = i18;
        this.Y = i17;
        if (i18 < 0) {
            byte b6 = bArr[i17];
            if ((b6 & 255) >= 32) {
                return iArr[b6 & 1];
            }
        }
        return 2;
    }

    public final void f(long j) {
        this.Z = (int) (j >> 32);
        this.Y = (int) j;
    }
}
