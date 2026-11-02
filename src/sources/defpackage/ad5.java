package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ad5 extends aq7 {
    public final aq7 g0;
    public final int h0;
    public final int i0;
    public long j0;
    public ArrayList k0;

    public ad5(aq7 aq7Var, int i, int i2) {
        this.g0 = aq7Var;
        this.h0 = i;
        this.i0 = i2;
        e(0L);
    }

    @Override // defpackage.u85
    public final void b() {
        ArrayList arrayList = this.k0;
        aq7 aq7Var = this.g0;
        if (arrayList != null) {
            this.k0 = null;
            aq7Var.onNext(arrayList);
        }
        aq7Var.b();
    }

    @Override // defpackage.u85
    public final void onError(Throwable th) {
        this.k0 = null;
        this.g0.onError(th);
    }

    @Override // defpackage.u85
    public final void onNext(Object obj) {
        long j = this.j0;
        ArrayList arrayList = this.k0;
        int i = this.h0;
        if (j == 0) {
            arrayList = new ArrayList(i);
            this.k0 = arrayList;
        }
        long j2 = j + 1;
        if (j2 == this.i0) {
            this.j0 = 0L;
        } else {
            this.j0 = j2;
        }
        if (arrayList != null) {
            arrayList.add(obj);
            if (arrayList.size() == i) {
                this.k0 = null;
                this.g0.onNext(arrayList);
            }
        }
    }
}
