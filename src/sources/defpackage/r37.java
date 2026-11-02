package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r37 implements Serializable {
    public static final cr3 Z = cr3.b;
    public final String X;
    public volatile char[] Y;

    public r37(String str) {
        Objects.requireNonNull(str, "Null String illegal for SerializedString");
        this.X = str;
    }

    public final char[] a() {
        char[] cArr = this.Y;
        if (cArr != null) {
            return cArr;
        }
        cr3 cr3Var = Z;
        String str = this.X;
        cr3Var.getClass();
        char[] cArrA = cr3.a(str);
        this.Y = cArrA;
        return cArrA;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != r37.class) {
            return false;
        }
        return this.X.equals(((r37) obj).X);
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        return this.X;
    }
}
