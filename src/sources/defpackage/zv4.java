package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zv4 extends fo8 {
    public final dg5 e;

    public zv4(dg5 dg5Var) {
        super(ja8.b, dg5Var == dg5.Y ? 2 : 1, dg5Var == dg5.Z ? 2 : null);
        this.e = dg5Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zv4) {
            return this.e == ((zv4) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
