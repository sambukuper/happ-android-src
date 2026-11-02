package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nk6 implements jq0 {
    public final gn2 a;
    public final String b;

    public nk6(String str, gn2 gn2Var) {
        this.a = gn2Var;
        this.b = "must return ".concat(str);
    }

    @Override // defpackage.jq0
    public final String a() {
        return this.b;
    }

    @Override // defpackage.jq0
    public final boolean b(dl3 dl3Var) {
        return dh3.f(dl3Var.k0, this.a.B(el1.e(dl3Var)));
    }

    @Override // defpackage.jq0
    public final /* bridge */ String c(dl3 dl3Var) {
        return nr4.F(this, dl3Var);
    }
}
