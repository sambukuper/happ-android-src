package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g22 {
    public static final g22 b = new g22(new be8((u72) null, (eb7) null, (fp0) null, (qw6) null, (LinkedHashMap) null, 127));
    public final be8 a;

    public g22(be8 be8Var) {
        this.a = be8Var;
    }

    public final g22 a(g22 g22Var) {
        be8 be8Var = g22Var.a;
        u72 u72Var = be8Var.a;
        be8 be8Var2 = this.a;
        if (u72Var == null) {
            u72Var = be8Var2.a;
        }
        eb7 eb7Var = be8Var.b;
        if (eb7Var == null) {
            eb7Var = be8Var2.b;
        }
        fp0 fp0Var = be8Var.c;
        if (fp0Var == null) {
            fp0Var = be8Var2.c;
        }
        qw6 qw6Var = be8Var.d;
        if (qw6Var == null) {
            qw6Var = be8Var2.d;
        }
        return new g22(new be8(u72Var, eb7Var, fp0Var, qw6Var, zp4.L(be8Var2.f, be8Var.f), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g22) && ((g22) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "EnterTransition.None";
        }
        be8 be8Var = this.a;
        u72 u72Var = be8Var.a;
        String string = u72Var != null ? u72Var.toString() : null;
        eb7 eb7Var = be8Var.b;
        String string2 = eb7Var != null ? eb7Var.toString() : null;
        fp0 fp0Var = be8Var.c;
        String string3 = fp0Var != null ? fp0Var.toString() : null;
        qw6 qw6Var = be8Var.d;
        return oi0.q(oi0.t("EnterTransition: Fade - ", string, ", Slide - ", string2, ", Shrink - "), string3, ", Scale - ", qw6Var != null ? qw6Var.toString() : null, ", Veil - null");
    }
}
