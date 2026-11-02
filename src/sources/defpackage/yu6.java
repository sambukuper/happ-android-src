package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yu6 implements Iterable {
    public vu6 X;
    public vu6 Y;
    public final WeakHashMap Z = new WeakHashMap();
    public int f0 = 0;

    public final Object a(Object obj, Object obj2) {
        vu6 vu6Var = this.X;
        while (vu6Var != null && !vu6Var.X.equals(obj)) {
            vu6Var = vu6Var.Z;
        }
        if (vu6Var != null) {
            return vu6Var.Y;
        }
        vu6 vu6Var2 = new vu6(obj, obj2);
        this.f0++;
        vu6 vu6Var3 = this.Y;
        if (vu6Var3 == null) {
            this.X = vu6Var2;
            this.Y = vu6Var2;
            return null;
        }
        vu6Var3.Z = vu6Var2;
        vu6Var2.f0 = vu6Var3;
        this.Y = vu6Var2;
        return null;
    }

    public final boolean equals(Object obj) {
        uu6 uu6Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yu6)) {
            return false;
        }
        yu6 yu6Var = (yu6) obj;
        if (this.f0 != yu6Var.f0) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = yu6Var.iterator();
        while (true) {
            uu6Var = (uu6) it;
            if (!uu6Var.hasNext()) {
                break;
            }
            uu6 uu6Var2 = (uu6) it2;
            if (!uu6Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) uu6Var.next();
            Object next = uu6Var2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (uu6Var.hasNext() || ((uu6) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            uu6 uu6Var = (uu6) it;
            if (!uu6Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) uu6Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        vu6 vu6Var = this.X;
        vu6 vu6Var2 = this.Y;
        uu6 uu6Var = new uu6();
        uu6Var.X = vu6Var2;
        uu6Var.Y = vu6Var;
        this.Z.put(uu6Var, Boolean.FALSE);
        return uu6Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            uu6 uu6Var = (uu6) it;
            if (!uu6Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) uu6Var.next()).toString());
            if (uu6Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
