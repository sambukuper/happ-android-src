package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uc7 extends uy7 implements rn2 {
    public ba6 g0;
    public byte h0;
    public final /* synthetic */ xc7 i0;
    public final /* synthetic */ float j0;
    public final /* synthetic */ gn2 k0;
    public final /* synthetic */ xx6 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc7(xc7 xc7Var, float f, gn2 gn2Var, xx6 xx6Var, q51 q51Var) {
        super(2, q51Var);
        this.i0 = xc7Var;
        this.j0 = f;
        this.k0 = gn2Var;
        this.l0 = xx6Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((uc7) n((q51) obj2, (b71) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        return new uc7(this.i0, this.j0, this.k0, this.l0, q51Var);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [tc7] */
    @Override // defpackage.r10
    public final Object q(Object obj) {
        final ba6 ba6Var;
        Object objD;
        xc7 xc7Var;
        Object objB;
        byte b = this.h0;
        final byte b2 = 0;
        final byte b3 = 1;
        final gn2 gn2Var = this.k0;
        xc7 xc7Var2 = this.i0;
        c71 c71Var = c71.X;
        if (b == 0) {
            w39.n0(obj);
            bd1 bd1Var = t9.b;
            float f = this.j0;
            z39.k(bd1Var, 0.0f, f);
            if (Float.isNaN(0.0f)) {
                zc3.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            ba6Var = new ba6();
            float fSignum = Math.signum(f) * Math.abs(0.0f);
            ba6Var.X = fSignum;
            gn2Var.B(new Float(fSignum));
            float f2 = ba6Var.X;
            ?? r4 = new gn2() { // from class: tc7
                @Override // defpackage.gn2
                public final Object B(Object obj2) {
                    byte b4 = b2;
                    dn8 dn8Var = dn8.a;
                    gn2 gn2Var2 = gn2Var;
                    ba6 ba6Var2 = ba6Var;
                    float fFloatValue = ((Float) obj2).floatValue();
                    switch (b4) {
                        case 0:
                            float f3 = ba6Var2.X - fFloatValue;
                            ba6Var2.X = f3;
                            gn2Var2.B(Float.valueOf(f3));
                            break;
                        default:
                            float f4 = ba6Var2.X - fFloatValue;
                            ba6Var2.X = f4;
                            gn2Var2.B(Float.valueOf(f4));
                            break;
                    }
                    return dn8Var;
                }
            };
            this.g0 = ba6Var;
            this.h0 = (byte) 1;
            xc7 xc7Var3 = xc7Var2;
            objD = xc7Var3.d(this.l0, f2, this.j0, r4, this);
            xc7Var = xc7Var3;
            if (objD != c71Var) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                w39.n0(obj);
                return obj;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ba6 ba6Var2 = this.g0;
        w39.n0(obj);
        ba6Var = ba6Var2;
        xc7Var = xc7Var2;
        objD = obj;
        qk qkVar = (qk) objD;
        lr lrVar = xc7Var.a;
        float fFloatValue = ((Number) qkVar.a()).floatValue();
        la laVar = (la) lrVar.Y;
        nh5 nh5Var = laVar.f;
        if (Float.isNaN(nh5Var.l())) {
            zc3.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        float fL = nh5Var.l();
        ke1 ke1VarB = laVar.b();
        gn2 gn2Var2 = (gn2) lrVar.Z;
        o7 o7Var = (o7) lrVar.f0;
        if (Float.isNaN(fL)) {
            bt.q("The offset provided to computeTarget must not be NaN.");
            return null;
        }
        boolean z = Math.abs(fFloatValue) > 0.0f;
        boolean z2 = z && fFloatValue > 0.0f;
        if (!z) {
            objB = ke1VarB.a(fL);
            objB.getClass();
        } else if (Math.abs(fFloatValue) >= Math.abs(((Number) o7Var.invoke()).floatValue())) {
            objB = ke1VarB.b(fL, z2);
            objB.getClass();
        } else {
            objB = ke1VarB.b(fL, false);
            objB.getClass();
            float fC = ke1VarB.c(objB);
            Object objB2 = ke1VarB.b(fL, true);
            objB2.getClass();
            float fC2 = ke1VarB.c(objB2);
            float fAbs = Math.abs(((Number) gn2Var2.B(Float.valueOf(Math.abs(fC - fC2)))).floatValue());
            if (!z2) {
                fC = fC2;
            }
            boolean z3 = Math.abs(fC - fL) >= fAbs;
            if (z3) {
                if (z2) {
                    objB = objB2;
                }
            } else {
                if (z3) {
                    b61.c();
                    return null;
                }
                if (!z2) {
                    objB = objB2;
                }
            }
        }
        float fC3 = laVar.b().c(objB) - fL;
        if (Float.isNaN(fC3)) {
            zc3.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        ba6Var.X = fC3;
        qk qkVarU = z68.u(qkVar, 0.0f, 0.0f, 30);
        pk pkVar = xc7Var.b;
        gn2 gn2Var3 = new gn2() { // from class: tc7
            @Override // defpackage.gn2
            public final Object B(Object obj2) {
                byte b4 = b3;
                dn8 dn8Var = dn8.a;
                gn2 gn2Var4 = gn2Var;
                ba6 ba6Var3 = ba6Var;
                float fFloatValue2 = ((Float) obj2).floatValue();
                switch (b4) {
                    case 0:
                        float f3 = ba6Var3.X - fFloatValue2;
                        ba6Var3.X = f3;
                        gn2Var4.B(Float.valueOf(f3));
                        break;
                    default:
                        float f4 = ba6Var3.X - fFloatValue2;
                        ba6Var3.X = f4;
                        gn2Var4.B(Float.valueOf(f4));
                        break;
                }
                return dn8Var;
            }
        };
        this.g0 = null;
        this.h0 = (byte) 2;
        Object objV = u70.v(this.l0, fC3, fC3, qkVarU, pkVar, gn2Var3, this);
        return objV == c71Var ? c71Var : objV;
    }
}
