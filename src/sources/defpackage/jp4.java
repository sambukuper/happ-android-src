package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jp4 extends h2 {
    public final /* synthetic */ byte X;
    public final ip4 Y;

    public /* synthetic */ jp4(ip4 ip4Var, byte b) {
        this.X = b;
        this.Y = ip4Var;
    }

    @Override // defpackage.h2
    public final int a() {
        byte b = this.X;
        ip4 ip4Var = this.Y;
        switch (b) {
            case 0:
                break;
        }
        return ip4Var.k0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.X) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        byte b = this.X;
        collection.getClass();
        switch (b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.X;
        ip4 ip4Var = this.Y;
        switch (b) {
            case 0:
                ip4Var.clear();
                break;
            default:
                ip4Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.X;
        ip4 ip4Var = this.Y;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int iH = ip4Var.h(entry.getKey());
                if (iH < 0) {
                    return false;
                }
                Object[] objArr = ip4Var.Y;
                objArr.getClass();
                return dh3.f(objArr[iH], entry.getValue());
            default:
                return ip4Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.X) {
            case 0:
                collection.getClass();
                return this.Y.f(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        byte b = this.X;
        ip4 ip4Var = this.Y;
        switch (b) {
            case 0:
                break;
        }
        return ip4Var.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.X;
        ip4 ip4Var = this.Y;
        switch (b) {
            case 0:
                return new fp4(ip4Var, (byte) 0);
            default:
                return new fp4(ip4Var, (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.X;
        ip4 ip4Var = this.Y;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    ip4Var.c();
                    int iH = ip4Var.h(entry.getKey());
                    if (iH >= 0) {
                        Object[] objArr = ip4Var.Y;
                        objArr.getClass();
                        if (dh3.f(objArr[iH], entry.getValue())) {
                            ip4Var.n(iH);
                            return true;
                        }
                    }
                }
                return false;
            default:
                ip4Var.c();
                int iH2 = ip4Var.h(obj);
                if (iH2 < 0) {
                    return false;
                }
                ip4Var.n(iH2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        byte b = this.X;
        ip4 ip4Var = this.Y;
        collection.getClass();
        switch (b) {
            case 0:
                ip4Var.c();
                break;
            default:
                ip4Var.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        byte b = this.X;
        ip4 ip4Var = this.Y;
        collection.getClass();
        switch (b) {
            case 0:
                ip4Var.c();
                break;
            default:
                ip4Var.c();
                break;
        }
        return super.retainAll(collection);
    }
}
