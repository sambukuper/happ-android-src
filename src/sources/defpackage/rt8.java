package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum rt8 {
    INVARIANT(0, true),
    IN_VARIANCE(1, false),
    OUT_VARIANCE(2, true);

    public final String X;
    public final boolean Y;

    rt8(int i, boolean z) {
        this.X = str;
        this.Y = z;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.X;
    }
}
