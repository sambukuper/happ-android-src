package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.MissingResourceException;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q94 {
    public final Map a;
    public final Map b;
    public final byte[] c;
    public final d24[] d;

    public q94(Map map, Map map2, byte[] bArr, d24[] d24VarArr) {
        this.a = map;
        this.b = map2;
        this.c = bArr;
        this.d = d24VarArr;
    }

    public static void a(y33 y33Var, String str, b8 b8Var) {
        if (!y33Var.m(str, b8Var)) {
            throw new MissingResourceException("langInfo.res missing data", _UrlKt.FRAGMENT_ENCODE_SET, "likely/".concat(str));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !q94.class.equals(obj.getClass())) {
            return false;
        }
        q94 q94Var = (q94) obj;
        return this.a.equals(q94Var.a) && this.b.equals(q94Var.b) && Arrays.equals(this.c, q94Var.c) && Arrays.equals(this.d, q94Var.d);
    }

    public final int hashCode() {
        return 1;
    }
}
