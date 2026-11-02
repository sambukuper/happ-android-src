package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m74 implements dn2 {
    public final /* synthetic */ byte X;
    public final n74 Y;

    public /* synthetic */ m74(n74 n74Var, byte b) {
        this.X = b;
        this.Y = n74Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        n74 n74Var = this.Y;
        switch (b) {
            case 0:
                wx4 wx4Var = n74Var.g0;
                wx4Var.G0();
                j01 j01Var = (j01) wx4Var.o0.getValue();
                fk2 fk2Var = n74Var.h0;
                j01Var.getClass();
                fk2Var.getClass();
                ArrayList arrayList = new ArrayList();
                j01Var.b(fk2Var, arrayList);
                return arrayList;
            case 1:
                wx4 wx4Var2 = n74Var.g0;
                wx4Var2.G0();
                return Boolean.valueOf(vj8.S((j01) wx4Var2.o0.getValue(), n74Var.h0));
            default:
                te4 te4Var = n74Var.j0;
                nw3[] nw3VarArr = n74.l0;
                boolean zBooleanValue = ((Boolean) hi5.e0(te4Var, nw3VarArr[1])).booleanValue();
                fk2 fk2Var2 = n74Var.h0;
                wx4 wx4Var3 = n74Var.g0;
                if (zBooleanValue) {
                    return dt4.b;
                }
                List list = (List) hi5.e0(n74Var.i0, nw3VarArr[0]);
                ArrayList arrayList2 = new ArrayList(xv0.Z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((tf5) it.next()).K());
                }
                return dh3.o("package view scope for " + fk2Var2 + " in " + wx4Var3.getName(), wv0.I0(arrayList2, new zp7(wx4Var3, fk2Var2)));
        }
    }
}
