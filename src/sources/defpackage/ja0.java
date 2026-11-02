package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ja0 {
    public static final ja0 m = new ja0();
    public final r62 a;
    public final aq2 b;
    public final aq2 c;
    public final aq2 d;
    public final aq2 e;
    public final aq2 f;
    public final aq2 g;
    public final aq2 h;
    public final aq2 i;
    public final aq2 j;
    public final aq2 k;
    public final aq2 l;

    public ja0() {
        r62 r62VarH = hi5.H(ia0.X);
        pa0.a.getClass();
        aq2 aq2Var = pa0.c;
        aq2Var.getClass();
        aq2 aq2Var2 = pa0.b;
        aq2Var2.getClass();
        aq2 aq2Var3 = pa0.d;
        aq2Var3.getClass();
        aq2 aq2Var4 = pa0.e;
        aq2Var4.getClass();
        aq2 aq2Var5 = pa0.f;
        aq2Var5.getClass();
        aq2 aq2Var6 = pa0.g;
        aq2Var6.getClass();
        aq2 aq2Var7 = pa0.i;
        aq2Var7.getClass();
        aq2 aq2Var8 = pa0.h;
        aq2Var8.getClass();
        aq2 aq2Var9 = pa0.j;
        aq2Var9.getClass();
        aq2 aq2Var10 = pa0.k;
        aq2Var10.getClass();
        aq2 aq2Var11 = pa0.l;
        aq2Var11.getClass();
        this.a = r62VarH;
        this.b = aq2Var;
        this.c = aq2Var2;
        this.d = aq2Var3;
        this.e = aq2Var4;
        this.f = aq2Var5;
        this.g = aq2Var6;
        this.h = aq2Var7;
        this.i = aq2Var8;
        this.j = aq2Var9;
        this.k = aq2Var10;
        this.l = aq2Var11;
    }

    public static String a(fk2 fk2Var) {
        String strB;
        fk2Var.getClass();
        gk2 gk2Var = fk2Var.a;
        StringBuilder sb = new StringBuilder(mm7.X(gk2Var.a, '.', '/'));
        sb.append('/');
        if (gk2Var.c()) {
            strB = "default-package";
        } else {
            strB = gk2Var.g().b();
            strB.getClass();
        }
        sb.append(strB.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
