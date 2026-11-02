package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qy4 {
    public final long a;
    public final long b;
    public final boolean c;

    public qy4(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final qy4 a(qy4 qy4Var) {
        return new qy4(z85.f(this.a, qy4Var.a), Math.max(this.b, qy4Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy4)) {
            return false;
        }
        qy4 qy4Var = (qy4) obj;
        return z85.b(this.a, qy4Var.a) && this.b == qy4Var.b && this.c == qy4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + p61.g(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + z85.h(this.a) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ")";
    }
}
