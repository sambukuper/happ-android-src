package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z12 extends g24 implements gn2 {
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ dn2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z12(dn2 dn2Var, boolean z) {
        super(1);
        this.Y = z;
        this.Z = dn2Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        ((pk6) obj).d(!this.Y && ((Boolean) this.Z.invoke()).booleanValue());
        return dn8.a;
    }
}
