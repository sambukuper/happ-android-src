package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hb8 extends bu0 {
    public boolean O0;
    public gn2 P0;
    public final v38 Q0;

    public hb8(boolean z, xz4 xz4Var, boolean z2, kl6 kl6Var, gn2 gn2Var) {
        super(xz4Var, null, false, z2, null, kl6Var, new da3(gn2Var, z));
        this.O0 = z;
        this.P0 = gn2Var;
        this.Q0 = new v38(this, (byte) 7);
    }

    @Override // defpackage.x0
    public final void b1(f17 f17Var) {
        ib8 ib8Var = this.O0 ? ib8.X : ib8.Y;
        nw3[] nw3VarArr = d17.a;
        e17 e17Var = c17.L;
        nw3[] nw3VarArr2 = d17.a;
        nw3 nw3Var = nw3VarArr2[26];
        e17Var.getClass();
        f17Var.a(e17Var, ib8Var);
        wc wcVar = oy1.o0;
        e17 e17Var2 = c17.s;
        nw3 nw3Var2 = nw3VarArr2[9];
        e17Var2.getClass();
        f17Var.a(e17Var2, wcVar);
        yd ydVarL = ue3.l(this.O0);
        if (ydVarL != null) {
            e17 e17Var3 = c17.t;
            nw3 nw3Var3 = nw3VarArr2[10];
            e17Var3.getClass();
            f17Var.a(e17Var3, ydVarL);
        }
        f17Var.a(s07.h, new q3(null, new mr0(f17Var, (byte) 1)));
    }
}
