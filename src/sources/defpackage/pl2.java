package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pl2 extends xw8 {
    public static final ol2 h = new ol2((byte) 0);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public pl2(boolean z) {
        this.e = z;
    }

    @Override // defpackage.xw8
    public final void d() {
        if (ml2.K(3)) {
            toString();
        }
        this.f = true;
    }

    public final void e(qk2 qk2Var) {
        if (this.g) {
            return;
        }
        String str = qk2Var.g0;
        HashMap map = this.b;
        if (map.containsKey(str)) {
            return;
        }
        map.put(qk2Var.g0, qk2Var);
        if (ml2.K(2)) {
            qk2Var.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pl2.class != obj.getClass()) {
            return false;
        }
        pl2 pl2Var = (pl2) obj;
        return this.b.equals(pl2Var.b) && this.c.equals(pl2Var.c) && this.d.equals(pl2Var.d);
    }

    public final void f(String str, boolean z) {
        HashMap map = this.c;
        pl2 pl2Var = (pl2) map.get(str);
        if (pl2Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(pl2Var.c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    pl2Var.f((String) it.next(), true);
                }
            }
            pl2Var.d();
            map.remove(str);
        }
        HashMap map2 = this.d;
        ex8 ex8Var = (ex8) map2.get(str);
        if (ex8Var != null) {
            ex8Var.a();
            map2.remove(str);
        }
    }

    public final void g(qk2 qk2Var) {
        if (this.g || this.b.remove(qk2Var.g0) == null || !ml2.K(2)) {
            return;
        }
        qk2Var.toString();
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
