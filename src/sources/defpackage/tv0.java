package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tv0 extends a1 {
    public final ow3 a;

    public tv0(ow3 ow3Var) {
        this.a = ow3Var;
    }

    @Override // defpackage.ow3
    public void a(ol7 ol7Var, Object obj) {
        int iH = h(obj);
        e37 e37VarD = d();
        e37VarD.getClass();
        ol7 ol7VarA = ol7Var.a(e37VarD);
        Iterator itG = g(obj);
        for (int i = 0; i < iH; i++) {
            ol7VarA.q(d(), i, this.a, itG.next());
        }
        ol7VarA.v(e37VarD);
    }

    @Override // defpackage.a1
    public void j(f01 f01Var, int i, Object obj) {
        m(i, obj, f01Var.q(d(), i, this.a, null));
    }

    public void m(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
