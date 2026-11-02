package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class u71 implements td8 {
    public final int b;

    public u71(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        bt.q("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.td8
    public final ae8 a(ke8 ke8Var, c73 c73Var) {
        if (c73Var instanceof jw7) {
            return ((jw7) c73Var).c == ma1.X ? new y55(ke8Var, c73Var) : new v71(ke8Var, c73Var, this.b);
        }
        return new y55(ke8Var, c73Var);
    }
}
