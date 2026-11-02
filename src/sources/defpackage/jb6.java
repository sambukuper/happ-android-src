package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jb6 extends gb6 {
    public final WildcardType a;

    public jb6(WildcardType wildcardType) {
        this.a = wildcardType;
    }

    @Override // defpackage.gb6
    public final Type b() {
        return this.a;
    }

    public final gb6 c() {
        WildcardType wildcardType = this.a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            em7.j(wildcardType, "Wildcard types with many bounds are not yet supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            Object objD0 = eu.D0(lowerBounds);
            objD0.getClass();
            Type type = (Type) objD0;
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new eb6(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                return new na6(type);
            }
            return type instanceof WildcardType ? new jb6((WildcardType) type) : new va6(type);
        }
        if (upperBounds.length == 1) {
            Type type2 = (Type) eu.D0(upperBounds);
            if (!dh3.f(type2, Object.class)) {
                type2.getClass();
                boolean z2 = type2 instanceof Class;
                if (z2) {
                    Class cls2 = (Class) type2;
                    if (cls2.isPrimitive()) {
                        return new eb6(cls2);
                    }
                }
                if ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) {
                    return new na6(type2);
                }
                return type2 instanceof WildcardType ? new jb6((WildcardType) type2) : new va6(type2);
            }
        }
        return null;
    }

    @Override // defpackage.vj3
    public final Collection getAnnotations() {
        return d02.X;
    }
}
