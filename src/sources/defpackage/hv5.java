package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hv5 implements y05, b71 {
    public final /* synthetic */ y05 X;
    public final s61 Y;

    public hv5(y05 y05Var, s61 s61Var) {
        this.X = y05Var;
        this.Y = s61Var;
    }

    @Override // defpackage.b71
    public final s61 getCoroutineContext() {
        return this.Y;
    }

    @Override // defpackage.lh7
    public final Object getValue() {
        return this.X.getValue();
    }

    @Override // defpackage.y05
    public final void setValue(Object obj) {
        this.X.setValue(obj);
    }
}
