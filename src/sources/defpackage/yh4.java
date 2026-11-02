package defpackage;

import androidx.compose.foundation.layout.b;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yh4 implements tn2 {
    public final /* synthetic */ List X;

    public yh4(List list) {
        this.X = list;
    }

    @Override // defpackage.tn2
    public final Object F(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        k44 k44Var = (k44) obj;
        int iIntValue = ((Number) obj2).intValue();
        lp2 lp2Var = (lp2) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (lp2Var.f(k44Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= lp2Var.d(iIntValue) ? 32 : 16;
        }
        if (lp2Var.N(i & 1, (i & 147) != 146)) {
            String str = (String) this.X.get(iIntValue);
            lp2Var.W(290740599);
            zc1.g(str, b.a, o88.a(((ds) lp2Var.j(es.a)).c, ((dp) lp2Var.j(ep.z)).c.a, 0L, null, null, 0L, eu7.g(20), null, 16646142), 0, 0, 0, 0, false, null, lp2Var, 12582960, 376);
            lp2Var.p(false);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}
