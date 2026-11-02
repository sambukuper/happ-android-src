package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vm3 {
    public static final um3 d = new um3(new mn3(false, false, true, "    ", "type", true, ps0.Z, true), v37.a);
    public final mn3 a;
    public final g55 b;
    public final yr2 c = new yr2((byte) 25);

    public vm3(mn3 mn3Var, g55 g55Var) {
        this.a = mn3Var;
        this.b = g55Var;
    }

    public final Object a(ow3 ow3Var, String str) {
        ow3Var.getClass();
        str.getClass();
        d7 d7VarF = z68.f(this, str);
        Object objA = new nl7(this, q59.OBJ, d7VarF, ow3Var.d(), null).a(ow3Var);
        if (d7VarF.g() == 10) {
            return objA;
        }
        d7.s(d7VarF, "Expected EOF after parsing, but had " + ((String) d7VarF.g).charAt(d7VarF.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(ow3 ow3Var, Object obj) {
        char[] cArr;
        ow3Var.getClass();
        b8 b8Var = new b8((byte) 7);
        xp0 xp0Var = xp0.c;
        synchronized (xp0Var) {
            kt ktVar = xp0Var.a;
            cArr = null;
            char[] cArr2 = (char[]) (ktVar.isEmpty() ? null : ktVar.removeLast());
            if (cArr2 != null) {
                xp0Var.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        b8Var.c = cArr;
        try {
            new ol7(new h70(b8Var), this, q59.OBJ, new ol7[q59.j0.a()]).r(ow3Var, obj);
            return b8Var.toString();
        } finally {
            b8Var.k();
        }
    }
}
