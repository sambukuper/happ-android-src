package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k13 {
    public final j76 c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public kz2[] d = new kz2[8];
    public int e = 7;

    public k13(j23 j23Var) {
        this.c = new j76(j23Var);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                kz2 kz2Var = this.d[length];
                kz2Var.getClass();
                int i4 = kz2Var.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            kz2[] kz2VarArr = this.d;
            int i5 = i2 + 1;
            System.arraycopy(kz2VarArr, i5, kz2VarArr, i5 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final kb0 b(int i) throws IOException {
        if (i >= 0) {
            kz2[] kz2VarArr = m13.a;
            if (i <= kz2VarArr.length - 1) {
                return kz2VarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - m13.a.length);
        if (length >= 0) {
            kz2[] kz2VarArr2 = this.d;
            if (length < kz2VarArr2.length) {
                kz2 kz2Var = kz2VarArr2[length];
                kz2Var.getClass();
                return kz2Var.a;
            }
        }
        u52.h(i + 1, "Header index too large ");
        return null;
    }

    public final void c(kz2 kz2Var) {
        this.b.add(kz2Var);
        int i = kz2Var.c;
        int i2 = this.a;
        if (i > i2) {
            kz2[] kz2VarArr = this.d;
            eu.m0(0, kz2VarArr.length, null, kz2VarArr);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        kz2[] kz2VarArr2 = this.d;
        if (i3 > kz2VarArr2.length) {
            kz2[] kz2VarArr3 = new kz2[kz2VarArr2.length * 2];
            System.arraycopy(kz2VarArr2, 0, kz2VarArr3, kz2VarArr2.length, kz2VarArr2.length);
            this.e = this.d.length - 1;
            this.d = kz2VarArr3;
            kz2VarArr2 = kz2VarArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        kz2VarArr2[i4] = kz2Var;
        this.f++;
        this.g += i;
    }

    public final kb0 d() {
        j76 j76Var = this.c;
        byte b = j76Var.readByte();
        byte[] bArr = ks8.a;
        int i = b & 255;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jE = e(i, 127);
        if (!z) {
            return j76Var.s(jE);
        }
        i90 i90Var = new i90();
        cb0 cb0Var = v23.c;
        cb0 cb0Var2 = cb0Var;
        int i3 = 0;
        for (long j = 0; j < jE; j++) {
            byte b2 = j76Var.readByte();
            byte[] bArr2 = ks8.a;
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                cb0[] cb0VarArr = (cb0[]) cb0Var2.f0;
                cb0VarArr.getClass();
                cb0Var2 = cb0VarArr[(i2 >>> (i3 - 8)) & 255];
                cb0Var2.getClass();
                if (((cb0[]) cb0Var2.f0) == null) {
                    i90Var.H0(cb0Var2.Y);
                    i3 -= cb0Var2.Z;
                    cb0Var2 = cb0Var;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            cb0[] cb0VarArr2 = (cb0[]) cb0Var2.f0;
            cb0VarArr2.getClass();
            cb0 cb0Var3 = cb0VarArr2[(i2 << (8 - i3)) & 255];
            cb0Var3.getClass();
            int i4 = cb0Var3.Z;
            if (((cb0[]) cb0Var3.f0) != null || i4 > i3) {
                break;
            }
            i90Var.H0(cb0Var3.Y);
            i3 -= i4;
            cb0Var2 = cb0Var;
        }
        return i90Var.s(i90Var.Y);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.c.readByte();
            byte[] bArr = ks8.a;
            int i5 = b & 255;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }
}
