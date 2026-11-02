package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gq2 implements GenericArrayType, Type {
    public final Type X;

    public gq2(Type type) {
        type.getClass();
        this.X = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return dh3.f(this.X, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.X;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return vj8.w0(this.X) + _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
