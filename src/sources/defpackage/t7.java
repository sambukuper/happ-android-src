package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t7 {
    public static final List b = i21.L(new t7(0), new t7(1), new t7(2), new t7(3), new t7(4), new t7(5));
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ t7(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t7) {
            return this.a == ((t7) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "AfMode(value=" + ((int) this.a) + ')';
    }
}
