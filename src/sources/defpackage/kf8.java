package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kf8 implements Iterator, qv3 {
    public final /* synthetic */ byte X;
    public Object[] Y;
    public int Z;
    public int f0;

    public kf8(byte b) {
        this.X = b;
        switch (b) {
            case 1:
                this.Y = jf8.e.d;
                break;
            default:
                this.Y = if8.e.d;
                break;
        }
    }

    public void a(Object[] objArr, int i, int i2) {
        this.Y = objArr;
        this.Z = i;
        this.f0 = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.X) {
            case 0:
                return this.f0 < this.Z;
            default:
                return this.f0 < this.Z;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
