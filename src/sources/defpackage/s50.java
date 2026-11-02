package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s50 {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;

    public s50(int... iArr) {
        List listY0;
        this.a = iArr;
        Integer numT0 = eu.t0(iArr, 0);
        this.b = numT0 != null ? numT0.intValue() : -1;
        Integer numT1 = eu.t0(iArr, 1);
        this.c = numT1 != null ? numT1.intValue() : -1;
        Integer numT2 = eu.t0(iArr, 2);
        this.d = numT2 != null ? numT2.intValue() : -1;
        if (iArr.length <= 3) {
            listY0 = d02.X;
        } else {
            if (iArr.length > 1024) {
                bt.q(pc6.r(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
                throw null;
            }
            listY0 = wv0.Y0(new fu(iArr).subList(3, iArr.length));
        }
        this.e = listY0;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.d >= i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        s50 s50Var = (s50) obj;
        return this.b == s50Var.b && this.c == s50Var.c && this.d == s50Var.d && this.e.equals(s50Var.e);
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i * 31) + this.c + i;
        int i3 = (i2 * 31) + this.d + i2;
        return this.e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.a) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : wv0.y0(arrayList, ".", null, null, null, 62);
    }
}
