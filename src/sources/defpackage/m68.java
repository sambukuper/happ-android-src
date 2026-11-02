package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m68 implements ze2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ r68 Y;

    public /* synthetic */ m68(r68 r68Var, byte b) {
        this.X = b;
        this.Y = r68Var;
    }

    @Override // defpackage.ze2
    public final Object l(Object obj, q51 q51Var) {
        og7 og7Var;
        q38 q38Var;
        byte b = this.X;
        r68 r68Var = this.Y;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                r68Var.x(false);
                r68Var.y(s88.X);
                break;
            default:
                if (((s86) obj) == null) {
                    r68Var.r();
                } else {
                    ub8 ub8Var = r68Var.d;
                    if (ub8Var.b == tb8.X) {
                        zc3.c("ToolbarRequester is not initialized.");
                    }
                    w38 w38Var = ub8Var.a;
                    if (w38Var != null && w38Var.p0 && (((og7Var = w38Var.w0) == null || !og7Var.k()) && (q38Var = (q38) hi5.W(w38Var, r38.b)) != null)) {
                        w38Var.w0 = w51.G(w38Var.M0(), null, e71.f0, new bv(w38Var, q38Var, null, (byte) 11), 1);
                    }
                }
                break;
        }
        return dn8Var;
    }
}
