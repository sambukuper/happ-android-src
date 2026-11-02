package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h78 {
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h78(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h78) {
            return this.a == ((h78) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a ? 1 : 0);
    }

    public final String toString() {
        return ie2.h("TextHighlightType(value=", this.a ? 1 : 0, ")");
    }
}
