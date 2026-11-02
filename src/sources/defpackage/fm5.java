package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fm5 implements Iterator, qv3 {
    public final /* synthetic */ byte X;
    public final gm5 Y;

    public fm5(em5 em5Var, byte b) {
        this.X = b;
        switch (b) {
            case 1:
                this.Y = new gm5(em5Var.Y, em5Var);
                break;
            case 2:
                this.Y = new gm5(em5Var.Y, em5Var);
                break;
            default:
                this.Y = new gm5(em5Var.Y, em5Var);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.X;
        gm5 gm5Var = this.Y;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return gm5Var.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.X;
        gm5 gm5Var = this.Y;
        switch (b) {
            case 0:
                return new d05(gm5Var.Y, gm5Var.Z, gm5Var.next());
            case 1:
                gm5Var.next();
                return gm5Var.Z;
            default:
                return gm5Var.next().a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.X;
        gm5 gm5Var = this.Y;
        switch (b) {
            case 0:
                gm5Var.remove();
                break;
            case 1:
                gm5Var.remove();
                break;
            default:
                gm5Var.remove();
                break;
        }
    }
}
