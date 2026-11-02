package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class xk5 extends uy7 implements tn2 {
    public /* synthetic */ j2 g0;
    public /* synthetic */ String h0;
    public /* synthetic */ boolean i0;
    public final /* synthetic */ cl5 j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk5(cl5 cl5Var, q51 q51Var) {
        super(4, q51Var);
        this.j0 = cl5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object F(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        xk5 xk5Var = new xk5(this.j0, (q51) obj4);
        xk5Var.g0 = (j2) obj;
        xk5Var.h0 = (String) obj2;
        xk5Var.i0 = zBooleanValue;
        return xk5Var.q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        j2 j2Var = this.g0;
        String str = this.h0;
        boolean z = this.i0;
        w39.n0(obj);
        String lowerCase = fm7.R0(str).toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        la2 la2Var = new la2(new la2(wv0.l0(j2Var), true, new as((byte) 1, z)), true, new m40(lowerCase, (byte) 16));
        tx0 tx0Var = this.j0.e;
        tx0Var.getClass();
        ec7 ec7Var = ec7.Y;
        ec7Var.getClass();
        qm5 qm5VarC = ec7Var.c();
        ArrayList arrayList = new ArrayList();
        ka2 it = la2Var.iterator();
        while (true) {
            ka2 ka2Var = it;
            if (!ka2Var.hasNext()) {
                break;
            }
            arrayList.add(ka2Var.next());
        }
        aw0.c0(arrayList, tx0Var);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            qm5VarC.add(it2.next());
        }
        return qm5VarC.c();
    }
}
