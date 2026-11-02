package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c97 implements ki5 {
    public final b1 a;
    public final String b;

    public c97(b1 b1Var, String str) {
        this.a = b1Var;
        this.b = str;
    }

    @Override // defpackage.ki5
    public final Object a(h61 h61Var, String str, int i) throws Exception {
        if (i >= str.length()) {
            return Integer.valueOf(i);
        }
        final char cCharAt = str.charAt(i);
        b1 b1Var = this.a;
        if (cCharAt == '-') {
            b1Var.K(h61Var, Boolean.TRUE);
            return Integer.valueOf(i + 1);
        }
        if (cCharAt != '+') {
            return new fi5(i, new dn2() { // from class: b97
                @Override // defpackage.dn2
                public final Object invoke() {
                    return "Expected " + this.X.b + " but got " + cCharAt;
                }
            });
        }
        b1Var.K(h61Var, Boolean.FALSE);
        return Integer.valueOf(i + 1);
    }

    public final String toString() {
        return this.b;
    }
}
