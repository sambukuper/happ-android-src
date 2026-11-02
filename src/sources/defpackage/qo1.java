package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qo1 {
    public final ArrayList a;
    public final int[] b;
    public final int[] c;
    public final yr2 d;
    public final int e;
    public final int f;
    public final boolean g;

    public qo1(yr2 yr2Var, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        int i2;
        this.a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = yr2Var;
        gv gvVar = (gv) yr2Var.Y;
        int size = gvVar.X.size();
        this.e = size;
        int size2 = gvVar.Y.size();
        this.f = size2;
        this.g = true;
        po1 po1Var = arrayList.isEmpty() ? null : (po1) arrayList.get(0);
        if (po1Var == null || po1Var.a != 0 || po1Var.b != 0) {
            arrayList.add(0, new po1(0, 0, 0));
        }
        arrayList.add(new po1(size, size2, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            po1 po1Var2 = (po1) it.next();
            for (int i3 = 0; i3 < po1Var2.c; i3++) {
                int i4 = po1Var2.a + i3;
                int i5 = po1Var2.b + i3;
                int i6 = yr2Var.e(i4, i5) ? 1 : 2;
                iArr[i4] = (i5 << 4) | i6;
                iArr2[i5] = (i4 << 4) | i6;
            }
        }
        if (this.g) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                po1 po1Var3 = (po1) it2.next();
                while (true) {
                    i = po1Var3.a;
                    if (i7 < i) {
                        if (iArr[i7] == 0) {
                            int size3 = arrayList.size();
                            int i8 = 0;
                            for (int i9 = 0; i9 < size3; i9++) {
                                po1 po1Var4 = (po1) arrayList.get(i9);
                                while (true) {
                                    i2 = po1Var4.b;
                                    if (i8 < i2) {
                                        if (iArr2[i8] == 0 && yr2Var.g(i7, i8)) {
                                            int i10 = yr2Var.e(i7, i8) ? 8 : 4;
                                            iArr[i7] = (i8 << 4) | i10;
                                            iArr2[i8] = i10 | (i7 << 4);
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                i8 = po1Var4.c + i2;
                            }
                        }
                        i7++;
                    }
                }
                i7 = po1Var3.c + i;
            }
        }
    }

    public static ro1 a(ArrayDeque arrayDeque, int i, boolean z) {
        ro1 ro1Var;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                ro1Var = null;
                break;
            }
            ro1Var = (ro1) it.next();
            if (ro1Var.a == i && ro1Var.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            ro1 ro1Var2 = (ro1) it.next();
            if (z) {
                ro1Var2.b--;
            } else {
                ro1Var2.b++;
            }
        }
        return ro1Var;
    }
}
