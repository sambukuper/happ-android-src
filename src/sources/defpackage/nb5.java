package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nb5 extends ld2 {
    public static final nb5 d = new nb5(0, 2, 1);

    @Override // defpackage.ld2
    public final void d(xr0 xr0Var, rs rsVar, bc7 bc7Var, p91 p91Var, vc5 vc5Var) {
        mf3 mf3Var = (mf3) xr0Var.i(1);
        int i = mf3Var != null ? mf3Var.a : 0;
        ep0 ep0Var = (ep0) xr0Var.i(0);
        if (i > 0) {
            rsVar = new cb0(rsVar, i);
        }
        ep0Var.v0(rsVar, bc7Var, p91Var, vc5Var != null ? new zz2(vc5Var, bc7Var, (byte) 19) : null);
    }
}
