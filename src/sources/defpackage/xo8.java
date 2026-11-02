package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xo8 implements dq2 {
    public static final xo8 a;
    private static final e37 descriptor;

    static {
        xo8 xo8Var = new xo8();
        a = xo8Var;
        zp5 zp5Var = new zp5("su.happ.proxyutility.domain.app_update.entity.UpdateParams", xo8Var, 6);
        zp5Var.k("fileNum", false);
        zp5Var.k("version", false);
        zp5Var.k("link", false);
        zp5Var.k("versions", false);
        zp5Var.k("details", false);
        zp5Var.k("size", false);
        descriptor = zp5Var;
    }

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        zo8 zo8Var = (zo8) obj;
        zo8Var.getClass();
        e37 e37Var = descriptor;
        ol7 ol7VarA = ol7Var.a(e37Var);
        ol7VarA.l(0, zo8Var.X, e37Var);
        ol7VarA.u(e37Var, 1, zo8Var.Y);
        ol7VarA.u(e37Var, 2, zo8Var.Z);
        ol7VarA.q(e37Var, 3, wp8.a, zo8Var.f0);
        ol7VarA.u(e37Var, 4, zo8Var.g0);
        ol7VarA.p(e37Var, 5, yl7.a, zo8Var.h0);
        ol7VarA.v(e37Var);
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        e37 e37Var = descriptor;
        f01 f01VarT = rd1Var.t(e37Var);
        int i = 0;
        int iR = 0;
        String strK = null;
        String strK2 = null;
        yp8 yp8Var = null;
        String strK3 = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iE = f01VarT.e(e37Var);
            switch (iE) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iR = f01VarT.r(e37Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strK = f01VarT.k(e37Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strK2 = f01VarT.k(e37Var, 2);
                    i |= 4;
                    break;
                case 3:
                    yp8Var = (yp8) f01VarT.q(e37Var, 3, wp8.a, yp8Var);
                    i |= 8;
                    break;
                case 4:
                    strK3 = f01VarT.k(e37Var, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) f01VarT.x(e37Var, 5, yl7.a, str);
                    i |= 32;
                    break;
                default:
                    throw new fn8(iE);
            }
        }
        f01VarT.n(e37Var);
        return new zo8(i, iR, strK, strK2, yp8Var, strK3, str);
    }

    @Override // defpackage.dq2
    public final ow3[] c() {
        yl7 yl7Var = yl7.a;
        return new ow3[]{nf3.a, yl7Var, yl7Var, wp8.a, yl7Var, zc1.Q(yl7Var)};
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return descriptor;
    }
}
