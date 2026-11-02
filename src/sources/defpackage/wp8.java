package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wp8 implements dq2 {
    public static final wp8 a;
    private static final e37 descriptor;

    static {
        wp8 wp8Var = new wp8();
        a = wp8Var;
        zp5 zp5Var = new zp5("su.happ.proxyutility.data.app_update.dto.UpdateVersions", wp8Var, 5);
        zp5Var.k("warnonce", false);
        zp5Var.k("warnweek", false);
        zp5Var.k("warnalways", false);
        zp5Var.k("nowarn", false);
        zp5Var.k("updateonly", false);
        descriptor = zp5Var;
    }

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        yp8 yp8Var = (yp8) obj;
        yp8Var.getClass();
        e37 e37Var = descriptor;
        ol7 ol7VarA = ol7Var.a(e37Var);
        ol7VarA.u(e37Var, 0, yp8Var.X);
        ol7VarA.u(e37Var, 1, yp8Var.Y);
        ol7VarA.u(e37Var, 2, yp8Var.Z);
        ol7VarA.u(e37Var, 3, yp8Var.f0);
        ol7VarA.u(e37Var, 4, yp8Var.g0);
        ol7VarA.v(e37Var);
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        e37 e37Var = descriptor;
        f01 f01VarT = rd1Var.t(e37Var);
        int i = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        String strK4 = null;
        String strK5 = null;
        boolean z = true;
        while (z) {
            int iE = f01VarT.e(e37Var);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                strK = f01VarT.k(e37Var, 0);
                i |= 1;
            } else if (iE == 1) {
                strK2 = f01VarT.k(e37Var, 1);
                i |= 2;
            } else if (iE == 2) {
                strK3 = f01VarT.k(e37Var, 2);
                i |= 4;
            } else if (iE == 3) {
                strK4 = f01VarT.k(e37Var, 3);
                i |= 8;
            } else {
                if (iE != 4) {
                    throw new fn8(iE);
                }
                strK5 = f01VarT.k(e37Var, 4);
                i |= 16;
            }
        }
        f01VarT.n(e37Var);
        return new yp8(i, strK, strK2, strK3, strK4, strK5);
    }

    @Override // defpackage.dq2
    public final ow3[] c() {
        yl7 yl7Var = yl7.a;
        return new ow3[]{yl7Var, yl7Var, yl7Var, yl7Var, yl7Var};
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return descriptor;
    }
}
