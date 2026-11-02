package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mu extends si8 {
    public final String c;

    public mu(vh8 vh8Var, d50 d50Var, String str) {
        super(vh8Var, d50Var);
        this.c = str;
    }

    @Override // defpackage.ri8
    public final ri8 a(d50 d50Var) {
        return this.b == d50Var ? this : new mu(this.a, d50Var, this.c);
    }

    @Override // defpackage.ri8
    public final String b() {
        return this.c;
    }
}
