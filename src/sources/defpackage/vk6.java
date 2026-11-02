package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vk6 extends g24 implements gn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ wk6 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vk6(wk6 wk6Var, byte b) {
        super(1);
        this.Y = b;
        this.Z = wk6Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.Y;
        wk6 wk6Var = this.Z;
        switch (b) {
            case 0:
                return Double.valueOf(wk6Var.n.a(x97.l(((Number) obj).doubleValue(), wk6Var.e, wk6Var.f)));
            default:
                return Double.valueOf(x97.l(wk6Var.k.a(((Number) obj).doubleValue()), wk6Var.e, wk6Var.f));
        }
    }
}
