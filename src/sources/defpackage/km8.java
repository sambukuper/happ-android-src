package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class km8 extends lm8 {
    public final int a;

    public km8(int i) {
        this.a = i;
    }

    @Override // defpackage.qm8
    public final int a() {
        return this.a;
    }

    @Override // defpackage.nm8
    public final void c(ac1 ac1Var) {
        int i = this.a;
        if (i == 1) {
            ac1Var.c(dg5.X);
        } else if (i == 2) {
            ac1Var.c(dg5.Y);
        } else {
            vm8.e(this);
            throw null;
        }
    }
}
