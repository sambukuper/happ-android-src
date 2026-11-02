package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nx7 {
    public final ArrayList a = new ArrayList();

    public static void b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    b(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    public final void a(rx7 rx7Var) {
        this.a.add(rx7Var);
    }

    public final List c(ArrayList arrayList) {
        jl7 jl7Var;
        jl7 jl7Var2;
        jl7 jl7Var3;
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = this.a;
        if (size != arrayList2.size()) {
            return null;
        }
        int size2 = arrayList2.size();
        ArrayList<int[]> arrayList3 = new ArrayList();
        b(arrayList3, size2, new int[size2], 0);
        rx7[] rx7VarArr = new rx7[arrayList.size()];
        for (int[] iArr : arrayList3) {
            boolean z = true;
            for (int i = 0; i < arrayList2.size(); i++) {
                if (iArr[i] < arrayList.size()) {
                    rx7 rx7Var = (rx7) arrayList2.get(i);
                    rx7 rx7Var2 = (rx7) arrayList.get(iArr[i]);
                    rx7Var.getClass();
                    rx7Var2.getClass();
                    z &= rx7Var2.b.X <= rx7Var.b.X && rx7Var2.a == rx7Var.a && ((jl7Var = rx7Var.c) == (jl7Var2 = jl7.DEFAULT) || (jl7Var3 = rx7Var2.c) == jl7Var2 || jl7Var3 == jl7Var);
                    if (!z) {
                        break;
                    }
                    rx7VarArr[iArr[i]] = (rx7) arrayList2.get(i);
                }
            }
            if (z) {
                return Arrays.asList(rx7VarArr);
            }
        }
        return null;
    }
}
