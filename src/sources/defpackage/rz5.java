package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public enum rz5 implements bg3 {
    IN(0),
    OUT(1),
    INV(2);

    public final byte X;

    /* JADX WARN: Multi-variable type inference failed */
    rz5(int i) {
        this.X = i;
    }

    @Override // defpackage.bg3
    public final int a() {
        return this.X;
    }
}
