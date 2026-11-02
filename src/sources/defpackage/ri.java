package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ri {
    public static final wf7 a = wl7.V(0.0f, 0.0f, null, 7);

    static {
        Map map = iz8.a;
        wl7.V(0.0f, 0.0f, new kt1(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final lh7 a(float f, wf7 wf7Var, lp2 lp2Var) {
        return c(new kt1(f), ys0.l0, wf7Var, null, "DpAnimation", lp2Var, 0, 8);
    }

    public static final lh7 b(float f, wf7 wf7Var, String str, lp2 lp2Var, int i, int i2) {
        int i3 = i2 & 2;
        wf7 wf7Var2 = a;
        if (i3 != 0) {
            wf7Var = wf7Var2;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (wf7Var == wf7Var2) {
            lp2Var.W(1144115775);
            boolean zC = lp2Var.c(0.01f);
            Object objK = lp2Var.K();
            if (zC || objK == zz0.a) {
                objK = wl7.V(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                lp2Var.g0(objK);
            }
            wf7Var = (wf7) objK;
            lp2Var.p(false);
        } else {
            lp2Var.W(1144225701);
            lp2Var.p(false);
        }
        return c(Float.valueOf(f), ys0.j0, wf7Var, null, str2, lp2Var, (i << 3) & 57344, 0);
    }

    public static final lh7 c(Object obj, ug8 ug8Var, pk pkVar, Float f, String str, lp2 lp2Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object objK = lp2Var.K();
        Object obj2 = zz0.a;
        if (objK == obj2) {
            objK = z51.H(null);
            lp2Var.g0(objK);
        }
        y05 y05Var = (y05) objK;
        Object objK2 = lp2Var.K();
        if (objK2 == obj2) {
            objK2 = new oi(obj, ug8Var, f);
            lp2Var.g0(objK2);
        }
        oi oiVar = (oi) objK2;
        Object objP = z51.P(null, lp2Var);
        if (f != null && (pkVar instanceof wf7)) {
            wf7 wf7Var = (wf7) pkVar;
            if (!dh3.f(wf7Var.c, f)) {
                pkVar = new wf7(wf7Var.a, wf7Var.b, f);
            }
        }
        Object objP2 = z51.P(pkVar, lp2Var);
        Object objK3 = lp2Var.K();
        if (objK3 == obj2) {
            objK3 = gv3.b(-1, null, null, 6);
            lp2Var.g0(objK3);
        }
        Object obj3 = (jp0) objK3;
        boolean zH = lp2Var.h(obj3) | lp2Var.h(obj);
        Object objK4 = lp2Var.K();
        if (zH || objK4 == obj2) {
            objK4 = new p5(obj3, obj, (byte) 4);
            lp2Var.g0(objK4);
        }
        u70.q((dn2) objK4, lp2Var);
        boolean zH2 = lp2Var.h(obj3) | lp2Var.h(oiVar) | lp2Var.f(objP2) | lp2Var.f(objP);
        Object objK5 = lp2Var.K();
        if (zH2 || objK5 == obj2) {
            Object qiVar = new qi(obj3, (Object) oiVar, objP2, objP, (q51) null, (byte) 0);
            lp2Var.g0(qiVar);
            objK5 = qiVar;
        }
        u70.h((rn2) objK5, lp2Var, obj3);
        lh7 lh7Var = (lh7) y05Var.getValue();
        return lh7Var == null ? oiVar.c : lh7Var;
    }
}
