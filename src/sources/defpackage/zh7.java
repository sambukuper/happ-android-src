package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zh7 implements yh7 {
    public final rv X = new rv(0);

    public final boolean g(int i) {
        return (this.X.get() & i) != 0;
    }

    public final void k(int i) {
        rv rvVar;
        int i2;
        do {
            rvVar = this.X;
            i2 = rvVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!rvVar.compareAndSet(i2, i2 | i));
    }
}
