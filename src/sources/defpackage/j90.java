package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j90 extends a2 {
    public final /* synthetic */ byte f0 = 1;
    public final Object g0;

    public j90(Object obj, int i) {
        super(i, 1, (byte) 0);
        this.g0 = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.f0;
        Object obj = this.g0;
        switch (b) {
            case 0:
                if (!hasNext()) {
                    bt.n();
                    return null;
                }
                int i = this.Y;
                this.Y = i + 1;
                return ((Object[]) obj)[i];
            default:
                if (hasNext()) {
                    this.Y++;
                    return obj;
                }
                bt.n();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.f0;
        Object obj = this.g0;
        switch (b) {
            case 0:
                if (!hasPrevious()) {
                    bt.n();
                    return null;
                }
                int i = this.Y - 1;
                this.Y = i;
                return ((Object[]) obj)[i];
            default:
                if (hasPrevious()) {
                    this.Y--;
                    return obj;
                }
                bt.n();
                return null;
        }
    }

    public j90(Object[] objArr, int i, int i2) {
        super(i, i2, (byte) 0);
        this.g0 = objArr;
    }
}
