package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wb5 extends ld2 {
    public static final wb5 d = new wb5(0, 1, 1);

    @Override // defpackage.ld2
    public final void d(xr0 xr0Var, rs rsVar, bc7 bc7Var, p91 p91Var, vc5 vc5Var) {
        c15 c15Var;
        j86 j86Var = (j86) xr0Var.i(0);
        s05 s05Var = (s05) p91Var.i;
        if (s05Var == null || ((nj5) s05Var.g(j86Var)) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) p91Var.j;
        if (arrayList != null && (c15Var = (c15) arrayList.remove(arrayList.size() - 1)) != null) {
            p91Var.e = c15Var;
        }
        s05Var.j(j86Var);
    }
}
