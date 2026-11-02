package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kx6 extends y6 implements gn2 {
    public final /* synthetic */ byte j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kx6(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.j0 = b;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        byte b = this.j0;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.X;
        switch (b) {
            case 0:
                ((c15) obj2).b((lx6) obj);
                break;
            case 1:
                ((y48) obj2).b1(((l73) obj).a);
                break;
            default:
                ri7 ri7VarA = ((h69) obj2).a();
                ri7VarA.a(ri7VarA.c, ri7VarA.b);
                break;
        }
        return dn8Var;
    }
}
