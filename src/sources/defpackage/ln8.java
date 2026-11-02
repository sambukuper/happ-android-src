package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ln8 extends u61 {
    public static final ln8 Z = new ln8();

    @Override // defpackage.u61
    public final void Z0(s61 s61Var, Runnable runnable) {
        nf1.f0.Z.k(runnable, true, false);
    }

    @Override // defpackage.u61
    public final void a1(s61 s61Var, Runnable runnable) {
        nf1.f0.Z.k(runnable, true, true);
    }

    @Override // defpackage.u61
    public final u61 c1(int i) {
        z51.r(i);
        return i >= h28.d ? this : super.c1(i);
    }

    @Override // defpackage.u61
    public final String toString() {
        return "Dispatchers.IO";
    }
}
