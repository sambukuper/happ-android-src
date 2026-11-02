package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sm5 extends a2 {
    public final Object[] f0;
    public final gf8 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm5(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2, (byte) 0);
        objArr.getClass();
        objArr2.getClass();
        this.f0 = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.g0 = new gf8(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            bt.n();
            return null;
        }
        gf8 gf8Var = this.g0;
        if (gf8Var.hasNext()) {
            this.Y++;
            return gf8Var.next();
        }
        int i = this.Y;
        this.Y = i + 1;
        return this.f0[i - gf8Var.Z];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            bt.n();
            return null;
        }
        int i = this.Y;
        gf8 gf8Var = this.g0;
        int i2 = gf8Var.Z;
        if (i <= i2) {
            this.Y = i - 1;
            return gf8Var.previous();
        }
        int i3 = i - 1;
        this.Y = i3;
        return this.f0[i3 - i2];
    }
}
