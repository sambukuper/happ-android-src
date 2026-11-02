package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qm7 {
    public final int a;

    public qm7(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qm7) && this.a == ((qm7) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) * 923521;
    }

    public final String toString() {
        return ie2.h("StyleSpan(color=", this.a, ", bold=false, italic=false, underline=false, strikethrough=false)");
    }
}
