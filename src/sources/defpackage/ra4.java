package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ra4 implements Iterator {
    public su5 X;
    public final /* synthetic */ byte Y;

    public ra4(su5 su5Var, byte b) {
        this.Y = b;
        this.X = su5Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        su5 su5Var;
        if (!hasNext()) {
            bt.n();
            return null;
        }
        su5 su5Var2 = this.X;
        switch (this.Y) {
            case 0:
                su5Var = this.X.Z;
                break;
            default:
                su5Var = this.X.Y;
                break;
        }
        this.X = su5Var;
        return su5Var2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
