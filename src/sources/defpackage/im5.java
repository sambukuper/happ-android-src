package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class im5 implements Iterator, qv3 {
    public final /* synthetic */ byte X;
    public final jm5 Y;

    public im5(dm5 dm5Var, byte b) {
        this.X = b;
        switch (b) {
            case 1:
                this.Y = new jm5(dm5Var.X, dm5Var.Z, (byte) 0);
                break;
            case 2:
                this.Y = new jm5(dm5Var.X, dm5Var.Z, (byte) 0);
                break;
            default:
                this.Y = new jm5(dm5Var.X, dm5Var.Z, (byte) 0);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.X;
        jm5 jm5Var = this.Y;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return jm5Var.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.X;
        jm5 jm5Var = this.Y;
        switch (b) {
            case 0:
                return new mp4(jm5Var.Y, jm5Var.a().a, (byte) 1);
            case 1:
                Object obj = jm5Var.Y;
                jm5Var.a();
                return obj;
            default:
                return jm5Var.a().a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
