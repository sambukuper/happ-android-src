package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m33 extends r33 {
    public ld2 i;

    @Override // defpackage.al8
    public final int l() {
        return this.i.b;
    }

    @Override // defpackage.al8
    public final String n(int i) {
        ld2 ld2Var = this.i;
        fu6 fu6Var = this.b;
        int iH = ld2Var.h((z33) fu6Var.h0, i);
        if (iH == -1) {
            throw new IndexOutOfBoundsException();
        }
        String strG = ((z33) fu6Var.h0).g(iH);
        return strG != null ? strG : super.n(i);
    }
}
