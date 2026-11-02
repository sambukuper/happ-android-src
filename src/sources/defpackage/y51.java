package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y51 implements dn2 {
    public final /* synthetic */ byte X;
    public final int Y;
    public final Object Z;

    public /* synthetic */ y51(Object obj, int i, byte b) {
        this.X = b;
        this.Z = obj;
        this.Y = i;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        int i = this.Y;
        Object obj = this.Z;
        switch (b) {
            case 0:
                u1 u1Var = (u1) ((dn2) obj).invoke();
                g44 g44VarP = x97.P(w74.X, new f3(u1Var, (byte) 8));
                tb6 tb6Var = u1Var.X;
                Type type = tb6Var != null ? (Type) tb6Var.invoke() : null;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    componentType.getClass();
                    return componentType;
                }
                if (type instanceof GenericArrayType) {
                    if (i != 0) {
                        xw3.j(u1Var, "Array type has been queried for a non-0th argument: ");
                        return null;
                    }
                    Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                    genericComponentType.getClass();
                    return genericComponentType;
                }
                if (!(type instanceof ParameterizedType)) {
                    xw3.j(u1Var, "Non-generic type has been queried for arguments: ");
                    return null;
                }
                Type type2 = (Type) ((List) g44VarP.getValue()).get(i);
                if (!(type2 instanceof WildcardType)) {
                    return type2;
                }
                WildcardType wildcardType = (WildcardType) type2;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                lowerBounds.getClass();
                Type type3 = lowerBounds.length != 0 ? lowerBounds[0] : null;
                if (type3 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    upperBounds.getClass();
                    type3 = (Type) eu.r0(upperBounds);
                }
                type3.getClass();
                return type3;
            case 1:
                return (zg5) ((List) obj).get(i);
            default:
                Object obj2 = ((ld0) obj).L().get(i);
                obj2.getClass();
                return (zg5) obj2;
        }
    }
}
