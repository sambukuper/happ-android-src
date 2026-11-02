package defpackage;

import io.sentry.c2;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class na6 extends gb6 {
    public final Type a;
    public final gb6 b;

    /* JADX WARN: Multi-variable type inference failed */
    public na6(Type type) {
        gb6 eb6Var;
        gb6 eb6Var2;
        this.a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    eb6Var = componentType.isPrimitive() ? new eb6(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new na6(componentType) : componentType instanceof WildcardType ? new jb6((WildcardType) componentType) : new va6(componentType);
                }
            }
            c2.k("Not an array type (", type.getClass(), "): ", type);
            throw null;
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        genericComponentType.getClass();
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            eb6Var2 = cls2.isPrimitive() ? new eb6(cls2) : eb6Var2;
            this.b = eb6Var2;
        }
        eb6Var = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new na6(genericComponentType) : genericComponentType instanceof WildcardType ? new jb6((WildcardType) genericComponentType) : new va6(genericComponentType);
        eb6Var2 = eb6Var;
        this.b = eb6Var2;
    }

    @Override // defpackage.gb6
    public final Type b() {
        return this.a;
    }

    @Override // defpackage.vj3
    public final Collection getAnnotations() {
        return d02.X;
    }
}
