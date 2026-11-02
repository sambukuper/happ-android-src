package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l13 {
    public final i90 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public kz2[] e = new kz2[8];
    public int f = 7;

    public l13(i90 i90Var) {
        this.a = i90Var;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                kz2 kz2Var = this.e[length];
                kz2Var.getClass();
                i -= kz2Var.c;
                int i4 = this.h;
                kz2 kz2Var2 = this.e[length];
                kz2Var2.getClass();
                this.h = i4 - kz2Var2.c;
                this.g--;
                i3++;
                length--;
            }
            kz2[] kz2VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(kz2VarArr, i5, kz2VarArr, i5 + i3, this.g);
            kz2[] kz2VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(kz2VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(kz2 kz2Var) {
        int i = kz2Var.c;
        int i2 = this.d;
        if (i > i2) {
            kz2[] kz2VarArr = this.e;
            eu.m0(0, kz2VarArr.length, null, kz2VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        kz2[] kz2VarArr2 = this.e;
        if (i3 > kz2VarArr2.length) {
            kz2[] kz2VarArr3 = new kz2[kz2VarArr2.length * 2];
            System.arraycopy(kz2VarArr2, 0, kz2VarArr3, kz2VarArr2.length, kz2VarArr2.length);
            this.f = this.e.length - 1;
            this.e = kz2VarArr3;
            kz2VarArr2 = kz2VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        kz2VarArr2[i4] = kz2Var;
        this.g++;
        this.h += i;
    }

    public final void c(kb0 kb0Var) throws EOFException {
        kb0Var.getClass();
        int[] iArr = v23.a;
        int iE = kb0Var.e();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iE; i++) {
            byte bJ = kb0Var.j(i);
            byte[] bArr = ks8.a;
            j2 += (long) v23.b[bJ & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iE2 = kb0Var.e();
        i90 i90Var = this.a;
        if (i2 >= iE2) {
            e(kb0Var.e(), 127, 0);
            i90Var.C0(kb0Var);
            return;
        }
        i90 i90Var2 = new i90();
        int[] iArr2 = v23.a;
        int iE3 = kb0Var.e();
        int i3 = 0;
        for (int i4 = 0; i4 < iE3; i4++) {
            byte bJ2 = kb0Var.j(i4);
            byte[] bArr2 = ks8.a;
            int i5 = bJ2 & 255;
            int i6 = v23.a[i5];
            byte b = v23.b[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                i90Var2.H0((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            i90Var2.H0((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        kb0 kb0VarS = i90Var2.s(i90Var2.Y);
        e(kb0VarS.e(), 127, 128);
        i90Var.C0(kb0VarS);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.c) {
            int i = this.b;
            if (i < this.d) {
                e(i, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            kz2 kz2Var = (kz2) arrayList.get(i2);
            kb0 kb0VarR = kz2Var.a.r();
            kb0 kb0Var = kz2Var.b;
            Integer num = (Integer) m13.b.get(kb0VarR);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    kz2[] kz2VarArr = m13.a;
                    if (dh3.f(kz2VarArr[iIntValue].b, kb0Var)) {
                        length = length2;
                    } else if (dh3.f(kz2VarArr[length2].b, kb0Var)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.e.length;
                for (int i3 = this.f + 1; i3 < length3; i3++) {
                    kz2 kz2Var2 = this.e[i3];
                    kz2Var2.getClass();
                    if (dh3.f(kz2Var2.a, kb0VarR)) {
                        kz2 kz2Var3 = this.e[i3];
                        kz2Var3.getClass();
                        if (dh3.f(kz2Var3.b, kb0Var)) {
                            length2 = m13.a.length + (i3 - this.f);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f) + m13.a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, 127, 128);
            } else if (length == -1) {
                this.a.H0(64);
                c(kb0VarR);
                c(kb0Var);
                b(kz2Var);
            } else {
                kb0 kb0Var2 = kz2.d;
                kb0VarR.getClass();
                kb0Var2.getClass();
                if (!kb0VarR.m(0, kb0Var2, kb0Var2.e()) || dh3.f(kz2.i, kb0VarR)) {
                    e(length, 63, 64);
                    c(kb0Var);
                    b(kz2Var);
                } else {
                    e(length, 15, 0);
                    c(kb0Var);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        i90 i90Var = this.a;
        if (i < i2) {
            i90Var.H0(i | i3);
            return;
        }
        i90Var.H0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            i90Var.H0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        i90Var.H0(i4);
    }
}
