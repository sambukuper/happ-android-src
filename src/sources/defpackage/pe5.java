package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pe5 {
    public final int a;

    public /* synthetic */ pe5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pe5) {
            return this.a == ((pe5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pc6.j(this.a, "Output-");
    }
}
