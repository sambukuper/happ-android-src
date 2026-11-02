package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e42 extends g42 {
    public final mm0 Z;
    public final /* synthetic */ i42 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e42(i42 i42Var, long j, mm0 mm0Var) {
        super(j);
        this.f0 = i42Var;
        this.Z = mm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Z.F(this.f0);
    }

    @Override // defpackage.g42
    public final String toString() {
        return super.toString() + this.Z;
    }
}
