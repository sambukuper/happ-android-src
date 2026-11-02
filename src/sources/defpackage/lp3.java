package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lp3 implements ow3 {
    public static final lp3 a = new lp3();
    public static final bu5 b = km4.h("kotlinx.serialization.json.JsonLiteral");

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        Double dValueOf;
        kp3 kp3Var = (kp3) obj;
        kp3Var.getClass();
        String str = kp3Var.Y;
        yn0.q(ol7Var);
        if (kp3Var.X) {
            ol7Var.t(str);
            return;
        }
        Long lC0 = mm7.c0(str);
        if (lC0 != null) {
            ol7Var.m(lC0.longValue());
            return;
        }
        tk8 tk8VarF = p38.f(str);
        if (tk8VarF != null) {
            ol7Var.i(xk8.b).m(tk8VarF.X);
            return;
        }
        Boolean bool = null;
        try {
            dValueOf = lm7.P(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        } catch (NumberFormatException unused) {
        }
        if (dValueOf != null) {
            ol7Var.f(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            ol7Var.b(bool.booleanValue());
        } else {
            ol7Var.t(str);
        }
    }

    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        tn3 tn3VarP = yn0.p(rd1Var);
        ao3 ao3VarI = tn3VarP.i();
        if (ao3VarI instanceof kp3) {
            return (kp3) ao3VarI;
        }
        throw new vn3(ys0.t(-1, oi0.j(yb6.a, ao3VarI.getClass(), new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ")), null, null, tn3VarP.y().a.h ? ys0.J(ao3VarI.toString(), -1).toString() : null));
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return b;
    }
}
