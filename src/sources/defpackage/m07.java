package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m07 {
    public final ev2 a;
    public final long b;
    public final l07 c;
    public final boolean d;

    public m07(ev2 ev2Var, long j, l07 l07Var, boolean z) {
        this.a = ev2Var;
        this.b = j;
        this.c = l07Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m07)) {
            return false;
        }
        m07 m07Var = (m07) obj;
        return this.a == m07Var.a && z85.b(this.b, m07Var.b) && this.c == m07Var.c && this.d == m07Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + p61.g(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + z85.h(this.b) + ", anchor=" + this.c + ", visible=" + this.d + ")";
    }
}
