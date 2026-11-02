package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oz0 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public boolean h0;
    public /* synthetic */ float i0;
    public final /* synthetic */ Object j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oz0(Object obj, float f, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.j0 = obj;
        this.i0 = f;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                return ((oz0) n((q51) obj2, Float.valueOf(((Number) obj).floatValue()))).q(dn8Var);
            case 1:
                return ((oz0) n((q51) obj2, (b71) obj)).q(dn8Var);
            default:
                return ((oz0) n((q51) obj2, (b71) obj)).q(dn8Var);
        }
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        Object obj2 = this.j0;
        switch (b) {
            case 0:
                oz0 oz0Var = new oz0((pz0) obj2, q51Var);
                oz0Var.i0 = ((Number) obj).floatValue();
                return oz0Var;
            case 1:
                return new oz0((oi) obj2, this.i0, q51Var, (byte) 1);
            default:
                return new oz0((o87) obj2, this.i0, q51Var, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    @Override // defpackage.r10
    public final Object q(Object obj) {
        Object objB;
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.j0;
        c71 c71Var = c71.X;
        switch (b) {
            case 0:
                pz0 pz0Var = (pz0) obj2;
                boolean z = this.h0;
                if (!z) {
                    w39.n0(obj);
                    float f = this.i0;
                    Object objG = pz0Var.a.d.X.g(s07.e);
                    rn2 rn2Var = (rn2) (objG != null ? objG : null);
                    if (rn2Var == null) {
                        throw p61.j("Required value was null.");
                    }
                    z85 z85Var = new z85((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
                    this.h0 = true;
                    obj = rn2Var.K(z85Var, this);
                    if (obj == c71Var) {
                        return c71Var;
                    }
                } else {
                    if (!z) {
                        bt.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w39.n0(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((z85) obj).a & 4294967295L)));
            case 1:
                boolean z2 = this.h0;
                if (z2) {
                    if (z2) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                oi oiVar = (oi) obj2;
                Float f2 = new Float(((Number) oiVar.d()).floatValue() + this.i0);
                this.h0 = true;
                return oiVar.e(this, f2) == c71Var ? c71Var : dn8Var;
            default:
                boolean z3 = this.h0;
                if (z3) {
                    if (z3) {
                        w39.n0(obj);
                        return dn8Var;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
                float f3 = this.i0;
                this.h0 = true;
                t5 t5Var = ((o87) obj2).d;
                Object value = ((rh5) t5Var.i0).getValue();
                Object objC = t5Var.c(t5Var.f(), f3, value);
                boolean zBooleanValue = ((Boolean) ((gn2) t5Var.f0).B(objC)).booleanValue();
                f15 f15Var = f15.X;
                if (zBooleanValue) {
                    objB = t5Var.b(objC, f15Var, new k9(t5Var, f3, null), this);
                    if (objB != c71Var) {
                        objB = dn8Var;
                    }
                    if (objB != c71Var) {
                        objB = dn8Var;
                    }
                } else {
                    objB = t5Var.b(value, f15Var, new k9(t5Var, f3, null), this);
                    if (objB != c71Var) {
                        objB = dn8Var;
                    }
                    if (objB != c71Var) {
                        objB = dn8Var;
                    }
                }
                if (objB != c71Var) {
                    objB = dn8Var;
                }
                return objB == c71Var ? c71Var : dn8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz0(pz0 pz0Var, q51 q51Var) {
        super(2, q51Var);
        this.g0 = (byte) 0;
        this.j0 = pz0Var;
    }
}
