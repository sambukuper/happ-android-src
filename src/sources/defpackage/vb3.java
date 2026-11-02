package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vb3 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public final /* synthetic */ wb3 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vb3(wb3 wb3Var, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = wb3Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        b71 b71Var = (b71) obj;
        q51 q51Var = (q51) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((vb3) n(q51Var, b71Var)).q(dn8Var);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        wb3 wb3Var = this.i0;
        switch (b) {
            case 0:
                return new vb3(wb3Var, q51Var, (byte) 0);
            case 1:
                return new vb3(wb3Var, q51Var, (byte) 1);
            case 2:
                return new vb3(wb3Var, q51Var, (byte) 2);
            default:
                return new vb3(wb3Var, q51Var, (byte) 3);
        }
    }

    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        byte b = this.g0;
        wb3 wb3Var = this.i0;
        dn8 dn8Var = dn8.a;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    oi oiVar = wb3Var.A0;
                    if (oiVar != null) {
                        i48 i48VarO0 = wb3Var.z0;
                        if (i48VarO0 == null) {
                            i48VarO0 = lh4.O0((iw0) hi5.W(wb3Var, kw0.a), (h88) hi5.W(wb3Var, i88.a));
                        }
                        dw0 dw0Var = new dw0(i48VarO0.c(wb3Var.s0, wb3Var.t0, wb3Var.x0));
                        pk pkVarY = wb3Var.s0 ? w39.y((ky4) hi5.W(wb3Var, lr4.a), ly4.f0) : new cd7();
                        this.h0 = true;
                        obj = oi.a(oiVar, dw0Var, pkVarY, null, this, 12);
                        if (obj == c71Var) {
                            return c71Var;
                        }
                    }
                    return dn8Var;
                }
                if (!z) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                return dn8Var;
            case 1:
                boolean z2 = this.h0;
                if (!z2) {
                    w39.n0(obj);
                    oi oiVar2 = wb3Var.C0;
                    kt1 kt1Var = new kt1((wb3Var.x0 && wb3Var.s0) ? wb3Var.v0 : wb3Var.w0);
                    pk pkVarY2 = wb3Var.s0 ? w39.y((ky4) hi5.W(wb3Var, lr4.a), ly4.Y) : new cd7();
                    this.h0 = true;
                    if (oi.a(oiVar2, kt1Var, pkVarY2, null, this, 12) == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z2) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return dn8Var;
            case 2:
                boolean z3 = this.h0;
                if (!z3) {
                    w39.n0(obj);
                    this.h0 = true;
                    wb3Var.c1(this);
                    return c71Var;
                }
                if (z3) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z4 = this.h0;
                if (!z4) {
                    w39.n0(obj);
                    this.h0 = true;
                    wb3Var.c1(this);
                    return c71Var;
                }
                if (z4) {
                    w39.n0(obj);
                    return dn8Var;
                }
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
