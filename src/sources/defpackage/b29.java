package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b29 extends a29 {
    @Override // defpackage.z19, defpackage.eu7
    public final boolean h() {
        return (this.a.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // defpackage.z19, defpackage.eu7
    public final void j(boolean z) {
        this.a.setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // defpackage.z19, defpackage.eu7
    public final void k(boolean z) {
        this.a.setSystemBarsAppearance(z ? 8 : 0, 8);
    }
}
