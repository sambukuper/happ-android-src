package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eh0 implements d63 {
    public final dh0 a;

    public eh0(dh0 dh0Var) {
        this.a = dh0Var;
    }

    @Override // defpackage.d63
    public final d18 a() {
        return this.a.a();
    }

    @Override // defpackage.d63
    public final int b() {
        int iB = p61.B(this.a.b());
        if (iB == 1) {
            return 2;
        }
        if (iB != 2) {
            return iB != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // defpackage.d63
    public final long getTimestamp() {
        return this.a.getTimestamp();
    }
}
