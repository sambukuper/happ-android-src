package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum vp3 implements nb1 {
    /* JADX INFO: Fake field, exist only in values array */
    EF6(true),
    /* JADX INFO: Fake field, exist only in values array */
    EF14(true),
    /* JADX INFO: Fake field, exist only in values array */
    EF23(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF32(true),
    /* JADX INFO: Fake field, exist only in values array */
    EF41(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF50(false);

    public final boolean X;
    public final int Y = 1 << ordinal();

    vp3(boolean z) {
        this.X = z;
    }

    @Override // defpackage.ij3
    public final boolean a(int i) {
        return (this.Y & i) != 0;
    }

    @Override // defpackage.nb1
    public final int b() {
        return 1;
    }
}
