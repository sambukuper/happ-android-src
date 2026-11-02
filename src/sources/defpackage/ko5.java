package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ko5 implements ki5 {
    public final String a;

    public ko5(String str) {
        str.getClass();
        this.a = str;
        if (str.length() <= 0) {
            bt.q("Empty string is not allowed");
            throw null;
        }
        if (du7.d(str.charAt(0))) {
            em7.c(pc6.p("String '", str, "' starts with a digit"));
            throw null;
        }
        if (du7.d(str.charAt(str.length() - 1))) {
            em7.c(pc6.p("String '", str, "' ends with a digit"));
            throw null;
        }
    }

    @Override // defpackage.ki5
    public final Object a(h61 h61Var, final String str, final int i) {
        String str2 = this.a;
        if (str2.length() + i > str.length()) {
            return new fi5(i, new tb2(this, (byte) 29));
        }
        int length = str2.length();
        for (final int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i + i2) != str2.charAt(i2)) {
                return new fi5(i, new dn2() { // from class: jo5
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        StringBuilder sb = new StringBuilder("Expected ");
                        sb.append(this.X.a);
                        sb.append(" but got ");
                        int i3 = i;
                        sb.append(str.subSequence(i3, i2 + i3 + 1).toString());
                        return sb.toString();
                    }
                });
            }
        }
        return Integer.valueOf(str2.length() + i);
    }

    public final String toString() {
        return oi0.o(new StringBuilder("'"), this.a, '\'');
    }
}
