package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hc7 extends AbstractMap {
    public static final /* synthetic */ int h0 = 0;
    public List X;
    public Map Y;
    public boolean Z;
    public volatile pt f0;
    public Map g0;

    public static hc7 g() {
        hc7 hc7Var = new hc7();
        hc7Var.X = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        hc7Var.Y = map;
        hc7Var.g0 = map;
        return hc7Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.X.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((kc7) this.X.get(i3)).X);
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((kc7) this.X.get(i4)).X);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((kc7) this.X.get(i3)).X);
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    public final void b() {
        if (this.Z) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.X.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.X.isEmpty()) {
            this.X.clear();
        }
        if (this.Y.isEmpty()) {
            return;
        }
        this.Y.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.Y.containsKey(comparable);
    }

    public final Set e() {
        return this.Y.isEmpty() ? Collections.EMPTY_SET : this.Y.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f0 == null) {
            this.f0 = new pt(this, (byte) 2);
        }
        return this.f0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc7)) {
            return super.equals(obj);
        }
        hc7 hc7Var = (hc7) obj;
        int size = size();
        if (size == hc7Var.size()) {
            int size2 = this.X.size();
            if (size2 != hc7Var.X.size()) {
                return ((AbstractSet) entrySet()).equals(hc7Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(hc7Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.Y.equals(hc7Var.Y);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        b();
        if (this.Y.isEmpty() && !(this.Y instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.Y = treeMap;
            this.g0 = treeMap.descendingMap();
        }
        return (SortedMap) this.Y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((kc7) this.X.get(iA)).Y : this.Y.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((kc7) this.X.get(iA)).setValue(obj);
        }
        b();
        if (this.X.isEmpty() && !(this.X instanceof ArrayList)) {
            this.X = new ArrayList(16);
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return f().put(comparable, obj);
        }
        if (this.X.size() == 16) {
            kc7 kc7Var = (kc7) this.X.remove(15);
            f().put(kc7Var.X, kc7Var.Y);
        }
        this.X.add(i, new kc7(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.X.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((kc7) this.X.get(i)).hashCode();
        }
        return this.Y.size() > 0 ? this.Y.hashCode() + iHashCode : iHashCode;
    }

    public final Object i(int i) {
        b();
        Object obj = ((kc7) this.X.remove(i)).Y;
        if (!this.Y.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.X;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new kc7(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return i(iA);
        }
        if (this.Y.isEmpty()) {
            return null;
        }
        return this.Y.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.Y.size() + this.X.size();
    }
}
