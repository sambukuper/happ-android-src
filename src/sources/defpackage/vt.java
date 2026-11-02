package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vt extends l97 implements Map {
    public pt f0;
    public rt g0;
    public tt h0;

    @Override // java.util.Map
    public final Set entrySet() {
        pt ptVar = this.f0;
        if (ptVar != null) {
            return ptVar;
        }
        pt ptVar2 = new pt(this, (byte) 0);
        this.f0 = ptVar2;
        return ptVar2;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        rt rtVar = this.g0;
        if (rtVar != null) {
            return rtVar;
        }
        rt rtVar2 = new rt(this);
        this.g0 = rtVar2;
        return rtVar2;
    }

    public final boolean m(Collection collection) {
        int i = this.Z;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.Z;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.Z);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        tt ttVar = this.h0;
        if (ttVar != null) {
            return ttVar;
        }
        tt ttVar2 = new tt(this);
        this.h0 = ttVar2;
        return ttVar2;
    }
}
