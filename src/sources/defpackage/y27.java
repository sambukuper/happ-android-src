package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y27 implements Iterator, qv3 {
    public final /* synthetic */ byte X;
    public final Object Y;
    public boolean Z = true;

    public /* synthetic */ y27(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.X) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.Z;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                if (this.Z) {
                    this.Z = false;
                    return obj;
                }
                bt.n();
                return null;
            case 1:
                if (this.Z) {
                    this.Z = false;
                    return obj;
                }
                bt.n();
                return null;
            default:
                if (this.Z) {
                    this.Z = false;
                    return ((cb5) obj).X;
                }
                bt.n();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
