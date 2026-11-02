package defpackage;

import java.io.Serializable;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum d39 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(_UrlKt.FRAGMENT_ENCODE_SET),
    BYTE_STRING(hb0.Z),
    ENUM(null),
    MESSAGE(null);

    public final Object X;

    d39(Serializable serializable) {
        this.X = serializable;
    }
}
