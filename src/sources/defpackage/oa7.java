package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oa7 {
    public static final wf7 a = wl7.V(0.0f, 0.0f, null, 7);

    public static final lh7 a(long j, wf7 wf7Var, String str, lp2 lp2Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            wf7Var = a;
        }
        wf7 wf7Var2 = wf7Var;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean zF = lp2Var.f(dw0.e(j));
        Object objK = lp2Var.K();
        if (zF || objK == zz0.a) {
            ug8 ug8Var = new ug8(ti.i0, new wi(dw0.e(j), (byte) 2));
            lp2Var.g0(ug8Var);
            objK = ug8Var;
        }
        return ri.c(new dw0(j), (ug8) objK, wf7Var2, null, str2, lp2Var, (i << 6) & 57344, 8);
    }
}
