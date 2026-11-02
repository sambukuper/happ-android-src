package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f42 extends g42 {
    public final Runnable Z;

    public f42(Runnable runnable, long j) {
        super(j);
        this.Z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Z.run();
    }

    @Override // defpackage.g42
    public final String toString() {
        return super.toString() + this.Z;
    }
}
