package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ap8 implements dq2 {
    public static final ap8 a;
    private static final e37 descriptor;

    static {
        ap8 ap8Var = new ap8();
        a = ap8Var;
        zp5 zp5Var = new zp5("su.happ.proxyutility.data.app_update.dto.UpdateResponse", ap8Var, 3);
        zp5Var.k("app", false);
        zp5Var.k("filenum", false);
        zp5Var.k("apk", false);
        descriptor = zp5Var;
    }

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        cp8 cp8Var = (cp8) obj;
        cp8Var.getClass();
        e37 e37Var = descriptor;
        ol7 ol7VarA = ol7Var.a(e37Var);
        ol7VarA.u(e37Var, 0, cp8Var.a);
        ol7VarA.l(1, cp8Var.b, e37Var);
        ol7VarA.q(e37Var, 2, sp8.a, cp8Var.c);
        ol7VarA.v(e37Var);
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        e37 e37Var = descriptor;
        f01 f01VarT = rd1Var.t(e37Var);
        String strK = null;
        boolean z = true;
        int i = 0;
        int iR = 0;
        up8 up8Var = null;
        while (z) {
            int iE = f01VarT.e(e37Var);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                strK = f01VarT.k(e37Var, 0);
                i |= 1;
            } else if (iE == 1) {
                iR = f01VarT.r(e37Var, 1);
                i |= 2;
            } else {
                if (iE != 2) {
                    throw new fn8(iE);
                }
                up8Var = (up8) f01VarT.q(e37Var, 2, sp8.a, up8Var);
                i |= 4;
            }
        }
        f01VarT.n(e37Var);
        return new cp8(i, strK, iR, up8Var);
    }

    @Override // defpackage.dq2
    public final ow3[] c() {
        return new ow3[]{yl7.a, nf3.a, sp8.a};
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return descriptor;
    }
}
