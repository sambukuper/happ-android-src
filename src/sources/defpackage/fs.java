package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fs implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ List Y;
    public final /* synthetic */ List Z;

    public /* synthetic */ fs(List list, List list2, byte b) {
        this.X = b;
        this.Y = list;
        this.Z = list2;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        Integer numB0;
        byte b = this.X;
        List list = this.Z;
        List list2 = this.Y;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                Integer numB1 = mm7.b0((String) list2.get(iIntValue));
                if (numB1 == null || (numB0 = mm7.b0((String) list.get(iIntValue))) == null) {
                    return null;
                }
                return new qg5(numB1, numB0);
            default:
                do5 do5Var = (do5) obj;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        qg5 qg5Var = (qg5) list2.get(i);
                        do5.g(do5Var, (eo5) qg5Var.X, ((hf3) qg5Var.Y).a);
                    }
                }
                if (list != null) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        qg5 qg5Var2 = (qg5) list.get(i2);
                        eo5 eo5Var = (eo5) qg5Var2.X;
                        dn2 dn2Var = (dn2) qg5Var2.Y;
                        do5.g(do5Var, eo5Var, dn2Var != null ? ((hf3) dn2Var.invoke()).a : 0L);
                    }
                }
                return dn8.a;
        }
    }
}
