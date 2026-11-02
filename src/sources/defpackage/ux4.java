package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ux4 {
    public final List a;

    public ux4(tz5 tz5Var) {
        tz5Var.getClass();
        List list = tz5Var.Z;
        if ((tz5Var.Y & 1) == 1) {
            int i = tz5Var.f0;
            list.getClass();
            ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    i21.X();
                    throw null;
                }
                nz5 nz5VarG = (nz5) obj;
                if (i2 >= i) {
                    nz5VarG.getClass();
                    mz5 mz5VarR = nz5.r(nz5VarG);
                    mz5VarR.f0 |= 2;
                    mz5VarR.h0 = true;
                    nz5VarG = mz5VarR.g();
                    if (!nz5VarG.d()) {
                        throw new xm8();
                    }
                }
                arrayList.add(nz5VarG);
                i2 = i3;
            }
            list = arrayList;
        }
        list.getClass();
        this.a = list;
    }

    public nz5 a(int i) {
        return (nz5) this.a.get(i);
    }

    public ux4(List list) {
        this.a = list;
    }
}
