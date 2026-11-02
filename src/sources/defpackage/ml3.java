package defpackage;

import java.io.Serializable;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum ml3 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, _UrlKt.FRAGMENT_ENCODE_SET),
    BYTE_STRING(hb0.class, hb0.Z),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Class X;
    public final Object Y;

    ml3(Class cls, Serializable serializable) {
        this.X = cls;
        this.Y = serializable;
    }
}
