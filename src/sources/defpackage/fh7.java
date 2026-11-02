package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fh7 implements i87 {
    public final long X;

    public fh7(long j) {
        this.X = j;
        if (j >= 0) {
            return;
        }
        b61.j("replayExpiration(", j, " ms) cannot be negative");
        throw null;
    }

    @Override // defpackage.i87
    public final xe2 b(lq7 lq7Var) {
        eh7 eh7Var = new eh7(this, null);
        int i = eg2.a;
        return w51.t(new sf2(new rp0(eh7Var, lq7Var, b02.X, -2, l90.X), new q5(2, null, (byte) 13), (byte) 0));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fh7) && this.X == ((fh7) obj).X;
    }

    public final int hashCode() {
        return Long.hashCode(this.X) + (Long.hashCode(0L) * 31);
    }

    public final String toString() {
        gb4 gb4Var = new gb4(2);
        long j = this.X;
        if (j < Long.MAX_VALUE) {
            gb4Var.add("replayExpiration=" + j + "ms");
        }
        return oi0.o(new StringBuilder("SharingStarted.WhileSubscribed("), wv0.y0(i21.j(gb4Var), null, null, null, null, 63), ')');
    }
}
