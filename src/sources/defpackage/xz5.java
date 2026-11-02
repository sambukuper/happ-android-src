package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum xz5 implements bg3 {
    WARNING(0),
    ERROR(1),
    HIDDEN(2);

    public final byte X;

    /* JADX WARN: Multi-variable type inference failed */
    xz5(int i) {
        this.X = i;
    }

    @Override // defpackage.bg3
    public final int a() {
        return this.X;
    }
}
