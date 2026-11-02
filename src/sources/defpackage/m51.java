package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m51 implements b71 {
    public final /* synthetic */ byte X = 1;
    public final s61 Y;

    public m51() {
        nf1 nf1Var = tp1.a;
        this.Y = dm4.a;
    }

    @Override // defpackage.b71
    public final s61 getCoroutineContext() {
        switch (this.X) {
            case 0:
                return this.Y;
            default:
                return (hv2) this.Y;
        }
    }

    public String toString() {
        switch (this.X) {
            case 0:
                return "CoroutineScope(coroutineContext=" + this.Y + ')';
            default:
                return super.toString();
        }
    }

    public m51(s61 s61Var) {
        this.Y = s61Var;
    }
}
