package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qj6 extends nj6 implements bo2 {
    public final byte Y;

    /* JADX WARN: Multi-variable type inference failed */
    public qj6(int i, q51 q51Var) {
        super(q51Var);
        this.Y = i;
    }

    @Override // defpackage.bo2
    public final int t() {
        return this.Y;
    }

    @Override // defpackage.r10
    public final String toString() {
        return this.X == null ? yb6.a.i(this) : super.toString();
    }
}
