package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class co3 {
    public static final sc3 a = g33.c(yl7.a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final hq3 a(ao3 ao3Var) {
        hq3 hq3Var = ao3Var instanceof hq3 ? (hq3) ao3Var : null;
        if (hq3Var != null) {
            return hq3Var;
        }
        u52.m("Element ", yb6.a.b(ao3Var.getClass()), " is not a JsonPrimitive");
        return null;
    }

    public static final long b(hq3 hq3Var) {
        d7 d7VarF = z68.f(vm3.d, hq3Var.a());
        String str = (String) d7VarF.g;
        long j = d7VarF.j();
        if (d7VarF.g() == 10) {
            return j;
        }
        int i = d7VarF.b;
        int i2 = i > 0 ? i - 1 : i;
        d7.s(d7VarF, pc6.p("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }
}
