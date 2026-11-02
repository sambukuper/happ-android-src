package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class op2 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final vz4 e;
    public final vz7 f;

    public op2(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            wr5.a("Invalid start index");
        }
        this.d = new ArrayList();
        vz4 vz4Var = new vz4();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ex3 ex3Var = (ex3) this.a.get(i3);
            int i4 = ex3Var.c;
            int i5 = ex3Var.d;
            vz4Var.h(i4, new pu2(i3, i2, i5));
            i2 += i5;
        }
        this.e = vz4Var;
        this.f = new vz7(new f3(this, (byte) 25));
    }

    public final boolean a(int i, int i2) {
        pu2 pu2Var;
        int i3;
        int i4;
        vz4 vz4Var = this.e;
        pu2 pu2Var2 = (pu2) vz4Var.b(i);
        if (pu2Var2 == null) {
            return false;
        }
        int i5 = pu2Var2.b;
        int i6 = i2 - pu2Var2.c;
        pu2Var2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = vz4Var.c;
        long[] jArr = vz4Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (pu2Var = (pu2) objArr[(i7 << 3) + i9]).b) >= i5 && pu2Var != pu2Var2 && (i4 = i3 + i6) >= 0) {
                        pu2Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
