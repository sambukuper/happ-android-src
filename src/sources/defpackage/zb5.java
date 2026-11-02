package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zb5 extends ld2 {
    public static final zb5 e;
    public static final zb5 f;
    public static final zb5 g;
    public static final zb5 h;
    public final /* synthetic */ byte d;

    static {
        int i = 1;
        e = new zb5(i, 2, (byte) 0);
        int i2 = 1;
        f = new zb5(i2, i2, (byte) 1);
        g = new zb5(i, 2, (byte) 2);
        int i3 = 1;
        h = new zb5(i3, i3, (byte) 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zb5(int i, int i2, byte b) {
        super(i, i2, (byte) 3);
        this.d = b;
    }

    @Override // defpackage.ld2
    public final void d(xr0 xr0Var, rs rsVar, bc7 bc7Var, p91 p91Var, vc5 vc5Var) {
        switch (this.d) {
            case 0:
                Object objInvoke = ((dn2) xr0Var.i(0)).invoke();
                gp2 gp2Var = (gp2) xr0Var.i(1);
                int iH = xr0Var.h(0);
                gp2Var.getClass();
                bc7Var.T(bc7Var.c(gp2Var), objInvoke);
                rsVar.n(iH, objInvoke);
                rsVar.h(objInvoke);
                break;
            case 1:
                gp2 gp2Var2 = (gp2) xr0Var.i(0);
                int iH2 = xr0Var.h(0);
                rsVar.l();
                gp2Var2.getClass();
                rsVar.g(iH2, bc7Var.C(bc7Var.c(gp2Var2)));
                break;
            case 2:
                Object objI = xr0Var.i(0);
                gp2 gp2Var3 = (gp2) xr0Var.i(1);
                int iH3 = xr0Var.h(0);
                if (objI instanceof pp2) {
                    pp2 pp2Var = (pp2) objI;
                    ((c15) p91Var.e).b(pp2Var);
                    ((t05) p91Var.d).a(pp2Var);
                }
                Object objJ = bc7Var.J(bc7Var.c(gp2Var3), iH3, objI);
                if (objJ instanceof pp2) {
                    p91Var.f((pp2) objJ);
                } else if (objJ instanceof j86) {
                    ((j86) objJ).c();
                }
                break;
            default:
                Object objI2 = xr0Var.i(0);
                int iH4 = xr0Var.h(0);
                if (objI2 instanceof pp2) {
                    pp2 pp2Var2 = (pp2) objI2;
                    ((c15) p91Var.e).b(pp2Var2);
                    ((t05) p91Var.d).a(pp2Var2);
                }
                Object objJ2 = bc7Var.J(bc7Var.t, iH4, objI2);
                if (objJ2 instanceof pp2) {
                    p91Var.f((pp2) objJ2);
                } else if (objJ2 instanceof j86) {
                    ((j86) objJ2).c();
                }
                break;
        }
    }

    @Override // defpackage.ld2
    public gp2 i(xr0 xr0Var) {
        switch (this.d) {
            case 0:
                return (gp2) xr0Var.i(1);
            case 1:
                return (gp2) xr0Var.i(0);
            default:
                return super.i(xr0Var);
        }
    }
}
