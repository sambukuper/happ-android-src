package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class up4 implements Map, qv3 {
    public final s05 X;
    public i22 Y;
    public i22 Z;
    public xp7 f0;

    public up4(s05 s05Var) {
        this.X = s05Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.X.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.X.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        i22 i22Var = this.Y;
        if (i22Var != null) {
            return i22Var;
        }
        i22 i22Var2 = new i22(this.X, (byte) 0);
        this.Y = i22Var2;
        return i22Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || up4.class != obj.getClass()) {
            return false;
        }
        return this.X.equals(((up4) obj).X);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.X.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.X.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        i22 i22Var = this.Z;
        if (i22Var != null) {
            return i22Var;
        }
        i22 i22Var2 = new i22(this.X, (byte) 1);
        this.Z = i22Var2;
        return i22Var2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.X.e;
    }

    public final String toString() {
        return this.X.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        xp7 xp7Var = this.f0;
        if (xp7Var != null) {
            return xp7Var;
        }
        xp7 xp7Var2 = new xp7(this.X);
        this.f0 = xp7Var2;
        return xp7Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
