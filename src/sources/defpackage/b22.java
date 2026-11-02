package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b22 {
    public static final ug8 a = new ug8(ti.k0, ti.l0);
    public static final wf7 b = wl7.V(0.0f, 400.0f, null, 5);
    public static final wf7 c = wl7.V(0.0f, 400.0f, null, 5);
    public static final wf7 d;
    public static final wf7 e;

    static {
        Map map = iz8.a;
        d = wl7.V(0.0f, 400.0f, new hf3(4294967297L), 1);
        e = wl7.V(0.0f, 400.0f, new pf3(4294967297L), 1);
    }

    public static final void a(ce8 ce8Var, dn2 dn2Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(-1186853286);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(ce8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(dn2Var) ? 32 : 16;
        }
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            rh5 rh5Var = ce8Var.e;
            rh5 rh5Var2 = ce8Var.d;
            boolean z = rh5Var.getValue() != null;
            if (dh3.f(ce8Var.c(), rh5Var2.getValue()) && !z) {
                dn2Var.invoke();
            }
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            Object obj = objK;
            if (objK == beVar) {
                boolean[] zArr = {z};
                lp2Var.g0(zArr);
                obj = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj;
            Object objK2 = lp2Var.K();
            if (objK2 == beVar) {
                objK2 = new Object[1];
                lp2Var.g0(objK2);
            }
            Object[] objArr = (Object[]) objK2;
            if (!dh3.f(objArr[0], rh5Var2.getValue())) {
                if (!z && !zArr2[0]) {
                    dn2Var.invoke();
                }
                objArr[0] = rh5Var2.getValue();
            }
            zArr2[0] = z;
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new u12(ce8Var, dn2Var, i);
        }
    }

    public static final g22 b(wf7 wf7Var, q8 q8Var, gn2 gn2Var) {
        return new g22(new be8((u72) null, (eb7) null, new fp0(q8Var, gn2Var, wf7Var, true), (qw6) null, (LinkedHashMap) null, 123));
    }

    public static g22 c(sg8 sg8Var, int i) {
        ta2 ta2VarV = sg8Var;
        if ((i & 1) != 0) {
            ta2VarV = wl7.V(0.0f, 400.0f, null, 5);
        }
        return new g22(new be8(new u72(0.0f, ta2VarV), (eb7) null, (fp0) null, (qw6) null, (LinkedHashMap) null, WebSocketProtocol.PAYLOAD_SHORT));
    }

    public static h62 d(sg8 sg8Var, int i) {
        ta2 ta2VarV = sg8Var;
        if ((i & 1) != 0) {
            ta2VarV = wl7.V(0.0f, 400.0f, null, 5);
        }
        return new h62(new be8(new u72(0.0f, ta2VarV), (eb7) null, (fp0) null, (qw6) null, (LinkedHashMap) null, WebSocketProtocol.PAYLOAD_SHORT));
    }

    public static final h62 e(wf7 wf7Var, q8 q8Var, gn2 gn2Var) {
        return new h62(new be8((u72) null, (eb7) null, new fp0(q8Var, gn2Var, wf7Var, true), (qw6) null, (LinkedHashMap) null, 123));
    }
}
