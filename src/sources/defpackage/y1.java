package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends z1 implements RandomAccess {
    public final z1 X;
    public final int Y;
    public final int Z;

    public y1(z1 z1Var, int i, int i2) {
        this.X = z1Var;
        this.Y = i;
        wl7.t(i, i2, z1Var.a());
        this.Z = i2 - i;
    }

    @Override // defpackage.z0
    public final int a() {
        return this.Z;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.Z;
        if (i < 0 || i >= i2) {
            kp5.k(pc6.m("index: ", i, i2, ", size: "));
            return null;
        }
        return this.X.get(this.Y + i);
    }

    @Override // defpackage.z1, java.util.List
    public final List subList(int i, int i2) {
        wl7.t(i, i2, this.Z);
        int i3 = this.Y;
        return new y1(this.X, i + i3, i3 + i2);
    }
}
