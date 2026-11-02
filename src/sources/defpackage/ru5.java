package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ru5 extends AbstractSet {
    public final /* synthetic */ byte X;
    public final wu5 Y;
    public final /* synthetic */ wu5 Z;

    public /* synthetic */ ru5(wu5 wu5Var, byte b) {
        this.X = b;
        this.Z = wu5Var;
        this.Y = wu5Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.X) {
            case 0:
                throw new UnsupportedOperationException("ConcurrentLinkedHashMap does not allow add to be called on entrySet()");
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.X;
        wu5 wu5Var = this.Y;
        switch (b) {
            case 0:
                wu5Var.clear();
                break;
            default:
                wu5Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.X) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    su5 su5Var = (su5) this.Y.X.get(entry.getKey());
                    if (su5Var != null && su5Var.a().equals(entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.Z.X.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.X;
        wu5 wu5Var = this.Z;
        switch (b) {
            case 0:
                return new qu5(wu5Var, (byte) 0);
            default:
                return new qu5(wu5Var, (byte) 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.X;
        wu5 wu5Var = this.Y;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return wu5Var.remove(entry.getKey(), entry.getValue());
            default:
                return wu5Var.remove(obj) != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.X;
        wu5 wu5Var = this.Y;
        switch (b) {
            case 0:
                break;
        }
        return wu5Var.X.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        switch (this.X) {
            case 1:
                return this.Y.X.keySet().toArray();
            default:
                return super.toArray();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        switch (this.X) {
            case 1:
                return this.Y.X.keySet().toArray(objArr);
            default:
                return super.toArray(objArr);
        }
    }
}
