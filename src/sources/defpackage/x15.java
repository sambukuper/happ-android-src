package defpackage;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x15 implements w15 {
    public final iz5 a;
    public final gz5 b;

    public x15(iz5 iz5Var, gz5 gz5Var) {
        iz5Var.getClass();
        gz5Var.getClass();
        this.a = iz5Var;
        this.b = gz5Var;
    }

    @Override // defpackage.w15
    public final String a(int i) throws IOException {
        yf8 yf8VarC = c(i);
        List list = (List) yf8VarC.X;
        String strY0 = wv0.y0((List) yf8VarC.Y, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strY0;
        }
        return wv0.y0(list, "/", null, null, null, 62) + '/' + strY0;
    }

    @Override // defpackage.w15
    public final boolean b(int i) {
        return ((Boolean) c(i).Z).booleanValue();
    }

    public final yf8 c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            fz5 fz5Var = (fz5) this.b.Y.get(i);
            String str = (String) this.a.Y.get(fz5Var.f0);
            ez5 ez5Var = fz5Var.g0;
            ez5Var.getClass();
            int iOrdinal = ez5Var.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else {
                if (iOrdinal != 2) {
                    b61.c();
                    return null;
                }
                linkedList2.addFirst(str);
                z = true;
            }
            i = fz5Var.Z;
        }
        return new yf8(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // defpackage.w15
    public final String getString(int i) {
        String str = (String) this.a.Y.get(i);
        str.getClass();
        return str;
    }
}
