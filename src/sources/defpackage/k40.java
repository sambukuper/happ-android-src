package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k40 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ b71 Y;
    public final /* synthetic */ jc8 Z;

    public /* synthetic */ k40(b71 b71Var, jc8 jc8Var, byte b) {
        this.X = b;
        this.Y = b71Var;
        this.Z = jc8Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        q51 q51Var = null;
        jc8 jc8Var = this.Z;
        b71 b71Var = this.Y;
        byte b2 = 3;
        switch (b) {
            case 0:
                w51.G(b71Var, null, null, new o40(jc8Var, q51Var, (byte) 0), 3);
                return Boolean.TRUE;
            default:
                jm4.Q(b71Var, null, new o40(jc8Var, q51Var, b2), 3);
                return dn8.a;
        }
    }
}
