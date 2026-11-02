package io.sentry.android.replay;

import io.sentry.c2;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends LinkedHashMap {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof io.sentry.g) {
            return super.containsKey((io.sentry.g) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof io.sentry.g) || super.get((io.sentry.g) obj) == null) {
            return null;
        }
        c2.m();
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof io.sentry.g)) {
            return obj2;
        }
        io.sentry.g gVar = (io.sentry.g) obj;
        if (obj2 != null) {
            c2.m();
            return null;
        }
        if (super.getOrDefault(gVar, null) == null) {
            return null;
        }
        c2.m();
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof io.sentry.g) || super.remove((io.sentry.g) obj) == null) {
            return null;
        }
        c2.m();
        return null;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return super.size() > 32;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        return false;
    }
}
