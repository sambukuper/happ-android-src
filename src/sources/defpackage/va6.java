package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class va6 extends gb6 {
    public final Type a;
    public final zj3 b;

    public va6(Type type) {
        zj3 ta6Var;
        type.getClass();
        this.a = type;
        if (type instanceof Class) {
            ta6Var = new ta6((Class) type);
        } else if (type instanceof TypeVariable) {
            ta6Var = new hb6((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                kp5.m("Not a classifier type (", type.getClass(), "): ", type);
                throw null;
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            ta6Var = new ta6((Class) rawType);
        }
        this.b = ta6Var;
    }

    @Override // defpackage.gb6, defpackage.vj3
    public final ja6 a(fk2 fk2Var) {
        fk2Var.getClass();
        return null;
    }

    @Override // defpackage.gb6
    public final Type b() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    public final ArrayList c() {
        gb6 na6Var;
        gb6 eb6Var;
        List<Type> listC = ia6.c(this.a);
        ArrayList arrayList = new ArrayList(xv0.Z(listC, 10));
        for (Type type : listC) {
            type.getClass();
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    eb6Var = new eb6(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                        na6Var = new na6(type);
                    } else {
                        na6Var = type instanceof WildcardType ? new jb6((WildcardType) type) : new va6(type);
                    }
                    eb6Var = na6Var;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    na6Var = new na6(type);
                } else {
                    na6Var = new na6(type);
                }
                eb6Var = na6Var;
            }
            arrayList.add(eb6Var);
        }
        return arrayList;
    }

    public final boolean d() {
        Type type = this.a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            typeParameters.getClass();
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vj3
    public final Collection getAnnotations() {
        return d02.X;
    }
}
