package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sa5 extends jx4 implements as4 {
    public gn2 q0;
    public long r0;

    @Override // defpackage.jx4
    public final boolean N0() {
        return true;
    }

    @Override // defpackage.as4
    public final void a(long j) {
        if (pf3.a(this.r0, j)) {
            return;
        }
        this.q0.B(new pf3(j));
        this.r0 = j;
    }
}
