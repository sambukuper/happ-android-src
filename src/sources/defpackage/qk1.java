package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qk1 implements dn2 {
    public final /* synthetic */ byte X;
    public final rk1 Y;

    public /* synthetic */ qk1(rk1 rk1Var, byte b) {
        this.X = b;
        this.Y = rk1Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        rk1 rk1Var = this.Y;
        switch (b) {
            case 0:
                List<hi8> listK0 = rk1Var.Y.k0();
                listK0.getClass();
                ArrayList arrayList = new ArrayList(xv0.Z(listK0, 10));
                for (hi8 hi8Var : listK0) {
                    hi8Var.getClass();
                    arrayList.add(new rw3(rk1Var, hi8Var));
                }
                return arrayList;
            default:
                Collection collectionC = rk1Var.Y.l().c();
                collectionC.getClass();
                Collection collection = collectionC;
                ArrayList arrayList2 = new ArrayList(xv0.Z(collection, 10));
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new kk1((t14) it.next(), 0));
                }
                return arrayList2;
        }
    }
}
