package defpackage;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rl {
    public static final /* synthetic */ int a = 0;

    static {
        new ql(_UrlKt.FRAGMENT_ENCODE_SET);
    }

    public static final List a(ql qlVar, int i, int i2, y2 y2Var) {
        List list;
        if (i == i2 || (list = qlVar.X) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= qlVar.Y.length()) {
            if (y2Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) y2Var.B(((pl) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            pl plVar = (pl) list.get(i3);
            if (y2Var != null ? ((Boolean) y2Var.B(plVar.a)).booleanValue() : true) {
                int i4 = plVar.b;
                int i5 = plVar.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new pl(plVar.d, x97.n(plVar.b, i, i2) - i, x97.n(i5, i, i2) - i, (ml) plVar.a));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
