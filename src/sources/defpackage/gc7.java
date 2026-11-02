package defpackage;

import java.util.AbstractMap;
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
public final class gc7 extends AbstractMap {
    public static final /* synthetic */ int h0 = 0;
    public final byte X;
    public List Y = Collections.EMPTY_LIST;
    public Map Z = Collections.EMPTY_MAP;
    public boolean f0;
    public volatile pt g0;

    /* JADX WARN: Multi-variable type inference failed */
    public gc7(int i) {
        this.X = i;
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
        int size = this.Y.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((jc7) this.Y.get(i3)).X);
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
            int iCompareTo2 = comparable.compareTo(((jc7) this.Y.get(i4)).X);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((jc7) this.Y.get(i3)).X);
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
        if (this.f0) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable c() {
        return this.Z.isEmpty() ? jb5.k0 : this.Z.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.Y.isEmpty()) {
            this.Y.clear();
        }
        if (this.Z.isEmpty()) {
            return;
        }
        this.Z.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.Z.containsKey(comparable);
    }

    public final SortedMap e() {
        b();
        if (this.Z.isEmpty() && !(this.Z instanceof TreeMap)) {
            this.Z = new TreeMap();
        }
        return (SortedMap) this.Z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.g0 == null) {
            this.g0 = new pt(this, (byte) 1);
        }
        return this.g0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((jc7) this.Y.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.Y.isEmpty();
        byte b = this.X;
        if (zIsEmpty && !(this.Y instanceof ArrayList)) {
            this.Y = new ArrayList(b);
        }
        int i = -(iA + 1);
        if (i >= b) {
            return e().put(comparable, obj);
        }
        if (this.Y.size() == b) {
            jc7 jc7Var = (jc7) this.Y.remove(b - 1);
            e().put(jc7Var.X, jc7Var.Y);
        }
        this.Y.add(i, new jc7(this, comparable, obj));
        return null;
    }

    public final Object g(int i) {
        b();
        Object obj = ((jc7) this.Y.remove(i)).Y;
        if (!this.Z.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.Y;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new jc7(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((jc7) this.Y.get(iA)).Y : this.Z.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return g(iA);
        }
        if (this.Z.isEmpty()) {
            return null;
        }
        return this.Z.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.Z.size() + this.Y.size();
    }
}
