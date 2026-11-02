package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class nu extends ku {
    public final String e;

    public nu(vh8 vh8Var, d50 d50Var, String str) {
        super(vh8Var, d50Var, (byte) 1);
        this.e = str;
    }

    @Override // defpackage.ri8
    public final String b() {
        return this.e;
    }

    @Override // defpackage.ku, defpackage.ri8
    public tr3 c() {
        return tr3.X;
    }

    @Override // defpackage.ku
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public nu g(d50 d50Var) {
        return this.b == d50Var ? this : new nu(this.a, d50Var, this.e);
    }
}
