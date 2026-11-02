package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Objects;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jx5 implements Serializable {
    public static final jx5 f0 = new jx5(_UrlKt.FRAGMENT_ENCODE_SET, null);
    public static final jx5 g0 = new jx5(new String(_UrlKt.FRAGMENT_ENCODE_SET), null);
    public final String X;
    public final String Y;
    public r37 Z;

    public jx5(String str, String str2) {
        Annotation[] annotationArr = it0.a;
        this.X = str == null ? _UrlKt.FRAGMENT_ENCODE_SET : str;
        this.Y = str2;
    }

    public static jx5 a(String str) {
        return (str == null || str.isEmpty()) ? f0 : new jx5(ag3.Y.a(str), null);
    }

    public static jx5 b(String str, String str2) {
        if (str == null) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return (str2 == null && str.isEmpty()) ? f0 : new jx5(ag3.Y.a(str), str2);
    }

    public final boolean c() {
        return this.Y == null && this.X.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != jx5.class) {
            return false;
        }
        jx5 jx5Var = (jx5) obj;
        String str = jx5Var.X;
        String str2 = this.X;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = jx5Var.Y;
        String str4 = this.Y;
        if (str4 == null) {
            return str3 == null;
        }
        return str4.equals(str3);
    }

    public final int hashCode() {
        return Objects.hashCode(this.Y) + (Objects.hashCode(this.X) * 31);
    }

    public final String toString() {
        String str = this.X;
        String str2 = this.Y;
        if (str2 == null) {
            return str;
        }
        return "{" + str2 + "}" + str;
    }
}
