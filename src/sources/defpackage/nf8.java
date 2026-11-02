package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nf8 extends kf8 {
    public final tl5 g0;

    public nf8(tl5 tl5Var) {
        super((byte) 0);
        this.g0 = tl5Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f0;
        this.f0 = i + 2;
        Object[] objArr = this.Y;
        return new c05(this.g0, objArr[i], objArr[i + 1]);
    }
}
