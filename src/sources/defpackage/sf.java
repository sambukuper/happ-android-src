package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sf implements fq5 {
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public sf(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!sf.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((sf) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return ie2.h("AndroidPointerIcon(type=", this.b, ")");
    }
}
