package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vc1 extends fo8 {
    public final dg5 e;

    public vc1(dg5 dg5Var) {
        super(vb1.b, dg5Var == dg5.Y ? 3 : 1, dg5Var == dg5.Z ? 3 : null);
        this.e = dg5Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vc1) {
            return this.e == ((vc1) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
