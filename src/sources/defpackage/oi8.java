package defpackage;

import java.util.Collections;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oi8 implements pw3 {
    public final lv3 X;
    public final boolean Y;

    public oi8(lv3 lv3Var, boolean z) {
        List list = Collections.EMPTY_LIST;
        lv3Var.getClass();
        list.getClass();
        this.X = lv3Var;
        this.Y = z;
    }

    @Override // defpackage.pw3
    public final List L() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.pw3
    public final lv3 M() {
        return this.X;
    }

    @Override // defpackage.wu3
    public final List Q() {
        return d02.X;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oi8)) {
            return false;
        }
        oi8 oi8Var = (oi8) obj;
        if (!dh3.f(this.X, oi8Var.X)) {
            return false;
        }
        List list = Collections.EMPTY_LIST;
        return dh3.f(list, list) && this.Y == oi8Var.Y;
    }

    public final String f(boolean z) {
        String name;
        lv3 lv3Var = this.X;
        zu3 zu3Var = lv3Var instanceof zu3 ? (zu3) lv3Var : null;
        Class clsM = zu3Var != null ? zc1.M(zu3Var) : null;
        if (clsM == null) {
            name = lv3Var.toString();
        } else if (!clsM.isArray()) {
            name = (z && clsM.isPrimitive()) ? zc1.N((zu3) lv3Var).getName() : clsM.getName();
        } else if (clsM.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (clsM.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (clsM.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (clsM.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (clsM.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (clsM.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (clsM.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = clsM.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        List list = Collections.EMPTY_LIST;
        boolean zIsEmpty = list.isEmpty();
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        String strY0 = zIsEmpty ? _UrlKt.FRAGMENT_ENCODE_SET : wv0.y0(list, ", ", "<", ">", new b58(this), 24);
        if (z()) {
            str = "?";
        }
        return name + strY0 + str;
    }

    public final int hashCode() {
        return Integer.hashCode(this.Y ? 1 : 0) + p61.f(this.X.hashCode() * 31, 31, Collections.EMPTY_LIST);
    }

    public final String toString() {
        return f(false).concat(" (Kotlin reflection is not available)");
    }

    @Override // defpackage.pw3
    public final boolean z() {
        return this.Y;
    }
}
