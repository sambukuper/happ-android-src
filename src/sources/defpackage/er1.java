package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class er1 extends uy7 implements rn2 {
    public boolean g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ List i0;
    public final /* synthetic */ String j0;
    public final /* synthetic */ short k0;
    public final /* synthetic */ LinkedHashMap l0;
    public final /* synthetic */ gn2 m0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: int */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public er1(List list, String str, int i, LinkedHashMap linkedHashMap, gn2 gn2Var, q51 q51Var) {
        super(2, q51Var);
        this.i0 = list;
        this.j0 = str;
        this.k0 = i;
        this.l0 = linkedHashMap;
        this.m0 = gn2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        er1 er1Var = new er1(this.i0, this.j0, this.k0, this.l0, this.m0, q51Var);
        er1Var.h0 = obj;
        return er1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        b71 b71Var = (b71) this.h0;
        boolean z = this.g0;
        if (z) {
            if (z) {
                w39.n0(obj);
                return obj;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        w39.n0(obj);
        List list = this.i0;
        ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                i21.X();
                throw null;
            }
            nf1 nf1Var = tp1.a;
            arrayList.add(w51.j(b71Var, ye1.Z, new dr1((String) obj2, this.j0, this.k0, this.l0, this.m0, null), 2));
            i = i2;
        }
        this.h0 = null;
        this.g0 = true;
        Object objG = jb5.g(arrayList, this);
        c71 c71Var = c71.X;
        return objG == c71Var ? c71Var : objG;
    }
}
