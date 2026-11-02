package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mc5 extends nr4 {
    public final Throwable M;

    public mc5(Throwable th) {
        super((byte) 23);
        this.M = th;
    }

    @Override // defpackage.nr4
    public final String toString() {
        return "FAILURE (" + this.M.getMessage() + ")";
    }
}
