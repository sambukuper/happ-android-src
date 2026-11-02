package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x04 implements dn2 {
    public final /* synthetic */ byte X = 0;
    public final y04 Y;
    public final ov3 Z;

    public x04(ov3 ov3Var, y04 y04Var) {
        this.Z = ov3Var;
        this.Y = y04Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        ov3 ov3Var = this.Z;
        y04 y04Var = this.Y;
        switch (b) {
            case 0:
                ev3 ev3Var = ov3Var instanceof ev3 ? (ev3) ov3Var : null;
                li8 li8VarD = ev3Var != null ? ((cv3) ev3Var.Z.getValue()).d() : null;
                li8 li8Var = li8.d;
                return hw7.a(y04Var.k0.c, li8VarD, y04Var, ia6.d(ov3Var.t()));
            default:
                mz3 mz3Var = y04Var.k0.h;
                if (mz3Var != null) {
                    return ys0.a0(mz3Var, ia6.d(ov3Var.t()), y04Var.Y(), new w04(y04Var, (byte) 1), 4);
                }
                dh3.T("returnType");
                throw null;
        }
    }

    public x04(y04 y04Var, ov3 ov3Var) {
        this.Y = y04Var;
        this.Z = ov3Var;
    }
}
