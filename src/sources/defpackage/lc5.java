package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lc5 extends ld2 {
    public static final lc5 d = new lc5(0, 1, 1);

    @Override // defpackage.ld2
    public final void d(xr0 xr0Var, rs rsVar, bc7 bc7Var, p91 p91Var, vc5 vc5Var) {
        j86 j86Var = (j86) xr0Var.i(0);
        s05 s05Var = (s05) p91Var.i;
        nj5 nj5Var = s05Var != null ? (nj5) s05Var.g(j86Var) : null;
        if (nj5Var != null) {
            ArrayList arrayList = (ArrayList) p91Var.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                p91Var.j = arrayList;
            }
            arrayList.add((c15) p91Var.e);
            p91Var.e = nj5Var.Y;
        }
    }
}
