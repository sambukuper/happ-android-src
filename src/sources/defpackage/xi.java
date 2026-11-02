package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xi extends g24 implements rn2 {
    public final /* synthetic */ h62 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(h62 h62Var) {
        super(2);
        this.Y = h62Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        r12 r12Var = (r12) obj;
        r12 r12Var2 = (r12) obj2;
        r12 r12Var3 = r12.Z;
        return Boolean.valueOf(r12Var == r12Var3 && r12Var2 == r12Var3 && !this.Y.a.e);
    }
}
