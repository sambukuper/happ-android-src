package defpackage;

import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uu2 implements ParameterizedType {
    public final Type X;
    public final Type Y;
    public final Type[] Z;

    public uu2(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            bt.q(pc6.l(cls, "Must specify owner type for "));
            throw null;
        }
        this.X = type != null ? nr4.l(type) : null;
        this.Y = nr4.l(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.Z = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.Z[i]);
            nr4.m(this.Z[i]);
            Type[] typeArr3 = this.Z;
            typeArr3[i] = nr4.l(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && nr4.q(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.Z.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.X;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.Y;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.Z) ^ this.Y.hashCode();
        Type type = this.X;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.Z;
        int length = typeArr.length;
        Type type = this.Y;
        if (length == 0) {
            return nr4.W(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(nr4.W(type));
        sb.append("<");
        sb.append(nr4.W(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(nr4.W(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
