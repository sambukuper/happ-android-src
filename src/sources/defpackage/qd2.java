package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qd2 {
    public final byte a;

    static {
        i21.L(new qd2(0), new qd2(1), new qd2(2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qd2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qd2) {
            return this.a == ((qd2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "FlashMode(value=" + ((int) this.a) + ')';
    }
}
