package defpackage;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mp5 extends uy7 implements rn2 {
    public o15 g0;
    public op5 h0;
    public byte i0;
    public final /* synthetic */ op5 j0;
    public final /* synthetic */ rn2 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp5(op5 op5Var, rn2 rn2Var, q51 q51Var) {
        super(2, q51Var);
        this.j0 = op5Var;
        this.k0 = rn2Var;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        return ((mp5) n((q51) obj2, (b71) obj)).q(dn8.a);
    }

    @Override // defpackage.r10
    public final q51 n(q51 q51Var, Object obj) {
        return new mp5(this.j0, this.k0, q51Var);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009d A[RETURN] */
    @Override // defpackage.r10
    public final Object q(Object obj) throws Throwable {
        op5 op5Var;
        o15 o15Var;
        o15 o15Var2;
        TextClassifier textClassifierD;
        Object objX;
        byte b = this.i0;
        lx1 lx1Var = lx1.MILLISECONDS;
        q51 q51Var = null;
        c71 c71Var = c71.X;
        try {
            if (b == 0) {
                w39.n0(obj);
                op5Var = this.j0;
                o15Var = op5Var.e;
                this.g0 = o15Var;
                this.h0 = op5Var;
                this.i0 = (byte) 1;
                if (o15Var.g(this) != c71Var) {
                }
                return c71Var;
            }
            if (b != 1) {
                if (b != 2) {
                    if (b == 3) {
                        w39.n0(obj);
                        return obj;
                    }
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o15Var2 = this.g0;
                try {
                    w39.n0(obj);
                    textClassifierD = kp5.d(obj);
                    o15Var = o15Var2;
                    o15Var.m(null);
                    be beVar = gx1.Y;
                    long jM0 = vj8.m0(200L, lx1Var);
                    jy2 jy2Var = new jy2((Object) textClassifierD, (Object) this.k0, q51Var, (byte) 19);
                    this.g0 = null;
                    this.h0 = null;
                    this.i0 = (byte) 3;
                    objX = a28.x(u70.s0(jM0), jy2Var, this);
                    if (objX == c71Var) {
                        return c71Var;
                    }
                    return objX;
                } catch (Throwable th) {
                    th = th;
                    o15Var2.m(null);
                    throw th;
                }
            }
            op5Var = this.h0;
            o15 o15Var3 = this.g0;
            w39.n0(obj);
            o15Var = o15Var3;
            textClassifierD = op5Var.f;
            if (textClassifierD == null || textClassifierD.isDestroyed()) {
                be beVar2 = gx1.Y;
                long jM1 = vj8.m0(300L, lx1Var);
                l40 l40Var = new l40((Object) op5Var, q51Var, (byte) 9);
                this.g0 = o15Var;
                this.h0 = null;
                this.i0 = (byte) 2;
                Object objX2 = a28.x(u70.s0(jM1), l40Var, this);
                if (objX2 != c71Var) {
                    o15Var2 = o15Var;
                    obj = objX2;
                    textClassifierD = kp5.d(obj);
                    o15Var = o15Var2;
                    o15Var.m(null);
                    be beVar3 = gx1.Y;
                    long jM2 = vj8.m0(200L, lx1Var);
                    jy2 jy2Var2 = new jy2((Object) textClassifierD, (Object) this.k0, q51Var, (byte) 19);
                    this.g0 = null;
                    this.h0 = null;
                    this.i0 = (byte) 3;
                    objX = a28.x(u70.s0(jM2), jy2Var2, this);
                    if (objX == c71Var) {
                        return objX;
                    }
                }
            } else {
                o15Var.m(null);
                be beVar4 = gx1.Y;
                long jM3 = vj8.m0(200L, lx1Var);
                jy2 jy2Var3 = new jy2((Object) textClassifierD, (Object) this.k0, q51Var, (byte) 19);
                this.g0 = null;
                this.h0 = null;
                this.i0 = (byte) 3;
                objX = a28.x(u70.s0(jM3), jy2Var3, this);
                if (objX == c71Var) {
                    return objX;
                }
            }
            return c71Var;
        } catch (Throwable th2) {
            th = th2;
            o15Var2 = o15Var;
            o15Var2.m(null);
            throw th;
        }
    }
}
