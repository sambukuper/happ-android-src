package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g17 {
    public static final Comparator[] a;
    public static final ew6 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new x72(new x72(i == 0 ? l71.i0 : l71.f0, (byte) 3), (byte) 4);
            i++;
        }
        a = comparatorArr;
        b = new ew6((byte) 25);
    }

    public static final void a(y07 y07Var, ArrayList arrayList, y0 y0Var, y0 y0Var2, vz4 vz4Var) {
        t07 t07Var = y07Var.d;
        Object objG = t07Var.X.g(c17.n);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) y0Var2.B(y07Var)).booleanValue()) && ((Boolean) y0Var.B(y07Var)).booleanValue()) {
            arrayList.add(y07Var);
        }
        if (zBooleanValue) {
            vz4Var.h(y07Var.f, b(y07Var, y0Var, y0Var2, y07Var.i((4 & 1) != 0 ? !y07Var.b : false, (4 & 2) == 0)));
            return;
        }
        List listI = y07Var.i((4 & 1) != 0 ? !y07Var.b : false, (4 & 2) == 0);
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            a((y07) listI.get(i), arrayList, y0Var, y0Var2, vz4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    public static final ArrayList b(y07 y07Var, y0 y0Var, y0 y0Var2, List list) {
        int i;
        vz4 vz4Var = gf3.a;
        vz4 vz4Var2 = new vz4();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((y07) list.get(i2), arrayList, y0Var, y0Var2, vz4Var2);
        }
        int i3 = 1;
        char c = y07Var.c.B0 == z24.Y ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                y07 y07Var2 = (y07) arrayList.get(i4);
                if (i4 == 0) {
                    i = i3;
                    arrayList2.add(new qg5(y07Var2.h(), i21.N(y07Var2)));
                    break;
                }
                float f = y07Var2.h().b;
                float f2 = y07Var2.h().d;
                int i5 = f >= f2 ? i3 : 0;
                int size3 = arrayList2.size() - i3;
                if (size3 >= 0) {
                    int i6 = 0;
                    while (true) {
                        s86 s86Var = (s86) ((qg5) arrayList2.get(i6)).X;
                        float f3 = s86Var.b;
                        i = i3;
                        float f4 = s86Var.d;
                        int i7 = f3 >= f4 ? i : 0;
                        if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i6, new qg5(new s86(Math.max(s86Var.a, 0.0f), Math.max(s86Var.b, f), Math.min(s86Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((qg5) arrayList2.get(i6)).Y));
                            ((List) ((qg5) arrayList2.get(i6)).Y).add(y07Var2);
                            break;
                        }
                        if (i6 != size3) {
                            i6++;
                            i3 = i;
                        }
                    }
                } else {
                    i = i3;
                }
                arrayList2.add(new qg5(y07Var2.h(), i21.N(y07Var2)));
                break;
                if (i4 == size2) {
                    break;
                }
                i4++;
                i3 = i;
            }
        }
        aw0.c0(arrayList2, l71.j0);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            qg5 qg5Var = (qg5) arrayList2.get(i8);
            aw0.c0((List) qg5Var.Y, comparator);
            arrayList3.addAll((Collection) qg5Var.Y);
        }
        aw0.c0(arrayList3, new cg((byte) 7));
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) vz4Var2.b(((y07) arrayList3.get(size5)).f);
            if (list2 != null) {
                if (((Boolean) y0Var2.B(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
