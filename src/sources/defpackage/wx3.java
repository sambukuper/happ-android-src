package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wx3 {
    public static final wx3 g = new wx3(127);
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final Boolean e;
    public final ge4 f;

    public wx3(int i) {
        this(-1, null, (i & 4) != 0 ? 0 : 3, -1, null, null);
    }

    public final int a() {
        int i = this.d;
        l73 l73Var = new l73(i);
        if (i == -1) {
            l73Var = null;
        }
        if (l73Var != null) {
            return l73Var.a;
        }
        return 1;
    }

    public final boolean b() {
        return this.a == -1 && this.b == null && this.c == 0 && this.d == -1 && this.e == null && this.f == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx3)) {
            return false;
        }
        wx3 wx3Var = (wx3) obj;
        return this.a == wx3Var.a && dh3.f(this.b, wx3Var.b) && this.c == wx3Var.c && this.d == wx3Var.d && dh3.f(this.e, wx3Var.e) && dh3.f(this.f, wx3Var.f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        int iE = oi0.e(this.d, oi0.e(this.c, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.e;
        int iHashCode2 = (iE + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        ge4 ge4Var = this.f;
        return iHashCode2 + (ge4Var != null ? ge4Var.X.hashCode() : 0);
    }

    public final String toString() {
        String strA = vx3.a(this.a);
        String strA2 = xx3.a(this.c);
        String strA3 = l73.a(this.d);
        StringBuilder sb = new StringBuilder("KeyboardOptions(capitalization=");
        sb.append(strA);
        sb.append(", autoCorrectEnabled=");
        sb.append(this.b);
        sb.append(", keyboardType=");
        oi0.y(sb, strA2, ", imeAction=", strA3, ", platformImeOptions=nullshowKeyboardOnFocus=");
        sb.append(this.e);
        sb.append(", hintLocales=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public wx3(int i, Boolean bool, int i2, int i3, Boolean bool2, ge4 ge4Var) {
        this.a = i;
        this.b = bool;
        this.c = i2;
        this.d = i3;
        this.e = bool2;
        this.f = ge4Var;
    }
}
