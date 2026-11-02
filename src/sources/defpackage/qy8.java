package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qy8 extends uj2 {
    public final String Y;
    public int Z;

    public qy8(aj0 aj0Var) {
        super(aj0Var);
        this.Y = "virtual-" + aj0Var.e() + "-" + UUID.randomUUID().toString();
    }

    @Override // defpackage.uj2, defpackage.xi0
    public final int c() {
        return n(0);
    }

    @Override // defpackage.uj2, defpackage.aj0
    public final String e() {
        return this.Y;
    }

    @Override // defpackage.uj2, defpackage.xi0
    public final int n(int i) {
        return hd8.i(this.X.n(i) - this.Z);
    }
}
