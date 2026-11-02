package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sp8 implements dq2 {
    public static final sp8 a;
    private static final e37 descriptor;

    static {
        sp8 sp8Var = new sp8();
        a = sp8Var;
        zp5 zp5Var = new zp5("su.happ.proxyutility.data.app_update.dto.UpdateType", sp8Var, 3);
        zp5Var.k("beta", false);
        zp5Var.k("stable", false);
        zp5Var.k("block", false);
        descriptor = zp5Var;
    }

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        up8 up8Var = (up8) obj;
        up8Var.getClass();
        e37 e37Var = descriptor;
        ol7 ol7VarA = ol7Var.a(e37Var);
        g44[] g44VarArr = up8.d;
        to8 to8Var = to8.a;
        ol7VarA.p(e37Var, 0, to8Var, up8Var.a);
        ol7VarA.q(e37Var, 1, to8Var, up8Var.b);
        ol7VarA.q(e37Var, 2, (ow3) g44VarArr[2].getValue(), up8Var.c);
        ol7VarA.v(e37Var);
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        e37 e37Var = descriptor;
        f01 f01VarT = rd1Var.t(e37Var);
        g44[] g44VarArr = up8.d;
        vo8 vo8Var = null;
        boolean z = true;
        int i = 0;
        vo8 vo8Var2 = null;
        List list = null;
        while (z) {
            int iE = f01VarT.e(e37Var);
            if (iE == -1) {
                z = false;
            } else if (iE == 0) {
                vo8Var = (vo8) f01VarT.x(e37Var, 0, to8.a, vo8Var);
                i |= 1;
            } else if (iE == 1) {
                vo8Var2 = (vo8) f01VarT.q(e37Var, 1, to8.a, vo8Var2);
                i |= 2;
            } else {
                if (iE != 2) {
                    throw new fn8(iE);
                }
                list = (List) f01VarT.q(e37Var, 2, (ow3) g44VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        f01VarT.n(e37Var);
        return new up8(i, vo8Var, vo8Var2, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dq2
    public final ow3[] c() {
        g44[] g44VarArr = up8.d;
        to8 to8Var = to8.a;
        return new ow3[]{zc1.Q(to8Var), to8Var, g44VarArr[2].getValue()};
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return descriptor;
    }
}
