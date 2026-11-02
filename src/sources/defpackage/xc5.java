package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xc5 extends aq7 {
    public final aq7 g0;
    public final int h0;
    public ArrayList i0;

    public xc5(aq7 aq7Var, int i) {
        this.g0 = aq7Var;
        this.h0 = i;
        e(0L);
    }

    @Override // defpackage.u85
    public final void b() {
        ArrayList arrayList = this.i0;
        aq7 aq7Var = this.g0;
        if (arrayList != null) {
            aq7Var.onNext(arrayList);
        }
        aq7Var.b();
    }

    @Override // defpackage.u85
    public final void onError(Throwable th) {
        this.i0 = null;
        this.g0.onError(th);
    }

    @Override // defpackage.u85
    public final void onNext(Object obj) {
        ArrayList arrayList = this.i0;
        int i = this.h0;
        if (arrayList == null) {
            arrayList = new ArrayList(i);
            this.i0 = arrayList;
        }
        arrayList.add(obj);
        if (arrayList.size() == i) {
            this.i0 = null;
            this.g0.onNext(arrayList);
        }
    }
}
