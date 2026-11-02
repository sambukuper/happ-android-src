package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum qo3 {
    Z(true),
    f0(true),
    g0(true),
    h0(true),
    i0(true),
    j0(false),
    k0(false),
    l0(false),
    m0(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF9(false),
    n0(false),
    o0(true),
    p0(false),
    q0(false);

    public final boolean X;
    public final int Y = 1 << ordinal();

    qo3(boolean z) {
        this.X = z;
    }

    public final boolean a(int i) {
        return (this.Y & i) != 0;
    }
}
