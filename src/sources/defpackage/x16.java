package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class x16 extends q85 implements u85 {
    public final w16 Y;

    public x16(w16 w16Var) {
        super(w16Var);
        this.Y = w16Var;
    }

    @Override // defpackage.u85
    public final void b() {
        this.Y.b();
    }

    @Override // defpackage.u85
    public final void onError(Throwable th) {
        this.Y.onError(th);
    }

    @Override // defpackage.u85
    public final void onNext(Object obj) {
        this.Y.onNext(obj);
    }
}
