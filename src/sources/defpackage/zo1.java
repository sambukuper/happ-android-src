package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class zo1 extends si1 {
    public int m;

    public zo1(k09 k09Var) {
        super(k09Var);
        if (k09Var instanceof y03) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.si1
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (mi1 mi1Var : this.k) {
            mi1Var.a(mi1Var);
        }
    }
}
