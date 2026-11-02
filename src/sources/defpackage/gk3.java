package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gk3 implements dn2 {
    public final /* synthetic */ byte X;
    public final jk3 Y;

    public /* synthetic */ gk3(jk3 jk3Var, byte b) {
        this.X = b;
        this.Y = jk3Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        jk3 jk3Var = this.Y;
        switch (b) {
            case 0:
                zu3 zu3VarB = yb6.a.b(l22.class);
                uw3 uw3Var = uw3.c;
                return w45.E(zu3VarB, i21.K(hi5.g0(w45.E(jk3Var.Y, null, 7))), 6);
            default:
                return new hk3(jk3Var);
        }
    }
}
