package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fr5 extends er5 {
    public final Object c;

    public fr5() {
        super(12);
        this.c = new Object();
    }

    @Override // defpackage.er5
    public final Object a() {
        Object objA;
        synchronized (this.c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // defpackage.er5
    public final boolean d(Object obj) {
        boolean zD;
        synchronized (this.c) {
            zD = super.d(obj);
        }
        return zD;
    }
}
