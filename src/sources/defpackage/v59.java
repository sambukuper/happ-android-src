package defpackage;

import io.sentry.c2;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class v59 extends jm4 {
    public final byte[] m0;

    public v59(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.m0 = bArr;
        if (secureRandom == null) {
            b61.i("'random' cannot be null");
            throw null;
        }
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 248);
        byte b = (byte) (bArr[31] & 127);
        bArr[31] = b;
        bArr[31] = (byte) (b | 64);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [long] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r3v95 */
    public v59 e0() {
        ?? r16;
        int i;
        int i2;
        int i3;
        byte[] bArr = new byte[32];
        byte[] bArr2 = this.m0;
        int i4 = 0;
        ?? r3 = 0;
        ch3.U(0, 32, bArr2);
        ch3.U(0, 32, bArr);
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        ch3.U(0, 32, bArr2);
        byte[] bArr3 = new byte[32];
        pu.I(bArr2, bArr3);
        y5 y5Var = new y5((byte) 9);
        synchronized (pu.n) {
            try {
                if (pu.q != null) {
                    r16 = ' ';
                    i = 1;
                } else {
                    z47[] z47VarArr = new z47[96];
                    r16 = ' ';
                    i = 1;
                    mj0 mj0Var = new mj0((byte) 19, (boolean) (r3 == true ? 1 : 0));
                    mj0Var.Y = new int[10];
                    mj0Var.Z = new int[10];
                    int[] iArr3 = new int[10];
                    int[] iArr4 = new int[10];
                    int[] iArr5 = pu.g;
                    zc1.u(0, 0, iArr5, iArr3);
                    int[] iArr6 = pu.h;
                    zc1.u(0, 0, iArr6, iArr4);
                    byte b = 17;
                    z47 z47Var = new z47((byte) 17);
                    zc1.u(0, 0, iArr3, (int[]) z47Var.Y);
                    zc1.u(0, 0, iArr4, (int[]) z47Var.Z);
                    zc1.e0((int[]) z47Var.f0);
                    zc1.a0(iArr3, iArr4, (int[]) z47Var.g0);
                    z47VarArr[0] = z47Var;
                    z47 z47Var2 = new z47((byte) 17);
                    pu.F(z47Var, z47Var, z47Var2, mj0Var);
                    for (int i5 = 1; i5 < 16; i5++) {
                        z47 z47Var3 = new z47((byte) 17);
                        pu.F(z47VarArr[i5 - 1], z47Var2, z47Var3, mj0Var);
                        z47VarArr[i5] = z47Var3;
                    }
                    int[] iArr7 = new int[10];
                    int[] iArr8 = new int[10];
                    zc1.u(0, 0, pu.i, iArr7);
                    zc1.u(0, 0, pu.j, iArr8);
                    z47 z47Var4 = new z47((byte) 17);
                    zc1.u(0, 0, iArr7, (int[]) z47Var4.Y);
                    zc1.u(0, 0, iArr8, (int[]) z47Var4.Z);
                    zc1.e0((int[]) z47Var4.f0);
                    zc1.a0(iArr7, iArr8, (int[]) z47Var4.g0);
                    z47VarArr[16] = z47Var4;
                    z47 z47Var5 = new z47((byte) 17);
                    pu.F(z47Var4, z47Var4, z47Var5, mj0Var);
                    int i6 = 1;
                    for (int i7 = 16; i6 < i7; i7 = 16) {
                        z47 z47Var6 = new z47((byte) 17);
                        pu.F(z47VarArr[i6 + 15], z47Var5, z47Var6, mj0Var);
                        z47VarArr[i7 + i6] = z47Var6;
                        i6++;
                    }
                    y5 y5Var2 = new y5((byte) 9);
                    zc1.u(0, 0, iArr5, (int[]) y5Var2.Y);
                    zc1.u(0, 0, iArr6, (int[]) y5Var2.Z);
                    zc1.e0((int[]) y5Var2.g0);
                    zc1.u(0, 0, (int[]) y5Var2.Y, (int[]) y5Var2.f0);
                    zc1.u(0, 0, (int[]) y5Var2.Z, (int[]) y5Var2.h0);
                    z47[] z47VarArr2 = new z47[4];
                    int i8 = 0;
                    for (int i9 = 4; i8 < i9; i9 = 4) {
                        z47VarArr2[i8] = new z47((byte) 17);
                        i8++;
                    }
                    z47 z47Var7 = new z47((byte) 17);
                    int i10 = 0;
                    int i11 = 32;
                    while (i10 < 8) {
                        z47 z47Var8 = new z47(b);
                        while (i4 < 4) {
                            if (i4 == 0) {
                                pu.G(y5Var2, z47Var8);
                            } else {
                                pu.G(y5Var2, z47Var7);
                                pu.F(z47Var8, z47Var7, z47Var8, mj0Var);
                            }
                            pu.H(y5Var2);
                            pu.G(y5Var2, z47VarArr2[i4]);
                            int i12 = i4;
                            if (i10 + i4 != 10) {
                                for (int i13 = 1; i13 < 8; i13++) {
                                    pu.H(y5Var2);
                                }
                            }
                            i4 = i12 + 1;
                        }
                        int[] iArr9 = (int[]) z47Var8.Y;
                        for (int i14 = 0; i14 < 10; i14++) {
                            iArr9[i14] = -iArr9[i14];
                        }
                        int[] iArr10 = (int[]) z47Var8.g0;
                        for (int i15 = 0; i15 < 10; i15++) {
                            iArr10[i15] = -iArr10[i15];
                        }
                        z47VarArr[i11] = z47Var8;
                        i11++;
                        int i16 = 0;
                        while (i16 < 3) {
                            int i17 = 1 << i16;
                            int i18 = 0;
                            while (i18 < i17) {
                                int i19 = i16;
                                int i20 = i17;
                                z47 z47Var9 = new z47((byte) 17);
                                z47VarArr[i11] = z47Var9;
                                pu.F(z47VarArr[i11 - i20], z47VarArr2[i19], z47Var9, mj0Var);
                                i18++;
                                i11++;
                                y5Var2 = y5Var2;
                                i16 = i19;
                                i17 = i20;
                            }
                            i16++;
                        }
                        i10++;
                        i4 = 0;
                        b = 17;
                    }
                    pu.y(z47VarArr);
                    int i21 = 16;
                    pu.o = new lr[16];
                    int i22 = 0;
                    while (i22 < i21) {
                        z47 z47Var10 = z47VarArr[i22];
                        lr lrVar = new lr((byte) 23);
                        int[] iArr11 = (int[]) z47Var10.Y;
                        zc1.a0(iArr11, (int[]) z47Var10.f0, iArr11);
                        int[] iArr12 = (int[]) z47Var10.Z;
                        zc1.a0(iArr12, (int[]) z47Var10.f0, iArr12);
                        zc1.m((int[]) z47Var10.Z, (int[]) z47Var10.Y, (int[]) lrVar.Z, (int[]) lrVar.Y);
                        zc1.a0((int[]) z47Var10.Y, (int[]) z47Var10.Z, (int[]) lrVar.f0);
                        int[] iArr13 = (int[]) lrVar.f0;
                        zc1.a0(iArr13, pu.m, iArr13);
                        zc1.d0((int[]) lrVar.Y);
                        zc1.d0((int[]) lrVar.Z);
                        zc1.d0((int[]) lrVar.f0);
                        pu.o[i22] = lrVar;
                        i22++;
                        i21 = 16;
                    }
                    pu.p = new lr[i21];
                    int i23 = 0;
                    while (i23 < i21) {
                        z47 z47Var11 = z47VarArr[i21 + i23];
                        lr lrVar2 = new lr((byte) 23);
                        int[] iArr14 = (int[]) z47Var11.Y;
                        zc1.a0(iArr14, (int[]) z47Var11.f0, iArr14);
                        int[] iArr15 = (int[]) z47Var11.Z;
                        zc1.a0(iArr15, (int[]) z47Var11.f0, iArr15);
                        zc1.m((int[]) z47Var11.Z, (int[]) z47Var11.Y, (int[]) lrVar2.Z, (int[]) lrVar2.Y);
                        zc1.a0((int[]) z47Var11.Y, (int[]) z47Var11.Z, (int[]) lrVar2.f0);
                        int[] iArr16 = (int[]) lrVar2.f0;
                        zc1.a0(iArr16, pu.m, iArr16);
                        zc1.d0((int[]) lrVar2.Y);
                        zc1.d0((int[]) lrVar2.Z);
                        zc1.d0((int[]) lrVar2.f0);
                        pu.p[i23] = lrVar2;
                        i23++;
                        i21 = 16;
                    }
                    pu.q = new int[1920];
                    int[] iArr17 = new int[10];
                    int[] iArr18 = new int[10];
                    int[] iArr19 = new int[10];
                    int i24 = 0;
                    for (int i25 = 32; i25 < 96; i25++) {
                        z47 z47Var12 = z47VarArr[i25];
                        int[] iArr20 = (int[]) z47Var12.Y;
                        zc1.a0(iArr20, (int[]) z47Var12.f0, iArr20);
                        int[] iArr21 = (int[]) z47Var12.Z;
                        zc1.a0(iArr21, (int[]) z47Var12.f0, iArr21);
                        zc1.m((int[]) z47Var12.Z, (int[]) z47Var12.Y, iArr18, iArr17);
                        zc1.a0((int[]) z47Var12.Y, (int[]) z47Var12.Z, iArr19);
                        zc1.a0(iArr19, pu.m, iArr19);
                        zc1.d0(iArr17);
                        zc1.d0(iArr18);
                        zc1.d0(iArr19);
                        zc1.u(0, i24, iArr17, pu.q);
                        zc1.u(0, i24 + 10, iArr18, pu.q);
                        zc1.u(0, i24 + 20, iArr19, pu.q);
                        i24 += 30;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr22 = new int[8];
        int i26 = 0;
        for (int i27 = 8; i26 < i27; i27 = 8) {
            iArr22[i26] = u70.E(i26 * 4, bArr3);
            i26++;
        }
        int i28 = ~iArr22[0];
        int[] iArr23 = g33.c;
        long j = 4294967295L;
        long j2 = ((long) (-(i28 & 1))) & 4294967295L;
        long j3 = 0;
        int i29 = 0;
        while (i29 < 8) {
            long j4 = (((long) iArr22[i29]) & j) + (((long) iArr23[i29]) & j2) + j3;
            iArr22[i29] = (int) j4;
            j3 = j4 >>> r16;
            i29++;
            j = 4294967295L;
        }
        int i30 = i;
        int i31 = 8;
        while (true) {
            i31--;
            if (i31 < 0) {
                break;
            }
            int i32 = iArr22[i31];
            iArr22[i31] = (i30 << 31) | (i32 >>> 1);
            i30 = i32;
        }
        int i33 = 0;
        while (true) {
            i2 = 7;
            if (i33 >= 8) {
                break;
            }
            iArr22[i33] = w79.f(w79.f(w79.f(w79.f(iArr22[i33], 11141290, 7), 52428, 14), 15728880, 4), 65280, 8);
            i33++;
        }
        int[] iArr24 = new int[10];
        int[] iArr25 = new int[10];
        int[] iArr26 = new int[10];
        int[] iArr27 = new int[10];
        int[] iArr28 = (int[]) y5Var.Y;
        int i34 = 0;
        for (int i35 = 10; i34 < i35; i35 = 10) {
            iArr28[i34] = 0;
            i34++;
        }
        zc1.e0((int[]) y5Var.Z);
        zc1.e0((int[]) y5Var.g0);
        int[] iArr29 = (int[]) y5Var.f0;
        for (int i36 = 0; i36 < 10; i36++) {
            iArr29[i36] = 0;
        }
        zc1.e0((int[]) y5Var.h0);
        int i37 = 28;
        int i38 = 0;
        while (true) {
            i3 = i38;
            int i39 = 0;
            while (i39 < 8) {
                int i40 = iArr22[i39] >>> i37;
                int i41 = (i40 >>> 3) & 1;
                int i42 = (i40 ^ (-i41)) & i2;
                int[] iArr30 = iArr22;
                int i43 = i39 * 240;
                int i44 = 0;
                while (i44 < 8) {
                    int i45 = ((i44 ^ i42) - 1) >> 31;
                    zc1.q(i45, i43, pu.q, iArr24);
                    int i46 = i43;
                    zc1.q(i45, i43 + 10, pu.q, iArr25);
                    zc1.q(i45, i46 + 20, pu.q, iArr26);
                    i43 = i46 + 30;
                    i44++;
                    i37 = i37;
                }
                int i47 = i37;
                int i48 = i3 ^ i41;
                zc1.r((int[]) y5Var.Y, i48);
                zc1.r((int[]) y5Var.f0, i48);
                int[] iArr31 = (int[]) y5Var.Y;
                int[] iArr32 = (int[]) y5Var.Z;
                int[] iArr33 = (int[]) y5Var.f0;
                int[] iArr34 = (int[]) y5Var.h0;
                zc1.m(iArr32, iArr31, iArr32, iArr31);
                zc1.a0(iArr31, iArr24, iArr31);
                zc1.a0(iArr32, iArr25, iArr32);
                zc1.a0(iArr33, iArr34, iArr27);
                zc1.a0(iArr27, iArr26, iArr27);
                zc1.m(iArr32, iArr31, iArr34, iArr33);
                int[] iArr35 = (int[]) y5Var.g0;
                zc1.m(iArr35, iArr27, iArr32, iArr31);
                zc1.a0(iArr31, iArr32, iArr35);
                zc1.a0(iArr31, iArr33, (int[]) y5Var.Y);
                zc1.a0(iArr32, iArr34, iArr32);
                i39++;
                i3 = i41;
                iArr22 = iArr30;
                i37 = i47;
                i2 = 7;
            }
            int[] iArr36 = iArr22;
            i37 -= 4;
            if (i37 < 0) {
                break;
            }
            pu.H(y5Var);
            i38 = i3;
            iArr22 = iArr36;
            i2 = 7;
        }
        zc1.r((int[]) y5Var.Y, i3);
        zc1.r((int[]) y5Var.f0, i3);
        int[] iArr37 = new int[10];
        int[] iArr38 = new int[10];
        int[] iArr39 = new int[10];
        int[] iArr40 = new int[10];
        zc1.k0((int[]) y5Var.Y, iArr38);
        zc1.k0((int[]) y5Var.Z, iArr39);
        zc1.k0((int[]) y5Var.g0, iArr40);
        zc1.a0(iArr38, iArr39, iArr37);
        zc1.l0(iArr38, iArr39, iArr38);
        zc1.a0(iArr38, iArr40, iArr38);
        zc1.k0(iArr40, iArr40);
        zc1.a0(iArr37, pu.k, iArr37);
        zc1.k(iArr37, iArr40, iArr37);
        zc1.k(iArr37, iArr38, iArr37);
        zc1.d0(iArr37);
        zc1.d0(iArr39);
        zc1.d0(iArr40);
        if (((~zc1.V(iArr40)) & zc1.V(iArr37) & (~zc1.V(iArr39))) == 0) {
            c2.g();
            return null;
        }
        zc1.u(0, 0, (int[]) y5Var.Z, iArr);
        zc1.u(0, 0, (int[]) y5Var.g0, iArr2);
        zc1.m(iArr2, iArr, iArr, iArr2);
        zc1.R(iArr2, iArr2);
        zc1.a0(iArr, iArr2, iArr);
        zc1.d0(iArr);
        zc1.B(0, 0, bArr, iArr);
        zc1.B(5, 16, bArr, iArr);
        return new v59(bArr);
    }

    public v59(byte[] bArr) {
        super(false);
        byte[] bArr2 = new byte[32];
        this.m0 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 32);
    }
}
