package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vk0 extends uy7 implements gn2 {
    public final /* synthetic */ ea6 g0;
    public final /* synthetic */ ea6 h0;
    public final /* synthetic */ db i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk0(ea6 ea6Var, ea6 ea6Var2, db dbVar, q51 q51Var) {
        super(1, q51Var);
        this.g0 = ea6Var;
        this.h0 = ea6Var2;
        this.i0 = dbVar;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        return ((vk0) m((q51) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 m(q51 q51Var) {
        return new vk0(this.g0, this.h0, this.i0, q51Var);
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        w39.n0(obj);
        this.g0.X = null;
        if (this.h0.X == null) {
            return null;
        }
        this.i0.a();
        return new hb5(null, new ai0(13), 1);
    }
}
