package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ty7 {
    public static final nz4 a;

    static {
        u32 u32Var = u32.a;
        h02 h02Var = new h02(u32.b, ug7.f, (byte) 0);
        v15 v15VarG = ug7.g.a.g();
        me4 me4Var = ve4.e;
        nz4 nz4Var = new nz4(h02Var, v15VarG, me4Var);
        nz4Var.j0 = fx4.g0;
        fl1 fl1Var = gl1.e;
        if (fl1Var == null) {
            nz4.z0(9);
            throw null;
        }
        nz4Var.k0 = fl1Var;
        List listK = i21.K(ii8.K0(nz4Var, rt8.IN_VARIANCE, v15.e("T"), 0, me4Var));
        if (nz4Var.m0 != null) {
            bt.p(nz4Var.getName(), "Type parameters are already set for ");
            return;
        }
        ArrayList arrayList = new ArrayList(listK);
        nz4Var.m0 = arrayList;
        nz4Var.l0 = new ft0(nz4Var, arrayList, nz4Var.n0, nz4Var.o0);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            nz4.z0(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((gs0) ((ho2) it.next())).k0 = nz4Var.X();
        }
        a = nz4Var;
    }
}
