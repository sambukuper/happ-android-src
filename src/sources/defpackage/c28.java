package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c28 extends x18 {
    public final Runnable Z;

    public c28(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.Z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Z.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.Z;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(zc1.L(runnable));
        sb.append(", ");
        sb.append(this.X);
        sb.append(", ");
        return oi0.o(sb, this.Y ? "Blocking" : "Non-blocking", ']');
    }
}
