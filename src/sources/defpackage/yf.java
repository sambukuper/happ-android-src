package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yf implements xr4 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ yf(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.xr4
    public final yr4 c(zr4 zr4Var, List list, long j) {
        ArrayList arrayList;
        qg5 qg5Var;
        byte b = this.a;
        e02 e02Var = e02.X;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((ir5) obj).setParentLayoutDirection((z24) obj2);
                return zr4Var.g0(0, 0, e02Var, new y2((byte) 15));
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (!(((tr4) obj3).w() instanceof g88)) {
                        arrayList2.add(obj3);
                    }
                }
                List list2 = (List) ((dn2) obj2).invoke();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int i2 = 0;
                    for (int size2 = list2.size(); i2 < size2; size2 = size2) {
                        s86 s86Var = (s86) list2.get(i2);
                        if (s86Var != null) {
                            float f = s86Var.b;
                            float f2 = s86Var.a;
                            qg5Var = new qg5(((tr4) arrayList2.get(i2)).o(s31.b(0, (int) Math.floor(s86Var.c - f2), 0, (int) Math.floor(s86Var.d - f), 5)), new hf3((((long) Math.round(f)) & 4294967295L) | (((long) Math.round(f2)) << 32)));
                        } else {
                            qg5Var = null;
                        }
                        if (qg5Var != null) {
                            arrayList3.add(qg5Var);
                        }
                        i2++;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    Object obj4 = list.get(i3);
                    if (((tr4) obj4).w() instanceof g88) {
                        arrayList4.add(obj4);
                    }
                }
                return zr4Var.g0(q31.h(j), q31.g(j), e02Var, new fs(arrayList, wl7.R(arrayList4, (dn2) obj), (byte) 1));
        }
    }
}
