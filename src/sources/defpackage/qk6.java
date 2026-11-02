package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qk6 implements ListIterator, qv3 {
    public final /* synthetic */ byte X = 2;
    public final Object Y;
    public final /* synthetic */ Object Z;

    public qk6(dq4 dq4Var, int i) {
        this.Z = dq4Var;
        this.Y = ((List) dq4Var.Y).listIterator(wv0.L0(i, dq4Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.X) {
            case 0:
                ListIterator listIterator = (ListIterator) this.Y;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            case 1:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((ca6) obj).X < ((fn7) this.Z).f0 - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((ListIterator) obj).hasNext();
            case 1:
                return ((ListIterator) obj).hasNext();
            default:
                return ((ca6) obj).X >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((ListIterator) obj).previous();
            case 1:
                return ((ListIterator) obj).previous();
            default:
                ca6 ca6Var = (ca6) obj;
                int i = ca6Var.X + 1;
                fn7 fn7Var = (fn7) this.Z;
                hi5.B0(i, fn7Var.f0);
                ca6Var.X = i;
                return fn7Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int size;
        byte b = this.X;
        Object obj = this.Z;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((rk6) obj).size();
                break;
            case 1:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((dq4) obj).size();
                break;
            default:
                return ((ca6) obj2).X + 1;
        }
        return (size - 1) - iPreviousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((ListIterator) obj).next();
            case 1:
                return ((ListIterator) obj).next();
            default:
                ca6 ca6Var = (ca6) obj;
                int i = ca6Var.X;
                fn7 fn7Var = (fn7) this.Z;
                hi5.B0(i, fn7Var.f0);
                ca6Var.X = i - 1;
                return fn7Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int size;
        byte b = this.X;
        Object obj = this.Z;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((rk6) obj).size();
                break;
            case 1:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((dq4) obj).size();
                break;
            default:
                return ((ca6) obj2).X;
        }
        return (size - 1) - iNextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.X) {
            case 0:
                ((ListIterator) this.Y).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.X) {
            case 0:
                ((ListIterator) this.Y).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public qk6(rk6 rk6Var, int i) {
        this.Z = rk6Var;
        this.Y = rk6Var.X.listIterator(wv0.L0(i, rk6Var));
    }

    public qk6(ca6 ca6Var, fn7 fn7Var) {
        this.Y = ca6Var;
        this.Z = fn7Var;
    }
}
