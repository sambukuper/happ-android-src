package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class av5 {
    public final int a;

    public av5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof av5) {
            return this.a == ((av5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
