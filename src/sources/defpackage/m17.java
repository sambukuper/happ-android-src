package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m17 extends nz6 {
    public final /* synthetic */ AtomicReferenceArray i0;

    public m17(long j, m17 m17Var, int i) {
        super(j, m17Var, i);
        this.i0 = new AtomicReferenceArray(l17.f);
    }

    @Override // defpackage.nz6
    public final int g() {
        return l17.f;
    }

    @Override // defpackage.nz6
    public final void h(int i, s61 s61Var) {
        this.i0.set(i, l17.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f0 + ", hashCode=" + hashCode() + ']';
    }
}
