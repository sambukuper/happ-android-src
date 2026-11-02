package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wx2 implements rn2 {
    public final /* synthetic */ byte X = 2;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;

    public /* synthetic */ wx2(int i, dn2 dn2Var, kx4 kx4Var, boolean z) {
        this.Y = z;
        this.Z = dn2Var;
        this.f0 = kx4Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        long j;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj3 = this.f0;
        Object obj4 = this.Z;
        boolean z = this.Y;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                u70.r((String) obj4, z, (kx4) obj3, (lp2) obj, w79.P(1));
                break;
            case 1:
                g73 g73Var = (g73) obj3;
                String str = (String) obj4;
                lp2 lp2Var = (lp2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    kx4 kx4VarG = b.g(hx4.X, 24.0f);
                    if (z) {
                        lp2Var.W(711918703);
                        j = ((dp) lp2Var.j(ep.z)).c.a;
                        lp2Var.p(false);
                    } else {
                        lp2Var.W(711920400);
                        j = ((dp) lp2Var.j(ep.z)).c.c;
                        lp2Var.p(false);
                    }
                    os4.a(g73Var, kx4VarG, str, j, lp2Var, 48, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ci8.c(w79.P(1), (dn2) obj4, (lp2) obj, (kx4) obj3, z);
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ wx2(String str, boolean z, kx4 kx4Var, int i) {
        this.Z = str;
        this.Y = z;
        this.f0 = kx4Var;
    }

    public /* synthetic */ wx2(boolean z, g73 g73Var, String str) {
        this.Y = z;
        this.f0 = g73Var;
        this.Z = str;
    }
}
