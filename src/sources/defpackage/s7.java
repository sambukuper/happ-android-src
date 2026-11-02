package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s7 {
    public static final List b = i21.L(new s7(0), new s7(1), new s7(2), new s7(3), new s7(4), new s7(5), new s7(6));
    public final int a;

    public /* synthetic */ s7(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s7) {
            return this.a == ((s7) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "AeMode(value=" + this.a + ')';
    }
}
