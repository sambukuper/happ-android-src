package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h62 {
    public static final h62 b = new h62(new be8((u72) null, (eb7) null, (fp0) null, (qw6) null, (LinkedHashMap) null, 127));
    public static final h62 c = new h62(new be8((u72) null, (eb7) null, (fp0) null, (qw6) null, (LinkedHashMap) null, 95));
    public final be8 a;

    public h62(be8 be8Var) {
        this.a = be8Var;
    }

    public final h62 a(h62 h62Var) {
        be8 be8Var = h62Var.a;
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
        return new h62(new be8(u72Var, eb7Var, fp0Var, qw6Var, be8Var.e || be8Var2.e, zp4.L(be8Var2.f, be8Var.f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h62) && ((h62) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        be8 be8Var = this.a;
        u72 u72Var = be8Var.a;
        String string = u72Var != null ? u72Var.toString() : null;
        eb7 eb7Var = be8Var.b;
        String string2 = eb7Var != null ? eb7Var.toString() : null;
        fp0 fp0Var = be8Var.c;
        String string3 = fp0Var != null ? fp0Var.toString() : null;
        qw6 qw6Var = be8Var.d;
        String string4 = qw6Var != null ? qw6Var.toString() : null;
        boolean z = be8Var.e;
        StringBuilder sbT = oi0.t("ExitTransition:  Fade - ", string, ",  Slide - ", string2, ",  Shrink - ");
        oi0.y(sbT, string3, ",  Scale - ", string4, ",  Veil - null,  KeepUntilTransitionsFinished - ");
        sbT.append(z);
        return sbT.toString();
    }
}
