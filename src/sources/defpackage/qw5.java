package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qw5 {
    public static final qw5 d = new qw5(0.0f, 0, new uu0(0.0f, 0.0f));
    public final float a;
    public final uu0 b;
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public qw5(float f, int i, uu0 uu0Var) {
        this.a = f;
        this.b = uu0Var;
        this.c = i;
        if (Float.isNaN(f)) {
            bt.q("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw5)) {
            return false;
        }
        qw5 qw5Var = (qw5) obj;
        return this.a == qw5Var.a && dh3.f(this.b, qw5Var.b) && this.c == qw5Var.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(", steps=");
        return oi0.n(sb, this.c, ")");
    }
}
