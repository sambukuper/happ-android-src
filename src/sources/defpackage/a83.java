package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a83 extends z1 {
    public final k2 X;
    public final int Y;
    public final int Z;

    public a83(k2 k2Var, int i, int i2) {
        this.X = k2Var;
        this.Y = i;
        ch3.n(i, i2, k2Var.a());
        this.Z = i2 - i;
    }

    @Override // defpackage.z0
    public final int a() {
        return this.Z;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ch3.l(i, this.Z);
        return this.X.get(this.Y + i);
    }

    @Override // defpackage.z1, java.util.List
    public final List subList(int i, int i2) {
        ch3.n(i, i2, this.Z);
        int i3 = this.Y;
        return new a83(this.X, i + i3, i3 + i2);
    }
}
