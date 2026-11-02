package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum xp4 implements m11 {
    Z(true),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(true),
    f0(false),
    g0(true),
    h0(true),
    i0(true),
    j0(true),
    k0(true),
    l0(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF10(true),
    m0(true),
    n0(true),
    o0(false),
    p0(false),
    q0(true),
    r0(true),
    s0(false),
    t0(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(true),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(true),
    u0(true),
    v0(false),
    w0(true),
    x0(false),
    y0(true),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(false),
    z0(false),
    A0(false),
    B0(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(false),
    C0(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(true),
    D0(true),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(true),
    E0(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(true),
    F0(true),
    G0(true);

    public final boolean X;
    public final long Y = 1 << ordinal();

    xp4(boolean z) {
        this.X = z;
    }

    @Override // defpackage.m11
    public final boolean a() {
        return this.X;
    }

    @Override // defpackage.m11
    public final int b() {
        return (int) this.Y;
    }
}
