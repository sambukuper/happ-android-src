package defpackage;

import java.io.Serializable;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class op3 implements Serializable {
    public transient Object X;
    public final String Y;
    public int Z = -1;
    public String f0;

    public op3(Object obj, String str) {
        this.X = obj;
        if (str != null) {
            this.Y = str;
        } else {
            b61.i("Cannot pass null fieldName");
            throw null;
        }
    }

    public final String toString() {
        String str = this.f0;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        Object obj = this.X;
        if (obj != null) {
            Class<?> componentType = obj instanceof Class ? (Class) obj : obj.getClass();
            int i = 0;
            while (componentType.isArray()) {
                componentType = componentType.getComponentType();
                i++;
            }
            sb.append(componentType.getName());
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                sb.append(_UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
            }
        } else {
            sb.append("UNKNOWN");
        }
        sb.append('[');
        String str2 = this.Y;
        if (str2 != null) {
            sb.append('\"');
            sb.append(str2);
            sb.append('\"');
        } else {
            int i2 = this.Z;
            if (i2 >= 0) {
                sb.append(i2);
            } else {
                sb.append('?');
            }
        }
        sb.append(']');
        String string = sb.toString();
        this.f0 = string;
        return string;
    }
}
