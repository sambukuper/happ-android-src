package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class aq3 extends ao3 implements Map<String, ao3>, qv3 {
    public static final zp3 Companion = new zp3();
    public final Map X;

    public aq3(Map map) {
        map.getClass();
        this.X = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ ao3 compute(String str, BiFunction<? super String, ? super ao3, ? extends ao3> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ ao3 computeIfAbsent(String str, Function<? super String, ? extends ao3> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ ao3 computeIfPresent(String str, BiFunction<? super String, ? super ao3, ? extends ao3> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.X.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof ao3)) {
            return false;
        }
        return this.X.containsValue((ao3) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, ao3>> entrySet() {
        return this.X.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return dh3.f(this.X, obj);
    }

    @Override // java.util.Map
    public final ao3 get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (ao3) this.X.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.X.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ ao3 merge(String str, ao3 ao3Var, BiFunction<? super ao3, ? super ao3, ? extends ao3> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ ao3 put(String str, ao3 ao3Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends ao3> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ ao3 putIfAbsent(String str, ao3 ao3Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final ao3 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ ao3 replace(String str, ao3 ao3Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super ao3, ? extends ao3> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.X.size();
    }

    public final String toString() {
        return wv0.y0(this.X.entrySet(), ",", "{", "}", new uh3((byte) 3), 24);
    }

    @Override // java.util.Map
    public final Collection<ao3> values() {
        return this.X.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, ao3 ao3Var, ao3 ao3Var2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
