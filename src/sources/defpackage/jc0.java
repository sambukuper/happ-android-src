package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jc0 implements fi1 {
    public ea0 X = pz2.K0;
    public vk1 Y;

    public final vk1 a(gn2 gn2Var) {
        vk1 vk1Var = new vk1((byte) 4, false);
        vk1Var.Y = gn2Var;
        this.Y = vk1Var;
        return vk1Var;
    }

    @Override // defpackage.fi1
    public final float b0() {
        return this.X.getDensity().b0();
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        return this.X.getDensity().getDensity();
    }
}
