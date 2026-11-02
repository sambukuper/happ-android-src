package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uy7 extends s51 implements bo2 {
    public final byte f0;

    /* JADX WARN: Multi-variable type inference failed */
    public uy7(int i, q51 q51Var) {
        super(q51Var);
        this.f0 = i;
    }

    @Override // defpackage.bo2
    public final int t() {
        return this.f0;
    }

    @Override // defpackage.r10
    public final String toString() {
        return this.X == null ? yb6.a.i(this) : super.toString();
    }
}
