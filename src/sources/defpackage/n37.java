package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum n37 implements m11 {
    Z(false),
    f0(false),
    g0(true),
    h0(true),
    i0(true),
    j0(true),
    k0(false),
    l0(false),
    m0(true),
    n0(true),
    o0(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF12(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF13(true),
    /* JADX INFO: Fake field, exist only in values array */
    EF14(true),
    p0(false),
    q0(false),
    r0(false),
    s0(false),
    t0(true),
    u0(true),
    v0(false),
    w0(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(true),
    x0(false),
    y0(true),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(true),
    z0(false);

    public final boolean X;
    public final int Y = 1 << ordinal();

    n37(boolean z) {
        this.X = z;
    }

    @Override // defpackage.m11
    public final boolean a() {
        return this.X;
    }

    @Override // defpackage.m11
    public final int b() {
        return this.Y;
    }
}
