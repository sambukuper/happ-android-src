package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g54 extends w45 {
    public final /* synthetic */ sx4 o;
    public final /* synthetic */ Set p;
    public final /* synthetic */ gn2 q;

    public g54(sx4 sx4Var, Set set, gn2 gn2Var) {
        this.o = sx4Var;
        this.p = set;
        this.q = gn2Var;
    }

    @Override // defpackage.w45
    public final boolean j(Object obj) {
        sx4 sx4Var = (sx4) obj;
        sx4Var.getClass();
        if (sx4Var == this.o) {
            return true;
        }
        et4 et4VarO0 = sx4Var.o0();
        et4VarO0.getClass();
        if (!(et4VarO0 instanceof i54)) {
            return true;
        }
        this.p.addAll((Collection) this.q.B(et4VarO0));
        return false;
    }
}
