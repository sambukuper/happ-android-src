package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s71 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ ce8 Y;

    public /* synthetic */ s71(ce8 ce8Var, byte b) {
        this.X = b;
        this.Y = ce8Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        ce8 ce8Var = this.Y;
        switch (b) {
            case 0:
                return ce8Var.d.getValue();
            case 1:
                return ce8Var.f();
            case 2:
                return ce8Var.d.getValue();
            default:
                return ce8Var.f();
        }
    }
}
