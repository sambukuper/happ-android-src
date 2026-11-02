package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i00 {
    public static final List b = i21.L(new i00(0), new i00(1), new i00(6), new i00(5), new i00(2), new i00(3), new i00(8), new i00(7));
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i00(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i00) {
            return this.a == ((i00) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "AwbMode(value=" + ((int) this.a) + ')';
    }
}
