package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z73 extends z1 implements b83 {
    public final j2 X;
    public final int Y;
    public final int Z;

    public z73(j2 j2Var, int i, int i2) {
        this.X = j2Var;
        this.Y = i;
        g33.h(i, i2, j2Var.a());
        this.Z = i2 - i;
    }

    @Override // defpackage.z0
    public final int a() {
        return this.Z;
    }

    @Override // java.util.List
    public final Object get(int i) {
        g33.f(i, this.Z);
        return this.X.get(this.Y + i);
    }

    @Override // defpackage.z1, java.util.List
    public final List subList(int i, int i2) {
        g33.h(i, i2, this.Z);
        int i3 = this.Y;
        return new z73(this.X, i + i3, i3 + i2);
    }
}
