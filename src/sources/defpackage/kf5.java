package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kf5 {
    public static final z01 a = new z01(new dx4((byte) 9));

    public static final td a(lp2 lp2Var) {
        lp2Var.W(282942128);
        ud udVar = (ud) lp2Var.j(a);
        if (udVar == null) {
            lp2Var.p(false);
            return null;
        }
        boolean zF = lp2Var.f(udVar);
        Object objK = lp2Var.K();
        if (zF || objK == zz0.a) {
            Object tdVar = new td(udVar.a, udVar.b, udVar.c, udVar.d);
            lp2Var.g0(tdVar);
            objK = tdVar;
        }
        td tdVar2 = (td) objK;
        lp2Var.p(false);
        return tdVar2;
    }
}
