package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ua9 {
    public final String a;
    public final boolean b;

    public ua9(String str, boolean z) {
        w45.q(str);
        this.a = str;
        w45.q("com.google.android.gms");
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua9)) {
            return false;
        }
        ua9 ua9Var = (ua9) obj;
        return zc1.F(this.a, ua9Var.a) && zc1.F("com.google.android.gms", "com.google.android.gms") && zc1.F(null, null) && this.b == ua9Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, "com.google.android.gms", null, 4225, Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        w45.s(null);
        throw null;
    }
}
