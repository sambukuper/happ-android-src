package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a14 implements dn2 {
    public final /* synthetic */ byte X;
    public final l14 Y;

    public /* synthetic */ a14(l14 l14Var, byte b) {
        this.X = b;
        this.Y = l14Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        l14 l14Var = this.Y;
        switch (b) {
            case 0:
                kz3 kz3Var = l14Var.g0;
                mz3 mz3Var = kz3Var.f;
                if (ow.t.x(ow.a[45], kz3Var)) {
                    return null;
                }
                return mz3Var;
            case 1:
                l14 l14Var2 = this.Y;
                return g33.o(l14Var2, l14Var2.g0.h, (mz3) l14Var2.h0.getValue(), d02.X, (li8) l14Var2.l0.getValue(), true);
            case 2:
                l14 l14Var3 = this.Y;
                if (mb6.K(l14Var3)) {
                    return g33.o(l14Var3, l14Var3.g0.h, (mz3) l14Var3.h0.getValue(), d02.X, (li8) l14Var3.l0.getValue(), false);
                }
                return l14Var3.l();
            case 3:
                mz3 mz3Var2 = l14Var.g0.j;
                if (mz3Var2 != null) {
                    return ys0.a0(mz3Var2, ia6.d(l14Var.Y.t()), (li8) l14Var.l0.getValue(), z51.C(l14Var) ? null : new a14(l14Var, (byte) 6), 4);
                }
                dh3.T("returnType");
                throw null;
            case 4:
                ov3 ov3Var = l14Var.Y;
                ev3 ev3Var = ov3Var instanceof ev3 ? (ev3) ov3Var : null;
                li8 li8VarD = ev3Var != null ? ((cv3) ev3Var.Z.getValue()).d() : null;
                li8 li8Var = li8.d;
                return hw7.a(l14Var.g0.e, li8VarD, l14Var, ia6.d(ov3Var.t()));
            case 5:
                boolean zC = z51.C(l14Var);
                kz3 kz3Var2 = l14Var.g0;
                if (zC) {
                    return null;
                }
                ov3 ov3Var2 = l14Var.Y;
                kz3Var2.getClass();
                bt3 bt3Var = ch3.F(kz3Var2).b;
                if (bt3Var == null) {
                    return null;
                }
                if (ov3Var2 instanceof ew3) {
                    try {
                        return ((ew3) ov3Var2).Y.getDeclaredField(bt3Var.d);
                    } catch (NoSuchFieldException unused) {
                        return null;
                    }
                }
                StringBuilder sb = new StringBuilder("javaField is only supported for top-level properties for now: ");
                sb.append(ov3Var2);
                xw3.p(sb, kz3Var2.b, l14Var.Z);
                return null;
            default:
                return l14Var.r().j();
        }
    }
}
