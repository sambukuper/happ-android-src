package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zs4 {
    public static final Class[] c = new Class[0];
    public final String a;
    public final Class[] b;

    public zs4(Method method) {
        this(method.getName(), method.getParameterTypes().length > 0 ? method.getParameterTypes() : c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != zs4.class) {
            return false;
        }
        zs4 zs4Var = (zs4) obj;
        if (!this.a.equals(zs4Var.a)) {
            return false;
        }
        Class[] clsArr = zs4Var.b;
        Class[] clsArr2 = this.b;
        int length = clsArr2.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (clsArr[i] != clsArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(");
        return oi0.n(sb, this.b.length, "-args)");
    }

    public zs4(Constructor constructor) {
        this(_UrlKt.FRAGMENT_ENCODE_SET, constructor.getParameterCount() > 0 ? constructor.getParameterTypes() : c);
    }

    public zs4(String str, Class[] clsArr) {
        this.a = str;
        this.b = clsArr == null ? c : clsArr;
    }
}
