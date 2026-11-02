package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class to8 implements dq2 {
    public static final to8 a;
    private static final e37 descriptor;

    static {
        to8 to8Var = new to8();
        a = to8Var;
        zp5 zp5Var = new zp5("su.happ.proxyutility.data.app_update.dto.UpdateInfo", to8Var, 5);
        zp5Var.k("version", false);
        zp5Var.k("details", false);
        zp5Var.k("link", false);
        zp5Var.k("update", false);
        zp5Var.k("size", true);
        descriptor = zp5Var;
    }

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        vo8 vo8Var = (vo8) obj;
        vo8Var.getClass();
        e37 e37Var = descriptor;
        ol7 ol7VarA = ol7Var.a(e37Var);
        String str = vo8Var.a;
        String str2 = vo8Var.e;
        ol7VarA.u(e37Var, 0, str);
        ol7VarA.u(e37Var, 1, vo8Var.b);
        ol7VarA.u(e37Var, 2, vo8Var.c);
        ol7VarA.q(e37Var, 3, wp8.a, vo8Var.d);
        if (ol7VarA.w(e37Var) || str2 != null) {
            ol7VarA.p(e37Var, 4, yl7.a, str2);
        }
        ol7VarA.v(e37Var);
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        e37 e37Var = descriptor;
        f01 f01VarT = rd1Var.t(e37Var);
        int i = 0;
        yp8 yp8Var = null;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        String str = null;
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
                yp8Var = (yp8) f01VarT.q(e37Var, 3, wp8.a, yp8Var);
                i |= 8;
            } else {
                if (iE != 4) {
                    throw new fn8(iE);
                }
                str = (String) f01VarT.x(e37Var, 4, yl7.a, str);
                i |= 16;
            }
        }
        f01VarT.n(e37Var);
        return new vo8(i, yp8Var, strK, strK2, strK3, str);
    }

    @Override // defpackage.dq2
    public final ow3[] c() {
        yl7 yl7Var = yl7.a;
        return new ow3[]{yl7Var, yl7Var, yl7Var, wp8.a, zc1.Q(yl7Var)};
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return descriptor;
    }
}
