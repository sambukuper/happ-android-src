package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum r22 implements nb1 {
    /* JADX INFO: Fake field, exist only in values array */
    READ_ENUM_KEYS_USING_INDEX,
    WRITE_ENUMS_TO_LOWERCASE;

    public final int X = 1 << ordinal();

    r22() {
    }

    @Override // defpackage.ij3
    public final boolean a(int i) {
        return (this.X & i) != 0;
    }

    @Override // defpackage.nb1
    public final int b() {
        return 0;
    }
}
