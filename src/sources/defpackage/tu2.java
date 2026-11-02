package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tu2 implements GenericArrayType {
    public final Type X;

    public tu2(Type type) {
        Objects.requireNonNull(type);
        this.X = nr4.l(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && nr4.q(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.X;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return nr4.W(this.X) + _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
