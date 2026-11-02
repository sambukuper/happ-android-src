package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tl5 implements Iterator, qv3 {
    public final /* synthetic */ byte X = 3;
    public final Iterator Y;

    public tl5(jl5 jl5Var) {
        kf8[] kf8VarArr = new kf8[8];
        for (int i = 0; i < 8; i++) {
            kf8VarArr[i] = new of8(this);
        }
        this.Y = new ql5(jl5Var, kf8VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.X;
        Iterator it = this.Y;
        switch (b) {
            case 0:
                return ((pl5) it).Z;
            case 1:
                return ((ql5) it).Z;
            case 2:
                return ((w1) it).hasNext();
            default:
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.X;
        Iterator it = this.Y;
        switch (b) {
            case 0:
                return (Map.Entry) ((pl5) it).next();
            case 1:
                return (Map.Entry) ((ql5) it).next();
            case 2:
                return ((w1) it).next();
            default:
                return (hu8) it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.X) {
            case 0:
                ((pl5) this.Y).remove();
                return;
            case 1:
                ((ql5) this.Y).remove();
                return;
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public tl5(Object[] objArr) {
        objArr.getClass();
        this.Y = new w1(objArr);
    }

    public tl5(ol5 ol5Var) {
        kf8[] kf8VarArr = new kf8[8];
        for (int i = 0; i < 8; i++) {
            kf8VarArr[i] = new nf8(this);
        }
        this.Y = new pl5(ol5Var, kf8VarArr);
    }

    public tl5(fu8 fu8Var) {
        this.Y = fu8Var.l0.iterator();
    }
}
