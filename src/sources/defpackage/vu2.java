package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vu2 implements WildcardType {
    public final Type X;
    public final Type Y;

    public vu2(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            bt.q("At most one lower bound is supported");
            throw null;
        }
        if (typeArr.length != 1) {
            bt.q("Exactly one upper bound must be specified");
            throw null;
        }
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            nr4.m(typeArr[0]);
            this.Y = null;
            this.X = nr4.l(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        nr4.m(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            bt.q("When lower bound is specified, upper bound must be Object");
            throw null;
        }
        this.Y = nr4.l(typeArr2[0]);
        this.X = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && nr4.q(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.Y;
        return type != null ? new Type[]{type} : nr4.e;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.X};
    }

    public final int hashCode() {
        Type type = this.Y;
        return (this.X.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.Y;
        if (type != null) {
            return "? super " + nr4.W(type);
        }
        Type type2 = this.X;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + nr4.W(type2);
    }
}
