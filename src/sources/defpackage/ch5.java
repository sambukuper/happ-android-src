package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ch5 implements ParameterizedType, Type {
    public final Class X;
    public final Type Y;
    public final Type[] Z;

    public ch5(Class cls, Type type, ArrayList arrayList) {
        this.X = cls;
        this.Y = type;
        this.Z = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return this.X.equals(parameterizedType.getRawType()) && dh3.f(this.Y, parameterizedType.getOwnerType()) && Arrays.equals(this.Z, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.Z;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.Y;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.X;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.X;
        Type type = this.Y;
        if (type != null) {
            sb.append(vj8.w0(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(vj8.w0(cls));
        }
        Type[] typeArr = this.Z;
        if (typeArr.length != 0) {
            eu.w0(typeArr, sb, ", ", "<", ">", "...", bh5.X);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.X.hashCode();
        Type type = this.Y;
        return Arrays.hashCode(this.Z) ^ (iHashCode ^ (type != null ? type.hashCode() : 0));
    }

    public final String toString() {
        return getTypeName();
    }
}
