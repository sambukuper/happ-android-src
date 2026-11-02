package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o03 implements ListIterator, qv3 {
    public final /* synthetic */ byte X;
    public int Y;
    public int Z;
    public int f0;
    public final Object g0;

    public o03(vd7 vd7Var, int i) {
        this.X = (byte) 3;
        this.g0 = vd7Var;
        this.Y = i - 1;
        this.Z = -1;
        this.f0 = hi5.d0(vd7Var);
    }

    public void a() {
        if (((AbstractList) ((fb4) this.g0).g0).modCount == this.f0) {
            return;
        }
        bt.c();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        byte b = this.X;
        Object obj2 = this.g0;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                fb4 fb4Var = (fb4) obj2;
                int i = this.Y;
                this.Y = i + 1;
                fb4Var.add(i, obj);
                this.Z = -1;
                this.f0 = ((AbstractList) fb4Var).modCount;
                return;
            case 2:
                b();
                gb4 gb4Var = (gb4) obj2;
                int i2 = this.Y;
                this.Y = i2 + 1;
                gb4Var.add(i2, obj);
                this.Z = -1;
                this.f0 = ((AbstractList) gb4Var).modCount;
                return;
            default:
                c();
                vd7 vd7Var = (vd7) obj2;
                vd7Var.add(this.Y + 1, obj);
                this.Z = -1;
                this.Y++;
                this.f0 = hi5.d0(vd7Var);
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((gb4) this.g0)).modCount == this.f0) {
            return;
        }
        bt.c();
    }

    public void c() {
        if (hi5.d0((vd7) this.g0) == this.f0) {
            return;
        }
        bt.c();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.X;
        Object obj = this.g0;
        switch (b) {
            case 0:
                return this.Y < this.f0;
            case 1:
                return this.Y < ((fb4) obj).Z;
            case 2:
                return this.Y < ((gb4) obj).Y;
            default:
                return this.Y < ((vd7) obj).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.X) {
            case 0:
                return this.Y > this.Z;
            case 1:
                return this.Y > 0;
            case 2:
                return this.Y > 0;
            default:
                return this.Y >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.X;
        Object obj = this.g0;
        switch (b) {
            case 0:
                j05 j05Var = ((q03) obj).X;
                int i = this.Y;
                this.Y = i + 1;
                Object objG = j05Var.g(i);
                objG.getClass();
                return (jx4) objG;
            case 1:
                a();
                int i2 = this.Y;
                fb4 fb4Var = (fb4) obj;
                if (i2 >= fb4Var.Z) {
                    bt.n();
                    return null;
                }
                this.Y = i2 + 1;
                this.Z = i2;
                return fb4Var.X[fb4Var.Y + i2];
            case 2:
                b();
                int i3 = this.Y;
                gb4 gb4Var = (gb4) obj;
                if (i3 >= gb4Var.Y) {
                    bt.n();
                    return null;
                }
                this.Y = i3 + 1;
                this.Z = i3;
                return gb4Var.X[i3];
            default:
                c();
                int i4 = this.Y + 1;
                this.Z = i4;
                vd7 vd7Var = (vd7) obj;
                hi5.B0(i4, vd7Var.size());
                Object obj2 = vd7Var.get(i4);
                this.Y = i4;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.X) {
            case 0:
                return this.Y - this.Z;
            case 1:
                return this.Y;
            case 2:
                return this.Y;
            default:
                return this.Y + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.X;
        Object obj = this.g0;
        switch (b) {
            case 0:
                j05 j05Var = ((q03) obj).X;
                int i = this.Y - 1;
                this.Y = i;
                Object objG = j05Var.g(i);
                objG.getClass();
                return (jx4) objG;
            case 1:
                a();
                int i2 = this.Y;
                if (i2 <= 0) {
                    bt.n();
                    return null;
                }
                int i3 = i2 - 1;
                this.Y = i3;
                this.Z = i3;
                fb4 fb4Var = (fb4) obj;
                return fb4Var.X[fb4Var.Y + i3];
            case 2:
                b();
                int i4 = this.Y;
                if (i4 <= 0) {
                    bt.n();
                    return null;
                }
                int i5 = i4 - 1;
                this.Y = i5;
                this.Z = i5;
                return ((gb4) obj).X[i5];
            default:
                c();
                vd7 vd7Var = (vd7) obj;
                hi5.B0(this.Y, vd7Var.size());
                int i6 = this.Y;
                this.Z = i6;
                Object obj2 = vd7Var.get(i6);
                this.Y--;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.X) {
            case 0:
                return (this.Y - this.Z) - 1;
            case 1:
                i = this.Y;
                break;
            case 2:
                i = this.Y;
                break;
            default:
                return this.Y;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        byte b = this.X;
        Object obj = this.g0;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                fb4 fb4Var = (fb4) obj;
                a();
                int i = this.Z;
                if (i == -1) {
                    bt.i("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                fb4Var.b(i);
                this.Y = this.Z;
                this.Z = -1;
                this.f0 = ((AbstractList) fb4Var).modCount;
                return;
            case 2:
                gb4 gb4Var = (gb4) obj;
                b();
                int i2 = this.Z;
                if (i2 == -1) {
                    bt.i("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                gb4Var.b(i2);
                this.Y = this.Z;
                this.Z = -1;
                this.f0 = ((AbstractList) gb4Var).modCount;
                return;
            default:
                c();
                vd7 vd7Var = (vd7) obj;
                vd7Var.remove(this.Z);
                this.Y--;
                this.Z = -1;
                this.f0 = hi5.d0(vd7Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        byte b = this.X;
        Object obj2 = this.g0;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i = this.Z;
                if (i != -1) {
                    ((fb4) obj2).set(i, obj);
                    return;
                } else {
                    bt.i("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i2 = this.Z;
                if (i2 != -1) {
                    ((gb4) obj2).set(i2, obj);
                    return;
                } else {
                    bt.i("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                vd7 vd7Var = (vd7) obj2;
                c();
                int i3 = this.Z;
                if (i3 < 0) {
                    bt.i("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    vd7Var.set(i3, obj);
                    this.f0 = hi5.d0(vd7Var);
                    return;
                }
        }
    }

    public o03(gb4 gb4Var, int i) {
        this.X = (byte) 2;
        this.g0 = gb4Var;
        this.Y = i;
        this.Z = -1;
        this.f0 = ((AbstractList) gb4Var).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o03(q03 q03Var, int i, int i2) {
        this(q03Var, (i2 & 1) != 0 ? 0 : i, 0, q03Var.X.b);
        this.X = (byte) 0;
    }

    public o03(q03 q03Var, int i, int i2, int i3) {
        this.X = (byte) 0;
        this.g0 = q03Var;
        this.Y = i;
        this.Z = i2;
        this.f0 = i3;
    }

    public o03(fb4 fb4Var, int i) {
        this.X = (byte) 1;
        this.g0 = fb4Var;
        this.Y = i;
        this.Z = -1;
        this.f0 = ((AbstractList) fb4Var).modCount;
    }
}
