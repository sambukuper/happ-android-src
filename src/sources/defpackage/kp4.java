package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kp4 extends AbstractCollection implements Collection, rv3 {
    public final /* synthetic */ byte X;
    public final Object Y;

    public /* synthetic */ kp4(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.X) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                ((ip4) obj).clear();
                break;
            case 1:
                ((ol5) obj).clear();
                break;
            case 2:
                ((jl5) obj).clear();
                break;
            default:
                ((em5) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.X;
        Object obj2 = this.Y;
        switch (b) {
            case 0:
                return ((ip4) obj2).containsValue(obj);
            case 1:
                return ((ol5) obj2).containsValue(obj);
            case 2:
                return ((jl5) obj2).containsValue(obj);
            default:
                return ((em5) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.X) {
            case 0:
                return ((ip4) this.Y).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.X;
        int i = 0;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return new fp4((ip4) obj, (byte) 2);
            case 1:
                ol5 ol5Var = (ol5) obj;
                kf8[] kf8VarArr = new kf8[8];
                while (i < 8) {
                    kf8VarArr[i] = new lf8((byte) 2);
                    i++;
                }
                return new vl5(ol5Var, kf8VarArr);
            case 2:
                jl5 jl5Var = (jl5) obj;
                kf8[] kf8VarArr2 = new kf8[8];
                while (i < 8) {
                    kf8VarArr2[i] = new mf8((byte) 2);
                    i++;
                }
                return new wl5(jl5Var, kf8VarArr2);
            default:
                return new fm5((em5) obj, (byte) 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.X) {
            case 0:
                ip4 ip4Var = (ip4) this.Y;
                ip4Var.c();
                int i = ip4Var.i(obj);
                if (i < 0) {
                    return false;
                }
                ip4Var.n(i);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.X) {
            case 0:
                collection.getClass();
                ((ip4) this.Y).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.X) {
            case 0:
                collection.getClass();
                ((ip4) this.Y).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                return ((ip4) obj).k0;
            case 1:
                return ((ol5) obj).i0;
            case 2:
                return ((jl5) obj).g0;
            default:
                return ((em5) obj).f0.c();
        }
    }
}
