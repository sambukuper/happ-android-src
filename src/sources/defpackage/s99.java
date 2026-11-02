package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s99 extends t99 {
    public final transient int Z;
    public final transient int f0;
    public final /* synthetic */ t99 g0;

    public s99(t99 t99Var, int i, int i2) {
        this.g0 = t99Var;
        this.Z = i;
        this.f0 = i2;
    }

    @Override // defpackage.o99
    public final Object[] a() {
        return this.g0.a();
    }

    @Override // defpackage.o99
    public final int b() {
        return this.g0.b() + this.Z;
    }

    @Override // defpackage.o99
    public final int c() {
        return this.g0.b() + this.Z + this.f0;
    }

    @Override // defpackage.t99, java.util.List
    /* JADX INFO: renamed from: f */
    public final t99 subList(int i, int i2) {
        z38.f(i, i2, this.f0);
        int i3 = this.Z;
        return this.g0.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        z38.e(i, this.f0);
        return this.g0.get(i + this.Z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f0;
    }
}
