package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h88 {
    public final long a;
    public final long b;

    public h88(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h88)) {
            return false;
        }
        h88 h88Var = (h88) obj;
        long j = h88Var.a;
        int i = dw0.h;
        return tk8.a(this.a, j) && tk8.a(this.b, h88Var.b);
    }

    public final int hashCode() {
        int i = dw0.h;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return pc6.q("SelectionColors(selectionHandleColor=", dw0.h(this.a), ", selectionBackgroundColor=", dw0.h(this.b), ")");
    }
}
