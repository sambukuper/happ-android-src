package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mb0 implements Iterator {
    public byte[] X;
    public int Y;
    public int Z;
    public x50 f0;
    public ArrayList g0;

    public final int a(int i, int i2) {
        ArrayList arrayList = this.g0;
        byte[] bArr = this.X;
        x50 x50Var = this.f0;
        while (i2 > 5) {
            int i3 = i + 1;
            int i4 = i2 >> 1;
            arrayList.add(Long.valueOf((((long) nb0.h(i3, bArr)) << 32) | ((long) ((i2 - i4) << 16)) | ((long) x50Var.c)));
            i = nb0.c(i3, bArr);
            i2 = i4;
        }
        int i5 = i + 1;
        byte b = bArr[i];
        int i6 = i + 2;
        byte b2 = bArr[i5];
        int i7 = b2 & 255;
        boolean z = (b2 & 1) != 0;
        int iE = nb0.e(i6, i7 >> 1, bArr);
        int i8 = nb0.i(i6, i7);
        arrayList.add(Long.valueOf((((long) i8) << 32) | ((long) ((i2 - 1) << 16)) | ((long) x50Var.c)));
        int i9 = x50Var.c + 1;
        byte[] bArr2 = x50Var.b;
        if (bArr2.length < i9) {
            bArr2 = new byte[Math.min(bArr2.length * 2, i9 * 2)];
            System.arraycopy(x50Var.b, 0, bArr2, 0, x50Var.c);
            x50Var.b = bArr2;
        }
        int i10 = x50Var.c;
        x50Var.c = i10 + 1;
        bArr2[i10] = b;
        if (!z) {
            return i8 + iE;
        }
        this.Y = -1;
        x50Var.a = iE;
        return -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Y >= 0 || !this.g0.isEmpty();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte[] bArr = this.X;
        ArrayList arrayList = this.g0;
        x50 x50Var = this.f0;
        int iA = this.Y;
        if (iA < 0) {
            if (arrayList.isEmpty()) {
                bt.n();
                return null;
            }
            long jLongValue = ((Long) arrayList.remove(arrayList.size() - 1)).longValue();
            int i = (int) jLongValue;
            int i2 = (int) (jLongValue >> 32);
            int i3 = 65535 & i;
            x50Var.c = i3;
            int i4 = i >>> 16;
            if (i4 > 1) {
                iA = a(i2, i4);
                if (iA < 0) {
                    return x50Var;
                }
            } else {
                int i5 = i2 + 1;
                byte b = bArr[i2];
                int i6 = i3 + 1;
                byte[] bArr2 = x50Var.b;
                if (bArr2.length < i6) {
                    bArr2 = new byte[Math.min(bArr2.length * 2, i6 * 2)];
                    System.arraycopy(x50Var.b, 0, bArr2, 0, x50Var.c);
                    x50Var.b = bArr2;
                }
                int i7 = x50Var.c;
                x50Var.c = i7 + 1;
                bArr2[i7] = b;
                iA = i5;
            }
        }
        if (this.Z >= 0) {
            this.Y = -1;
            x50Var.a = -1;
            return x50Var;
        }
        while (true) {
            int i8 = iA + 1;
            byte b2 = bArr[iA];
            int i9 = b2 & 255;
            if (i9 >= 32) {
                boolean z = (b2 & 1) != 0;
                x50Var.a = nb0.e(i8, i9 >> 1, bArr);
                if (z) {
                    this.Y = -1;
                    return x50Var;
                }
                this.Y = nb0.i(i8, i9);
                return x50Var;
            }
            if (i9 < 16) {
                if (i9 == 0) {
                    i9 = bArr[i8] & 255;
                    i8 = iA + 2;
                }
                int iA2 = a(i8, i9 + 1);
                if (iA2 < 0) {
                    return x50Var;
                }
                iA = iA2;
            } else {
                int i10 = i9 - 15;
                x50Var.a(i8, i10, bArr);
                iA = i10 + i8;
            }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
