package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eu6 extends jb5 {
    public float l0 = 0.0f;
    public final /* synthetic */ fu6 m0;

    public eu6(fu6 fu6Var) {
        this.m0 = fu6Var;
    }

    @Override // defpackage.jb5
    public final void K(String str) {
        this.l0 = ((du6) this.m0.f0).d.measureText(str) + this.l0;
    }
}
