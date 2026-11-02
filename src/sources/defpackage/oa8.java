package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oa8 extends qa8 {
    public volatile transient boolean h0;

    @Override // defpackage.qa8
    public final qa8 a() {
        oa8 oa8Var = (oa8) super.a();
        oa8Var.h0 = false;
        return oa8Var;
    }

    @Override // defpackage.qa8
    public final boolean isFrozen() {
        return this.h0;
    }
}
